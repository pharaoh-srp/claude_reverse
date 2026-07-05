package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class qgf {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public qgf(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof qgf)) {
            return false;
        }
        qgf qgfVar = (qgf) obj;
        return va6.b(this.a, qgfVar.a) && va6.b(this.b, qgfVar.b) && va6.b(this.c, qgfVar.c) && va6.b(this.d, qgfVar.d) && va6.b(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    public final int hashCode() {
        return Float.hashCode(MTTypesetterKt.kLineSkipLimitMultiplier) + vb7.b(this.d, vb7.b(this.c, vb7.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
