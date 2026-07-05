package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nx8 {
    public static final efe a;
    public static final efe b;
    public static final efe c;
    public static final efe d;
    public static final efe e;
    public static final efe f;
    public static final efe g;

    static {
        int i = 1;
        a = new efe(i, r5i.a);
        b = new efe(i, jqi.b);
        Object obj = null;
        c = new efe(i, obj);
        Boolean bool = Boolean.TRUE;
        d = new efe(i, bool);
        e = new efe(i, obj);
        f = new efe(i, bool);
        g = new efe(i, Boolean.FALSE);
    }

    public static final boolean a(jx8 jx8Var) {
        return ((Boolean) dch.y(jx8Var, f)).booleanValue();
    }

    public static final efe b() {
        return g;
    }

    public static final boolean c(jx8 jx8Var) {
        return ((Boolean) dch.y(jx8Var, g)).booleanValue();
    }

    public static final efe d() {
        return b;
    }

    public static final Bitmap.Config e(jx8 jx8Var) {
        return (Bitmap.Config) dch.y(jx8Var, b);
    }

    public static final Bitmap.Config f(qjc qjcVar) {
        return (Bitmap.Config) dch.z(qjcVar, b);
    }

    public static final c4a g(jx8 jx8Var) {
        return (c4a) dch.y(jx8Var, e);
    }

    public static final r5i h(jx8 jx8Var) {
        return (r5i) dch.y(jx8Var, a);
    }
}
