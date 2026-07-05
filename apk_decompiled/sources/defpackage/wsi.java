package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wsi implements vb0 {
    public final String a;

    public wsi(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wsi) {
            return this.a.equals(((wsi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vb7.s(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }
}
