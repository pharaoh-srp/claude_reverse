package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hdb {
    public final int a;

    public /* synthetic */ hdb(int i) {
        this.a = i;
    }

    public static int a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return (z ? 1 : 0) | (z2 ? 2 : 0) | (z3 ? 4 : 0) | (z4 ? 8 : 0) | (z5 ? 16 : 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hdb) {
            return this.a == ((hdb) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vb7.p("MenuItemsAvailability(value=", this.a, ')');
    }
}
