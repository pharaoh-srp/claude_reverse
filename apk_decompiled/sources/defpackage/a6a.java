package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class a6a {
    public static final float b;
    public static final float c;
    public static final float d;
    public final float a;

    static {
        a(MTTypesetterKt.kLineSkipLimitMultiplier);
        a(0.5f);
        b = 0.5f;
        a(-1.0f);
        c = -1.0f;
        a(1.0f);
        d = 1.0f;
    }

    public static void a(float f) {
        if ((MTTypesetterKt.kLineSkipLimitMultiplier > f || f > 1.0f) && f != -1.0f) {
            c39.c("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f) {
        if (f == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a6a) {
            return Float.compare(this.a, ((a6a) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
