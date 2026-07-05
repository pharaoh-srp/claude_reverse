package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fa1 implements pa2 {
    public final ea1[] E;

    public fa1(ea1[] ea1VarArr) {
        this.E = ea1VarArr;
    }

    public final void a() {
        for (ea1 ea1Var : this.E) {
            y86 y86Var = ea1Var.M;
            if (y86Var == null) {
                x44.o0("handle");
                throw null;
            }
            y86Var.a();
        }
    }

    @Override // defpackage.pa2
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.E + ']';
    }
}
