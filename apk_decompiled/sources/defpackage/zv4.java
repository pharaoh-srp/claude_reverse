package defpackage;

import com.anthropic.claude.types.strings.ForkId;

/* JADX INFO: loaded from: classes2.dex */
public final class zv4 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public zv4(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv4)) {
            return false;
        }
        zv4 zv4Var = (zv4) obj;
        return ForkId.m1024equalsimpl0(this.a, zv4Var.a) && x44.r(this.b, zv4Var.b) && x44.r(this.c, zv4Var.c) && this.d == zv4Var.d && this.e == zv4Var.e && this.f == zv4Var.f;
    }

    public final int hashCode() {
        int iL = kgh.l(ForkId.m1025hashCodeimpl(this.a) * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.f) + fsh.p(fsh.p((iL + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("ConwayForkRow(agentId=", ForkId.m1027toStringimpl(this.a), ", label=", this.b, ", statusText=");
        gid.t(sbR, this.c, ", isMain=", this.d, ", isViewing=");
        sbR.append(this.e);
        sbR.append(", isWorking=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
