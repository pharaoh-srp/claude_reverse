package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pt {
    public final int a;

    public /* synthetic */ pt(int i) {
        this.a = i;
    }

    public static final /* synthetic */ pt a(int i) {
        return new pt(i);
    }

    public static String b(int i) {
        return vb7.p("Horizontal(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pt) {
            return this.a == ((pt) obj).a;
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
