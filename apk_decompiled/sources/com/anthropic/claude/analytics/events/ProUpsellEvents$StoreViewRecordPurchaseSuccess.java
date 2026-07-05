package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zgd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBk\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJp\u0010%\u001a\u00020\u00122\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b5\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b6\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b7\u0010\u001dR\u0014\u00109\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u001d¨\u0006="}, d2 = {"com/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewRecordPurchaseSuccess", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "apple_original_transaction_id", "apple_product_id", "apple_app_account_token", "apple_expiration_date", "apple_ownership_type", "apple_environment", "google_product_id", "google_base_plan_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewRecordPurchaseSuccess;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewRecordPurchaseSuccess;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewRecordPurchaseSuccess;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApple_original_transaction_id", "getApple_product_id", "getApple_app_account_token", "getApple_expiration_date", "getApple_ownership_type", "getApple_environment", "getGoogle_product_id", "getGoogle_base_plan_id", "getEventName", "eventName", "Companion", "ygd", "zgd", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProUpsellEvents$StoreViewRecordPurchaseSuccess implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final zgd Companion = new zgd();
    private final String apple_app_account_token;
    private final String apple_environment;
    private final String apple_expiration_date;
    private final String apple_original_transaction_id;
    private final String apple_ownership_type;
    private final String apple_product_id;
    private final String google_base_plan_id;
    private final String google_product_id;

    public /* synthetic */ ProUpsellEvents$StoreViewRecordPurchaseSuccess(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, vnf vnfVar) {
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
            this.apple_expiration_date = null;
        } else {
            this.apple_expiration_date = str4;
        }
        if ((i & 16) == 0) {
            this.apple_ownership_type = null;
        } else {
            this.apple_ownership_type = str5;
        }
        if ((i & 32) == 0) {
            this.apple_environment = null;
        } else {
            this.apple_environment = str6;
        }
        if ((i & 64) == 0) {
            this.google_product_id = null;
        } else {
            this.google_product_id = str7;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.google_base_plan_id = null;
        } else {
            this.google_base_plan_id = str8;
        }
    }

    public static /* synthetic */ ProUpsellEvents$StoreViewRecordPurchaseSuccess copy$default(ProUpsellEvents$StoreViewRecordPurchaseSuccess proUpsellEvents$StoreViewRecordPurchaseSuccess, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = proUpsellEvents$StoreViewRecordPurchaseSuccess.apple_original_transaction_id;
        }
        if ((i & 2) != 0) {
            str2 = proUpsellEvents$StoreViewRecordPurchaseSuccess.apple_product_id;
        }
        if ((i & 4) != 0) {
            str3 = proUpsellEvents$StoreViewRecordPurchaseSuccess.apple_app_account_token;
        }
        if ((i & 8) != 0) {
            str4 = proUpsellEvents$StoreViewRecordPurchaseSuccess.apple_expiration_date;
        }
        if ((i & 16) != 0) {
            str5 = proUpsellEvents$StoreViewRecordPurchaseSuccess.apple_ownership_type;
        }
        if ((i & 32) != 0) {
            str6 = proUpsellEvents$StoreViewRecordPurchaseSuccess.apple_environment;
        }
        if ((i & 64) != 0) {
            str7 = proUpsellEvents$StoreViewRecordPurchaseSuccess.google_product_id;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str8 = proUpsellEvents$StoreViewRecordPurchaseSuccess.google_base_plan_id;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return proUpsellEvents$StoreViewRecordPurchaseSuccess.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    public static final /* synthetic */ void write$Self$analytics(ProUpsellEvents$StoreViewRecordPurchaseSuccess self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.apple_original_transaction_id != null) {
            output.B(serialDesc, 0, srg.a, self.apple_original_transaction_id);
        }
        if (output.E(serialDesc) || self.apple_product_id != null) {
            output.B(serialDesc, 1, srg.a, self.apple_product_id);
        }
        if (output.E(serialDesc) || self.apple_app_account_token != null) {
            output.B(serialDesc, 2, srg.a, self.apple_app_account_token);
        }
        if (output.E(serialDesc) || self.apple_expiration_date != null) {
            output.B(serialDesc, 3, srg.a, self.apple_expiration_date);
        }
        if (output.E(serialDesc) || self.apple_ownership_type != null) {
            output.B(serialDesc, 4, srg.a, self.apple_ownership_type);
        }
        if (output.E(serialDesc) || self.apple_environment != null) {
            output.B(serialDesc, 5, srg.a, self.apple_environment);
        }
        if (output.E(serialDesc) || self.google_product_id != null) {
            output.B(serialDesc, 6, srg.a, self.google_product_id);
        }
        if (!output.E(serialDesc) && self.google_base_plan_id == null) {
            return;
        }
        output.B(serialDesc, 7, srg.a, self.google_base_plan_id);
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
    public final String getApple_expiration_date() {
        return this.apple_expiration_date;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getApple_ownership_type() {
        return this.apple_ownership_type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getApple_environment() {
        return this.apple_environment;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getGoogle_product_id() {
        return this.google_product_id;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getGoogle_base_plan_id() {
        return this.google_base_plan_id;
    }

    public final ProUpsellEvents$StoreViewRecordPurchaseSuccess copy(String apple_original_transaction_id, String apple_product_id, String apple_app_account_token, String apple_expiration_date, String apple_ownership_type, String apple_environment, String google_product_id, String google_base_plan_id) {
        return new ProUpsellEvents$StoreViewRecordPurchaseSuccess(apple_original_transaction_id, apple_product_id, apple_app_account_token, apple_expiration_date, apple_ownership_type, apple_environment, google_product_id, google_base_plan_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProUpsellEvents$StoreViewRecordPurchaseSuccess)) {
            return false;
        }
        ProUpsellEvents$StoreViewRecordPurchaseSuccess proUpsellEvents$StoreViewRecordPurchaseSuccess = (ProUpsellEvents$StoreViewRecordPurchaseSuccess) other;
        return x44.r(this.apple_original_transaction_id, proUpsellEvents$StoreViewRecordPurchaseSuccess.apple_original_transaction_id) && x44.r(this.apple_product_id, proUpsellEvents$StoreViewRecordPurchaseSuccess.apple_product_id) && x44.r(this.apple_app_account_token, proUpsellEvents$StoreViewRecordPurchaseSuccess.apple_app_account_token) && x44.r(this.apple_expiration_date, proUpsellEvents$StoreViewRecordPurchaseSuccess.apple_expiration_date) && x44.r(this.apple_ownership_type, proUpsellEvents$StoreViewRecordPurchaseSuccess.apple_ownership_type) && x44.r(this.apple_environment, proUpsellEvents$StoreViewRecordPurchaseSuccess.apple_environment) && x44.r(this.google_product_id, proUpsellEvents$StoreViewRecordPurchaseSuccess.google_product_id) && x44.r(this.google_base_plan_id, proUpsellEvents$StoreViewRecordPurchaseSuccess.google_base_plan_id);
    }

    public final String getApple_app_account_token() {
        return this.apple_app_account_token;
    }

    public final String getApple_environment() {
        return this.apple_environment;
    }

    public final String getApple_expiration_date() {
        return this.apple_expiration_date;
    }

    public final String getApple_original_transaction_id() {
        return this.apple_original_transaction_id;
    }

    public final String getApple_ownership_type() {
        return this.apple_ownership_type;
    }

    public final String getApple_product_id() {
        return this.apple_product_id;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.iap.pro.store_view.record_purchase.success";
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
        String str4 = this.apple_expiration_date;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.apple_ownership_type;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.apple_environment;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.google_product_id;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.google_base_plan_id;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        String str = this.apple_original_transaction_id;
        String str2 = this.apple_product_id;
        String str3 = this.apple_app_account_token;
        String str4 = this.apple_expiration_date;
        String str5 = this.apple_ownership_type;
        String str6 = this.apple_environment;
        String str7 = this.google_product_id;
        String str8 = this.google_base_plan_id;
        StringBuilder sbR = kgh.r("StoreViewRecordPurchaseSuccess(apple_original_transaction_id=", str, ", apple_product_id=", str2, ", apple_app_account_token=");
        kgh.u(sbR, str3, ", apple_expiration_date=", str4, ", apple_ownership_type=");
        kgh.u(sbR, str5, ", apple_environment=", str6, ", google_product_id=");
        return vb7.t(sbR, str7, ", google_base_plan_id=", str8, ")");
    }

    public ProUpsellEvents$StoreViewRecordPurchaseSuccess() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (mq5) null);
    }

    public ProUpsellEvents$StoreViewRecordPurchaseSuccess(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.apple_original_transaction_id = str;
        this.apple_product_id = str2;
        this.apple_app_account_token = str3;
        this.apple_expiration_date = str4;
        this.apple_ownership_type = str5;
        this.apple_environment = str6;
        this.google_product_id = str7;
        this.google_base_plan_id = str8;
    }

    public /* synthetic */ ProUpsellEvents$StoreViewRecordPurchaseSuccess(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str8);
    }
}
