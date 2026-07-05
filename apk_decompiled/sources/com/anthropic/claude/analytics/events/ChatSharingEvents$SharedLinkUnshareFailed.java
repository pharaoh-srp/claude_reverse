package com.anthropic.claude.analytics.events;

import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.rb3;
import defpackage.sb3;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J.\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0014\u0010*\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0018¨\u0006."}, d2 = {"com/anthropic/claude/analytics/events/ChatSharingEvents$SharedLinkUnshareFailed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "snapshot_uuid", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatSharingEvents$SharedLinkUnshareFailed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatSharingEvents$SharedLinkUnshareFailed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ChatSharingEvents$SharedLinkUnshareFailed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getSnapshot_uuid", "getCause", "getEventName", "eventName", "Companion", "rb3", "sb3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatSharingEvents$SharedLinkUnshareFailed implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final sb3 Companion = new sb3();
    private final String cause;
    private final String organization_uuid;
    private final String snapshot_uuid;

    public /* synthetic */ ChatSharingEvents$SharedLinkUnshareFailed(int i, String str, String str2, String str3, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, rb3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.snapshot_uuid = str2;
        this.cause = str3;
    }

    public static /* synthetic */ ChatSharingEvents$SharedLinkUnshareFailed copy$default(ChatSharingEvents$SharedLinkUnshareFailed chatSharingEvents$SharedLinkUnshareFailed, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatSharingEvents$SharedLinkUnshareFailed.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatSharingEvents$SharedLinkUnshareFailed.snapshot_uuid;
        }
        if ((i & 4) != 0) {
            str3 = chatSharingEvents$SharedLinkUnshareFailed.cause;
        }
        return chatSharingEvents$SharedLinkUnshareFailed.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatSharingEvents$SharedLinkUnshareFailed self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.snapshot_uuid);
        output.q(serialDesc, 2, self.cause);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSnapshot_uuid() {
        return this.snapshot_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCause() {
        return this.cause;
    }

    public final ChatSharingEvents$SharedLinkUnshareFailed copy(String organization_uuid, String snapshot_uuid, String cause) {
        organization_uuid.getClass();
        snapshot_uuid.getClass();
        cause.getClass();
        return new ChatSharingEvents$SharedLinkUnshareFailed(organization_uuid, snapshot_uuid, cause);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatSharingEvents$SharedLinkUnshareFailed)) {
            return false;
        }
        ChatSharingEvents$SharedLinkUnshareFailed chatSharingEvents$SharedLinkUnshareFailed = (ChatSharingEvents$SharedLinkUnshareFailed) other;
        return x44.r(this.organization_uuid, chatSharingEvents$SharedLinkUnshareFailed.organization_uuid) && x44.r(this.snapshot_uuid, chatSharingEvents$SharedLinkUnshareFailed.snapshot_uuid) && x44.r(this.cause, chatSharingEvents$SharedLinkUnshareFailed.cause);
    }

    public final String getCause() {
        return this.cause;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_shared_link_unshare_failed";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getSnapshot_uuid() {
        return this.snapshot_uuid;
    }

    public int hashCode() {
        return this.cause.hashCode() + kgh.l(this.organization_uuid.hashCode() * 31, 31, this.snapshot_uuid);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.snapshot_uuid;
        return ij0.m(kgh.r("SharedLinkUnshareFailed(organization_uuid=", str, ", snapshot_uuid=", str2, ", cause="), this.cause, ")");
    }

    public ChatSharingEvents$SharedLinkUnshareFailed(String str, String str2, String str3) {
        grc.B(str, str2, str3);
        this.organization_uuid = str;
        this.snapshot_uuid = str2;
        this.cause = str3;
    }
}
