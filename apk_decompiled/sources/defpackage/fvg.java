package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fvg {
    public final ivg a;
    public nv9 b;
    public final evg c = new evg(this, 2);
    public final evg d = new evg(this, 0);
    public final evg e = new evg(this, 1);

    public fvg(ivg ivgVar) {
        this.a = ivgVar;
    }

    public final nv9 a() {
        nv9 nv9Var = this.b;
        if (nv9Var != null) {
            return nv9Var;
        }
        sz6.p("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
