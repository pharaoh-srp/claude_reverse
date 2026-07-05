package defpackage;

import com.anthropic.claude.api.chat.RenderingMode;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class mge extends nq6 {
    public static final mge d;

    static {
        RenderingMode.Companion.getClass();
        d = new mge((KSerializer) RenderingMode.$cachedKeepSerializer$delegate.getValue(), RenderingMode.MESSAGES);
    }
}
