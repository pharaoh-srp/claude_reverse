package androidx.compose.foundation;

import defpackage.f9f;
import defpackage.fsh;
import defpackage.hqb;
import defpackage.j9f;
import defpackage.mdj;
import defpackage.nqb;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Lnqb;", "Lf9f;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class ScrollingLayoutElement extends nqb {
    public final j9f E;
    public final boolean F;

    public ScrollingLayoutElement(j9f j9fVar, boolean z) {
        this.E = j9fVar;
        this.F = z;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        f9f f9fVar = new f9f();
        f9fVar.S = this.E;
        f9fVar.T = this.F;
        return f9fVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return x44.r(this.E, scrollingLayoutElement.E) && this.F == scrollingLayoutElement.F;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.F) + fsh.p(this.E.hashCode() * 31, 31, false);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        f9f f9fVar = (f9f) hqbVar;
        f9fVar.S = this.E;
        f9fVar.T = this.F;
    }
}
