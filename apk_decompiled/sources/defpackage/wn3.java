package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lwn3;", "Lnqb;", "Lr25;", "Lsjf;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class wn3 extends nqb implements sjf {
    public final bz7 E;

    public wn3(bz7 bz7Var) {
        this.E = bz7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new r25(this.E, false, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wn3) {
            return this.E == ((wn3) obj).E;
        }
        return false;
    }

    @Override // defpackage.sjf
    public final qjf getSemanticsConfiguration() {
        qjf qjfVar = new qjf();
        qjfVar.G = false;
        qjfVar.H = true;
        this.E.invoke(qjfVar);
        return qjfVar;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((r25) hqbVar).U = this.E;
    }
}
