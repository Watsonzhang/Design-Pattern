### 第一章 Mysql架构与历史
    1.1 mysql 逻辑架构
    1.2 并发控制
    1.3 事务
        1.3.1 隔离级别
        1.3.2 死锁
        1.3.3 事务日志
            使用事务日志，存储引擎在修改表数据的时候只需要修改其内存拷贝，再把修改行为持久到硬盘上事务日志中，
            而不用每次都将修改数据本身持久化到磁盘。由于事务日志是采用追加的方式，因此写日志的操作时磁盘上一
            小块区域的顺序IO。事务日志持久后，内存中被修改的数据在后台中可以慢慢刷回到磁盘。也就是说修改数据需要
            写两次磁盘。
        1.3.4 mysql中事务    
            自动提交 autocommit
            如果不显示开启一个事务，则每个查询都被当做一个事务执行提交操作。
            set session transaction isolation level committed  
            在事务中混合使用存储引擎
            隐式和显示锁定
                Innodb会根据隔离级别在需要的收货自动加锁
                所有锁都是在同一时刻被释放
                select lock in share mode 共享锁定
                select for update
                mysql也支持lock tables 和unlock tables 但是是在服务层实现，与存储引擎无关
                但是不能代替事务处理 如果引用需要用到事务 还是应该选择事务型存储引擎
        1.4 多版本并发控制
            mysql大多数事务型存储引擎都不是简单的行级别锁 基于性能的考虑都是实现了多版本并发控制mvcc 
            可以认为mvcc是行级锁的变种 很多情况下避免了加锁
            mvcc的实现 是通过保存某个时间点的快照来实现的
             比如说可重复读这个隔离级别：
                不管该事务执行多久，事务内看到的数据都是一致的。
                也就是说根据事务开始的时间不同 每个事务对同一张表 ，同一时刻看到的数据可能是不一样的
            例如innodb的MVCC
             每行记录后面保存的两个隐藏的列来实现。
             一个列保存了行的创建时间
             一个时保存行的过期时间  
             优点：保存这两个额外的系统版本号 大读书读取操作都可以不用加锁
             缺点：每行记录都需要额外的存储空间 需要做更多的行检查工作
             注：mvcc只在repeatable read read committed 两个隔离级别下工作
        1.5 mysql的存储引擎     
            1.5.1 Innodb存储引擎
            用来处理大量的短期事务  
            1.5.2 Myisam存储引擎
             不支持事务和行级锁
             表锁问题 所有查询长期处于locked状态
            1.5.3 其他存储引擎
        1.6 mysql的时间线
        1.7 mysql的开发模式
        1.8 总结     
          