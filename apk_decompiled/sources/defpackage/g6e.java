package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg6e;", "Lnqb;", "Li6e;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final /* data */ class g6e extends nqb {
    public final h6e E;

    public g6e(h6e h6eVar) {
        this.E = h6eVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new i6e(this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g6e) && x44.r(this.E, ((g6e) obj).E);
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return "ReceiveContentElement(receiveContentListener=" + this.E + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((i6e) hqbVar).U = this.E;
    }
}
