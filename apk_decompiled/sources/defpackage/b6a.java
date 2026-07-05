package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b6a {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof b6a) {
            return this.a == ((b6a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "LineHeightStyle.Mode.Fixed" : i == 1 ? "LineHeightStyle.Mode.Minimum" : i == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
