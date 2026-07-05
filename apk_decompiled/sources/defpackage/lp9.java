package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lp9 {
    public final int a;

    public static String a(int i) {
        return i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Characters" : i == 2 ? "Words" : i == 3 ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lp9) {
            return this.a == ((lp9) obj).a;
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
