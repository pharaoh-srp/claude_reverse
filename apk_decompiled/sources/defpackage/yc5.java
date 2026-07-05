package defpackage;

import com.anthropic.claude.api.notice.CtaIntent;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class yc5 extends nq6 {
    public static final yc5 d;

    static {
        CtaIntent.Companion.getClass();
        d = new yc5((KSerializer) CtaIntent.$cachedKeepSerializer$delegate.getValue(), CtaIntent.UNKNOWN);
    }
}
