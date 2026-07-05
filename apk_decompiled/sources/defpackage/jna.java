package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jna {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof jna) {
            return this.a == ((jna) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return grc.u("RawRes(resId=", this.a, ")");
    }
}
