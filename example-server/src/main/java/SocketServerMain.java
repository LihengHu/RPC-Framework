import github.ancientmoon.HelloService;
import github.ancientmoon.config.RpcServiceConfig;
import github.ancientmoon.remoting.transport.socket.SocketRpcServer;
import github.ancientmoon.serviceimpl.HelloServiceImpl;


public class SocketServerMain {
    public static void main(String[] args) {
        //服务接口
        HelloService helloService = new HelloServiceImpl();
        SocketRpcServer socketRpcServer = new SocketRpcServer();
        //服务配置
        /**
         * rpcServiceConfig
         * @Param String version
         * @Param String group
         * @Param Object service
         */
        RpcServiceConfig rpcServiceConfig = new RpcServiceConfig();
        rpcServiceConfig.setService(helloService);
        //注册服务：1.加入到Map中；2.加到zookeeper中
        socketRpcServer.registerService(rpcServiceConfig);
        socketRpcServer.start();
    }
}
