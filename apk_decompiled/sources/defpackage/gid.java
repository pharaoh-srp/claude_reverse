package defpackage;

import androidx.compose.foundation.layout.b;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class gid {
    public static /* synthetic */ String A(int i) {
        return i != 1 ? i != 2 ? "null" : "NON_BLOCKING" : "BLOCKING";
    }

    public static /* synthetic */ String B(int i) {
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

    public static /* synthetic */ String C(int i) {
        switch (i) {
            case 1:
                return "ANDROID";
            case 2:
                return "BROWSER";
            case 3:
                return "REACT_NATIVE";
            case 4:
                return "FLUTTER";
            case 5:
                return "NDK";
            case 6:
                return "NDK_IL2CPP";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String D(int i) {
        switch (i) {
            case 1:
                return "BEACON";
            case 2:
                return "FETCH";
            case 3:
                return "XHR";
            case 4:
                return "DOCUMENT";
            case 5:
                return "NATIVE";
            case 6:
                return "UNKNOWN";
            case 7:
                return "IMAGE";
            case 8:
                return "JS";
            case 9:
                return "FONT";
            case 10:
                return "CSS";
            case 11:
                return "MEDIA";
            case 12:
                return "OTHER";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String E(int i) {
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
                return "null";
        }
    }

    public static /* synthetic */ int F(String str) {
        if (str == null) {
            mr9.h("Name is null");
            return 0;
        }
        if (str.equals("px")) {
            return 1;
        }
        if (str.equals("em")) {
            return 2;
        }
        if (str.equals("ex")) {
            return 3;
        }
        if (str.equals("in")) {
            return 4;
        }
        if (str.equals("cm")) {
            return 5;
        }
        if (str.equals("mm")) {
            return 6;
        }
        if (str.equals("pt")) {
            return 7;
        }
        if (str.equals("pc")) {
            return 8;
        }
        if (str.equals("percent")) {
            return 9;
        }
        sz6.p("No enum constant com.caverock.androidsvg.SVG.Unit.".concat(str));
        return 0;
    }

    public static final boolean a(int i) {
        return !hrh.a();
    }

    public static final boolean b(int i) {
        Boolean bool;
        if (hrh.a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                hrh.a.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final vh9 c(int i) {
        return new vh9(h(i));
    }

    public static final vh9 d(int i) {
        return new vh9(i(i));
    }

    public static final vh9 e(int i) {
        return new vh9(l(i));
    }

    public static int f(String str) {
        if (str == null) {
            mr9.h("Name is null");
            return 0;
        }
        if (str.equals("QUERY")) {
            return 1;
        }
        if (str.equals("MUTATION")) {
            return 2;
        }
        if (str.equals("SUBSCRIPTION")) {
            return 3;
        }
        sz6.p("No enum constant com.datadog.android.rum.model.ResourceEvent.OperationType.".concat(str));
        return 0;
    }

    public static /* synthetic */ String g(int i) {
        if (i == 1) {
            return "android";
        }
        if (i == 2) {
            return "chrome";
        }
        if (i == 3) {
            return "ios";
        }
        throw null;
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "cache";
        }
        if (i == 2) {
            return "navigational-prefetch";
        }
        if (i == 3) {
            return "other";
        }
        throw null;
    }

    public static /* synthetic */ String i(int i) {
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

    public static /* synthetic */ String j(int i) {
        if (i == 1) {
            return "query";
        }
        if (i == 2) {
            return "mutation";
        }
        if (i == 3) {
            return "subscription";
        }
        throw null;
    }

    public static /* synthetic */ String k(int i) {
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

    public static /* synthetic */ String l(int i) {
        if (i == 1) {
            return "blocking";
        }
        if (i == 2) {
            return "non-blocking";
        }
        throw null;
    }

    public static /* synthetic */ String m(int i) {
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
                return "unity";
            case 7:
                return "kotlin-multiplatform";
            case 8:
                return "electron";
            case 9:
                return "rum-cpp";
            case 10:
                return "maui";
            default:
                throw null;
        }
    }

    public static int n(tkh tkhVar, int i, int i2) {
        return (tkhVar.hashCode() + i) * i2;
    }

    public static int o(Attributes attributes, int i) {
        return n2f.a(attributes.getLocalName(i)).ordinal();
    }

    public static String p(float f, int i, e18 e18Var, e18 e18Var2, fqb fqbVar) {
        kxk.g(e18Var, b.e(fqbVar, f));
        return d4c.j0(i, e18Var2);
    }

    public static String q(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static Set r(String str) {
        return sf5.f0(new at9(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void s(m6b m6bVar) throws Exception {
        boolean zIsTerminated;
        if (m6bVar instanceof AutoCloseable) {
            m6bVar.close();
            return;
        }
        if (!(m6bVar instanceof ExecutorService)) {
            mr9.y();
            return;
        }
        ExecutorService executorService = (ExecutorService) m6bVar;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void t(StringBuilder sb, String str, String str2, boolean z, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
    }

    public static /* synthetic */ boolean u(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, null)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean v(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, zff zffVar, Object obj) {
        while (!atomicReferenceFieldUpdater.compareAndSet(zffVar, obj, cgf.c)) {
            if (atomicReferenceFieldUpdater.get(zffVar) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String w(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "OTHER" : "NAVIGATIONAL_PREFETCH" : "CACHE";
    }

    public static /* synthetic */ String x(int i) {
        return i != 1 ? i != 2 ? "null" : "USER" : "SYNTHETICS";
    }

    public static /* synthetic */ String y(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE";
    }

    public static /* synthetic */ String z(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "4G" : "3G" : "2G" : "SLOW_2G";
    }
}
