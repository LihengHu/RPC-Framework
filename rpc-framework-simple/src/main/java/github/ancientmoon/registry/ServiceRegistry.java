package github.ancientmoon.registry;

import github.ancientmoon.extension.SPI;

import java.net.InetSocketAddress;


@SPI
public interface ServiceRegistry {
    /**
     * register service
     *
     * @param rpcServiceName    rpc service name
     * @param inetSocketAddress service address
     */
    void registerService(String rpcServiceName, InetSocketAddress inetSocketAddress);

}
