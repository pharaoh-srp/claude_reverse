package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class snc extends hqb implements pu9 {
    public mnc S;

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        float fB = this.S.b(q5bVar.getLayoutDirection());
        float fD = this.S.d();
        float fC = this.S.c(q5bVar.getLayoutDirection());
        float fA = this.S.a();
        if (!((va6.a(fB, MTTypesetterKt.kLineSkipLimitMultiplier) >= 0) & (va6.a(fD, MTTypesetterKt.kLineSkipLimitMultiplier) >= 0) & (va6.a(fC, MTTypesetterKt.kLineSkipLimitMultiplier) >= 0) & (va6.a(fA, MTTypesetterKt.kLineSkipLimitMultiplier) >= 0))) {
            z29.a("Padding must be non-negative");
        }
        int iM0 = q5bVar.M0(fB);
        int iM02 = q5bVar.M0(fC) + iM0;
        int iM03 = q5bVar.M0(fD);
        int iM04 = q5bVar.M0(fA) + iM03;
        c3d c3dVarU = h5bVar.u(sl4.i(-iM02, -iM04, j));
        return q5bVar.U(sl4.g(c3dVarU.E + iM02, j), sl4.f(c3dVarU.F + iM04, j), nm6.E, new l59(c3dVarU, iM0, iM03, 2));
    }
}
