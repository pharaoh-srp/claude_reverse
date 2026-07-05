package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x5b implements h5b {
    public final h5b E;
    public final z5b F;
    public final a6b G;

    public x5b(h5b h5bVar, z5b z5bVar, a6b a6bVar) {
        this.E = h5bVar;
        this.F = z5bVar;
        this.G = a6bVar;
    }

    @Override // defpackage.h5b
    public final int Q(int i) {
        return this.E.Q(i);
    }

    @Override // defpackage.h5b
    public final int a(int i) {
        return this.E.a(i);
    }

    @Override // defpackage.h5b
    public final int l(int i) {
        return this.E.l(i);
    }

    @Override // defpackage.h5b
    public final int o(int i) {
        return this.E.o(i);
    }

    @Override // defpackage.h5b
    public final c3d u(long j) {
        z5b z5bVar = z5b.F;
        h5b h5bVar = this.E;
        a6b a6bVar = this.G;
        a6b a6bVar2 = a6b.E;
        z5b z5bVar2 = this.F;
        if (a6bVar == a6bVar2) {
            return new y5b(z5bVar2 == z5bVar ? h5bVar.o(rl4.g(j)) : h5bVar.l(rl4.g(j)), rl4.c(j) ? rl4.g(j) : 32767);
        }
        return new y5b(rl4.d(j) ? rl4.h(j) : 32767, z5bVar2 == z5bVar ? h5bVar.a(rl4.h(j)) : h5bVar.Q(rl4.h(j)));
    }

    @Override // defpackage.h5b
    public final Object z() {
        return this.E.z();
    }
}
