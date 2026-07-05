package com.anthropic.claude.conway.protocol;

import defpackage.f7a;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.l84;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nm6;
import defpackage.onf;
import defpackage.srg;
import defpackage.um4;
import defpackage.vd4;
import defpackage.vm4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002./B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tBO\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJD\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ContainerHealthResponse;", "", "", "name", "version", "protocol", "", "endpoints", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ContainerHealthResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/anthropic/claude/conway/protocol/ContainerHealthResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getVersion", "getProtocol", "Ljava/util/Map;", "getEndpoints", "Companion", "um4", "vm4", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ContainerHealthResponse {
    public static final int $stable = 8;
    private final Map<String, String> endpoints;
    private final String name;
    private final String protocol;
    private final String version;
    public static final vm4 Companion = new vm4();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new l84(19))};

    public /* synthetic */ ContainerHealthResponse(int i, String str, String str2, String str3, Map map, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, um4.a.getDescriptor());
            throw null;
        }
        this.name = str;
        this.version = str2;
        this.protocol = str3;
        if ((i & 8) == 0) {
            this.endpoints = nm6.E;
        } else {
            this.endpoints = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        srg srgVar = srg.a;
        return new f7a(srgVar, srgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContainerHealthResponse copy$default(ContainerHealthResponse containerHealthResponse, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = containerHealthResponse.name;
        }
        if ((i & 2) != 0) {
            str2 = containerHealthResponse.version;
        }
        if ((i & 4) != 0) {
            str3 = containerHealthResponse.protocol;
        }
        if ((i & 8) != 0) {
            map = containerHealthResponse.endpoints;
        }
        return containerHealthResponse.copy(str, str2, str3, map);
    }

    public static final /* synthetic */ void write$Self$conway(ContainerHealthResponse self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.name);
        output.q(serialDesc, 1, self.version);
        output.q(serialDesc, 2, self.protocol);
        if (!output.E(serialDesc) && x44.r(self.endpoints, nm6.E)) {
            return;
        }
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.endpoints);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProtocol() {
        return this.protocol;
    }

    public final Map<String, String> component4() {
        return this.endpoints;
    }

    public final ContainerHealthResponse copy(String name, String version, String protocol, Map<String, String> endpoints) {
        name.getClass();
        version.getClass();
        protocol.getClass();
        endpoints.getClass();
        return new ContainerHealthResponse(name, version, protocol, endpoints);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContainerHealthResponse)) {
            return false;
        }
        ContainerHealthResponse containerHealthResponse = (ContainerHealthResponse) other;
        return x44.r(this.name, containerHealthResponse.name) && x44.r(this.version, containerHealthResponse.version) && x44.r(this.protocol, containerHealthResponse.protocol) && x44.r(this.endpoints, containerHealthResponse.endpoints);
    }

    public final Map<String, String> getEndpoints() {
        return this.endpoints;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.endpoints.hashCode() + kgh.l(kgh.l(this.name.hashCode() * 31, 31, this.version), 31, this.protocol);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.version;
        String str3 = this.protocol;
        Map<String, String> map = this.endpoints;
        StringBuilder sbR = kgh.r("ContainerHealthResponse(name=", str, ", version=", str2, ", protocol=");
        sbR.append(str3);
        sbR.append(", endpoints=");
        sbR.append(map);
        sbR.append(")");
        return sbR.toString();
    }

    public ContainerHealthResponse(String str, String str2, String str3, Map<String, String> map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        this.name = str;
        this.version = str2;
        this.protocol = str3;
        this.endpoints = map;
    }

    public /* synthetic */ ContainerHealthResponse(String str, String str2, String str3, Map map, int i, mq5 mq5Var) {
        this(str, str2, str3, (i & 8) != 0 ? nm6.E : map);
    }
}
