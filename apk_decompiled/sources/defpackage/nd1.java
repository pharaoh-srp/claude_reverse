package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class nd1 {
    public final float a;

    public nd1(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof nd1) && this.a == ((nd1) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.a) + (Float.hashCode(MTTypesetterKt.kLineSkipLimitMultiplier) * 31);
    }
}
