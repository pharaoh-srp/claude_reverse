package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld35;", "Lnqb;", "Lg35;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final /* data */ class d35 extends nqb {
    public final f5i E;
    public final cjh F;
    public final m2a G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final occ K;
    public final zhh L;
    public final xy8 M;
    public final bt7 N;

    public d35(f5i f5iVar, cjh cjhVar, m2a m2aVar, boolean z, boolean z2, boolean z3, occ occVar, zhh zhhVar, xy8 xy8Var, bt7 bt7Var) {
        this.E = f5iVar;
        this.F = cjhVar;
        this.G = m2aVar;
        this.H = z;
        this.I = z2;
        this.J = z3;
        this.K = occVar;
        this.L = zhhVar;
        this.M = xy8Var;
        this.N = bt7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        g35 g35Var = new g35();
        g35Var.U = this.E;
        g35Var.V = this.F;
        g35Var.W = this.G;
        g35Var.X = this.H;
        g35Var.Y = this.I;
        g35Var.Z = this.J;
        g35Var.a0 = this.K;
        zhh zhhVar = this.L;
        g35Var.b0 = zhhVar;
        g35Var.c0 = this.M;
        g35Var.d0 = this.N;
        zhhVar.g = new e35(g35Var, 3);
        return g35Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d35) {
            d35 d35Var = (d35) obj;
            if (this.E.equals(d35Var.E) && x44.r(this.F, d35Var.F) && this.G == d35Var.G && this.H == d35Var.H && this.I == d35Var.I && this.J == d35Var.J && x44.r(this.K, d35Var.K) && this.L == d35Var.L && x44.r(this.M, d35Var.M) && x44.r(this.N, d35Var.N)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.N.hashCode() + ((this.M.hashCode() + ((this.L.hashCode() + ((this.K.hashCode() + fsh.p(fsh.p(fsh.p((this.G.hashCode() + ((this.F.hashCode() + (this.E.hashCode() * 31)) * 31)) * 31, 31, this.H), 31, this.I), 31, this.J)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.E + ", value=" + this.F + ", state=" + this.G + ", readOnly=" + this.H + ", enabled=" + this.I + ", isPassword=" + this.J + ", offsetMapping=" + this.K + ", manager=" + this.L + ", imeOptions=" + this.M + ", focusRequester=" + this.N + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        g35 g35Var = (g35) hqbVar;
        boolean z = g35Var.Y;
        boolean z2 = false;
        boolean z3 = z && !g35Var.X;
        boolean z4 = g35Var.Z;
        xy8 xy8Var = g35Var.c0;
        zhh zhhVar = g35Var.b0;
        boolean z5 = this.H;
        boolean z6 = this.I;
        if (z6 && !z5) {
            z2 = true;
        }
        g35Var.U = this.E;
        cjh cjhVar = this.F;
        g35Var.V = cjhVar;
        g35Var.W = this.G;
        g35Var.X = z5;
        g35Var.Y = z6;
        g35Var.a0 = this.K;
        zhh zhhVar2 = this.L;
        g35Var.b0 = zhhVar2;
        xy8 xy8Var2 = this.M;
        g35Var.c0 = xy8Var2;
        g35Var.d0 = this.N;
        if (z6 != z || z2 != z3 || !x44.r(xy8Var2, xy8Var) || this.J != z4 || !kkh.d(cjhVar.b)) {
            yfd.W(g35Var).V();
        }
        if (zhhVar2 != zhhVar) {
            zhhVar2.g = new xi4(2, g35Var);
        }
    }
}
