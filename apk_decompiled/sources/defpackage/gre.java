package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gre extends fre implements a08, uzg {
    public final int E;

    public gre(int i, tp4 tp4Var) {
        super(tp4Var);
        this.E = i;
    }

    @Override // defpackage.a08
    public final int getArity() {
        return this.E;
    }

    @Override // defpackage.vd1
    public final String toString() {
        return getCompletion() == null ? jce.a.i(this) : super.toString();
    }
}
