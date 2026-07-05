package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class c3d {
    public int E;
    public int F;
    public long G = 0;
    public long H = d3d.a;
    public long I = 0;

    public abstract int R(ut utVar);

    public int S() {
        return (int) (this.G & 4294967295L);
    }

    public int X() {
        return (int) (this.G >> 32);
    }

    public final void Y() {
        this.E = wd6.e0((int) (this.G >> 32), rl4.j(this.H), rl4.h(this.H));
        int iE0 = wd6.e0((int) (this.G & 4294967295L), rl4.i(this.H), rl4.g(this.H));
        this.F = iE0;
        int i = this.E;
        long j = this.G;
        this.I = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iE0 - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void Z(long j, float f, bz7 bz7Var);

    public void a0(long j, float f, ja8 ja8Var) {
        Z(j, f, null);
    }

    public final void b0(long j) {
        if (g79.b(this.G, j)) {
            return;
        }
        this.G = j;
        Y();
    }

    public final void d0(long j) {
        if (rl4.b(this.H, j)) {
            return;
        }
        this.H = j;
        Y();
    }

    public Object z() {
        return null;
    }
}
