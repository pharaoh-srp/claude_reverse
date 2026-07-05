package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kuc implements a45 {
    public static final lja F = new lja(25);
    public final juc E;

    public kuc(juc jucVar) {
        this.E = jucVar;
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
        return F;
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
