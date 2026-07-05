package io.sentry;

import android.content.Context;
import android.os.Process;
import android.view.KeyEvent;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.ij0;
import defpackage.kie;
import defpackage.pqe;
import defpackage.sz6;
import defpackage.xh6;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URI;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static void a(String str) {
        r5.d().a(str);
    }

    public static r7 b(r7 r7Var) {
        if (r7Var.c != null) {
            return r7Var;
        }
        return new r7(r7Var.a, r7Var.b, c(null, r7Var.b, r7Var.a), r7Var.d, r7Var.e);
    }

    public static Double c(Double d, Double d2, Boolean bool) {
        if (d != null) {
            return d;
        }
        double dC = io.sentry.util.m.a().c();
        if (d2 == null || bool == null) {
            return Double.valueOf(dC);
        }
        if (bool.booleanValue()) {
            return Double.valueOf(d2.doubleValue() * dC);
        }
        return Double.valueOf(((1.0d - d2.doubleValue()) * dC) + d2.doubleValue());
    }

    public static io.sentry.android.core.j0 d(Object obj, Long l, boolean z, io.sentry.util.network.d dVar, List list, e0 e0Var) {
        LinkedHashMap linkedHashMapD;
        io.sentry.internal.debugmeta.c cVarC = z ? dVar.c(obj) : null;
        switch (e0Var.E) {
            case androidx.health.platform.client.proto.g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                kie kieVar = (kie) obj;
                kieVar.getClass();
                linkedHashMapD = io.sentry.okhttp.h.d(kieVar.c);
                break;
            default:
                pqe pqeVar = (pqe) obj;
                pqeVar.getClass();
                linkedHashMapD = io.sentry.okhttp.h.d(pqeVar.J);
                break;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                hashSet.add(str.toLowerCase(Locale.ROOT));
            }
        }
        for (Map.Entry entry : linkedHashMapD.entrySet()) {
            if (hashSet.contains(((String) entry.getKey()).toLowerCase(Locale.ROOT))) {
                linkedHashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return new io.sentry.android.core.j0(l, cVarC, linkedHashMap, 2);
    }

    public static boolean e(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            if (!e(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    public static BigDecimal f(Double d) {
        return BigDecimal.valueOf(d.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public static c g(c cVar, Boolean bool, Double d, Double d2) {
        if (cVar == null) {
            cVar = new c(z2.E);
        }
        if (cVar.d == null) {
            Double d3 = cVar.c;
            if (d3 != null) {
                d = d3;
            }
            Double dC = c(d2, d, bool);
            if (cVar.f) {
                cVar.d = dC;
            }
        }
        if (cVar.f && cVar.g) {
            cVar.f = false;
        }
        return cVar;
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String i() {
        byte[] bArr = new byte[16];
        io.sentry.util.m.a().b(bArr);
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & 63);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | 128);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | ((long) (bArr[i] & 255));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        UUID uuid = new UUID(j2, j);
        char[] cArr = io.sentry.util.p.a;
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        char[] cArr2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, cArr[(int) (((-1152921504606846976L) & leastSignificantBits) >>> 60)], cArr[(int) ((1080863910568919040L & leastSignificantBits) >>> 56)], cArr[(int) ((67553994410557440L & leastSignificantBits) >>> 52)], cArr[(int) ((4222124650659840L & leastSignificantBits) >>> 48)], cArr[(int) ((263882790666240L & leastSignificantBits) >>> 44)], cArr[(int) ((16492674416640L & leastSignificantBits) >>> 40)], cArr[(int) ((1030792151040L & leastSignificantBits) >>> 36)], cArr[(int) ((64424509440L & leastSignificantBits) >>> 32)], cArr[(int) ((4026531840L & leastSignificantBits) >>> 28)], cArr[(int) ((251658240 & leastSignificantBits) >>> 24)], cArr[(int) ((15728640 & leastSignificantBits) >>> 20)], cArr[(int) ((983040 & leastSignificantBits) >>> 16)], cArr[(int) ((61440 & leastSignificantBits) >>> 12)], cArr[(int) ((3840 & leastSignificantBits) >>> 8)], cArr[(int) ((240 & leastSignificantBits) >>> 4)], cArr[(int) (15 & leastSignificantBits)]};
        io.sentry.util.p.a(cArr2, mostSignificantBits);
        char[] cArr3 = io.sentry.util.p.a;
        return new String(cArr2);
    }

    public static String j(KeyEvent.Callback callback) {
        if (callback == null) {
            return null;
        }
        String canonicalName = callback.getClass().getCanonicalName();
        return canonicalName != null ? canonicalName : callback.getClass().getSimpleName();
    }

    public static Date k() {
        return Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.a).getTime();
    }

    public static Date l(long j) {
        Calendar calendar = Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.a);
        calendar.setTimeInMillis(j);
        return calendar.getTime();
    }

    public static Date m(String str) {
        try {
            return io.sentry.vendor.gson.internal.bind.util.a.c(str, new ParsePosition(0));
        } catch (ParseException unused) {
            sz6.p(ij0.i("timestamp is not ISO format ", str));
            return null;
        }
    }

    public static Date n(String str) {
        try {
            return l(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            sz6.p(ij0.i("timestamp is not millis format ", str));
            return null;
        }
    }

    public static String o(Date date) {
        TimeZone timeZone = io.sentry.vendor.gson.internal.bind.util.a.a;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(23 + (timeZone.getRawOffset() == 0 ? 1 : 6));
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar.get(1), 4, sb);
        sb.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar.get(2) + 1, 2, sb);
        sb.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar.get(5), 2, sb);
        sb.append('T');
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar.get(11), 2, sb);
        sb.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar.get(12), 2, sb);
        sb.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar.get(13), 2, sb);
        sb.append('.');
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar.get(14), 3, sb);
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int iAbs = Math.abs(i / 60);
            int iAbs2 = Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            io.sentry.vendor.gson.internal.bind.util.a.b(iAbs, 2, sb);
            sb.append(':');
            io.sentry.vendor.gson.internal.bind.util.a.b(iAbs2, 2, sb);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    public static boolean p(Context context) {
        v("The application context is required.", context);
        return context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    public static boolean q(Double d, boolean z) {
        return d == null ? z : !d.isNaN() && d.doubleValue() >= 0.0d && d.doubleValue() <= 1.0d;
    }

    public static ConcurrentHashMap r(Map map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static m s(String str) {
        String str2;
        int i = 5;
        Object obj = null;
        try {
            URI uri = new URI(str);
            if (uri.isAbsolute()) {
                try {
                    uri.toURL();
                } catch (Exception unused) {
                    return new m(obj, obj, obj, i);
                }
            }
            String rawPath = "";
            if (uri.getScheme() == null) {
                str2 = "";
            } else {
                str2 = uri.getScheme() + "://";
            }
            String rawAuthority = uri.getRawAuthority() == null ? "" : uri.getRawAuthority();
            if (uri.getRawPath() != null) {
                rawPath = uri.getRawPath();
            }
            String rawQuery = uri.getRawQuery();
            String rawFragment = uri.getRawFragment();
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            if (rawAuthority.contains("@")) {
                if (rawAuthority.startsWith("@")) {
                    rawAuthority = "[Filtered]".concat(rawAuthority);
                } else {
                    rawAuthority = (rawAuthority.substring(0, rawAuthority.indexOf(64)).contains(":") ? "[Filtered]:[Filtered]" : "[Filtered]").concat(rawAuthority.substring(rawAuthority.indexOf(64)));
                }
            }
            sb.append(rawAuthority);
            sb.append(rawPath);
            return new m(sb.toString(), rawQuery, rawFragment, i);
        } catch (Exception unused2) {
            return new m(obj, obj, obj, i);
        }
    }

    public static byte[] t(long j, String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        File file = new File(str);
        if (!file.exists()) {
            xh6.c(ij0.j("File '", file.getName(), "' doesn't exists"));
            return null;
        }
        if (!file.isFile()) {
            xh6.c(ij0.j("Reading path ", str, " failed, because it's not a file."));
            return null;
        }
        if (!file.canRead()) {
            xh6.c(ij0.j("Reading the item ", str, " failed, because can't read the file."));
            return null;
        }
        if (file.length() > j) {
            throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j)));
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bArr = new byte[FreeTypeConstants.FT_LOAD_NO_RECURSE];
                } finally {
                }
            } finally {
            }
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    bufferedInputStream.close();
                    fileInputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String u(File file) throws IOException {
        if (file == null || !file.exists() || !file.isFile() || !file.canRead()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line);
            }
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append("\n");
                sb.append(line2);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void v(String str, Object obj) {
        if (obj != null) {
            return;
        }
        sz6.p(str);
    }

    public static boolean w(w6 w6Var, w6 w6Var2, boolean z) {
        boolean z2 = io.sentry.util.k.a;
        int i = 0;
        if (!z2 && (w6Var2.getVersionDetector() instanceof o3)) {
            w6Var2.setVersionDetector(new p2(i, w6Var2));
        }
        if (!w6Var2.getVersionDetector().a()) {
            return !z || w6Var == null || w6Var2.isForceInit() || w6Var.getInitPriority().ordinal() <= w6Var2.getInitPriority().ordinal();
        }
        w6Var2.getLogger().h(t5.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        sz6.j(ij0.j("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See ", z2 ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions", " for more details."));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.sentry.m x(io.sentry.h1 r5, java.lang.String r6, java.util.List r7, io.sentry.p1 r8) {
        /*
            io.sentry.w6 r0 = r5.r()
            boolean r1 = r0.isTraceSampling()
            r2 = 0
            if (r1 == 0) goto La9
            java.util.List r0 = r0.getTracePropagationTargets()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L16
            goto L35
        L16:
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = r6.contains(r1)
            if (r3 == 0) goto L2d
            goto L33
        L2d:
            boolean r1 = r6.matches(r1)     // Catch: java.lang.Exception -> L1a
            if (r1 == 0) goto L1a
        L33:
            r6 = 1
            goto L36
        L35:
            r6 = 0
        L36:
            if (r6 == 0) goto La9
            io.sentry.w6 r6 = r5.r()
            r0 = 2
            r1 = 4
            if (r8 == 0) goto L69
            boolean r3 = r8.l()
            if (r3 != 0) goto L69
            io.sentry.c7 r5 = r8.c()
            io.sentry.d r7 = r8.o(r7)
            boolean r6 = r6.isPropagateTraceparent()
            if (r6 == 0) goto L63
            io.sentry.j7 r6 = r8.y()
            io.sentry.m r2 = new io.sentry.m
            io.sentry.protocol.w r8 = r6.E
            io.sentry.m7 r6 = r6.F
            java.lang.Boolean r3 = r5.c
            r2.<init>(r8, r6, r3, r0)
        L63:
            io.sentry.m r6 = new io.sentry.m
            r6.<init>(r5, r7, r2, r1)
            return r6
        L69:
            io.sentry.p2 r8 = new io.sentry.p2
            r8.<init>(r1)
            ja4 r3 = new ja4
            r4 = 8
            r3.<init>(r8, r4, r6)
            r5.w(r3)
            io.sentry.m r5 = io.sentry.p2.b(r8)
            if (r5 == 0) goto La9
            io.sentry.m r5 = io.sentry.p2.b(r8)
            java.lang.Object r8 = r5.d
            io.sentry.c r8 = (io.sentry.c) r8
            java.lang.Object r3 = r5.c
            io.sentry.m7 r3 = (io.sentry.m7) r3
            java.lang.Object r5 = r5.b
            io.sentry.protocol.w r5 = (io.sentry.protocol.w) r5
            io.sentry.d r7 = io.sentry.d.g(r8, r7)
            io.sentry.c7 r8 = new io.sentry.c7
            r8.<init>(r5, r3, r2)
            boolean r6 = r6.isPropagateTraceparent()
            if (r6 == 0) goto La3
            io.sentry.m r6 = new io.sentry.m
            r6.<init>(r5, r3, r2, r0)
            r2 = r6
        La3:
            io.sentry.m r5 = new io.sentry.m
            r5.<init>(r8, r7, r2, r1)
            return r5
        La9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.p.x(io.sentry.h1, java.lang.String, java.util.List, io.sentry.p1):io.sentry.m");
    }
}
