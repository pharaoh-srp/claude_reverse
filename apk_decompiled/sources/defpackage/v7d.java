package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv7d;", "Lnqb;", "Lw7d;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final /* data */ class v7d extends nqb {
    public final l40 E;

    public v7d(l40 l40Var) {
        this.E = l40Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new w7d(this.E, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7d) && this.E.equals(((v7d) obj).E);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.E.b * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.E + ", overrideDescendants=false)";
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        w7d w7dVar = (w7d) hqbVar;
        l40 l40Var = w7dVar.T;
        l40 l40Var2 = this.E;
        if (x44.r(l40Var, l40Var2)) {
            return;
        }
        w7dVar.T = l40Var2;
        if (w7dVar.U) {
            w7dVar.r1();
        }
    }
}
