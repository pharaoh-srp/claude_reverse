package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class tzf {
    public final float a;
    public final float b;
    public final long c;
    public final int d;
    public final long e;
    public final jy1 f;
    public final float g;

    public tzf(float f, float f2, long j, long j2, jy1 jy1Var, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
        if (jy1Var instanceof eeg) {
            this.e = ((eeg) jy1Var).a;
            this.f = null;
        } else {
            this.e = j2;
            this.f = jy1Var;
        }
        this.g = wd6.d0(f3, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tzf) {
            tzf tzfVar = (tzf) obj;
            if (va6.b(this.a, tzfVar.a) && va6.b(this.b, tzfVar.b) && this.c == tzfVar.c && this.g == tzfVar.g && this.d == tzfVar.d && d54.c(this.e, tzfVar.e) && x44.r(this.f, tzfVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = vb7.c(this.d, vb7.b(this.g, vb7.e(vb7.b(this.b, Float.hashCode(this.a) * 31, 31), 31, this.c), 31), 31);
        int i = d54.i;
        int iE = vb7.e(iC, 31, this.e);
        jy1 jy1Var = this.f;
        return iE + (jy1Var != null ? jy1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(radius=");
        ebh.v(this.a, sb, ", spread=");
        ebh.v(this.b, sb, ", offset=");
        sb.append((Object) ya6.c(this.c));
        sb.append(", alpha=");
        sb.append(this.g);
        sb.append(", blendMode=");
        sb.append((Object) yb5.P(this.d));
        sb.append(", color=");
        y6a.q(this.e, ", brush=", sb);
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }

    public tzf(float f, long j, float f2, long j2, float f3, int i) {
        this(f, f2, j2, j == 16 ? d54.b : j, null, f3, i);
    }

    public tzf(float f, long j, float f2, long j2, int i) {
        this(f, j, (i & 4) != 0 ? MTTypesetterKt.kLineSkipLimitMultiplier : f2, (i & 8) != 0 ? 0L : j2, 1.0f, 3);
    }
}
