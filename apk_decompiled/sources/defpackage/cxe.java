package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cxe implements o5b, xwe {
    public final go0 a;
    public final wo1 b;

    public cxe(go0 go0Var, wo1 wo1Var) {
        this.a = go0Var;
        this.b = wo1Var;
    }

    @Override // defpackage.o5b
    public final int a(xa9 xa9Var, List list, int i) {
        return gwk.c(i, xa9Var.M0(this.a.d()), list);
    }

    @Override // defpackage.o5b
    public final p5b b(q5b q5bVar, List list, long j) {
        return nai.T(this, rl4.j(j), rl4.i(j), rl4.h(j), rl4.g(j), q5bVar.M0(this.a.d()), q5bVar, list, new c3d[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.o5b
    public final int c(xa9 xa9Var, List list, int i) {
        return gwk.e(i, xa9Var.M0(this.a.d()), list);
    }

    @Override // defpackage.o5b
    public final int d(xa9 xa9Var, List list, int i) {
        return gwk.b(i, xa9Var.M0(this.a.d()), list);
    }

    @Override // defpackage.o5b
    public final int e(xa9 xa9Var, List list, int i) {
        return gwk.d(i, xa9Var.M0(this.a.d()), list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxe)) {
            return false;
        }
        cxe cxeVar = (cxe) obj;
        return x44.r(this.a, cxeVar.a) && x44.r(this.b, cxeVar.b);
    }

    @Override // defpackage.xwe
    public final void f(int i, int[] iArr, int[] iArr2, q5b q5bVar) {
        this.a.j(q5bVar, i, iArr, q5bVar.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.xwe
    public final p5b g(c3d[] c3dVarArr, q5b q5bVar, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return q5bVar.U(i2, i3, nm6.E, new bxe(c3dVarArr, this, i3, i, iArr));
    }

    @Override // defpackage.xwe
    public final long h(boolean z, int i, int i2, int i3) {
        return !z ? sl4.a(i, i2, 0, i3) : sf5.G(i, i2, 0, i3);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.xwe
    public final int i(c3d c3dVar) {
        return c3dVar.F;
    }

    @Override // defpackage.xwe
    public final int j(c3d c3dVar) {
        return c3dVar.E;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
