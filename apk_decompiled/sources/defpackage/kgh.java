package defpackage;

import android.content.SharedPreferences;
import com.anthropic.claude.api.account.SendProductEmailLinkRequest;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class kgh {
    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ long b(int i) {
        if (i == 1) {
            return 500L;
        }
        if (i == 2) {
            return 2000L;
        }
        if (i == 3) {
            return 5000L;
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
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

    public static /* synthetic */ String d(int i) {
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

    public static /* synthetic */ String e(int i) {
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

    public static /* synthetic */ String f(int i) {
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

    public static /* synthetic */ String g(int i) {
        switch (i) {
            case 1:
                return "initial_load";
            case 2:
                return "route_change";
            case 3:
                return "activity_display";
            case 4:
                return "activity_redisplay";
            case 5:
                return "fragment_display";
            case 6:
                return "fragment_redisplay";
            case 7:
                return "view_controller_display";
            case 8:
                return "view_controller_redisplay";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String h(int i) {
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

    public static /* synthetic */ String i(int i) {
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

    public static /* synthetic */ String j(int i) {
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

    public static /* synthetic */ long k(int i) {
        if (i == 1) {
            return 100L;
        }
        if (i == 2) {
            return 500L;
        }
        if (i == 3) {
            return 1000L;
        }
        if (i == 4) {
            return 0L;
        }
        throw null;
    }

    public static int l(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int m(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static hw9 n(e18 e18Var, iqb iqbVar, z80 z80Var, float f, boolean z) {
        d4c.i0(e18Var, z80Var, iqbVar);
        return new hw9(f, z);
    }

    public static String o(String str, String str2) {
        return str + str2;
    }

    public static String p(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String q(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder r(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static NoWhenBranchMatchedException s(e18 e18Var, int i, boolean z) {
        e18Var.a0(i);
        e18Var.p(z);
        return new NoWhenBranchMatchedException();
    }

    public static void t(SharedPreferences sharedPreferences, String str, String str2) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static void u(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static /* synthetic */ String v(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "RARE" : "AVERAGE" : "FREQUENT";
    }

    public static /* synthetic */ String w(int i) {
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
}
