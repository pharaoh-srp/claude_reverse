package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Loeh;", "Lnqb;", "Lpeh;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class oeh extends nqb {
    public final o1i E;
    public final bz7 F;
    public final bz7 G;
    public final bz7 H;

    public oeh(o1i o1iVar, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3) {
        this.E = o1iVar;
        this.F = bz7Var;
        this.G = bz7Var2;
        this.H = bz7Var3;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new peh(this.E, this.F, this.G, this.H);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oeh)) {
            return false;
        }
        oeh oehVar = (oeh) obj;
        return this.E == oehVar.E && this.F == oehVar.F && this.G == oehVar.G && this.H == oehVar.H;
    }

    public final int hashCode() {
        int iE = qy1.e(this.F, this.E.hashCode() * 31, 31);
        bz7 bz7Var = this.G;
        return this.H.hashCode() + ((iE + (bz7Var != null ? bz7Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        peh pehVar = (peh) hqbVar;
        pehVar.U.a = null;
        o1i o1iVar = this.E;
        pehVar.U = o1iVar;
        o1iVar.a = pehVar;
        o1iVar.b = pehVar.R ? n1i.G : n1i.F;
        pehVar.V = this.F;
        pehVar.W = this.G;
        pehVar.X = this.H;
    }
}
