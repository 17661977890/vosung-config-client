# vosung-config-client

配置中心客户端：

如果出现启动即停止，则要导入web依赖

客户端主要流程：
    （1）应用启动时，根据bootstrap配置文件配置的 应用名 环境名 分支名 向configServer服务端请求配置信息；
    （2）configServer根据自己维护的git仓库信息和客户端传递过来的配置定位信息去查找配置信息；
    （3）通过git clone命令将找到的配置信息下载到ConfigServer的文件系统中；（起到缓存作用）
    （4）ConfigServer创建Spring的ApplicationContext实例，并从git本地仓库中加载配置文件，最后将这些配置内容读取出来返回给客户端应用；
    （5）客户端应用在获得外部配置文件后加载到客户端的ApplicationContext实例，改配置内容的优先级高于客户端的jar包内的配置内容，
        所以jar包中重复的内容不在加载。