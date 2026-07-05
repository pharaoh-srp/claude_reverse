package com.anthropic.claude.analytics.events;

import defpackage.e79;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pb3;
import defpackage.qb3;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ:\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b\b\u0010\u001fR\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001a¨\u00064"}, d2 = {"com/anthropic/claude/analytics/events/ChatSharingEvents$SharedChatViewed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "viewer_organization_uuid", "snapshot_uuid", "", "message_count", "", "is_public", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatSharingEvents$SharedChatViewed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatSharingEvents$SharedChatViewed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/anthropic/claude/analytics/events/ChatSharingEvents$SharedChatViewed;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getViewer_organization_uuid", "getSnapshot_uuid", "Ljava/lang/Integer;", "getMessage_count", "Z", "getEventName", "eventName", "Companion", "pb3", "qb3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatSharingEvents$SharedChatViewed implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final qb3 Companion = new qb3();
    private final boolean is_public;
    private final Integer message_count;
    private final String snapshot_uuid;
    private final String viewer_organization_uuid;

    public /* synthetic */ ChatSharingEvents$SharedChatViewed(int i, String str, String str2, Integer num, boolean z, vnf vnfVar) {
        if (11 != (i & 11)) {
            gvj.f(i, 11, pb3.a.getDescriptor());
            throw null;
        }
        this.viewer_organization_uuid = str;
        this.snapshot_uuid = str2;
        if ((i & 4) == 0) {
            this.message_count = null;
        } else {
            this.message_count = num;
        }
        this.is_public = z;
    }

    public static /* synthetic */ ChatSharingEvents$SharedChatViewed copy$default(ChatSharingEvents$SharedChatViewed chatSharingEvents$SharedChatViewed, String str, String str2, Integer num, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatSharingEvents$SharedChatViewed.viewer_organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatSharingEvents$SharedChatViewed.snapshot_uuid;
        }
        if ((i & 4) != 0) {
            num = chatSharingEvents$SharedChatViewed.message_count;
        }
        if ((i & 8) != 0) {
            z = chatSharingEvents$SharedChatViewed.is_public;
        }
        return chatSharingEvents$SharedChatViewed.copy(str, str2, num, z);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatSharingEvents$SharedChatViewed self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.viewer_organization_uuid);
        output.q(serialDesc, 1, self.snapshot_uuid);
        if (output.E(serialDesc) || self.message_count != null) {
            output.B(serialDesc, 2, e79.a, self.message_count);
        }
        output.p(serialDesc, 3, self.is_public);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getViewer_organization_uuid() {
        return this.viewer_organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSnapshot_uuid() {
        return this.snapshot_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMessage_count() {
        return this.message_count;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIs_public() {
        return this.is_public;
    }

    public final ChatSharingEvents$SharedChatViewed copy(String viewer_organization_uuid, String snapshot_uuid, Integer message_count, boolean is_public) {
        viewer_organization_uuid.getClass();
        snapshot_uuid.getClass();
        return new ChatSharingEvents$SharedChatViewed(viewer_organization_uuid, snapshot_uuid, message_count, is_public);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatSharingEvents$SharedChatViewed)) {
            return false;
        }
        ChatSharingEvents$SharedChatViewed chatSharingEvents$SharedChatViewed = (ChatSharingEvents$SharedChatViewed) other;
        return x44.r(this.viewer_organization_uuid, chatSharingEvents$SharedChatViewed.viewer_organization_uuid) && x44.r(this.snapshot_uuid, chatSharingEvents$SharedChatViewed.snapshot_uuid) && x44.r(this.message_count, chatSharingEvents$SharedChatViewed.message_count) && this.is_public == chatSharingEvents$SharedChatViewed.is_public;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_shared_chat_viewed";
    }

    public final Integer getMessage_count() {
        return this.message_count;
    }

    public final String getSnapshot_uuid() {
        return this.snapshot_uuid;
    }

    public final String getViewer_organization_uuid() {
        return this.viewer_organization_uuid;
    }

    public int hashCode() {
        int iL = kgh.l(this.viewer_organization_uuid.hashCode() * 31, 31, this.snapshot_uuid);
        Integer num = this.message_count;
        return Boolean.hashCode(this.is_public) + ((iL + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final boolean is_public() {
        return this.is_public;
    }

    public String toString() {
        String str = this.viewer_organization_uuid;
        String str2 = this.snapshot_uuid;
        Integer num = this.message_count;
        boolean z = this.is_public;
        StringBuilder sbR = kgh.r("SharedChatViewed(viewer_organization_uuid=", str, ", snapshot_uuid=", str2, ", message_count=");
        sbR.append(num);
        sbR.append(", is_public=");
        sbR.append(z);
        sbR.append(")");
        return sbR.toString();
    }

    public ChatSharingEvents$SharedChatViewed(String str, String str2, Integer num, boolean z) {
        str.getClass();
        str2.getClass();
        this.viewer_organization_uuid = str;
        this.snapshot_uuid = str2;
        this.message_count = num;
        this.is_public = z;
    }

    public /* synthetic */ ChatSharingEvents$SharedChatViewed(String str, String str2, Integer num, boolean z, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : num, z);
    }
}
