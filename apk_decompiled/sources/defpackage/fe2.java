package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class fe2 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fe2);
    }

    public final int hashCode() {
        return Float.hashCode(MTTypesetterKt.kLineSkipLimitMultiplier) + vb7.b(MTTypesetterKt.kLineSkipLimitMultiplier, vb7.b(MTTypesetterKt.kLineSkipLimitMultiplier, Float.hashCode(MTTypesetterKt.kLineSkipLimitMultiplier) * 31, 31), 31);
    }
}
