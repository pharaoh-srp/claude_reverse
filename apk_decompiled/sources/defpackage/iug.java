package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Liug;", "Lnqb;", "Lpug;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final /* data */ class iug extends nqb {
    public final qwb E;
    public final eug F;

    public iug(qwb qwbVar, eug eugVar) {
        this.E = qwbVar;
        this.F = eugVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new pug(this.E, this.F);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iug)) {
            return false;
        }
        iug iugVar = (iug) obj;
        return x44.r(iugVar.F, this.F) && x44.r(iugVar.E, this.E);
    }

    public final int hashCode() {
        return this.F.hashCode();
    }

    public final String toString() {
        return "StyleElement(styleState=" + this.E + ", style=" + this.F + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        pug pugVar = (pug) hqbVar;
        pugVar.V = this.F;
        pugVar.v1(false);
        qwb qwbVar = this.E;
        if (qwbVar == null) {
            qwbVar = new qwb(null);
        }
        if (x44.r(pugVar.c0, qwbVar)) {
            return;
        }
        pugVar.c0 = qwbVar;
        pugVar.v1(false);
        lug lugVar = pugVar.U;
        if (lugVar != null) {
            yfd.U(lugVar, 2).o1();
        } else {
            sz6.j("StyleOuterNode with no corresponding StyleInnerNode");
        }
    }
}
