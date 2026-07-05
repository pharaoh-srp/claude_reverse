package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h11 {
    public final Object a;

    public /* synthetic */ h11(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h11) {
            return x44.r(this.a, ((h11) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.a + ')';
    }
}
