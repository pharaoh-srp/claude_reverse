package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z19 implements wlg {
    public Float E;
    public Float F;
    public final lsc G;
    public a5h H;
    public boolean I;
    public boolean J;
    public long K;
    public final /* synthetic */ b29 L;

    public z19(b29 b29Var, Float f, Float f2, y19 y19Var) {
        d9i d9iVar = dgj.f;
        this.L = b29Var;
        this.E = f;
        this.F = f2;
        this.G = mpk.P(f);
        this.H = new a5h(y19Var, d9iVar, this.E, this.F, null);
    }

    @Override // defpackage.wlg
    public final Object getValue() {
        return this.G.getValue();
    }
}
