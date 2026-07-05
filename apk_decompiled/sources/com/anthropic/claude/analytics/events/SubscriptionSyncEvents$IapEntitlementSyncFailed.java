package com.anthropic.claude.analytics.events;

import defpackage.e79;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rwg;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJL\u0010 \u001a\u00020\u000f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001fR\u0014\u00102\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u001a¨\u00066"}, d2 = {"com/anthropic/claude/analytics/events/SubscriptionSyncEvents$IapEntitlementSyncFailed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "apple_original_transaction_id", "apple_product_id", "apple_app_account_token", "error_message", "", "sync_version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/SubscriptionSyncEvents$IapEntitlementSyncFailed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/SubscriptionSyncEvents$IapEntitlementSyncFailed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/anthropic/claude/analytics/events/SubscriptionSyncEvents$IapEntitlementSyncFailed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApple_original_transaction_id", "getApple_product_id", "getApple_app_account_token", "getError_message", "Ljava/lang/Integer;", "getSync_version", "getEventName", "eventName", "Companion", "qwg", "rwg", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SubscriptionSyncEvents$IapEntitlementSyncFailed implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final rwg Companion = new rwg();
    private final String apple_app_account_token;
    private final String apple_original_transaction_id;
    private final String apple_product_id;
    private final String error_message;
    private final Integer sync_version;

    public /* synthetic */ SubscriptionSyncEvents$IapEntitlementSyncFailed(int i, String str, String str2, String str3, String str4, Integer num, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.apple_original_transaction_id = null;
        } else {
            this.apple_original_transaction_id = str;
        }
        if ((i & 2) == 0) {
            this.apple_product_id = null;
        } else {
            this.apple_product_id = str2;
        }
        if ((i & 4) == 0) {
            this.apple_app_account_token = null;
        } else {
            this.apple_app_account_token = str3;
        }
        if ((i & 8) == 0) {
            this.error_message = null;
        } else {
            this.error_message = str4;
        }
        if ((i & 16) == 0) {
            this.sync_version = null;
        } else {
            this.sync_version = num;
        }
    }

    public static /* synthetic */ SubscriptionSyncEvents$IapEntitlementSyncFailed copy$default(SubscriptionSyncEvents$IapEntitlementSyncFailed subscriptionSyncEvents$IapEntitlementSyncFailed, String str, String str2, String str3, String str4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionSyncEvents$IapEntitlementSyncFailed.apple_original_transaction_id;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionSyncEvents$IapEntitlementSyncFailed.apple_product_id;
        }
        if ((i & 4) != 0) {
            str3 = subscriptionSyncEvents$IapEntitlementSyncFailed.apple_app_account_token;
        }
        if ((i & 8) != 0) {
            str4 = subscriptionSyncEvents$IapEntitlementSyncFailed.error_message;
        }
        if ((i & 16) != 0) {
            num = subscriptionSyncEvents$IapEntitlementSyncFailed.sync_version;
        }
        Integer num2 = num;
        String str5 = str3;
        return subscriptionSyncEvents$IapEntitlementSyncFailed.copy(str, str2, str5, str4, num2);
    }

    public static final /* synthetic */ void write$Self$analytics(SubscriptionSyncEvents$IapEntitlementSyncFailed self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.apple_original_transaction_id != null) {
            output.B(serialDesc, 0, srg.a, self.apple_original_transaction_id);
        }
        if (output.E(serialDesc) || self.apple_product_id != null) {
            output.B(serialDesc, 1, srg.a, self.apple_product_id);
        }
        if (output.E(serialDesc) || self.apple_app_account_token != null) {
            output.B(serialDesc, 2, srg.a, self.apple_app_account_token);
        }
        if (output.E(serialDesc) || self.error_message != null) {
            output.B(serialDesc, 3, srg.a, self.error_message);
        }
        if (!output.E(serialDesc) && self.sync_version == null) {
            return;
        }
        output.B(serialDesc, 4, e79.a, self.sync_version);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApple_original_transaction_id() {
        return this.apple_original_transaction_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApple_product_id() {
        return this.apple_product_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApple_app_account_token() {
        return this.apple_app_account_token;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getError_message() {
        return this.error_message;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getSync_version() {
        return this.sync_version;
    }

    public final SubscriptionSyncEvents$IapEntitlementSyncFailed copy(String apple_original_transaction_id, String apple_product_id, String apple_app_account_token, String error_message, Integer sync_version) {
        return new SubscriptionSyncEvents$IapEntitlementSyncFailed(apple_original_transaction_id, apple_product_id, apple_app_account_token, error_message, sync_version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionSyncEvents$IapEntitlementSyncFailed)) {
            return false;
        }
        SubscriptionSyncEvents$IapEntitlementSyncFailed subscriptionSyncEvents$IapEntitlementSyncFailed = (SubscriptionSyncEvents$IapEntitlementSyncFailed) other;
        return x44.r(this.apple_original_transaction_id, subscriptionSyncEvents$IapEntitlementSyncFailed.apple_original_transaction_id) && x44.r(this.apple_product_id, subscriptionSyncEvents$IapEntitlementSyncFailed.apple_product_id) && x44.r(this.apple_app_account_token, subscriptionSyncEvents$IapEntitlementSyncFailed.apple_app_account_token) && x44.r(this.error_message, subscriptionSyncEvents$IapEntitlementSyncFailed.error_message) && x44.r(this.sync_version, subscriptionSyncEvents$IapEntitlementSyncFailed.sync_version);
    }

    public final String getApple_app_account_token() {
        return this.apple_app_account_token;
    }

    public final String getApple_original_transaction_id() {
        return this.apple_original_transaction_id;
    }

    public final String getApple_product_id() {
        return this.apple_product_id;
    }

    public final String getError_message() {
        return this.error_message;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.iap.entitlement.sync_failed";
    }

    public final Integer getSync_version() {
        return this.sync_version;
    }

    public int hashCode() {
        String str = this.apple_original_transaction_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.apple_product_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.apple_app_account_token;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.error_message;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.sync_version;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.apple_original_transaction_id;
        String str2 = this.apple_product_id;
        String str3 = this.apple_app_account_token;
        String str4 = this.error_message;
        Integer num = this.sync_version;
        StringBuilder sbR = kgh.r("IapEntitlementSyncFailed(apple_original_transaction_id=", str, ", apple_product_id=", str2, ", apple_app_account_token=");
        kgh.u(sbR, str3, ", error_message=", str4, ", sync_version=");
        sbR.append(num);
        sbR.append(")");
        return sbR.toString();
    }

    public SubscriptionSyncEvents$IapEntitlementSyncFailed() {
        this((String) null, (String) null, (String) null, (String) null, (Integer) null, 31, (mq5) null);
    }

    public SubscriptionSyncEvents$IapEntitlementSyncFailed(String str, String str2, String str3, String str4, Integer num) {
        this.apple_original_transaction_id = str;
        this.apple_product_id = str2;
        this.apple_app_account_token = str3;
        this.error_message = str4;
        this.sync_version = num;
    }

    public /* synthetic */ SubscriptionSyncEvents$IapEntitlementSyncFailed(String str, String str2, String str3, String str4, Integer num, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num);
    }
}
