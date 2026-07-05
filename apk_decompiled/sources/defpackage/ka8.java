package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lka8;", "Lnqb;", "Ld7g;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final /* data */ class ka8 extends nqb {
    public final float E;
    public final float F;
    public final float G;
    public final float H;
    public final float I;
    public final float J;
    public final long K;
    public final e0g L;
    public final boolean M;
    public final long N;
    public final long O;
    public final int P;

    public ka8(float f, float f2, float f3, float f4, float f5, float f6, long j, e0g e0gVar, boolean z, long j2, long j3, int i) {
        this.E = f;
        this.F = f2;
        this.G = f3;
        this.H = f4;
        this.I = f5;
        this.J = f6;
        this.K = j;
        this.L = e0gVar;
        this.M = z;
        this.N = j2;
        this.O = j3;
        this.P = i;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        d7g d7gVar = new d7g();
        d7gVar.S = this.E;
        d7gVar.T = this.F;
        d7gVar.U = this.G;
        d7gVar.V = this.H;
        d7gVar.W = this.I;
        d7gVar.X = this.J;
        d7gVar.Y = 8.0f;
        d7gVar.Z = this.K;
        d7gVar.a0 = this.L;
        d7gVar.b0 = this.M;
        d7gVar.c0 = this.N;
        d7gVar.d0 = this.O;
        d7gVar.e0 = this.P;
        d7gVar.f0 = 3;
        d7gVar.g0 = new r1g(1, d7gVar);
        return d7gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka8)) {
            return false;
        }
        ka8 ka8Var = (ka8) obj;
        return Float.compare(this.E, ka8Var.E) == 0 && Float.compare(this.F, ka8Var.F) == 0 && Float.compare(this.G, ka8Var.G) == 0 && Float.compare(this.H, ka8Var.H) == 0 && Float.compare(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier) == 0 && Float.compare(this.I, ka8Var.I) == 0 && Float.compare(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier) == 0 && Float.compare(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier) == 0 && Float.compare(this.J, ka8Var.J) == 0 && Float.compare(8.0f, 8.0f) == 0 && d5i.a(this.K, ka8Var.K) && x44.r(this.L, ka8Var.L) && this.M == ka8Var.M && d54.c(this.N, ka8Var.N) && d54.c(this.O, ka8Var.O) && this.P == ka8Var.P;
    }

    public final int hashCode() {
        int iB = vb7.b(8.0f, vb7.b(this.J, vb7.b(MTTypesetterKt.kLineSkipLimitMultiplier, vb7.b(MTTypesetterKt.kLineSkipLimitMultiplier, vb7.b(this.I, vb7.b(MTTypesetterKt.kLineSkipLimitMultiplier, vb7.b(this.H, vb7.b(this.G, vb7.b(this.F, Float.hashCode(this.E) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = d5i.c;
        int iP = fsh.p((this.L.hashCode() + vb7.e(iB, 31, this.K)) * 31, 961, this.M);
        int i2 = d54.i;
        return vb7.c(3, vb7.c(this.P, vb7.e(vb7.e(iP, 31, this.N), 31, this.O), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.E);
        sb.append(", scaleY=");
        sb.append(this.F);
        sb.append(", alpha=");
        sb.append(this.G);
        sb.append(", translationX=");
        sb.append(this.H);
        sb.append(", translationY=0.0, shadowElevation=");
        sb.append(this.I);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.J);
        sb.append(", cameraDistance=8.0, transformOrigin=");
        sb.append((Object) d5i.d(this.K));
        sb.append(", shape=");
        sb.append(this.L);
        sb.append(", clip=");
        sb.append(this.M);
        sb.append(", renderEffect=null, ambientShadowColor=");
        y6a.q(this.N, ", spotShadowColor=", sb);
        y6a.q(this.O, ", compositingStrategy=", sb);
        sb.append((Object) ("CompositingStrategy(value=" + this.P + ')'));
        sb.append(", blendMode=");
        sb.append((Object) yb5.P(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        d7g d7gVar = (d7g) hqbVar;
        d7gVar.S = this.E;
        d7gVar.T = this.F;
        d7gVar.U = this.G;
        d7gVar.V = this.H;
        d7gVar.W = this.I;
        d7gVar.X = this.J;
        d7gVar.Y = 8.0f;
        d7gVar.Z = this.K;
        d7gVar.a0 = this.L;
        d7gVar.b0 = this.M;
        d7gVar.c0 = this.N;
        d7gVar.d0 = this.O;
        d7gVar.e0 = this.P;
        d7gVar.f0 = 3;
        dgj.V(d7gVar, d7gVar.g0);
    }
}
