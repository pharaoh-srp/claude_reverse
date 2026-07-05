package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lt1g;", "Lnqb;", "Ls1g;", "animation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final /* data */ class t1g extends nqb {
    public final h2g E;

    public t1g(h2g h2gVar) {
        this.E = h2gVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new s1g(this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1g) && this.E == ((t1g) obj).E;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.E + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        s1g s1gVar = (s1g) hqbVar;
        h2g h2gVar = s1gVar.U;
        h2g h2gVar2 = this.E;
        if (h2gVar2 != h2gVar) {
            h2gVar.E.setValue(Boolean.FALSE);
            s1gVar.U = h2gVar2;
            h2gVar2.E.setValue(Boolean.valueOf(s1gVar.R));
            if (s1gVar.R) {
                s1gVar.r1();
            }
        }
    }
}
