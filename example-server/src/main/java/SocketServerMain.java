import github.ancientmoon.HelloService;
import github.ancientmoon.config.RpcServiceConfig;
import github.ancientmoon.remoting.transport.socket.SocketRpcServer;
import github.ancientmoon.serviceimpl.HelloServiceImpl;


public class SocketServerMain {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        SocketRpcServer socketRpcServer = new SocketRpcServer();
        RpcServiceConfig rpcServiceConfig = new RpcServiceConfig();
        rpcServiceConfig.setService(helloService);
        socketRpcServer.registerService(rpcServiceConfig);
        socketRpcServer.start();
    }
}
