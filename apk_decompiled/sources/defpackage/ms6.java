package defpackage;

import com.anthropic.claude.api.account.SendProductEmailLinkRequest;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ms6 {
    public static /* synthetic */ String A(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String B(int i) {
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

    public static /* synthetic */ String C(int i) {
        switch (i) {
            case 1:
                return "NETWORK";
            case 2:
                return "SOURCE";
            case 3:
                return "CONSOLE";
            case 4:
                return "LOGGER";
            case 5:
                return "AGENT";
            case 6:
                return "WEBVIEW";
            case 7:
                return "CUSTOM";
            case 8:
                return "REPORT";
            default:
                return "null";
        }
    }

    public static final boolean a(int i, e92 e92Var) {
        return (e92Var.getKind() != 2) == (i == 1);
    }

    public static final vh9 b(int i) {
        return new vh9(n(i));
    }

    public static final String c(int i, Field field) {
        String name = field.getName();
        StringBuilder sb = new StringBuilder();
        int length = name.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = name.charAt(i2);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append('_');
            }
            sb.append(cCharAt);
        }
        return sb.toString().toLowerCase(Locale.ENGLISH);
    }

    public static /* synthetic */ boolean d(int i) {
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3 || i == 4) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
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

    public static /* synthetic */ String f(int i) {
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

    public static /* synthetic */ String g(int i) {
        if (i == 1) {
            return "starting";
        }
        if (i == 2) {
            return "running";
        }
        if (i == 3) {
            return "stopped";
        }
        if (i == 4) {
            return "error";
        }
        throw null;
    }

    public static /* synthetic */ String h(int i) {
        switch (i) {
            case 1:
                return "ad";
            case 2:
                return "advertising";
            case 3:
                return "analytics";
            case 4:
                return "cdn";
            case 5:
                return "content";
            case 6:
                return "customer-success";
            case 7:
                return "first party";
            case 8:
                return "hosting";
            case 9:
                return "marketing";
            case 10:
                return "other";
            case 11:
                return "social";
            case 12:
                return "tag-manager";
            case 13:
                return "utility";
            case 14:
                return "video";
            default:
                throw null;
        }
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
        switch (i) {
            case 1:
                return "android";
            case 2:
                return "browser";
            case 3:
                return "ios";
            case 4:
                return "react-native";
            case 5:
                return "flutter";
            case 6:
                return "roku";
            case 7:
                return "ndk";
            case 8:
                return "ios+il2cpp";
            case 9:
                return "ndk+il2cpp";
            case 10:
                return "windows";
            case 11:
                return "macos";
            case 12:
                return "linux";
            case 13:
                return "maui";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String k(int i) {
        if (i == 1) {
            return "enforce";
        }
        if (i == 2) {
            return "report";
        }
        throw null;
    }

    public static /* synthetic */ String l(int i) {
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

    public static /* synthetic */ String m(int i) {
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

    public static /* synthetic */ String n(int i) {
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

    public static /* synthetic */ String o(int i) {
        if (i == 1) {
            return "not-supported-by-browser";
        }
        if (i == 2) {
            return "failed-to-lazy-load";
        }
        if (i == 3) {
            return "missing-document-policy-header";
        }
        if (i == 4) {
            return "unexpected-exception";
        }
        throw null;
    }

    public static /* synthetic */ String p(int i) {
        switch (i) {
            case 1:
                return "network";
            case 2:
                return "source";
            case 3:
                return "console";
            case 4:
                return "logger";
            case 5:
                return "agent";
            case 6:
                return "webview";
            case 7:
                return "custom";
            case 8:
                return "report";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String q(int i) {
        if (i == 1) {
            return "handled";
        }
        if (i == 2) {
            return "unhandled";
        }
        throw null;
    }

    public static /* synthetic */ String r(int i) {
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

    public static cpc s(int i, zv1 zv1Var) {
        return new cpc(zv1Var, new ku9(i));
    }

    public static cpc t(int i, xm4 xm4Var) {
        return new cpc(xm4Var, new wm4(i));
    }

    public static cpc u(int i, wwe wweVar) {
        return new cpc(wweVar, new ku9(i));
    }

    public static cpc v(dw9 dw9Var, dw9 dw9Var2, Integer num) {
        return new cpc(new z8g(dw9Var, dw9Var2), num);
    }

    public static void w(int i, int i2, int i3, int i4, int i5) {
        zsj.b(i);
        zsj.b(i2);
        zsj.b(i3);
        zsj.b(i4);
        zsj.b(i5);
    }

    public static void x(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(list);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void y(String str, String str2, ArrayList arrayList) {
        arrayList.add(str + str2);
    }

    public static /* synthetic */ void z(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, vf9 vf9Var, cm6 cm6Var, j09 j09Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(vf9Var, cm6Var, j09Var) && atomicReferenceFieldUpdater.get(vf9Var) == cm6Var) {
        }
    }
}
