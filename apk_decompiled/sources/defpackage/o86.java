package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o86 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof o86) {
            return this.a == ((o86) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Picker" : i == 1 ? "Input" : "Unknown";
    }
}
