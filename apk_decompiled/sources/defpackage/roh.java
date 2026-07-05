package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class roh implements nqc {
    public final moh E;
    public a6i F;
    public fj0 G;

    public roh(moh mohVar) {
        this.E = mohVar;
    }

    @Override // defpackage.nqc
    public final a6i a() {
        a6i a6iVar = this.F;
        if (a6iVar != null) {
            return a6iVar;
        }
        x44.o0("scaffoldStateTransition");
        throw null;
    }

    @Override // defpackage.nqc
    public final float b() {
        fj0 fj0Var = this.G;
        if (fj0Var == null) {
            x44.o0("transitionState");
            throw null;
        }
        toh tohVar = (toh) ((gff) fj0Var.E).G.getValue();
        fj0 fj0Var2 = this.G;
        if (fj0Var2 == null) {
            x44.o0("transitionState");
            throw null;
        }
        if (x44.r(tohVar, fj0Var2.x())) {
            return 1.0f;
        }
        fj0 fj0Var3 = this.G;
        if (fj0Var3 != null) {
            return ((gff) fj0Var3.E).M.h();
        }
        x44.o0("transitionState");
        throw null;
    }

    @Override // defpackage.nqc
    public final moh g() {
        return this.E;
    }
}
