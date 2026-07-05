package com.anthropic.claude.analytics.events;

import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.oli;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J(\u0010\u0019\u001a\u00020\f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0014\u0010'\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0017¨\u0006+"}, d2 = {"com/anthropic/claude/analytics/events/UsageCreditsEvents$CreditPackPurchaseInitiated", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "apple_product_id", "google_product_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/UsageCreditsEvents$CreditPackPurchaseInitiated;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/UsageCreditsEvents$CreditPackPurchaseInitiated;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/UsageCreditsEvents$CreditPackPurchaseInitiated;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApple_product_id", "getGoogle_product_id", "getEventName", "eventName", "Companion", "nli", "oli", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UsageCreditsEvents$CreditPackPurchaseInitiated implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final oli Companion = new oli();
    private final String apple_product_id;
    private final String google_product_id;

    public /* synthetic */ UsageCreditsEvents$CreditPackPurchaseInitiated(int i, String str, String str2, vnf vnfVar) {
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
    }

    public static /* synthetic */ UsageCreditsEvents$CreditPackPurchaseInitiated copy$default(UsageCreditsEvents$CreditPackPurchaseInitiated usageCreditsEvents$CreditPackPurchaseInitiated, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = usageCreditsEvents$CreditPackPurchaseInitiated.apple_product_id;
        }
        if ((i & 2) != 0) {
            str2 = usageCreditsEvents$CreditPackPurchaseInitiated.google_product_id;
        }
        return usageCreditsEvents$CreditPackPurchaseInitiated.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$analytics(UsageCreditsEvents$CreditPackPurchaseInitiated self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.apple_product_id != null) {
            output.B(serialDesc, 0, srg.a, self.apple_product_id);
        }
        if (!output.E(serialDesc) && self.google_product_id == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.google_product_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApple_product_id() {
        return this.apple_product_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGoogle_product_id() {
        return this.google_product_id;
    }

    public final UsageCreditsEvents$CreditPackPurchaseInitiated copy(String apple_product_id, String google_product_id) {
        return new UsageCreditsEvents$CreditPackPurchaseInitiated(apple_product_id, google_product_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsageCreditsEvents$CreditPackPurchaseInitiated)) {
            return false;
        }
        UsageCreditsEvents$CreditPackPurchaseInitiated usageCreditsEvents$CreditPackPurchaseInitiated = (UsageCreditsEvents$CreditPackPurchaseInitiated) other;
        return x44.r(this.apple_product_id, usageCreditsEvents$CreditPackPurchaseInitiated.apple_product_id) && x44.r(this.google_product_id, usageCreditsEvents$CreditPackPurchaseInitiated.google_product_id);
    }

    public final String getApple_product_id() {
        return this.apple_product_id;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "credit_pack_purchase_initiated";
    }

    public final String getGoogle_product_id() {
        return this.google_product_id;
    }

    public int hashCode() {
        String str = this.apple_product_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.google_product_id;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return ij0.l("CreditPackPurchaseInitiated(apple_product_id=", this.apple_product_id, ", google_product_id=", this.google_product_id, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UsageCreditsEvents$CreditPackPurchaseInitiated() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public UsageCreditsEvents$CreditPackPurchaseInitiated(String str, String str2) {
        this.apple_product_id = str;
        this.google_product_id = str2;
    }

    public /* synthetic */ UsageCreditsEvents$CreditPackPurchaseInitiated(String str, String str2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
