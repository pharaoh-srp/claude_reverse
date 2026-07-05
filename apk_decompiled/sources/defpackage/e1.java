package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class e1 implements a45 {
    public final b45 E;

    public e1(b45 b45Var) {
        b45Var.getClass();
        this.E = b45Var;
    }

    @Override // defpackage.c45
    public final Object K(pz7 pz7Var, Object obj) {
        return pz7Var.invoke(obj, this);
    }

    @Override // defpackage.c45
    public /* bridge */ c45 S(b45 b45Var) {
        return nai.W(this, b45Var);
    }

    @Override // defpackage.a45
    public final b45 getKey() {
        return this.E;
    }

    @Override // defpackage.c45
    public final /* bridge */ c45 r0(c45 c45Var) {
        return nai.Z(this, c45Var);
    }

    @Override // defpackage.c45
    public /* bridge */ a45 x0(b45 b45Var) {
        return nai.C(this, b45Var);
    }
}
