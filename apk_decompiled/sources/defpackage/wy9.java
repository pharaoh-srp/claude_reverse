package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wy9 extends hqb implements pu9 {
    public static final uy9 W = new uy9();
    public xy9 S;
    public n78 T;
    public boolean U;
    public ukc V;

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        c3d c3dVarU = h5bVar.u(j);
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new mf1(c3dVarU, 3));
    }

    public final boolean p1(sy9 sy9Var, int i) {
        if (!vwk.e(i, 5) && !vwk.e(i, 6)) {
            if (vwk.e(i, 3) || vwk.e(i, 4)) {
                if (this.V != ukc.E) {
                }
            } else if (!vwk.e(i, 1) && !vwk.e(i, 2)) {
                sz6.j("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (q1(i)) {
            }
        } else if (this.V != ukc.F) {
            if (q1(i) ? sy9Var.a > 0 : sy9Var.b < this.S.a() - 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean q1(int i) {
        if (vwk.e(i, 1)) {
            return false;
        }
        if (!vwk.e(i, 2)) {
            if (vwk.e(i, 5)) {
                return this.U;
            }
            if (vwk.e(i, 6)) {
                if (this.U) {
                    return false;
                }
            } else if (vwk.e(i, 3)) {
                int iOrdinal = yfd.W(this).e0.ordinal();
                if (iOrdinal == 0) {
                    return this.U;
                }
                if (iOrdinal != 1) {
                    mr9.b();
                    return false;
                }
                if (this.U) {
                    return false;
                }
            } else {
                if (!vwk.e(i, 4)) {
                    sz6.j("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
                int iOrdinal2 = yfd.W(this).e0.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        return this.U;
                    }
                    mr9.b();
                    return false;
                }
                if (this.U) {
                    return false;
                }
            }
        }
        return true;
    }
}
