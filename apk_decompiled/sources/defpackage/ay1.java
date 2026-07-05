package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ay1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;

    public /* synthetic */ ay1(long j, int i) {
        this.E = i;
        this.F = j;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        ua2 ua2Var;
        Object hreVar;
        int i = this.E;
        long j = this.F;
        switch (i) {
            case 0:
                by1 by1Var = (by1) obj;
                bz7 bz7Var = by1Var.b;
                if (bz7Var != null && (ua2Var = by1Var.a) != null) {
                    try {
                        hreVar = bz7Var.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        hreVar = new hre(th);
                    }
                    ua2Var.resumeWith(hreVar);
                    break;
                }
                return iei.a;
            case 1:
                b52 b52Var = (b52) obj;
                b52Var.getClass();
                float density = (b52Var.getDensity() * 32.0f) / 2.0f;
                c40 c40VarA = f40.a();
                l9e l9eVarW = d4c.w(density, eve.x(b52Var.E.g()));
                if (c40VarA.b == null) {
                    c40VarA.b = new RectF();
                }
                RectF rectF = c40VarA.b;
                rectF.getClass();
                rectF.set(l9eVarW.a, l9eVarW.b, l9eVarW.c, l9eVarW.d);
                Path path = c40VarA.a;
                RectF rectF2 = c40VarA.b;
                rectF2.getClass();
                path.addOval(rectF2, f40.b(nuc.E));
                return b52Var.b(new bt1(c40VarA, j, density));
            default:
                return Long.valueOf(j);
        }
    }
}
