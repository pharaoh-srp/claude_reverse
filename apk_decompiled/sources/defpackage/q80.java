package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lq80;", "Lnqb;", "Ls80;", "adaptive-layout"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
final class q80 extends nqb {
    public final p3f E;
    public final qoh F;
    public final z8i G;
    public final j06 H = j06.U;

    public q80(p3f p3fVar, qoh qohVar, z8i z8iVar) {
        this.E = p3fVar;
        this.F = qohVar;
        this.G = z8iVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        s80 s80Var = new s80();
        s80Var.S = this.E;
        s80Var.T = this.F;
        s80Var.U = true;
        s80Var.V = -9223372034707292160L;
        s80Var.W = -9223372034707292160L;
        s80Var.X = new a5h(this.G, dgj.f, Float.valueOf(-1.0f), Float.valueOf(1.0f), null);
        return s80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q80) {
            q80 q80Var = (q80) obj;
            if (this.E == q80Var.E && this.F == q80Var.F && this.G.equals(q80Var.G) && this.H == q80Var.H) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.H.hashCode() + ((this.G.hashCode() + ((this.F.hashCode() + ((this.E.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        s80 s80Var = (s80) hqbVar;
        s80Var.S = this.E;
        s80Var.T = this.F;
        s80Var.U = true;
        s80Var.X = new a5h(this.G, dgj.f, Float.valueOf(-1.0f), Float.valueOf(1.0f), null);
    }
}
