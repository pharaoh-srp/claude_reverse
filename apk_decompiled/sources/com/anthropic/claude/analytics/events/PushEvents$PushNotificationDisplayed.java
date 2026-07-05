package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nyd;
import defpackage.onf;
import defpackage.oyd;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJH\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001a¨\u00064"}, d2 = {"com/anthropic/claude/analytics/events/PushEvents$PushNotificationDisplayed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "account_uuid", "feature_category", "session_id", "conversation_uuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/PushEvents$PushNotificationDisplayed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/PushEvents$PushNotificationDisplayed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/PushEvents$PushNotificationDisplayed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getAccount_uuid", "getFeature_category", "getSession_id", "getConversation_uuid", "getEventName", "eventName", "Companion", "nyd", "oyd", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PushEvents$PushNotificationDisplayed implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final oyd Companion = new oyd();
    private final String account_uuid;
    private final String conversation_uuid;
    private final String feature_category;
    private final String organization_uuid;
    private final String session_id;

    public /* synthetic */ PushEvents$PushNotificationDisplayed(int i, String str, String str2, String str3, String str4, String str5, vnf vnfVar) {
        if (5 != (i & 5)) {
            gvj.f(i, 5, nyd.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        if ((i & 2) == 0) {
            this.account_uuid = null;
        } else {
            this.account_uuid = str2;
        }
        this.feature_category = str3;
        if ((i & 8) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str4;
        }
        if ((i & 16) == 0) {
            this.conversation_uuid = null;
        } else {
            this.conversation_uuid = str5;
        }
    }

    public static /* synthetic */ PushEvents$PushNotificationDisplayed copy$default(PushEvents$PushNotificationDisplayed pushEvents$PushNotificationDisplayed, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushEvents$PushNotificationDisplayed.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = pushEvents$PushNotificationDisplayed.account_uuid;
        }
        if ((i & 4) != 0) {
            str3 = pushEvents$PushNotificationDisplayed.feature_category;
        }
        if ((i & 8) != 0) {
            str4 = pushEvents$PushNotificationDisplayed.session_id;
        }
        if ((i & 16) != 0) {
            str5 = pushEvents$PushNotificationDisplayed.conversation_uuid;
        }
        String str6 = str5;
        String str7 = str3;
        return pushEvents$PushNotificationDisplayed.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$analytics(PushEvents$PushNotificationDisplayed self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        if (output.E(serialDesc) || self.account_uuid != null) {
            output.B(serialDesc, 1, srg.a, self.account_uuid);
        }
        output.q(serialDesc, 2, self.feature_category);
        if (output.E(serialDesc) || self.session_id != null) {
            output.B(serialDesc, 3, srg.a, self.session_id);
        }
        if (!output.E(serialDesc) && self.conversation_uuid == null) {
            return;
        }
        output.B(serialDesc, 4, srg.a, self.conversation_uuid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccount_uuid() {
        return this.account_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFeature_category() {
        return this.feature_category;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final PushEvents$PushNotificationDisplayed copy(String organization_uuid, String account_uuid, String feature_category, String session_id, String conversation_uuid) {
        organization_uuid.getClass();
        feature_category.getClass();
        return new PushEvents$PushNotificationDisplayed(organization_uuid, account_uuid, feature_category, session_id, conversation_uuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushEvents$PushNotificationDisplayed)) {
            return false;
        }
        PushEvents$PushNotificationDisplayed pushEvents$PushNotificationDisplayed = (PushEvents$PushNotificationDisplayed) other;
        return x44.r(this.organization_uuid, pushEvents$PushNotificationDisplayed.organization_uuid) && x44.r(this.account_uuid, pushEvents$PushNotificationDisplayed.account_uuid) && x44.r(this.feature_category, pushEvents$PushNotificationDisplayed.feature_category) && x44.r(this.session_id, pushEvents$PushNotificationDisplayed.session_id) && x44.r(this.conversation_uuid, pushEvents$PushNotificationDisplayed.conversation_uuid);
    }

    public final String getAccount_uuid() {
        return this.account_uuid;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.push.notification_displayed";
    }

    public final String getFeature_category() {
        return this.feature_category;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        int iHashCode = this.organization_uuid.hashCode() * 31;
        String str = this.account_uuid;
        int iL = kgh.l((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.feature_category);
        String str2 = this.session_id;
        int iHashCode2 = (iL + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.conversation_uuid;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.account_uuid;
        String str3 = this.feature_category;
        String str4 = this.session_id;
        String str5 = this.conversation_uuid;
        StringBuilder sbR = kgh.r("PushNotificationDisplayed(organization_uuid=", str, ", account_uuid=", str2, ", feature_category=");
        kgh.u(sbR, str3, ", session_id=", str4, ", conversation_uuid=");
        return ij0.m(sbR, str5, ")");
    }

    public PushEvents$PushNotificationDisplayed(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str3.getClass();
        this.organization_uuid = str;
        this.account_uuid = str2;
        this.feature_category = str3;
        this.session_id = str4;
        this.conversation_uuid = str5;
    }

    public /* synthetic */ PushEvents$PushNotificationDisplayed(String str, String str2, String str3, String str4, String str5, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
