package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c6a {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof c6a) {
            return this.a == ((c6a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
