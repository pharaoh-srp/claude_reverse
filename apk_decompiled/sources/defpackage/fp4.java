package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fp4 extends gp4 {
    public final long a;

    public fp4(long j) {
        this.a = j;
        if ((j & 9223372034707292159L) != 9205357640488583168L) {
            return;
        }
        e39.c("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fp4)) {
            return false;
        }
        return fcc.c(this.a, ((fp4) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) fcc.k(this.a)) + ')';
    }
}
