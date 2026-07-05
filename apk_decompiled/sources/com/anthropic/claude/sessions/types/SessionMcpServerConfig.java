package com.anthropic.claude.sessions.types;

import defpackage.dtf;
import defpackage.etf;
import defpackage.f7a;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.ucf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tBO\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJD\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lcom/anthropic/claude/sessions/types/SessionMcpServerConfig;", "", "", "name", "url", "type", "", "headers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SessionMcpServerConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/anthropic/claude/sessions/types/SessionMcpServerConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getUrl", "getType", "Ljava/util/Map;", "getHeaders", "Companion", "dtf", "etf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SessionMcpServerConfig {
    private final Map<String, String> headers;
    private final String name;
    private final String type;
    private final String url;
    public static final etf Companion = new etf();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new ucf(27))};

    public /* synthetic */ SessionMcpServerConfig(int i, String str, String str2, String str3, Map map, vnf vnfVar) {
        if (11 != (i & 11)) {
            gvj.f(i, 11, dtf.a.getDescriptor());
            throw null;
        }
        this.name = str;
        this.url = str2;
        if ((i & 4) == 0) {
            this.type = "http";
        } else {
            this.type = str3;
        }
        this.headers = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        srg srgVar = srg.a;
        return new f7a(srgVar, srgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionMcpServerConfig copy$default(SessionMcpServerConfig sessionMcpServerConfig, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionMcpServerConfig.name;
        }
        if ((i & 2) != 0) {
            str2 = sessionMcpServerConfig.url;
        }
        if ((i & 4) != 0) {
            str3 = sessionMcpServerConfig.type;
        }
        if ((i & 8) != 0) {
            map = sessionMcpServerConfig.headers;
        }
        return sessionMcpServerConfig.copy(str, str2, str3, map);
    }

    public static final /* synthetic */ void write$Self$sessions(SessionMcpServerConfig self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.name);
        output.q(serialDesc, 1, self.url);
        if (output.E(serialDesc) || !x44.r(self.type, "http")) {
            output.q(serialDesc, 2, self.type);
        }
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.headers);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final Map<String, String> component4() {
        return this.headers;
    }

    public final SessionMcpServerConfig copy(String name, String url, String type, Map<String, String> headers) {
        name.getClass();
        url.getClass();
        type.getClass();
        headers.getClass();
        return new SessionMcpServerConfig(name, url, type, headers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionMcpServerConfig)) {
            return false;
        }
        SessionMcpServerConfig sessionMcpServerConfig = (SessionMcpServerConfig) other;
        return x44.r(this.name, sessionMcpServerConfig.name) && x44.r(this.url, sessionMcpServerConfig.url) && x44.r(this.type, sessionMcpServerConfig.type) && x44.r(this.headers, sessionMcpServerConfig.headers);
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.headers.hashCode() + kgh.l(kgh.l(this.name.hashCode() * 31, 31, this.url), 31, this.type);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.url;
        String str3 = this.type;
        Map<String, String> map = this.headers;
        StringBuilder sbR = kgh.r("SessionMcpServerConfig(name=", str, ", url=", str2, ", type=");
        sbR.append(str3);
        sbR.append(", headers=");
        sbR.append(map);
        sbR.append(")");
        return sbR.toString();
    }

    public SessionMcpServerConfig(String str, String str2, String str3, Map<String, String> map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        this.name = str;
        this.url = str2;
        this.type = str3;
        this.headers = map;
    }

    public /* synthetic */ SessionMcpServerConfig(String str, String str2, String str3, Map map, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? "http" : str3, map);
    }
}
