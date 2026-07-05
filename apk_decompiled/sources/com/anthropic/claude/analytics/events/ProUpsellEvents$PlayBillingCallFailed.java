package com.anthropic.claude.analytics.events;

import defpackage.e79;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mgd;
import defpackage.mq5;
import defpackage.ogd;
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
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u000e2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001dR\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0019¨\u00063"}, d2 = {"com/anthropic/claude/analytics/events/ProUpsellEvents$PlayBillingCallFailed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "call", "", "google_response_code", "Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;", "error_kind", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ProUpsellEvents$PlayBillingCallFailed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ProUpsellEvents$PlayBillingCallFailed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "()Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;)Lcom/anthropic/claude/analytics/events/ProUpsellEvents$PlayBillingCallFailed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCall", "Ljava/lang/Integer;", "getGoogle_response_code", "Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;", "getError_kind", "getEventName", "eventName", "Companion", "ngd", "ogd", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProUpsellEvents$PlayBillingCallFailed implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String call;
    private final ProUpsellEvents$StoreViewPurchaseErrorKind error_kind;
    private final Integer google_response_code;
    public static final ogd Companion = new ogd();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new mgd(0))};

    public /* synthetic */ ProUpsellEvents$PlayBillingCallFailed(int i, String str, Integer num, ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.call = null;
        } else {
            this.call = str;
        }
        if ((i & 2) == 0) {
            this.google_response_code = null;
        } else {
            this.google_response_code = num;
        }
        if ((i & 4) == 0) {
            this.error_kind = null;
        } else {
            this.error_kind = proUpsellEvents$StoreViewPurchaseErrorKind;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ProUpsellEvents$StoreViewPurchaseErrorKind.Companion.serializer();
    }

    public static /* synthetic */ ProUpsellEvents$PlayBillingCallFailed copy$default(ProUpsellEvents$PlayBillingCallFailed proUpsellEvents$PlayBillingCallFailed, String str, Integer num, ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind, int i, Object obj) {
        if ((i & 1) != 0) {
            str = proUpsellEvents$PlayBillingCallFailed.call;
        }
        if ((i & 2) != 0) {
            num = proUpsellEvents$PlayBillingCallFailed.google_response_code;
        }
        if ((i & 4) != 0) {
            proUpsellEvents$StoreViewPurchaseErrorKind = proUpsellEvents$PlayBillingCallFailed.error_kind;
        }
        return proUpsellEvents$PlayBillingCallFailed.copy(str, num, proUpsellEvents$StoreViewPurchaseErrorKind);
    }

    public static final /* synthetic */ void write$Self$analytics(ProUpsellEvents$PlayBillingCallFailed self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.call != null) {
            output.B(serialDesc, 0, srg.a, self.call);
        }
        if (output.E(serialDesc) || self.google_response_code != null) {
            output.B(serialDesc, 1, e79.a, self.google_response_code);
        }
        if (!output.E(serialDesc) && self.error_kind == null) {
            return;
        }
        output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.error_kind);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCall() {
        return this.call;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getGoogle_response_code() {
        return this.google_response_code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ProUpsellEvents$StoreViewPurchaseErrorKind getError_kind() {
        return this.error_kind;
    }

    public final ProUpsellEvents$PlayBillingCallFailed copy(String call, Integer google_response_code, ProUpsellEvents$StoreViewPurchaseErrorKind error_kind) {
        return new ProUpsellEvents$PlayBillingCallFailed(call, google_response_code, error_kind);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProUpsellEvents$PlayBillingCallFailed)) {
            return false;
        }
        ProUpsellEvents$PlayBillingCallFailed proUpsellEvents$PlayBillingCallFailed = (ProUpsellEvents$PlayBillingCallFailed) other;
        return x44.r(this.call, proUpsellEvents$PlayBillingCallFailed.call) && x44.r(this.google_response_code, proUpsellEvents$PlayBillingCallFailed.google_response_code) && this.error_kind == proUpsellEvents$PlayBillingCallFailed.error_kind;
    }

    public final String getCall() {
        return this.call;
    }

    public final ProUpsellEvents$StoreViewPurchaseErrorKind getError_kind() {
        return this.error_kind;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.iap.play_billing.call_failed";
    }

    public final Integer getGoogle_response_code() {
        return this.google_response_code;
    }

    public int hashCode() {
        String str = this.call;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.google_response_code;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind = this.error_kind;
        return iHashCode2 + (proUpsellEvents$StoreViewPurchaseErrorKind != null ? proUpsellEvents$StoreViewPurchaseErrorKind.hashCode() : 0);
    }

    public String toString() {
        return "PlayBillingCallFailed(call=" + this.call + ", google_response_code=" + this.google_response_code + ", error_kind=" + this.error_kind + ")";
    }

    public ProUpsellEvents$PlayBillingCallFailed() {
        this((String) null, (Integer) null, (ProUpsellEvents$StoreViewPurchaseErrorKind) null, 7, (mq5) null);
    }

    public ProUpsellEvents$PlayBillingCallFailed(String str, Integer num, ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind) {
        this.call = str;
        this.google_response_code = num;
        this.error_kind = proUpsellEvents$StoreViewPurchaseErrorKind;
    }

    public /* synthetic */ ProUpsellEvents$PlayBillingCallFailed(String str, Integer num, ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : proUpsellEvents$StoreViewPurchaseErrorKind);
    }
}
