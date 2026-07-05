package defpackage;

import coil3.compose.AsyncImagePainter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leo4;", "Lnqb;", "Lfo4;", "io.coil-kt.coil3:coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final /* data */ class eo4 extends nqb {
    public final jx8 E;
    public final yw8 F;
    public final p01 G;
    public final bz7 H;
    public final bz7 I;
    public final int J;
    public final tt K;
    public final jo4 L;
    public final float M;
    public final hr1 N;
    public final boolean O;
    public final d11 P;
    public final String Q;

    public eo4(jx8 jx8Var, yw8 yw8Var, p01 p01Var, bz7 bz7Var, bz7 bz7Var2, int i, tt ttVar, jo4 jo4Var, float f, hr1 hr1Var, boolean z, d11 d11Var, String str) {
        this.E = jx8Var;
        this.F = yw8Var;
        this.G = p01Var;
        this.H = bz7Var;
        this.I = bz7Var2;
        this.J = i;
        this.K = ttVar;
        this.L = jo4Var;
        this.M = f;
        this.N = hr1Var;
        this.O = z;
        this.P = d11Var;
        this.Q = str;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        p01 p01Var = this.G;
        yw8 yw8Var = this.F;
        jx8 jx8Var = this.E;
        q01 q01Var = new q01(yw8Var, jx8Var, p01Var);
        AsyncImagePainter asyncImagePainter = new AsyncImagePainter(q01Var);
        asyncImagePainter.Q = this.H;
        asyncImagePainter.R = this.I;
        asyncImagePainter.S = this.L;
        asyncImagePainter.T = this.J;
        asyncImagePainter.U = this.P;
        asyncImagePainter.o(q01Var);
        x8g x8gVar = jx8Var.q;
        return new fo4(asyncImagePainter, this.K, this.L, this.M, this.N, this.O, this.Q, x8gVar instanceof ul4 ? (ul4) x8gVar : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo4)) {
            return false;
        }
        eo4 eo4Var = (eo4) obj;
        return this.E.equals(eo4Var.E) && x44.r(this.F, eo4Var.F) && x44.r(this.G, eo4Var.G) && x44.r(this.H, eo4Var.H) && x44.r(this.I, eo4Var.I) && this.J == eo4Var.J && x44.r(this.K, eo4Var.K) && x44.r(this.L, eo4Var.L) && Float.compare(this.M, eo4Var.M) == 0 && x44.r(this.N, eo4Var.N) && this.O == eo4Var.O && x44.r(this.P, eo4Var.P) && x44.r(this.Q, eo4Var.Q);
    }

    public final int hashCode() {
        int iE = qy1.e(this.H, (this.G.hashCode() + ((this.F.hashCode() + (this.E.hashCode() * 31)) * 31)) * 31, 31);
        bz7 bz7Var = this.I;
        int iB = vb7.b(this.M, (this.L.hashCode() + ((this.K.hashCode() + vb7.c(this.J, (iE + (bz7Var == null ? 0 : bz7Var.hashCode())) * 31, 31)) * 31)) * 31, 31);
        hr1 hr1Var = this.N;
        int iP = fsh.p((iB + (hr1Var == null ? 0 : hr1Var.hashCode())) * 31, 31, this.O);
        d11 d11Var = this.P;
        int iHashCode = (iP + (d11Var == null ? 0 : d11Var.hashCode())) * 31;
        String str = this.Q;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        int i = this.J;
        String str = i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown";
        StringBuilder sb = new StringBuilder("ContentPainterElement(request=");
        sb.append(this.E);
        sb.append(", imageLoader=");
        sb.append(this.F);
        sb.append(", modelEqualityDelegate=");
        sb.append(this.G);
        sb.append(", transform=");
        sb.append(this.H);
        sb.append(", onState=");
        sb.append(this.I);
        sb.append(", filterQuality=");
        sb.append(str);
        sb.append(", alignment=");
        sb.append(this.K);
        sb.append(", contentScale=");
        sb.append(this.L);
        sb.append(", alpha=");
        sb.append(this.M);
        sb.append(", colorFilter=");
        sb.append(this.N);
        sb.append(", clipToBounds=");
        sb.append(this.O);
        sb.append(", previewHandler=");
        sb.append(this.P);
        sb.append(", contentDescription=");
        return ij0.m(sb, this.Q, ")");
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        fo4 fo4Var = (fo4) hqbVar;
        long n = fo4Var.Z.getM();
        ul4 ul4Var = fo4Var.Y;
        p01 p01Var = this.G;
        yw8 yw8Var = this.F;
        jx8 jx8Var = this.E;
        q01 q01Var = new q01(yw8Var, jx8Var, p01Var);
        AsyncImagePainter asyncImagePainter = fo4Var.Z;
        asyncImagePainter.Q = this.H;
        asyncImagePainter.R = this.I;
        jo4 jo4Var = this.L;
        asyncImagePainter.S = jo4Var;
        asyncImagePainter.T = this.J;
        asyncImagePainter.U = this.P;
        asyncImagePainter.o(q01Var);
        boolean zB = k8g.b(n, asyncImagePainter.getM());
        fo4Var.S = this.K;
        x8g x8gVar = jx8Var.q;
        fo4Var.Y = x8gVar instanceof ul4 ? (ul4) x8gVar : null;
        fo4Var.T = jo4Var;
        fo4Var.U = this.M;
        fo4Var.V = this.N;
        fo4Var.W = this.O;
        String str = fo4Var.X;
        String str2 = this.Q;
        if (!x44.r(str, str2)) {
            fo4Var.X = str2;
            yfd.W(fo4Var).V();
        }
        boolean zR = x44.r(ul4Var, fo4Var.Y);
        if (!zB || !zR) {
            yfd.W(fo4Var).T();
        }
        wd6.t0(fo4Var);
    }
}
