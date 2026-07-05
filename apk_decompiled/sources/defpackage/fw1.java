package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fw1 implements o5b {
    public final tt a;
    public final boolean b;

    public fw1(tt ttVar, boolean z) {
        this.a = ttVar;
        this.b = z;
    }

    @Override // defpackage.o5b
    public final p5b b(q5b q5bVar, List list, long j) {
        int iJ;
        int i;
        c3d c3dVarU;
        boolean zIsEmpty = list.isEmpty();
        nm6 nm6Var = nm6.E;
        if (zIsEmpty) {
            return q5bVar.U(rl4.j(j), rl4.i(j), nm6Var, new fg7(19));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            h5b h5bVar = (h5b) list.get(0);
            Object objZ = h5bVar.z();
            yv1 yv1Var = objZ instanceof yv1 ? (yv1) objZ : null;
            if (yv1Var != null ? yv1Var.T : false) {
                iJ = rl4.j(j);
                i = rl4.i(j);
                int iJ2 = rl4.j(j);
                int i2 = rl4.i(j);
                if (!((i2 >= 0) & (iJ2 >= 0))) {
                    d39.a("width and height must be >= 0");
                }
                c3dVarU = h5bVar.u(sl4.h(iJ2, iJ2, i2, i2));
            } else {
                c3dVarU = h5bVar.u(j2);
                iJ = Math.max(rl4.j(j), c3dVarU.E);
                i = Math.max(rl4.i(j), c3dVarU.F);
            }
            int i3 = i;
            int i4 = iJ;
            return q5bVar.U(i4, i3, nm6Var, new ew1(c3dVarU, h5bVar, q5bVar, i4, i3, this));
        }
        c3d[] c3dVarArr = new c3d[list.size()];
        bae baeVar = new bae();
        baeVar.E = rl4.j(j);
        bae baeVar2 = new bae();
        baeVar2.E = rl4.i(j);
        List list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i5 = 0; i5 < size; i5++) {
            h5b h5bVar2 = (h5b) list.get(i5);
            Object objZ2 = h5bVar2.z();
            yv1 yv1Var2 = objZ2 instanceof yv1 ? (yv1) objZ2 : null;
            if (yv1Var2 != null ? yv1Var2.T : false) {
                z = true;
            } else {
                c3d c3dVarU2 = h5bVar2.u(j2);
                c3dVarArr[i5] = c3dVarU2;
                baeVar.E = Math.max(baeVar.E, c3dVarU2.E);
                baeVar2.E = Math.max(baeVar2.E, c3dVarU2.F);
            }
        }
        if (z) {
            int i6 = baeVar.E;
            int i7 = i6 != Integer.MAX_VALUE ? i6 : 0;
            int i8 = baeVar2.E;
            long jA = sl4.a(i7, i6, i8 != Integer.MAX_VALUE ? i8 : 0, i8);
            int size2 = list2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                h5b h5bVar3 = (h5b) list.get(i9);
                Object objZ3 = h5bVar3.z();
                yv1 yv1Var3 = objZ3 instanceof yv1 ? (yv1) objZ3 : null;
                if (yv1Var3 != null ? yv1Var3.T : false) {
                    c3dVarArr[i9] = h5bVar3.u(jA);
                }
            }
        }
        return q5bVar.U(baeVar.E, baeVar2.E, nm6Var, new ju1(c3dVarArr, list, q5bVar, baeVar, baeVar2, this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw1)) {
            return false;
        }
        fw1 fw1Var = (fw1) obj;
        return x44.r(this.a, fw1Var.a) && this.b == fw1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.a);
        sb.append(", propagateMinConstraints=");
        return y6a.p(sb, this.b, ')');
    }
}
