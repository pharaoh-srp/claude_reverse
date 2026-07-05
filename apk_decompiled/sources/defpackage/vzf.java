package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvzf;", "Lnqb;", "Lor1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final /* data */ class vzf extends nqb {
    public final float E;
    public final e0g F;
    public final boolean G;
    public final long H;
    public final long I;

    public vzf(float f, e0g e0gVar, boolean z, long j, long j2) {
        this.E = f;
        this.F = e0gVar;
        this.G = z;
        this.H = j;
        this.I = j2;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new or1(new h4(27, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzf)) {
            return false;
        }
        vzf vzfVar = (vzf) obj;
        return va6.b(this.E, vzfVar.E) && x44.r(this.F, vzfVar.F) && this.G == vzfVar.G && d54.c(this.H, vzfVar.H) && d54.c(this.I, vzfVar.I);
    }

    public final int hashCode() {
        int iP = fsh.p((this.F.hashCode() + (Float.hashCode(this.E) * 31)) * 31, 31, this.G);
        int i = d54.i;
        return Long.hashCode(this.I) + vb7.e(iP, 31, this.H);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        ebh.v(this.E, sb, ", shape=");
        sb.append(this.F);
        sb.append(", clip=");
        sb.append(this.G);
        sb.append(", ambientColor=");
        y6a.q(this.H, ", spotColor=", sb);
        sb.append((Object) d54.i(this.I));
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        or1 or1Var = (or1) hqbVar;
        h4 h4Var = new h4(27, this);
        or1Var.S = h4Var;
        dgj.V(or1Var, h4Var);
    }
}
