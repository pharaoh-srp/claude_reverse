package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b01 extends ty0 {
    public final char a;

    public b01(char c) {
        this.a = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b01) && this.a == ((b01) obj).a;
    }

    public final int hashCode() {
        return Character.hashCode(this.a);
    }

    public final String toString() {
        return "AstUnorderedList(bulletMarker=" + this.a + ")";
    }
}
