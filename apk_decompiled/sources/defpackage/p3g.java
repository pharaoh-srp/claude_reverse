package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp3g;", "Lnqb;", "Lq3g;", "animation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final /* data */ class p3g extends nqb {
    public final k3g E;

    public p3g(k3g k3gVar) {
        this.E = k3gVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        q3g q3gVar = new q3g();
        q3gVar.S = this.E;
        return q3gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p3g) && x44.r(this.E, ((p3g) obj).E);
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return "SharedTransitionScopeRootModifierElement(sharedTransitionScope=" + this.E + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        q3g q3gVar = (q3g) hqbVar;
        k3g k3gVar = q3gVar.S;
        k3g k3gVar2 = this.E;
        if (!x44.r(k3gVar2, k3gVar)) {
            d4c.a0(q3gVar, k3gVar2.H);
        }
        q3gVar.S = k3gVar2;
    }
}
