package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class rx3 {
    public final long a;
    public final long b;
    public final boolean c;
    public final String d;
    public boolean e;
    public Long f;
    public final Map g;
    public Long h;
    public boolean i;
    public String j;
    public boolean k;
    public boolean l;

    public rx3(long j, long j2, String str, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = str;
        this.e = false;
        this.f = null;
        this.g = linkedHashMap;
        this.h = null;
        this.i = false;
        this.j = null;
        this.k = false;
        this.l = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx3)) {
            return false;
        }
        rx3 rx3Var = (rx3) obj;
        return this.a == rx3Var.a && this.b == rx3Var.b && this.c == rx3Var.c && x44.r(this.d, rx3Var.d) && this.e == rx3Var.e && x44.r(this.f, rx3Var.f) && x44.r(this.g, rx3Var.g) && x44.r(this.h, rx3Var.h) && this.i == rx3Var.i && x44.r(this.j, rx3Var.j) && this.k == rx3Var.k && this.l == rx3Var.l;
    }

    public final int hashCode() {
        int iP = fsh.p(kgh.l(fsh.p(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        Long l = this.f;
        int iG = ebh.g((iP + (l == null ? 0 : l.hashCode())) * 31, 31, this.g);
        Long l2 = this.h;
        int iP2 = fsh.p((iG + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.i);
        String str = this.j;
        return Boolean.hashCode(this.l) + fsh.p((iP2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        boolean z = this.e;
        Long l = this.f;
        Long l2 = this.h;
        boolean z2 = this.i;
        String str = this.j;
        boolean z3 = this.k;
        boolean z4 = this.l;
        StringBuilder sbW = grc.w(this.a, "Armed(anchorElapsedMs=", ", anchorBackgroundMs=");
        sbW.append(this.b);
        sbW.append(", isNewSession=");
        sbW.append(this.c);
        sbW.append(", userMessageId=");
        sbW.append(this.d);
        sbW.append(", sawUserEcho=");
        sbW.append(z);
        sbW.append(", ttftMs=");
        sbW.append(l);
        sbW.append(", initStepMs=");
        sbW.append(this.g);
        sbW.append(", ccInitMs=");
        sbW.append(l2);
        sbW.append(", anyStepFailed=");
        sbW.append(z2);
        sbW.append(", sessionMode=");
        sbW.append(str);
        sbW.append(", sawInitStep=");
        sbW.append(z3);
        sbW.append(", initBreakdownEmitted=");
        sbW.append(z4);
        sbW.append(")");
        return sbW.toString();
    }
}
