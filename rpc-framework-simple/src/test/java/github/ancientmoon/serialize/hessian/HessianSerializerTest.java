package github.ancientmoon.serialize.hessian;

import github.ancientmoon.remoting.dto.RpcRequest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HessianSerializerTest {

    @Test
    public void hessianSerializerTest() {
        RpcRequest target = RpcRequest.builder().methodName("hello")
                .parameters(new Object[]{"sayhelooloo", "sayhelooloosayhelooloo"})
                .interfaceName("github.ancientmoon.HelloService")
                .paramTypes(new Class<?>[]{String.class, String.class})
                .requestId(UUID.randomUUID().toString())
                .group("group1")
                .version("version1")
                .build();
        HessianSerializer hessianSerializer = new HessianSerializer();
        long stime = System.currentTimeMillis();
        byte[] bytes = hessianSerializer.serialize(target);
        RpcRequest actual = hessianSerializer.deserialize(bytes, RpcRequest.class);
        long etime = System.currentTimeMillis();
        System.out.println(etime-stime);
        assertEquals(target.getGroup(), actual.getGroup());
        assertEquals(target.getVersion(), actual.getVersion());
        assertEquals(target.getRequestId(), actual.getRequestId());
    }
}