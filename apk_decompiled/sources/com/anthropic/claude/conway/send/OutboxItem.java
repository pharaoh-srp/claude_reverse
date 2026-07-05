package com.anthropic.claude.conway.send;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.ykc;
import defpackage.zkc;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u001eJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Lcom/anthropic/claude/conway/send/OutboxItem;", "", "", "text", "agentId", "", "queuedAt", "", "attempts", "<init>", "(Ljava/lang/String;Ljava/lang/String;JI)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/send/OutboxItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;JI)Lcom/anthropic/claude/conway/send/OutboxItem;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getAgentId", "J", "getQueuedAt", "I", "getAttempts", "Companion", "ykc", "zkc", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class OutboxItem {
    public static final int $stable = 0;
    public static final zkc Companion = new zkc();
    private final String agentId;
    private final int attempts;
    private final long queuedAt;
    private final String text;

    public /* synthetic */ OutboxItem(int i, String str, String str2, long j, int i2, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, ykc.a.getDescriptor());
            throw null;
        }
        this.text = str;
        this.agentId = str2;
        this.queuedAt = j;
        if ((i & 8) == 0) {
            this.attempts = 0;
        } else {
            this.attempts = i2;
        }
    }

    public static /* synthetic */ OutboxItem copy$default(OutboxItem outboxItem, String str, String str2, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = outboxItem.text;
        }
        if ((i2 & 2) != 0) {
            str2 = outboxItem.agentId;
        }
        if ((i2 & 4) != 0) {
            j = outboxItem.queuedAt;
        }
        if ((i2 & 8) != 0) {
            i = outboxItem.attempts;
        }
        int i3 = i;
        return outboxItem.copy(str, str2, j, i3);
    }

    public static final /* synthetic */ void write$Self$conway(OutboxItem self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.text);
        output.q(serialDesc, 1, self.agentId);
        output.D(serialDesc, 2, self.queuedAt);
        if (!output.E(serialDesc) && self.attempts == 0) {
            return;
        }
        output.l(3, self.attempts, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getQueuedAt() {
        return this.queuedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAttempts() {
        return this.attempts;
    }

    public final OutboxItem copy(String text, String agentId, long queuedAt, int attempts) {
        text.getClass();
        agentId.getClass();
        return new OutboxItem(text, agentId, queuedAt, attempts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutboxItem)) {
            return false;
        }
        OutboxItem outboxItem = (OutboxItem) other;
        return x44.r(this.text, outboxItem.text) && x44.r(this.agentId, outboxItem.agentId) && this.queuedAt == outboxItem.queuedAt && this.attempts == outboxItem.attempts;
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final int getAttempts() {
        return this.attempts;
    }

    public final long getQueuedAt() {
        return this.queuedAt;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return Integer.hashCode(this.attempts) + vb7.e(kgh.l(this.text.hashCode() * 31, 31, this.agentId), 31, this.queuedAt);
    }

    public String toString() {
        String str = this.text;
        String str2 = this.agentId;
        long j = this.queuedAt;
        int i = this.attempts;
        StringBuilder sbR = kgh.r("OutboxItem(text=", str, ", agentId=", str2, ", queuedAt=");
        sbR.append(j);
        sbR.append(", attempts=");
        sbR.append(i);
        sbR.append(")");
        return sbR.toString();
    }

    public OutboxItem(String str, String str2, long j, int i) {
        str.getClass();
        str2.getClass();
        this.text = str;
        this.agentId = str2;
        this.queuedAt = j;
        this.attempts = i;
    }

    public /* synthetic */ OutboxItem(String str, String str2, long j, int i, int i2, mq5 mq5Var) {
        this(str, str2, j, (i2 & 8) != 0 ? 0 : i);
    }
}
