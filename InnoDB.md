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
        3.2.3 查询日志 记录了所有mysql数据库请求的信息
            开启查询日志 set  global general_log="on"
            查询文件位置 show variables like "general_log_file"
        3.2.4 二进制日志 binlog
            二进制日志记录了对数据执行更改的所有操作
            但是不包括select和show这类操作
            主要作用：
                1.恢复
                2.复制
            开启二进制日志 需要在启动参数时制定 log_bin= 
            默认文件名 bin_log.000001
            相关配置参数
                max_binlog_size
                binlog_cache_size
                sync_binlog 如果想获得最大的高可用 可以设置为1 同步写磁盘方式记录二进制日志
                binglog_do-db
                binglog_ignore_db
                log_slave_update
                binlog_format
                查看工具 mysqlbinlog
    3.3 套接字文件
    3.4 pid文件
    3.5 表结构定义文件
    3.6 InnoDB存储引擎文件
        3.6.1 表空间文件
        3.6.2 重做日志文件
            redo log
             主要功能：记录每个页的更改的物理情况
### 第四章 表
    4.1 InnoDB存储引擎表类型
        是否有非空的唯一索引若果有 则为主键
        不符合上述条件 innodb引擎则自动创建一个6字节大小的指针
    4.2 InnoDB逻辑存储结构
        数据都存放在表空间中
        表空间(tablespace)：段segment-区extent-页page
    4.3 innodb物理存储结构
    4.4 innodb行记录格式
    4.5 innodb数据页结构
        4.4.1 compact行记录格式
        4.4.2 redundant 行记录格式
        4.4.3 行溢出数据
        <暂停>
### 第五章 索引与算法
    5.1 Innodb存储引擎索引概述
    5.2 二分查找法
    5.3 平衡二叉树(AVL树)
        首先必须符合二叉查找树定义 
        其次必须瞒住任何节点的左右连个1子树的高度最大差为1 
    5.4 B+树
    5.5 B+树索引
        对于mysql索引的添加或者删除 先是创建新的临时表 删除元彪 再把临时表重名为原来的表名
        所以索引的维护很需要时间
    5.6 B+树索引的使用
        高选择性使用索引是比较合适
    5.7 哈希算法             
### 第六章 锁
    6.1 什么是锁
    对于Myisam来说 锁时表锁
    innodb提供一致性的非锁定读 行级锁支持 
    6.2 InnoDB存储引擎中的锁
        6.2.1 锁的类型
            共享锁(S Lock)
            排他锁(X Lock)
            额外的锁方式----意向锁----设计目的是在一个事务中揭示下一行将被请求的锁类型
            意向共享锁(IS LOCK) 事务想获取一个表中某几行的共享锁
            意向排他锁(IX LOCK) 事务想获取一个表中某几行的排它锁
        6.2.2 一致性的非锁定读操作
            例如 假如读取的行正在执行deleete update操作 这是读取操作时不会因此等待行上锁的释放 ，
            相反存储引擎会读取行的快照数据。
            在read committed 和Repeatable Read Innodb存储引擎时使用非锁定的一致性读
        6.2.3 select ...for update && select ...lock in share mode
            如果需要对读取数据进行锁定读 则需要读取操作进行加锁 
            select .... for update 是对读取记录添加X锁 其他事务想在这些行上加任何锁都会被阻塞
            select lock in share mode 则对读取的行记录加S锁 其他事务可以向被锁定的就加s锁 但是对于X锁 会被阻塞
        6.2.4 自增长和锁
        6.2.5 外键和锁
    6.3 锁的算法
        Record lock:单个记录上的锁
        GAP Lock 间隙锁 锁定一个范围 单不包含记录本身
        Next-key Lock :Gap lock+recoed Lock  锁定一个范围 并且锁定记录本身
    6.4 锁问题
        通过锁可以实现实现事务隔离性的要求 但是会带来3个问题
        6.4.1 丢失更新(版本号)
        6.4.2 脏读
            脏读与脏页面：
                脏页是指在缓冲池已经被修改的页，日志已经被写入到重做日志中
                脏数据 是指在缓冲中被修改的数据 并且还没有被提交
    6.5 阻塞
    6.6 死锁
    6.7 锁升级
### 第七章 事务
    ACID特性：原子性 一致性 隔离性 持久性
    7.1 事务概述
    7.2 事务的实现
        7.2.1 redo
            事务日志通过redo日志文件和存储引擎的日志缓冲实现。当开始一个事务，会记录该事务的一个LSN;
            当事务执行时，会往Innodb存储引擎的日志缓冲里插入事务日志
            当事务提交时必须将存储引擎 的日志缓冲羞辱磁盘。也就是在写数据前 需要先写日志 这种方式称为预写日志方式(Write-Ahead loggin wal)
            通过预写日志保证事务的完整性
        7.2.1 undo
            undo:数据库只是逻辑的恢复到原来的样子，所有修改都被逻辑的取消。
            如：insert对应delete update对应相反的update
    7.3 事务控制语句
    7.4 隐式提交的sql语句
    7.5 对于事务操作的统计
    7.7 分布式事务
### 第八章 备份与恢复
    8.1 备份与恢复概述
        hot backup 热备
        cold backup  冷备
        warm 温备
        按照备份后文件的内容：逻辑备份与裸文件备份
            
                      
              
                        
              
                
               
        
            
        
        
            
         
                     
            
        
                   