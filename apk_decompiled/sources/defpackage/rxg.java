package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rxg {
    public final String a;
    public final String b;

    public rxg(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxg)) {
            return false;
        }
        rxg rxgVar = (rxg) obj;
        return this.a.equals(rxgVar.a) && x44.r(this.b, rxgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ij0.l("SuggestedAction(label=", this.a, ", message=", this.b, ")");
    }
}
