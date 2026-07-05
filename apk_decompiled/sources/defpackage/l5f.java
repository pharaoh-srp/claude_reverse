package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l5f implements i4a, AutoCloseable {
    public final String E;
    public final k5f F;
    public boolean G;

    public l5f(String str, k5f k5fVar) {
        this.E = str;
        this.F = k5fVar;
    }

    public final void c(q28 q28Var, c4a c4aVar) {
        q28Var.getClass();
        c4aVar.getClass();
        if (this.G) {
            sz6.j("Already attached to lifecycleOwner");
            return;
        }
        this.G = true;
        c4aVar.a(this);
        q28Var.B(this.E, (m5f) this.F.a.I);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.i4a
    public final void d(m4a m4aVar, y3a y3aVar) {
        if (y3aVar == y3a.ON_DESTROY) {
            this.G = false;
            m4aVar.a().c(this);
        }
    }
}
