package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class s91 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s91.class != obj.getClass()) {
            return false;
        }
        return Float.compare(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(MTTypesetterKt.kLineSkipLimitMultiplier) + 16337;
    }
}
