package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class rue extends wd6 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rue) && va6.b(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier) && va6.b(2.0f, 2.0f) && va6.b(1.0f, 1.0f) && va6.b(3.0f, 3.0f);
    }

    public final int hashCode() {
        return Float.hashCode(3.0f) + vb7.b(1.0f, vb7.b(2.0f, Float.hashCode(MTTypesetterKt.kLineSkipLimitMultiplier) * 31, 31), 31);
    }
}
