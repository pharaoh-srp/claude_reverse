package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class mjd {
    public static final mjd d = new mjd(MTTypesetterKt.kLineSkipLimitMultiplier, new fq3(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier), 0);
    public final float a;
    public final fq3 b;
    public final int c;

    public mjd(float f, fq3 fq3Var, int i) {
        this.a = f;
        this.b = fq3Var;
        this.c = i;
        if (Float.isNaN(f)) {
            sz6.p("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjd)) {
            return false;
        }
        mjd mjdVar = (mjd) obj;
        return this.a == mjdVar.a && x44.r(this.b, mjdVar.b) && this.c == mjdVar.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(", steps=");
        return vb7.r(sb, this.c, ')');
    }
}
