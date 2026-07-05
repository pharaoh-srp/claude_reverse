package defpackage;

import com.anthropic.claude.api.account.FeatureAccessStatus;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class tf7 extends nq6 {
    public static final tf7 d;

    static {
        FeatureAccessStatus.Companion.getClass();
        d = new tf7((KSerializer) FeatureAccessStatus.$cachedKeepSerializer$delegate.getValue(), FeatureAccessStatus.UNKNOWN);
    }
}
