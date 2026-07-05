package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l5a {
    public final h0g a;

    public l5a(h0g h0gVar) {
        this.a = h0gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5a) && this.a.equals(((l5a) obj).a) && Float.compare(8.0f, 8.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(8.0f) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Point(component=" + this.a + ", sizeDp=8.0)";
    }
}
