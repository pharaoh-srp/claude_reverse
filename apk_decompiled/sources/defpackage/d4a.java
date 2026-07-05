package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d4a implements i4a, l45 {
    public final c4a E;
    public final c45 F;

    public d4a(c4a c4aVar, c45 c45Var) {
        c45Var.getClass();
        this.E = c4aVar;
        this.F = c45Var;
        if (c4aVar.b() == a4a.E) {
            knk.o(c45Var, null);
        }
    }

    @Override // defpackage.i4a
    public final void d(m4a m4aVar, y3a y3aVar) {
        c4a c4aVar = this.E;
        if (c4aVar.b().compareTo(a4a.E) <= 0) {
            c4aVar.c(this);
            knk.o(this.F, null);
        }
    }

    @Override // defpackage.l45
    public final c45 getCoroutineContext() {
        return this.F;
    }
}
