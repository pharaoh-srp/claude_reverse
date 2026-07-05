package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fb9 extends ab9 {
    public za9 S;
    public boolean T;

    @Override // defpackage.ab9, defpackage.pu9
    public final int N0(fma fmaVar, h5b h5bVar, int i) {
        return this.S == za9.E ? h5bVar.l(i) : h5bVar.o(i);
    }

    @Override // defpackage.ab9, defpackage.pu9
    public final int h(fma fmaVar, h5b h5bVar, int i) {
        return this.S == za9.E ? h5bVar.l(i) : h5bVar.o(i);
    }

    @Override // defpackage.ab9
    public final long p1(h5b h5bVar, long j) {
        int iL = this.S == za9.E ? h5bVar.l(rl4.g(j)) : h5bVar.o(rl4.g(j));
        if (iL < 0) {
            iL = 0;
        }
        if (iL < 0) {
            d39.a("width must be >= 0");
        }
        return sl4.h(iL, iL, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.ab9
    public final boolean q1() {
        return this.T;
    }
}
