package github.ancientmoon.remoting.transport;

import github.ancientmoon.extension.SPI;
import github.ancientmoon.remoting.dto.RpcRequest;


@SPI
public interface RpcRequestTransport {
    /**
     * send rpc request to server and get result
     *
     * @param rpcRequest message body
     * @return data from server
     */
    Object sendRpcRequest(RpcRequest rpcRequest);
}
