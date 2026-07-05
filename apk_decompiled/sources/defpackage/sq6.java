package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.api.account.SendProductEmailLinkRequest;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class sq6 implements m92 {
    public static final /* synthetic */ int[] E = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, ModuleDescriptor.MODULE_VERSION, 123, 124, 125, 126, 127, FreeTypeConstants.FT_LOAD_PEDANTIC, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141};

    public static void A(float f, int i, e18 e18Var, e18 e18Var2, fqb fqbVar) {
        e18Var.a0(i);
        kxk.g(e18Var2, b.e(fqbVar, f));
    }

    public static void B(int i, pz7 pz7Var, e18 e18Var, boolean z) {
        pz7Var.invoke(e18Var, Integer.valueOf(i));
        e18Var.p(z);
    }

    public static void C(qh1 qh1Var, oqb oqbVar) {
        oqbVar.a(new t7g(qh1Var));
    }

    public static void D(pl9 pl9Var, StringBuilder sb, char c) {
        sb.append(ql9.a(pl9Var));
        sb.append(c);
    }

    public static void E(qh1 qh1Var, oqb oqbVar) {
        oqbVar.a(new w7f(qh1Var));
    }

    public static /* synthetic */ int F(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String G(int i) {
        switch (i) {
            case 1:
                return "ANDROID";
            case 2:
                return "IOS";
            case 3:
                return "BROWSER";
            case 4:
                return "FLUTTER";
            case 5:
                return "REACT_NATIVE";
            case 6:
                return "ROKU";
            case 7:
                return "UNITY";
            case 8:
                return "KOTLIN_MULTIPLATFORM";
            case 9:
                return "ELECTRON";
            case 10:
                return "RUM_CPP";
            case 11:
                return "MAUI";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int[] H(int i) {
        int[] iArr = new int[i];
        System.arraycopy(E, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ void a(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static /* synthetic */ int b(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        return i - i2;
    }

    public static /* synthetic */ boolean c(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "user";
        }
        if (i == 2) {
            return "synthetics";
        }
        if (i == 3) {
            return "ci_test";
        }
        throw null;
    }

    public static /* synthetic */ String f(int i) {
        switch (i) {
            case 1:
                return "android";
            case 2:
                return "ios";
            case 3:
                return "browser";
            case 4:
                return "flutter";
            case 5:
                return "react-native";
            case 6:
                return "roku";
            case 7:
                return "unity";
            case 8:
                return "kotlin-multiplatform";
            case 9:
                return "electron";
            case 10:
                return "rum-cpp";
            case 11:
                return "maui";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String g(int i) {
        switch (i) {
            case 1:
                return "mobile";
            case 2:
                return SendProductEmailLinkRequest.PRODUCT_DESKTOP;
            case 3:
                return "tablet";
            case 4:
                return "tv";
            case 5:
                return "gaming_console";
            case 6:
                return "bot";
            case 7:
                return "other";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "slow-2g";
        }
        if (i == 2) {
            return "2g";
        }
        if (i == 3) {
            return "3g";
        }
        if (i == 4) {
            return "4g";
        }
        throw null;
    }

    public static /* synthetic */ String i(int i) {
        switch (i) {
            case 1:
                return "user_app_launch";
            case 2:
                return "inactivity_timeout";
            case 3:
                return "max_duration";
            case 4:
                return "background_launch";
            case 5:
                return "prewarm";
            case 6:
                return "from_non_interactive_session";
            case 7:
                return "explicit_stop";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String j(int i) {
        if (i == 1) {
            return "connected";
        }
        if (i == 2) {
            return "not_connected";
        }
        if (i == 3) {
            return "maybe";
        }
        throw null;
    }

    public static float k(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static lsc l(SharedPreferences sharedPreferences, String str, boolean z) {
        return mpk.P(Boolean.valueOf(sharedPreferences.getBoolean(str, z)));
    }

    public static hvd m(long j, xe4 xe4Var) {
        return xe4Var.a(new d54(j));
    }

    public static m7f n(e18 e18Var, int i, e18 e18Var2, int i2) {
        e18Var.a0(i);
        m7f m7fVarB = gr9.b(e18Var2);
        e18Var.a0(i2);
        return m7fVarB;
    }

    public static t7g o(qh1 qh1Var, oqb oqbVar) {
        t7g t7gVar = new t7g(qh1Var);
        oqbVar.a(t7gVar);
        return t7gVar;
    }

    public static ybg p(e18 e18Var) {
        ybg ybgVar = new ybg();
        e18Var.k0(ybgVar);
        return ybgVar;
    }

    public static String q(yfa yfaVar, Exception exc, String str) {
        yfaVar.getClass();
        return str.concat(gsk.c(exc));
    }

    public static String r(yfa yfaVar, String str, nf0 nf0Var) {
        yfaVar.getClass();
        return str + nf0Var;
    }

    public static String s(yfa yfaVar, Throwable th, String str) {
        yfaVar.getClass();
        return str.concat(gsk.c(th));
    }

    public static String t(kce kceVar, Class cls, StringBuilder sb) {
        sb.append(kceVar.b(cls));
        return sb.toString();
    }

    public static String u(String str, String str2, int i, String str3, String str4) {
        return str + str2 + str3 + i + str4;
    }

    public static String v(String str, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static String w(StringBuilder sb, String str, char c, rzd rzdVar) {
        sb.append(str);
        sb.append(c);
        sb.append(rzdVar);
        return sb.toString();
    }

    public static StringBuilder x(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static KotlinNothingValueException y(Object obj) {
        sf5.h0(obj);
        return new KotlinNothingValueException();
    }

    public static KotlinNothingValueException z(String str) {
        b39.d(str);
        return new KotlinNothingValueException();
    }
}
