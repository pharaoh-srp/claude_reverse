package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mgd;
import defpackage.onf;
import defpackage.oq5;
import defpackage.tgd;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"com/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind", "", "Lcom/anthropic/claude/analytics/events/ProUpsellEvents$StoreViewPurchaseErrorKind;", "<init>", "(Ljava/lang/String;I)V", "Companion", "tgd", "UNSPECIFIED", "USER_CANCELLED", "NETWORK", "SYSTEM_ERROR", "NOT_AVAILABLE_IN_STOREFRONT", "NOT_ENTITLED", "UNSUPPORTED", "PRODUCT_UNAVAILABLE", "PURCHASE_NOT_ALLOWED", "INVALID_OFFER", "INVALID_QUANTITY", "VERIFICATION_FAILED", "SERVICE_UNAVAILABLE", "DEVELOPER_ERROR", "ITEM_ALREADY_OWNED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ProUpsellEvents$StoreViewPurchaseErrorKind {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ProUpsellEvents$StoreViewPurchaseErrorKind[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final tgd Companion;
    public static final ProUpsellEvents$StoreViewPurchaseErrorKind UNSPECIFIED = new ProUpsellEvents$StoreViewPurchaseErrorKind("UNSPECIFIED", 0);
    public static final ProUpsellEvents$StoreViewPurchaseErrorKind USER_CANCELLED = new ProUpsellEvents$StoreViewPurchaseErrorKind("USER_CANCELLED", 1);
    public static final ProUpsellEvents$StoreViewPurchaseErrorKind NETWORK = new ProUpsellEvents$StoreViewPurchaseErrorKind("NETWORK", 2);
    public static final ProUpsellEvents$StoreViewPurchaseErrorKind SYSTEM_ERROR = new ProUpsellEvents$StoreViewPurchaseErrorKind("SYSTEM_ERROR", 3);
    public static final ProUpsellEvents$StoreViewPurchaseErrorKind NOT_AVAILABLE_IN_STOREFRONT = new ProUpsellEvents$StoreViewPurchaseErrorKind("NOT_AVAILABLE_IN_STOREFRONT", 4);
    public static final ProUpsellEvents$StoreViewPurchaseErrorKind NOT_ENTITLED = new ProUpsellEvents$StoreViewPurchaseErrorKind("NOT_ENTITLED", 5);
    public static final ProUpsellEvents$StoreViewPurchaseErrorKind UNSUPPORTED = new ProUpsellEvents$StoreViewPurchaseErrorKind("UNSUPPORTED", 6);
    public static final ProUpsellEvents$StoreViewPurchaseErrorKind PRODUCT_UNAVAILABLE = new ProUpsellEvents$StoreViewPurchaseErrorKind("PRODUCT_UNAVAILABLE", 7);
    public static final ProUpsellEvents$StoreViewPurchaseErrorKind PURCHASE_NOT_ALLOWED = new ProUpsellEvents$StoreViewPurchaseErrorKind("PURCHASE_NOT_ALLOWED", 8);
    public static final ProUpsellEvents$StoreViewPurchaseErrorKind INVALID_OFFER = new ProUpsellEvents$StoreViewPurchaseErrorKind("INVALID_OFFER", 9);
    public static final ProUpsellEvents$StoreViewPurchaseErrorKind INVALID_QUANTITY = new ProUpsellEvents$StoreViewPurchaseErrorKind("INVALID_QUANTITY", 10);
    public static final ProUpsellEvents$StoreViewPurchaseErrorKind VERIFICATION_FAILED = new ProUpsellEvents$StoreViewPurchaseErrorKind("VERIFICATION_FAILED", 11);
    public static final ProUpsellEvents$StoreViewPurchaseErrorKind SERVICE_UNAVAILABLE = new ProUpsellEvents$StoreViewPurchaseErrorKind("SERVICE_UNAVAILABLE", 12);
    public static final ProUpsellEvents$StoreViewPurchaseErrorKind DEVELOPER_ERROR = new ProUpsellEvents$StoreViewPurchaseErrorKind("DEVELOPER_ERROR", 13);
    public static final ProUpsellEvents$StoreViewPurchaseErrorKind ITEM_ALREADY_OWNED = new ProUpsellEvents$StoreViewPurchaseErrorKind("ITEM_ALREADY_OWNED", 14);

    private static final /* synthetic */ ProUpsellEvents$StoreViewPurchaseErrorKind[] $values() {
        return new ProUpsellEvents$StoreViewPurchaseErrorKind[]{UNSPECIFIED, USER_CANCELLED, NETWORK, SYSTEM_ERROR, NOT_AVAILABLE_IN_STOREFRONT, NOT_ENTITLED, UNSUPPORTED, PRODUCT_UNAVAILABLE, PURCHASE_NOT_ALLOWED, INVALID_OFFER, INVALID_QUANTITY, VERIFICATION_FAILED, SERVICE_UNAVAILABLE, DEVELOPER_ERROR, ITEM_ALREADY_OWNED};
    }

    static {
        ProUpsellEvents$StoreViewPurchaseErrorKind[] proUpsellEvents$StoreViewPurchaseErrorKindArr$values = $values();
        $VALUES = proUpsellEvents$StoreViewPurchaseErrorKindArr$values;
        $ENTRIES = wd6.n0(proUpsellEvents$StoreViewPurchaseErrorKindArr$values);
        Companion = new tgd();
        $cachedSerializer$delegate = yb5.w(w1a.F, new mgd(2));
    }

    private ProUpsellEvents$StoreViewPurchaseErrorKind(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ProUpsellEvents.StoreViewPurchaseErrorKind", values(), new String[]{"unknown", "user_cancelled", "network", "system_error", "not_available_in_storefront", "not_entitled", "unsupported", "product_unavailable", "purchase_not_allowed", "invalid_offer", "invalid_quantity", "verification_failed", "service_unavailable", "developer_error", "item_already_owned"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ProUpsellEvents$StoreViewPurchaseErrorKind valueOf(String str) {
        return (ProUpsellEvents$StoreViewPurchaseErrorKind) Enum.valueOf(ProUpsellEvents$StoreViewPurchaseErrorKind.class, str);
    }

    public static ProUpsellEvents$StoreViewPurchaseErrorKind[] values() {
        return (ProUpsellEvents$StoreViewPurchaseErrorKind[]) $VALUES.clone();
    }
}
