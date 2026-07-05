package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ac extends r3g {
    public final dpf a;
    public final lsc b;
    public final lsc c;

    public ac(dpf dpfVar, s1g s1gVar, l9e l9eVar) {
        this.a = dpfVar;
        this.b = mpk.P(s1gVar);
        this.c = mpk.P(l9eVar);
    }

    @Override // defpackage.r3g
    public final r3g a(g2g g2gVar, s1g s1gVar, long j, long j2, long j3) {
        lsc lscVar = this.b;
        oq5.n(this.a, j, j2, j3, !x44.r((s1g) lscVar.getValue(), s1gVar));
        lscVar.setValue(s1gVar);
        return this;
    }

    @Override // defpackage.r3g
    public final l9e c() {
        return (l9e) this.c.getValue();
    }

    @Override // defpackage.r3g
    public final boolean d() {
        return true;
    }

    @Override // defpackage.r3g
    public final dpf e() {
        return this.a;
    }

    @Override // defpackage.r3g
    public final r3g g(s1g s1gVar) {
        return this;
    }

    @Override // defpackage.r3g
    public final r3g h() {
        dpf dpfVar = this.a;
        d4c.x(fcc.i(((fcc) ((lsc) dpfVar.I).getValue()).a, ((fcc) ((lsc) dpfVar.H).getValue()).a), ((k8g) ((lsc) dpfVar.F).getValue()).a);
        h2g h2gVar = ((s1g) this.b.getValue()).U;
        lsc lscVar = h2gVar.M;
        b3g b3gVar = (b3g) ((h3g) lscVar.getValue()).b.getValue();
        cu9 cu9Var = h2gVar.d().b.J;
        if (cu9Var == null) {
            sz6.p("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
            return null;
        }
        csg.T(cu9Var.k());
        b3gVar.getClass();
        return g4c.a;
    }

    @Override // defpackage.r3g
    public final void i(l9e l9eVar) {
        this.c.setValue(l9eVar);
    }
}
