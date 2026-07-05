package io.sentry;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import defpackage.g11;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public final class d implements y0, io.sentry.cache.tape.f {
    public final Object E;

    public d(int i, boolean z) {
        switch (i) {
            case 4:
                Looper mainLooper = Looper.getMainLooper();
                mainLooper.getClass();
                this.E = new Handler(mainLooper);
                break;
            case 5:
            default:
                this.E = new io.sentry.android.core.l0(z2.E);
                break;
            case 6:
                this.E = new io.sentry.util.h(new e0(18));
                break;
            case 7:
                this.E = new io.sentry.transport.o();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0258 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.sentry.d g(io.sentry.c r27, java.util.List r28) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.d.g(io.sentry.c, java.util.List):io.sentry.d");
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.w a(io.sentry.protocol.k kVar) {
        return ((m4) this.E).p(kVar);
    }

    @Override // io.sentry.cache.tape.f
    public Object b(byte[] bArr) {
        w6 w6Var = ((io.sentry.cache.g) this.E).a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), io.sentry.cache.g.c));
            try {
                g gVar = (g) w6Var.getSerializer().c(bufferedReader, g.class);
                bufferedReader.close();
                return gVar;
            } finally {
            }
        } catch (Throwable th) {
            w6Var.getLogger().b(t5.ERROR, th, "Error reading entity from scope cache", new Object[0]);
            return null;
        }
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.w c(io.sentry.protocol.k kVar) {
        return ((m4) this.E).G(kVar);
    }

    @Override // io.sentry.cache.tape.f
    public void d(OutputStream outputStream, Object obj) throws IOException {
        g gVar = (g) obj;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, io.sentry.cache.g.c));
        try {
            ((io.sentry.cache.g) this.E).a.getSerializer().a(gVar, bufferedWriter);
            bufferedWriter.close();
        } catch (Throwable th) {
            try {
                bufferedWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.w e(io.sentry.protocol.k kVar) {
        return ((m4) this.E).G(kVar);
    }

    public void f(io.sentry.android.core.v0 v0Var) {
        ((io.sentry.android.core.l0) this.E).getClass();
        if (Build.VERSION.SDK_INT <= 28) {
            String callingPackage = v0Var.getCallingPackage();
            String packageName = v0Var.getContext().getPackageName();
            if (callingPackage == null || !callingPackage.equals(packageName)) {
                throw new SecurityException("Provider does not allow for granting of Uri permissions");
            }
        }
    }

    public void h(y yVar, a1 a1Var, Object obj) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) yVar.F;
        if (obj == null) {
            cVar.f();
            return;
        }
        if (obj instanceof Character) {
            yVar.A(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            yVar.A((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            yVar.B(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            yVar.z((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                yVar.A(p.o((Date) obj));
                return;
            } catch (Exception e) {
                a1Var.d(t5.ERROR, "Error when serializing Date", e);
                cVar.f();
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                yVar.A(((TimeZone) obj).getID());
                return;
            } catch (Exception e2) {
                a1Var.d(t5.ERROR, "Error when serializing TimeZone", e2);
                cVar.f();
                return;
            }
        }
        if (obj instanceof m2) {
            ((m2) obj).serialize(yVar, a1Var);
            return;
        }
        if (obj instanceof Collection) {
            i(yVar, a1Var, (Collection) obj);
            return;
        }
        int i = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i < length) {
                arrayList.add(Boolean.valueOf(zArr[i]));
                i++;
            }
            i(yVar, a1Var, arrayList);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList2 = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i < length2) {
                arrayList2.add(Byte.valueOf(bArr[i]));
                i++;
            }
            i(yVar, a1Var, arrayList2);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            ArrayList arrayList3 = new ArrayList(sArr.length);
            int length3 = sArr.length;
            while (i < length3) {
                arrayList3.add(Short.valueOf(sArr[i]));
                i++;
            }
            i(yVar, a1Var, arrayList3);
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            ArrayList arrayList4 = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                arrayList4.add(Character.valueOf(cArr[i]));
                i++;
            }
            i(yVar, a1Var, arrayList4);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            int length5 = iArr.length;
            while (i < length5) {
                arrayList5.add(Integer.valueOf(iArr[i]));
                i++;
            }
            i(yVar, a1Var, arrayList5);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            int length6 = jArr.length;
            while (i < length6) {
                arrayList6.add(Long.valueOf(jArr[i]));
                i++;
            }
            i(yVar, a1Var, arrayList6);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            int length7 = fArr.length;
            while (i < length7) {
                arrayList7.add(Float.valueOf(fArr[i]));
                i++;
            }
            i(yVar, a1Var, arrayList7);
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            int length8 = dArr.length;
            while (i < length8) {
                arrayList8.add(Double.valueOf(dArr[i]));
                i++;
            }
            i(yVar, a1Var, arrayList8);
            return;
        }
        if (obj.getClass().isArray()) {
            i(yVar, a1Var, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            j(yVar, a1Var, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            yVar.A(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            i(yVar, a1Var, io.sentry.util.f.a((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            yVar.B(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            yVar.A(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            yVar.A(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            yVar.A(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            yVar.A(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            j(yVar, a1Var, io.sentry.util.f.b((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            yVar.A(obj.toString());
            return;
        }
        try {
            h(yVar, a1Var, ((g11) this.E).p(a1Var, obj));
        } catch (Exception e3) {
            a1Var.d(t5.ERROR, "Failed serializing unknown object.", e3);
            yVar.A("[OBJECT]");
        }
    }

    public void i(y yVar, a1 a1Var, Collection collection) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) yVar.F;
        cVar.n();
        cVar.c();
        int i = cVar.G;
        int[] iArr = cVar.F;
        if (i == iArr.length) {
            cVar.F = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = cVar.F;
        int i2 = cVar.G;
        cVar.G = i2 + 1;
        iArr2[i2] = 1;
        cVar.E.write(91);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            h(yVar, a1Var, it.next());
        }
        cVar.d(1, 2, ']');
    }

    public void j(y yVar, a1 a1Var, Map map) throws IOException {
        yVar.n();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                yVar.r((String) obj);
                h(yVar, a1Var, map.get(obj));
            }
        }
        yVar.p();
    }

    public /* synthetic */ d(Object obj) {
        this.E = obj;
    }

    public d(int i) {
        this.E = new g11(i, 13);
    }
}
