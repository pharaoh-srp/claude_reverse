package com.anthropic.claude.analytics.events;

import defpackage.grc;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.pj0;
import defpackage.qj0;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J8\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019R\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0019¨\u00062"}, d2 = {"com/anthropic/claude/analytics/events/AppIntentEvents$AppIntentSendMessageStart", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "", "message_length", "app_intent_session_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentSendMessageStart;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentSendMessageStart;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentSendMessageStart;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "I", "getMessage_length", "getApp_intent_session_id", "getEventName", "eventName", "Companion", "pj0", "qj0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AppIntentEvents$AppIntentSendMessageStart implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final qj0 Companion = new qj0();
    private final String app_intent_session_id;
    private final String conversation_uuid;
    private final int message_length;
    private final String organization_uuid;

    public /* synthetic */ AppIntentEvents$AppIntentSendMessageStart(int i, String str, String str2, int i2, String str3, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, pj0.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.message_length = i2;
        this.app_intent_session_id = str3;
    }

    public static /* synthetic */ AppIntentEvents$AppIntentSendMessageStart copy$default(AppIntentEvents$AppIntentSendMessageStart appIntentEvents$AppIntentSendMessageStart, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = appIntentEvents$AppIntentSendMessageStart.organization_uuid;
        }
        if ((i2 & 2) != 0) {
            str2 = appIntentEvents$AppIntentSendMessageStart.conversation_uuid;
        }
        if ((i2 & 4) != 0) {
            i = appIntentEvents$AppIntentSendMessageStart.message_length;
        }
        if ((i2 & 8) != 0) {
            str3 = appIntentEvents$AppIntentSendMessageStart.app_intent_session_id;
        }
        return appIntentEvents$AppIntentSendMessageStart.copy(str, str2, i, str3);
    }

    public static final /* synthetic */ void write$Self$analytics(AppIntentEvents$AppIntentSendMessageStart self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.l(2, self.message_length, serialDesc);
        output.q(serialDesc, 3, self.app_intent_session_id);
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
    public final String getApp_intent_session_id() {
        return this.app_intent_session_id;
    }

    public final AppIntentEvents$AppIntentSendMessageStart copy(String organization_uuid, String conversation_uuid, int message_length, String app_intent_session_id) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        app_intent_session_id.getClass();
        return new AppIntentEvents$AppIntentSendMessageStart(organization_uuid, conversation_uuid, message_length, app_intent_session_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppIntentEvents$AppIntentSendMessageStart)) {
            return false;
        }
        AppIntentEvents$AppIntentSendMessageStart appIntentEvents$AppIntentSendMessageStart = (AppIntentEvents$AppIntentSendMessageStart) other;
        return x44.r(this.organization_uuid, appIntentEvents$AppIntentSendMessageStart.organization_uuid) && x44.r(this.conversation_uuid, appIntentEvents$AppIntentSendMessageStart.conversation_uuid) && this.message_length == appIntentEvents$AppIntentSendMessageStart.message_length && x44.r(this.app_intent_session_id, appIntentEvents$AppIntentSendMessageStart.app_intent_session_id);
    }

    public final String getApp_intent_session_id() {
        return this.app_intent_session_id;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_app_intent_send_message_start";
    }

    public final int getMessage_length() {
        return this.message_length;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public int hashCode() {
        return this.app_intent_session_id.hashCode() + vb7.c(this.message_length, kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        int i = this.message_length;
        String str3 = this.app_intent_session_id;
        StringBuilder sbR = kgh.r("AppIntentSendMessageStart(organization_uuid=", str, ", conversation_uuid=", str2, ", message_length=");
        sbR.append(i);
        sbR.append(", app_intent_session_id=");
        sbR.append(str3);
        sbR.append(")");
        return sbR.toString();
    }

    public AppIntentEvents$AppIntentSendMessageStart(String str, String str2, int i, String str3) {
        grc.B(str, str2, str3);
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.message_length = i;
        this.app_intent_session_id = str3;
    }
}
