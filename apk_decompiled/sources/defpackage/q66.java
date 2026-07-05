package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q66 implements AutoCloseable {
    public final o66 E;
    public boolean F;
    public final /* synthetic */ u66 G;

    public q66(u66 u66Var, o66 o66Var) {
        this.G = u66Var;
        this.E = o66Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.F) {
            return;
        }
        this.F = true;
        u66 u66Var = this.G;
        synchronized (u66Var.L) {
            o66 o66Var = this.E;
            int i = o66Var.h - 1;
            o66Var.h = i;
            if (i == 0 && o66Var.f) {
                u66Var.H(o66Var);
            }
        }
    }
}
