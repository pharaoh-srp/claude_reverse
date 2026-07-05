package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class z69 implements Iterable, mm9 {
    public final int E;
    public final int F;
    public final int G;

    public z69(int i, int i2, int i3) {
        if (i3 == 0) {
            sz6.p("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            sz6.p("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.E = i;
        this.F = iv1.x(i, i2, i3);
        this.G = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z69)) {
            return false;
        }
        if (isEmpty() && ((z69) obj).isEmpty()) {
            return true;
        }
        z69 z69Var = (z69) obj;
        return this.E == z69Var.E && this.F == z69Var.F && this.G == z69Var.G;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.E * 31) + this.F) * 31) + this.G;
    }

    public boolean isEmpty() {
        int i = this.F;
        int i2 = this.G;
        int i3 = this.E;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a79(this.E, this.F, this.G);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.F;
        int i2 = this.G;
        int i3 = this.E;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
