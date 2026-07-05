package com.anthropic.claude.analytics.events;

import defpackage.kdi;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mli;
import defpackage.mq5;
import defpackage.onf;
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
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J@\u0010!\u001a\u00020\u00102\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0014\u00103\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001b¨\u00067"}, d2 = {"com/anthropic/claude/analytics/events/UsageCreditsEvents$CreditPackPurchaseFailed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "apple_product_id", "google_product_id", "Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;", "error_kind", "Lcom/anthropic/claude/analytics/events/UsageCreditsEvents$CreditPackPurchaseStage;", "stage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;Lcom/anthropic/claude/analytics/events/UsageCreditsEvents$CreditPackPurchaseStage;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;Lcom/anthropic/claude/analytics/events/UsageCreditsEvents$CreditPackPurchaseStage;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/UsageCreditsEvents$CreditPackPurchaseFailed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/UsageCreditsEvents$CreditPackPurchaseFailed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;", "component4", "()Lcom/anthropic/claude/analytics/events/UsageCreditsEvents$CreditPackPurchaseStage;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;Lcom/anthropic/claude/analytics/events/UsageCreditsEvents$CreditPackPurchaseStage;)Lcom/anthropic/claude/analytics/events/UsageCreditsEvents$CreditPackPurchaseFailed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApple_product_id", "getGoogle_product_id", "Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;", "getError_kind", "Lcom/anthropic/claude/analytics/events/UsageCreditsEvents$CreditPackPurchaseStage;", "getStage", "getEventName", "eventName", "Companion", "lli", "mli", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UsageCreditsEvents$CreditPackPurchaseFailed implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final mli Companion = new mli();
    private final String apple_product_id;
    private final ProUpsellEvents$StoreViewPurchaseErrorKind error_kind;
    private final String google_product_id;
    private final UsageCreditsEvents$CreditPackPurchaseStage stage;

    static {
        kdi kdiVar = new kdi(8);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, yb5.w(w1aVar, kdiVar), yb5.w(w1aVar, new kdi(9))};
    }

    public /* synthetic */ UsageCreditsEvents$CreditPackPurchaseFailed(int i, String str, String str2, ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind, UsageCreditsEvents$CreditPackPurchaseStage usageCreditsEvents$CreditPackPurchaseStage, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.apple_product_id = null;
        } else {
            this.apple_product_id = str;
        }
        if ((i & 2) == 0) {
            this.google_product_id = null;
        } else {
            this.google_product_id = str2;
        }
        if ((i & 4) == 0) {
            this.error_kind = null;
        } else {
            this.error_kind = proUpsellEvents$StoreViewPurchaseErrorKind;
        }
        if ((i & 8) == 0) {
            this.stage = null;
        } else {
            this.stage = usageCreditsEvents$CreditPackPurchaseStage;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ProUpsellEvents$StoreViewPurchaseErrorKind.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return UsageCreditsEvents$CreditPackPurchaseStage.Companion.serializer();
    }

    public static /* synthetic */ UsageCreditsEvents$CreditPackPurchaseFailed copy$default(UsageCreditsEvents$CreditPackPurchaseFailed usageCreditsEvents$CreditPackPurchaseFailed, String str, String str2, ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind, UsageCreditsEvents$CreditPackPurchaseStage usageCreditsEvents$CreditPackPurchaseStage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = usageCreditsEvents$CreditPackPurchaseFailed.apple_product_id;
        }
        if ((i & 2) != 0) {
            str2 = usageCreditsEvents$CreditPackPurchaseFailed.google_product_id;
        }
        if ((i & 4) != 0) {
            proUpsellEvents$StoreViewPurchaseErrorKind = usageCreditsEvents$CreditPackPurchaseFailed.error_kind;
        }
        if ((i & 8) != 0) {
            usageCreditsEvents$CreditPackPurchaseStage = usageCreditsEvents$CreditPackPurchaseFailed.stage;
        }
        return usageCreditsEvents$CreditPackPurchaseFailed.copy(str, str2, proUpsellEvents$StoreViewPurchaseErrorKind, usageCreditsEvents$CreditPackPurchaseStage);
    }

    public static final /* synthetic */ void write$Self$analytics(UsageCreditsEvents$CreditPackPurchaseFailed self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.apple_product_id != null) {
            output.B(serialDesc, 0, srg.a, self.apple_product_id);
        }
        if (output.E(serialDesc) || self.google_product_id != null) {
            output.B(serialDesc, 1, srg.a, self.google_product_id);
        }
        if (output.E(serialDesc) || self.error_kind != null) {
            output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.error_kind);
        }
        if (!output.E(serialDesc) && self.stage == null) {
            return;
        }
        output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.stage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApple_product_id() {
        return this.apple_product_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGoogle_product_id() {
        return this.google_product_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ProUpsellEvents$StoreViewPurchaseErrorKind getError_kind() {
        return this.error_kind;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UsageCreditsEvents$CreditPackPurchaseStage getStage() {
        return this.stage;
    }

    public final UsageCreditsEvents$CreditPackPurchaseFailed copy(String apple_product_id, String google_product_id, ProUpsellEvents$StoreViewPurchaseErrorKind error_kind, UsageCreditsEvents$CreditPackPurchaseStage stage) {
        return new UsageCreditsEvents$CreditPackPurchaseFailed(apple_product_id, google_product_id, error_kind, stage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsageCreditsEvents$CreditPackPurchaseFailed)) {
            return false;
        }
        UsageCreditsEvents$CreditPackPurchaseFailed usageCreditsEvents$CreditPackPurchaseFailed = (UsageCreditsEvents$CreditPackPurchaseFailed) other;
        return x44.r(this.apple_product_id, usageCreditsEvents$CreditPackPurchaseFailed.apple_product_id) && x44.r(this.google_product_id, usageCreditsEvents$CreditPackPurchaseFailed.google_product_id) && this.error_kind == usageCreditsEvents$CreditPackPurchaseFailed.error_kind && this.stage == usageCreditsEvents$CreditPackPurchaseFailed.stage;
    }

    public final String getApple_product_id() {
        return this.apple_product_id;
    }

    public final ProUpsellEvents$StoreViewPurchaseErrorKind getError_kind() {
        return this.error_kind;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "credit_pack_purchase_failed";
    }

    public final String getGoogle_product_id() {
        return this.google_product_id;
    }

    public final UsageCreditsEvents$CreditPackPurchaseStage getStage() {
        return this.stage;
    }

    public int hashCode() {
        String str = this.apple_product_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.google_product_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind = this.error_kind;
        int iHashCode3 = (iHashCode2 + (proUpsellEvents$StoreViewPurchaseErrorKind == null ? 0 : proUpsellEvents$StoreViewPurchaseErrorKind.hashCode())) * 31;
        UsageCreditsEvents$CreditPackPurchaseStage usageCreditsEvents$CreditPackPurchaseStage = this.stage;
        return iHashCode3 + (usageCreditsEvents$CreditPackPurchaseStage != null ? usageCreditsEvents$CreditPackPurchaseStage.hashCode() : 0);
    }

    public String toString() {
        String str = this.apple_product_id;
        String str2 = this.google_product_id;
        ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind = this.error_kind;
        UsageCreditsEvents$CreditPackPurchaseStage usageCreditsEvents$CreditPackPurchaseStage = this.stage;
        StringBuilder sbR = kgh.r("CreditPackPurchaseFailed(apple_product_id=", str, ", google_product_id=", str2, ", error_kind=");
        sbR.append(proUpsellEvents$StoreViewPurchaseErrorKind);
        sbR.append(", stage=");
        sbR.append(usageCreditsEvents$CreditPackPurchaseStage);
        sbR.append(")");
        return sbR.toString();
    }

    public UsageCreditsEvents$CreditPackPurchaseFailed() {
        this((String) null, (String) null, (ProUpsellEvents$StoreViewPurchaseErrorKind) null, (UsageCreditsEvents$CreditPackPurchaseStage) null, 15, (mq5) null);
    }

    public UsageCreditsEvents$CreditPackPurchaseFailed(String str, String str2, ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind, UsageCreditsEvents$CreditPackPurchaseStage usageCreditsEvents$CreditPackPurchaseStage) {
        this.apple_product_id = str;
        this.google_product_id = str2;
        this.error_kind = proUpsellEvents$StoreViewPurchaseErrorKind;
        this.stage = usageCreditsEvents$CreditPackPurchaseStage;
    }

    public /* synthetic */ UsageCreditsEvents$CreditPackPurchaseFailed(String str, String str2, ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind, UsageCreditsEvents$CreditPackPurchaseStage usageCreditsEvents$CreditPackPurchaseStage, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : proUpsellEvents$StoreViewPurchaseErrorKind, (i & 8) != 0 ? null : usageCreditsEvents$CreditPackPurchaseStage);
    }
}
