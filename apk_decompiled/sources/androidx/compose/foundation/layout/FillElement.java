package androidx.compose.foundation.layout;

import defpackage.e56;
import defpackage.hqb;
import defpackage.mdj;
import defpackage.nqb;
import defpackage.tk7;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Lnqb;", "Ltk7;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class FillElement extends nqb {
    public final e56 E;
    public final float F;

    public FillElement(e56 e56Var, float f) {
        this.E = e56Var;
        this.F = f;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        tk7 tk7Var = new tk7();
        tk7Var.S = this.E;
        tk7Var.T = this.F;
        return tk7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.E == fillElement.E && this.F == fillElement.F;
    }

    public final int hashCode() {
        return Float.hashCode(this.F) + (this.E.hashCode() * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        tk7 tk7Var = (tk7) hqbVar;
        tk7Var.S = this.E;
        tk7Var.T = this.F;
    }
}
