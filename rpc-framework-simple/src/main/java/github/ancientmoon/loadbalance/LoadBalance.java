package github.ancientmoon.loadbalance;

import github.ancientmoon.extension.SPI;
import github.ancientmoon.remoting.dto.RpcRequest;

import java.util.List;


@SPI
public interface LoadBalance {
    /**
     * Choose one from the list of existing service addresses list
     *
     * @param serviceUrlList Service address list
     * @param rpcRequest
     * @return target service address
     */
    String selectServiceAddress(List<String> serviceUrlList, RpcRequest rpcRequest);
}
