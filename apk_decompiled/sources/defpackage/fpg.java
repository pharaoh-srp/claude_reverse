package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class fpg {
    public static int f = 1;
    public final int a;
    public final WeakReference b;
    public final pz7 c;
    public final pl9 d;
    public final e45 e;

    public fpg(lvg lvgVar, pz7 pz7Var, pl9 pl9Var, e45 e45Var) {
        lvgVar.getClass();
        pz7Var.getClass();
        pl9Var.getClass();
        e45Var.getClass();
        this.c = pz7Var;
        this.d = pl9Var;
        this.e = e45Var;
        int i = f;
        f = i + 1;
        this.a = i;
        this.b = new WeakReference(lvgVar);
    }
}
