package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rwh {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final z1e e;
    public final String f;
    public final String g;

    public rwh(String str, String str2, String str3, z1e z1eVar, String str4, String str5, int i) {
        boolean z = (i & 8) == 0;
        z1eVar = (i & 16) != 0 ? z1e.c : z1eVar;
        str4 = (i & 32) != 0 ? null : str4;
        str5 = (i & 64) != 0 ? null : str5;
        str.getClass();
        str3.getClass();
        z1eVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z1eVar;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwh)) {
            return false;
        }
        rwh rwhVar = (rwh) obj;
        return x44.r(this.a, rwhVar.a) && x44.r(this.b, rwhVar.b) && x44.r(this.c, rwhVar.c) && this.d == rwhVar.d && x44.r(this.e, rwhVar.e) && x44.r(this.f, rwhVar.f) && x44.r(this.g, rwhVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + fsh.p(kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("ToolDisplayInfo(action=", this.a, ", content=", this.b, ", preview=");
        gid.t(sbR, this.c, ", previewIsProse=", this.d, ", rawInput=");
        sbR.append(this.e);
        sbR.append(", oldString=");
        sbR.append(this.f);
        sbR.append(", newString=");
        return ij0.m(sbR, this.g, ")");
    }
}
