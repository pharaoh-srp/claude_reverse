package com.anthropic.claude.analytics.events;

import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xgd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJX\u0010!\u001a\u00020\u00102\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u001bR\u0014\u00103\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001b¨\u00067"}, d2 = {"com/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewRecordPurchaseError", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "apple_original_transaction_id", "apple_product_id", "apple_app_account_token", "error_message", "google_product_id", "google_base_plan_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewRecordPurchaseError;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewRecordPurchaseError;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewRecordPurchaseError;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApple_original_transaction_id", "getApple_product_id", "getApple_app_account_token", "getError_message", "getGoogle_product_id", "getGoogle_base_plan_id", "getEventName", "eventName", "Companion", "wgd", "xgd", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProUpsellEvents$StoreViewRecordPurchaseError implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final xgd Companion = new xgd();
    private final String apple_app_account_token;
    private final String apple_original_transaction_id;
    private final String apple_product_id;
    private final String error_message;
    private final String google_base_plan_id;
    private final String google_product_id;

    public /* synthetic */ ProUpsellEvents$StoreViewRecordPurchaseError(int i, String str, String str2, String str3, String str4, String str5, String str6, vnf vnfVar) {
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
            this.google_product_id = null;
        } else {
            this.google_product_id = str5;
        }
        if ((i & 32) == 0) {
            this.google_base_plan_id = null;
        } else {
            this.google_base_plan_id = str6;
        }
    }

    public static /* synthetic */ ProUpsellEvents$StoreViewRecordPurchaseError copy$default(ProUpsellEvents$StoreViewRecordPurchaseError proUpsellEvents$StoreViewRecordPurchaseError, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = proUpsellEvents$StoreViewRecordPurchaseError.apple_original_transaction_id;
        }
        if ((i & 2) != 0) {
            str2 = proUpsellEvents$StoreViewRecordPurchaseError.apple_product_id;
        }
        if ((i & 4) != 0) {
            str3 = proUpsellEvents$StoreViewRecordPurchaseError.apple_app_account_token;
        }
        if ((i & 8) != 0) {
            str4 = proUpsellEvents$StoreViewRecordPurchaseError.error_message;
        }
        if ((i & 16) != 0) {
            str5 = proUpsellEvents$StoreViewRecordPurchaseError.google_product_id;
        }
        if ((i & 32) != 0) {
            str6 = proUpsellEvents$StoreViewRecordPurchaseError.google_base_plan_id;
        }
        String str7 = str5;
        String str8 = str6;
        return proUpsellEvents$StoreViewRecordPurchaseError.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$analytics(ProUpsellEvents$StoreViewRecordPurchaseError self, vd4 output, SerialDescriptor serialDesc) {
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
        if (output.E(serialDesc) || self.google_product_id != null) {
            output.B(serialDesc, 4, srg.a, self.google_product_id);
        }
        if (!output.E(serialDesc) && self.google_base_plan_id == null) {
            return;
        }
        output.B(serialDesc, 5, srg.a, self.google_base_plan_id);
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
    public final String getGoogle_product_id() {
        return this.google_product_id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getGoogle_base_plan_id() {
        return this.google_base_plan_id;
    }

    public final ProUpsellEvents$StoreViewRecordPurchaseError copy(String apple_original_transaction_id, String apple_product_id, String apple_app_account_token, String error_message, String google_product_id, String google_base_plan_id) {
        return new ProUpsellEvents$StoreViewRecordPurchaseError(apple_original_transaction_id, apple_product_id, apple_app_account_token, error_message, google_product_id, google_base_plan_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProUpsellEvents$StoreViewRecordPurchaseError)) {
            return false;
        }
        ProUpsellEvents$StoreViewRecordPurchaseError proUpsellEvents$StoreViewRecordPurchaseError = (ProUpsellEvents$StoreViewRecordPurchaseError) other;
        return x44.r(this.apple_original_transaction_id, proUpsellEvents$StoreViewRecordPurchaseError.apple_original_transaction_id) && x44.r(this.apple_product_id, proUpsellEvents$StoreViewRecordPurchaseError.apple_product_id) && x44.r(this.apple_app_account_token, proUpsellEvents$StoreViewRecordPurchaseError.apple_app_account_token) && x44.r(this.error_message, proUpsellEvents$StoreViewRecordPurchaseError.error_message) && x44.r(this.google_product_id, proUpsellEvents$StoreViewRecordPurchaseError.google_product_id) && x44.r(this.google_base_plan_id, proUpsellEvents$StoreViewRecordPurchaseError.google_base_plan_id);
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
        return "mobile.iap.pro.store_view.record_purchase.error";
    }

    public final String getGoogle_base_plan_id() {
        return this.google_base_plan_id;
    }

    public final String getGoogle_product_id() {
        return this.google_product_id;
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
        String str5 = this.google_product_id;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.google_base_plan_id;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.apple_original_transaction_id;
        String str2 = this.apple_product_id;
        String str3 = this.apple_app_account_token;
        String str4 = this.error_message;
        String str5 = this.google_product_id;
        String str6 = this.google_base_plan_id;
        StringBuilder sbR = kgh.r("StoreViewRecordPurchaseError(apple_original_transaction_id=", str, ", apple_product_id=", str2, ", apple_app_account_token=");
        kgh.u(sbR, str3, ", error_message=", str4, ", google_product_id=");
        return vb7.t(sbR, str5, ", google_base_plan_id=", str6, ")");
    }

    public ProUpsellEvents$StoreViewRecordPurchaseError() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (mq5) null);
    }

    public ProUpsellEvents$StoreViewRecordPurchaseError(String str, String str2, String str3, String str4, String str5, String str6) {
        this.apple_original_transaction_id = str;
        this.apple_product_id = str2;
        this.apple_app_account_token = str3;
        this.error_message = str4;
        this.google_product_id = str5;
        this.google_base_plan_id = str6;
    }

    public /* synthetic */ ProUpsellEvents$StoreViewRecordPurchaseError(String str, String str2, String str3, String str4, String str5, String str6, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
