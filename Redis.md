### 前言
    第一部分 数据结构
    第二部分 单机数据库实现
    第三部分 多机数据库的实现
    第四部分 独立功能的实现
    
### 第一部分 数据结构与对象
#### 第二章 简单动态字符串
    2.1 SDS(simple dynamic string) 简单动态字符串
    struct{
        int free;
        int len;
        char buf[];
    }
    2.2 SDS与C字符串的区别
        2.2.1 常数复杂度获取字符串长度
        2.2.2 杜绝缓冲区溢出
        2.2.3 减少修改字符串带来的内存重分配次数
            1.空间预分配
            2.惰性空间释放
        2.2.4 二进制安全
        2.2.5 兼容部分C字符串函数
#### 第三章 链表
    3.1 链表和链表节点实现
    typedef struct listNode{
        struct listNode * prev;
        struct lsitNode * next;
        void * value;
    }        
     typedef sturct  list{
        listNode * head;
        listNode * tail;
        unsigned long len;
     } list;  
     redis链表：双端链表
#### 第四章 字典
    4.1 字典的实现
        4.1.1 哈希表
        trpedef sruct dictht{
        dictEntry ** table;
        unsigned long size;
        unsigned long sizemask;
        }  dictht;   
        4.1.2 哈希表节点
        4.1.3 字典
    4.2 哈希算法
    4.3 解决随机冲突
    4.4 rehash
    4.5 渐进式rehash
### 第五章 跳跃表
### 第六章 整数集合
    typedef struct inset{
    uint32_t encoding;
    uint32_t length;
    int8_t contents[];
    }inset;
### 第七章 压缩列表
### 第八章 对象
    redis并没有直接使用这些数据结构来实现键值对数据库 而是基于这些数据结构创建了一个对象系统，
    这个系统包含了字符串对象 列表对象 哈希对象 集合对象 有序集合对象这五种类型对象，
    redis实现了基于引用就似乎的内存回收机制，当程序不再使用某个对象时，这个对象所占用的内存就会被自动释放。
    8.1 对象的类型和编码
        例如 redis> set msg “hello”;
        创建了msg独对象与hello 对象
        而每个对象都由一个redisObject结构表示
        typedef struct redisObject{
            unsigned type:4;
            unsigned encoding:4;
            void *ptr;
        }robj;
        8.1.1 类型
            REDIS_STRING REDIS_LIST REDIS_HASH REDIS_SET REDIS_ZSET
         当我们称呼一个数据库键为字符串键，指这个是数据库所对应的值为字符串对象，同理类推，
    8.2 字符串对象
    8.3 列表对象
        列表对象的编码可以使ziplist 或者linklist
    8.4 哈希对象
    8.5 集合对象
    8.6 有序集合对象
    8.7 类型检查与命令多态
        其中一种命令可以对任何类型的键执行比如del expire rename type object
        另一种命令只能对特定类型的键执行
        8.7.1 类型检查的实现
         在执行一个特定类型的命令之前 redis会检查输入键的类型是否正确 然后再决定是否执行给定的命令。
        8.7.2 多态命令的实现
    8.8 内存回收
        type struct redisObject{
            int refcount;
        } robj;
    8.9 对象共享
    8.10 对象的空转时长
        redisObject包含了一个属性为lru的属性，该属性记录了对象最后依次被命令程序访问的时间
        typedef stuct  redfisObject{
        unsigned lru:22;
        }robj;
        空转时长=当前时间-lru时间
    8.11 重点回顾
        redis数据库的键值对的键和值都是一个对象
        redis共有字符串 列表 哈希 集合 有序集合 五种类型的对象 
        每种类型的对象至少都有两种或者以上的编码方式，不同 的编码可以在不同的使用场景上优化对象的使用效率；
        服务器在执行某种命令之前 会检查给定类型能否执行指定的命令 而检查一个键的类型就是检查键的值对象的类型。
### 单机数据库的实现
#### 第九章 数据库        
       
        
                
         
                        
                        
            
                
        
            