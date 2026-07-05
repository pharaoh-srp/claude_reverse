package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kt implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ta4 F;
    public final /* synthetic */ pz7 G;

    public /* synthetic */ kt(ta4 ta4Var, pz7 pz7Var, int i) {
        this.E = i;
        this.F = ta4Var;
        this.G = pz7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        pz7 pz7Var = this.G;
        ta4 ta4Var = this.F;
        int i2 = 1;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    float f = ((va6) e18Var.j(z79.c)).E;
                    if (Float.isNaN(f)) {
                        f = 0.0f;
                    }
                    nt.b(8.0f, ((va6) wd6.h0(new va6(8.0f - (f - q02.e)), new va6(MTTypesetterKt.kLineSkipLimitMultiplier), new va6(8.0f))).E, fd9.q0(-459506658, new kt(ta4Var, pz7Var, i2), e18Var), e18Var, 390);
                }
                break;
            case 1:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    ta4Var.invoke(e18Var2, 0);
                    if (pz7Var == null) {
                        e18Var2.a0(-1102003461);
                    } else {
                        e18Var2.a0(795735494);
                        pz7Var.invoke(e18Var2, 0);
                    }
                    e18Var2.p(false);
                }
                break;
            case 2:
                e18 e18Var3 = (e18) ld4Var;
                if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var3.T();
                } else {
                    float f2 = ((va6) e18Var3.j(z79.c)).E;
                    if (Float.isNaN(f2)) {
                        f2 = 0.0f;
                    }
                    float f3 = f2 - q02.e;
                    float f4 = zl5.b;
                    float f5 = zl5.c;
                    nt.b(f4, ((va6) wd6.h0(new va6(f5 - f3), new va6(MTTypesetterKt.kLineSkipLimitMultiplier), new va6(f5))).E, fd9.q0(-1980163584, new kt(ta4Var, pz7Var, 3), e18Var3), e18Var3, 390);
                }
                break;
            default:
                e18 e18Var4 = (e18) ld4Var;
                if (!e18Var4.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var4.T();
                } else {
                    ta4Var.invoke(e18Var4, 0);
                    if (pz7Var == null) {
                        e18Var4.a0(322568153);
                    } else {
                        e18Var4.a0(-266689240);
                        pz7Var.invoke(e18Var4, 0);
                    }
                    e18Var4.p(false);
                }
                break;
        }
        return ieiVar;
    }
}
