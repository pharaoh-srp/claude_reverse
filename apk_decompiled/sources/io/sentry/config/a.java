package io.sentry.config;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.node.Owner;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.tasks.TaskSessionEvent;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.av9;
import defpackage.bsg;
import defpackage.cu9;
import defpackage.eb1;
import defpackage.g5c;
import defpackage.kie;
import defpackage.kw9;
import defpackage.l9e;
import defpackage.m11;
import defpackage.m5c;
import defpackage.mr9;
import defpackage.mwa;
import defpackage.nai;
import defpackage.pqe;
import defpackage.pya;
import defpackage.rqe;
import defpackage.tie;
import defpackage.tui;
import defpackage.u15;
import defpackage.wg6;
import defpackage.wg8;
import defpackage.x44;
import io.sentry.a1;
import io.sentry.a7;
import io.sentry.android.core.internal.gestures.h;
import io.sentry.android.core.l0;
import io.sentry.android.replay.viewhierarchy.g;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.exception.SentryHttpClientException;
import io.sentry.h1;
import io.sentry.i1;
import io.sentry.j5;
import io.sentry.l1;
import io.sentry.m;
import io.sentry.n0;
import io.sentry.n1;
import io.sentry.p;
import io.sentry.p3;
import io.sentry.protocol.a0;
import io.sentry.protocol.c0;
import io.sentry.protocol.d0;
import io.sentry.protocol.f;
import io.sentry.protocol.i0;
import io.sentry.protocol.j0;
import io.sentry.protocol.o;
import io.sentry.protocol.r;
import io.sentry.protocol.s;
import io.sentry.protocol.u;
import io.sentry.protocol.v;
import io.sentry.t4;
import io.sentry.t5;
import io.sentry.util.k;
import io.sentry.util.l;
import io.sentry.w;
import io.sentry.w4;
import io.sentry.w6;
import io.sentry.x2;
import io.sentry.y;
import io.sentry.z2;
import io.sentry.z6;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.ServiceLoader;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static Boolean a;
    public static io.sentry.internal.debugmeta.c b;

    public static void A(a1 a1Var) {
        try {
            Iterator it = ServiceLoader.load(io.sentry.profiling.a.class).iterator();
            if ((it.hasNext() ? it.next() : null) != null) {
                throw new ClassCastException();
            }
            a1Var.h(t5.DEBUG, "No continuous profiler provider found, using NoOpContinuousProfiler", new Object[0]);
        } catch (Throwable th) {
            a1Var.d(t5.ERROR, "Failed to load continuous profiler provider, using NoOpContinuousProfiler", th);
        }
    }

    public static void B() {
        a1 logger = t4.c.m.getLogger();
        try {
            Iterator it = ServiceLoader.load(io.sentry.profiling.b.class).iterator();
            if ((it.hasNext() ? it.next() : null) != null) {
                throw new ClassCastException();
            }
            logger.h(t5.DEBUG, "No profile converter provider found, using NoOpProfileConverter", new Object[0]);
        } catch (Throwable th) {
            logger.d(t5.ERROR, "Failed to load profile converter provider, using NoOpProfileConverter", th);
        }
    }

    public static byte[] C(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[FreeTypeConstants.FT_LOAD_NO_RECURSE];
            while (true) {
                int i = inputStream.read(bArr, 0, FreeTypeConstants.FT_LOAD_NO_RECURSE);
                if (i == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final boolean D(l lVar, Double d) {
        lVar.getClass();
        return d != null && d.doubleValue() >= lVar.c();
    }

    public static void E(w4 w4Var, y yVar, a1 a1Var) {
        if (w4Var.E != null) {
            yVar.r("event_id");
            yVar.x(a1Var, w4Var.E);
        }
        yVar.r("contexts");
        yVar.x(a1Var, w4Var.F);
        if (w4Var.G != null) {
            yVar.r("sdk");
            yVar.x(a1Var, w4Var.G);
        }
        if (w4Var.H != null) {
            yVar.r("request");
            yVar.x(a1Var, w4Var.H);
        }
        AbstractMap abstractMap = w4Var.I;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            yVar.r("tags");
            yVar.x(a1Var, w4Var.I);
        }
        if (w4Var.J != null) {
            yVar.r(BuildConfig.BUILD_TYPE);
            yVar.A(w4Var.J);
        }
        if (w4Var.K != null) {
            yVar.r("environment");
            yVar.A(w4Var.K);
        }
        if (w4Var.L != null) {
            yVar.r("platform");
            yVar.A(w4Var.L);
        }
        if (w4Var.M != null) {
            yVar.r("user");
            yVar.x(a1Var, w4Var.M);
        }
        if (w4Var.O != null) {
            yVar.r("server_name");
            yVar.A(w4Var.O);
        }
        if (w4Var.P != null) {
            yVar.r("dist");
            yVar.A(w4Var.P);
        }
        List list = w4Var.Q;
        if (list != null && !list.isEmpty()) {
            yVar.r("breadcrumbs");
            yVar.x(a1Var, w4Var.Q);
        }
        if (w4Var.R != null) {
            yVar.r("debug_meta");
            yVar.x(a1Var, w4Var.R);
        }
        AbstractMap abstractMap2 = w4Var.S;
        if (abstractMap2 == null || abstractMap2.isEmpty()) {
            return;
        }
        yVar.r("extra");
        yVar.x(a1Var, w4Var.S);
    }

    public static void F(io.sentry.rrweb.b bVar, y yVar, a1 a1Var) {
        yVar.r("type");
        yVar.x(a1Var, bVar.E);
        yVar.r("timestamp");
        yVar.w(bVar.F);
    }

    public static void G(io.sentry.rrweb.e eVar, y yVar, a1 a1Var) {
        yVar.r("source");
        yVar.x(a1Var, eVar.G);
    }

    public static final void I(l1 l1Var, w6 w6Var, pya pyaVar) {
        w6Var.getClass();
        try {
            l1Var.submit(new tui(pyaVar, 16, w6Var));
        } catch (Throwable th) {
            w6Var.getLogger().d(t5.ERROR, "Failed to submit task ReplayIntegration.finalize_previous_replay to executor", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void J(View view, g gVar, eb1 eb1Var, a1 a1Var, List list) {
        av9 root;
        eb1Var.getClass();
        a1Var.getClass();
        if (view instanceof ViewGroup) {
            kw9 kw9Var = io.sentry.android.replay.viewhierarchy.b.a;
            if (bsg.u0(view.getClass().getName(), "AndroidComposeView", false)) {
                try {
                    Owner owner = view instanceof Owner ? (Owner) view : null;
                    if (owner != null && (root = owner.getRoot()) != null) {
                        io.sentry.android.replay.viewhierarchy.b.b(root, gVar, true, eb1Var, a1Var);
                        return;
                    }
                } catch (Throwable th) {
                    a1Var.b(t5.ERROR, th, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    viewGroup.indexOfChild(childAt);
                    g gVarO = o(childAt, gVar, eb1Var);
                    arrayList.add(gVarO);
                    if (list != null && (gVarO instanceof io.sentry.android.replay.viewhierarchy.e) && gVarO.e) {
                        list.add(gVarO);
                    }
                    J(childAt, gVarO, eb1Var, a1Var, list);
                }
            }
            gVar.g = arrayList;
        }
    }

    public static void K(j5 j5Var, w6 w6Var) {
        ArrayList arrayListE = j5Var.e();
        if (arrayListE != null) {
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                c0 c0Var = ((v) it.next()).I;
                if (c0Var != null) {
                    L(c0Var, j5Var, w6Var, "Truncated exception stack frames of event %s");
                }
            }
        }
        ArrayList arrayListF = j5Var.f();
        if (arrayListF != null) {
            Iterator it2 = arrayListF.iterator();
            while (it2.hasNext()) {
                c0 c0Var2 = ((d0) it2.next()).M;
                if (c0Var2 != null) {
                    L(c0Var2, j5Var, w6Var, "Truncated thread stack frames for event %s");
                }
            }
        }
    }

    public static void L(c0 c0Var, j5 j5Var, w6 w6Var, String str) {
        List list = c0Var.E;
        if (list == null || list.size() <= 500) {
            return;
        }
        ArrayList arrayList = new ArrayList(500);
        arrayList.addAll(list.subList(0, 250));
        arrayList.addAll(list.subList(list.size() - 250, list.size()));
        c0Var.E = arrayList;
        w6Var.getLogger().h(t5.DEBUG, str, j5Var.E);
    }

    public static CopyOnWriteArrayList M(CopyOnWriteArrayList copyOnWriteArrayList) {
        ArrayList arrayList = new ArrayList();
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                mr9.o();
                return null;
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }

    public static final l9e a(cu9 cu9Var, cu9 cu9Var2) {
        cu9Var.getClass();
        cu9 cu9VarA = cu9Var2 == null ? nai.A(cu9Var) : cu9Var2;
        float fK = (int) (cu9VarA.k() >> 32);
        float fK2 = (int) (cu9VarA.k() & 4294967295L);
        l9e l9eVarJ = cu9VarA.J(cu9Var, true);
        float f = l9eVarJ.a;
        float f2 = MTTypesetterKt.kLineSkipLimitMultiplier;
        if (f < MTTypesetterKt.kLineSkipLimitMultiplier) {
            f = 0.0f;
        }
        if (f > fK) {
            f = fK;
        }
        float f3 = l9eVarJ.b;
        if (f3 < MTTypesetterKt.kLineSkipLimitMultiplier) {
            f3 = 0.0f;
        }
        if (f3 > fK2) {
            f3 = fK2;
        }
        float f4 = l9eVarJ.c;
        if (f4 < MTTypesetterKt.kLineSkipLimitMultiplier) {
            f4 = 0.0f;
        }
        if (f4 <= fK) {
            fK = f4;
        }
        float f5 = l9eVarJ.d;
        if (f5 >= MTTypesetterKt.kLineSkipLimitMultiplier) {
            f2 = f5;
        }
        if (f2 <= fK2) {
            fK2 = f2;
        }
        if (f == fK || f3 == fK2) {
            return l9e.e;
        }
        long jB = cu9VarA.b((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long jB2 = cu9VarA.b((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fK)) << 32));
        long jB3 = cu9VarA.b((((long) Float.floatToRawIntBits(fK)) << 32) | (((long) Float.floatToRawIntBits(fK2)) & 4294967295L));
        long jB4 = cu9VarA.b((((long) Float.floatToRawIntBits(fK2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jB4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jB3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jB & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jB2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jB4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jB3 & 4294967295L));
        return new l9e(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static String b(String str) {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new BigInteger("10".concat(str), 16).toByteArray());
            byteBufferWrap.get();
            return String.format("%08x-%04x-%04x-%04x-%04x%08x", Integer.valueOf(byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN).getInt()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.order(ByteOrder.BIG_ENDIAN).getShort()), Short.valueOf(byteBufferWrap.getShort()), Integer.valueOf(byteBufferWrap.getInt()));
        } catch (NumberFormatException | BufferUnderflowException unused) {
            return null;
        }
    }

    public static void c(h1 h1Var, kie kieVar, pqe pqeVar) {
        h1Var.getClass();
        kieVar.getClass();
        wg8 wg8Var = kieVar.c;
        pqeVar.getClass();
        wg8 wg8Var2 = pqeVar.J;
        m mVarS = p.s(kieVar.a.i);
        o oVar = new o();
        oVar.E = "SentryOkHttpInterceptor";
        StringBuilder sb = new StringBuilder("HTTP Client Error with status code: ");
        int i = pqeVar.H;
        sb.append(i);
        j5 j5Var = new j5(new ExceptionMechanismException(oVar, new SentryHttpClientException(sb.toString()), Thread.currentThread(), true));
        n0 n0Var = new n0();
        n0Var.d("okHttp:request", kieVar);
        n0Var.d("okHttp:response", pqeVar);
        r rVar = new r();
        rVar.E = (String) mVarS.b;
        rVar.G = (String) mVarS.c;
        rVar.N = (String) mVarS.d;
        rVar.I = h1Var.r().isSendDefaultPii() ? wg8Var.a("Cookie") : null;
        rVar.F = kieVar.b;
        rVar.J = p.r(q(h1Var, wg8Var));
        tie tieVar = kieVar.d;
        Long lValueOf = tieVar != null ? Long.valueOf(tieVar.contentLength()) : null;
        if (lValueOf != null && lValueOf.longValue() != -1) {
            rVar.L = Long.valueOf(lValueOf.longValue());
        }
        s sVar = new s();
        sVar.E = h1Var.r().isSendDefaultPii() ? wg8Var2.a("Set-Cookie") : null;
        sVar.F = p.r(q(h1Var, wg8Var2));
        sVar.G = Integer.valueOf(i);
        rqe rqeVar = pqeVar.K;
        Long lValueOf2 = rqeVar != null ? Long.valueOf(rqeVar.d()) : null;
        if (lValueOf2 != null && lValueOf2.longValue() != -1) {
            sVar.H = Long.valueOf(lValueOf2.longValue());
        }
        j5Var.H = rVar;
        j5Var.F.s(sVar);
        h1Var.I(j5Var, n0Var);
    }

    public static Bitmap d(Activity activity, a1 a1Var, l0 l0Var) {
        int i = 0;
        if (activity.isFinishing() || activity.isDestroyed()) {
            a1Var.h(t5.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            a1Var.h(t5.DEBUG, "Activity window is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            a1Var.h(t5.DEBUG, "DecorView is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View rootView = viewPeekDecorView.getRootView();
        if (rootView == null) {
            a1Var.h(t5.DEBUG, "Root view is null, not taking screenshot.", new Object[0]);
            return null;
        }
        if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
            a1Var.h(t5.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            l0Var.getClass();
            HandlerThread handlerThread = new HandlerThread("SentryScreenshot");
            handlerThread.start();
            try {
                Handler handler = new Handler(handlerThread.getLooper());
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                PixelCopy.request(window, bitmapCreateBitmap, new io.sentry.android.core.internal.util.l(atomicBoolean, i, countDownLatch), handler);
                if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                    if (atomicBoolean.get()) {
                        i = 1;
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
            if (i == 0) {
                return null;
            }
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            a1Var.d(t5.ERROR, "Taking screenshot failed.", th);
            return null;
        }
    }

    public static ClassLoader e(ClassLoader classLoader) {
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader : ClassLoader.getSystemClassLoader();
    }

    public static io.sentry.protocol.profiling.a f(u15 u15Var) {
        Iterator it;
        ArrayList arrayList = (ArrayList) u15Var.G;
        io.sentry.protocol.profiling.a aVar = new io.sentry.protocol.profiling.a();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        HashMap map2 = new HashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            StackTraceElement[] stackTraceElementArr = ((io.sentry.android.core.anr.g) it2.next()).E;
            ArrayList<Integer> arrayList4 = new ArrayList();
            int length = stackTraceElementArr.length;
            int i = 0;
            while (i < length) {
                StackTraceElement stackTraceElement = stackTraceElementArr[i];
                String str = stackTraceElement.getClassName() + "#" + stackTraceElement.getMethodName() + "#" + stackTraceElement.getFileName() + "#" + stackTraceElement.getLineNumber();
                Integer numValueOf = (Integer) map.get(str);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(arrayList2.size());
                    a0 a0Var = new a0();
                    it = it2;
                    a0Var.H = stackTraceElement.getFileName();
                    a0Var.I = stackTraceElement.getMethodName();
                    a0Var.J = stackTraceElement.getClassName();
                    a0Var.K = stackTraceElement.getLineNumber() > 0 ? Integer.valueOf(stackTraceElement.getLineNumber()) : null;
                    if (stackTraceElement.isNativeMethod()) {
                        a0Var.Q = Boolean.TRUE;
                    }
                    arrayList2.add(a0Var);
                    map.put(str, numValueOf);
                } else {
                    it = it2;
                }
                arrayList4.add(numValueOf);
                i++;
                it2 = it;
            }
            Iterator it3 = it2;
            StringBuilder sb = new StringBuilder();
            for (Integer num : arrayList4) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(num);
            }
            String string = sb.toString();
            Integer numValueOf2 = (Integer) map2.get(string);
            if (numValueOf2 == null) {
                numValueOf2 = Integer.valueOf(arrayList3.size());
                arrayList3.add(new ArrayList(arrayList4));
                map2.put(string, numValueOf2);
            }
            io.sentry.protocol.profiling.b bVar = new io.sentry.protocol.profiling.b();
            bVar.E = r6.F / 1000.0d;
            bVar.F = numValueOf2.intValue();
            bVar.G = TaskSessionEvent.REPLAY_FROM_START;
            aVar.E.add(bVar);
            it2 = it3;
        }
        aVar.G = arrayList2;
        aVar.F = arrayList3;
        io.sentry.protocol.profiling.c cVar = new io.sentry.protocol.profiling.c();
        cVar.E = "main";
        cVar.F = 5;
        aVar.H = Collections.singletonMap(TaskSessionEvent.REPLAY_FROM_START, cVar);
        return aVar;
    }

    public static i1 g(h hVar) {
        Class clsH;
        if (!k.a) {
            z2 z2Var = z2.E;
            if (h.b(z2Var, "io.sentry.opentelemetry.OtelContextScopesStorage") && (clsH = h.h(z2Var, "io.sentry.opentelemetry.OtelContextScopesStorage")) != null) {
                try {
                    Object objNewInstance = clsH.getDeclaredConstructor(null).newInstance(null);
                    if (objNewInstance != null && (objNewInstance instanceof i1)) {
                        return (i1) objNewInstance;
                    }
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
        }
        return new w();
    }

    public static b h() {
        Properties propertiesB;
        Properties propertiesB2;
        x2 x2Var = new x2();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e("sentry.", System.getProperties()));
        arrayList.add(new c());
        String property = System.getProperty("sentry.properties.file");
        if (property != null && (propertiesB2 = new m11(property, x2Var, true).b()) != null) {
            arrayList.add(new e(propertiesB2));
        }
        String str = System.getenv("SENTRY_PROPERTIES_FILE");
        if (str != null && (propertiesB = new m11(str, x2Var, true).b()) != null) {
            arrayList.add(new e(propertiesB));
        }
        Properties properties = null;
        try {
            InputStream resourceAsStream = e(a.class.getClassLoader()).getResourceAsStream("sentry.properties");
            if (resourceAsStream != null) {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                    try {
                        Properties properties2 = new Properties();
                        properties2.load(bufferedInputStream);
                        bufferedInputStream.close();
                        resourceAsStream.close();
                        properties = properties2;
                    } finally {
                    }
                } finally {
                }
            } else if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException e) {
            x2Var.b(t5.ERROR, e, "Failed to load Sentry configuration from classpath resource: %s", "sentry.properties");
        }
        if (properties != null) {
            arrayList.add(new e(properties));
        }
        Properties propertiesB3 = new m11("sentry.properties", x2Var, false).b();
        if (propertiesB3 != null) {
            arrayList.add(new e(propertiesB3));
        }
        return new b(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean i(w4 w4Var, String str, p3 p3Var, a1 a1Var) {
        int i;
        boolean z;
        Object[] objArr;
        i = 7;
        z = false;
        objArr = 0;
        switch (str) {
            case "debug_meta":
                w4Var.R = (f) p3Var.o0(a1Var, new io.sentry.clientreport.a(i));
                return true;
            case "server_name":
                w4Var.O = p3Var.I();
                return true;
            case "contexts":
                w4Var.F.l(io.sentry.clientreport.a.c(p3Var, a1Var));
                return true;
            case "environment":
                w4Var.K = p3Var.I();
                return true;
            case "breadcrumbs":
                w4Var.Q = p3Var.E0(a1Var, new io.sentry.f(objArr == true ? 1 : 0));
                return true;
            case "sdk":
                w4Var.G = (u) p3Var.o0(a1Var, new io.sentry.clientreport.a(19));
                return true;
            case "dist":
                w4Var.P = p3Var.I();
                return true;
            case "tags":
                w4Var.I = p.r((Map) p3Var.v0());
                return true;
            case "user":
                w4Var.M = (i0) p3Var.o0(a1Var, new io.sentry.clientreport.a(29));
                return true;
            case "extra":
                w4Var.S = p.r((Map) p3Var.v0());
                return true;
            case "event_id":
                w4Var.E = (io.sentry.protocol.w) p3Var.o0(a1Var, new io.sentry.clientreport.e(z));
                return true;
            case "release":
                w4Var.J = p3Var.I();
                return true;
            case "request":
                w4Var.H = (r) p3Var.o0(a1Var, new io.sentry.clientreport.a(17));
                return true;
            case "platform":
                w4Var.L = p3Var.I();
                return true;
            default:
                return false;
        }
    }

    public static boolean j(io.sentry.rrweb.b bVar, String str, p3 p3Var, a1 a1Var) {
        if (str.equals("type")) {
            io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) p3Var.o0(a1Var, new j0(3));
            p.v("", cVar);
            bVar.E = cVar;
            return true;
        }
        if (!str.equals("timestamp")) {
            return false;
        }
        bVar.F = p3Var.nextLong();
        return true;
    }

    public static boolean k(io.sentry.rrweb.e eVar, String str, p3 p3Var, a1 a1Var) {
        if (!str.equals("source")) {
            return false;
        }
        io.sentry.rrweb.d dVar = (io.sentry.rrweb.d) p3Var.o0(a1Var, new io.sentry.clientreport.e(7));
        p.v("", dVar);
        eVar.G = dVar;
        return true;
    }

    public static io.sentry.transport.p l() {
        return new io.sentry.transport.p(-1);
    }

    public static io.sentry.transport.p m(int i) {
        return new io.sentry.transport.p(i);
    }

    public static io.sentry.android.replay.y n(Context context, a7 a7Var, int i, int i2) {
        context.getClass();
        float f = i2;
        float f2 = f / context.getResources().getDisplayMetrics().density;
        z6 z6Var = a7Var.f;
        int iL = mwa.L(f2 * z6Var.sizeScale);
        int i3 = iL % 16;
        Integer numValueOf = Integer.valueOf(i3 <= 8 ? Math.max(16, iL - i3) : iL + (16 - i3));
        float f3 = i;
        int iL2 = mwa.L((f3 / context.getResources().getDisplayMetrics().density) * z6Var.sizeScale);
        int i4 = iL2 % 16;
        Integer numValueOf2 = Integer.valueOf(i4 <= 8 ? Math.max(16, iL2 - i4) : iL2 + (16 - i4));
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        return new io.sentry.android.replay.y(iIntValue2, iIntValue, iIntValue2 / f3, iIntValue / f, a7Var.g, z6Var.bitRate);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.sentry.android.replay.viewhierarchy.g o(android.view.View r12, io.sentry.android.replay.viewhierarchy.g r13, defpackage.eb1 r14) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.config.a.o(android.view.View, io.sentry.android.replay.viewhierarchy.g, eb1):io.sentry.android.replay.viewhierarchy.g");
    }

    public static io.sentry.internal.debugmeta.c p() {
        Method declaredMethod;
        io.sentry.internal.debugmeta.c cVar = b;
        if (cVar != null) {
            return cVar;
        }
        Method method = null;
        try {
            declaredMethod = av9.class.getDeclaredMethod("getChildren$ui_release", null);
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            declaredMethod = null;
        }
        try {
            Method declaredMethod2 = av9.class.getDeclaredMethod("getOuterCoordinator$ui_release", null);
            declaredMethod2.setAccessible(true);
            method = declaredMethod2;
        } catch (NoSuchMethodException unused2) {
        }
        io.sentry.internal.debugmeta.c cVar2 = new io.sentry.internal.debugmeta.c(declaredMethod, 4, method);
        b = cVar2;
        return cVar2;
    }

    public static LinkedHashMap q(h1 h1Var, wg8 wg8Var) {
        if (!h1Var.r().isSendDefaultPii()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = wg8Var.size();
        for (int i = 0; i < size; i++) {
            String strE = wg8Var.e(i);
            if (!io.sentry.util.d.a.contains(strE.toUpperCase(Locale.ROOT))) {
                linkedHashMap.put(strE, wg8Var.k(i));
            }
        }
        return linkedHashMap;
    }

    public static io.sentry.protocol.g r(int i) {
        if (i == 1) {
            return io.sentry.protocol.g.PORTRAIT;
        }
        if (i != 2) {
            return null;
        }
        return io.sentry.protocol.g.LANDSCAPE;
    }

    public static final Window s(View view) throws IllegalAccessException {
        Field field;
        view.getClass();
        kw9 kw9Var = io.sentry.android.replay.i0.a;
        View rootView = view.getRootView();
        rootView.getClass();
        Class cls = (Class) io.sentry.android.replay.i0.a.getValue();
        if (cls == null || !cls.isInstance(rootView) || (field = (Field) io.sentry.android.replay.i0.b.getValue()) == null) {
            return null;
        }
        Object obj = field.get(rootView);
        obj.getClass();
        return (Window) obj;
    }

    public static io.sentry.android.replay.v u() {
        io.sentry.android.replay.v vVar = new io.sentry.android.replay.v();
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new pya(25, vVar));
        return vVar;
    }

    public static boolean v(List list, j5 j5Var) {
        if (j5Var != null && list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            io.sentry.protocol.p pVar = j5Var.U;
            if (pVar != null) {
                String str = pVar.F;
                if (str != null) {
                    hashSet.add(str);
                }
                String str2 = pVar.E;
                if (str2 != null) {
                    hashSet.add(str2);
                }
            }
            Throwable thB = j5Var.b();
            if (thB != null) {
                hashSet.add(thB.toString());
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(((io.sentry.l0) it.next()).a)) {
                    return true;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                io.sentry.l0 l0Var = (io.sentry.l0) it2.next();
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    if (l0Var.b((String) it3.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean w(j5 j5Var, w6 w6Var) {
        long j;
        n1 serializer = w6Var.getSerializer();
        a1 logger = w6Var.getLogger();
        Charset charset = io.sentry.util.f.a;
        try {
            io.sentry.util.e eVar = new io.sentry.util.e();
            serializer.a(j5Var, eVar);
            j = eVar.E;
        } catch (Throwable th) {
            logger.d(t5.ERROR, "Could not calculate size of serializable", th);
            j = 0;
        }
        return j <= w6.MAX_EVENT_SIZE_BYTES;
    }

    public static boolean y(av9 av9Var) throws IllegalAccessException, InvocationTargetException {
        g5c g5cVar = av9Var.k0;
        Boolean bool = a;
        Boolean bool2 = Boolean.FALSE;
        if (x44.r(bool, bool2)) {
            return ((m5c) g5cVar.I).p1();
        }
        if (x44.r(bool, Boolean.TRUE)) {
            Method method = (Method) p().G;
            method.getClass();
            Object objInvoke = method.invoke(av9Var, null);
            objInvoke.getClass();
            return ((m5c) objInvoke).p1();
        }
        if (bool != null) {
            wg6.i();
            return false;
        }
        try {
            boolean zP1 = ((m5c) g5cVar.I).p1();
            a = bool2;
            return zP1;
        } catch (NoSuchMethodError unused) {
            a = Boolean.TRUE;
            Method method2 = (Method) p().G;
            method2.getClass();
            Object objInvoke2 = method2.invoke(av9Var, null);
            objInvoke2.getClass();
            return ((m5c) objInvoke2).p1();
        }
    }

    public static j5 z(j5 j5Var, w6 w6Var) {
        try {
            if (w6Var.isEnableEventSizeLimiting() && !w(j5Var, w6Var)) {
                w6Var.getLogger().h(t5.INFO, "Event %s exceeds %d bytes limit. Reducing size by dropping fields.", j5Var.E, Long.valueOf(w6.MAX_EVENT_SIZE_BYTES));
                w6Var.getOnOversizedEvent();
                List list = j5Var.Q;
                if (list != null && !list.isEmpty()) {
                    j5Var.Q = null;
                    w6Var.getLogger().h(t5.DEBUG, "Removed breadcrumbs to reduce size of event %s", j5Var.E);
                }
                if (!w(j5Var, w6Var)) {
                    K(j5Var, w6Var);
                    if (!w(j5Var, w6Var)) {
                        w6Var.getLogger().h(t5.WARNING, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server.", j5Var.E);
                        return j5Var;
                    }
                }
            }
            return j5Var;
        } catch (Throwable th) {
            w6Var.getLogger().d(t5.ERROR, "An error occurred while limiting event size. Event will be sent as-is.", th);
            return j5Var;
        }
    }

    public abstract int t();

    public abstract boolean x();
}
