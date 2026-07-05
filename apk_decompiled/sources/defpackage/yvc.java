package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class yvc {
    static {
        HashMap map = new HashMap(7);
        map.put("java-kafka", new String[]{"messaging.kafka.bootstrap.servers"});
        map.put("hazelcast-sdk", new String[]{"hazelcast.instance", "peer.hostname"});
        map.put("couchbase-client", new String[]{"db.couchbase.seed.nodes", "net.peer.name", "peer.hostname"});
        map.put("java-cassandra", new String[]{"db.cassandra.contact.points", "peer.hostname"});
        String[] strArr = {"rpc.service", "peer.hostname"};
        map.put("grpc-client", strArr);
        map.put("armeria-grpc-client", strArr);
        map.put("rmi-client", strArr);
        map.put("java-aws-sdk", new String[0]);
    }
}
