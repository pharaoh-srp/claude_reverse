package defpackage;

import androidx.window.extensions.WindowExtensionsProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class hd7 {
    static {
        jce.a.b(hd7.class).f();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | NullPointerException | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
