package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class uzf {
    public static final uzf d = new uzf(MTTypesetterKt.kLineSkipLimitMultiplier, d4c.o(4278190080L), 0);
    public final long a;
    public final long b;
    public final float c;

    public uzf(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzf)) {
            return false;
        }
        uzf uzfVar = (uzf) obj;
        return d54.c(this.a, uzfVar.a) && fcc.c(this.b, uzfVar.b) && this.c == uzfVar.c;
    }

    public final int hashCode() {
        int i = d54.i;
        return Float.hashCode(this.c) + vb7.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        y6a.q(this.a, ", offset=", sb);
        sb.append((Object) fcc.k(this.b));
        sb.append(", blurRadius=");
        return ebh.o(sb, this.c, ')');
    }
}
