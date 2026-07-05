package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j15 {
    public final String a;
    public final String b;

    public j15(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j15)) {
            return false;
        }
        j15 j15Var = (j15) obj;
        return this.a.equals(j15Var.a) && x44.r(this.b, j15Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ij0.l("InFlightSave(messageId=", this.a, ", text=", this.b, ")");
    }
}
