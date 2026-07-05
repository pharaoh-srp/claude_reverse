package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rsc extends hqb implements pu9 {
    public float S;
    public wlg T;
    public wlg U;

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        wlg wlgVar = this.T;
        int iRound = (wlgVar == null || ((Number) wlgVar.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) wlgVar.getValue()).floatValue() * this.S);
        wlg wlgVar2 = this.U;
        int iRound2 = (wlgVar2 == null || ((Number) wlgVar2.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) wlgVar2.getValue()).floatValue() * this.S);
        int iJ = iRound != Integer.MAX_VALUE ? iRound : rl4.j(j);
        int i = iRound2 != Integer.MAX_VALUE ? iRound2 : rl4.i(j);
        if (iRound == Integer.MAX_VALUE) {
            iRound = rl4.h(j);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = rl4.g(j);
        }
        c3d c3dVarU = h5bVar.u(sl4.a(iJ, iRound, i, iRound2));
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new b1(c3dVarU, 18));
    }
}
