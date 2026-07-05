package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aw5 implements c45 {
    public final c45 E;

    public aw5(c45 c45Var) {
        this.E = c45Var;
    }

    @Override // defpackage.c45
    public final Object K(pz7 pz7Var, Object obj) {
        return this.E.K(pz7Var, obj);
    }

    @Override // defpackage.c45
    public final c45 S(b45 b45Var) {
        c45 c45VarS = this.E.S(b45Var);
        int i = fqi.b;
        a5 a5Var = a5.G;
        a45 a45VarX0 = x0(a5Var);
        e45 e45Var = a45VarX0 instanceof e45 ? (e45) a45VarX0 : null;
        a45 a45VarX02 = c45VarS.x0(a5Var);
        e45 e45Var2 = a45VarX02 instanceof e45 ? (e45) a45VarX02 : null;
        if ((e45Var instanceof bw5) && e45Var != e45Var2) {
            ((bw5) e45Var).H = 0;
        }
        return new aw5(c45VarS);
    }

    public final boolean equals(Object obj) {
        return x44.r(this.E, obj);
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.c45
    public final c45 r0(c45 c45Var) {
        c45 c45VarR0 = this.E.r0(c45Var);
        int i = fqi.b;
        a5 a5Var = a5.G;
        a45 a45VarX0 = x0(a5Var);
        e45 e45Var = a45VarX0 instanceof e45 ? (e45) a45VarX0 : null;
        a45 a45VarX02 = c45VarR0.x0(a5Var);
        e45 e45Var2 = a45VarX02 instanceof e45 ? (e45) a45VarX02 : null;
        if ((e45Var instanceof bw5) && e45Var != e45Var2) {
            ((bw5) e45Var).H = 0;
        }
        return new aw5(c45VarR0);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.E + ")";
    }

    @Override // defpackage.c45
    public final a45 x0(b45 b45Var) {
        return this.E.x0(b45Var);
    }
}
