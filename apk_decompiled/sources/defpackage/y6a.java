package defpackage;

import com.agog.mathdisplay.parse.MTMathAtom;
import com.agog.mathdisplay.parse.MTMathAtomType;
import com.anthropic.claude.api.account.SendProductEmailLinkRequest;
import com.google.crypto.tink.shaded.protobuf.e;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class y6a {
    public static /* synthetic */ String A(int i) {
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

    public static final vh9 a(int i) {
        return new vh9(i(i));
    }

    public static /* synthetic */ String b(int i) {
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

    public static /* synthetic */ String c(int i) {
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

    public static /* synthetic */ String d(int i) {
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

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "long-task";
        }
        if (i == 2) {
            return "long-animation-frame";
        }
        throw null;
    }

    public static /* synthetic */ String f(int i) {
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

    public static /* synthetic */ String g(int i) {
        switch (i) {
            case 1:
                return "user-callback";
            case 2:
                return "event-listener";
            case 3:
                return "resolve-promise";
            case 4:
                return "reject-promise";
            case 5:
                return "classic-script";
            case 6:
                return "module-script";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String h(int i) {
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

    public static /* synthetic */ String i(int i) {
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

    public static /* synthetic */ String j(int i) {
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

    public static /* synthetic */ String k(int i) {
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

    public static int l(int i, int i2, int i3) {
        return e.h(i) + i2 + i3;
    }

    public static int m(int i, int i2, int i3, int i4) {
        return e.i(i) + i2 + i3 + i4;
    }

    public static cpc n(MTMathAtomType mTMathAtomType, String str, String str2) {
        return new cpc(str2, new MTMathAtom(mTMathAtomType, str));
    }

    public static String o(String str, String str2, String str3, List list, String str4) {
        return str + str2 + str3 + list + str4;
    }

    public static String p(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static void q(long j, String str, StringBuilder sb) {
        sb.append((Object) d54.i(j));
        sb.append(str);
    }

    public static /* synthetic */ void r(Object obj) {
        throw new ClassCastException();
    }

    public static void s(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
    }

    public static /* synthetic */ void t(Map map) {
        throw new ClassCastException();
    }

    public static /* synthetic */ void u(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ifa ifaVar, kfa kfaVar, kfa kfaVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(ifaVar, kfaVar, kfaVar2) && atomicReferenceFieldUpdater.get(ifaVar) == kfaVar) {
        }
    }

    public static /* synthetic */ String v(int i) {
        if (i == 1) {
            return "FINAL";
        }
        if (i == 2) {
            return "SEALED";
        }
        if (i == 3) {
            return "OPEN";
        }
        if (i == 4) {
            return "ABSTRACT";
        }
        throw null;
    }

    public static /* synthetic */ String w(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "DEBUG" : "WARNING" : "ERROR";
    }

    public static /* synthetic */ String x(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TOO_LONG" : "TOO_SHORT_NSN" : "TOO_SHORT_AFTER_IDD" : "NOT_A_NUMBER" : "INVALID_COUNTRY_CODE";
    }

    public static /* synthetic */ String y(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION";
    }

    public static /* synthetic */ String z(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNSPECIFIED" : "FROM_DEFAULT_COUNTRY" : "FROM_NUMBER_WITHOUT_PLUS_SIGN" : "FROM_NUMBER_WITH_IDD" : "FROM_NUMBER_WITH_PLUS_SIGN";
    }
}
