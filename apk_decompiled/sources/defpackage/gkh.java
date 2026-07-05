package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gkh {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof gkh) {
            return this.a == ((gkh) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 1 ? "Linearity.Linear" : i == 2 ? "Linearity.FontHinting" : i == 3 ? "Linearity.None" : "Invalid";
    }
}
