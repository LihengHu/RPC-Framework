package github.ancientmoon;

import github.ancientmoon.config.RpcServiceConfig;
import github.ancientmoon.proxy.RpcClientProxy;
import github.ancientmoon.remoting.transport.RpcRequestTransport;
import github.ancientmoon.remoting.transport.socket.SocketRpcClient;


public class SocketClientMain {
    public static void main(String[] args) {
        RpcRequestTransport rpcRequestTransport = new SocketRpcClient();
        RpcServiceConfig rpcServiceConfig = new RpcServiceConfig();
        RpcClientProxy rpcClientProxy = new RpcClientProxy(rpcRequestTransport, rpcServiceConfig);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        String hello = helloService.hello(new Hello("111", "222"));
        System.out.println(hello);
    }
}
