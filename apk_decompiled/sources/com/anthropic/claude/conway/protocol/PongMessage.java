package com.anthropic.claude.conway.protocol;

import defpackage.a9d;
import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.z8d;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001b¨\u00062"}, d2 = {"Lcom/anthropic/claude/conway/protocol/PongMessage;", "", "", "type", "", "seq", "ts", "pingSeq", "<init>", "(Ljava/lang/String;JJJ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;JJJLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/PongMessage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "copy", "(Ljava/lang/String;JJJ)Lcom/anthropic/claude/conway/protocol/PongMessage;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "J", "getSeq", "getTs", "getPingSeq", "getPingSeq$annotations", "()V", "Companion", "z8d", "a9d", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PongMessage {
    public static final int $stable = 0;
    public static final a9d Companion = new a9d();
    private final long pingSeq;
    private final long seq;
    private final long ts;
    private final String type;

    public /* synthetic */ PongMessage(int i, String str, long j, long j2, long j3, vnf vnfVar) {
        if (14 != (i & 14)) {
            gvj.f(i, 14, z8d.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.type = "pong";
        } else {
            this.type = str;
        }
        this.seq = j;
        this.ts = j2;
        this.pingSeq = j3;
    }

    public static /* synthetic */ PongMessage copy$default(PongMessage pongMessage, String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pongMessage.type;
        }
        if ((i & 2) != 0) {
            j = pongMessage.seq;
        }
        if ((i & 4) != 0) {
            j2 = pongMessage.ts;
        }
        if ((i & 8) != 0) {
            j3 = pongMessage.pingSeq;
        }
        long j4 = j3;
        return pongMessage.copy(str, j, j2, j4);
    }

    public static /* synthetic */ void getPingSeq$annotations() {
    }

    public static final /* synthetic */ void write$Self$conway(PongMessage self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.type, "pong")) {
            output.q(serialDesc, 0, self.type);
        }
        output.D(serialDesc, 1, self.seq);
        output.D(serialDesc, 2, self.ts);
        output.D(serialDesc, 3, self.pingSeq);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSeq() {
        return this.seq;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTs() {
        return this.ts;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPingSeq() {
        return this.pingSeq;
    }

    public final PongMessage copy(String type, long seq, long ts, long pingSeq) {
        type.getClass();
        return new PongMessage(type, seq, ts, pingSeq);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PongMessage)) {
            return false;
        }
        PongMessage pongMessage = (PongMessage) other;
        return x44.r(this.type, pongMessage.type) && this.seq == pongMessage.seq && this.ts == pongMessage.ts && this.pingSeq == pongMessage.pingSeq;
    }

    public final long getPingSeq() {
        return this.pingSeq;
    }

    public final long getSeq() {
        return this.seq;
    }

    public final long getTs() {
        return this.ts;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Long.hashCode(this.pingSeq) + vb7.e(vb7.e(this.type.hashCode() * 31, 31, this.seq), 31, this.ts);
    }

    public String toString() {
        String str = this.type;
        long j = this.seq;
        long j2 = this.ts;
        long j3 = this.pingSeq;
        StringBuilder sbW = vb7.w("PongMessage(type=", str, ", seq=", j);
        ij0.u(j2, ", ts=", ", pingSeq=", sbW);
        return grc.r(j3, ")", sbW);
    }

    public PongMessage(String str, long j, long j2, long j3) {
        str.getClass();
        this.type = str;
        this.seq = j;
        this.ts = j2;
        this.pingSeq = j3;
    }

    public /* synthetic */ PongMessage(String str, long j, long j2, long j3, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "pong" : str, j, j2, j3);
    }
}
