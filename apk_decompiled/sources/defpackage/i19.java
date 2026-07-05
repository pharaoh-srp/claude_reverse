package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Li19;", "Lnqb;", "Lk19;", "material3"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final /* data */ class i19 extends nqb {
    public final boolean E;
    public final w79 F;
    public final ffh G;
    public final e0g H;

    public i19(boolean z, w79 w79Var, ffh ffhVar, e0g e0gVar) {
        this.E = z;
        this.F = w79Var;
        this.G = ffhVar;
        this.H = e0gVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new k19(this.E, this.F, this.G, this.H);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i19)) {
            return false;
        }
        i19 i19Var = (i19) obj;
        return this.E == i19Var.E && x44.r(this.F, i19Var.F) && this.G.equals(i19Var.G) && x44.r(this.H, i19Var.H) && va6.b(2.0f, 2.0f) && va6.b(1.0f, 1.0f);
    }

    public final int hashCode() {
        int iHashCode = (this.G.hashCode() + ((this.F.hashCode() + fsh.p(Boolean.hashCode(this.E) * 31, 31, false)) * 31)) * 31;
        e0g e0gVar = this.H;
        return Float.hashCode(1.0f) + vb7.b(2.0f, (iHashCode + (e0gVar != null ? e0gVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "IndicatorLineElement(enabled=" + this.E + ", isError=false, interactionSource=" + this.F + ", colors=" + this.G + ", textFieldShape=" + this.H + ", focusedIndicatorLineThickness=" + ((Object) va6.c(2.0f)) + ", unfocusedIndicatorLineThickness=" + ((Object) va6.c(1.0f)) + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        boolean z;
        k19 k19Var = (k19) hqbVar;
        boolean z2 = k19Var.U;
        boolean z3 = this.E;
        boolean z4 = true;
        if (z2 != z3) {
            k19Var.U = z3;
            z = true;
        } else {
            z = false;
        }
        w79 w79Var = k19Var.V;
        w79 w79Var2 = this.F;
        if (w79Var != w79Var2) {
            k19Var.V = w79Var2;
            fkg fkgVar = k19Var.Z;
            tp4 tp4Var = null;
            if (fkgVar != null) {
                fkgVar.d(null);
            }
            k19Var.Z = gb9.D(k19Var.d1(), null, null, new j19(k19Var, tp4Var, 3), 3);
        }
        ffh ffhVar = k19Var.a0;
        ffh ffhVar2 = this.G;
        if (!x44.r(ffhVar, ffhVar2)) {
            k19Var.a0 = ffhVar2;
            z = true;
        }
        e0g e0gVar = k19Var.c0;
        e0g e0gVar2 = this.H;
        if (!x44.r(e0gVar, e0gVar2)) {
            if (!x44.r(k19Var.c0, e0gVar2)) {
                k19Var.c0 = e0gVar2;
                k19Var.e0.p1();
            }
            z = true;
        }
        if (!va6.b(k19Var.W, 2.0f)) {
            k19Var.W = 2.0f;
            z = true;
        }
        if (va6.b(k19Var.X, 1.0f)) {
            z4 = z;
        } else {
            k19Var.X = 1.0f;
        }
        if (z4) {
            k19Var.t1();
        }
    }
}
