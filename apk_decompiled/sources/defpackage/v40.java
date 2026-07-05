package defpackage;

import android.content.res.Configuration;
import android.graphics.BlurMaskFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public abstract class v40 implements nvi {
    public static volatile FirebaseAnalytics a;
    public static final Object b = new Object();
    public static final ta4 c = new ta4(-39202156, false, new eb4(9));
    public static final ta4 d = new ta4(1582488484, false, new eb4(10));
    public static final ta4 e = new ta4(414328099, false, new eb4(11));
    public static final ta4 f = new ta4(-1514016380, false, new eb4(12));
    public static final o54 g = o54.V;
    public static final float h = 3.0f;
    public static final q0g i = q0g.G;
    public static final l9e j = new l9e(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 10.0f, 10.0f);
    public static final String[] k = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};
    public static final String[] l = {"ad_impression"};
    public static final String[] m = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
    public static final String[] n = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(defpackage.bz7 r17, defpackage.n78 r18, defpackage.n78 r19, defpackage.xub r20, defpackage.wjf r21, defpackage.wjf r22) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v40.A(bz7, n78, n78, xub, wjf, wjf):void");
    }

    public static final Object B(Future future, String str, h99 h99Var) {
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.E;
        h99Var.getClass();
        if (future == null) {
            return null;
        }
        try {
            return future.get();
        } catch (InterruptedException e2) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new rb1(str, 3), e2, 48);
            return null;
        } catch (CancellationException e3) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new rb1(str, 4), e3, 48);
            return null;
        } catch (ExecutionException e4) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new rb1(str, 5), e4, 48);
            return null;
        }
    }

    public static final int C(lze lzeVar) throws Exception {
        lzeVar.getClass();
        tze tzeVarL0 = lzeVar.L0("SELECT changes()");
        try {
            tzeVarL0.H0();
            int i2 = (int) tzeVarL0.getLong(0);
            csg.o(tzeVarL0, null);
            return i2;
        } finally {
        }
    }

    public static final boolean D(wjf wjfVar) {
        m5c m5cVarD = wjfVar.d();
        ewb ewbVar = wjfVar.d.E;
        return (m5cVarD != null ? m5cVarD.p1() : false) || ewbVar.c(akf.q) || ewbVar.c(akf.p);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean E(defpackage.wjf r14) {
        /*
            boolean r0 = D(r14)
            r1 = 0
            if (r0 != 0) goto L5b
            qjf r14 = r14.d
            boolean r0 = r14.G
            if (r0 != 0) goto L59
            ewb r14 = r14.E
            java.lang.Object[] r0 = r14.b
            java.lang.Object[] r2 = r14.c
            long[] r14 = r14.a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5b
            r4 = r1
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L35:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            dkf r11 = (defpackage.dkf) r11
            boolean r10 = r11.c
            if (r10 == 0) goto L4e
            goto L59
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L52:
            if (r7 != r8) goto L5b
        L54:
            if (r4 == r3) goto L5b
            int r4 = r4 + 1
            goto L1b
        L59:
            r14 = 1
            return r14
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v40.E(wjf):boolean");
    }

    public static final boolean F(ld4 ld4Var) {
        return (((Configuration) ((e18) ld4Var).j(w00.a)).uiMode & 48) == 32;
    }

    public static int G(int i2, int i3, int i4) throws IOException {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        xh6.c(grc.o(i4, i2, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x017a A[LOOP:5: B:102:0x0178->B:103:0x017a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b7 A[LOOP:7: B:113:0x01b5->B:114:0x01b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long H(java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v40.H(java.lang.String):long");
    }

    public static bh9 I(JsonReader jsonReader) {
        boolean zIsLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            try {
                return gb9.O(jsonReader);
            } catch (OutOfMemoryError e2) {
                throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e2);
            } catch (StackOverflowError e3) {
                throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e3);
            }
        } finally {
            jsonReader.setLenient(zIsLenient);
        }
    }

    public static bh9 J(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            bh9 bh9VarI = I(jsonReader);
            bh9VarI.getClass();
            if (!(bh9VarI instanceof oh9) && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return bh9VarI;
        } catch (MalformedJsonException e2) {
            throw new JsonSyntaxException(e2);
        } catch (IOException e3) {
            throw new JsonIOException(e3);
        } catch (NumberFormatException e4) {
            throw new JsonSyntaxException(e4);
        }
    }

    public static final vpc K(zy7 zy7Var, boolean z, ld4 ld4Var) {
        Object obj = null;
        boolean z2 = false;
        f9c f9cVar = vpc.p;
        lz1 lz1Var = jd4.a;
        int i2 = 0;
        if (!z) {
            e18 e18Var = (e18) ld4Var;
            e18Var.a0(-65919139);
            Object objN = e18Var.N();
            if (objN == lz1Var) {
                objN = new vpc(new wpc(z2 ? 1 : 0, 15), f9cVar);
                e18Var.k0(objN);
            }
            vpc vpcVar = (vpc) objN;
            e18Var.p(false);
            return vpcVar;
        }
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.a0(-65982906);
        toh tohVar = (toh) zy7Var.a();
        zn5 zn5VarA = qig.a(e18Var2);
        boolean zF = e18Var2.f(zn5VarA);
        Object objN2 = e18Var2.N();
        if (zF || objN2 == lz1Var) {
            objN2 = new ir5(zn5VarA);
            e18Var2.k0(objN2);
        }
        ir5 ir5Var = (ir5) objN2;
        ypc ypcVar = (ypc) tohVar.d.getValue();
        lm6 lm6Var = lm6.E;
        boolean zF2 = e18Var2.f(lm6Var) | e18Var2.d(-1);
        Object objN3 = e18Var2.N();
        if (zF2 || objN3 == lz1Var) {
            e18Var2.k0(null);
        } else {
            obj = objN3;
        }
        mpc mpcVar = (mpc) obj;
        boolean zF3 = e18Var2.f(lm6Var);
        Object objN4 = e18Var2.N();
        if (zF3 || objN4 == lz1Var) {
            e18Var2.k0(mpcVar);
            objN4 = mpcVar;
        }
        mpc mpcVar2 = (mpc) objN4;
        y5f y5fVarK = dgj.K(new f9c(11), new y1c(17));
        y5f y5fVarK2 = dgj.K(new f9c(10), new y1c(16));
        Object[] objArr = new Object[0];
        y5f y5fVarK3 = dgj.K(new oee(y5fVarK, y5fVarK2, i2), new nee(y5fVarK, y5fVarK2, i2));
        Object objN5 = e18Var2.N();
        if (objN5 == lz1Var) {
            objN5 = k91.J;
            e18Var2.k0(objN5);
        }
        Map map = (Map) iuj.K(objArr, y5fVarK3, (zy7) objN5, e18Var2, 384);
        Object obj2 = map.get(ypcVar);
        Object obj3 = obj2;
        if (obj2 == null) {
            wpc wpcVar = new wpc(mpcVar, 7);
            map.put(ypcVar, wpcVar);
            obj3 = wpcVar;
        }
        wpc wpcVar2 = (wpc) obj3;
        eae eaeVarG = knk.G(f9cVar, e18Var2);
        eaeVarG.a = f9cVar;
        Object objN6 = e18Var2.N();
        if (objN6 == lz1Var) {
            objN6 = new vpc(wpcVar2, new tz9(13, eaeVarG));
            e18Var2.k0(objN6);
        }
        vpc vpcVar2 = (vpc) objN6;
        yig yigVar = vpc.o;
        Object[] objArr2 = {ypcVar, lm6Var, yigVar, ir5Var};
        boolean zF4 = e18Var2.f(wpcVar2) | e18Var2.h(lm6Var) | e18Var2.h(yigVar) | e18Var2.f(ir5Var) | e18Var2.f(mpcVar2);
        Object objN7 = e18Var2.N();
        if (zF4 || objN7 == lz1Var) {
            m80 m80Var = new m80(vpcVar2, wpcVar2, lm6Var, yigVar, ir5Var, mpcVar2, null, 4);
            e18Var2.k0(m80Var);
            objN7 = m80Var;
        }
        fd9.l(objArr2, (pz7) objN7, e18Var2);
        e18Var2.p(false);
        return vpcVar2;
    }

    public static final l5h L(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        m7f m7fVar = (m7f) e18Var.j(gr9.b);
        boolean zH = e18Var.h(m7fVar);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            objN = new g03(m7fVar, 4);
            e18Var.k0(objN);
        }
        kce kceVar = jce.a;
        String strB = oq5.B(kceVar.b(l5h.class));
        return (l5h) fd9.r0(kceVar.b(l5h.class), strB, (bz7) objN, e18Var);
    }

    public static final Object M(c4a c4aVar, a4a a4aVar, pz7 pz7Var, xzg xzgVar) {
        Object objN;
        if (a4aVar != a4a.F) {
            return (c4aVar.b() != a4a.E && (objN = fd9.N(new zw(c4aVar, a4aVar, pz7Var, null, 19), xzgVar)) == m45.E) ? objN : iei.a;
        }
        sz6.p("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }

    public static final void N(ScheduledExecutorService scheduledExecutorService, String str, long j2, h99 h99Var, Runnable runnable) {
        scheduledExecutorService.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        h99Var.getClass();
        try {
            scheduledExecutorService.schedule(runnable, j2, timeUnit);
        } catch (RejectedExecutionException e2) {
            dch.I(h99Var, 5, x44.X(g99.F, g99.G), new rb1(str, 6), e2, 48);
        }
    }

    public static final byte[] O(bof bofVar, Object obj, h99 h99Var) {
        obj.getClass();
        h99Var.getClass();
        try {
            String strO = bofVar.o(obj);
            if (strO == null) {
                return null;
            }
            byte[] bytes = strO.getBytes(dj2.a);
            bytes.getClass();
            return bytes;
        } catch (Throwable th) {
            dch.I(h99Var, 5, x44.X(g99.E, g99.G), new ijd(6, obj), th, 48);
            return null;
        }
    }

    public static final Future P(ExecutorService executorService, String str, h99 h99Var, Callable callable) {
        executorService.getClass();
        h99Var.getClass();
        try {
            return executorService.submit(callable);
        } catch (RejectedExecutionException e2) {
            dch.I(h99Var, 5, x44.X(g99.F, g99.G), new rb1(str, 7), e2, 48);
            return null;
        }
    }

    public static final long Q(int i2, zh6 zh6Var) {
        if (zh6Var.compareTo(zh6.SECONDS) > 0) {
            return R(i2, zh6Var);
        }
        return o(TimeUnit.NANOSECONDS.convert(i2, zh6Var.E));
    }

    public static final long R(long j2, zh6 zh6Var) {
        TimeUnit timeUnit = zh6Var.E;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j2 && j2 <= jConvert) {
            return o(timeUnit2.convert(j2, timeUnit));
        }
        if (zh6Var.compareTo(zh6.MILLISECONDS) < 0) {
            return m(wd6.f0(TimeUnit.MILLISECONDS.convert(j2, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j2);
        if (j2 < -9223372036854775807L) {
            j2 = -9223372036854775807L;
        }
        return m(iv1.o(Math.abs(j2), zh6Var) * jSignum);
    }

    public static final JsonElement S(bg9 bg9Var, Object obj, znf znfVar) {
        bg9Var.getClass();
        znfVar.getClass();
        dae daeVar = new dae();
        new ui9(bg9Var, new hfh(7, daeVar), 0).h(obj, znfVar);
        Object obj2 = daeVar.E;
        if (obj2 != null) {
            return (JsonElement) obj2;
        }
        x44.o0("result");
        throw null;
    }

    public static final void a(int i2, ld4 ld4Var, bz7 bz7Var, iqb iqbVar) {
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-932836462);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.f(iqbVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (e18Var.h(bz7Var) ? 32 : 16);
        int i5 = 0;
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            kxk.g(e18Var, zni.s(iqbVar, bz7Var));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kb2(iqbVar, bz7Var, i2, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.iqb r32, java.lang.String r33, defpackage.pz7 r34, defpackage.pz7 r35, defpackage.pz7 r36, defpackage.pz7 r37, int r38, long r39, long r41, defpackage.wbj r43, float r44, final defpackage.ta4 r45, defpackage.ld4 r46, final int r47, final int r48) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v40.b(iqb, java.lang.String, pz7, pz7, pz7, pz7, int, long, long, wbj, float, ta4, ld4, int, int):void");
    }

    public static final void c(final iqb iqbVar, final float f2, ld4 ld4Var, final int i2, final int i3) {
        int i4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-686949628);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = (e18Var.f(iqbVar) ? 4 : 2) | i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ((i3 & 2) == 0 && e18Var.c(f2)) ? 32 : 16;
        }
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            e18Var.V();
            if ((i2 & 1) == 0 || e18Var.A()) {
                if (i5 != 0) {
                    iqbVar = fqb.E;
                }
                if ((i3 & 2) != 0) {
                    f2 = 28.0f;
                }
            } else {
                e18Var.T();
            }
            e18Var.q();
            xn5.N(u00.D(R.drawable.logo_claude_horizontal, 0, e18Var), d4c.j0(R.string.claude_logo_content_description, e18Var), b.g(iqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, f2, 1), null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var, 8, 120);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: aha
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i2 | 1);
                    v40.c(iqbVar, f2, (ld4) obj, iP0, i3);
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final boolean r18, final defpackage.zy7 r19, defpackage.zy7 r20, final boolean r21, final defpackage.iqb r22, defpackage.pz7 r23, defpackage.ld4 r24, final int r25, final int r26) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v40.d(boolean, zy7, zy7, boolean, iqb, pz7, ld4, int, int):void");
    }

    public static final void e(kz9 kz9Var, Object obj, int i2, Object obj2, ld4 ld4Var, int i3) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1439843069);
        int i4 = (e18Var.f(kz9Var) ? 4 : 2) | i3 | (e18Var.f(obj) ? 32 : 16) | (e18Var.d(i2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(obj2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            ((z4f) obj).a(obj2, fd9.q0(980966366, new kb2(kz9Var, i2, obj2, 7), e18Var), e18Var, 48);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fb0(kz9Var, obj, i2, obj2, i3);
        }
    }

    public static final void f(wlg wlgVar, iqb iqbVar, ld4 ld4Var, int i2) {
        iqb iqbVar2;
        wlgVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2021039204);
        int i3 = 4;
        int i4 = (e18Var.f(wlgVar) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i4 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = mpk.P("");
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            String str = (String) wlgVar.getValue();
            if (str != null) {
                nwbVar.setValue(str);
            }
            iqbVar2 = iqbVar;
            wd6.M(((String) wlgVar.getValue()) != null, iqbVar2, gp6.e(null, 3).a(gp6.d(null, null, 15)), gp6.f(null, 3).a(gp6.l(null, null, 15)), null, fd9.q0(28642420, new cb0(i3, nwbVar), e18Var), e18Var, (i4 & 112) | 200064, 16);
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kb2((Object) wlgVar, iqbVar2, i2, 13);
        }
    }

    public static final void g(String str, iqb iqbVar, ld4 ld4Var, int i2) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1984623022);
        int i3 = 2;
        int i4 = i2 | (e18Var.f(str) ? 4 : 2) | 48;
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            tkh tkhVarB = tkh.b(((jm3) gm3.c(e18Var).e.E).e, 0L, 0L, null, new wu7(1), null, 0L, null, 0, 0L, null, 0, 16777207);
            cz5 cz5Var = (cz5) e18Var.j(ve4.h);
            long j2 = tkhVarB.a.b;
            float fC = clh.c(tkhVarB.b.c);
            eve.n(j2);
            float fD = cz5Var.D(eve.L(clh.c(j2) * fC, 1095216660480L & j2));
            float f2 = 2.0f * fD;
            float f3 = f2 + f2;
            float f4 = fD / f3;
            fqb fqbVar = fqb.E;
            iqb iqbVarE = b.e(b.c(fqbVar, 1.0f), f3);
            Object objN = e18Var.N();
            int i5 = 14;
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new z1g(i5);
                e18Var.k0(objN);
            }
            iqb iqbVarI0 = xn5.i0(iqbVarE, (bz7) objN);
            boolean zC = e18Var.c(f4);
            Object objN2 = e18Var.N();
            if (zC || objN2 == lz1Var) {
                objN2 = new r80(i3, f4);
                e18Var.k0(objN2);
            }
            iqb iqbVarT = zni.t(iqbVarI0, (bz7) objN2);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarT);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE2);
            tjh.b(str, gb9.L(b.w(b.c(fqbVar, 1.0f), lja.R, true), MTTypesetterKt.kLineSkipLimitMultiplier, fD, 1), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVarB, e18Var, i4 & 14, 0, 131064);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar2, i2, 18);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.cph r4, defpackage.rz7 r5, java.lang.Throwable r6, defpackage.vp4 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.wp7
            if (r0 == 0) goto L13
            r0 = r7
            wp7 r0 = (defpackage.wp7) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            wp7 r0 = new wp7
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.F
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Throwable r6 = r0.E
            defpackage.sf5.h0(r7)     // Catch: java.lang.Throwable -> L27
            goto L40
        L27:
            r4 = move-exception
            goto L43
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L30:
            defpackage.sf5.h0(r7)
            r0.E = r6     // Catch: java.lang.Throwable -> L27
            r0.G = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L27
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L40
            return r5
        L40:
            iei r4 = defpackage.iei.a
            return r4
        L43:
            if (r6 == 0) goto L4a
            if (r6 == r4) goto L4a
            defpackage.mwa.p(r4, r6)
        L4a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v40.h(cph, rz7, java.lang.Throwable, vp4):java.lang.Object");
    }

    public static final dvb i(List list, int i2, cz5 cz5Var) {
        dvb dvbVar = new dvb(list.size());
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                x44.n0();
                throw null;
            }
            dvbVar.a(cvk.j(((mpc) obj).c(i2, cz5Var), i3));
            i3 = i4;
        }
        int i5 = dvbVar.b;
        if (i5 == 0) {
            return dvbVar;
        }
        long[] jArr = dvbVar.a;
        jArr.getClass();
        Arrays.sort(jArr, 0, i5);
        return dvbVar;
    }

    public static final long j(long j2, long j3) {
        if (j2 != 4611686018427387903L && j2 != -4611686018427387903L) {
            return (j3 == 4611686018427387903L || j3 == -4611686018427387903L) ? j3 : wd6.f0(j2 + j3, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j3 || j3 >= 4611686018427387903L) && (j3 ^ j2) < 0) {
            return 9223372036854759646L;
        }
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.aid r4, defpackage.zy7 r5, defpackage.tp4 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.yhd
            if (r0 == 0) goto L13
            r0 = r6
            yhd r0 = (defpackage.yhd) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            yhd r0 = new yhd
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.F
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            zy7 r5 = r0.E
            defpackage.sf5.h0(r6)     // Catch: java.lang.Throwable -> L28
            goto L64
        L28:
            r4 = move-exception
            goto L6a
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L30:
            defpackage.sf5.h0(r6)
            c45 r6 = r0.getContext()
            dd8 r1 = defpackage.dd8.J
            a45 r6 = r6.x0(r1)
            if (r6 != r4) goto L6e
            r0.E = r5     // Catch: java.lang.Throwable -> L28
            r0.G = r3     // Catch: java.lang.Throwable -> L28
            ua2 r6 = new ua2     // Catch: java.lang.Throwable -> L28
            tp4 r0 = defpackage.zni.I(r0)     // Catch: java.lang.Throwable -> L28
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L28
            r6.t()     // Catch: java.lang.Throwable -> L28
            g0 r0 = new g0     // Catch: java.lang.Throwable -> L28
            r1 = 8
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> L28
            zy1 r4 = r4.J     // Catch: java.lang.Throwable -> L28
            r4.C(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r4 = r6.r()     // Catch: java.lang.Throwable -> L28
            m45 r6 = defpackage.m45.E
            if (r4 != r6) goto L64
            return r6
        L64:
            r5.a()
            iei r4 = defpackage.iei.a
            return r4
        L6a:
            r5.a()
            throw r4
        L6e:
            java.lang.String r4 = "awaitClose() can only be invoked from the producer context"
            defpackage.sz6.j(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v40.k(aid, zy7, tp4):java.lang.Object");
    }

    public static void l(v30 v30Var, int i2, BlurMaskFilter blurMaskFilter, int i3) {
        long j2 = d54.b;
        if ((i3 & 2) != 0) {
            i2 = 3;
        }
        if ((i3 & 4) != 0) {
            blurMaskFilter = null;
        }
        int i4 = (i3 & 8) != 0 ? 0 : 1;
        v30Var.e(j2);
        v30Var.d(i2);
        v30Var.m(i4);
        v30Var.a.setMaskFilter(blurMaskFilter);
    }

    public static final long m(long j2) {
        long j3 = (j2 << 1) + 1;
        uh6.F.getClass();
        int i2 = wh6.a;
        return j3;
    }

    public static final long n(long j2) {
        return (-4611686018426L > j2 || j2 >= 4611686018427L) ? m(wd6.f0(j2, -4611686018427387903L, 4611686018427387903L)) : o(j2 * 1000000);
    }

    public static final long o(long j2) {
        lz1 lz1Var = uh6.F;
        long j3 = j2 << 1;
        int i2 = wh6.a;
        return j3;
    }

    public static final void p(Executor executor, String str, h99 h99Var, Runnable runnable) {
        executor.getClass();
        h99Var.getClass();
        runnable.getClass();
        try {
            if (((executor instanceof ob1) || ((executor instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) executor).getQueue() instanceof sb1))) && !(runnable instanceof ayb)) {
                runnable = new ayb(runnable, str);
            }
            executor.execute(runnable);
        } catch (RejectedExecutionException e2) {
            dch.I(h99Var, 5, x44.X(g99.F, g99.G), new rb1(str, 2), e2, 48);
        }
    }

    public static final int q(int i2, List list) {
        int i3;
        int i4 = ((drc) w44.U0(list)).c;
        if (i2 > ((drc) w44.U0(list)).c) {
            c39.a("Index " + i2 + " should be less or equal than last line's end " + i4);
        }
        int size = list.size() - 1;
        int i5 = 0;
        while (true) {
            if (i5 > size) {
                i3 = -(i5 + 1);
                break;
            }
            i3 = (i5 + size) >>> 1;
            drc drcVar = (drc) list.get(i3);
            byte b2 = drcVar.b > i2 ? (byte) 1 : drcVar.c <= i2 ? (byte) -1 : (byte) 0;
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                }
                size = i3 - 1;
            } else {
                i5 = i3 + 1;
            }
        }
        if (i3 >= 0 && i3 < list.size()) {
            return i3;
        }
        StringBuilder sbU = vb7.u("Found paragraph index ", i3, " should be in range [0, ");
        sbU.append(list.size());
        sbU.append(").\nDebug info: index=");
        sbU.append(i2);
        sbU.append(", paragraphs=[");
        sbU.append(qaa.a(list, null, new xga(14), 31));
        sbU.append(']');
        c39.a(sbU.toString());
        return i3;
    }

    public static final int r(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            drc drcVar = (drc) list.get(i4);
            byte b2 = drcVar.d > i2 ? (byte) 1 : drcVar.e <= i2 ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i3 = i4 + 1;
            } else {
                if (b2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int s(ArrayList arrayList, float f2) {
        if (f2 <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            return 0;
        }
        if (f2 >= ((drc) w44.U0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            drc drcVar = (drc) arrayList.get(i3);
            byte b2 = drcVar.f > f2 ? (byte) 1 : drcVar.g <= f2 ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void t(ArrayList arrayList, long j2, bz7 bz7Var) {
        int size = arrayList.size();
        for (int iQ = q(kkh.g(j2), arrayList); iQ < size; iQ++) {
            drc drcVar = (drc) arrayList.get(iQ);
            if (drcVar.b >= kkh.f(j2)) {
                return;
            }
            if (drcVar.b != drcVar.c) {
                bz7Var.invoke(drcVar);
            }
        }
    }

    public static final iqb u(iqb iqbVar, bz7 bz7Var) {
        return iqbVar.B(new vs7(new xs7(bz7Var)));
    }

    public static bb v(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("id");
            String strM = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("name");
            String strM2 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("email");
            String strM3 = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("anonymous_id");
            String strM4 = bh9VarS4 != null ? bh9VarS4.m() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                if (!mp0.o0(p7aVarA.getKey(), bb.f)) {
                    Object key = p7aVarA.getKey();
                    key.getClass();
                    linkedHashMap.put(key, p7aVarA.getValue());
                }
            }
            return new bb(strM, strM2, strM3, strM4, linkedHashMap);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Usr", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Usr", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Usr", e4);
            return null;
        }
    }

    public static ud0 w(String str) {
        return (ud0) ud0.O1.get(str);
    }

    public static final xub x(zjf zjfVar, bz7 bz7Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            wjf wjfVarA = zjfVar.a();
            av9 av9Var = wjfVarA.c;
            if (av9Var.Y() && av9Var.X()) {
                l9e l9eVarG = wjfVarA.g();
                xub xubVar = new xub(48);
                n78 n78Var = new n78(25);
                n78Var.T(eve.R(l9eVarG));
                A(bz7Var, new n78(25), n78Var, xubVar, wjfVarA, wjfVarA);
                return xubVar;
            }
            xub xubVar2 = x69.a;
            xubVar2.getClass();
            return xubVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void y(bz7 bz7Var, n78 n78Var, n78 n78Var2, xub xubVar, wjf wjfVar, wjf wjfVar2) {
        n78 n78Var3 = n78Var;
        Region region = (Region) n78Var3.F;
        n78 n78Var4 = n78Var2;
        Region region2 = (Region) n78Var4.F;
        av9 av9Var = wjfVar2.c;
        av9 av9Var2 = wjfVar2.c;
        if (!av9Var.Y() || !av9Var2.X() || region2.isEmpty()) {
            if (wjfVar2.o()) {
                z(xubVar, wjfVar, wjfVar2);
                return;
            }
            return;
        }
        l9e l9eVarM = wjfVar2.m();
        if (l9eVarM.j()) {
            Object objF = wjfVar2.f();
            if (objF == null) {
                z39 z39Var = (z39) av9Var2.k0.H;
                l9eVarM = nai.A(z39Var).J(z39Var, false);
            } else {
                hqb hqbVar = ((hqb) objF).E;
                Object objG = wjfVar2.d.E.g(ojf.b);
                if (objG == null) {
                    objG = null;
                }
                l9eVarM = dgj.D(hqbVar, objG != null, false);
            }
        }
        c79 c79VarR = eve.R(l9eVarM);
        n78Var3.T(c79VarR);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i2 = wjfVar2.f;
            wjf wjfVar3 = wjfVar;
            if (i2 == wjfVar3.f) {
                i2 = -1;
            }
            Rect bounds = region.getBounds();
            yjf yjfVar = new yjf(wjfVar2, new c79(bounds.left, bounds.top, bounds.right, bounds.bottom));
            xub xubVar2 = xubVar;
            xubVar2.i(i2, yjfVar);
            List listJ = wjf.j(4, wjfVar2);
            int size = listJ.size() - 1;
            while (-1 < size) {
                if (!((Boolean) bz7Var.invoke(listJ.get(size))).booleanValue()) {
                    y(bz7Var, n78Var3, n78Var4, xubVar2, wjfVar3, (wjf) listJ.get(size));
                }
                size--;
                n78Var3 = n78Var;
                n78Var4 = n78Var2;
                xubVar2 = xubVar;
                wjfVar3 = wjfVar;
            }
            if (E(wjfVar2)) {
                region2.op(c79VarR.a, c79VarR.b, c79VarR.c, c79VarR.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void z(xub xubVar, wjf wjfVar, wjf wjfVar2) {
        av9 av9Var;
        wjf wjfVarL = wjfVar2.l();
        l9e l9eVarG = (wjfVarL == null || (av9Var = wjfVarL.c) == null || !av9Var.Y()) ? j : wjfVarL.g();
        int i2 = wjfVar2.f;
        if (i2 == wjfVar.f) {
            i2 = -1;
        }
        xubVar.i(i2, new yjf(wjfVar2, eve.R(l9eVarG)));
    }
}
