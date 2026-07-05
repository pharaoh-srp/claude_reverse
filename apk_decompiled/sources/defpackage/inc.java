package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Linc;", "Lnqb;", "Lknc;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class inc extends nqb {
    public final float E;
    public final float F;
    public final float G;
    public final float H;

    public inc(float f, float f2, float f3, float f4) {
        this.E = f;
        this.F = f2;
        this.G = f3;
        this.H = f4;
        boolean z = true;
        boolean z2 = (f >= MTTypesetterKt.kLineSkipLimitMultiplier || Float.isNaN(f)) & (f2 >= MTTypesetterKt.kLineSkipLimitMultiplier || Float.isNaN(f2)) & (f3 >= MTTypesetterKt.kLineSkipLimitMultiplier || Float.isNaN(f3));
        if (f4 < MTTypesetterKt.kLineSkipLimitMultiplier && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            z29.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.nqb
    public final hqb create() {
        knc kncVar = new knc();
        kncVar.S = this.E;
        kncVar.T = this.F;
        kncVar.U = this.G;
        kncVar.V = this.H;
        kncVar.W = true;
        return kncVar;
    }

    public final boolean equals(Object obj) {
        inc incVar = obj instanceof inc ? (inc) obj : null;
        return incVar != null && va6.b(this.E, incVar.E) && va6.b(this.F, incVar.F) && va6.b(this.G, incVar.G) && va6.b(this.H, incVar.H);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + vb7.b(this.H, vb7.b(this.G, vb7.b(this.F, Float.hashCode(this.E) * 31, 31), 31), 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        knc kncVar = (knc) hqbVar;
        kncVar.S = this.E;
        kncVar.T = this.F;
        kncVar.U = this.G;
        kncVar.V = this.H;
        kncVar.W = true;
    }
}
