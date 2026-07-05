package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lk5b;", "Lnqb;", "Ll5b;", "code"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final /* data */ class k5b extends nqb {
    public final CharSequence E;

    public k5b(CharSequence charSequence) {
        charSequence.getClass();
        this.E = charSequence;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new l5b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5b) && x44.r(this.E, ((k5b) obj).E);
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return "MeasureHackElement(text=" + ((Object) this.E) + ")";
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((l5b) hqbVar).getClass();
    }
}
