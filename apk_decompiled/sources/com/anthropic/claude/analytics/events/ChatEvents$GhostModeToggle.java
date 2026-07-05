package com.anthropic.claude.analytics.events;

import defpackage.bp2;
import defpackage.cp2;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.sq6;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001cR\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0019¨\u00060"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$GhostModeToggle", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "", "enabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$GhostModeToggle;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$GhostModeToggle;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/anthropic/claude/analytics/events/ChatEvents$GhostModeToggle;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "Z", "getEnabled", "getEventName", "eventName", "Companion", "bp2", "cp2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$GhostModeToggle implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final cp2 Companion = new cp2();
    private final String conversation_uuid;
    private final boolean enabled;
    private final String organization_uuid;

    public /* synthetic */ ChatEvents$GhostModeToggle(int i, String str, String str2, boolean z, vnf vnfVar) {
        if (5 != (i & 5)) {
            gvj.f(i, 5, bp2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        if ((i & 2) == 0) {
            this.conversation_uuid = null;
        } else {
            this.conversation_uuid = str2;
        }
        this.enabled = z;
    }

    public static /* synthetic */ ChatEvents$GhostModeToggle copy$default(ChatEvents$GhostModeToggle chatEvents$GhostModeToggle, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatEvents$GhostModeToggle.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatEvents$GhostModeToggle.conversation_uuid;
        }
        if ((i & 4) != 0) {
            z = chatEvents$GhostModeToggle.enabled;
        }
        return chatEvents$GhostModeToggle.copy(str, str2, z);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$GhostModeToggle self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        if (output.E(serialDesc) || self.conversation_uuid != null) {
            output.B(serialDesc, 1, srg.a, self.conversation_uuid);
        }
        output.p(serialDesc, 2, self.enabled);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final ChatEvents$GhostModeToggle copy(String organization_uuid, String conversation_uuid, boolean enabled) {
        organization_uuid.getClass();
        return new ChatEvents$GhostModeToggle(organization_uuid, conversation_uuid, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$GhostModeToggle)) {
            return false;
        }
        ChatEvents$GhostModeToggle chatEvents$GhostModeToggle = (ChatEvents$GhostModeToggle) other;
        return x44.r(this.organization_uuid, chatEvents$GhostModeToggle.organization_uuid) && x44.r(this.conversation_uuid, chatEvents$GhostModeToggle.conversation_uuid) && this.enabled == chatEvents$GhostModeToggle.enabled;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "ghost_mode_toggle";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public int hashCode() {
        int iHashCode = this.organization_uuid.hashCode() * 31;
        String str = this.conversation_uuid;
        return Boolean.hashCode(this.enabled) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        return sq6.v(")", kgh.r("GhostModeToggle(organization_uuid=", str, ", conversation_uuid=", str2, ", enabled="), this.enabled);
    }

    public ChatEvents$GhostModeToggle(String str, String str2, boolean z) {
        str.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.enabled = z;
    }

    public /* synthetic */ ChatEvents$GhostModeToggle(String str, String str2, boolean z, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, z);
    }
}
