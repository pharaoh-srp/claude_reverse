package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Len0;", "Lnqb;", "Lr25;", "Lsjf;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class en0 extends nqb implements sjf {
    public final boolean E;
    public final bz7 F;

    public en0(bz7 bz7Var, boolean z) {
        this.E = z;
        this.F = bz7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new r25(this.F, this.E, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en0)) {
            return false;
        }
        en0 en0Var = (en0) obj;
        return this.E == en0Var.E && this.F == en0Var.F;
    }

    @Override // defpackage.sjf
    public final qjf getSemanticsConfiguration() {
        qjf qjfVar = new qjf();
        qjfVar.G = this.E;
        this.F.invoke(qjfVar);
        return qjfVar;
    }

    public final int hashCode() {
        return this.F.hashCode() + (Boolean.hashCode(this.E) * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        r25 r25Var = (r25) hqbVar;
        r25Var.S = this.E;
        r25Var.U = this.F;
    }
}
