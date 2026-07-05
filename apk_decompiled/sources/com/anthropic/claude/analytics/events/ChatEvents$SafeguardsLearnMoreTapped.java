package com.anthropic.claude.analytics.events;

import defpackage.ao2;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.tq2;
import defpackage.uq2;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0014\u0010+\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001f¨\u0006/"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$SafeguardsLearnMoreTapped", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/ChatEvents$SafeguardsLearnMoreSurface;", "surface", "", "has_server_url", "<init>", "(Lcom/anthropic/claude/analytics/events/ChatEvents$SafeguardsLearnMoreSurface;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/ChatEvents$SafeguardsLearnMoreSurface;ZLvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$SafeguardsLearnMoreTapped;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$SafeguardsLearnMoreTapped;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/ChatEvents$SafeguardsLearnMoreSurface;", "component2", "()Z", "copy", "(Lcom/anthropic/claude/analytics/events/ChatEvents$SafeguardsLearnMoreSurface;Z)Lcom/anthropic/claude/analytics/events/ChatEvents$SafeguardsLearnMoreTapped;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/ChatEvents$SafeguardsLearnMoreSurface;", "getSurface", "Z", "getHas_server_url", "getEventName", "eventName", "Companion", "tq2", "uq2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$SafeguardsLearnMoreTapped implements AnalyticsEvent {
    public static final int $stable = 0;
    private final boolean has_server_url;
    private final ChatEvents$SafeguardsLearnMoreSurface surface;
    public static final uq2 Companion = new uq2();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new ao2(28)), null};

    public /* synthetic */ ChatEvents$SafeguardsLearnMoreTapped(int i, ChatEvents$SafeguardsLearnMoreSurface chatEvents$SafeguardsLearnMoreSurface, boolean z, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, tq2.a.getDescriptor());
            throw null;
        }
        this.surface = chatEvents$SafeguardsLearnMoreSurface;
        this.has_server_url = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatEvents$SafeguardsLearnMoreSurface.Companion.serializer();
    }

    public static /* synthetic */ ChatEvents$SafeguardsLearnMoreTapped copy$default(ChatEvents$SafeguardsLearnMoreTapped chatEvents$SafeguardsLearnMoreTapped, ChatEvents$SafeguardsLearnMoreSurface chatEvents$SafeguardsLearnMoreSurface, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            chatEvents$SafeguardsLearnMoreSurface = chatEvents$SafeguardsLearnMoreTapped.surface;
        }
        if ((i & 2) != 0) {
            z = chatEvents$SafeguardsLearnMoreTapped.has_server_url;
        }
        return chatEvents$SafeguardsLearnMoreTapped.copy(chatEvents$SafeguardsLearnMoreSurface, z);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$SafeguardsLearnMoreTapped self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.surface);
        output.p(serialDesc, 1, self.has_server_url);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChatEvents$SafeguardsLearnMoreSurface getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHas_server_url() {
        return this.has_server_url;
    }

    public final ChatEvents$SafeguardsLearnMoreTapped copy(ChatEvents$SafeguardsLearnMoreSurface surface, boolean has_server_url) {
        surface.getClass();
        return new ChatEvents$SafeguardsLearnMoreTapped(surface, has_server_url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$SafeguardsLearnMoreTapped)) {
            return false;
        }
        ChatEvents$SafeguardsLearnMoreTapped chatEvents$SafeguardsLearnMoreTapped = (ChatEvents$SafeguardsLearnMoreTapped) other;
        return this.surface == chatEvents$SafeguardsLearnMoreTapped.surface && this.has_server_url == chatEvents$SafeguardsLearnMoreTapped.has_server_url;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.chat.safeguards_learn_more.tapped";
    }

    public final boolean getHas_server_url() {
        return this.has_server_url;
    }

    public final ChatEvents$SafeguardsLearnMoreSurface getSurface() {
        return this.surface;
    }

    public int hashCode() {
        return Boolean.hashCode(this.has_server_url) + (this.surface.hashCode() * 31);
    }

    public String toString() {
        return "SafeguardsLearnMoreTapped(surface=" + this.surface + ", has_server_url=" + this.has_server_url + ")";
    }

    public ChatEvents$SafeguardsLearnMoreTapped(ChatEvents$SafeguardsLearnMoreSurface chatEvents$SafeguardsLearnMoreSurface, boolean z) {
        chatEvents$SafeguardsLearnMoreSurface.getClass();
        this.surface = chatEvents$SafeguardsLearnMoreSurface;
        this.has_server_url = z;
    }
}
