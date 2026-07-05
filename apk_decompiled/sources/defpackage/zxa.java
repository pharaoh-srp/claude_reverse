package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zxa {
    public final String a;
    public final String b;
    public final List c;

    public zxa(String str, String str2, List list) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxa)) {
            return false;
        }
        zxa zxaVar = (zxa) obj;
        return x44.r(this.a, zxaVar.a) && this.b.equals(zxaVar.b) && x44.r(this.c, zxaVar.c);
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return iL + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return gid.q(kgh.r("McpAppFullscreenRequest(toolCallId=", this.a, ", serverName=", this.b, ", allowedLinkDomains="), this.c, ")");
    }
}
