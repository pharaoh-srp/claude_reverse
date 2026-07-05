package defpackage;

import com.anthropic.claude.analytics.events.ProUpsellEvents$StoreViewPurchaseErrorKind;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class tgd {
    public final KSerializer serializer() {
        return (KSerializer) ProUpsellEvents$StoreViewPurchaseErrorKind.$cachedSerializer$delegate.getValue();
    }
}
