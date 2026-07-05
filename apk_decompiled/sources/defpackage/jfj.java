package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ljfj;", "Lnqb;", "Ln5g;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class jfj extends nqb {
    public final jke E;

    public jfj(jke jkeVar) {
        this.E = jkeVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        n5g n5gVar = new n5g();
        n5gVar.S = this.E;
        return n5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        jfj jfjVar = obj instanceof jfj ? (jfj) obj : null;
        return jfjVar != null && this.E == jfjVar.E;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((n5g) hqbVar).S = this.E;
    }
}
