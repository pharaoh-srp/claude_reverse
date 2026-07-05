package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wl4 extends xl4 {
    public final int a;

    public wl4(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wl4) && this.a == ((wl4) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vb7.r(new StringBuilder("ConstraintsNotMet(reason="), this.a, ')');
    }
}
