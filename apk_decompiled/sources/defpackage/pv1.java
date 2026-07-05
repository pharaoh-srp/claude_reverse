package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class pv1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new pv1(0, 0, 0, 0);
    }

    public pv1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            mr9.q(grc.o(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        mr9.q(grc.o(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }

    public final int a() {
        return this.d - this.b;
    }

    public final int b() {
        return this.c - this.a;
    }

    public final Rect c() {
        return new Rect(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!pv1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        pv1 pv1Var = (pv1) obj;
        return this.a == pv1Var.a && this.b == pv1Var.b && this.c == pv1Var.c && this.d == pv1Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(pv1.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return vb7.l(this.d, "] }", sb);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pv1(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
