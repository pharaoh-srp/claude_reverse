package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class za1 {
    public final float a;
    public final ya1 b;
    public final float c;
    public final float d;

    public za1(float f, ya1 ya1Var, float f2, float f3) {
        this.a = f;
        this.b = ya1Var;
        this.c = f2;
        this.d = f3;
        if (MTTypesetterKt.kLineSkipLimitMultiplier > f || f > 1.0f) {
            sz6.p("The 'progress' argument must be between 0 and 1 (both inclusive)");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za1)) {
            return false;
        }
        za1 za1Var = (za1) obj;
        return Float.compare(this.a, za1Var.a) == 0 && this.b == za1Var.b && Float.compare(this.c, za1Var.c) == 0 && Float.compare(this.d, za1Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + vb7.b(this.c, (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEvent(progress=");
        sb.append(this.a);
        sb.append(", swipeEdge=");
        sb.append(this.b);
        sb.append(", touchX=");
        sb.append(this.c);
        sb.append(", touchY=");
        return ebh.o(sb, this.d, ')');
    }
}
