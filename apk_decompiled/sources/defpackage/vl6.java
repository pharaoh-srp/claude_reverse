package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vl6 {
    public final int a;

    public static String a(int i) {
        return i == 0 ? "EmojiSupportMatch.Default" : i == 1 ? "EmojiSupportMatch.None" : i == 2 ? "EmojiSupportMatch.All" : vb7.p("Invalid(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vl6) {
            return this.a == ((vl6) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
