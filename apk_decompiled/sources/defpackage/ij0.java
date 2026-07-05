package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.Locale;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ij0 {
    public static void A(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static String B(String str, Object obj) {
        return (str + obj).toString();
    }

    public static String C(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 20;
        }
        if (i == 3) {
            return 100;
        }
        throw null;
    }

    public static /* synthetic */ long b(int i) {
        if (i == 1) {
            return 3000L;
        }
        if (i == 2) {
            return 10000L;
        }
        if (i == 3) {
            return 35000L;
        }
        throw null;
    }

    public static int c(float f, float f2, float f3) {
        return Math.round((f / f2) * f3);
    }

    public static bt7 d(e18 e18Var) {
        bt7 bt7Var = new bt7();
        e18Var.k0(bt7Var);
        return bt7Var;
    }

    public static ClassCastException e(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static Object f(Class cls, m7f m7fVar, rzd rzdVar, e18 e18Var) {
        Object objA = m7fVar.a(jce.a.b(cls), rzdVar, null);
        e18Var.k0(objA);
        return objA;
    }

    public static String g(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String h(String str, Object obj) {
        return str + obj;
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String k(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String l(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String m(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String n(Locale locale, String str, Locale locale2) {
        locale.getClass();
        String lowerCase = str.toLowerCase(locale2);
        lowerCase.getClass();
        return lowerCase;
    }

    public static StringBuilder o(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder p(String str, String str2, int i, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static KotlinNothingValueException q(String str) {
        qaa.b(str);
        return new KotlinNothingValueException();
    }

    public static void r(float f, int i, e18 e18Var, e18 e18Var2, fqb fqbVar) {
        e18Var.a0(i);
        kxk.g(e18Var2, b.t(fqbVar, f));
    }

    public static void s(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }

    public static void t(int i, e18 e18Var, z80 z80Var, e18 e18Var2, bx bxVar) {
        d4c.i0(e18Var, z80Var, Integer.valueOf(i));
        d4c.h0(e18Var2, bxVar);
    }

    public static void u(long j, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static void v(qh1 qh1Var, oqb oqbVar) {
        oqbVar.a(new ge7(qh1Var));
    }

    public static void w(e18 e18Var, boolean z, boolean z2, boolean z3) {
        e18Var.p(z);
        e18Var.p(z2);
        e18Var.p(z3);
    }

    public static /* synthetic */ void x(Object obj) {
        if (obj == null) {
            return;
        }
        mr9.o();
    }

    public static void y(String str, ozf ozfVar, boolean z, int i) {
        SilentException.a(new SilentException(str), ozfVar, z, i);
    }

    public static void z(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
    }
}
