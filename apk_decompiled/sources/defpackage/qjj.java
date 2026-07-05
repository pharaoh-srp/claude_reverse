package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqjj;", "Lnqb;", "Lrjj;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final /* data */ class qjj extends nqb {
    public final float E;

    public qjj(float f) {
        this.E = f;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        rjj rjjVar = new rjj();
        rjjVar.S = this.E;
        return rjjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qjj) && Float.compare(this.E, ((qjj) obj).E) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.E);
    }

    public final String toString() {
        return ebh.o(new StringBuilder("ZIndexElement(zIndex="), this.E, ')');
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((rjj) hqbVar).S = this.E;
    }
}
