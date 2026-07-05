package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface pu9 extends nw5 {
    default int A0(fma fmaVar, h5b h5bVar, int i) {
        ax5 ax5Var = new ax5(17, this);
        ur5 ur5Var = new ur5(h5bVar, u5c.E, v5c.F, 1);
        long jB = sl4.b(0, i, 0, 0, 13);
        return ((pu9) ax5Var.F).b(new mb9(fmaVar, fmaVar.getLayoutDirection()), ur5Var, jB).a();
    }

    default int N0(fma fmaVar, h5b h5bVar, int i) {
        int i2 = 1;
        return new ou9(this, i2).a(new mb9(fmaVar, fmaVar.getLayoutDirection()), new ur5(h5bVar, u5c.E, v5c.E, i2), sl4.b(0, 0, 0, i, 7)).b();
    }

    p5b b(q5b q5bVar, h5b h5bVar, long j);

    default int h(fma fmaVar, h5b h5bVar, int i) {
        return b(new mb9(fmaVar, fmaVar.getLayoutDirection()), new ur5(h5bVar, u5c.F, v5c.E, 1), sl4.b(0, 0, 0, i, 7)).b();
    }

    default int l0(fma fmaVar, h5b h5bVar, int i) {
        return new ou9(this, 0).a(new mb9(fmaVar, fmaVar.getLayoutDirection()), new ur5(h5bVar, u5c.F, v5c.F, 1), sl4.b(0, i, 0, 0, 13)).a();
    }
}
