package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class ipa {
    public static final dkf a = new dkf("MagnifierPositionInRoot");

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static iqb b(bz7 bz7Var, bz7 bz7Var2, d5d d5dVar) {
        return a() ? new fpa(bz7Var, bz7Var2, d5dVar) : fqb.E;
    }
}
