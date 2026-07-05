package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llkb;", "Lnqb;", "Lmkb;", "adaptive-layout"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
final /* data */ class lkb extends nqb {
    @Override // defpackage.nqb
    public final hqb create() {
        mkb mkbVar = new mkb();
        mkbVar.S = 48.0f;
        return mkbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lkb) && va6.b(48.0f, 48.0f);
    }

    public final int hashCode() {
        return Float.hashCode(48.0f);
    }

    public final String toString() {
        return "MinTouchTargetSizeElement(size=" + ((Object) va6.c(48.0f)) + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((mkb) hqbVar).S = 48.0f;
    }
}
