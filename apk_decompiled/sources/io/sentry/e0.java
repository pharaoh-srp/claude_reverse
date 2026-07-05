package io.sentry;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.core.app.FrameMetricsAggregator;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.util.Collections;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements io.sentry.util.g {
    public final /* synthetic */ int E;

    public /* synthetic */ e0(int i) {
        this.E = i;
    }

    public static /* synthetic */ void b() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void c(double d, String str) {
        throw new IllegalArgumentException(str + d);
    }

    public static /* synthetic */ void d(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void e(String str, Object obj) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void g(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void h(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void i(Throwable th) {
        throw new IllegalArgumentException(th);
    }

    public Object a(Context context) {
        String string = null;
        switch (this.E) {
            case 10:
                try {
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                } catch (Throwable unused) {
                    return null;
                }
            case 11:
                try {
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                } catch (Throwable unused2) {
                    return null;
                }
            case 12:
                try {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    int i = applicationInfo.labelRes;
                    if (i == 0) {
                        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                        string = charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                    } else {
                        string = context.getString(i);
                    }
                    break;
                } catch (Throwable unused3) {
                }
                return string;
            case 13:
                try {
                    return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
                } catch (Throwable unused4) {
                    return null;
                }
            default:
                try {
                    return context.getPackageManager().getApplicationInfo(context.getPackageName(), FreeTypeConstants.FT_LOAD_PEDANTIC);
                } catch (Throwable unused5) {
                    return null;
                }
        }
    }

    @Override // io.sentry.util.g
    public Object f() {
        long j = 0;
        switch (this.E) {
            case 4:
                return w6.empty();
            case 6:
                return new v4();
            case 7:
                byte[] bArr = new byte[8];
                io.sentry.util.m.a().b(bArr);
                byte b = (byte) (bArr[6] & 15);
                bArr[6] = b;
                bArr[6] = (byte) (b | 64);
                for (int i = 0; i < 8; i++) {
                    j = (j << 8) | ((long) (bArr[i] & 255));
                }
                char[] cArr = new char[16];
                io.sentry.util.p.a(cArr, j);
                return new String(cArr);
            case 9:
                return new FrameMetricsAggregator();
            case androidx.health.platform.client.proto.g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new Timer(true);
            case androidx.health.platform.client.proto.g.AVG_FIELD_NUMBER /* 18 */:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (io.sentry.clientreport.d dVar : io.sentry.clientreport.d.values()) {
                    for (o oVar : o.values()) {
                        concurrentHashMap.put(new io.sentry.clientreport.c(dVar.getReason(), oVar.getCategory()), new AtomicLong(0L));
                    }
                }
                return Collections.unmodifiableMap(concurrentHashMap);
            default:
                return p.i();
        }
    }
}
