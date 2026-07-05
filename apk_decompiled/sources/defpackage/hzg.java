package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hzg implements tze {
    public final oy7 E;
    public final String F;
    public boolean G;

    public hzg(oy7 oy7Var, String str) {
        this.E = oy7Var;
        this.F = str;
    }

    public final void c() {
        if (this.G) {
            u00.N(21, "statement is closed");
            throw null;
        }
    }

    @Override // defpackage.tze
    public void r() {
        c();
    }

    @Override // defpackage.tze
    public void reset() {
        c();
    }
}
