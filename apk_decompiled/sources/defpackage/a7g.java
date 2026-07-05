package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La7g;", "Lnqb;", "Lb7g;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final /* data */ class a7g extends nqb {
    public final e0g E;
    public final tzf F;

    public a7g(e0g e0gVar, tzf tzfVar) {
        this.E = e0gVar;
        this.F = tzfVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        b7g b7gVar = new b7g();
        b7gVar.S = this.E;
        b7gVar.T = this.F;
        return b7gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7g)) {
            return false;
        }
        a7g a7gVar = (a7g) obj;
        return x44.r(this.E, a7gVar.E) && x44.r(this.F, a7gVar.F);
    }

    public final int hashCode() {
        return this.F.hashCode() + (this.E.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleDropShadowElement(shape=" + this.E + ", shadow=" + this.F + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        b7g b7gVar = (b7g) hqbVar;
        e0g e0gVar = b7gVar.S;
        e0g e0gVar2 = this.E;
        boolean zR = x44.r(e0gVar, e0gVar2);
        tzf tzfVar = this.F;
        if (!zR || !x44.r(b7gVar.T, tzfVar)) {
            b7gVar.U = null;
        }
        b7gVar.S = e0gVar2;
        b7gVar.T = tzfVar;
    }
}
