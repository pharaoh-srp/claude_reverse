package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ma0 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ wlg F;

    public /* synthetic */ ma0(wlg wlgVar, int i) {
        this.E = i;
        this.F = wlgVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        wlg wlgVar = this.F;
        switch (i) {
            case 0:
                xre xreVar = (xre) obj;
                xreVar.getClass();
                xreVar.b(((Number) wlgVar.getValue()).floatValue());
                break;
            case 1:
                xre xreVar2 = (xre) obj;
                xreVar2.getClass();
                xreVar2.b(((Number) wlgVar.getValue()).floatValue());
                break;
            case 2:
                xd6 xd6Var = (xd6) obj;
                long j = ((d54) wlgVar.getValue()).a;
                if (!d54.c(j, d54.h)) {
                    xd6Var.T0(j, 0L, (58 & 4) != 0 ? xd6.h0(xd6Var.g(), 0L) : 0L, (58 & 8) != 0 ? 1.0f : MTTypesetterKt.kLineSkipLimitMultiplier, (58 & 16) != 0 ? qk7.a : null, (58 & 32) != 0 ? null : null, (58 & 64) != 0 ? 3 : 0);
                }
                break;
            default:
                xre xreVar3 = (xre) obj;
                xreVar3.getClass();
                xreVar3.d(true);
                xreVar3.o(xve.b(((va6) wlgVar.getValue()).E));
                break;
        }
        return ieiVar;
    }
}
