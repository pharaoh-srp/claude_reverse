package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rhc {
    public final String a;

    public rhc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rhc) && this.a.equals(((rhc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("OpenSettingsParams(screen=", this.a, ")");
    }
}
