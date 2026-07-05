package com.anthropic.claude.api.events;

import defpackage.bh1;
import defpackage.ch1;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/events/BatchEventLoggingResponse;", "", "", "accepted_count", "rejected_count", "<init>", "(II)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IIILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/events/BatchEventLoggingResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "copy", "(II)Lcom/anthropic/claude/api/events/BatchEventLoggingResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getAccepted_count", "getRejected_count", "Companion", "bh1", "ch1", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class BatchEventLoggingResponse {
    public static final int $stable = 0;
    public static final ch1 Companion = new ch1();
    private final int accepted_count;
    private final int rejected_count;

    public /* synthetic */ BatchEventLoggingResponse(int i, int i2, int i3, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, bh1.a.getDescriptor());
            throw null;
        }
        this.accepted_count = i2;
        this.rejected_count = i3;
    }

    public static /* synthetic */ BatchEventLoggingResponse copy$default(BatchEventLoggingResponse batchEventLoggingResponse, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = batchEventLoggingResponse.accepted_count;
        }
        if ((i3 & 2) != 0) {
            i2 = batchEventLoggingResponse.rejected_count;
        }
        return batchEventLoggingResponse.copy(i, i2);
    }

    public static final /* synthetic */ void write$Self$api(BatchEventLoggingResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.l(0, self.accepted_count, serialDesc);
        output.l(1, self.rejected_count, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAccepted_count() {
        return this.accepted_count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRejected_count() {
        return this.rejected_count;
    }

    public final BatchEventLoggingResponse copy(int accepted_count, int rejected_count) {
        return new BatchEventLoggingResponse(accepted_count, rejected_count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatchEventLoggingResponse)) {
            return false;
        }
        BatchEventLoggingResponse batchEventLoggingResponse = (BatchEventLoggingResponse) other;
        return this.accepted_count == batchEventLoggingResponse.accepted_count && this.rejected_count == batchEventLoggingResponse.rejected_count;
    }

    public final int getAccepted_count() {
        return this.accepted_count;
    }

    public final int getRejected_count() {
        return this.rejected_count;
    }

    public int hashCode() {
        return Integer.hashCode(this.rejected_count) + (Integer.hashCode(this.accepted_count) * 31);
    }

    public String toString() {
        return vb7.q("BatchEventLoggingResponse(accepted_count=", ", rejected_count=", this.accepted_count, this.rejected_count, ")");
    }

    public BatchEventLoggingResponse(int i, int i2) {
        this.accepted_count = i;
        this.rejected_count = i2;
    }
}
