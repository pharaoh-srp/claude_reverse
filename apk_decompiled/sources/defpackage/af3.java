package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Laf3;", "Lnqb;", "Lze3;", "material3"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class af3 extends nqb {
    public final f9c E;

    public af3(f9c f9cVar) {
        this.E = f9cVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        ze3 ze3Var = new ze3();
        ze3Var.S = this.E;
        return ze3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof af3) {
            return this.E == ((af3) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ze3 ze3Var = (ze3) hqbVar;
        ze3Var.S = this.E;
        yfd.W(ze3Var).V();
    }
}
