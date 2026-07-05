package androidx.compose.foundation.layout;

import defpackage.hqb;
import defpackage.mdj;
import defpackage.nqb;
import defpackage.va6;
import defpackage.vb7;
import defpackage.w8g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/a;", "Lnqb;", "Lw8g;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class a extends nqb {
    public final float E;
    public final float F;
    public final float G;
    public final float H;
    public final boolean I;

    public /* synthetic */ a(float f, float f2, float f3, float f4, boolean z, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
    }

    @Override // defpackage.nqb
    public final hqb create() {
        w8g w8gVar = new w8g();
        w8gVar.S = this.E;
        w8gVar.T = this.F;
        w8gVar.U = this.G;
        w8gVar.V = this.H;
        w8gVar.W = this.I;
        return w8gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return va6.b(this.E, aVar.E) && va6.b(this.F, aVar.F) && va6.b(this.G, aVar.G) && va6.b(this.H, aVar.H) && this.I == aVar.I;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.I) + vb7.b(this.H, vb7.b(this.G, vb7.b(this.F, Float.hashCode(this.E) * 31, 31), 31), 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        w8g w8gVar = (w8g) hqbVar;
        w8gVar.S = this.E;
        w8gVar.T = this.F;
        w8gVar.U = this.G;
        w8gVar.V = this.H;
        w8gVar.W = this.I;
    }

    public a(float f, float f2, float f3, float f4, boolean z) {
        this.E = f;
        this.F = f2;
        this.G = f3;
        this.H = f4;
        this.I = z;
    }
}
