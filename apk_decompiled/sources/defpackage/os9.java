package defpackage;

import com.anthropic.claude.api.kyc.KycStatus;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class os9 extends nq6 {
    public static final os9 d;

    static {
        KycStatus.Companion.getClass();
        d = new os9((KSerializer) KycStatus.$cachedKeepSerializer$delegate.getValue(), KycStatus.UNKNOWN);
    }
}
