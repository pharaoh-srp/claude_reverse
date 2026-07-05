package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Parcel;
import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class fsh {
    public static /* synthetic */ boolean A(AtomicReference atomicReference, at atVar) {
        while (!atomicReference.compareAndSet(null, atVar)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String B(int i) {
        if (i == 1) {
            return "UNKNOWN_COMPARISON_TYPE";
        }
        if (i == 2) {
            return "LESS_THAN";
        }
        if (i == 3) {
            return "GREATER_THAN";
        }
        if (i == 4) {
            return "EQUAL";
        }
        if (i == 5) {
            return "BETWEEN";
        }
        throw null;
    }

    public static /* synthetic */ String C(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN_MATCH_TYPE";
            case 2:
                return "REGEXP";
            case 3:
                return "BEGINS_WITH";
            case 4:
                return "ENDS_WITH";
            case 5:
                return "PARTIAL";
            case 6:
                return "EXACT";
            case 7:
                return "IN_LIST";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String D(int i) {
        switch (i) {
            case 1:
                return "Doctype";
            case 2:
                return "StartTag";
            case 3:
                return "EndTag";
            case 4:
                return "Comment";
            case 5:
                return "Character";
            case 6:
                return "XmlDecl";
            case 7:
                return "EOF";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String E(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "OUT_VARIANCE" : "IN_VARIANCE" : "INVARIANT";
    }

    public static /* synthetic */ String F(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "UNEXPECTED_EXCEPTION" : "MISSING_DOCUMENT_POLICY_HEADER" : "FAILED_TO_LAZY_LOAD" : "NOT_SUPPORTED_BY_BROWSER";
    }

    public static /* synthetic */ String G(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "ERROR" : "STOPPED" : "RUNNING" : "STARTING";
    }

    public static /* synthetic */ String H(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "MASK_USER_INPUT" : "MASK" : "ALLOW";
    }

    public static /* synthetic */ String I(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "CUSTOM" : "TIME_BASED_CUSTOM" : "TIME_BASED_DEFAULT" : "DISABLED";
    }

    public static /* synthetic */ String J(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "WRITE_ONLY" : "READ_ONLY" : "READ_AND_WRITE";
    }

    public static final vh9 a(int i) {
        return new vh9(j(i));
    }

    public static final vh9 b(int i) {
        return new vh9(k(i));
    }

    public static final vh9 c(int i) {
        return new vh9(l(i));
    }

    public static final vh9 d(int i) {
        String str;
        switch (i) {
            case 1:
                str = "android";
                break;
            case 2:
                str = "ios";
                break;
            case 3:
                str = "browser";
                break;
            case 4:
                str = "flutter";
                break;
            case 5:
                str = "react-native";
                break;
            case 6:
                str = "roku";
                break;
            case 7:
                str = "unity";
                break;
            case 8:
                str = "kotlin-multiplatform";
                break;
            case 9:
                str = "electron";
                break;
            case 10:
                str = "rum-cpp";
                break;
            case 11:
                str = "maui";
                break;
            default:
                throw null;
        }
        return new vh9(str);
    }

    public static int[] e() {
        return sq6.H(3);
    }

    public static int f(int i) {
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

    public static int g(int i) {
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

    public static final int h(int i) {
        return sq6.F(i);
    }

    public static /* synthetic */ boolean i(int i) {
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ String j(int i) {
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

    public static /* synthetic */ String k(int i) {
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

    public static /* synthetic */ String l(int i) {
        if (i == 1) {
            return "allow";
        }
        if (i == 2) {
            return "mask";
        }
        if (i == 3) {
            return "mask-user-input";
        }
        throw null;
    }

    public static /* synthetic */ String m(int i) {
        if (i == 1) {
            return "active";
        }
        if (i == 2) {
            return "passive";
        }
        if (i == 3) {
            return "hidden";
        }
        if (i == 4) {
            return "frozen";
        }
        if (i == 5) {
            return "terminated";
        }
        throw null;
    }

    public static /* synthetic */ String n(int i) {
        if (i == 1) {
            return "";
        }
        if (i == 2) {
            return "in";
        }
        if (i == 3) {
            return "out";
        }
        throw null;
    }

    public static int o(double d, int i, int i2) {
        return (Double.hashCode(d) + i) * i2;
    }

    public static int p(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static UnsupportedOperationException q(Parcel parcel) {
        lyj.b(parcel);
        return new UnsupportedOperationException();
    }

    public static HashMap r(Class cls, qqj qqjVar) {
        HashMap map = new HashMap();
        map.put(cls, qqjVar);
        return map;
    }

    public static HashMap s(Class cls, uqj uqjVar) {
        HashMap map = new HashMap();
        map.put(cls, uqjVar);
        return map;
    }

    public static qqj t(HashMap map, int i) {
        Collections.unmodifiableMap(new HashMap(map));
        return new qqj(i);
    }

    public static uqj u(HashMap map, int i) {
        Collections.unmodifiableMap(new HashMap(map));
        return new uqj(i);
    }

    public static /* synthetic */ void v(View view) {
        if (view == null) {
            return;
        }
        mr9.o();
    }

    public static /* synthetic */ void w(Object obj) throws Exception {
        boolean zIsTerminated;
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (!(obj instanceof ExecutorService)) {
            if (obj instanceof TypedArray) {
                ((TypedArray) obj).recycle();
                return;
            }
            if (obj instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) obj).release();
                return;
            } else if (obj instanceof MediaDrm) {
                ((MediaDrm) obj).release();
                return;
            } else {
                mr9.y();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) obj;
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

    public static void x(HashMap map) {
        Collections.unmodifiableMap(new HashMap(map));
    }

    public static void y(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z, String str2, boolean z2) {
        pluginGeneratedSerialDescriptor.j(str, z);
        pluginGeneratedSerialDescriptor.j(str2, z2);
        pluginGeneratedSerialDescriptor.k(new xmb(20));
    }

    public static /* synthetic */ void z(xek xekVar) {
        if (xekVar == null) {
            return;
        }
        mr9.o();
    }
}
