package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lk59;", "Lnqb;", "Lm59;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class k59 extends nqb {
    public final wbj E;

    public k59(wbj wbjVar) {
        this.E = wbjVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new m59(this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k59) {
            return x44.r(((k59) obj).E, this.E);
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        m59 m59Var = (m59) hqbVar;
        wbj wbjVar = m59Var.U;
        wbj wbjVar2 = this.E;
        if (x44.r(wbjVar2, wbjVar)) {
            return;
        }
        m59Var.U = wbjVar2;
        m59Var.q1();
    }
}
