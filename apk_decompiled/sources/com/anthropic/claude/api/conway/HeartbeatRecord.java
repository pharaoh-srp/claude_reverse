package com.anthropic.claude.api.conway;

import defpackage.am8;
import defpackage.bm8;
import defpackage.cm8;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJH\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u001b¨\u00065"}, d2 = {"Lcom/anthropic/claude/api/conway/HeartbeatRecord;", "", "", "name", "Lcom/anthropic/claude/api/conway/HeartbeatSpec;", "spec", "message", "", "paused", "next_fire_at", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/conway/HeartbeatSpec;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/conway/HeartbeatSpec;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/conway/HeartbeatRecord;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/api/conway/HeartbeatSpec;", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/api/conway/HeartbeatSpec;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/anthropic/claude/api/conway/HeartbeatRecord;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lcom/anthropic/claude/api/conway/HeartbeatSpec;", "getSpec", "getMessage", "Ljava/lang/Boolean;", "getPaused", "getNext_fire_at", "Companion", "am8", "bm8", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HeartbeatRecord {
    public static final int $stable = 0;
    public static final bm8 Companion = new bm8();
    private final String message;
    private final String name;
    private final String next_fire_at;
    private final Boolean paused;
    private final HeartbeatSpec spec;

    public /* synthetic */ HeartbeatRecord(int i, String str, HeartbeatSpec heartbeatSpec, String str2, Boolean bool, String str3, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, am8.a.getDescriptor());
            throw null;
        }
        this.name = str;
        this.spec = heartbeatSpec;
        if ((i & 4) == 0) {
            this.message = null;
        } else {
            this.message = str2;
        }
        if ((i & 8) == 0) {
            this.paused = null;
        } else {
            this.paused = bool;
        }
        if ((i & 16) == 0) {
            this.next_fire_at = null;
        } else {
            this.next_fire_at = str3;
        }
    }

    public static /* synthetic */ HeartbeatRecord copy$default(HeartbeatRecord heartbeatRecord, String str, HeartbeatSpec heartbeatSpec, String str2, Boolean bool, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = heartbeatRecord.name;
        }
        if ((i & 2) != 0) {
            heartbeatSpec = heartbeatRecord.spec;
        }
        if ((i & 4) != 0) {
            str2 = heartbeatRecord.message;
        }
        if ((i & 8) != 0) {
            bool = heartbeatRecord.paused;
        }
        if ((i & 16) != 0) {
            str3 = heartbeatRecord.next_fire_at;
        }
        String str4 = str3;
        String str5 = str2;
        return heartbeatRecord.copy(str, heartbeatSpec, str5, bool, str4);
    }

    public static final /* synthetic */ void write$Self$api(HeartbeatRecord self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.name);
        output.r(serialDesc, 1, cm8.a, self.spec);
        if (output.E(serialDesc) || self.message != null) {
            output.B(serialDesc, 2, srg.a, self.message);
        }
        if (output.E(serialDesc) || self.paused != null) {
            output.B(serialDesc, 3, zt1.a, self.paused);
        }
        if (!output.E(serialDesc) && self.next_fire_at == null) {
            return;
        }
        output.B(serialDesc, 4, srg.a, self.next_fire_at);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HeartbeatSpec getSpec() {
        return this.spec;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getPaused() {
        return this.paused;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNext_fire_at() {
        return this.next_fire_at;
    }

    public final HeartbeatRecord copy(String name, HeartbeatSpec spec, String message, Boolean paused, String next_fire_at) {
        name.getClass();
        spec.getClass();
        return new HeartbeatRecord(name, spec, message, paused, next_fire_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartbeatRecord)) {
            return false;
        }
        HeartbeatRecord heartbeatRecord = (HeartbeatRecord) other;
        return x44.r(this.name, heartbeatRecord.name) && x44.r(this.spec, heartbeatRecord.spec) && x44.r(this.message, heartbeatRecord.message) && x44.r(this.paused, heartbeatRecord.paused) && x44.r(this.next_fire_at, heartbeatRecord.next_fire_at);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNext_fire_at() {
        return this.next_fire_at;
    }

    public final Boolean getPaused() {
        return this.paused;
    }

    public final HeartbeatSpec getSpec() {
        return this.spec;
    }

    public int hashCode() {
        int iHashCode = (this.spec.hashCode() + (this.name.hashCode() * 31)) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.paused;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.next_fire_at;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        HeartbeatSpec heartbeatSpec = this.spec;
        String str2 = this.message;
        Boolean bool = this.paused;
        String str3 = this.next_fire_at;
        StringBuilder sb = new StringBuilder("HeartbeatRecord(name=");
        sb.append(str);
        sb.append(", spec=");
        sb.append(heartbeatSpec);
        sb.append(", message=");
        sb.append(str2);
        sb.append(", paused=");
        sb.append(bool);
        sb.append(", next_fire_at=");
        return ij0.m(sb, str3, ")");
    }

    public HeartbeatRecord(String str, HeartbeatSpec heartbeatSpec, String str2, Boolean bool, String str3) {
        str.getClass();
        heartbeatSpec.getClass();
        this.name = str;
        this.spec = heartbeatSpec;
        this.message = str2;
        this.paused = bool;
        this.next_fire_at = str3;
    }

    public /* synthetic */ HeartbeatRecord(String str, HeartbeatSpec heartbeatSpec, String str2, Boolean bool, String str3, int i, mq5 mq5Var) {
        this(str, heartbeatSpec, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str3);
    }
}
