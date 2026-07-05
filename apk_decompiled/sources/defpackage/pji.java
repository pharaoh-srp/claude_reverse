package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pji {
    public final String a;
    public final String b;
    public final String c;

    public pji(String str, String str2, String str3) {
        grc.B(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pji)) {
            return false;
        }
        pji pjiVar = (pji) obj;
        return x44.r(this.a, pjiVar.a) && x44.r(this.b, pjiVar.b) && x44.r(this.c, pjiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ij0.m(kgh.r("UploadMaterialText(customInstructionReason=", this.a, ", uploadMaterialTitle=", this.b, ", uploadMaterialPlaceholder="), this.c, ")");
    }
}
