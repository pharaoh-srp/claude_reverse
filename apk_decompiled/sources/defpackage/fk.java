package defpackage;

import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class fk {
    public static final Set g = mp0.Z0(new String[]{"md", "markdown", "mdown"});
    public static final Set h = mp0.Z0(new String[]{"txt", "csv", "log"});
    public static final Set i = mp0.Z0(new String[]{"mp4", "webm", "mov", "m4v"});
    public final String a;
    public final Long b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ fk(String str, Long l, boolean z, String str2, String str3, int i2) {
        l = (i2 & 2) != 0 ? null : l;
        str2 = (i2 & 8) != 0 ? null : str2;
        str3 = (i2 & 16) != 0 ? null : str3;
        boolean z2 = true;
        if ((i2 & 32) != 0 && l == null) {
            z2 = false;
        }
        this(str, l, z, str2, str3, z2);
    }

    public final String a() {
        String strD1 = bsg.d1('.', b(), "");
        if (strD1.length() == 0) {
            return null;
        }
        return strD1;
    }

    public final String b() {
        String str = this.a;
        String strD1 = bsg.d1('/', str, str);
        String strD12 = bsg.d1('\\', strD1, strD1);
        return strD12.length() == 0 ? str : strD12;
    }

    public final String c() {
        return this.e;
    }

    public final boolean d() {
        String lowerCase;
        Set set = g;
        String strA = a();
        if (strA != null) {
            lowerCase = strA.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        return w44.G0(set, lowerCase);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk)) {
            return false;
        }
        fk fkVar = (fk) obj;
        return x44.r(this.a, fkVar.a) && x44.r(this.b, fkVar.b) && this.c == fkVar.c && x44.r(this.d, fkVar.d) && x44.r(this.e, fkVar.e) && this.f == fkVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int iP = fsh.p((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c);
        String str = this.d;
        int iHashCode2 = (iP + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AgentChatAttachment(path=" + this.a + ", size=" + this.b + ", isImage=" + this.c + ", mediaType=" + this.d + ", fileUuid=" + this.e + ", isResolved=" + this.f + ")";
    }

    public fk(String str, Long l, boolean z, String str2, String str3, boolean z2) {
        str.getClass();
        this.a = str;
        this.b = l;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = z2;
    }
}
