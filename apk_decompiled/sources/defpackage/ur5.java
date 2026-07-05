package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ur5 implements h5b {
    public final /* synthetic */ int E;
    public final h5b F;
    public final Enum G;
    public final Enum H;

    public /* synthetic */ ur5(h5b h5bVar, Enum r2, Enum r3, int i) {
        this.E = i;
        this.F = h5bVar;
        this.G = r2;
        this.H = r3;
    }

    @Override // defpackage.h5b
    public final int Q(int i) {
        switch (this.E) {
        }
        return this.F.Q(i);
    }

    @Override // defpackage.h5b
    public final int a(int i) {
        switch (this.E) {
        }
        return this.F.a(i);
    }

    @Override // defpackage.h5b
    public final int l(int i) {
        switch (this.E) {
        }
        return this.F.l(i);
    }

    @Override // defpackage.h5b
    public final int o(int i) {
        switch (this.E) {
        }
        return this.F.o(i);
    }

    @Override // defpackage.h5b
    public final c3d u(long j) {
        int i = this.E;
        Enum r1 = this.G;
        Enum r2 = this.H;
        h5b h5bVar = this.F;
        switch (i) {
            case 0:
                eb9 eb9Var = (eb9) r2;
                ya9 ya9Var = (ya9) r1;
                ya9 ya9Var2 = ya9.F;
                if (eb9Var == eb9.E) {
                    return new rm7(ya9Var == ya9Var2 ? h5bVar.o(rl4.g(j)) : h5bVar.l(rl4.g(j)), rl4.c(j) ? rl4.g(j) : 32767, 0);
                }
                return new rm7(rl4.d(j) ? rl4.h(j) : 32767, ya9Var == ya9Var2 ? h5bVar.a(rl4.h(j)) : h5bVar.Q(rl4.h(j)), 0);
            default:
                v5c v5cVar = (v5c) r2;
                u5c u5cVar = (u5c) r1;
                u5c u5cVar2 = u5c.F;
                if (v5cVar == v5c.E) {
                    return new rm7(u5cVar == u5cVar2 ? h5bVar.o(rl4.g(j)) : h5bVar.l(rl4.g(j)), rl4.c(j) ? rl4.g(j) : 32767, 1);
                }
                return new rm7(rl4.d(j) ? rl4.h(j) : 32767, u5cVar == u5cVar2 ? h5bVar.a(rl4.h(j)) : h5bVar.Q(rl4.h(j)), 1);
        }
    }

    @Override // defpackage.h5b
    public final Object z() {
        switch (this.E) {
        }
        return this.F.z();
    }
}
