package com.anthropic.claude.api.chat.messages;

import com.anthropic.claude.api.common.RateLimit;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.rhb;
import defpackage.rpa;
import defpackage.shb;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/MessageLimitEvent;", "Lcom/anthropic/claude/api/chat/messages/StreamEvent;", "Lcom/anthropic/claude/api/common/RateLimit;", "message_limit", "<init>", "(Lcom/anthropic/claude/api/common/RateLimit;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/common/RateLimit;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/MessageLimitEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/common/RateLimit;", "copy", "(Lcom/anthropic/claude/api/common/RateLimit;)Lcom/anthropic/claude/api/chat/messages/MessageLimitEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/common/RateLimit;", "getMessage_limit", "Companion", "rhb", "shb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageLimitEvent implements StreamEvent {
    public static final int $stable = 0;
    private final RateLimit message_limit;
    public static final shb Companion = new shb();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new rpa(20))};

    public /* synthetic */ MessageLimitEvent(int i, RateLimit rateLimit, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.message_limit = rateLimit;
        } else {
            gvj.f(i, 1, rhb.a.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return RateLimit.Companion.serializer();
    }

    public static /* synthetic */ MessageLimitEvent copy$default(MessageLimitEvent messageLimitEvent, RateLimit rateLimit, int i, Object obj) {
        if ((i & 1) != 0) {
            rateLimit = messageLimitEvent.message_limit;
        }
        return messageLimitEvent.copy(rateLimit);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RateLimit getMessage_limit() {
        return this.message_limit;
    }

    public final MessageLimitEvent copy(RateLimit message_limit) {
        message_limit.getClass();
        return new MessageLimitEvent(message_limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MessageLimitEvent) && x44.r(this.message_limit, ((MessageLimitEvent) other).message_limit);
    }

    public final RateLimit getMessage_limit() {
        return this.message_limit;
    }

    public int hashCode() {
        return this.message_limit.hashCode();
    }

    public String toString() {
        return "MessageLimitEvent(message_limit=" + this.message_limit + ")";
    }

    public MessageLimitEvent(RateLimit rateLimit) {
        rateLimit.getClass();
        this.message_limit = rateLimit;
    }
}
