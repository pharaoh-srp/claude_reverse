package defpackage;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.compose.foundation.layout.b;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class vb7 {
    public static void A(fqb fqbVar, float f, e18 e18Var, boolean z) {
        kxk.g(e18Var, b.t(fqbVar, f));
        e18Var.p(z);
    }

    public static void B(SharedPreferences sharedPreferences, String str, boolean z) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    public static /* synthetic */ void C(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                mr9.y();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
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

    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "_dd.local.head_sampling_rate_key";
        }
        if (i == 2) {
            return "_dd.local.tail_sampling_rate_key";
        }
        if (i == 3) {
            return "_dd.local.view_instrumentation_type_key";
        }
        throw null;
    }

    public static int b(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int c(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int d(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    public static int e(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static zub f(e18 e18Var) {
        zub zubVar = new zub();
        e18Var.k0(zubVar);
        return zubVar;
    }

    public static isc g(int i, e18 e18Var) {
        isc iscVar = new isc(i);
        e18Var.k0(iscVar);
        return iscVar;
    }

    public static dae h(Object obj) {
        sf5.h0(obj);
        return new dae();
    }

    public static String i() {
        String string = UUID.randomUUID().toString();
        string.getClass();
        return string;
    }

    public static String j(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    public static String k(int i, String str, String str2, String str3) {
        return str + i + str2 + str3;
    }

    public static String l(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String m(long j, String str) {
        return str + j;
    }

    public static String n(e18 e18Var, int i, int i2, e18 e18Var2, boolean z) {
        e18Var.a0(i);
        String strJ0 = d4c.j0(i2, e18Var2);
        e18Var.p(z);
        return strJ0;
    }

    public static String o(Class cls, StringBuilder sb) {
        sb.append(cls.getCanonicalName());
        return sb.toString();
    }

    public static String p(String str, int i, char c) {
        return str + i + c;
    }

    public static String q(String str, String str2, int i, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String r(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String t(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static StringBuilder u(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder v(String str, String str2, int i, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder w(String str, String str2, String str3, long j) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(j);
        return sb;
    }

    public static KotlinNothingValueException x(String str) {
        e39.b(str);
        return new KotlinNothingValueException();
    }

    public static void y(int i, ta4 ta4Var, e18 e18Var, boolean z) {
        ta4Var.invoke(e18Var, Integer.valueOf(i));
        e18Var.p(z);
    }

    public static void z(int i, pz7 pz7Var, e18 e18Var, boolean z, boolean z2) {
        pz7Var.invoke(e18Var, Integer.valueOf(i));
        e18Var.p(z);
        e18Var.p(z2);
    }
}
