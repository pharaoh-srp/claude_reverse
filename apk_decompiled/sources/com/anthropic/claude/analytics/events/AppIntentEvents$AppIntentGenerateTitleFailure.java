package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.jj0;
import defpackage.kgh;
import defpackage.kj0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J8\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u0014\u0010-\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0019¨\u00061"}, d2 = {"com/anthropic/claude/analytics/events/AppIntentEvents$AppIntentGenerateTitleFailure", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "error_type", "app_intent_session_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentGenerateTitleFailure;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentGenerateTitleFailure;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentGenerateTitleFailure;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getError_type", "getApp_intent_session_id", "getEventName", "eventName", "Companion", "jj0", "kj0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AppIntentEvents$AppIntentGenerateTitleFailure implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final kj0 Companion = new kj0();
    private final String app_intent_session_id;
    private final String conversation_uuid;
    private final String error_type;
    private final String organization_uuid;

    public /* synthetic */ AppIntentEvents$AppIntentGenerateTitleFailure(int i, String str, String str2, String str3, String str4, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, jj0.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.error_type = str3;
        this.app_intent_session_id = str4;
    }

    public static /* synthetic */ AppIntentEvents$AppIntentGenerateTitleFailure copy$default(AppIntentEvents$AppIntentGenerateTitleFailure appIntentEvents$AppIntentGenerateTitleFailure, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appIntentEvents$AppIntentGenerateTitleFailure.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = appIntentEvents$AppIntentGenerateTitleFailure.conversation_uuid;
        }
        if ((i & 4) != 0) {
            str3 = appIntentEvents$AppIntentGenerateTitleFailure.error_type;
        }
        if ((i & 8) != 0) {
            str4 = appIntentEvents$AppIntentGenerateTitleFailure.app_intent_session_id;
        }
        return appIntentEvents$AppIntentGenerateTitleFailure.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$analytics(AppIntentEvents$AppIntentGenerateTitleFailure self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.error_type);
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
    public final String getError_type() {
        return this.error_type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApp_intent_session_id() {
        return this.app_intent_session_id;
    }

    public final AppIntentEvents$AppIntentGenerateTitleFailure copy(String organization_uuid, String conversation_uuid, String error_type, String app_intent_session_id) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        error_type.getClass();
        app_intent_session_id.getClass();
        return new AppIntentEvents$AppIntentGenerateTitleFailure(organization_uuid, conversation_uuid, error_type, app_intent_session_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppIntentEvents$AppIntentGenerateTitleFailure)) {
            return false;
        }
        AppIntentEvents$AppIntentGenerateTitleFailure appIntentEvents$AppIntentGenerateTitleFailure = (AppIntentEvents$AppIntentGenerateTitleFailure) other;
        return x44.r(this.organization_uuid, appIntentEvents$AppIntentGenerateTitleFailure.organization_uuid) && x44.r(this.conversation_uuid, appIntentEvents$AppIntentGenerateTitleFailure.conversation_uuid) && x44.r(this.error_type, appIntentEvents$AppIntentGenerateTitleFailure.error_type) && x44.r(this.app_intent_session_id, appIntentEvents$AppIntentGenerateTitleFailure.app_intent_session_id);
    }

    public final String getApp_intent_session_id() {
        return this.app_intent_session_id;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final String getError_type() {
        return this.error_type;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_app_intent_generate_title_failure";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public int hashCode() {
        return this.app_intent_session_id.hashCode() + kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.error_type);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        return vb7.t(kgh.r("AppIntentGenerateTitleFailure(organization_uuid=", str, ", conversation_uuid=", str2, ", error_type="), this.error_type, ", app_intent_session_id=", this.app_intent_session_id, ")");
    }

    public AppIntentEvents$AppIntentGenerateTitleFailure(String str, String str2, String str3, String str4) {
        ij0.z(str, str2, str3, str4);
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.error_type = str3;
        this.app_intent_session_id = str4;
    }
}
