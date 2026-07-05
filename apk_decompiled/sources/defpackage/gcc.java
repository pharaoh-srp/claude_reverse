package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lgcc;", "Lnqb;", "Lpcc;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class gcc extends nqb {
    public final float E;
    public final float F;

    public gcc(float f, float f2) {
        this.E = f;
        this.F = f2;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        pcc pccVar = new pcc();
        pccVar.S = this.E;
        pccVar.T = this.F;
        pccVar.U = true;
        return pccVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        gcc gccVar = obj instanceof gcc ? (gcc) obj : null;
        return gccVar != null && va6.b(this.E, gccVar.E) && va6.b(this.F, gccVar.F);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + vb7.b(this.F, Float.hashCode(this.E) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetModifierElement(x=");
        ebh.v(this.E, sb, ", y=");
        sb.append((Object) va6.c(this.F));
        sb.append(", rtlAware=true)");
        return sb.toString();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        pcc pccVar = (pcc) hqbVar;
        float f = pccVar.S;
        float f2 = this.E;
        boolean zB = va6.b(f, f2);
        float f3 = this.F;
        if (!zB || !va6.b(pccVar.T, f3) || !pccVar.U) {
            yfd.W(pccVar).u0(false);
        }
        pccVar.S = f2;
        pccVar.T = f3;
        pccVar.U = true;
    }
}
