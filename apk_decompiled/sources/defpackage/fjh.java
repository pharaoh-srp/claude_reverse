package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class fjh {
    public static final fjh c = new fjh(1.0f, MTTypesetterKt.kLineSkipLimitMultiplier);
    public final float a;
    public final float b;

    public fjh(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjh)) {
            return false;
        }
        fjh fjhVar = (fjh) obj;
        return this.a == fjhVar.a && this.b == fjhVar.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return ebh.o(sb, this.b, ')');
    }
}
