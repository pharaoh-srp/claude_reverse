package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d1a extends co5 {
    public static final /* synthetic */ wn9[] L;
    public final uqb G;
    public final ww7 H;
    public final dfa I;
    public final dfa J;
    public final g1a K;

    static {
        kce kceVar = jce.a;
        L = new wn9[]{kceVar.g(new mrd(kceVar.b(d1a.class), "fragments", "getFragments()Ljava/util/List;")), kceVar.g(new mrd(kceVar.b(d1a.class), "empty", "getEmpty()Z"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1a(uqb uqbVar, ww7 ww7Var, gfa gfaVar) {
        super(dd8.F, ww7Var.g());
        ww7Var.getClass();
        gfaVar.getClass();
        this.G = uqbVar;
        this.H = ww7Var;
        this.I = new dfa(gfaVar, new c1a(this, 1));
        this.J = new dfa(gfaVar, new c1a(this, 0));
        this.K = new g1a(gfaVar, new c1a(this, 2));
    }

    @Override // defpackage.bo5
    public final Object E(fo5 fo5Var, Object obj) {
        return fo5Var.o(this, obj);
    }

    public final boolean equals(Object obj) {
        d1a d1aVar = obj instanceof d1a ? (d1a) obj : null;
        return d1aVar != null && x44.r(this.H, d1aVar.H) && x44.r(this.G, d1aVar.G);
    }

    @Override // defpackage.bo5
    public final bo5 h() {
        ww7 ww7Var = this.H;
        if (ww7Var.d()) {
            return null;
        }
        return this.G.a0(ww7Var.e());
    }

    public final int hashCode() {
        return this.H.hashCode() + (this.G.hashCode() * 31);
    }
}
