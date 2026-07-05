package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b25 {
    public final String a;
    public final String b;

    public b25(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b25)) {
            return false;
        }
        b25 b25Var = (b25) obj;
        return x44.r(this.a, b25Var.a) && this.b.equals(b25Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ij0.l("ConwayWebhookVerifyResult(signingSecret=", this.a, ", secretHeader=", this.b, ")");
    }
}
