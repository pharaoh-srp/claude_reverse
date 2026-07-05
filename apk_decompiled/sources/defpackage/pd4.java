package defpackage;

import androidx.compose.runtime.ComposeRuntimeError;

/* JADX INFO: loaded from: classes.dex */
public abstract class pd4 {
    public static int a;
    public static final ugc b = new ugc("provider");
    public static final ugc c = new ugc("provider");
    public static final ugc d = new ugc("compositionLocalMap");
    public static final ugc e = new ugc("providers");
    public static final ugc f = new ugc("reference");

    public static final void a(String str) {
        throw new ComposeRuntimeError(ij0.j("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void b(String str) {
        throw new ComposeRuntimeError(ij0.j("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }
}
