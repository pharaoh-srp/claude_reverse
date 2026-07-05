package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z15 {
    public final String a;
    public final String b;
    public final lj2 c;

    public z15(String str, String str2, lj2 lj2Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = lj2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z15) {
            z15 z15Var = (z15) obj;
            return x44.r(this.a, z15Var.a) && x44.r(this.b, z15Var.b) && this.c == z15Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("ConwayWebhookConfirmRequest(triggerWord=", this.a, ", label=", this.b, ", resolve=");
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }
}
