package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yu1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ v4g F;

    public /* synthetic */ yu1(v4g v4gVar, int i) {
        this.E = i;
        this.F = v4gVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        v4g v4gVar = this.F;
        switch (i) {
            case 0:
                ((Float) obj).getClass();
                break;
            case 1:
                xre xreVar = (xre) obj;
                q28 q28Var = v4gVar.d;
                float fH = ((ry) q28Var.F).j.h();
                float fE = ((ry) q28Var.F).c().e();
                float f = fH < fE ? fE - fH : 0.0f;
                xreVar.m(f > MTTypesetterKt.kLineSkipLimitMultiplier ? (Float.intBitsToFloat((int) (xreVar.V & 4294967295L)) + f) / Float.intBitsToFloat((int) (xreVar.V & 4294967295L)) : 1.0f);
                xreVar.u(yb5.e(0.5f, MTTypesetterKt.kLineSkipLimitMultiplier));
                break;
            default:
                xre xreVar2 = (xre) obj;
                q28 q28Var2 = v4gVar.d;
                float fH2 = ((ry) q28Var2.F).j.h();
                float fE2 = ((ry) q28Var2.F).c().e();
                float f2 = fH2 < fE2 ? fE2 - fH2 : 0.0f;
                xreVar2.m(f2 > MTTypesetterKt.kLineSkipLimitMultiplier ? 1.0f / ((Float.intBitsToFloat((int) (xreVar2.V & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & xreVar2.V))) : 1.0f);
                xreVar2.u(yb5.e(0.5f, MTTypesetterKt.kLineSkipLimitMultiplier));
                break;
        }
        return ieiVar;
    }
}
