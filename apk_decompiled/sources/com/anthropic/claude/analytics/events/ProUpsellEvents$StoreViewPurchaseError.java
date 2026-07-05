package com.anthropic.claude.analytics.events;

import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mgd;
import defpackage.mq5;
import defpackage.onf;
import defpackage.sgd;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJL\u0010!\u001a\u00020\u00102\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u001bR\u0014\u00103\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001b¨\u00067"}, d2 = {"com/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseError", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "apple_product_id", "error_message", "Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;", "error_kind", "google_product_id", "google_base_plan_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseError;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseError;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseError;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApple_product_id", "getError_message", "Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;", "getError_kind", "getGoogle_product_id", "getGoogle_base_plan_id", "getEventName", "eventName", "Companion", "rgd", "sgd", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProUpsellEvents$StoreViewPurchaseError implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String apple_product_id;
    private final ProUpsellEvents$StoreViewPurchaseErrorKind error_kind;
    private final String error_message;
    private final String google_base_plan_id;
    private final String google_product_id;
    public static final sgd Companion = new sgd();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new mgd(1)), null, null};

    public /* synthetic */ ProUpsellEvents$StoreViewPurchaseError(int i, String str, String str2, ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind, String str3, String str4, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.apple_product_id = null;
        } else {
            this.apple_product_id = str;
        }
        if ((i & 2) == 0) {
            this.error_message = null;
        } else {
            this.error_message = str2;
        }
        if ((i & 4) == 0) {
            this.error_kind = null;
        } else {
            this.error_kind = proUpsellEvents$StoreViewPurchaseErrorKind;
        }
        if ((i & 8) == 0) {
            this.google_product_id = null;
        } else {
            this.google_product_id = str3;
        }
        if ((i & 16) == 0) {
            this.google_base_plan_id = null;
        } else {
            this.google_base_plan_id = str4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ProUpsellEvents$StoreViewPurchaseErrorKind.Companion.serializer();
    }

    public static /* synthetic */ ProUpsellEvents$StoreViewPurchaseError copy$default(ProUpsellEvents$StoreViewPurchaseError proUpsellEvents$StoreViewPurchaseError, String str, String str2, ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = proUpsellEvents$StoreViewPurchaseError.apple_product_id;
        }
        if ((i & 2) != 0) {
            str2 = proUpsellEvents$StoreViewPurchaseError.error_message;
        }
        if ((i & 4) != 0) {
            proUpsellEvents$StoreViewPurchaseErrorKind = proUpsellEvents$StoreViewPurchaseError.error_kind;
        }
        if ((i & 8) != 0) {
            str3 = proUpsellEvents$StoreViewPurchaseError.google_product_id;
        }
        if ((i & 16) != 0) {
            str4 = proUpsellEvents$StoreViewPurchaseError.google_base_plan_id;
        }
        String str5 = str4;
        ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind2 = proUpsellEvents$StoreViewPurchaseErrorKind;
        return proUpsellEvents$StoreViewPurchaseError.copy(str, str2, proUpsellEvents$StoreViewPurchaseErrorKind2, str3, str5);
    }

    public static final /* synthetic */ void write$Self$analytics(ProUpsellEvents$StoreViewPurchaseError self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.apple_product_id != null) {
            output.B(serialDesc, 0, srg.a, self.apple_product_id);
        }
        if (output.E(serialDesc) || self.error_message != null) {
            output.B(serialDesc, 1, srg.a, self.error_message);
        }
        if (output.E(serialDesc) || self.error_kind != null) {
            output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.error_kind);
        }
        if (output.E(serialDesc) || self.google_product_id != null) {
            output.B(serialDesc, 3, srg.a, self.google_product_id);
        }
        if (!output.E(serialDesc) && self.google_base_plan_id == null) {
            return;
        }
        output.B(serialDesc, 4, srg.a, self.google_base_plan_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApple_product_id() {
        return this.apple_product_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getError_message() {
        return this.error_message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ProUpsellEvents$StoreViewPurchaseErrorKind getError_kind() {
        return this.error_kind;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGoogle_product_id() {
        return this.google_product_id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGoogle_base_plan_id() {
        return this.google_base_plan_id;
    }

    public final ProUpsellEvents$StoreViewPurchaseError copy(String apple_product_id, String error_message, ProUpsellEvents$StoreViewPurchaseErrorKind error_kind, String google_product_id, String google_base_plan_id) {
        return new ProUpsellEvents$StoreViewPurchaseError(apple_product_id, error_message, error_kind, google_product_id, google_base_plan_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProUpsellEvents$StoreViewPurchaseError)) {
            return false;
        }
        ProUpsellEvents$StoreViewPurchaseError proUpsellEvents$StoreViewPurchaseError = (ProUpsellEvents$StoreViewPurchaseError) other;
        return x44.r(this.apple_product_id, proUpsellEvents$StoreViewPurchaseError.apple_product_id) && x44.r(this.error_message, proUpsellEvents$StoreViewPurchaseError.error_message) && this.error_kind == proUpsellEvents$StoreViewPurchaseError.error_kind && x44.r(this.google_product_id, proUpsellEvents$StoreViewPurchaseError.google_product_id) && x44.r(this.google_base_plan_id, proUpsellEvents$StoreViewPurchaseError.google_base_plan_id);
    }

    public final String getApple_product_id() {
        return this.apple_product_id;
    }

    public final ProUpsellEvents$StoreViewPurchaseErrorKind getError_kind() {
        return this.error_kind;
    }

    public final String getError_message() {
        return this.error_message;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.iap.pro.store_view.purchase.error";
    }

    public final String getGoogle_base_plan_id() {
        return this.google_base_plan_id;
    }

    public final String getGoogle_product_id() {
        return this.google_product_id;
    }

    public int hashCode() {
        String str = this.apple_product_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.error_message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind = this.error_kind;
        int iHashCode3 = (iHashCode2 + (proUpsellEvents$StoreViewPurchaseErrorKind == null ? 0 : proUpsellEvents$StoreViewPurchaseErrorKind.hashCode())) * 31;
        String str3 = this.google_product_id;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.google_base_plan_id;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.apple_product_id;
        String str2 = this.error_message;
        ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind = this.error_kind;
        String str3 = this.google_product_id;
        String str4 = this.google_base_plan_id;
        StringBuilder sbR = kgh.r("StoreViewPurchaseError(apple_product_id=", str, ", error_message=", str2, ", error_kind=");
        sbR.append(proUpsellEvents$StoreViewPurchaseErrorKind);
        sbR.append(", google_product_id=");
        sbR.append(str3);
        sbR.append(", google_base_plan_id=");
        return ij0.m(sbR, str4, ")");
    }

    public ProUpsellEvents$StoreViewPurchaseError() {
        this((String) null, (String) null, (ProUpsellEvents$StoreViewPurchaseErrorKind) null, (String) null, (String) null, 31, (mq5) null);
    }

    public ProUpsellEvents$StoreViewPurchaseError(String str, String str2, ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind, String str3, String str4) {
        this.apple_product_id = str;
        this.error_message = str2;
        this.error_kind = proUpsellEvents$StoreViewPurchaseErrorKind;
        this.google_product_id = str3;
        this.google_base_plan_id = str4;
    }

    public /* synthetic */ ProUpsellEvents$StoreViewPurchaseError(String str, String str2, ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind, String str3, String str4, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : proUpsellEvents$StoreViewPurchaseErrorKind, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
