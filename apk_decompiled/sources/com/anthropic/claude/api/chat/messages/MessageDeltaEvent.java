package com.anthropic.claude.api.chat.messages;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vfb;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/MessageDeltaEvent;", "Lcom/anthropic/claude/api/chat/messages/StreamEvent;", "Lcom/anthropic/claude/api/chat/messages/MessageDelta;", "delta", "<init>", "(Lcom/anthropic/claude/api/chat/messages/MessageDelta;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/chat/messages/MessageDelta;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/MessageDeltaEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/chat/messages/MessageDelta;", "copy", "(Lcom/anthropic/claude/api/chat/messages/MessageDelta;)Lcom/anthropic/claude/api/chat/messages/MessageDeltaEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/chat/messages/MessageDelta;", "getDelta", "Companion", "ufb", "vfb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageDeltaEvent implements StreamEvent {
    public static final int $stable = 0;
    public static final vfb Companion = new vfb();
    private final MessageDelta delta;

    public /* synthetic */ MessageDeltaEvent(int i, MessageDelta messageDelta, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.delta = null;
        } else {
            this.delta = messageDelta;
        }
    }

    public static /* synthetic */ MessageDeltaEvent copy$default(MessageDeltaEvent messageDeltaEvent, MessageDelta messageDelta, int i, Object obj) {
        if ((i & 1) != 0) {
            messageDelta = messageDeltaEvent.delta;
        }
        return messageDeltaEvent.copy(messageDelta);
    }

    public static final /* synthetic */ void write$Self$api(MessageDeltaEvent self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.delta == null) {
            return;
        }
        output.B(serialDesc, 0, d.a, self.delta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessageDelta getDelta() {
        return this.delta;
    }

    public final MessageDeltaEvent copy(MessageDelta delta) {
        return new MessageDeltaEvent(delta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MessageDeltaEvent) && x44.r(this.delta, ((MessageDeltaEvent) other).delta);
    }

    public final MessageDelta getDelta() {
        return this.delta;
    }

    public int hashCode() {
        MessageDelta messageDelta = this.delta;
        if (messageDelta == null) {
            return 0;
        }
        return messageDelta.hashCode();
    }

    public String toString() {
        return "MessageDeltaEvent(delta=" + this.delta + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageDeltaEvent() {
        this((MessageDelta) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public MessageDeltaEvent(MessageDelta messageDelta) {
        this.delta = messageDelta;
    }

    public /* synthetic */ MessageDeltaEvent(MessageDelta messageDelta, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : messageDelta);
    }
}
