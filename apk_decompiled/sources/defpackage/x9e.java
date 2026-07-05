package defpackage;

import com.anthropic.claude.api.notice.RedirectHint;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class x9e extends nq6 {
    public static final x9e d;

    static {
        RedirectHint.Companion.getClass();
        d = new x9e((KSerializer) RedirectHint.$cachedKeepSerializer$delegate.getValue(), RedirectHint.UNKNOWN);
    }
}
