package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sba {
    public final int a;

    public /* synthetic */ sba(int i) {
        this.a = i;
    }

    public static final /* synthetic */ sba a(int i) {
        return new sba(i);
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final /* synthetic */ int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sba) {
            return this.a == ((sba) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Polite" : i == 1 ? "Assertive" : "Unknown";
    }
}
