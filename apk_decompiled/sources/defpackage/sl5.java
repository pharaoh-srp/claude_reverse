package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class sl5 {
    public final b79 a;
    public final xl5 b;
    public final nl5 c;
    public final String d;
    public final String e;

    public sl5(b79 b79Var, xl5 xl5Var, nl5 nl5Var, am5 am5Var, String str, String str2, String str3) {
        this.a = b79Var;
        this.b = xl5Var;
        this.c = nl5Var;
        this.d = str;
        this.e = str2;
    }

    public final String a(q62 q62Var, Locale locale) {
        if (q62Var == null) {
            String upperCase = this.c.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Object[] objArrCopyOf = Arrays.copyOf(new Object[]{upperCase}, 1);
            return String.format(this.d, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
        int i = q62Var.E;
        b79 b79Var = this.a;
        if (b79Var.h(i)) {
            this.b.getClass();
            return "";
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(new Object[]{m72.a(b79Var.E, locale), m72.a(b79Var.F, locale)}, 2);
        return String.format(this.e, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
    }
}
