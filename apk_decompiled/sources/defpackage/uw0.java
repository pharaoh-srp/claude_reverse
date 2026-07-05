package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Luw0;", "Lnqb;", "Lvw0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class uw0 extends nqb {
    public final float E;
    public final boolean F;

    public uw0(float f, boolean z) {
        this.E = f;
        this.F = z;
        if (f > MTTypesetterKt.kLineSkipLimitMultiplier) {
            return;
        }
        z29.a("aspectRatio " + f + " must be > 0");
    }

    @Override // defpackage.nqb
    public final hqb create() {
        vw0 vw0Var = new vw0();
        vw0Var.S = this.E;
        vw0Var.T = this.F;
        return vw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        uw0 uw0Var = obj instanceof uw0 ? (uw0) obj : null;
        if (uw0Var != null && this.E == uw0Var.E) {
            return this.F == ((uw0) obj).F;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.F) + (Float.hashCode(this.E) * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        vw0 vw0Var = (vw0) hqbVar;
        vw0Var.S = this.E;
        vw0Var.T = this.F;
    }
}
