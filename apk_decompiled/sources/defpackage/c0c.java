package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lc0c;", "Lnqb;", "Lf0c;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class c0c extends nqb {
    public final yzb E;
    public final b0c F;

    public c0c(yzb yzbVar, b0c b0cVar) {
        this.E = yzbVar;
        this.F = b0cVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new f0c(this.E, this.F);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0c)) {
            return false;
        }
        c0c c0cVar = (c0c) obj;
        return x44.r(c0cVar.E, this.E) && x44.r(c0cVar.F, this.F);
    }

    public final int hashCode() {
        int iHashCode = this.E.hashCode() * 31;
        b0c b0cVar = this.F;
        return iHashCode + (b0cVar != null ? b0cVar.hashCode() : 0);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        f0c f0cVar = (f0c) hqbVar;
        f0cVar.S = this.E;
        b0c b0cVar = f0cVar.T;
        if (b0cVar.a == f0cVar) {
            b0cVar.a = null;
        }
        b0c b0cVar2 = this.F;
        if (b0cVar2 == null) {
            f0cVar.T = new b0c();
        } else if (b0cVar2 != b0cVar) {
            f0cVar.T = b0cVar2;
        }
        if (f0cVar.R) {
            b0c b0cVar3 = f0cVar.T;
            b0cVar3.a = f0cVar;
            b0cVar3.b = null;
            f0cVar.U = null;
            b0cVar3.c = new l4(26, f0cVar);
            b0cVar3.d = f0cVar.d1();
        }
    }
}
