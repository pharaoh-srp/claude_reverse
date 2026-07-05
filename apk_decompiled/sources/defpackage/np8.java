package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnp8;", "Lnqb;", "Lrp8;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class np8 extends nqb {
    public final zub E;

    public np8(zub zubVar) {
        this.E = zubVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        rp8 rp8Var = new rp8();
        rp8Var.S = this.E;
        return rp8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof np8) && x44.r(((np8) obj).E, this.E);
    }

    public final int hashCode() {
        return this.E.hashCode() * 31;
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        rp8 rp8Var = (rp8) hqbVar;
        zub zubVar = rp8Var.S;
        zub zubVar2 = this.E;
        if (x44.r(zubVar, zubVar2)) {
            return;
        }
        rp8Var.r1();
        rp8Var.S = zubVar2;
    }
}
