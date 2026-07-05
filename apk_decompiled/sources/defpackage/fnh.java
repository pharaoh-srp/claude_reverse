package defpackage;

import android.graphics.drawable.Drawable;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fnh implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ fnh(dc1 dc1Var, i4g i4gVar, int i) {
        this.E = 4;
        this.G = dc1Var;
        this.H = i4gVar;
        this.F = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.F;
        Object obj3 = this.H;
        Object obj4 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                yrk.a((Drawable) obj4, (String) obj3, (ld4) obj, x44.p0(1 | i2));
                break;
            case 1:
                ((Integer) obj2).getClass();
                oe5.c((ovg) obj4, (bz7) obj3, (ld4) obj, x44.p0(1 | i2));
                break;
            case 2:
                ((Integer) obj2).getClass();
                zjk.a((g4j) obj4, (bz7) obj3, (ld4) obj, x44.p0(1 | i2));
                break;
            case 3:
                rz7 rz7Var = (rz7) obj4;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    fqb fqbVar = fqb.E;
                    iqb iqbVarE = kxk.E(e18Var, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, cxeVarA);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    tjh.b((String) rz7Var.invoke(obj3, e18Var, Integer.valueOf((i2 >> 3) & 8)), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 24960, 110586);
                    iv1.b(ud0.C, null, gb9.N(fqbVar, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), ef2.F, gm3.a(e18Var).N, e18Var, 3504, 0);
                    e18Var.p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                dmk.b((dc1) obj4, (i4g) obj3, fqb.E, (ld4) obj, x44.p0(1 | i2));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ fnh(Object obj, Object obj2, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.H = obj2;
        this.F = i;
    }
}
