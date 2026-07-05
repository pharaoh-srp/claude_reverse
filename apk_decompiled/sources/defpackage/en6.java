package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class en6 {
    public final String a;

    public en6(String str) {
        if (str != null) {
            this.a = str;
        } else {
            mr9.h("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en6)) {
            return false;
        }
        return this.a.equals(((en6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return ij0.m(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
