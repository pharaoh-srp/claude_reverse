package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y0e implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ wlg F;
    public final /* synthetic */ wlg G;

    public /* synthetic */ y0e(wlg wlgVar, wlg wlgVar2, int i) {
        this.E = i;
        this.F = wlgVar;
        this.G = wlgVar2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        wlg wlgVar = this.G;
        wlg wlgVar2 = this.F;
        switch (i) {
            case 0:
                xd6 xd6Var = (xd6) obj;
                float fQ0 = xd6Var.q0(2.0f);
                float f = fQ0 / 2.0f;
                xd6.C0(xd6Var, ((d54) wlgVar2.getValue()).a, xd6Var.q0(qvj.s / 2.0f) - f, 0L, new ksg(fQ0, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, null, 30), 108);
                if (va6.a(((va6) wlgVar.getValue()).E, MTTypesetterKt.kLineSkipLimitMultiplier) > 0) {
                    xd6.C0(xd6Var, ((d54) wlgVar2.getValue()).a, xd6Var.q0(((va6) wlgVar.getValue()).E) - f, 0L, qk7.a, 108);
                }
                break;
            default:
                xre xreVar = (xre) obj;
                xreVar.l(((Number) wlgVar2.getValue()).floatValue());
                xreVar.m(((Number) wlgVar2.getValue()).floatValue());
                xreVar.b(((Number) wlgVar.getValue()).floatValue());
                break;
        }
        return ieiVar;
    }
}
