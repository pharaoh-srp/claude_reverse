package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class za8 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof za8) {
            return this.a == ((za8) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.a + ')';
    }
}
