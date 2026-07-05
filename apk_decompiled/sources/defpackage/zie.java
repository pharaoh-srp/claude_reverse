package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zie {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final vs8 b;
    public String c;
    public us8 d;
    public final jie e = new jie();
    public final gmf f;
    public p8b g;
    public final boolean h;
    public final fub i;
    public final epk j;
    public tie k;

    public zie(String str, vs8 vs8Var, String str2, wg8 wg8Var, p8b p8bVar, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = vs8Var;
        this.c = str2;
        this.g = p8bVar;
        this.h = z;
        if (wg8Var != null) {
            this.f = wg8Var.g();
        } else {
            this.f = new gmf(16);
        }
        if (z2) {
            this.j = new epk(18);
        } else if (z3) {
            fub fubVar = new fub();
            this.i = fubVar;
            fubVar.c(hub.f);
        }
    }

    public final void a(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                ide ideVar = p8b.e;
                this.g = nai.D(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(ij0.i("Malformed content type: ", str2), e);
            }
        }
        gmf gmfVar = this.f;
        if (z) {
            gmfVar.u(str, str2);
        } else {
            gmfVar.s(str, str2);
        }
    }

    public final void b(String str, String str2, boolean z) {
        us8 us8Var;
        String str3 = this.c;
        if (str3 != null) {
            vs8 vs8Var = this.b;
            vs8Var.getClass();
            try {
                us8Var = new us8();
                us8Var.h(vs8Var, str3);
            } catch (IllegalArgumentException unused) {
                us8Var = null;
            }
            this.d = us8Var;
            if (us8Var == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(vs8Var);
                String str4 = this.c;
                sb.append(", Relative: ");
                sb.append(str4);
                throw new IllegalArgumentException(sb.toString());
            }
            this.c = null;
        }
        us8 us8Var2 = this.d;
        if (!z) {
            us8Var2.b(str, str2);
            return;
        }
        us8Var2.getClass();
        str.getClass();
        if (((ArrayList) us8Var2.i) == null) {
            us8Var2.i = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) us8Var2.i;
        arrayList.getClass();
        arrayList.add(kxk.m(0, 0, 83, str, " \"'<>#&=", true));
        ArrayList arrayList2 = (ArrayList) us8Var2.i;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? kxk.m(0, 0, 83, str2, " \"'<>#&=", true) : null);
    }
}
