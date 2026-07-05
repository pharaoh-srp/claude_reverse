package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvih;", "Lnqb;", "Lwih;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class vih extends nqb {
    public final tkh E;

    public vih(tkh tkhVar) {
        this.E = tkhVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new wih(this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vih)) {
            return false;
        }
        return x44.r(this.E, ((vih) obj).E);
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        wih wihVar = (wih) hqbVar;
        wihVar.getClass();
        tkh tkhVarY = yfd.Y(this.E, yfd.W(wihVar).e0);
        wihVar.p1(tkhVarY, (wt7) yb5.o(wihVar, ve4.k));
        uih uihVar = wihVar.U;
        if (uihVar == null) {
            throw vb7.x("Min size state is not set.");
        }
        uih.a(uihVar, null, null, tkhVarY, 23);
        yfd.W(wihVar).T();
    }
}
