package androidx.compose.foundation;

import defpackage.fsh;
import defpackage.h19;
import defpackage.hqb;
import defpackage.ko3;
import defpackage.mdj;
import defpackage.nqb;
import defpackage.vue;
import defpackage.x44;
import defpackage.zub;
import defpackage.zy7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Lnqb;", "Lko3;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class ClickableElement extends nqb {
    public final zub E;
    public final h19 F;
    public final boolean G;
    public final boolean H;
    public final String I;
    public final vue J;
    public final zy7 K;

    public ClickableElement(zub zubVar, h19 h19Var, boolean z, boolean z2, String str, vue vueVar, zy7 zy7Var) {
        this.E = zubVar;
        this.F = h19Var;
        this.G = z;
        this.H = z2;
        this.I = str;
        this.J = vueVar;
        this.K = zy7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new ko3(this.E, this.F, this.G, this.H, this.I, this.J, this.K);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return x44.r(this.E, clickableElement.E) && x44.r(this.F, clickableElement.F) && this.G == clickableElement.G && this.H == clickableElement.H && x44.r(this.I, clickableElement.I) && x44.r(this.J, clickableElement.J) && this.K == clickableElement.K;
    }

    public final int hashCode() {
        zub zubVar = this.E;
        int iHashCode = (zubVar != null ? zubVar.hashCode() : 0) * 31;
        h19 h19Var = this.F;
        int iP = fsh.p(fsh.p((iHashCode + (h19Var != null ? h19Var.hashCode() : 0)) * 31, 31, this.G), 31, this.H);
        String str = this.I;
        int iHashCode2 = (iP + (str != null ? str.hashCode() : 0)) * 31;
        vue vueVar = this.J;
        return this.K.hashCode() + ((iHashCode2 + (vueVar != null ? Integer.hashCode(vueVar.a) : 0)) * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((ko3) hqbVar).D1(this.E, this.F, this.G, this.H, this.I, this.J, this.K);
    }
}
