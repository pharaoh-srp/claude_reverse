package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m5a {
    public final l5a a;

    public m5a(l5a l5aVar) {
        this.a = l5aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5a) && this.a.equals(((m5a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Single(point=" + this.a + ")";
    }
}
