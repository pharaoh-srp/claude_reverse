package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l85 implements p85 {
    public final String a;
    public final boolean b;

    public l85(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l85)) {
            return false;
        }
        l85 l85Var = (l85) obj;
        return x44.r(this.a, l85Var.a) && this.b == l85Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Failure(message=" + this.a + ", isPairedOffline=" + this.b + ")";
    }
}
