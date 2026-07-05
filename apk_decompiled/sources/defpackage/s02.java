package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class s02 {
    public final float a;
    public final float b;
    public final float c;

    public s02(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s02)) {
            return false;
        }
        s02 s02Var = (s02) obj;
        return va6.b(this.a, s02Var.a) && va6.b(this.b, s02Var.b) && va6.b(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier) && va6.b(this.c, s02Var.c) && va6.b(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    public final int hashCode() {
        return Float.hashCode(MTTypesetterKt.kLineSkipLimitMultiplier) + vb7.b(this.c, vb7.b(MTTypesetterKt.kLineSkipLimitMultiplier, vb7.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
