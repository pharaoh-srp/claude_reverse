package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nb3;
import defpackage.ob3;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J2\u0010\u001b\u001a\u00020\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0014\u0010*\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0018¨\u0006."}, d2 = {"com/anthropic/claude/analytics/events/ChatSharingEvents$SharedChatViewFailed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "snapshot_uuid", "viewer_organization_uuid", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatSharingEvents$SharedChatViewFailed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatSharingEvents$SharedChatViewFailed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ChatSharingEvents$SharedChatViewFailed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSnapshot_uuid", "getViewer_organization_uuid", "getCause", "getEventName", "eventName", "Companion", "nb3", "ob3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatSharingEvents$SharedChatViewFailed implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final ob3 Companion = new ob3();
    private final String cause;
    private final String snapshot_uuid;
    private final String viewer_organization_uuid;

    public /* synthetic */ ChatSharingEvents$SharedChatViewFailed(int i, String str, String str2, String str3, vnf vnfVar) {
        if (4 != (i & 4)) {
            gvj.f(i, 4, nb3.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.snapshot_uuid = null;
        } else {
            this.snapshot_uuid = str;
        }
        if ((i & 2) == 0) {
            this.viewer_organization_uuid = null;
        } else {
            this.viewer_organization_uuid = str2;
        }
        this.cause = str3;
    }

    public static /* synthetic */ ChatSharingEvents$SharedChatViewFailed copy$default(ChatSharingEvents$SharedChatViewFailed chatSharingEvents$SharedChatViewFailed, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatSharingEvents$SharedChatViewFailed.snapshot_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatSharingEvents$SharedChatViewFailed.viewer_organization_uuid;
        }
        if ((i & 4) != 0) {
            str3 = chatSharingEvents$SharedChatViewFailed.cause;
        }
        return chatSharingEvents$SharedChatViewFailed.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatSharingEvents$SharedChatViewFailed self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.snapshot_uuid != null) {
            output.B(serialDesc, 0, srg.a, self.snapshot_uuid);
        }
        if (output.E(serialDesc) || self.viewer_organization_uuid != null) {
            output.B(serialDesc, 1, srg.a, self.viewer_organization_uuid);
        }
        output.q(serialDesc, 2, self.cause);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSnapshot_uuid() {
        return this.snapshot_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getViewer_organization_uuid() {
        return this.viewer_organization_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCause() {
        return this.cause;
    }

    public final ChatSharingEvents$SharedChatViewFailed copy(String snapshot_uuid, String viewer_organization_uuid, String cause) {
        cause.getClass();
        return new ChatSharingEvents$SharedChatViewFailed(snapshot_uuid, viewer_organization_uuid, cause);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatSharingEvents$SharedChatViewFailed)) {
            return false;
        }
        ChatSharingEvents$SharedChatViewFailed chatSharingEvents$SharedChatViewFailed = (ChatSharingEvents$SharedChatViewFailed) other;
        return x44.r(this.snapshot_uuid, chatSharingEvents$SharedChatViewFailed.snapshot_uuid) && x44.r(this.viewer_organization_uuid, chatSharingEvents$SharedChatViewFailed.viewer_organization_uuid) && x44.r(this.cause, chatSharingEvents$SharedChatViewFailed.cause);
    }

    public final String getCause() {
        return this.cause;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_shared_chat_view_failed";
    }

    public final String getSnapshot_uuid() {
        return this.snapshot_uuid;
    }

    public final String getViewer_organization_uuid() {
        return this.viewer_organization_uuid;
    }

    public int hashCode() {
        String str = this.snapshot_uuid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.viewer_organization_uuid;
        return this.cause.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.snapshot_uuid;
        String str2 = this.viewer_organization_uuid;
        return ij0.m(kgh.r("SharedChatViewFailed(snapshot_uuid=", str, ", viewer_organization_uuid=", str2, ", cause="), this.cause, ")");
    }

    public ChatSharingEvents$SharedChatViewFailed(String str, String str2, String str3) {
        str3.getClass();
        this.snapshot_uuid = str;
        this.viewer_organization_uuid = str2;
        this.cause = str3;
    }

    public /* synthetic */ ChatSharingEvents$SharedChatViewFailed(String str, String str2, String str3, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3);
    }
}
