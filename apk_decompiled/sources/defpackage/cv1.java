package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cv1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ float F;
    public final /* synthetic */ Object G;

    public /* synthetic */ cv1(float f, Object obj, int i) {
        this.E = i;
        this.F = f;
        this.G = obj;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        float f = this.F;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                xre xreVar = (xre) obj;
                float fH = ((ry) ((v4g) obj2).d.F).j.h();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (xreVar.V & 4294967295L));
                if (!Float.isNaN(fH) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != MTTypesetterKt.kLineSkipLimitMultiplier) {
                    xreVar.l(gv1.c(xreVar, f));
                    xreVar.m(gv1.d(xreVar, f));
                    xreVar.u(yb5.e(0.5f, (fH + fIntBitsToFloat) / fIntBitsToFloat));
                }
                return ieiVar;
            case 1:
                xre xreVar2 = (xre) obj;
                xreVar2.getClass();
                xreVar2.w(xreVar2.W.getDensity() * f * ((mxd) obj2).a());
                return ieiVar;
            case 2:
                int iL = mwa.L(((int) (((g79) obj).a >> 32)) / f);
                isc iscVar = ((vza) obj2).q;
                if (iL != iscVar.h()) {
                    iscVar.i(iL);
                }
                return ieiVar;
            case 3:
                ed6 ed6Var = (ed6) obj;
                ed6Var.getClass();
                ((y4g) obj2).getClass();
                ed6Var.a(x4g.E, 0.6f * f);
                ed6Var.a(x4g.F, f * 1.0f);
                return ieiVar;
            case 4:
                w0e w0eVar = (w0e) obj2;
                xd6 xd6Var = (xd6) obj;
                xd6Var.getClass();
                long jP0 = xd6Var.P0();
                fj0 fj0VarB0 = xd6Var.B0();
                long jW = fj0VarB0.w();
                fj0VarB0.p().g();
                try {
                    ((efe) fj0VarB0.E).C(jP0, f, f);
                    xd6.I(xd6Var, w0eVar, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 126);
                    return ieiVar;
                } finally {
                    grc.y(fj0VarB0, jW);
                }
            default:
                ((c3d) obj).getClass();
                return Integer.valueOf(((cz5) obj2).M0(f / 2.0f));
        }
    }

    public /* synthetic */ cv1(Object obj, float f, int i) {
        this.E = i;
        this.G = obj;
        this.F = f;
    }
}
