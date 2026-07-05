package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class og8 {
    public static final og8 f = new og8(d54.h, lm6.E, Float.NaN, -1.0f, qg8.d);
    public final long a;
    public final List b;
    public final float c;
    public final float d;
    public final qg8 e;

    public og8(long j, List list, float f2, float f3, qg8 qg8Var) {
        list.getClass();
        qg8Var.getClass();
        this.a = j;
        this.b = list;
        this.c = f2;
        this.d = f3;
        this.e = qg8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og8)) {
            return false;
        }
        og8 og8Var = (og8) obj;
        return d54.c(this.a, og8Var.a) && x44.r(this.b, og8Var.b) && va6.b(this.c, og8Var.c) && Float.compare(this.d, og8Var.d) == 0 && x44.r(this.e, og8Var.e);
    }

    public final int hashCode() {
        int i = d54.i;
        return this.e.hashCode() + vb7.b(this.d, vb7.b(this.c, kgh.m(Long.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        return "HazeStyle(backgroundColor=" + d54.i(this.a) + ", tints=" + this.b + ", blurRadius=" + va6.c(this.c) + ", noiseFactor=" + this.d + ", fallbackTint=" + this.e + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public og8(long j, qg8 qg8Var, float f2, float f3, qg8 qg8Var2) {
        this(j, x44.W(qg8Var), f2, f3, qg8Var2);
        qg8Var2.getClass();
    }
}
