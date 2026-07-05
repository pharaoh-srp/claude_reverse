package androidx.compose.foundation.layout;

import defpackage.ehi;
import defpackage.hqb;
import defpackage.mdj;
import defpackage.nqb;
import defpackage.va6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/c;", "Lnqb;", "Lehi;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class c extends nqb {
    public final float E;
    public final float F;

    public c(float f, float f2) {
        this.E = f;
        this.F = f2;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        ehi ehiVar = new ehi();
        ehiVar.S = this.E;
        ehiVar.T = this.F;
        return ehiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return va6.b(this.E, cVar.E) && va6.b(this.F, cVar.F);
    }

    public final int hashCode() {
        return Float.hashCode(this.F) + (Float.hashCode(this.E) * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ehi ehiVar = (ehi) hqbVar;
        ehiVar.S = this.E;
        ehiVar.T = this.F;
    }
}
