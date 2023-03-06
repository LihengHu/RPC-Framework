package github.ancientmoon.registry;

import github.ancientmoon.extension.SPI;
import github.ancientmoon.remoting.dto.RpcRequest;

import java.net.InetSocketAddress;


@SPI
public interface ServiceDiscovery {
    /**
     * lookup service by rpcServiceName
     *
     * @param rpcRequest rpc service pojo
     * @return service address
     */
    InetSocketAddress lookupService(RpcRequest rpcRequest);
}
