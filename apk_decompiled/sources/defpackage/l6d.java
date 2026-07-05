package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class l6d {
    public static final l6d d = new l6d(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    static {
        tpi.w(0);
        tpi.w(1);
    }

    public l6d(float f, float f2) {
        fd9.E(f > MTTypesetterKt.kLineSkipLimitMultiplier);
        fd9.E(f2 > MTTypesetterKt.kLineSkipLimitMultiplier);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l6d.class == obj.getClass()) {
            l6d l6dVar = (l6d) obj;
            if (this.a == l6dVar.a && this.b == l6dVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        String str = tpi.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
