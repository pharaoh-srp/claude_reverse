package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wa9 extends ab9 {
    public za9 S;
    public boolean T;

    @Override // defpackage.ab9, defpackage.pu9
    public final int A0(fma fmaVar, h5b h5bVar, int i) {
        return this.S == za9.E ? h5bVar.Q(i) : h5bVar.a(i);
    }

    @Override // defpackage.ab9, defpackage.pu9
    public final int l0(fma fmaVar, h5b h5bVar, int i) {
        return this.S == za9.E ? h5bVar.Q(i) : h5bVar.a(i);
    }

    @Override // defpackage.ab9
    public final long p1(h5b h5bVar, long j) {
        int iQ = this.S == za9.E ? h5bVar.Q(rl4.h(j)) : h5bVar.a(rl4.h(j));
        if (iQ < 0) {
            iQ = 0;
        }
        if (iQ < 0) {
            d39.a("height must be >= 0");
        }
        return sl4.h(0, Integer.MAX_VALUE, iQ, iQ);
    }

    @Override // defpackage.ab9
    public final boolean q1() {
        return this.T;
    }
}
