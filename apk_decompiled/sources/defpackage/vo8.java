package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vo8 implements mu9 {
    public final rhh E;
    public final int F;
    public final f5i G;
    public final zy7 H;

    public vo8(rhh rhhVar, int i, f5i f5iVar, zy7 zy7Var) {
        this.E = rhhVar;
        this.F = i;
        this.G = f5iVar;
        this.H = zy7Var;
    }

    @Override // defpackage.mu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        long j2;
        if (h5bVar.o(rl4.g(j)) < rl4.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = rl4.a(0, Integer.MAX_VALUE, 0, 0, 13, j2);
        }
        c3d c3dVarU = h5bVar.u(j);
        int iMin = Math.min(c3dVarU.E, rl4.h(j2));
        return q5bVar.U(iMin, c3dVarU.F, nm6.E, new uz5(this, iMin, q5bVar, c3dVarU, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vo8) {
            vo8 vo8Var = (vo8) obj;
            if (this.E == vo8Var.E && this.F == vo8Var.F && this.G.equals(vo8Var.G) && x44.r(this.H, vo8Var.H)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.H.hashCode() + ((this.G.hashCode() + vb7.c(this.F, this.E.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.E + ", cursorOffset=" + this.F + ", transformedText=" + this.G + ", textLayoutResultProvider=" + this.H + ')';
    }
}
