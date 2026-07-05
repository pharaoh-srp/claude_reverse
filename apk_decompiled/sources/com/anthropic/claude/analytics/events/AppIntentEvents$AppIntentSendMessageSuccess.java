package com.anthropic.claude.analytics.events;

import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qy1;
import defpackage.rj0;
import defpackage.sj0;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJB\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b.\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001aR\u0014\u00101\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u001a¨\u00065"}, d2 = {"com/anthropic/claude/analytics/events/AppIntentEvents$AppIntentSendMessageSuccess", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "", "message_length", "response_length", "app_intent_session_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentSendMessageSuccess;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentSendMessageSuccess;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentSendMessageSuccess;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "I", "getMessage_length", "getResponse_length", "getApp_intent_session_id", "getEventName", "eventName", "Companion", "rj0", "sj0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AppIntentEvents$AppIntentSendMessageSuccess implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final sj0 Companion = new sj0();
    private final String app_intent_session_id;
    private final String conversation_uuid;
    private final int message_length;
    private final String organization_uuid;
    private final int response_length;

    public /* synthetic */ AppIntentEvents$AppIntentSendMessageSuccess(int i, String str, String str2, int i2, int i3, String str3, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, rj0.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.message_length = i2;
        this.response_length = i3;
        this.app_intent_session_id = str3;
    }

    public static /* synthetic */ AppIntentEvents$AppIntentSendMessageSuccess copy$default(AppIntentEvents$AppIntentSendMessageSuccess appIntentEvents$AppIntentSendMessageSuccess, String str, String str2, int i, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = appIntentEvents$AppIntentSendMessageSuccess.organization_uuid;
        }
        if ((i3 & 2) != 0) {
            str2 = appIntentEvents$AppIntentSendMessageSuccess.conversation_uuid;
        }
        if ((i3 & 4) != 0) {
            i = appIntentEvents$AppIntentSendMessageSuccess.message_length;
        }
        if ((i3 & 8) != 0) {
            i2 = appIntentEvents$AppIntentSendMessageSuccess.response_length;
        }
        if ((i3 & 16) != 0) {
            str3 = appIntentEvents$AppIntentSendMessageSuccess.app_intent_session_id;
        }
        String str4 = str3;
        int i4 = i;
        return appIntentEvents$AppIntentSendMessageSuccess.copy(str, str2, i4, i2, str4);
    }

    public static final /* synthetic */ void write$Self$analytics(AppIntentEvents$AppIntentSendMessageSuccess self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.l(2, self.message_length, serialDesc);
        output.l(3, self.response_length, serialDesc);
        output.q(serialDesc, 4, self.app_intent_session_id);
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
    public final int getMessage_length() {
        return this.message_length;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getResponse_length() {
        return this.response_length;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getApp_intent_session_id() {
        return this.app_intent_session_id;
    }

    public final AppIntentEvents$AppIntentSendMessageSuccess copy(String organization_uuid, String conversation_uuid, int message_length, int response_length, String app_intent_session_id) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        app_intent_session_id.getClass();
        return new AppIntentEvents$AppIntentSendMessageSuccess(organization_uuid, conversation_uuid, message_length, response_length, app_intent_session_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppIntentEvents$AppIntentSendMessageSuccess)) {
            return false;
        }
        AppIntentEvents$AppIntentSendMessageSuccess appIntentEvents$AppIntentSendMessageSuccess = (AppIntentEvents$AppIntentSendMessageSuccess) other;
        return x44.r(this.organization_uuid, appIntentEvents$AppIntentSendMessageSuccess.organization_uuid) && x44.r(this.conversation_uuid, appIntentEvents$AppIntentSendMessageSuccess.conversation_uuid) && this.message_length == appIntentEvents$AppIntentSendMessageSuccess.message_length && this.response_length == appIntentEvents$AppIntentSendMessageSuccess.response_length && x44.r(this.app_intent_session_id, appIntentEvents$AppIntentSendMessageSuccess.app_intent_session_id);
    }

    public final String getApp_intent_session_id() {
        return this.app_intent_session_id;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_app_intent_send_message_success";
    }

    public final int getMessage_length() {
        return this.message_length;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final int getResponse_length() {
        return this.response_length;
    }

    public int hashCode() {
        return this.app_intent_session_id.hashCode() + vb7.c(this.response_length, vb7.c(this.message_length, kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31), 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        int i = this.message_length;
        int i2 = this.response_length;
        String str3 = this.app_intent_session_id;
        StringBuilder sbR = kgh.r("AppIntentSendMessageSuccess(organization_uuid=", str, ", conversation_uuid=", str2, ", message_length=");
        qy1.k(i, i2, ", response_length=", ", app_intent_session_id=", sbR);
        return ij0.m(sbR, str3, ")");
    }

    public AppIntentEvents$AppIntentSendMessageSuccess(String str, String str2, int i, int i2, String str3) {
        grc.B(str, str2, str3);
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.message_length = i;
        this.response_length = i2;
        this.app_intent_session_id = str3;
    }
}
