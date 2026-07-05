package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lct7;", "Lnqb;", "Let7;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final /* data */ class ct7 extends nqb {
    public final bt7 E;

    public ct7(bt7 bt7Var) {
        this.E = bt7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        et7 et7Var = new et7();
        et7Var.S = this.E;
        return et7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ct7) && x44.r(this.E, ((ct7) obj).E);
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.E + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        et7 et7Var = (et7) hqbVar;
        et7Var.S.a.l(et7Var);
        bt7 bt7Var = this.E;
        et7Var.S = bt7Var;
        bt7Var.a.b(et7Var);
    }
}
