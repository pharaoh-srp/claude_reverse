package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rt {
    public final int a;

    public /* synthetic */ rt(int i) {
        this.a = i;
    }

    public static final /* synthetic */ rt a(int i) {
        return new rt(i);
    }

    public static String b(int i) {
        return vb7.p("Vertical(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rt) {
            return this.a == ((rt) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
