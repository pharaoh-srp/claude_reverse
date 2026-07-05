package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ox3 {
    public final String a;
    public final String b;
    public final Set c;
    public final Set d;
    public final boolean e;

    public /* synthetic */ ox3(String str, String str2, Set set, Set set2, int i) {
        this(str, str2, (i & 4) != 0 ? sf5.f0(str2) : set, (i & 8) != 0 ? um6.E : set2, (i & 16) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox3)) {
            return false;
        }
        ox3 ox3Var = (ox3) obj;
        return x44.r(this.a, ox3Var.a) && x44.r(this.b, ox3Var.b) && x44.r(this.c, ox3Var.c) && x44.r(this.d, ox3Var.d) && this.e == ox3Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("CodeLanguage(id=", this.a, ", extension=", this.b, ", extensions=");
        sbR.append(this.c);
        sbR.append(", aliases=");
        sbR.append(this.d);
        sbR.append(", isBundled=");
        return sq6.v(")", sbR, this.e);
    }

    public ox3(String str, String str2, Set set, Set set2, boolean z) {
        set.getClass();
        set2.getClass();
        this.a = str;
        this.b = str2;
        this.c = set;
        this.d = set2;
        this.e = z;
    }
}
