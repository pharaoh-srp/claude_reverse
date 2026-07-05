package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bh4 implements a45 {
    public final b45 E;
    public final l9d F;

    public bh4(b45 b45Var, l9d l9dVar) {
        l9dVar.getClass();
        this.E = b45Var;
        this.F = l9dVar;
    }

    @Override // defpackage.c45
    public final Object K(pz7 pz7Var, Object obj) {
        return pz7Var.invoke(obj, this);
    }

    @Override // defpackage.c45
    public final c45 S(b45 b45Var) {
        return nai.W(this, b45Var);
    }

    @Override // defpackage.a45
    public final b45 getKey() {
        return this.E;
    }

    @Override // defpackage.c45
    public final c45 r0(c45 c45Var) {
        return nai.Z(this, c45Var);
    }

    @Override // defpackage.c45
    public final a45 x0(b45 b45Var) {
        return nai.C(this, b45Var);
    }
}
