package defpackage;

import com.anthropic.claude.api.mcp.DirectoryServerType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class p56 extends nq6 {
    public static final p56 d;

    static {
        DirectoryServerType.Companion.getClass();
        d = new p56((KSerializer) DirectoryServerType.$cachedKeepSerializer$delegate.getValue(), DirectoryServerType.REMOTE);
    }
}
