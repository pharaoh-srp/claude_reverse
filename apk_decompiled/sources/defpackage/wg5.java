package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wg5 {
    public final int a;
    public final Object b;

    public wg5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg5)) {
            return false;
        }
        wg5 wg5Var = (wg5) obj;
        return this.a == wg5Var.a && x44.r(this.b, wg5Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "DataStoreContent(versionCode=" + this.a + ", data=" + this.b + ")";
    }
}
