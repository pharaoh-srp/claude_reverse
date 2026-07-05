package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hli implements vb0 {
    public final String a;

    public hli(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hli) {
            return this.a.equals(((hli) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vb7.s(new StringBuilder("UrlAnnotation(url="), this.a, ')');
    }
}
