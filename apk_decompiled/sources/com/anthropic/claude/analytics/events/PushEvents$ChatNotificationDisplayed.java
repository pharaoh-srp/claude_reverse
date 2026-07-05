package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.yxd;
import defpackage.zxd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J<\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u0014\u0010-\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0019¨\u00061"}, d2 = {"com/anthropic/claude/analytics/events/PushEvents$ChatNotificationDisplayed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "account_uuid", "conversation_uuid", "feature_category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/PushEvents$ChatNotificationDisplayed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/PushEvents$ChatNotificationDisplayed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/PushEvents$ChatNotificationDisplayed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getAccount_uuid", "getConversation_uuid", "getFeature_category", "getEventName", "eventName", "Companion", "yxd", "zxd", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PushEvents$ChatNotificationDisplayed implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final zxd Companion = new zxd();
    private final String account_uuid;
    private final String conversation_uuid;
    private final String feature_category;
    private final String organization_uuid;

    public /* synthetic */ PushEvents$ChatNotificationDisplayed(int i, String str, String str2, String str3, String str4, vnf vnfVar) {
        if (9 != (i & 9)) {
            gvj.f(i, 9, yxd.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        if ((i & 2) == 0) {
            this.account_uuid = null;
        } else {
            this.account_uuid = str2;
        }
        if ((i & 4) == 0) {
            this.conversation_uuid = null;
        } else {
            this.conversation_uuid = str3;
        }
        this.feature_category = str4;
    }

    public static /* synthetic */ PushEvents$ChatNotificationDisplayed copy$default(PushEvents$ChatNotificationDisplayed pushEvents$ChatNotificationDisplayed, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushEvents$ChatNotificationDisplayed.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = pushEvents$ChatNotificationDisplayed.account_uuid;
        }
        if ((i & 4) != 0) {
            str3 = pushEvents$ChatNotificationDisplayed.conversation_uuid;
        }
        if ((i & 8) != 0) {
            str4 = pushEvents$ChatNotificationDisplayed.feature_category;
        }
        return pushEvents$ChatNotificationDisplayed.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$analytics(PushEvents$ChatNotificationDisplayed self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        if (output.E(serialDesc) || self.account_uuid != null) {
            output.B(serialDesc, 1, srg.a, self.account_uuid);
        }
        if (output.E(serialDesc) || self.conversation_uuid != null) {
            output.B(serialDesc, 2, srg.a, self.conversation_uuid);
        }
        output.q(serialDesc, 3, self.feature_category);
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
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFeature_category() {
        return this.feature_category;
    }

    public final PushEvents$ChatNotificationDisplayed copy(String organization_uuid, String account_uuid, String conversation_uuid, String feature_category) {
        organization_uuid.getClass();
        feature_category.getClass();
        return new PushEvents$ChatNotificationDisplayed(organization_uuid, account_uuid, conversation_uuid, feature_category);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushEvents$ChatNotificationDisplayed)) {
            return false;
        }
        PushEvents$ChatNotificationDisplayed pushEvents$ChatNotificationDisplayed = (PushEvents$ChatNotificationDisplayed) other;
        return x44.r(this.organization_uuid, pushEvents$ChatNotificationDisplayed.organization_uuid) && x44.r(this.account_uuid, pushEvents$ChatNotificationDisplayed.account_uuid) && x44.r(this.conversation_uuid, pushEvents$ChatNotificationDisplayed.conversation_uuid) && x44.r(this.feature_category, pushEvents$ChatNotificationDisplayed.feature_category);
    }

    public final String getAccount_uuid() {
        return this.account_uuid;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.push.chat_notification_displayed";
    }

    public final String getFeature_category() {
        return this.feature_category;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public int hashCode() {
        int iHashCode = this.organization_uuid.hashCode() * 31;
        String str = this.account_uuid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.conversation_uuid;
        return this.feature_category.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.account_uuid;
        return vb7.t(kgh.r("ChatNotificationDisplayed(organization_uuid=", str, ", account_uuid=", str2, ", conversation_uuid="), this.conversation_uuid, ", feature_category=", this.feature_category, ")");
    }

    public PushEvents$ChatNotificationDisplayed(String str, String str2, String str3, String str4) {
        str.getClass();
        str4.getClass();
        this.organization_uuid = str;
        this.account_uuid = str2;
        this.conversation_uuid = str3;
        this.feature_category = str4;
    }

    public /* synthetic */ PushEvents$ChatNotificationDisplayed(String str, String str2, String str3, String str4, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4);
    }
}
