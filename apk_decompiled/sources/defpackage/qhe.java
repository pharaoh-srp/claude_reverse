package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qhe {
    public final String a;
    public final String b;

    public qhe(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhe)) {
            return false;
        }
        qhe qheVar = (qhe) obj;
        return this.a.equals(qheVar.a) && x44.r(this.b, qheVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ij0.l("RepoPillEntry(displayName=", this.a, ", branch=", this.b, ")");
    }
}
