package com.anthropic.claude.api.conway;

import defpackage.dm8;
import defpackage.e79;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J4\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0017¨\u0006,"}, d2 = {"Lcom/anthropic/claude/api/conway/HeartbeatSpec;", "", "", "cron", "", "interval_s", "at", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/conway/HeartbeatSpec;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/anthropic/claude/api/conway/HeartbeatSpec;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCron", "Ljava/lang/Integer;", "getInterval_s", "getAt", "Companion", "cm8", "dm8", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HeartbeatSpec {
    public static final int $stable = 0;
    public static final dm8 Companion = new dm8();
    private final String at;
    private final String cron;
    private final Integer interval_s;

    public /* synthetic */ HeartbeatSpec(int i, String str, Integer num, String str2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.cron = null;
        } else {
            this.cron = str;
        }
        if ((i & 2) == 0) {
            this.interval_s = null;
        } else {
            this.interval_s = num;
        }
        if ((i & 4) == 0) {
            this.at = null;
        } else {
            this.at = str2;
        }
    }

    public static /* synthetic */ HeartbeatSpec copy$default(HeartbeatSpec heartbeatSpec, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = heartbeatSpec.cron;
        }
        if ((i & 2) != 0) {
            num = heartbeatSpec.interval_s;
        }
        if ((i & 4) != 0) {
            str2 = heartbeatSpec.at;
        }
        return heartbeatSpec.copy(str, num, str2);
    }

    public static final /* synthetic */ void write$Self$api(HeartbeatSpec self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.cron != null) {
            output.B(serialDesc, 0, srg.a, self.cron);
        }
        if (output.E(serialDesc) || self.interval_s != null) {
            output.B(serialDesc, 1, e79.a, self.interval_s);
        }
        if (!output.E(serialDesc) && self.at == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.at);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCron() {
        return this.cron;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getInterval_s() {
        return this.interval_s;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAt() {
        return this.at;
    }

    public final HeartbeatSpec copy(String cron, Integer interval_s, String at) {
        return new HeartbeatSpec(cron, interval_s, at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartbeatSpec)) {
            return false;
        }
        HeartbeatSpec heartbeatSpec = (HeartbeatSpec) other;
        return x44.r(this.cron, heartbeatSpec.cron) && x44.r(this.interval_s, heartbeatSpec.interval_s) && x44.r(this.at, heartbeatSpec.at);
    }

    public final String getAt() {
        return this.at;
    }

    public final String getCron() {
        return this.cron;
    }

    public final Integer getInterval_s() {
        return this.interval_s;
    }

    public int hashCode() {
        String str = this.cron;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.interval_s;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.at;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.cron;
        Integer num = this.interval_s;
        String str2 = this.at;
        StringBuilder sb = new StringBuilder("HeartbeatSpec(cron=");
        sb.append(str);
        sb.append(", interval_s=");
        sb.append(num);
        sb.append(", at=");
        return ij0.m(sb, str2, ")");
    }

    public HeartbeatSpec() {
        this((String) null, (Integer) null, (String) null, 7, (mq5) null);
    }

    public HeartbeatSpec(String str, Integer num, String str2) {
        this.cron = str;
        this.interval_s = num;
        this.at = str2;
    }

    public /* synthetic */ HeartbeatSpec(String str, Integer num, String str2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
    }
}
