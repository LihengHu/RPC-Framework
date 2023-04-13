package github.ancientmoon.serialize.protostuff;

import github.ancientmoon.remoting.dto.RpcRequest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProtostuffSerializerTest {

    @Test
    public void protostuffSerializerTest(){
        RpcRequest target = RpcRequest.builder().methodName("hello")
                .parameters(new Object[]{"sayhelooloo", "sayhelooloosayhelooloo"})
                .interfaceName("github.ancientmoon.HelloService")
                .paramTypes(new Class<?>[]{String.class, String.class})
                .requestId(UUID.randomUUID().toString())
                .group("group1")
                .version("version1")
                .build();
        ProtostuffSerializer protostuffSerializer = new ProtostuffSerializer();
        long stime = System.currentTimeMillis();
        byte[] bytes = protostuffSerializer.serialize(target);
        RpcRequest actual = protostuffSerializer.deserialize(bytes, RpcRequest.class);
        long etime = System.currentTimeMillis();
        System.out.println(etime-stime);
        assertEquals(target.getGroup(), actual.getGroup());
        assertEquals(target.getVersion(), actual.getVersion());
        assertEquals(target.getRequestId(), actual.getRequestId());
    }
}
