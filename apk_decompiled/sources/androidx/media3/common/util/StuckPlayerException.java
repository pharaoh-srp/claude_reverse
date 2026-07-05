package androidx.media3.common.util;

import defpackage.grc;
import io.sentry.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class StuckPlayerException extends IllegalStateException {
    public final int E;
    public final int F;

    /* JADX WARN: Illegal instructions before constructor call */
    public StuckPlayerException(int i, int i2) {
        String strU;
        if (i == 0) {
            strU = grc.u("Player stuck buffering and not loading for ", i2, " ms");
        } else if (i == 1) {
            strU = grc.u("Player stuck buffering with no progress for ", i2, " ms");
        } else if (i == 2) {
            strU = grc.u("Player stuck playing with no progress for ", i2, " ms");
        } else if (i == 3) {
            strU = grc.u("Player stuck playing without ending for ", i2, " ms");
        } else {
            if (i != 4) {
                e0.b();
                throw null;
            }
            strU = grc.u("Player stuck suppressed for ", i2, " ms");
        }
        super(strU);
        this.E = i;
        this.F = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StuckPlayerException.class != obj.getClass()) {
            return false;
        }
        StuckPlayerException stuckPlayerException = (StuckPlayerException) obj;
        return this.E == stuckPlayerException.E && this.F == stuckPlayerException.F;
    }

    public final int hashCode() {
        return ((527 + this.E) * 31) + this.F;
    }
}
