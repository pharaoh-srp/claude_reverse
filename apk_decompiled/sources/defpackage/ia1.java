package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lia1;", "Lnqb;", "Lha1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class ia1 extends nqb {
    public ha1 E;
    public v84 F;

    public final Object c(vp4 vp4Var) throws Throwable {
        v84 v84VarC = this.F;
        if (v84VarC == null) {
            v84VarC = zni.c();
            this.F = v84VarC;
            ha1 ha1Var = this.E;
            if (ha1Var != null && ha1Var.R) {
                ha1Var.S = kvk.l(ha1Var, new l0(ha1Var, 17, ha1Var.T));
            }
        }
        Object objW = v84VarC.w(vp4Var);
        return objW == m45.E ? objW : iei.a;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new ha1(this);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 234;
    }

    @Override // defpackage.nqb
    public final /* bridge */ /* synthetic */ void update(hqb hqbVar) {
    }
}
