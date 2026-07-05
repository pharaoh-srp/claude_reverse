package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nuf implements fvf {
    public final boolean a;
    public final boolean b;

    public nuf(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuf)) {
            return false;
        }
        nuf nufVar = (nuf) obj;
        return this.a == nufVar.a && this.b == nufVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "HistoryPaginationState(hasMore=" + this.a + ", isLoading=" + this.b + ")";
    }
}
