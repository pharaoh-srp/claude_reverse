package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x1h {
    public final Object a;
    public final int b;

    public x1h(int i, Object obj) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1h)) {
            return false;
        }
        x1h x1hVar = (x1h) obj;
        return this.a.equals(x1hVar.a) && this.b == x1hVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TLVResult(data=" + this.a + ", newIndex=" + this.b + ")";
    }
}
