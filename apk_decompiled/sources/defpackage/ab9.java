package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ab9 extends hqb implements pu9 {
    @Override // defpackage.pu9
    public int A0(fma fmaVar, h5b h5bVar, int i) {
        return h5bVar.Q(i);
    }

    @Override // defpackage.pu9
    public int N0(fma fmaVar, h5b h5bVar, int i) {
        return h5bVar.l(i);
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        long jP1 = p1(h5bVar, j);
        if (q1()) {
            jP1 = sl4.e(j, jP1);
        }
        c3d c3dVarU = h5bVar.u(jP1);
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new b1(c3dVarU, 16));
    }

    @Override // defpackage.pu9
    public int h(fma fmaVar, h5b h5bVar, int i) {
        return h5bVar.o(i);
    }

    @Override // defpackage.pu9
    public int l0(fma fmaVar, h5b h5bVar, int i) {
        return h5bVar.a(i);
    }

    public abstract long p1(h5b h5bVar, long j);

    public abstract boolean q1();
}
