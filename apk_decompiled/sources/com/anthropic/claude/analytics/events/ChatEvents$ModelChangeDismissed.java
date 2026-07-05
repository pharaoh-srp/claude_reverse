package com.anthropic.claude.analytics.events;

import defpackage.gp2;
import defpackage.gvj;
import defpackage.hp2;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qy1;
import defpackage.vnf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b\u0003\u0010\u0016R\u0014\u0010$\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001b¨\u0006("}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$ModelChangeDismissed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "is_temporary_chat", "<init>", "(Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZLvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$ModelChangeDismissed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$ModelChangeDismissed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "copy", "(Z)Lcom/anthropic/claude/analytics/events/ChatEvents$ModelChangeDismissed;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEventName", "eventName", "Companion", "gp2", "hp2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$ModelChangeDismissed implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final hp2 Companion = new hp2();
    private final boolean is_temporary_chat;

    public /* synthetic */ ChatEvents$ModelChangeDismissed(int i, boolean z, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.is_temporary_chat = z;
        } else {
            gvj.f(i, 1, gp2.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ ChatEvents$ModelChangeDismissed copy$default(ChatEvents$ModelChangeDismissed chatEvents$ModelChangeDismissed, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chatEvents$ModelChangeDismissed.is_temporary_chat;
        }
        return chatEvents$ModelChangeDismissed.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIs_temporary_chat() {
        return this.is_temporary_chat;
    }

    public final ChatEvents$ModelChangeDismissed copy(boolean is_temporary_chat) {
        return new ChatEvents$ModelChangeDismissed(is_temporary_chat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChatEvents$ModelChangeDismissed) && this.is_temporary_chat == ((ChatEvents$ModelChangeDismissed) other).is_temporary_chat;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.chat.model_change.dismissed";
    }

    public int hashCode() {
        return Boolean.hashCode(this.is_temporary_chat);
    }

    public final boolean is_temporary_chat() {
        return this.is_temporary_chat;
    }

    public String toString() {
        return qy1.g("ModelChangeDismissed(is_temporary_chat=", ")", this.is_temporary_chat);
    }

    public ChatEvents$ModelChangeDismissed(boolean z) {
        this.is_temporary_chat = z;
    }
}
