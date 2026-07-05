package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.api.account.SendProductEmailLinkRequest;
import okio.Path;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class grc {
    public static void A(Long l, qh9 qh9Var, String str) {
        qh9Var.p(Long.valueOf(l.longValue()), str);
    }

    public static void B(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    public static /* synthetic */ String C(int i) {
        if (i == 1) {
            return "EVENT";
        }
        if (i == 2) {
            return "META";
        }
        throw null;
    }

    public static /* synthetic */ String D(int i) {
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

    public static /* synthetic */ String a(int i) {
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

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "NOT_TRACKED";
        }
        if (i == 2) {
            return "TRACKED";
        }
        if (i == 3) {
            return "EXPIRED";
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i == 2) {
            return "FOREGROUND";
        }
        if (i == 3) {
            return "BACKGROUND";
        }
        if (i == 4) {
            return "APPLICATION_LAUNCH";
        }
        throw null;
    }

    public static /* synthetic */ short d(int i) {
        if (i == 1) {
            return (short) 0;
        }
        if (i == 2) {
            return (short) 1;
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
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

    public static /* synthetic */ String f(int i) {
        switch (i) {
            case 1:
                return "POST";
            case 2:
                return "GET";
            case 3:
                return "HEAD";
            case 4:
                return "PUT";
            case 5:
                return "DELETE";
            case 6:
                return "PATCH";
            case 7:
                return "TRACE";
            case 8:
                return "OPTIONS";
            case 9:
                return "CONNECT";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String g(int i) {
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

    public static /* synthetic */ String h(int i) {
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

    public static /* synthetic */ String i(int i) {
        switch (i) {
            case 1:
                return "document";
            case 2:
                return "xhr";
            case 3:
                return "beacon";
            case 4:
                return "fetch";
            case 5:
                return "css";
            case 6:
                return "js";
            case 7:
                return "image";
            case 8:
                return "font";
            case 9:
                return "media";
            case 10:
                return "other";
            case 11:
                return "native";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String j(int i) {
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

    public static /* synthetic */ String k(int i) {
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

    public static /* synthetic */ String l(int i) {
        switch (i) {
            case 1:
                return "segment.userId";
            case 2:
                return "segment.traits";
            case 3:
                return "segment.anonymousId";
            case 4:
                return "segment.settings";
            case 5:
                return "segment.events";
            case 6:
                return "segment.app.version";
            case 7:
                return "segment.app.build";
            case 8:
                return "build";
            case 9:
                return "segment.device.id";
            default:
                throw null;
        }
    }

    public static int m(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static String n(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String o(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String p(int i, String str) {
        return str + i;
    }

    public static String q(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String r(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String s(Class cls, String str) {
        return str + cls;
    }

    public static String t(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static String u(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String v(String str, Path path) {
        return str + path;
    }

    public static StringBuilder w(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static void x(long j, lsc lscVar) {
        lscVar.setValue(new fcc(j));
    }

    public static void y(fj0 fj0Var, long j) {
        fj0Var.p().p();
        fj0Var.N(j);
    }

    public static void z(fqb fqbVar, float f, e18 e18Var, boolean z) {
        kxk.g(e18Var, b.e(fqbVar, f));
        e18Var.p(z);
    }
}
