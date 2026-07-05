package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class y2b {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    public y2b(String str, String str2, boolean z, String str3) {
        String string;
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(str.charAt(0));
            strValueOf.getClass();
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            sb.append((Object) upperCase);
            sb.append(str.substring(1));
            str = sb.toString();
        }
        this.e = str;
        this.f = (str2 == null || (string = bsg.k1(isg.n0(str2, "\n", " ", false)).toString()) == null) ? "" : string;
    }

    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2b)) {
            return false;
        }
        y2b y2bVar = (y2b) obj;
        return this.a.equals(y2bVar.a) && x44.r(this.b, y2bVar.b) && this.c == y2bVar.c && x44.r(this.d, y2bVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + fsh.p((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("McpPromptArgumentState(name=", this.a, ", description=", this.b, ", required=");
        sbR.append(this.c);
        sbR.append(", value=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
