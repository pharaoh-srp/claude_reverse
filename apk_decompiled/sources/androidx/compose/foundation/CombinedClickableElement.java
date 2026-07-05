package androidx.compose.foundation;

import defpackage.fsh;
import defpackage.hqb;
import defpackage.mdj;
import defpackage.nqb;
import defpackage.vue;
import defpackage.x44;
import defpackage.yfd;
import defpackage.z64;
import defpackage.zub;
import defpackage.zy7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Lnqb;", "Lz64;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class CombinedClickableElement extends nqb {
    public final zub E;
    public final boolean F;
    public final boolean G;
    public final String H;
    public final vue I;
    public final zy7 J;
    public final String K;
    public final zy7 L;

    public CombinedClickableElement(zy7 zy7Var, zy7 zy7Var2, zub zubVar, vue vueVar, String str, String str2, boolean z, boolean z2) {
        this.E = zubVar;
        this.F = z;
        this.G = z2;
        this.H = str;
        this.I = vueVar;
        this.J = zy7Var;
        this.K = str2;
        this.L = zy7Var2;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        String str = this.H;
        return new z64(this.J, this.L, this.E, this.I, this.K, str, this.F, this.G);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return x44.r(this.E, combinedClickableElement.E) && this.F == combinedClickableElement.F && this.G == combinedClickableElement.G && x44.r(this.H, combinedClickableElement.H) && x44.r(this.I, combinedClickableElement.I) && this.J == combinedClickableElement.J && x44.r(this.K, combinedClickableElement.K) && this.L == combinedClickableElement.L;
    }

    public final int hashCode() {
        zub zubVar = this.E;
        int iP = fsh.p(fsh.p((zubVar != null ? zubVar.hashCode() : 0) * 961, 31, this.F), 31, this.G);
        String str = this.H;
        int iHashCode = (iP + (str != null ? str.hashCode() : 0)) * 31;
        vue vueVar = this.I;
        int iHashCode2 = (this.J.hashCode() + ((iHashCode + (vueVar != null ? Integer.hashCode(vueVar.a) : 0)) * 31)) * 31;
        String str2 = this.K;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        zy7 zy7Var = this.L;
        return Boolean.hashCode(true) + ((iHashCode3 + (zy7Var != null ? zy7Var.hashCode() : 0)) * 961);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        boolean z;
        z64 z64Var = (z64) hqbVar;
        z64Var.r0 = true;
        String str = z64Var.p0;
        String str2 = this.K;
        if (!x44.r(str, str2)) {
            z64Var.p0 = str2;
            yfd.W(z64Var).V();
        }
        boolean z2 = z64Var.q0 == null;
        zy7 zy7Var = this.L;
        if (z2 != (zy7Var == null)) {
            z64Var.t1();
            yfd.W(z64Var).V();
            z = true;
        } else {
            z = false;
        }
        z64Var.q0 = zy7Var;
        boolean z3 = z64Var.Z;
        boolean z4 = this.G;
        boolean z5 = z3 != z4 ? true : z;
        z64Var.D1(this.E, null, this.F, z4, this.H, this.I, this.J);
        if (z5) {
            z64Var.E1(false);
            z64Var.E1(true);
        }
    }
}
