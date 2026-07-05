package com.anthropic.claude.conway;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Environment;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import androidx.compose.material3.internal.AnchoredDraggableUninitializedException;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.ConwayEvents$ConwayFileDownloaded;
import com.anthropic.claude.analytics.events.ConwayEvents$ConwayShowToolCallsToggled;
import com.anthropic.claude.conway.ConwayAppScreen;
import com.anthropic.claude.conway.protocol.AgentState;
import com.anthropic.claude.conway.protocol.ConwayForkMeta;
import com.anthropic.claude.conway.protocol.b0;
import com.anthropic.claude.conway.send.OutboxItem;
import com.anthropic.claude.types.strings.ForkId;
import defpackage.a4e;
import defpackage.amg;
import defpackage.b54;
import defpackage.bg9;
import defpackage.bj0;
import defpackage.bkg;
import defpackage.bmg;
import defpackage.bsg;
import defpackage.bz4;
import defpackage.c61;
import defpackage.ch9;
import defpackage.ckg;
import defpackage.cpc;
import defpackage.cw4;
import defpackage.cx4;
import defpackage.d4c;
import defpackage.dr4;
import defpackage.dw4;
import defpackage.epk;
import defpackage.er4;
import defpackage.er7;
import defpackage.ez4;
import defpackage.f15;
import defpackage.f8;
import defpackage.fc4;
import defpackage.fk0;
import defpackage.fkg;
import defpackage.fn0;
import defpackage.fr4;
import defpackage.g25;
import defpackage.g5f;
import defpackage.g81;
import defpackage.gb9;
import defpackage.grc;
import defpackage.gs4;
import defpackage.gsk;
import defpackage.gt4;
import defpackage.gy4;
import defpackage.h1e;
import defpackage.h5f;
import defpackage.h86;
import defpackage.hi6;
import defpackage.hr4;
import defpackage.hs4;
import defpackage.hsf;
import defpackage.hz4;
import defpackage.i5f;
import defpackage.ide;
import defpackage.iei;
import defpackage.ij0;
import defpackage.ij4;
import defpackage.ikb;
import defpackage.is4;
import defpackage.isg;
import defpackage.iuj;
import defpackage.iwe;
import defpackage.iy4;
import defpackage.j8;
import defpackage.jl2;
import defpackage.js4;
import defpackage.jx4;
import defpackage.k25;
import defpackage.kgh;
import defpackage.koi;
import defpackage.kx4;
import defpackage.ky4;
import defpackage.l6;
import defpackage.lf9;
import defpackage.llg;
import defpackage.lm6;
import defpackage.lqa;
import defpackage.lsc;
import defpackage.lx4;
import defpackage.m15;
import defpackage.mp0;
import defpackage.mp4;
import defpackage.mpg;
import defpackage.mpk;
import defpackage.mt4;
import defpackage.mx4;
import defpackage.my4;
import defpackage.n23;
import defpackage.n2g;
import defpackage.n30;
import defpackage.nm6;
import defpackage.o2g;
import defpackage.oqb;
import defpackage.ov4;
import defpackage.ox4;
import defpackage.p0;
import defpackage.pmf;
import defpackage.px4;
import defpackage.qi3;
import defpackage.qo0;
import defpackage.qx4;
import defpackage.sfa;
import defpackage.sfb;
import defpackage.sm;
import defpackage.sq6;
import defpackage.ss4;
import defpackage.tp4;
import defpackage.tpg;
import defpackage.tta;
import defpackage.u15;
import defpackage.upg;
import defpackage.us4;
import defpackage.us8;
import defpackage.ux4;
import defpackage.v3g;
import defpackage.vb7;
import defpackage.vs8;
import defpackage.w05;
import defpackage.w15;
import defpackage.w44;
import defpackage.wg6;
import defpackage.wpg;
import defpackage.wv4;
import defpackage.wx4;
import defpackage.x44;
import defpackage.x4f;
import defpackage.xpg;
import defpackage.y3e;
import defpackage.yfa;
import defpackage.yk1;
import defpackage.yz4;
import defpackage.ze0;
import defpackage.zfa;
import defpackage.zy1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends iwe {
    public static final Set j1 = mp0.Z0(new String[]{"MODEL_FALLBACK_EXHAUSTED", "MODEL_OVERLOADED"});
    public final amg A;
    public final LinkedHashSet A0;
    public final a4e B;
    public final AtomicInteger B0;
    public final amg C;
    public final ArrayList C0;
    public final a4e D;
    public final LinkedHashMap D0;
    public final zy1 E;
    public volatile sfb E0;
    public fkg F;
    public final g81 F0;
    public final amg G;
    public fkg G0;
    public final a4e H;
    public int H0;
    public final amg I;
    public long I0;
    public final a4e J;
    public boolean J0;
    public final amg K;
    public String K0;
    public final a4e L;
    public String L0;
    public boolean M;
    public fkg M0;
    public final LinkedHashSet N;
    public fkg N0;
    public final LinkedHashSet O;
    public fkg O0;
    public final amg P;
    public boolean P0;
    public final a4e Q;
    public volatile boolean Q0;
    public final n2g R;
    public fkg R0;
    public final y3e S;
    public fkg S0;
    public fkg T;
    public fkg T0;
    public final lsc U;
    public volatile long U0;
    public final lsc V;
    public List V0;
    public fkg W;
    public volatile Long W0;
    public final c61 X;
    public volatile boolean X0;
    public final lqa Y;
    public volatile boolean Y0;
    public final hi6 Z;
    public volatile boolean Z0;
    public final w05 a0;
    public fkg a1;
    public final Context b;
    public final hz4 b0;
    public volatile long b1;
    public final ze0 c;
    public final amg c0;
    public volatile String c1;
    public final fk0 d;
    public final a4e d0;
    public volatile String d1;
    public final f8 e;
    public final amg e0;
    public fkg e1;
    public final koi f;
    public final a4e f0;
    public volatile int f1;
    public final x4f g;
    public final amg g0;
    public fkg g1;
    public final ss4 h;
    public final a4e h0;
    public final AtomicBoolean h1;
    public final yz4 i;
    public final amg i0;
    public boolean i1;
    public final ov4 j;
    public final a4e j0;
    public final er4 k;
    public fkg k0;
    public final qi3 l;
    public final amg l0;
    public final bj0 m;
    public final a4e m0;
    public final com.anthropic.claude.connector.auth.b n;
    public final amg n0;
    public final ij4 o;
    public final a4e o0;
    public final h86 p;
    public final LinkedHashMap p0;
    public final fn0 q;
    public final ArrayList q0;
    public final zy1 r;
    public List r0;
    public final lsc s;
    public List s0;
    public final AtomicInteger t;
    public boolean t0;
    public final u15 u;
    public List u0;
    public final f15 v;
    public List v0;
    public final w15 w;
    public final LinkedHashMap w0;
    public final epk x;
    public volatile String x0;
    public final amg y;
    public final ArrayList y0;
    public final a4e z;
    public final LinkedHashMap z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, ze0 ze0Var, fk0 fk0Var, f8 f8Var, koi koiVar, x4f x4fVar, ss4 ss4Var, yz4 yz4Var, ov4 ov4Var, er4 er4Var, qi3 qi3Var, bj0 bj0Var, wv4 wv4Var, com.anthropic.claude.connector.auth.b bVar, ij4 ij4Var, bg9 bg9Var, us4 us4Var, h86 h86Var, fn0 fn0Var) {
        super(h86Var);
        context.getClass();
        us4Var.getClass();
        this.b = context;
        this.c = ze0Var;
        this.d = fk0Var;
        this.e = f8Var;
        this.f = koiVar;
        this.g = x4fVar;
        this.h = ss4Var;
        this.i = yz4Var;
        this.j = ov4Var;
        this.k = er4Var;
        this.l = qi3Var;
        this.m = bj0Var;
        this.n = bVar;
        this.o = ij4Var;
        this.p = h86Var;
        this.q = fn0Var;
        this.r = x44.a();
        tp4 tp4Var = null;
        this.s = mpk.P(null);
        int i = 0;
        this.t = new AtomicInteger(0);
        this.u = new u15(0);
        f15 f15Var = new f15();
        this.v = f15Var;
        this.w = new w15();
        this.x = new epk(12);
        amg amgVarA = bmg.a(null);
        this.y = amgVarA;
        this.z = j8.k(amgVarA);
        lm6 lm6Var = lm6.E;
        amg amgVarA2 = bmg.a(lm6Var);
        this.A = amgVarA2;
        this.B = j8.k(amgVarA2);
        amg amgVarA3 = bmg.a(null);
        this.C = amgVarA3;
        this.D = j8.k(amgVarA3);
        this.E = x44.a();
        amg amgVarA4 = bmg.a(lm6Var);
        this.G = amgVarA4;
        this.H = j8.k(amgVarA4);
        amg amgVarA5 = bmg.a(new dw4(null, 31));
        this.I = amgVarA5;
        this.J = j8.k(amgVarA5);
        amg amgVarA6 = bmg.a(nm6.E);
        this.K = amgVarA6;
        int i2 = 1;
        this.L = j8.f0(new er7(amgVarA5, amgVarA6, wx4.L, 1), this.a, new llg(5000L, Long.MAX_VALUE), lm6Var);
        this.N = new LinkedHashSet();
        this.O = new LinkedHashSet();
        amg amgVarA7 = bmg.a(new bz4());
        this.P = amgVarA7;
        this.Q = j8.k(amgVarA7);
        n2g n2gVarB = o2g.b(1, 5, null);
        this.R = n2gVarB;
        this.S = new y3e(n2gVarB);
        this.U = mpk.P(ez4.a);
        this.V = mpk.P(null);
        this.X = us4Var.d;
        this.Y = gt4.b(context, us4Var, f15Var, new n23(this, tp4Var, 2), new my4(3, 0, f.class, this, "handleConfirmWebhook", "handleConfirmWebhook(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"), new hr4(1, this, f.class, "handleListWebhooks", "handleListWebhooks(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1), ((Boolean) wv4Var.b.getValue()).booleanValue() ? new sm(2, this, f.class, "handleSuggestConnectors", "handleSuggestConnectors(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 6) : null);
        this.Z = new hi6(6);
        this.a0 = new w05(0);
        this.b0 = new hz4(0);
        amg amgVarA8 = bmg.a(new m15(null, false, null, 0, null, null, false, false, false, null, 4095));
        this.c0 = amgVarA8;
        this.d0 = j8.k(amgVarA8);
        amg amgVarA9 = bmg.a(is4.a);
        this.e0 = amgVarA9;
        this.f0 = j8.k(amgVarA9);
        Boolean bool = Boolean.FALSE;
        amg amgVarA10 = bmg.a(bool);
        this.g0 = amgVarA10;
        this.h0 = j8.k(amgVarA10);
        amg amgVarA11 = bmg.a(bool);
        this.i0 = amgVarA11;
        this.j0 = j8.k(amgVarA11);
        amg amgVarA12 = bmg.a(null);
        this.l0 = amgVarA12;
        a4e a4eVarF0 = j8.f0(j8.l0(amgVarA12, new ky4(3, tp4Var, i)), this.a, v3g.a, bool);
        this.m0 = a4eVarF0;
        amg amgVarA13 = bmg.a(lm6Var);
        this.n0 = amgVarA13;
        this.o0 = j8.k(amgVarA13);
        this.p0 = new LinkedHashMap();
        this.q0 = new ArrayList();
        this.r0 = lm6Var;
        this.s0 = lm6Var;
        this.u0 = lm6Var;
        this.v0 = lm6Var;
        this.w0 = new LinkedHashMap();
        this.y0 = new ArrayList();
        this.z0 = new LinkedHashMap();
        this.A0 = new LinkedHashSet();
        this.B0 = new AtomicInteger(0);
        this.C0 = new ArrayList();
        this.D0 = new LinkedHashMap();
        this.E0 = sfb.E;
        mp4 mp4Var = this.a;
        gy4 gy4Var = new gy4(this, tp4Var, i);
        jx4 jx4Var = new jx4(this, i);
        lx4 lx4Var = new lx4(this, i);
        lx4 lx4Var2 = new lx4(this, i2);
        mx4 mx4Var = new mx4(this, i);
        mx4 mx4Var2 = new mx4(this, i2);
        fc4 fc4Var = new fc4(29);
        fr4 fr4Var = new fr4(17);
        mp4Var.getClass();
        g81 g81Var = new g81();
        g81Var.a = mp4Var;
        g81Var.b = a4eVarF0;
        g81Var.c = gy4Var;
        g81Var.d = lx4Var;
        g81Var.e = bg9Var;
        g81Var.f = lx4Var2;
        g81Var.g = mx4Var;
        g81Var.h = mx4Var2;
        g81Var.i = fc4Var;
        g81Var.j = fr4Var;
        qo0 qo0Var = new qo0();
        g81Var.k = qo0Var;
        String str = (String) jx4Var.a();
        if (str != null && str.length() != 0) {
            try {
                qo0Var.addAll((Collection) bg9Var.b(str, d4c.t(OutboxItem.Companion.serializer())));
            } catch (Exception unused) {
                ((lx4) g81Var.d).invoke(null);
            }
        }
        this.F0 = g81Var;
        A0();
        if (!((qo0) g81Var.k).isEmpty()) {
            this.J0 = true;
        }
        g81Var.e();
        this.K0 = "";
        this.V0 = lm6Var;
        this.h1 = new AtomicBoolean(false);
        gb9.D(this.a, null, null, new ox4(this, tp4Var, 1), 3);
    }

    public static String M0(String str, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonPrimitive jsonPrimitiveA = ch9.a(Boolean.valueOf(z));
        jsonPrimitiveA.getClass();
        if (str != null) {
            JsonPrimitive jsonPrimitiveC = ch9.c(str);
            jsonPrimitiveC.getClass();
        }
        return new JsonObject(linkedHashMap).toString();
    }

    public static final boolean O(f fVar, Uri uri, String str, String str2) throws IOException {
        String strS0;
        fVar.getClass();
        String string = uri.toString();
        string.getClass();
        String queryParameter = uri.getQueryParameter("path");
        String strD1 = queryParameter != null ? bsg.d1('/', queryParameter, queryParameter) : null;
        String strGuessFileName = URLUtil.guessFileName(string, str, str2);
        strGuessFileName.getClass();
        if (!isg.q0(strGuessFileName, "download.", false) || strD1 == null || bsg.I0(strD1)) {
            strD1 = strGuessFileName;
        }
        try {
            x4f x4fVar = fVar.g;
            us8 us8Var = new us8();
            us8Var.h(null, string);
            vs8 vs8VarC = us8Var.c();
            x4fVar.getClass();
            strS0 = w44.S0(x4fVar.c.b(vs8VarC), "; ", null, null, new fc4(28), 30);
        } catch (IllegalArgumentException unused) {
            strS0 = "";
        }
        try {
            DownloadManager.Request destinationInExternalPublicDir = new DownloadManager.Request(uri).setTitle(strD1).setNotificationVisibility(1).setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strD1);
            if (strS0.length() > 0) {
                destinationInExternalPublicDir.addRequestHeader("Cookie", strS0);
            }
            destinationInExternalPublicDir.addRequestHeader("x-organization-uuid", fVar.f.e);
            Object systemService = fVar.b.getSystemService("download");
            systemService.getClass();
            ((DownloadManager) systemService).enqueue(destinationInExternalPublicDir);
            fVar.l.e(new ConwayEvents$ConwayFileDownloaded(bsg.d1('.', strD1, "unknown")), ConwayEvents$ConwayFileDownloaded.Companion.serializer());
            return true;
        } catch (Exception e) {
            zfa.a.getClass();
            if (!yfa.b()) {
                return false;
            }
            String strE = iuj.E(fVar);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            String strQ = sq6.q(zfa.a, e, "Conway download enqueue failed: ");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.ERROR, strE, strQ);
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P(com.anthropic.claude.conway.f r5, com.anthropic.claude.conway.protocol.b0 r6, defpackage.vp4 r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.f.P(com.anthropic.claude.conway.f, com.anthropic.claude.conway.protocol.b0, vp4):java.lang.Object");
    }

    public static final String T(f fVar) {
        return (String) fVar.e.d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Y(com.anthropic.claude.conway.f r19, java.lang.String r20, java.lang.String r21, defpackage.tp4 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.f.Y(com.anthropic.claude.conway.f, java.lang.String, java.lang.String, tp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z(com.anthropic.claude.conway.f r10, defpackage.tp4 r11) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.f.Z(com.anthropic.claude.conway.f, tp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a0(com.anthropic.claude.conway.f r6, java.lang.String r7, defpackage.tp4 r8) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.f.a0(com.anthropic.claude.conway.f, java.lang.String, tp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e7, code lost:
    
        if (defpackage.knk.p(r13, r1) == r2) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a6, code lost:
    
        if (r13 == r2) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b0(com.anthropic.claude.conway.f r12, defpackage.vp4 r13) throws androidx.compose.material3.internal.AnchoredDraggableUninitializedException {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.f.b0(com.anthropic.claude.conway.f, vp4):java.lang.Object");
    }

    public static final void c0(f fVar) {
        fkg fkgVar = fVar.N0;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        if (fVar.Q0) {
            return;
        }
        int i = fVar.t.get();
        int i2 = i < 1 ? 1 : i;
        double d = h1e.F.d(-1.0d, 1.0d);
        int i3 = i2 - 1;
        if (i3 < 0) {
            i3 = 0;
        }
        fVar.N0 = gb9.D(fVar.a, null, null, new iy4((long) (((d * 0.1d) + 1.0d) * Math.min(Math.pow(2.0d, i3) * 1000.0d, 30000.0d)), fVar, i2, null), 3);
    }

    public static final void g0(f fVar, b0 b0Var) {
        amg amgVar = fVar.l0;
        amgVar.getClass();
        amgVar.n(null, b0Var);
    }

    public static void k0(f fVar, boolean z, boolean z2, int i) {
        Object value;
        dw4 dw4Var;
        boolean z3 = (i & 1) == 0;
        boolean z4 = (i & 2) != 0 ? false : z;
        boolean z5 = (i & 4) != 0 ? false : z2;
        fVar.getClass();
        lm6 lm6Var = lm6.E;
        sfa sfaVar = sfa.DEBUG;
        zfa.a.getClass();
        tp4 tp4Var = null;
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                int iIdentityHashCode = System.identityHashCode(fVar);
                boolean z6 = fVar.h1.get();
                fkg fkgVar = fVar.M0;
                String str = "connect() instance=" + iIdentityHashCode + " started=" + z6 + " job=" + (fkgVar != null ? Boolean.valueOf(fkgVar.c()) : null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar, "Conway", str);
                }
            }
        }
        if (fVar.h1.compareAndSet(false, true)) {
            boolean z7 = z3 || fVar.P0;
            fkg fkgVar2 = fVar.N0;
            if (fkgVar2 != null) {
                fkgVar2.d(null);
            }
            fVar.N0 = null;
            fVar.y0.clear();
            if (!z4) {
                fkg fkgVar3 = fVar.G0;
                if (fkgVar3 != null) {
                    fkgVar3.d(null);
                }
                fVar.G0 = null;
                fkg fkgVar4 = fVar.R0;
                if (fkgVar4 != null) {
                    fkgVar4.d(null);
                }
                fVar.R0 = null;
                fkg fkgVar5 = fVar.S0;
                if (fkgVar5 != null) {
                    fkgVar5.d(null);
                }
                fVar.S0 = null;
                fkg fkgVar6 = fVar.T0;
                if (fkgVar6 != null) {
                    fkgVar6.d(null);
                }
                fVar.T0 = null;
                fkg fkgVar7 = fVar.a1;
                if (fkgVar7 != null) {
                    fkgVar7.d(null);
                }
                fVar.a1 = null;
                fkg fkgVar8 = fVar.g1;
                if (fkgVar8 != null) {
                    fkgVar8.d(null);
                }
                fVar.g1 = null;
                fVar.c1 = null;
                fVar.f1 = 0;
                fVar.z0.clear();
                fVar.A0.clear();
                fVar.x0 = null;
                fVar.U0 = 0L;
                fVar.b1 = 0L;
                fVar.Z0 = false;
                if (!z5) {
                    fkg fkgVar9 = fVar.e1;
                    if (fkgVar9 != null) {
                        fkgVar9.d(null);
                    }
                    fVar.e1 = null;
                    Iterator it2 = fVar.p0.values().iterator();
                    while (it2.hasNext()) {
                        ((lf9) it2.next()).d(null);
                    }
                    fVar.p0.clear();
                    amg amgVar = fVar.n0;
                    amgVar.getClass();
                    amgVar.n(null, lm6Var);
                    fkg fkgVar10 = fVar.G0;
                    if (fkgVar10 != null) {
                        fkgVar10.d(null);
                    }
                    fVar.G0 = null;
                    fVar.q0.clear();
                    fVar.C0.clear();
                    fVar.E0 = sfb.E;
                    fVar.A0();
                    fVar.Z.g();
                    fVar.a0.a.clear();
                    fVar.b0.a.clear();
                }
            }
            if (z7) {
                if (z3) {
                    g81 g81Var = fVar.F0;
                    fkg fkgVar11 = (fkg) g81Var.l;
                    if (fkgVar11 != null) {
                        fkgVar11.d(null);
                    }
                    g81Var.l = null;
                    ((qo0) g81Var.k).clear();
                    g81Var.j();
                }
                fVar.L0 = null;
                f8 f8Var = fVar.e;
                kgh.t(f8Var.a, "conway_saved_client_id", null);
                f8Var.d.setValue(null);
                fVar.u.F = 0L;
                fVar.u0 = lm6Var;
                fVar.r0 = lm6Var;
                fVar.t0 = false;
                fVar.V0 = lm6Var;
                fVar.W0 = null;
                fVar.X0 = false;
                fVar.Y0 = false;
                fVar.v.b();
                fVar.w.b();
                ((amg) fVar.x.E).m(null);
                fVar.D0.clear();
                fVar.s.setValue(null);
                fVar.y.m(null);
                amg amgVar2 = fVar.G;
                amgVar2.getClass();
                amgVar2.n(null, lm6Var);
                fVar.C.m(null);
                amg amgVar3 = fVar.A;
                amgVar3.getClass();
                amgVar3.n(null, lm6Var);
                fVar.H0(null);
            }
            amg amgVar4 = fVar.I;
            do {
                value = amgVar4.getValue();
                dw4Var = (dw4) value;
                ide ideVar = cw4.a;
                dw4Var.getClass();
            } while (!amgVar4.l(value, z7 ? new dw4(null, 31) : new dw4(dw4Var.a, 30)));
            fVar.M = true;
            amg amgVar5 = fVar.K;
            nm6 nm6Var = nm6.E;
            amgVar5.getClass();
            amgVar5.n(null, nm6Var);
            fVar.v0 = lm6Var;
            fVar.w0.clear();
            fVar.w.d = false;
            oqb oqbVar = k25.a;
            x4f x4fVar = fVar.g;
            x4fVar.getClass();
            g25 g25VarC = k25.c(x4fVar);
            String str2 = g25VarC != null ? g25VarC.b : null;
            if (str2 == null) {
                fVar.h1.set(false);
                amg amgVar6 = fVar.e0;
                String string = fVar.b.getString(R.string.conway_error_not_authenticated);
                string.getClass();
                hs4 hs4Var = new hs4(string, false);
                amgVar6.getClass();
                amgVar6.n(null, hs4Var);
                fVar.i1 = false;
                return;
            }
            String strL0 = fVar.l0();
            String str3 = fVar.f.e;
            boolean z8 = z4 && !fVar.r0.isEmpty() && ((qo0) fVar.F0.k).isEmpty();
            if (!((qo0) fVar.F0.k).isEmpty() && !z7 && fVar.L0 != null) {
                fVar.L0();
            }
            if (!z8) {
                amg amgVar7 = fVar.e0;
                Object obj2 = (z7 || fVar.L0 == null) ? js4.a : gs4.a;
                amgVar7.getClass();
                amgVar7.n(null, obj2);
            }
            if (!((Boolean) fVar.g0.getValue()).booleanValue() && fVar.k0 == null) {
                fVar.k0 = gb9.D(fVar.a, null, null, new ox4(fVar, tp4Var, 2), 3);
            }
            fVar.M0 = gb9.D(fVar.a, null, null, new ux4(fVar, strL0, z7, str2, str3, z4, z8, z5, null), 3);
        }
    }

    public static boolean u0(String str) {
        String str2;
        str.getClass();
        vs8 vs8VarC = null;
        try {
            us8 us8Var = new us8();
            us8Var.h(null, str);
            vs8VarC = us8Var.c();
        } catch (IllegalArgumentException unused) {
        }
        if (vs8VarC == null || (str2 = vs8VarC.d) == null) {
            return false;
        }
        return str2.equals("10.0.2.2") || str2.equals("127.0.0.1") || str2.equals("localhost");
    }

    public final void A0() {
        List<OutboxItem> listP1 = w44.p1((qo0) this.F0.k);
        if (listP1.isEmpty()) {
            return;
        }
        for (OutboxItem outboxItem : listP1) {
            this.C0.add(new upg(outboxItem.getText(), outboxItem.getQueuedAt()));
        }
        this.E0 = sfb.F;
    }

    public final void B0() {
        hsf hsfVar = (hsf) this.y.getValue();
        if (hsfVar == null) {
            return;
        }
        fkg fkgVar = this.F;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.F = gb9.D(this.a, null, null, new e(this, hsfVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C0(boolean r25) {
        /*
            Method dump skipped, instruction units count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.f.C0(boolean):void");
    }

    public final void D0() {
        this.C0.clear();
        this.E0 = sfb.E;
        fkg fkgVar = this.g1;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.c1 = null;
        this.d1 = null;
        this.f1 = 0;
        fkg fkgVar2 = this.a1;
        if (fkgVar2 != null) {
            fkgVar2.d(null);
        }
        this.a1 = null;
        this.Z0 = false;
        this.y0.clear();
        this.t0 = false;
        this.x0 = null;
        fkg fkgVar3 = this.e1;
        if (fkgVar3 != null) {
            fkgVar3.d(null);
        }
        this.e1 = null;
    }

    public final String E0(String str) {
        if (this.K0.length() == 0) {
            return null;
        }
        String strN1 = bsg.n1(str, '/');
        String strD1 = bsg.d1('/', strN1, strN1);
        if (strD1.length() == 0) {
            return null;
        }
        return ij0.C(bsg.n1(this.K0, '/'), "/sandbox/file-download/uploads/", Uri.encode(strD1));
    }

    public final void F0() {
        fkg fkgVar = this.O0;
        tp4 tp4Var = null;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.P0 = true;
        Boolean bool = Boolean.FALSE;
        amg amgVar = this.g0;
        amgVar.getClass();
        amgVar.n(null, bool);
        fkg fkgVar2 = this.k0;
        if (fkgVar2 != null) {
            fkgVar2.d(null);
        }
        this.k0 = null;
        amg amgVar2 = this.i0;
        amgVar2.getClass();
        amgVar2.n(null, bool);
        this.O0 = gb9.D(this.a, null, null, new ox4(this, tp4Var, 3), 3);
    }

    public final void G0(String str) {
        str.getClass();
        String str2 = this.f.e;
        f8 f8Var = this.e;
        f8Var.getClass();
        str2.getClass();
        SharedPreferences.Editor editorEdit = f8Var.a.edit();
        editorEdit.putString("conway_composer_draft_".concat(str2), str);
        editorEdit.apply();
        f8Var.e.put(str2, str);
    }

    public final void H0(String str) {
        String str2 = this.f.e;
        f8 f8Var = this.e;
        f8Var.getClass();
        str2.getClass();
        SharedPreferences.Editor editorEdit = f8Var.a.edit();
        editorEdit.putString("conway_viewing_fork_".concat(str2), str);
        editorEdit.apply();
        f8Var.f.put(str2, str);
    }

    public final void I0(boolean z) {
        fk0 fk0Var = this.d;
        if (fk0Var.c() == z) {
            return;
        }
        fk0Var.H.setValue(Boolean.valueOf(z));
        vb7.B(fk0Var.a, "conway_show_tool_calls", z);
        this.l.e(new ConwayEvents$ConwayShowToolCallsToggled(z), ConwayEvents$ConwayShowToolCallsToggled.Companion.serializer());
        C0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J0(java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.f.J0(java.lang.String, boolean):void");
    }

    public final void K0(List list) {
        list.getClass();
        b0 b0VarQ0 = q0();
        if (b0VarQ0 != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cx4 cx4Var = (cx4) it.next();
                bkg bkgVar = bkg.g;
                String strI = vb7.i();
                ckg ckgVar = new ckg(cx4Var, bkgVar, strI);
                amg amgVar = this.n0;
                amgVar.n(null, w44.b1((Collection) amgVar.getValue(), ckgVar));
                f fVar = this;
                fVar.p0.put(strI, gb9.D(fVar.a, null, null, new mt4(b0VarQ0, cx4Var, fVar, strI, (tp4) null, 2), 3));
                this = fVar;
            }
            return;
        }
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(this);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String strU = grc.u("stageFiles buffered (", list.size(), ") — stream not ready yet");
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((n30) ((zfa) it2.next())).b(sfa.INFO, strE, strU);
                }
            }
        }
        b54.t0(this.q0, list);
    }

    public final void L0() {
        fkg fkgVar = this.G0;
        tp4 tp4Var = null;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.G0 = gb9.D(this.a, null, null, new gy4(this, tp4Var, 1), 3);
    }

    public final void h0(List list) {
        Object next;
        Object next2;
        Object next3;
        boolean zR;
        int i;
        dr4 dr4Var;
        Object next4;
        sfb sfbVar = sfb.F;
        List list2 = lm6.E;
        this.u0 = list;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String id = ((AgentState) next).getId();
            ForkId.Companion.getClass();
            if (x44.r(id, ForkId.MAIN)) {
                break;
            }
        }
        AgentState agentState = (AgentState) next;
        hz4 hz4Var = this.b0;
        list.getClass();
        hz4Var.getClass();
        List list3 = list;
        Iterator it2 = list3.iterator();
        while (true) {
            if (it2.hasNext()) {
                next2 = it2.next();
                if (x44.r(((AgentState) next2).getId(), "main")) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        AgentState agentState2 = (AgentState) next2;
        List listB = agentState2 == null ? list2 : xpg.b(agentState2.getMessages(), hz4Var);
        boolean zR2 = x44.r(agentState != null ? agentState.getStatus() : null, "running");
        String str = ((dw4) this.I.getValue()).b;
        if (ForkId.m1026isMainimpl(str)) {
            zR = zR2;
        } else {
            Iterator it3 = list3.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next3 = it3.next();
                    if (x44.r(((AgentState) next3).getId(), str)) {
                        break;
                    }
                } else {
                    next3 = null;
                    break;
                }
            }
            AgentState agentState3 = (AgentState) next3;
            zR = x44.r(agentState3 != null ? agentState3.getStatus() : null, "running");
        }
        if (!ForkId.m1026isMainimpl(str)) {
            Iterator it4 = list3.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next4 = it4.next();
                    if (x44.r(((AgentState) next4).getId(), str)) {
                        break;
                    }
                } else {
                    next4 = null;
                    break;
                }
            }
            AgentState agentState4 = (AgentState) next4;
            List listR0 = agentState4 != null ? r0(xpg.b(agentState4.getMessages(), this.b0), true) : null;
            if (listR0 != null) {
                list2 = listR0;
            }
            this.v0 = list2;
        }
        Map map = (Map) this.K.getValue();
        amg amgVar = this.K;
        int iD0 = tta.d0(x44.y(list3, 10));
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (Iterator it5 = list3.iterator(); it5.hasNext(); it5 = it5) {
            AgentState agentState5 = (AgentState) it5.next();
            String strM1022constructorimpl = ForkId.m1022constructorimpl(agentState5.getId());
            linkedHashMap.put(ForkId.m1021boximpl(strM1022constructorimpl), new dr4(agentState5.getStatus(), (!x44.r(agentState5.getStatus(), "running") || (dr4Var = (dr4) map.get(ForkId.m1021boximpl(strM1022constructorimpl))) == null) ? null : dr4Var.b));
        }
        amgVar.getClass();
        amgVar.n(null, linkedHashMap);
        if (!this.Y0 && this.W0 == null) {
            if ((agentState != null ? agentState.getOldestSeq() : null) != null) {
                this.W0 = agentState.getOldestSeq();
                this.X0 = true;
            }
        }
        if (!this.C0.isEmpty()) {
            List list4 = ForkId.m1026isMainimpl(str) ? listB : this.v0;
            List listP1 = w44.p1((qo0) this.F0.k);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it6 = listP1.iterator();
            while (it6.hasNext()) {
                linkedHashSet.add(Long.valueOf(((OutboxItem) it6.next()).getQueuedAt()));
            }
            ArrayList arrayList = this.C0;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!linkedHashSet.contains(Long.valueOf(((wpg) obj).a()))) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 == null) {
                arrayList2 = this.C0;
            }
            Iterator it7 = arrayList2.iterator();
            if (!it7.hasNext()) {
                pmf.d();
                return;
            }
            long jA = ((wpg) it7.next()).a();
            while (it7.hasNext()) {
                long jA2 = ((wpg) it7.next()).a();
                if (jA > jA2) {
                    jA = jA2;
                }
            }
            long j = jA - 3000;
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            Iterator it8 = list4.iterator();
            while (true) {
                i = 2;
                if (!it8.hasNext()) {
                    break;
                }
                wpg wpgVar = (wpg) it8.next();
                if (wpgVar.a() >= j) {
                    if (wpgVar instanceof upg) {
                        String str2 = ((upg) wpgVar).a;
                        px4 px4Var = px4.E;
                        map2.merge(str2, 1, new jl2(1));
                    } else if (wpgVar instanceof tpg) {
                        String str3 = ((tpg) wpgVar).a;
                        qx4 qx4Var = qx4.E;
                        map3.merge(str3, 1, new jl2(2));
                    }
                }
            }
            b54.w0(new l6(linkedHashSet, map2, map3, 29), this.C0);
            b54.w0(new yk1(System.currentTimeMillis() - 30000, linkedHashSet, i), this.C0);
        }
        this.E0 = (zR && (this.E0 == sfbVar || this.E0 == sfb.G)) ? sfb.H : (zR || this.E0 == sfbVar) ? this.E0 : sfb.E;
        if (!zR2) {
            this.x0 = null;
        }
        this.r0 = r0(listB, true);
        this.t0 = zR2;
    }

    public final void i0() {
        fkg fkgVar = this.M0;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        fkg fkgVar2 = this.N0;
        if (fkgVar2 != null) {
            fkgVar2.d(null);
        }
        fkg fkgVar3 = this.R0;
        if (fkgVar3 != null) {
            fkgVar3.d(null);
        }
        fkg fkgVar4 = this.S0;
        if (fkgVar4 != null) {
            fkgVar4.d(null);
        }
        fkg fkgVar5 = this.T0;
        if (fkgVar5 != null) {
            fkgVar5.d(null);
        }
        fkg fkgVar6 = this.a1;
        if (fkgVar6 != null) {
            fkgVar6.d(null);
        }
        fkg fkgVar7 = this.g1;
        if (fkgVar7 != null) {
            fkgVar7.d(null);
        }
        fkg fkgVar8 = this.e1;
        if (fkgVar8 != null) {
            fkgVar8.d(null);
        }
        this.e1 = null;
        Iterator it = this.p0.values().iterator();
        while (it.hasNext()) {
            ((lf9) it.next()).d(null);
        }
        this.p0.clear();
        amg amgVar = this.n0;
        lm6 lm6Var = lm6.E;
        amgVar.getClass();
        amgVar.n(null, lm6Var);
        fkg fkgVar9 = this.G0;
        if (fkgVar9 != null) {
            fkgVar9.d(null);
        }
        this.G0 = null;
        this.q0.clear();
        this.c1 = null;
        this.f1 = 0;
        this.v.b();
        this.w.b();
        ((amg) this.x.E).m(null);
        this.D0.clear();
        this.s.setValue(null);
        this.y.m(null);
        amg amgVar2 = this.G;
        amgVar2.getClass();
        amgVar2.n(null, lm6Var);
        this.C.m(null);
        amg amgVar3 = this.A;
        amgVar3.getClass();
        amgVar3.n(null, lm6Var);
        amg amgVar4 = this.I;
        dw4 dw4Var = new dw4(null, 31);
        amgVar4.getClass();
        amgVar4.n(null, dw4Var);
        amg amgVar5 = this.K;
        nm6 nm6Var = nm6.E;
        amgVar5.getClass();
        amgVar5.n(null, nm6Var);
        this.v0 = lm6Var;
        this.w0.clear();
    }

    public final void j0() {
        fkg fkgVar = this.T;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        bz4 bz4Var = new bz4();
        amg amgVar = this.P;
        amgVar.getClass();
        amgVar.n(null, bz4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String l0() {
        /*
            r3 = this;
            fk0 r0 = r3.d
            lsc r0 = r0.F
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            if (r0 == 0) goto L17
            boolean r2 = defpackage.bsg.I0(r0)
            if (r2 != 0) goto L14
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 != 0) goto L42
        L17:
            ze0 r3 = r3.c
            java.lang.String r0 = r3.a()
            r0.getClass()
            us8 r2 = new us8     // Catch: java.lang.IllegalArgumentException -> L2c
            r2.<init>()     // Catch: java.lang.IllegalArgumentException -> L2c
            r2.h(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L2c
            vs8 r1 = r2.c()     // Catch: java.lang.IllegalArgumentException -> L2c
        L2c:
            if (r1 == 0) goto L3e
            us8 r3 = r1.f()
            java.lang.String r0 = "/"
            r3.e(r0)
            vs8 r3 = r3.c()
            java.lang.String r0 = r3.i
            goto L42
        L3e:
            java.lang.String r0 = r3.a()
        L42:
            r3 = 1
            char[] r3 = new char[r3]
            r1 = 47
            r2 = 0
            r3[r2] = r1
            java.lang.String r3 = defpackage.bsg.n1(r0, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.f.l0():java.lang.String");
    }

    public final void m0() {
        g81 g81Var = this.F0;
        List<OutboxItem> listP1 = w44.p1((qo0) g81Var.k);
        fkg fkgVar = (fkg) g81Var.l;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        g81Var.l = null;
        ((qo0) g81Var.k).clear();
        g81Var.j();
        if (listP1.isEmpty()) {
            return;
        }
        int i = 0;
        this.H0 = 0;
        this.I0 = 0L;
        this.J0 = false;
        for (OutboxItem outboxItem : listP1) {
            b54.w0(new kx4(outboxItem, i), this.C0);
            String string = this.b.getString(R.string.conway_error_send_failed, bsg.j1(80, outboxItem.getText()));
            string.getClass();
            this.y0.add(new mpg(string, System.currentTimeMillis()));
        }
    }

    public final String n0() {
        String str = this.f.e;
        f8 f8Var = this.e;
        f8Var.getClass();
        str.getClass();
        String str2 = (String) f8Var.e.get(str);
        if (str2 != null) {
            return str2;
        }
        String string = f8Var.a.getString("conway_composer_draft_".concat(str), "");
        return string == null ? "" : string;
    }

    public final String o0() {
        String str = this.f.e;
        f8 f8Var = this.e;
        f8Var.getClass();
        str.getClass();
        String str2 = (String) f8Var.f.get(str);
        return str2 == null ? f8Var.a.getString("conway_viewing_fork_".concat(str), null) : str2;
    }

    @Override // defpackage.iwe, defpackage.y59
    public final void onDestroy() throws AnchoredDraggableUninitializedException {
        this.Z.g();
        this.a0.a.clear();
        this.b0.a.clear();
        this.v.b();
        this.w.b();
        ((amg) this.x.E).m(null);
        super.onDestroy();
    }

    public final String p0() {
        vs8 vs8VarC;
        String str = (String) this.d.G.getValue();
        if (str != null) {
            if (bsg.I0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String strL0 = l0();
        strL0.getClass();
        try {
            us8 us8Var = new us8();
            us8Var.h(null, strL0);
            vs8VarC = us8Var.c();
        } catch (IllegalArgumentException unused) {
            vs8VarC = null;
        }
        String str2 = vs8VarC != null ? vs8VarC.d : null;
        if (str2 == null) {
            str2 = "";
        }
        return isg.h0(str2, ".staging.ant.dev", false) ? "https://conway.staging.claudeusercontent.com" : "https://conway.claudeusercontent.com";
    }

    public final b0 q0() {
        return (b0) this.l0.getValue();
    }

    public final List r0(List list, boolean z) {
        cpc cpcVar;
        String strE0;
        cpc cpcVar2;
        LinkedHashMap linkedHashMap = this.D0;
        boolean z2 = z && !linkedHashMap.isEmpty();
        if (!z2 && this.K0.length() == 0) {
            return list;
        }
        List<Object> list2 = list;
        ArrayList arrayList = new ArrayList(x44.y(list2, 10));
        for (Object objB : list2) {
            if (objB instanceof tpg) {
                tpg tpgVar = (tpg) objB;
                String str = tpgVar.a;
                if (tpgVar.b == null) {
                    String str2 = tpgVar.d;
                    if (str2 != null && (strE0 = E0(str2)) != null) {
                        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(ikb.a(str2));
                        if (mimeTypeFromExtension == null) {
                            mimeTypeFromExtension = null;
                            if (z2 && (cpcVar2 = (cpc) linkedHashMap.get(str)) != null) {
                                mimeTypeFromExtension = (String) cpcVar2.F;
                            }
                        }
                        objB = tpg.b(tpgVar, strE0, mimeTypeFromExtension);
                    } else if (z2 && (cpcVar = (cpc) linkedHashMap.get(str)) != null) {
                        objB = tpg.b(tpgVar, (String) cpcVar.E, (String) cpcVar.F);
                    }
                }
            }
            arrayList.add(objB);
        }
        return arrayList;
    }

    public final void s0(String str) {
        str.getClass();
        String strN0 = n0();
        String string = bsg.k1(str).toString();
        if (string.length() != 0) {
            if (strN0.length() == 0) {
                strN0 = string;
            } else if (!strN0.equals(string) && !isg.h0(strN0, "\n".concat(string), false)) {
                strN0 = ij0.C(strN0, "\n", string);
            }
        }
        G0(strN0);
    }

    public final boolean t0(Uri uri) {
        vs8 vs8VarC;
        vs8 vs8VarC2;
        vs8 vs8VarC3;
        String lowerCase;
        String host = uri.getHost();
        String str = this.K0;
        str.getClass();
        try {
            us8 us8Var = new us8();
            us8Var.h(null, str);
            vs8VarC = us8Var.c();
        } catch (IllegalArgumentException unused) {
            vs8VarC = null;
        }
        String str2 = vs8VarC != null ? vs8VarC.d : null;
        String strA = this.c.a();
        strA.getClass();
        try {
            us8 us8Var2 = new us8();
            us8Var2.h(null, strA);
            vs8VarC2 = us8Var2.c();
        } catch (IllegalArgumentException unused2) {
            vs8VarC2 = null;
        }
        String str3 = vs8VarC2 != null ? vs8VarC2.d : null;
        String strP0 = p0();
        try {
            us8 us8Var3 = new us8();
            us8Var3.h(null, strP0);
            vs8VarC3 = us8Var3.c();
        } catch (IllegalArgumentException unused3) {
            vs8VarC3 = null;
        }
        List listX = x44.X(str2, str3, vs8VarC3 != null ? vs8VarC3.d : null, "claude-ai.staging.ant.dev");
        if (host == null) {
            return true;
        }
        String lowerCase2 = host.toLowerCase(Locale.ROOT);
        lowerCase2.getClass();
        if (lowerCase2.length() == 0) {
            return true;
        }
        if (bsg.z0(lowerCase2, '.')) {
            lowerCase2 = bsg.y0(1, lowerCase2);
        }
        if (lowerCase2.length() != 0) {
            List<String> list = listX;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str4 : list) {
                    if (str4 != null) {
                        lowerCase = str4.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    } else {
                        lowerCase = null;
                    }
                    if (x44.r(lowerCase, lowerCase2)) {
                        return true;
                    }
                }
            }
            List<String> listX2 = x44.X("claude.ai", "claude.com");
            if (!(listX2 instanceof Collection) || !listX2.isEmpty()) {
                for (String str5 : listX2) {
                    if (lowerCase2.equals(str5)) {
                        return true;
                    }
                    if (isg.h0(lowerCase2, "." + str5, false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void v0() {
        Long l;
        b0 b0VarQ0;
        if (ForkId.m1026isMainimpl(((dw4) this.I.getValue()).b) && (l = this.W0) != null) {
            long jLongValue = l.longValue();
            if (this.Z0 || (b0VarQ0 = q0()) == null) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.b1 < 500) {
                return;
            }
            this.b1 = jCurrentTimeMillis;
            this.Z0 = true;
            C0(false);
            fkg fkgVar = this.a1;
            if (fkgVar != null) {
                fkgVar.d(null);
            }
            this.a1 = gb9.D(this.a, null, null, new p0(b0VarQ0, jLongValue, this, (tp4) null, 2), 3);
        }
    }

    public final void w0() {
        Object i5fVar;
        fkg fkgVar;
        fkg fkgVar2;
        sfa sfaVar = sfa.DEBUG;
        g5f g5fVar = g5f.a;
        h5f h5fVar = h5f.a;
        if (this.M) {
            dw4 dw4Var = (dw4) this.I.getValue();
            String strO0 = o0();
            ide ideVar = cw4.a;
            dw4Var.getClass();
            if (strO0 == null || bsg.I0(strO0) || !ForkId.m1026isMainimpl(dw4Var.b)) {
                i5fVar = h5fVar;
            } else {
                String strM1022constructorimpl = ForkId.m1022constructorimpl(strO0);
                List list = dw4Var.a;
                if ((list instanceof Collection) && list.isEmpty()) {
                    i5fVar = g5fVar;
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (ForkId.m1024equalsimpl0(((ConwayForkMeta) it.next()).m737getAgentIdjXBynNE(), strM1022constructorimpl)) {
                            i5fVar = new i5f(strM1022constructorimpl);
                            break;
                        }
                    }
                    i5fVar = g5fVar;
                }
            }
            if (!(i5fVar instanceof i5f)) {
                if (i5fVar.equals(g5fVar)) {
                    this.M = false;
                    H0(null);
                    return;
                } else {
                    if (i5fVar.equals(h5fVar)) {
                        return;
                    }
                    wg6.i();
                    return;
                }
            }
            this.M = false;
            if (!this.C0.isEmpty() || !((qo0) this.F0.k).isEmpty() || this.E0 == sfb.F || (((fkgVar = this.e1) != null && fkgVar.c()) || ((fkgVar2 = this.g1) != null && fkgVar2.c()))) {
                String str = this.d1;
                i5f i5fVar2 = (i5f) i5fVar;
                if (!(str == null ? false : ForkId.m1024equalsimpl0(str, i5fVar2.a))) {
                    zfa.a.getClass();
                    if (yfa.b()) {
                        CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : copyOnWriteArrayList) {
                            ((n30) ((zfa) obj)).getClass();
                            arrayList.add(obj);
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        zfa.a.getClass();
                        String str2 = i5fVar2.a;
                        String str3 = this.d1;
                        if (str3 == null) {
                            str3 = "main";
                        }
                        String strK = ij0.k("Skipping saved-fork restore of ", str2, " - in-flight send targets ", str3);
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((n30) ((zfa) it2.next())).b(sfaVar, "Conway", strK);
                        }
                        return;
                    }
                    return;
                }
            }
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : copyOnWriteArrayList2) {
                    ((n30) ((zfa) obj2)).getClass();
                    arrayList2.add(obj2);
                }
                if (!arrayList2.isEmpty()) {
                    zfa.a.getClass();
                    String strI = ij0.i("Restoring saved fork view: ", ((i5f) i5fVar).a);
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ((n30) ((zfa) it3.next())).b(sfaVar, "Conway", strI);
                    }
                }
            }
            J0(((i5f) i5fVar).a, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0(android.net.Uri r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.f.x0(android.net.Uri, java.lang.String, java.lang.String):void");
    }

    public final void y0(ConwayAppScreen.Extension extension) {
        extension.getClass();
        String strL1 = bsg.l1(bsg.g1(bsg.g1(extension.getUrl(), '?'), '#'), '/');
        Iterable<ConwayAppScreen.Extension> iterable = (Iterable) this.A.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (ConwayAppScreen.Extension extension2 : iterable) {
                if (x44.r(extension2.getExtensionName(), extension.getExtensionName()) && x44.r(bsg.l1(extension2.getUrl(), '/'), strL1)) {
                    amg amgVar = this.C;
                    amgVar.getClass();
                    amgVar.n(null, extension);
                    this.E.r(iei.a);
                    return;
                }
            }
        }
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(this);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            zfa.a.getClass();
            String str = "Refusing to open unknown extension app: " + extension;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.WARN, strE, str);
            }
        }
    }

    public final void z0(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        try {
            this.b.startActivity(intent);
        } catch (Exception e) {
            zfa.a.getClass();
            if (yfa.b()) {
                String strE = iuj.E(this);
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                zfa.a.getClass();
                String str = "No activity for link " + uri + ": " + gsk.c(e);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.WARN, strE, str);
                }
            }
        }
    }
}
