package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wba extends xt7 {
    public final v60 J;

    public wba(v60 v60Var) {
        this.J = v60Var;
    }

    public final v60 a() {
        return this.J;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wba) {
            return this.J == ((wba) obj).J;
        }
        return false;
    }

    public final int hashCode() {
        return this.J.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.J + ')';
    }
}
