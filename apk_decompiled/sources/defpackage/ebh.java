package defpackage;

import android.health.connect.datatypes.AggregationType;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.core.telemetry.SilentException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ebh {
    public static void A(String str, ozf ozfVar, boolean z, int i) {
        SilentException.a(new SilentException(str), ozfVar, z, i);
    }

    public static void B(String str, String str2, dlb dlbVar, lvh lvhVar, iqb iqbVar) {
        str.getClass();
        str2.getClass();
        dlbVar.getClass();
        lvhVar.getClass();
        iqbVar.getClass();
    }

    public static void C(StringBuilder sb, Boolean bool, String str, Boolean bool2, String str2) {
        sb.append(bool);
        sb.append(str);
        sb.append(bool2);
        sb.append(str2);
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
                return "UNITY";
            case 7:
                return "KOTLIN_MULTIPLATFORM";
            case 8:
                return "ELECTRON";
            case 9:
                return "RUM_CPP";
            case 10:
                return "MAUI";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String E(int i) {
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
                return "UNITY";
            case 7:
                return "KOTLIN_MULTIPLATFORM";
            case 8:
                return "ELECTRON";
            case 9:
                return "RUM_CPP";
            case 10:
                return "MAUI";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String F(int i) {
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
                return "UNITY";
            case 7:
                return "KOTLIN_MULTIPLATFORM";
            case 8:
                return "ELECTRON";
            case 9:
                return "RUM_CPP";
            case 10:
                return "MAUI";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String G(int i) {
        switch (i) {
            case 1:
                return "CUSTOM_ATTRIBUTE";
            case 2:
                return "MASK_PLACEHOLDER";
            case 3:
                return "STANDARD_ATTRIBUTE";
            case 4:
                return "TEXT_CONTENT";
            case 5:
                return "MASK_DISALLOWED";
            case 6:
                return "BLANK";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String H(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "PROPERTY_SETTER" : "PROPERTY_GETTER" : "PROPERTY" : "FUNCTION";
    }

    public static /* synthetic */ String I(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK";
    }

    public static final vh9 a(int i) {
        return new vh9(e(i));
    }

    public static /* synthetic */ String b(int i) {
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

    public static /* synthetic */ String c(int i) {
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

    public static /* synthetic */ String d(int i) {
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

    public static /* synthetic */ String e(int i) {
        switch (i) {
            case 1:
                return "custom_attribute";
            case 2:
                return "mask_placeholder";
            case 3:
                return "standard_attribute";
            case 4:
                return "text_content";
            case 5:
                return "mask_disallowed";
            case 6:
                return "blank";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String f(int i) {
        switch (i) {
            case 1:
                return "dd-task-scheduler";
            case 2:
                return "dd-agent-startup-datadog-tracer";
            case 3:
                return "dd-trace-monitor";
            case 4:
                return "dd-trace-processor";
            case 5:
                return "dd-span-sampling-processor";
            case 6:
                return "dd-cassandra-session-executor";
            case 7:
                return "dd-metrics-aggregator";
            case 8:
                return "dd-statsd-client";
            case 9:
                return "dd-agent-startup-jmxfetch";
            case 10:
                return "dd-jmx-collector";
            case 11:
                return "dd-agent-startup-datadog-profiler";
            case 12:
                return "dd-profiler-recording-scheduler";
            case 13:
                return "dd-profiler-http-dispatcher";
            case 14:
                return "dd-appsec-http-dispatcher";
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return "dd-telemetry";
            case 16:
                return "dd-fleet-management-poller";
            case g.MAX_FIELD_NUMBER /* 17 */:
                return "dd-remote-config";
            case g.AVG_FIELD_NUMBER /* 18 */:
                return "dd-tracer-flare";
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return "dd-cws-tls";
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return "dd-process-supervisor";
            case 21:
                return "dd-debugger-upload-http-dispatcher";
            default:
                throw null;
        }
    }

    public static int g(int i, int i2, Map map) {
        return (map.hashCode() + i) * i2;
    }

    public static int h(Integer num, s64 s64Var, mnc mncVar) {
        int iIntValue = num.intValue();
        s64Var.getClass();
        mncVar.getClass();
        return iIntValue;
    }

    public static int i(Instant instant, int i, int i2) {
        return (instant.hashCode() + i) * i2;
    }

    public static int j(Date date, int i, int i2) {
        return (date.hashCode() + i) * i2;
    }

    public static cpc k(String str, float f, String str2) {
        return new cpc(str2, new vd0(str, f));
    }

    public static cpc l(String str, String str2) {
        return new cpc(str2, new vd0(str));
    }

    public static String m(yfa yfaVar, String str, String str2) {
        yfaVar.getClass();
        return str + str2;
    }

    public static String n(String str, String str2, List list) {
        return str + list + str2;
    }

    public static String o(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String p(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static String q(StringBuilder sb, ijb ijbVar, char c) {
        sb.append(ijbVar);
        sb.append(c);
        return sb.toString();
    }

    public static OffsetDateTime r(Instant instant, ZoneId zoneId) {
        OffsetDateTime offsetDateTime = instant.atZone(zoneId).toOffsetDateTime();
        offsetDateTime.getClass();
        return offsetDateTime;
    }

    public static HashMap s(Class cls, r11 r11Var) {
        HashMap map = new HashMap();
        map.put(cls, r11Var);
        return map;
    }

    public static Map t(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static NoWhenBranchMatchedException u(e18 e18Var, int i, boolean z) {
        e18Var.a0(i);
        e18Var.p(z);
        return new NoWhenBranchMatchedException();
    }

    public static void v(float f, StringBuilder sb, String str) {
        sb.append((Object) va6.c(f));
        sb.append(str);
    }

    public static void w(int i, int i2, int i3, int i4, int i5) {
        tpi.w(i);
        tpi.w(i2);
        tpi.w(i3);
        tpi.w(i4);
        tpi.w(i5);
    }

    public static void x(vr vrVar, AggregationType aggregationType, wig wigVar) {
        wigVar.a(new cpc(vrVar, aggregationType));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void y(m6b m6bVar) throws Exception {
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

    public static void z(String str, int i, String str2) {
        ysj.u(str2, str + i);
    }
}
