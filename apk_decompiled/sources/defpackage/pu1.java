package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpu1;", "Lnqb;", "Lou1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final /* data */ class pu1 extends nqb {
    public final float E;
    public final eeg F;
    public final e0g G;

    public pu1(float f, eeg eegVar, e0g e0gVar) {
        this.E = f;
        this.F = eegVar;
        this.G = e0gVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new ou1(this.E, this.F, this.G);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu1)) {
            return false;
        }
        pu1 pu1Var = (pu1) obj;
        return va6.b(this.E, pu1Var.E) && this.F.equals(pu1Var.F) && x44.r(this.G, pu1Var.G);
    }

    public final int hashCode() {
        return this.G.hashCode() + ((this.F.hashCode() + (Float.hashCode(this.E) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderModifierNodeElement(width=");
        ebh.v(this.E, sb, ", brush=");
        sb.append(this.F);
        sb.append(", shape=");
        sb.append(this.G);
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ou1 ou1Var = (ou1) hqbVar;
        float f = ou1Var.V;
        z42 z42Var = ou1Var.Y;
        float f2 = this.E;
        if (!va6.b(f, f2)) {
            ou1Var.V = f2;
            z42Var.p1();
        }
        eeg eegVar = ou1Var.W;
        eeg eegVar2 = this.F;
        if (!x44.r(eegVar, eegVar2)) {
            ou1Var.W = eegVar2;
            z42Var.p1();
        }
        e0g e0gVar = ou1Var.X;
        e0g e0gVar2 = this.G;
        if (x44.r(e0gVar, e0gVar2)) {
            return;
        }
        ou1Var.X = e0gVar2;
        z42Var.p1();
        yfd.W(ou1Var).V();
    }
}
