package com.anthropic.claude.api.sync;

import defpackage.e79;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w08;
import defpackage.x44;
import defpackage.xka;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J>\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b\t\u0010 ¨\u00063"}, d2 = {"Lcom/anthropic/claude/api/sync/GHEConnectionStatus;", "", "", "ghe_config_id", "", "hostname", "", "port", "", "is_connected", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Z)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;ZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/sync/GHEConnectionStatus;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()Z", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/anthropic/claude/api/sync/GHEConnectionStatus;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getGhe_config_id", "Ljava/lang/String;", "getHostname", "Ljava/lang/Integer;", "getPort", "Z", "Companion", "v08", "w08", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GHEConnectionStatus {
    public static final int $stable = 0;
    public static final w08 Companion = new w08();
    private final Long ghe_config_id;
    private final String hostname;
    private final boolean is_connected;
    private final Integer port;

    public /* synthetic */ GHEConnectionStatus(int i, Long l, String str, Integer num, boolean z, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.ghe_config_id = null;
        } else {
            this.ghe_config_id = l;
        }
        if ((i & 2) == 0) {
            this.hostname = null;
        } else {
            this.hostname = str;
        }
        if ((i & 4) == 0) {
            this.port = null;
        } else {
            this.port = num;
        }
        if ((i & 8) == 0) {
            this.is_connected = false;
        } else {
            this.is_connected = z;
        }
    }

    public static /* synthetic */ GHEConnectionStatus copy$default(GHEConnectionStatus gHEConnectionStatus, Long l, String str, Integer num, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            l = gHEConnectionStatus.ghe_config_id;
        }
        if ((i & 2) != 0) {
            str = gHEConnectionStatus.hostname;
        }
        if ((i & 4) != 0) {
            num = gHEConnectionStatus.port;
        }
        if ((i & 8) != 0) {
            z = gHEConnectionStatus.is_connected;
        }
        return gHEConnectionStatus.copy(l, str, num, z);
    }

    public static final /* synthetic */ void write$Self$api(GHEConnectionStatus self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.ghe_config_id != null) {
            output.B(serialDesc, 0, xka.a, self.ghe_config_id);
        }
        if (output.E(serialDesc) || self.hostname != null) {
            output.B(serialDesc, 1, srg.a, self.hostname);
        }
        if (output.E(serialDesc) || self.port != null) {
            output.B(serialDesc, 2, e79.a, self.port);
        }
        if (output.E(serialDesc) || self.is_connected) {
            output.p(serialDesc, 3, self.is_connected);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getGhe_config_id() {
        return this.ghe_config_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHostname() {
        return this.hostname;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPort() {
        return this.port;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIs_connected() {
        return this.is_connected;
    }

    public final GHEConnectionStatus copy(Long ghe_config_id, String hostname, Integer port, boolean is_connected) {
        return new GHEConnectionStatus(ghe_config_id, hostname, port, is_connected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GHEConnectionStatus)) {
            return false;
        }
        GHEConnectionStatus gHEConnectionStatus = (GHEConnectionStatus) other;
        return x44.r(this.ghe_config_id, gHEConnectionStatus.ghe_config_id) && x44.r(this.hostname, gHEConnectionStatus.hostname) && x44.r(this.port, gHEConnectionStatus.port) && this.is_connected == gHEConnectionStatus.is_connected;
    }

    public final Long getGhe_config_id() {
        return this.ghe_config_id;
    }

    public final String getHostname() {
        return this.hostname;
    }

    public final Integer getPort() {
        return this.port;
    }

    public int hashCode() {
        Long l = this.ghe_config_id;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.hostname;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.port;
        return Boolean.hashCode(this.is_connected) + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final boolean is_connected() {
        return this.is_connected;
    }

    public String toString() {
        return "GHEConnectionStatus(ghe_config_id=" + this.ghe_config_id + ", hostname=" + this.hostname + ", port=" + this.port + ", is_connected=" + this.is_connected + ")";
    }

    public GHEConnectionStatus() {
        this((Long) null, (String) null, (Integer) null, false, 15, (mq5) null);
    }

    public GHEConnectionStatus(Long l, String str, Integer num, boolean z) {
        this.ghe_config_id = l;
        this.hostname = str;
        this.port = num;
        this.is_connected = z;
    }

    public /* synthetic */ GHEConnectionStatus(Long l, String str, Integer num, boolean z, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? false : z);
    }
}
