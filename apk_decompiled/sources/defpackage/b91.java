package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b91 extends bid {
    public final Integer a;

    public b91(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bid)) {
            return false;
        }
        return this.a.equals(((b91) ((bid) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
