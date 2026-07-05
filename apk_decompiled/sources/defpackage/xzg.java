package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class xzg extends vp4 implements a08, uzg {
    private final int arity;

    public xzg(int i, tp4 tp4Var) {
        super(tp4Var);
        this.arity = i;
    }

    @Override // defpackage.a08
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.vd1
    public String toString() {
        return getCompletion() == null ? jce.a.i(this) : super.toString();
    }
}
