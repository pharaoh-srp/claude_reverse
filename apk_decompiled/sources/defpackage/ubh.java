package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ubh {
    public final String a;
    public final String b;

    public ubh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubh)) {
            return false;
        }
        ubh ubhVar = (ubh) obj;
        return x44.r(this.a, ubhVar.a) && x44.r(this.b, ubhVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ij0.l("Error(stack=", this.a, ", kind=", this.b, ")");
    }
}
