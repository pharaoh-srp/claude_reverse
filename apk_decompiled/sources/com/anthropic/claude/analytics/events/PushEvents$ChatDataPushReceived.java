package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.uxd;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vxd;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 JH\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b\b\u0010 R\u0014\u00101\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u001b¨\u00065"}, d2 = {"com/anthropic/claude/analytics/events/PushEvents$ChatDataPushReceived", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "account_uuid", "conversation_uuid", "feature_category", "", "is_unknown_account", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/PushEvents$ChatDataPushReceived;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/PushEvents$ChatDataPushReceived;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/analytics/events/PushEvents$ChatDataPushReceived;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getAccount_uuid", "getConversation_uuid", "getFeature_category", "Ljava/lang/Boolean;", "getEventName", "eventName", "Companion", "uxd", "vxd", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PushEvents$ChatDataPushReceived implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final vxd Companion = new vxd();
    private final String account_uuid;
    private final String conversation_uuid;
    private final String feature_category;
    private final Boolean is_unknown_account;
    private final String organization_uuid;

    public /* synthetic */ PushEvents$ChatDataPushReceived(int i, String str, String str2, String str3, String str4, Boolean bool, vnf vnfVar) {
        if (9 != (i & 9)) {
            gvj.f(i, 9, uxd.a.getDescriptor());
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
        if ((i & 16) == 0) {
            this.is_unknown_account = null;
        } else {
            this.is_unknown_account = bool;
        }
    }

    public static /* synthetic */ PushEvents$ChatDataPushReceived copy$default(PushEvents$ChatDataPushReceived pushEvents$ChatDataPushReceived, String str, String str2, String str3, String str4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushEvents$ChatDataPushReceived.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = pushEvents$ChatDataPushReceived.account_uuid;
        }
        if ((i & 4) != 0) {
            str3 = pushEvents$ChatDataPushReceived.conversation_uuid;
        }
        if ((i & 8) != 0) {
            str4 = pushEvents$ChatDataPushReceived.feature_category;
        }
        if ((i & 16) != 0) {
            bool = pushEvents$ChatDataPushReceived.is_unknown_account;
        }
        Boolean bool2 = bool;
        String str5 = str3;
        return pushEvents$ChatDataPushReceived.copy(str, str2, str5, str4, bool2);
    }

    public static final /* synthetic */ void write$Self$analytics(PushEvents$ChatDataPushReceived self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        if (output.E(serialDesc) || self.account_uuid != null) {
            output.B(serialDesc, 1, srg.a, self.account_uuid);
        }
        if (output.E(serialDesc) || self.conversation_uuid != null) {
            output.B(serialDesc, 2, srg.a, self.conversation_uuid);
        }
        output.q(serialDesc, 3, self.feature_category);
        if (!output.E(serialDesc) && self.is_unknown_account == null) {
            return;
        }
        output.B(serialDesc, 4, zt1.a, self.is_unknown_account);
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

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIs_unknown_account() {
        return this.is_unknown_account;
    }

    public final PushEvents$ChatDataPushReceived copy(String organization_uuid, String account_uuid, String conversation_uuid, String feature_category, Boolean is_unknown_account) {
        organization_uuid.getClass();
        feature_category.getClass();
        return new PushEvents$ChatDataPushReceived(organization_uuid, account_uuid, conversation_uuid, feature_category, is_unknown_account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushEvents$ChatDataPushReceived)) {
            return false;
        }
        PushEvents$ChatDataPushReceived pushEvents$ChatDataPushReceived = (PushEvents$ChatDataPushReceived) other;
        return x44.r(this.organization_uuid, pushEvents$ChatDataPushReceived.organization_uuid) && x44.r(this.account_uuid, pushEvents$ChatDataPushReceived.account_uuid) && x44.r(this.conversation_uuid, pushEvents$ChatDataPushReceived.conversation_uuid) && x44.r(this.feature_category, pushEvents$ChatDataPushReceived.feature_category) && x44.r(this.is_unknown_account, pushEvents$ChatDataPushReceived.is_unknown_account);
    }

    public final String getAccount_uuid() {
        return this.account_uuid;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.push.chat_data_push_received";
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
        int iL = kgh.l((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.feature_category);
        Boolean bool = this.is_unknown_account;
        return iL + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean is_unknown_account() {
        return this.is_unknown_account;
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.account_uuid;
        String str3 = this.conversation_uuid;
        String str4 = this.feature_category;
        Boolean bool = this.is_unknown_account;
        StringBuilder sbR = kgh.r("ChatDataPushReceived(organization_uuid=", str, ", account_uuid=", str2, ", conversation_uuid=");
        kgh.u(sbR, str3, ", feature_category=", str4, ", is_unknown_account=");
        return qy1.h(sbR, bool, ")");
    }

    public PushEvents$ChatDataPushReceived(String str, String str2, String str3, String str4, Boolean bool) {
        str.getClass();
        str4.getClass();
        this.organization_uuid = str;
        this.account_uuid = str2;
        this.conversation_uuid = str3;
        this.feature_category = str4;
        this.is_unknown_account = bool;
    }

    public /* synthetic */ PushEvents$ChatDataPushReceived(String str, String str2, String str3, String str4, Boolean bool, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : bool);
    }
}
