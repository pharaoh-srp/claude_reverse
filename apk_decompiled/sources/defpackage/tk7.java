package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tk7 extends hqb implements pu9 {
    public e56 S;
    public float T;

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        int iJ;
        int iH;
        int iG;
        int i;
        if (!rl4.d(j) || this.S == e56.E) {
            iJ = rl4.j(j);
            iH = rl4.h(j);
        } else {
            int iRound = Math.round(rl4.h(j) * this.T);
            int iJ2 = rl4.j(j);
            iJ = rl4.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!rl4.c(j) || this.S == e56.F) {
            int i2 = rl4.i(j);
            int iG2 = rl4.g(j);
            iG = i2;
            i = iG2;
        } else {
            int iRound2 = Math.round(rl4.g(j) * this.T);
            int i3 = rl4.i(j);
            iG = rl4.g(j);
            if (iRound2 < i3) {
                iRound2 = i3;
            }
            if (iRound2 <= iG) {
                iG = iRound2;
            }
            i = iG;
        }
        c3d c3dVarU = h5bVar.u(sl4.a(iJ, iH, iG, i));
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new mf1(c3dVarU, 1));
    }
}
