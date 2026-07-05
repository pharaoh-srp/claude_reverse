package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class cqc {
    public final h5b a;
    public final int b;
    public final ooh c;
    public final ipc d;
    public int e;
    public int f;
    public final boolean g;
    public float h;
    public c79 i;

    public cqc(h5b h5bVar, int i, ooh oohVar, ipc ipcVar, int i2, int i3, cz5 cz5Var, long j) {
        this.a = h5bVar;
        this.b = i;
        this.c = oohVar;
        this.d = ipcVar;
        Object objZ = h5bVar.z();
        lqc lqcVar = objZ instanceof lqc ? (lqc) objZ : null;
        lqcVar = lqcVar == null ? new lqc() : lqcVar;
        icd icdVar = lqcVar.b;
        lqcVar.a.getClass();
        if (!Float.isNaN(Float.NaN)) {
            i2 = cz5Var.M0(Float.NaN);
        } else if (!Float.isInfinite(Float.NaN) && !Float.isNaN(Float.NaN)) {
            i2 = (int) (((int) (j >> 32)) * Float.NaN);
        }
        this.e = i2;
        icdVar.getClass();
        if (!Float.isNaN(Float.NaN)) {
            i3 = cz5Var.M0(Float.NaN);
        } else if (!Float.isInfinite(Float.NaN) && !Float.isNaN(Float.NaN)) {
            i3 = (int) (((int) (4294967295L & j)) * Float.NaN);
        }
        this.f = i3;
        this.g = lqcVar.d;
        this.h = MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public final void a(b3d b3dVar) {
        c79 c79Var = this.i;
        int iF = c79Var != null ? c79Var.f() : 0;
        c79 c79Var2 = this.i;
        int iC = c79Var2 != null ? c79Var2.c() : 0;
        if (!((iC >= 0) & (iF >= 0))) {
            d39.a("width and height must be >= 0");
        }
        c3d c3dVarU = this.a.u(sl4.h(iF, iF, iC, iC));
        c79 c79Var3 = this.i;
        b3dVar.f(c3dVarU, c79Var3 != null ? c79Var3.a : 0, c79Var3 != null ? c79Var3.b : 0, this.h);
    }
}
