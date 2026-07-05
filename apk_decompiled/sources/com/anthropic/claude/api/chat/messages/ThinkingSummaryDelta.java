package com.anthropic.claude.api.chat.messages;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.omh;
import defpackage.onf;
import defpackage.pmh;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/ThinkingSummaryDelta;", "Lcom/anthropic/claude/api/chat/messages/ContentBlockDelta;", "Lcom/anthropic/claude/api/chat/messages/ThinkingSummary;", "summary", "<init>", "(Lcom/anthropic/claude/api/chat/messages/ThinkingSummary;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/chat/messages/ThinkingSummary;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/ThinkingSummaryDelta;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/chat/messages/ThinkingSummary;", "copy", "(Lcom/anthropic/claude/api/chat/messages/ThinkingSummary;)Lcom/anthropic/claude/api/chat/messages/ThinkingSummaryDelta;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/chat/messages/ThinkingSummary;", "getSummary", "Companion", "omh", "pmh", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ThinkingSummaryDelta implements ContentBlockDelta {
    public static final int $stable = 0;
    public static final pmh Companion = new pmh();
    private final ThinkingSummary summary;

    public /* synthetic */ ThinkingSummaryDelta(int i, ThinkingSummary thinkingSummary, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.summary = thinkingSummary;
        } else {
            gvj.f(i, 1, omh.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ ThinkingSummaryDelta copy$default(ThinkingSummaryDelta thinkingSummaryDelta, ThinkingSummary thinkingSummary, int i, Object obj) {
        if ((i & 1) != 0) {
            thinkingSummary = thinkingSummaryDelta.summary;
        }
        return thinkingSummaryDelta.copy(thinkingSummary);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ThinkingSummary getSummary() {
        return this.summary;
    }

    public final ThinkingSummaryDelta copy(ThinkingSummary summary) {
        summary.getClass();
        return new ThinkingSummaryDelta(summary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ThinkingSummaryDelta) && x44.r(this.summary, ((ThinkingSummaryDelta) other).summary);
    }

    public final ThinkingSummary getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return this.summary.hashCode();
    }

    public String toString() {
        return "ThinkingSummaryDelta(summary=" + this.summary + ")";
    }

    public ThinkingSummaryDelta(ThinkingSummary thinkingSummary) {
        thinkingSummary.getClass();
        this.summary = thinkingSummary;
    }
}
