package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e79;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.twg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABBs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBu\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)J|\u0010*\u001a\u00020\u00142\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b6\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b9\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b:\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b;\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b<\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b\r\u0010)R\u0014\u0010?\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u001f¨\u0006C"}, d2 = {"com/anthropic/claude/analytics/events/SubscriptionSyncEvents$IapEntitlementSynced", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "apple_original_transaction_id", "apple_product_id", "apple_app_account_token", "", "sync_version", "apple_expiration_date", "apple_revocation_date", "apple_ownership_type", "apple_environment", "", "is_unfinished", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/SubscriptionSyncEvents$IapEntitlementSynced;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/SubscriptionSyncEvents$IapEntitlementSynced;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/analytics/events/SubscriptionSyncEvents$IapEntitlementSynced;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApple_original_transaction_id", "getApple_product_id", "getApple_app_account_token", "Ljava/lang/Integer;", "getSync_version", "getApple_expiration_date", "getApple_revocation_date", "getApple_ownership_type", "getApple_environment", "Ljava/lang/Boolean;", "getEventName", "eventName", "Companion", "swg", "twg", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SubscriptionSyncEvents$IapEntitlementSynced implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final twg Companion = new twg();
    private final String apple_app_account_token;
    private final String apple_environment;
    private final String apple_expiration_date;
    private final String apple_original_transaction_id;
    private final String apple_ownership_type;
    private final String apple_product_id;
    private final String apple_revocation_date;
    private final Boolean is_unfinished;
    private final Integer sync_version;

    public /* synthetic */ SubscriptionSyncEvents$IapEntitlementSynced(int i, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, Boolean bool, vnf vnfVar) {
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
            this.sync_version = null;
        } else {
            this.sync_version = num;
        }
        if ((i & 16) == 0) {
            this.apple_expiration_date = null;
        } else {
            this.apple_expiration_date = str4;
        }
        if ((i & 32) == 0) {
            this.apple_revocation_date = null;
        } else {
            this.apple_revocation_date = str5;
        }
        if ((i & 64) == 0) {
            this.apple_ownership_type = null;
        } else {
            this.apple_ownership_type = str6;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.apple_environment = null;
        } else {
            this.apple_environment = str7;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.is_unfinished = null;
        } else {
            this.is_unfinished = bool;
        }
    }

    public static /* synthetic */ SubscriptionSyncEvents$IapEntitlementSynced copy$default(SubscriptionSyncEvents$IapEntitlementSynced subscriptionSyncEvents$IapEntitlementSynced, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionSyncEvents$IapEntitlementSynced.apple_original_transaction_id;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionSyncEvents$IapEntitlementSynced.apple_product_id;
        }
        if ((i & 4) != 0) {
            str3 = subscriptionSyncEvents$IapEntitlementSynced.apple_app_account_token;
        }
        if ((i & 8) != 0) {
            num = subscriptionSyncEvents$IapEntitlementSynced.sync_version;
        }
        if ((i & 16) != 0) {
            str4 = subscriptionSyncEvents$IapEntitlementSynced.apple_expiration_date;
        }
        if ((i & 32) != 0) {
            str5 = subscriptionSyncEvents$IapEntitlementSynced.apple_revocation_date;
        }
        if ((i & 64) != 0) {
            str6 = subscriptionSyncEvents$IapEntitlementSynced.apple_ownership_type;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str7 = subscriptionSyncEvents$IapEntitlementSynced.apple_environment;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            bool = subscriptionSyncEvents$IapEntitlementSynced.is_unfinished;
        }
        String str8 = str7;
        Boolean bool2 = bool;
        String str9 = str5;
        String str10 = str6;
        String str11 = str4;
        String str12 = str3;
        return subscriptionSyncEvents$IapEntitlementSynced.copy(str, str2, str12, num, str11, str9, str10, str8, bool2);
    }

    public static final /* synthetic */ void write$Self$analytics(SubscriptionSyncEvents$IapEntitlementSynced self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.apple_original_transaction_id != null) {
            output.B(serialDesc, 0, srg.a, self.apple_original_transaction_id);
        }
        if (output.E(serialDesc) || self.apple_product_id != null) {
            output.B(serialDesc, 1, srg.a, self.apple_product_id);
        }
        if (output.E(serialDesc) || self.apple_app_account_token != null) {
            output.B(serialDesc, 2, srg.a, self.apple_app_account_token);
        }
        if (output.E(serialDesc) || self.sync_version != null) {
            output.B(serialDesc, 3, e79.a, self.sync_version);
        }
        if (output.E(serialDesc) || self.apple_expiration_date != null) {
            output.B(serialDesc, 4, srg.a, self.apple_expiration_date);
        }
        if (output.E(serialDesc) || self.apple_revocation_date != null) {
            output.B(serialDesc, 5, srg.a, self.apple_revocation_date);
        }
        if (output.E(serialDesc) || self.apple_ownership_type != null) {
            output.B(serialDesc, 6, srg.a, self.apple_ownership_type);
        }
        if (output.E(serialDesc) || self.apple_environment != null) {
            output.B(serialDesc, 7, srg.a, self.apple_environment);
        }
        if (!output.E(serialDesc) && self.is_unfinished == null) {
            return;
        }
        output.B(serialDesc, 8, zt1.a, self.is_unfinished);
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
    public final Integer getSync_version() {
        return this.sync_version;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getApple_expiration_date() {
        return this.apple_expiration_date;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getApple_revocation_date() {
        return this.apple_revocation_date;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getApple_ownership_type() {
        return this.apple_ownership_type;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getApple_environment() {
        return this.apple_environment;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIs_unfinished() {
        return this.is_unfinished;
    }

    public final SubscriptionSyncEvents$IapEntitlementSynced copy(String apple_original_transaction_id, String apple_product_id, String apple_app_account_token, Integer sync_version, String apple_expiration_date, String apple_revocation_date, String apple_ownership_type, String apple_environment, Boolean is_unfinished) {
        return new SubscriptionSyncEvents$IapEntitlementSynced(apple_original_transaction_id, apple_product_id, apple_app_account_token, sync_version, apple_expiration_date, apple_revocation_date, apple_ownership_type, apple_environment, is_unfinished);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionSyncEvents$IapEntitlementSynced)) {
            return false;
        }
        SubscriptionSyncEvents$IapEntitlementSynced subscriptionSyncEvents$IapEntitlementSynced = (SubscriptionSyncEvents$IapEntitlementSynced) other;
        return x44.r(this.apple_original_transaction_id, subscriptionSyncEvents$IapEntitlementSynced.apple_original_transaction_id) && x44.r(this.apple_product_id, subscriptionSyncEvents$IapEntitlementSynced.apple_product_id) && x44.r(this.apple_app_account_token, subscriptionSyncEvents$IapEntitlementSynced.apple_app_account_token) && x44.r(this.sync_version, subscriptionSyncEvents$IapEntitlementSynced.sync_version) && x44.r(this.apple_expiration_date, subscriptionSyncEvents$IapEntitlementSynced.apple_expiration_date) && x44.r(this.apple_revocation_date, subscriptionSyncEvents$IapEntitlementSynced.apple_revocation_date) && x44.r(this.apple_ownership_type, subscriptionSyncEvents$IapEntitlementSynced.apple_ownership_type) && x44.r(this.apple_environment, subscriptionSyncEvents$IapEntitlementSynced.apple_environment) && x44.r(this.is_unfinished, subscriptionSyncEvents$IapEntitlementSynced.is_unfinished);
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

    public final String getApple_revocation_date() {
        return this.apple_revocation_date;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.iap.entitlement.synced";
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
        Integer num = this.sync_version;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.apple_expiration_date;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.apple_revocation_date;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.apple_ownership_type;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.apple_environment;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.is_unfinished;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean is_unfinished() {
        return this.is_unfinished;
    }

    public String toString() {
        String str = this.apple_original_transaction_id;
        String str2 = this.apple_product_id;
        String str3 = this.apple_app_account_token;
        Integer num = this.sync_version;
        String str4 = this.apple_expiration_date;
        String str5 = this.apple_revocation_date;
        String str6 = this.apple_ownership_type;
        String str7 = this.apple_environment;
        Boolean bool = this.is_unfinished;
        StringBuilder sbR = kgh.r("IapEntitlementSynced(apple_original_transaction_id=", str, ", apple_product_id=", str2, ", apple_app_account_token=");
        sbR.append(str3);
        sbR.append(", sync_version=");
        sbR.append(num);
        sbR.append(", apple_expiration_date=");
        kgh.u(sbR, str4, ", apple_revocation_date=", str5, ", apple_ownership_type=");
        kgh.u(sbR, str6, ", apple_environment=", str7, ", is_unfinished=");
        return qy1.h(sbR, bool, ")");
    }

    public SubscriptionSyncEvents$IapEntitlementSynced() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 511, (mq5) null);
    }

    public SubscriptionSyncEvents$IapEntitlementSynced(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, Boolean bool) {
        this.apple_original_transaction_id = str;
        this.apple_product_id = str2;
        this.apple_app_account_token = str3;
        this.sync_version = num;
        this.apple_expiration_date = str4;
        this.apple_revocation_date = str5;
        this.apple_ownership_type = str6;
        this.apple_environment = str7;
        this.is_unfinished = bool;
    }

    public /* synthetic */ SubscriptionSyncEvents$IapEntitlementSynced(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, Boolean bool, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str7, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : bool);
    }
}
