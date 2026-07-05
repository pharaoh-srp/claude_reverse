package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class at9 implements szd {
    public final String E;

    public at9(String str) {
        str.getClass();
        this.E = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || at9.class != obj.getClass()) {
            return false;
        }
        return x44.r(this.E, ((at9) obj).E);
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return ij0.j("LanguageQualifier(language='", this.E, "')");
    }
}
