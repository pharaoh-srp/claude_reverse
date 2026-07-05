package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class wc6 {
    public final h5b a;
    public final int b;
    public boolean c;
    public int d;
    public int e;
    public y69 f;

    public wc6(h5b h5bVar, cz5 cz5Var) {
        this.a = h5bVar;
        Object objZ = h5bVar.z();
        lqc lqcVar = objZ instanceof lqc ? (lqc) objZ : null;
        float f = lqcVar != null ? lqcVar.e : Float.NaN;
        this.b = cz5Var.M0(Float.isNaN(f) ? MTTypesetterKt.kLineSkipLimitMultiplier : f);
        this.e = Integer.MAX_VALUE;
    }
}
