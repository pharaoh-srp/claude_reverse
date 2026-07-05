package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ehi extends hqb implements pu9 {
    public float S;
    public float T;

    @Override // defpackage.pu9
    public final int A0(fma fmaVar, h5b h5bVar, int i) {
        int iQ = h5bVar.Q(i);
        int iM0 = !Float.isNaN(this.T) ? fmaVar.M0(this.T) : 0;
        return iQ < iM0 ? iM0 : iQ;
    }

    @Override // defpackage.pu9
    public final int N0(fma fmaVar, h5b h5bVar, int i) {
        int iL = h5bVar.l(i);
        int iM0 = !Float.isNaN(this.S) ? fmaVar.M0(this.S) : 0;
        return iL < iM0 ? iM0 : iL;
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        int iJ;
        int i;
        if (Float.isNaN(this.S) || rl4.j(j) != 0) {
            iJ = rl4.j(j);
        } else {
            int iM0 = q5bVar.M0(this.S);
            iJ = rl4.h(j);
            if (iM0 < 0) {
                iM0 = 0;
            }
            if (iM0 <= iJ) {
                iJ = iM0;
            }
        }
        int iH = rl4.h(j);
        if (Float.isNaN(this.T) || rl4.i(j) != 0) {
            i = rl4.i(j);
        } else {
            int iM02 = q5bVar.M0(this.T);
            i = rl4.g(j);
            int i2 = iM02 >= 0 ? iM02 : 0;
            if (i2 <= i) {
                i = i2;
            }
        }
        c3d c3dVarU = h5bVar.u(sl4.a(iJ, iH, i, rl4.g(j)));
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new mf1(c3dVarU, 10));
    }

    @Override // defpackage.pu9
    public final int h(fma fmaVar, h5b h5bVar, int i) {
        int iO = h5bVar.o(i);
        int iM0 = !Float.isNaN(this.S) ? fmaVar.M0(this.S) : 0;
        return iO < iM0 ? iM0 : iO;
    }

    @Override // defpackage.pu9
    public final int l0(fma fmaVar, h5b h5bVar, int i) {
        int iA = h5bVar.a(i);
        int iM0 = !Float.isNaN(this.T) ? fmaVar.M0(this.T) : 0;
        return iA < iM0 ? iM0 : iA;
    }
}
