package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ag8 {
    public final g25 a;

    public ag8(g25 g25Var) {
        g25Var.getClass();
        this.a = g25Var;
    }

    public final boolean a(vs8 vs8Var) {
        boolean zU;
        vs8Var.getClass();
        g25 g25Var = this.a;
        String str = g25Var.d;
        boolean z = g25Var.i;
        String str2 = vs8Var.d;
        if (z) {
            zU = x44.r(str2, str);
        } else {
            Pattern pattern = g25.k;
            zU = eve.u(str2, str);
        }
        if (zU) {
            String str3 = g25Var.e;
            String strB = vs8Var.b();
            if ((strB.equals(str3) || (isg.q0(strB, str3, false) && (isg.h0(str3, "/", false) || strB.charAt(str3.length()) == '/'))) && (!g25Var.f || x44.r(vs8Var.a, "https"))) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ag8)) {
            return false;
        }
        g25 g25Var = ((ag8) obj).a;
        String str = g25Var.a;
        g25 g25Var2 = this.a;
        return str.equals(g25Var2.a) && g25Var.d.equals(g25Var2.d) && g25Var.e.equals(g25Var2.e) && g25Var.f == g25Var2.f && g25Var.i == g25Var2.i;
    }

    public final int hashCode() {
        g25 g25Var = this.a;
        return ((kgh.l(kgh.l(kgh.l(527, 31, g25Var.a), 31, g25Var.d), 31, g25Var.e) + (!g25Var.f ? 1 : 0)) * 31) + (!g25Var.i ? 1 : 0);
    }
}
