package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sug extends qw5 implements d8d, ds7, dt7 {
    public zy7 U;
    public boolean V;
    public final e0h W;

    public sug(zy7 zy7Var) {
        this.U = zy7Var;
        a20 a20Var = new a20(1, this);
        t7d t7dVar = a0h.a;
        e0h e0hVar = new e0h(null, null, null, a20Var);
        p1(e0hVar);
        this.W = e0hVar;
    }

    @Override // defpackage.d8d
    public final void C(t7d t7dVar, u7d u7dVar, long j) {
        this.W.C(t7dVar, u7dVar, j);
    }

    @Override // defpackage.ds7
    public final void N(ft7 ft7Var) {
        this.V = ft7Var.b();
    }

    @Override // defpackage.d8d
    public final void R() {
        this.W.R();
    }

    @Override // defpackage.d8d
    public final long q() {
        return eve.h.a(yfd.W(this).d0);
    }
}
