package defpackage;

import com.anthropic.claude.analytics.events.UsageCreditsEvents$CreditPackPurchaseStage;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class pli {
    public final KSerializer serializer() {
        return (KSerializer) UsageCreditsEvents$CreditPackPurchaseStage.$cachedSerializer$delegate.getValue();
    }
}
