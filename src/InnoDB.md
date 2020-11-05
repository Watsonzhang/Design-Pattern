### 第一章 Mysql体系结构和存储引擎
1.1 定义数据库和实例
    数据库：物理操作系统文件或者其他形式文件类型的集合
    数据库实例： 数据库后台进程/线程 以及一个共享内存区组成，数据库实例才是操作数据库文件的
1.2 mysql体系结构
    主要组成部分：
        连接池组件
        管理服务和工具组件
        sql接口组件
        查询分析器组件
        优化器组件
        缓冲组件
        插件式存储引擎
        物理文件
        存储引擎时基于表的 而不是数据库
1.3 mysql表存储引擎
    1.3.1 InnoDB存储引擎(在线事务处理)
1.4 存储引擎的对比
1.5 连接mysql                
### 第二章 Innodb存储引擎
2.1 InnoDB存储引擎概述
2.2 Innodb体系架构
    2.2.1 后台线程
    2.2.2 内存
        缓冲池 innodb_buffer_pool_size
        重做日志缓冲池 innodb_log_buffer_size
        额外的内存池 innodb_additional_mem_pool_size
2.3 master thread
    每一秒循环：
        日志缓冲刷新到磁盘，即使这个事务还没提交(总是)
        合并插入缓冲(可能)
        至多刷新100个innodb的缓冲池中的脏页到磁盘(可能)
        如果当前没有用户活动 切换到background loop(可能)
    每10秒循环
        刷新100个脏页到磁盘(可能)
        合并至多5个插入缓冲(总是)
        将日志缓冲刷新到磁盘(总是)
        刷出无用的undo页(总是)
        刷新100个或者10个脏页到磁盘(总是)
        产生一个检查点(总是)
    background loop
        删除无用的undo页(总是)
        合并20个插入缓冲(总是)
        跳回到主循环(总是)
        不断刷新100个页 直到符合条件(可能 跳转到flush loop中完成)        
2.4 关键特性 
    2.4.1插入缓冲   
        带来存储引擎的性能
    2.4.2 两次写
        带来innodb存储引擎的数据的可靠性
    2.4.3 自适应哈希索引
2.5 启动关闭与恢复
2.6 innodb plugin与新版本 innodb存储引擎
### 第三章 文件
3.1 参数文件
3.2 日志文件
    3.2.1 错误日志 log_error
    3.2.2 慢查询日志
        开启慢查询日志 set slow_query_log="on"
        设置慢查询时间阈值 set long_query_time =10
        分析慢查询日志 mysqldumpslow slow.log
        锁定时间最长的10条sql语句 mysqldumpslow -s al-n 10 slow.log
        设置日志输出为文件或者表 set log_output ="file"
    3.2.3 查询日志 记录了所有mysql数据库请求的信息e                   
           