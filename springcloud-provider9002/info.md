Mac系统 启动启动提供者报错

```java
eureka6001.com: nodename nor servname provided, or not known
```

解决：

```tex
打开终端
输入命令: sudo vi /private/etc/hosts
添加：
    127.0.0.1  eureka6001.com
    127.0.0.1  eureka6002.com    
保存退出
刷新命令：dscacheutil -flushcache
```

