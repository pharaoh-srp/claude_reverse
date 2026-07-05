package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bui implements mu9 {
    public final rhh E;
    public final int F;
    public final f5i G;
    public final zy7 H;

    public bui(rhh rhhVar, int i, f5i f5iVar, zy7 zy7Var) {
        this.E = rhhVar;
        this.F = i;
        this.G = f5iVar;
        this.H = zy7Var;
    }

    @Override // defpackage.mu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        c3d c3dVarU = h5bVar.u(rl4.a(0, 0, 0, Integer.MAX_VALUE, 7, j));
        int iMin = Math.min(c3dVarU.F, rl4.g(j));
        return q5bVar.U(c3dVarU.E, iMin, nm6.E, new ov0(this, c3dVarU, iMin, 5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bui) {
            bui buiVar = (bui) obj;
            if (this.E == buiVar.E && this.F == buiVar.F && this.G.equals(buiVar.G) && x44.r(this.H, buiVar.H)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.H.hashCode() + ((this.G.hashCode() + vb7.c(this.F, this.E.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.E + ", cursorOffset=" + this.F + ", transformedText=" + this.G + ", textLayoutResultProvider=" + this.H + ')';
    }
}
