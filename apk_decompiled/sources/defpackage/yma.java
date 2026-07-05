package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yma extends hqb implements pu9 {
    public int S;
    public int T;

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        long jA;
        h5bVar.getClass();
        long jD = sl4.d(j, csg.f(this.S, this.T));
        if (rl4.g(j) == Integer.MAX_VALUE && rl4.h(j) != Integer.MAX_VALUE) {
            int i = (int) (jD >> 32);
            int i2 = (this.T * i) / this.S;
            jA = sl4.a(i, i, i2, i2);
        } else if (rl4.h(j) != Integer.MAX_VALUE || rl4.g(j) == Integer.MAX_VALUE) {
            int i3 = (int) (jD >> 32);
            int i4 = (int) (jD & 4294967295L);
            jA = sl4.a(i3, i3, i4, i4);
        } else {
            int i5 = (int) (jD & 4294967295L);
            int i6 = (this.S * i5) / this.T;
            jA = sl4.a(i6, i6, i5, i5);
        }
        c3d c3dVarU = h5bVar.u(jA);
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new t40(c3dVarU, 3));
    }
}
