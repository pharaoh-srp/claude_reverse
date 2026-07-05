package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wu7 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof wu7) {
            return this.a == ((wu7) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
    }
}
