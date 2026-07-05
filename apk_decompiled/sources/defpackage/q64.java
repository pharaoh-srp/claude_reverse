package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q64 implements o5b, xwe {
    public final jo0 a;
    public final vo1 b;

    public q64(jo0 jo0Var, vo1 vo1Var) {
        this.a = jo0Var;
        this.b = vo1Var;
    }

    @Override // defpackage.o5b
    public final int a(xa9 xa9Var, List list, int i) {
        return gwk.h(i, xa9Var.M0(this.a.d()), list);
    }

    @Override // defpackage.o5b
    public final p5b b(q5b q5bVar, List list, long j) {
        return nai.T(this, rl4.i(j), rl4.j(j), rl4.g(j), rl4.h(j), q5bVar.M0(this.a.d()), q5bVar, list, new c3d[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.o5b
    public final int c(xa9 xa9Var, List list, int i) {
        return gwk.j(i, xa9Var.M0(this.a.d()), list);
    }

    @Override // defpackage.o5b
    public final int d(xa9 xa9Var, List list, int i) {
        return gwk.g(i, xa9Var.M0(this.a.d()), list);
    }

    @Override // defpackage.o5b
    public final int e(xa9 xa9Var, List list, int i) {
        return gwk.i(i, xa9Var.M0(this.a.d()), list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q64)) {
            return false;
        }
        q64 q64Var = (q64) obj;
        return this.a.equals(q64Var.a) && this.b.equals(q64Var.b);
    }

    @Override // defpackage.xwe
    public final void f(int i, int[] iArr, int[] iArr2, q5b q5bVar) {
        this.a.v(q5bVar, i, iArr, iArr2);
    }

    @Override // defpackage.xwe
    public final p5b g(c3d[] c3dVarArr, q5b q5bVar, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return q5bVar.U(i3, i2, nm6.E, new ew1(c3dVarArr, this, i3, i, q5bVar, iArr));
    }

    @Override // defpackage.xwe
    public final long h(boolean z, int i, int i2, int i3) {
        return !z ? sl4.a(0, i3, i, i2) : sf5.F(0, i3, i, i2);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.xwe
    public final int i(c3d c3dVar) {
        return c3dVar.E;
    }

    @Override // defpackage.xwe
    public final int j(c3d c3dVar) {
        return c3dVar.F;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}
