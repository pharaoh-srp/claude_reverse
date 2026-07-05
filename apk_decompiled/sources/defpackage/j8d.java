package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j8d {
    public final int a;

    public /* synthetic */ j8d(int i) {
        this.a = i;
    }

    public static final /* synthetic */ j8d a(int i) {
        return new j8d(i);
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public static String c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public final /* synthetic */ int d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j8d) {
            return this.a == ((j8d) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
