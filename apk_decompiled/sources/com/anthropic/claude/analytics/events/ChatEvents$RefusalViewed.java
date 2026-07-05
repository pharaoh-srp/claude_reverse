package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.lq2;
import defpackage.mdj;
import defpackage.mq2;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J$\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b\u0004\u0010\u0017R\u0014\u0010'\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001d¨\u0006+"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$RefusalViewed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "has_retry_suggestion", "is_temporary_chat", "<init>", "(ZZ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZZLvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$RefusalViewed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$RefusalViewed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/anthropic/claude/analytics/events/ChatEvents$RefusalViewed;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHas_retry_suggestion", "getEventName", "eventName", "Companion", "lq2", "mq2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$RefusalViewed implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final mq2 Companion = new mq2();
    private final boolean has_retry_suggestion;
    private final boolean is_temporary_chat;

    public /* synthetic */ ChatEvents$RefusalViewed(int i, boolean z, boolean z2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, lq2.a.getDescriptor());
            throw null;
        }
        this.has_retry_suggestion = z;
        this.is_temporary_chat = z2;
    }

    public static /* synthetic */ ChatEvents$RefusalViewed copy$default(ChatEvents$RefusalViewed chatEvents$RefusalViewed, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chatEvents$RefusalViewed.has_retry_suggestion;
        }
        if ((i & 2) != 0) {
            z2 = chatEvents$RefusalViewed.is_temporary_chat;
        }
        return chatEvents$RefusalViewed.copy(z, z2);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$RefusalViewed self, vd4 output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.has_retry_suggestion);
        output.p(serialDesc, 1, self.is_temporary_chat);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHas_retry_suggestion() {
        return this.has_retry_suggestion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIs_temporary_chat() {
        return this.is_temporary_chat;
    }

    public final ChatEvents$RefusalViewed copy(boolean has_retry_suggestion, boolean is_temporary_chat) {
        return new ChatEvents$RefusalViewed(has_retry_suggestion, is_temporary_chat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$RefusalViewed)) {
            return false;
        }
        ChatEvents$RefusalViewed chatEvents$RefusalViewed = (ChatEvents$RefusalViewed) other;
        return this.has_retry_suggestion == chatEvents$RefusalViewed.has_retry_suggestion && this.is_temporary_chat == chatEvents$RefusalViewed.is_temporary_chat;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.chat.refusal.viewed";
    }

    public final boolean getHas_retry_suggestion() {
        return this.has_retry_suggestion;
    }

    public int hashCode() {
        return Boolean.hashCode(this.is_temporary_chat) + (Boolean.hashCode(this.has_retry_suggestion) * 31);
    }

    public final boolean is_temporary_chat() {
        return this.is_temporary_chat;
    }

    public String toString() {
        return "RefusalViewed(has_retry_suggestion=" + this.has_retry_suggestion + ", is_temporary_chat=" + this.is_temporary_chat + ")";
    }

    public ChatEvents$RefusalViewed(boolean z, boolean z2) {
        this.has_retry_suggestion = z;
        this.is_temporary_chat = z2;
    }
}
