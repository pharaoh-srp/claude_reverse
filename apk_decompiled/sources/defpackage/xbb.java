package defpackage;

import com.anthropic.claude.api.account.MemoryMode;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class xbb extends nq6 {
    public static final xbb d;

    static {
        MemoryMode.Companion.getClass();
        d = new xbb((KSerializer) MemoryMode.$cachedKeepSerializer$delegate.getValue(), MemoryMode.UNKNOWN);
    }
}
