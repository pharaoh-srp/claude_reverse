package defpackage;

import com.anthropic.claude.api.account.BillingType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class pp1 {
    public final KSerializer serializer() {
        return (KSerializer) BillingType.$cachedSerializer$delegate.getValue();
    }
}
