package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public class epk implements kok, m62, tc2, y5c, fsc, h92, kjb, qg5, ocg {
    public static epk G;
    public static final epk H;
    public Object E;
    public Object F;

    static {
        Object obj = null;
        H = new epk(obj, obj);
    }

    public epk(int i) {
        switch (i) {
            case 4:
                this.E = new jxb();
                this.F = new LinkedHashMap();
                tne.a.add(this);
                break;
            case 6:
                break;
            case 12:
                amg amgVarA = bmg.a(null);
                this.E = amgVarA;
                this.F = j8.k(amgVarA);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.E = byteArrayOutputStream;
                this.F = new DataOutputStream(byteArrayOutputStream);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                this.E = new ArrayList();
                this.F = new ArrayList();
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                this.E = new HashMap();
                break;
            case 29:
                this.E = new HashMap();
                this.F = new HashMap();
                break;
            default:
                this.E = null;
                this.F = null;
                break;
        }
    }

    public static epk A(Context context) {
        epk epkVar;
        synchronized (epk.class) {
            try {
                if (G == null) {
                    G = dtj.d(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new epk(context, 0) : new epk(0);
                }
                epkVar = G;
            } catch (Throwable th) {
                throw th;
            }
        }
        return epkVar;
    }

    public static synchronized void B() {
        Context context;
        try {
            epk epkVar = G;
            if (epkVar != null && (context = (Context) epkVar.E) != null && ((lpk) epkVar.F) != null) {
                context.getContentResolver().unregisterContentObserver((lpk) G.F);
            }
            G = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static epk p(epk epkVar, m5c m5cVar, yjh yjhVar, int i) {
        cu9 cu9Var = m5cVar;
        if ((i & 1) != 0) {
            cu9Var = (cu9) epkVar.E;
        }
        if ((i & 2) != 0) {
            yjhVar = (yjh) epkVar.F;
        }
        return new epk(cu9Var, yjhVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.epk v(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L6b
            okio.ByteString[] r0 = new okio.ByteString[r0]     // Catch: java.io.IOException -> L6b
            okio.Buffer r1 = new okio.Buffer     // Catch: java.io.IOException -> L6b
            r1.<init>()     // Catch: java.io.IOException -> L6b
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L6b
            if (r3 >= r4) goto L5b
            r4 = r12[r3]     // Catch: java.io.IOException -> L6b
            java.lang.String[] r5 = com.airbnb.lottie.parser.moshi.a.I     // Catch: java.io.IOException -> L6b
            r6 = 34
            r1.B0(r6)     // Catch: java.io.IOException -> L6b
            int r7 = r4.length()     // Catch: java.io.IOException -> L6b
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6b
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L6b
            if (r10 != 0) goto L38
            goto L42
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.S0(r9, r8, r4)     // Catch: java.io.IOException -> L6b
        L3d:
            r1.T0(r10)     // Catch: java.io.IOException -> L6b
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.S0(r9, r7, r4)     // Catch: java.io.IOException -> L6b
        L4a:
            r1.B0(r6)     // Catch: java.io.IOException -> L6b
            r1.readByte()     // Catch: java.io.IOException -> L6b
            long r4 = r1.F     // Catch: java.io.IOException -> L6b
            okio.ByteString r4 = r1.t(r4)     // Catch: java.io.IOException -> L6b
            r0[r3] = r4     // Catch: java.io.IOException -> L6b
            int r3 = r3 + 1
            goto La
        L5b:
            epk r1 = new epk     // Catch: java.io.IOException -> L6b
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6b
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6b
            okio.Options r0 = okio.Options.Companion.b(r0)     // Catch: java.io.IOException -> L6b
            r1.<init>(r12, r0)     // Catch: java.io.IOException -> L6b
            return r1
        L6b:
            r12 = move-exception
            defpackage.sz6.h(r12)
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epk.v(java.lang.String[]):epk");
    }

    @Override // defpackage.m62
    public void a(View view, float[] fArr) {
        nwa.d(fArr);
        z(view, fArr);
    }

    @Override // defpackage.kok
    public Object b(String str) {
        Context context = (Context) this.E;
        if (context != null && knk.N(context)) {
            try {
                dke dkeVar = new dke();
                dkeVar.E = this;
                dkeVar.F = str;
                return (String) xrk.h(dkeVar);
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
            }
        }
        return null;
    }

    @Override // defpackage.ocg
    public float c(float f, float f2) {
        koc kocVar = (koc) this.E;
        int iM = kocVar.m();
        lsc lscVar = kocVar.m;
        int i = ((coc) lscVar.getValue()).c + iM;
        if (i == 0) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        int i2 = kocVar.e;
        if (f < MTTypesetterKt.kLineSkipLimitMultiplier) {
            i2++;
        }
        int iE0 = wd6.e0(((int) (f2 / i)) + i2, 0, kocVar.l());
        kocVar.m();
        int i3 = ((coc) lscVar.getValue()).c;
        long j = i2;
        long j2 = j - 1;
        if (j2 < 0) {
            j2 = 0;
        }
        int i4 = (int) j2;
        long j3 = j + 1;
        if (j3 > 2147483647L) {
            j3 = 2147483647L;
        }
        int iAbs = Math.abs((wd6.e0(wd6.e0(iE0, i4, (int) j3), 0, kocVar.l()) - i2) * i) - i;
        int i5 = iAbs >= 0 ? iAbs : 0;
        if (i5 == 0) {
            return i5;
        }
        return Math.signum(f) * i5;
    }

    public void d(n2d n2dVar) {
        ((ConcurrentHashMap) this.E).put(((iqa) this.F).i(n2dVar), n2dVar);
    }

    @Override // defpackage.ocg
    public float e(float f) {
        koc kocVar = (koc) this.E;
        pcg pcgVar = kocVar.k().n;
        List list = kocVar.k().a;
        int size = list.size();
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            r5b r5bVar = (r5b) list.get(i);
            int iG = kyk.g(kocVar.k());
            int i2 = -kocVar.k().f;
            int i3 = kocVar.k().d;
            int i4 = kocVar.k().b;
            int i5 = r5bVar.j;
            kocVar.l();
            float fE = i5 - pcgVar.e(iG, i4, i2, i3);
            if (fE <= MTTypesetterKt.kLineSkipLimitMultiplier && fE > f3) {
                f3 = fE;
            }
            if (fE >= MTTypesetterKt.kLineSkipLimitMultiplier && fE < f2) {
                f2 = fE;
            }
        }
        if (f3 == Float.NEGATIVE_INFINITY) {
            f3 = f2;
        }
        if (f2 == Float.POSITIVE_INFINITY) {
            f2 = f3;
        }
        if (!kocVar.d()) {
            if (x41.o(kocVar, f)) {
                f3 = 0.0f;
                f2 = 0.0f;
            } else {
                f2 = 0.0f;
            }
        }
        if (!kocVar.b()) {
            f3 = 0.0f;
            if (!x41.o(kocVar, f)) {
                f2 = 0.0f;
            }
        }
        Float fValueOf = Float.valueOf(f3);
        Float fValueOf2 = Float.valueOf(f2);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fFloatValue3 = ((Number) ((nw7) this.F).invoke(Float.valueOf(f), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
        if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != MTTypesetterKt.kLineSkipLimitMultiplier) {
            e39.c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
        }
        return (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) ? MTTypesetterKt.kLineSkipLimitMultiplier : fFloatValue3;
    }

    @Override // defpackage.y5c
    public void f(c5c c5cVar, int i) {
        int iQ;
        x3f x3fVar = (x3f) ((poj) this.F).E;
        if (!(c5cVar instanceof yj6)) {
            if (c5cVar instanceof ikh) {
                ((yj6) this.E).O(new ikh(((ikh) c5cVar).O()));
                return;
            } else {
                if (c5cVar instanceof xf5) {
                    if (x3fVar.a.contains(v3f.a(((a2a) c5cVar).E.H.G))) {
                        ((yj6) this.E).O(new xf5(((xf5) c5cVar).O()));
                        return;
                    }
                    return;
                }
                return;
            }
        }
        yj6 yj6Var = (yj6) c5cVar;
        z3h z3hVar = yj6Var.H;
        if (x3fVar.a.contains(v3f.a(z3hVar.G))) {
            yj6 yj6VarJ0 = yj6Var.j0();
            String str = z3hVar.F;
            n31 n31VarK = yj6VarJ0.k();
            if (yj6VarJ0.J != null) {
                if (yj6VarJ0.v()) {
                    n31 n31VarK2 = yj6VarJ0.k();
                    n31VarK2.getClass();
                    m31 m31Var = new m31(n31VarK2);
                    while (m31Var.hasNext()) {
                        m31Var.next();
                        m31Var.remove();
                    }
                }
                if (yj6VarJ0.J.E == 0) {
                    yj6VarJ0.J = null;
                }
            }
            n31 n31VarK3 = yj6Var.k();
            n31VarK3.getClass();
            m31 m31Var2 = new m31(n31VarK3);
            while (m31Var2.hasNext()) {
                l31 l31Var = (l31) m31Var2.next();
                if (x3fVar.d(str, yj6Var, l31Var)) {
                    String str2 = l31Var.E;
                    String strH = n31.h(l31Var.F);
                    if (x3fVar.e ? false : x3fVar.e(v3f.a(str), new s3f(ouk.g(str2)))) {
                        strH = yj6Var.a(str2);
                        if (strH.isEmpty()) {
                            strH = n31.h(l31Var.F);
                        }
                    }
                    n31VarK.t(str2, strH);
                }
            }
            x3fVar.getClass();
            n31 n31Var = new n31();
            v3f v3fVarA = v3f.a(str);
            HashMap map = x3fVar.c;
            if (map.containsKey(v3fVarA)) {
                for (Map.Entry entry : ((Map) map.get(v3fVarA)).entrySet()) {
                    n31Var.t(((s3f) entry.getKey()).a, ((t3f) entry.getValue()).a);
                }
            }
            if (yj6Var.w("a") && n31Var.l("rel").equals("nofollow")) {
                String strA = yj6Var.a("href");
                String strL = yj6Var.l();
                if (!strA.isEmpty() && !strL.isEmpty() && strA.startsWith(strL) && (iQ = n31Var.q("rel")) != -1) {
                    n31Var.u(iQ);
                }
            }
            m31 m31Var3 = new m31(n31Var);
            while (m31Var3.hasNext()) {
                l31 l31Var2 = (l31) m31Var3.next();
                String str3 = l31Var2.E;
                int iR = n31VarK.r(str3);
                if (iR != -1) {
                    n31VarK.u(iR);
                }
                n31VarK.t(str3, n31.h(l31Var2.F));
            }
            yj6VarJ0.k().a(n31VarK);
            ((yj6) this.E).O(yj6VarJ0);
            this.E = yj6VarJ0;
        }
    }

    public void g(String str, String str2) {
        str.getClass();
        ((ArrayList) this.E).add(kxk.n(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) this.F).add(kxk.n(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public void h(String str, String str2) {
        str.getClass();
        ((ArrayList) this.E).add(kxk.n(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
        ((ArrayList) this.F).add(kxk.n(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
    }

    public cjh i(List list) throws IOException {
        ij6 ij6Var;
        ij6 ij6Var2 = null;
        try {
            int size = list.size();
            int i = 0;
            ij6 ij6Var3 = null;
            while (i < size) {
                try {
                    ij6Var = (ij6) list.get(i);
                } catch (Exception e) {
                    e = e;
                    ij6Var2 = ij6Var3;
                }
                try {
                    ij6Var.a((lj6) this.F);
                    i++;
                    ij6Var3 = ij6Var;
                } catch (Exception e2) {
                    e = e2;
                    ij6Var2 = ij6Var;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((lj6) this.F).a.s());
                    sb2.append(", composition=");
                    sb2.append(((lj6) this.F).c());
                    sb2.append(", selection=");
                    lj6 lj6Var = (lj6) this.F;
                    sb2.append((Object) kkh.i(mwa.m(lj6Var.b, lj6Var.c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    w44.R0(list, sb, "\n", null, null, new py3(ij6Var2, 17, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            lj6 lj6Var2 = (lj6) this.F;
            lj6Var2.getClass();
            zb0 zb0Var = new zb0(lj6Var2.a.toString());
            lj6 lj6Var3 = (lj6) this.F;
            long jM = mwa.m(lj6Var3.b, lj6Var3.c);
            kkh kkhVar = kkh.h(((cjh) this.E).b) ? null : new kkh(jM);
            cjh cjhVar = new cjh(zb0Var, kkhVar != null ? kkhVar.a : mwa.m(kkh.f(jM), kkh.g(jM)), ((lj6) this.F).c());
            this.E = cjhVar;
            return cjhVar;
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // defpackage.h92
    public void k(u82 u82Var, oqe oqeVar) {
        ((dq5) this.F).E.execute(new f60(this, (h92) this.E, oqeVar, 3));
    }

    public x81 l() {
        return new x81((p0c) this.E, (o0c) this.F);
    }

    @Override // defpackage.y5c
    public void m(c5c c5cVar, int i) {
        if (c5cVar instanceof yj6) {
            if (((x3f) ((poj) this.F).E).a.contains(v3f.a(((yj6) c5cVar).H.G))) {
                this.E = ((yj6) this.E).E;
            }
        }
    }

    @Override // defpackage.qg5
    public tg5 n() {
        return new idc((t82) this.F, (epk) this.E);
    }

    public fw7 o() {
        return new fw7((ArrayList) this.E, (ArrayList) this.F);
    }

    @Override // defpackage.tc2
    public void p0(ee2 ee2Var, pd1 pd1Var) {
        if (((ge2) this.E) == null) {
            x44.o0("context");
            throw null;
        }
        if (((sp0) this.F) != null) {
            return;
        }
        x44.o0("horizontalLayerMargins");
        throw null;
    }

    @Override // defpackage.h92
    public void q(u82 u82Var, Throwable th) {
        ((dq5) this.F).E.execute(new f60(this, (h92) this.E, th, 4));
    }

    public pe1[] r(Handler handler, r77 r77Var, r77 r77Var2, r77 r77Var3, r77 r77Var4) {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.E;
        v6b v6bVar = new v6b(context);
        n95 n95Var = (n95) this.F;
        v6bVar.c = n95Var;
        v6bVar.d = 5000L;
        v6bVar.e = handler;
        v6bVar.f = r77Var;
        v6bVar.g = 50;
        fd9.M(!v6bVar.b);
        Handler handler2 = v6bVar.e;
        fd9.M((handler2 == null && v6bVar.f == null) || !(handler2 == null || v6bVar.f == null));
        v6bVar.b = true;
        arrayList.add(new x6b(v6bVar));
        tp5 tp5Var = new tp5(context);
        fd9.M(!tp5Var.d);
        tp5Var.d = true;
        if (tp5Var.c == null) {
            tp5Var.c = new xv8(new m51[0]);
        }
        i61 i61Var = tp5Var.f;
        qb5 qb5Var = tp5Var.g;
        if (i61Var == null) {
            if (qb5Var == null) {
                tp5Var.g = new qb5(context, 14);
            }
            if (tp5Var.e == null) {
                tp5Var.e = hj6.I;
            }
            h61 h61Var = new h61(context);
            u31 u31Var = context != null ? null : tp5Var.b;
            Context context2 = (Context) h61Var.b;
            if (context2 == null) {
                h61Var.e = u31Var;
            }
            qb5 qb5Var2 = tp5Var.g;
            h61Var.c = qb5Var2;
            h61Var.d = tp5Var.e;
            if (qb5Var2 == null) {
                h61Var.c = new qb5(context2, 14);
            }
            tp5Var.f = new i61(h61Var);
        } else {
            fd9.M(qb5Var == null);
            fd9.M(tp5Var.e == null);
        }
        arrayList.add(new e6b((Context) this.E, n95Var, handler, r77Var2, new vp5(tp5Var)));
        arrayList.add(new mkh(r77Var3, handler.getLooper()));
        Looper looper = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new rjb(r77Var4, looper));
        }
        arrayList.add(new ha2());
        arrayList.add(new ex8(new kq1(context, 1)));
        return (pe1[]) arrayList.toArray(new pe1[0]);
    }

    public synchronized Map s() {
        try {
            if (((Map) this.F) == null) {
                this.F = Collections.unmodifiableMap(new HashMap((HashMap) this.E));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.F;
    }

    @Override // defpackage.fsc
    public Object t(pl9 pl9Var, ArrayList arrayList) {
        Object hreVar;
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.F;
        Class clsI = ez1.I(pl9Var);
        Object escVar = concurrentHashMap.get(clsI);
        if (escVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsI, (escVar = new esc()))) != null) {
            escVar = objPutIfAbsent;
        }
        esc escVar2 = (esc) escVar;
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ko9((eo9) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = escVar2.a;
        Object obj = concurrentHashMap2.get(arrayList2);
        if (obj == null) {
            try {
                hreVar = (KSerializer) ((pz7) this.E).invoke(pl9Var, arrayList);
            } catch (Throwable th) {
                hreVar = new hre(th);
            }
            jre jreVar = new jre(hreVar);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, jreVar);
            obj = objPutIfAbsent2 == null ? jreVar : objPutIfAbsent2;
        }
        return ((jre) obj).E;
    }

    public void u(Context context, Uri uri) {
        Intent intent = (Intent) this.E;
        intent.setData(uri);
        context.startActivity(intent, (Bundle) this.F);
    }

    public void w(wfd wfdVar) throws GeneralSecurityException {
        HashMap map = (HashMap) this.F;
        if (wfdVar == null) {
            mr9.h("wrapper must be non-null");
            return;
        }
        Class clsB = wfdVar.b();
        if (!map.containsKey(clsB)) {
            map.put(clsB, wfdVar);
            return;
        }
        wfd wfdVar2 = (wfd) map.get(clsB);
        if (!wfdVar2.equals(wfdVar) || !wfdVar.equals(wfdVar2)) {
            throw new GeneralSecurityException(grc.s(clsB, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type"));
        }
    }

    public void x(o0c o0cVar) {
        this.F = o0cVar;
    }

    public void y(p0c p0cVar) {
        this.E = p0cVar;
    }

    public void z(View view, float[] fArr) {
        float[] fArr2 = (float[]) this.E;
        Object parent = view.getParent();
        if (parent instanceof View) {
            z((View) parent, fArr);
            nwa.d(fArr2);
            nwa.i(fArr2, -view.getScrollX(), -view.getScrollY());
            u00.H(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            nwa.d(fArr2);
            nwa.i(fArr2, left, top);
            u00.H(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.F;
            view.getLocationInWindow(iArr);
            nwa.d(fArr2);
            nwa.i(fArr2, -view.getScrollX(), -view.getScrollY());
            u00.H(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            nwa.d(fArr2);
            nwa.i(fArr2, f, f2);
            u00.H(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        csg.N(matrix, fArr2);
        u00.H(fArr, fArr2);
    }

    public /* synthetic */ epk(Object obj, Object obj2) {
        this.E = obj;
        this.F = obj2;
    }

    public epk(Context context, int i) {
        switch (i) {
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                this.E = context;
                this.F = new n95(context, 1);
                break;
            default:
                this.E = context;
                lpk lpkVar = new lpk(null);
                this.F = lpkVar;
                context.getContentResolver().registerContentObserver(ylk.a, true, lpkVar);
                break;
        }
    }

    public epk(qfd qfdVar) {
        this.E = new HashMap(qfdVar.a);
        this.F = new HashMap(qfdVar.b);
    }

    public epk(iqa iqaVar) {
        this.E = new ConcurrentHashMap();
        this.F = iqaVar;
    }

    public epk(dq5 dq5Var, h92 h92Var) {
        this.F = dq5Var;
        this.E = h92Var;
    }

    public epk(pz7 pz7Var) {
        this.E = pz7Var;
        this.F = new ConcurrentHashMap();
    }

    public epk(float[] fArr) {
        this.E = fArr;
        this.F = new int[2];
    }
}
