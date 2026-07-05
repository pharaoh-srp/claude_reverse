package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.anthropic.claude.tool.model.EventSearchV0Input;
import com.anthropic.claude.tool.model.HealthConnectDataTypesV0Input;
import com.anthropic.claude.tool.model.HealthConnectDataTypesV0Output;
import com.anthropic.claude.tool.model.HealthConnectDataTypesV0OutputDataTypesItem;
import com.anthropic.claude.tool.model.HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType;
import com.anthropic.claude.tool.model.HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.KotlinNullPointerException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class tk5 implements lp3, a03, sac, wqc, h92 {
    public static final tk5 G;
    public static final d28 H;
    public final /* synthetic */ int E;
    public Object F;

    static {
        int i = 1;
        G = new tk5(i, new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
        H = new d28(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tk5(defpackage.vf4 r14) {
        /*
            r13 = this;
            r0 = 22
            r13.E = r0
            r13.<init>()
            r0 = 10
            int[] r0 = defpackage.sq6.H(r0)
            int r1 = r0.length
            boolean[] r1 = new boolean[r1]
            r13.F = r1
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L15:
            if (r3 >= r1) goto L86
            r4 = r0[r3]
            r5 = 0
            switch(r4) {
                case 1: goto L39;
                case 2: goto L36;
                case 3: goto L33;
                case 4: goto L30;
                case 5: goto L2d;
                case 6: goto L2a;
                case 7: goto L27;
                case 8: goto L24;
                case 9: goto L21;
                case 10: goto L1e;
                default: goto L1d;
            }
        L1d:
            throw r5
        L1e:
            java.lang.String r6 = "ServletContextTagInterceptor"
            goto L3b
        L21:
            java.lang.String r6 = "ServiceNameTagInterceptor"
            goto L3b
        L24:
            java.lang.String r6 = "PeerServiceTagInterceptor"
            goto L3b
        L27:
            java.lang.String r6 = "ForceManualKeepTagInterceptor"
            goto L3b
        L2a:
            java.lang.String r6 = "ForceManualDropTagInterceptor"
            goto L3b
        L2d:
            java.lang.String r6 = "DBStatementRule"
            goto L3b
        L30:
            java.lang.String r6 = "Status404Decorator"
            goto L3b
        L33:
            java.lang.String r6 = "Status404Rule"
            goto L3b
        L36:
            java.lang.String r6 = "URLAsResourceNameRule"
            goto L3b
        L39:
            java.lang.String r6 = "ResourceNameRule"
        L3b:
            r7 = 1
            switch(r4) {
                case 1: goto L40;
                case 2: goto L40;
                case 3: goto L40;
                case 4: goto L40;
                case 5: goto L40;
                case 6: goto L40;
                case 7: goto L40;
                case 8: goto L42;
                case 9: goto L40;
                case 10: goto L40;
                default: goto L3f;
            }
        L3f:
            throw r5
        L40:
            r5 = r7
            goto L43
        L42:
            r5 = r2
        L43:
            com.datadog.trace.bootstrap.config.provider.b r8 = r14.E1
            java.lang.String r9 = "trace."
            java.lang.String r10 = ".enabled"
            java.lang.String r11 = defpackage.ij0.j(r9, r6, r10)
            java.lang.String[] r12 = new java.lang.String[r2]
            boolean r11 = r8.c(r11, r5, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r9)
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r9)
            r12.append(r6)
            r12.append(r10)
            java.lang.String r6 = r12.toString()
            java.lang.String[] r9 = new java.lang.String[r2]
            boolean r6 = r8.c(r6, r5, r9)
            if (r5 == 0) goto L75
            if (r11 == 0) goto L83
            if (r6 == 0) goto L83
            goto L79
        L75:
            if (r11 != 0) goto L79
            if (r6 == 0) goto L83
        L79:
            java.lang.Object r5 = r13.F
            boolean[] r5 = (boolean[]) r5
            int r4 = defpackage.sq6.F(r4)
            r5[r4] = r7
        L83:
            int r3 = r3 + 1
            goto L15
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk5.<init>(vf4):void");
    }

    public void a(av9 av9Var) {
        if (!av9Var.X()) {
            b39.c("DepthSortedSet.add called on an unattached node");
        }
        ((keg) this.F).add(av9Var);
    }

    @Override // defpackage.a03
    public boolean b() {
        return ((List) ((f03) this.F).o.getValue()) == null;
    }

    @Override // defpackage.szb
    public uwb c(a2 a2Var) {
        n78 n78Var = (n78) this.F;
        n78Var.getClass();
        return ((y50) n78Var.F).d(a2Var);
    }

    @Override // defpackage.a03
    public List d() {
        List list = (List) ((f03) this.F).o.getValue();
        return list == null ? lm6.E : list;
    }

    public sk5 e() {
        return new sk5(((cf5) this.F).c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r6 == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(com.anthropic.claude.tool.model.EventSearchV0Input r7, defpackage.vp4 r8) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk5.f(com.anthropic.claude.tool.model.EventSearchV0Input, vp4):java.lang.Object");
    }

    public void g() {
        long nanos;
        cf5 cf5Var = (cf5) this.F;
        long j = cf5Var.e;
        boolean z = cf5Var.d;
        df5 df5Var = cf5Var.c;
        nwc nwcVar = df5Var.E;
        if (!z) {
            cf5Var.a(nwcVar.h() - j);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(jCurrentTimeMillis);
        TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
        if (z) {
            long nanos2 = timeUnit2.toNanos(micros) - j;
            df5Var.E.o = System.nanoTime();
            nanos = nanos2;
        } else {
            long micros2 = micros - timeUnit.toMicros(System.currentTimeMillis());
            nanos = timeUnit2.toNanos(micros2) + timeUnit.toNanos((df5Var.E.h() - j) / 1000000);
        }
        cf5Var.a(nanos);
    }

    @Override // defpackage.a03
    public boolean h() {
        f03 f03Var = (f03) this.F;
        return ((List) f03Var.o.getValue()) != null && x44.r(f03Var.h.k((gnd) f03Var.r.getValue(), f03Var.P()).a, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.oab i(defpackage.jx8 r15, defpackage.mab r16, defpackage.j8g r17, defpackage.k6f r18) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk5.i(jx8, mab, j8g, k6f):oab");
    }

    @Override // defpackage.a03
    public boolean j() {
        f03 f03Var = (f03) this.F;
        return f03Var.h.k((gnd) f03Var.r.getValue(), f03Var.P()).b;
    }

    @Override // defpackage.h92
    public void k(u82 u82Var, oqe oqeVar) {
        ua2 ua2Var = (ua2) this.F;
        if (!oqeVar.a.U) {
            ua2Var.resumeWith(new hre(new HttpException(oqeVar)));
            return;
        }
        Object obj = oqeVar.b;
        if (obj != null) {
            ua2Var.resumeWith(obj);
            return;
        }
        kie kieVarL0 = u82Var.l0();
        kieVarL0.getClass();
        pl9 pl9VarB = jce.a.b(wb9.class);
        Object objCast = ez1.I(pl9VarB).cast(kieVarL0.e.N(pl9VarB));
        objCast.getClass();
        wb9 wb9Var = (wb9) objCast;
        ua2Var.resumeWith(new hre(new KotlinNullPointerException("Response from " + wb9Var.a.getName() + '.' + wb9Var.c.getName() + " was null but response body type was declared as non-null")));
    }

    public ro6 l() {
        return new ro6(27, ((x0a) this.F).h());
    }

    @Override // defpackage.wqc
    public void m(bz7 bz7Var, pz7 pz7Var) {
        pz7Var.getClass();
        n78 n78Var = (n78) this.F;
        vqc vqcVar = new vqc(bz7Var, pz7Var);
        n78Var.getClass();
        ((y50) n78Var.F).a(vqcVar);
    }

    public mab n(jx8 jx8Var, Object obj, qjc qjcVar, tqh tqhVar) {
        String strA;
        if (jx8Var.o() != e52.DISABLED) {
            if (jx8Var.m() != null) {
                return new mab(jx8Var.m(), jx8Var.n());
            }
            List list = ((r4e) this.F).c.c;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    strA = null;
                    break;
                }
                cpc cpcVar = (cpc) list.get(i);
                pp9 pp9Var = (pp9) cpcVar.E;
                if (((pl9) cpcVar.F).n(obj)) {
                    pp9Var.getClass();
                    strA = pp9Var.a(obj, qjcVar);
                    if (strA != null) {
                        break;
                    }
                }
                i++;
            }
            if (strA != null) {
                if (mx8.d(jx8Var).isEmpty()) {
                    return new mab(strA, jx8Var.n());
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(jx8Var.n());
                linkedHashMap.put("coil#size", qjcVar.f().toString());
                return new mab(strA, linkedHashMap);
            }
        }
        return null;
    }

    public void o() {
        ((ex7) this.F).P.Q();
    }

    @Override // defpackage.sac
    public Object o0() {
        Constructor constructor = (Constructor) this.F;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            nai naiVar = oce.a;
            xh6.f("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + oce.b(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            xh6.f("Failed to invoke constructor '" + oce.b(constructor) + "' with no args", e3.getCause());
            return null;
        }
    }

    public boolean p(av9 av9Var) {
        if (!av9Var.X()) {
            b39.c("DepthSortedSet.remove called on an unattached node");
        }
        return ((keg) this.F).remove(av9Var);
    }

    @Override // defpackage.h92
    public void q(u82 u82Var, Throwable th) {
        ((ua2) this.F).resumeWith(new hre(th));
    }

    @Override // defpackage.a03
    public void r() {
        f03 f03Var = (f03) this.F;
        String strP = f03Var.P();
        if (x44.r(strP, f03Var.p)) {
            gb9.D(f03Var.a, null, null, new c03(f03Var, strP, null, 0), 3);
        }
    }

    public qqb s(vd9 vd9Var) {
        jbe jbeVar = (jbe) vd9Var;
        ww7 ww7VarD = jbeVar.d();
        jbe jbeVarG = jbeVar.g();
        if (jbeVarG != null) {
            qqb qqbVarS = s(jbeVarG);
            fab fabVarK0 = qqbVarS != null ? qqbVarS.k0() : null;
            xh3 xh3VarE = fabVarK0 != null ? fabVarK0.e(jbeVar.f(), 19) : null;
            if (xh3VarE instanceof qqb) {
                return (qqb) xh3VarE;
            }
        } else {
            by9 by9Var = (by9) w44.N0(x44.W(((cy9) this.F).c(ww7VarD.e())));
            if (by9Var != null) {
                hy9 hy9Var = by9Var.N.d;
                hy9Var.getClass();
                return hy9Var.v(jbeVar.f(), vd9Var);
            }
        }
        return null;
    }

    public void t() {
        df5 df5Var = ((cf5) this.F).c;
        if (df5Var.S <= 0) {
            df5Var.R = true;
            df5Var.S = (byte) 0;
        }
    }

    public String toString() {
        switch (this.E) {
            case 1:
                return "Bradford";
            case 12:
                return ((keg) this.F).toString();
            default:
                return super.toString();
        }
    }

    public void u(String str, String str2) {
        df5 df5Var = ((cf5) this.F).c;
        if (str2 == null || str2.isEmpty()) {
            df5Var.P(str, null);
        } else {
            df5Var.P(str, str2);
        }
    }

    @Override // defpackage.lp3
    public Object w(Context context, Object obj, String str, cxh cxhVar) {
        HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType healthConnectDataTypesV0OutputDataTypesItemRecordBaseType;
        HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem healthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem;
        switch (this.E) {
            case 5:
                return f((EventSearchV0Input) obj, cxhVar);
            default:
                HealthConnectDataTypesV0Input healthConnectDataTypesV0Input = (HealthConnectDataTypesV0Input) obj;
                wh8 wh8Var = (wh8) this.F;
                u0h u0hVar = sk8.h;
                List listF = gsk.f();
                ArrayList<sk8> arrayList = new ArrayList();
                for (Object obj2 : listF) {
                    if (!((sk8) obj2).g() || !wh8Var.f.m()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
                for (sk8 sk8Var : arrayList) {
                    String strD = sk8Var.d();
                    String string = context.getString(sk8Var.c());
                    string.getClass();
                    int iOrdinal = sk8Var.e().ordinal();
                    if (iOrdinal == 0) {
                        healthConnectDataTypesV0OutputDataTypesItemRecordBaseType = HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType.INSTANTANEOUS;
                    } else if (iOrdinal == 1) {
                        healthConnectDataTypesV0OutputDataTypesItemRecordBaseType = HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType.INTERVAL;
                    } else {
                        if (iOrdinal != 2) {
                            mr9.b();
                            return null;
                        }
                        healthConnectDataTypesV0OutputDataTypesItemRecordBaseType = HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType.SERIES;
                    }
                    String strI = sk8Var.i();
                    Map mapH = sk8Var.h();
                    ArrayList arrayList3 = new ArrayList(mapH.size());
                    Iterator it = mapH.entrySet().iterator();
                    while (it.hasNext()) {
                        int iOrdinal2 = ((ls) ((Map.Entry) it.next()).getKey()).ordinal();
                        if (iOrdinal2 == 0) {
                            healthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem = HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem.SUM;
                        } else if (iOrdinal2 == 1) {
                            healthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem = HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem.AVERAGE;
                        } else if (iOrdinal2 == 2) {
                            healthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem = HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem.MIN;
                        } else if (iOrdinal2 == 3) {
                            healthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem = HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem.MAX;
                        } else if (iOrdinal2 == 4) {
                            healthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem = HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem.COUNT;
                        } else {
                            if (iOrdinal2 != 5) {
                                mr9.b();
                                return null;
                            }
                            healthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem = HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem.DURATION;
                        }
                        arrayList3.add(healthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem);
                    }
                    arrayList2.add(new HealthConnectDataTypesV0OutputDataTypesItem(string, strD, healthConnectDataTypesV0OutputDataTypesItemRecordBaseType, arrayList3, strI));
                }
                String search_text = healthConnectDataTypesV0Input.getSearch_text();
                if (search_text != null && !bsg.I0(search_text)) {
                    String lowerCase = search_text.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        HealthConnectDataTypesV0OutputDataTypesItem healthConnectDataTypesV0OutputDataTypesItem = (HealthConnectDataTypesV0OutputDataTypesItem) obj3;
                        String identifier = healthConnectDataTypesV0OutputDataTypesItem.getIdentifier();
                        Locale locale = Locale.ROOT;
                        String lowerCase2 = identifier.toLowerCase(locale);
                        lowerCase2.getClass();
                        if (!bsg.u0(lowerCase2, lowerCase, false)) {
                            String lowerCase3 = healthConnectDataTypesV0OutputDataTypesItem.getDisplay_name().toLowerCase(locale);
                            lowerCase3.getClass();
                            if (bsg.u0(lowerCase3, lowerCase, false)) {
                            }
                        }
                        arrayList4.add(obj3);
                    }
                    arrayList2 = arrayList4;
                }
                return pyk.E0(new HealthConnectDataTypesV0Output(arrayList2));
        }
    }

    public tk5(cf5 cf5Var, unb unbVar) {
        this.E = 10;
        unbVar.getClass();
        this.F = cf5Var;
    }

    public tk5(Context context) {
        this.E = 26;
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("dd_prefs", 0);
        sharedPreferences.getClass();
        this.F = sharedPreferences;
    }

    public tk5(r4e r4eVar, nyj nyjVar) {
        this.E = 18;
        this.F = r4eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[PHI: r12
      0x0028: PHI (r12v7 int) = (r12v6 int), (r12v8 int) binds: [B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tk5(int[] r23, float[] r24, float[][] r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            r2 = 3
            r0.E = r2
            r0.<init>()
            int r3 = r1.length
            r4 = 1
            int r3 = r3 - r4
            zn0[][] r5 = new defpackage.zn0[r3][]
            r6 = 0
            r8 = r4
            r9 = r8
            r7 = r6
        L13:
            if (r7 >= r3) goto L6a
            r10 = r23[r7]
            r11 = 2
            if (r10 == 0) goto L33
            if (r10 == r4) goto L31
            if (r10 == r11) goto L2f
            if (r10 == r2) goto L2a
            r12 = 4
            if (r10 == r12) goto L28
            r12 = 5
            if (r10 == r12) goto L28
            r13 = r9
            goto L34
        L28:
            r13 = r12
            goto L34
        L2a:
            if (r8 != r4) goto L31
            goto L2f
        L2d:
            r13 = r8
            goto L34
        L2f:
            r8 = r11
            goto L2d
        L31:
            r8 = r4
            goto L2d
        L33:
            r13 = r2
        L34:
            r9 = r25[r7]
            int r10 = r7 + 1
            r20 = r25[r10]
            r14 = r1[r7]
            r15 = r1[r10]
            int r12 = r9.length
            int r12 = r12 / r11
            int r2 = r9.length
            int r2 = r2 % r11
            int r2 = r2 + r12
            zn0[] r11 = new defpackage.zn0[r2]
            r12 = r6
        L46:
            if (r12 >= r2) goto L64
            int r16 = r12 * 2
            r17 = r12
            zn0 r12 = new zn0
            r18 = r16
            r16 = r9[r18]
            int r19 = r18 + 1
            r21 = r17
            r17 = r9[r19]
            r18 = r20[r18]
            r19 = r20[r19]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r11[r21] = r12
            int r12 = r21 + 1
            goto L46
        L64:
            r5[r7] = r11
            r7 = r10
            r9 = r13
            r2 = 3
            goto L13
        L6a:
            r0.F = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk5.<init>(int[], float[], float[][]):void");
    }

    public /* synthetic */ tk5(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    public tk5(int i) {
        phb phbVar;
        this.E = i;
        switch (i) {
            case 4:
                this.F = new AtomicInteger(0);
                break;
            case 9:
                this.F = new CopyOnWriteArraySet();
                break;
            case 11:
                this.F = new n78(27);
                break;
            case 12:
                this.F = new keg(mwa.b);
                break;
            case 14:
                this.F = null;
                break;
            case 24:
                this.F = mpk.P(Boolean.FALSE);
                break;
            default:
                Class cls = az.a;
                try {
                    phbVar = (phb) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    phbVar = H;
                }
                phb[] phbVarArr = {d28.b, phbVar};
                fqa fqaVar = new fqa();
                fqaVar.a = phbVarArr;
                Charset charset = w89.a;
                this.F = fqaVar;
                break;
        }
    }

    public tk5(long[] jArr) {
        dvb dvbVar;
        this.E = 27;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            dvbVar = new dvb(jArrCopyOf.length);
            int i = dvbVar.b;
            if (i >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i;
                    long[] jArr2 = dvbVar.a;
                    if (jArr2.length < length) {
                        dvbVar.a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = dvbVar.a;
                    int i2 = dvbVar.b;
                    if (i != i2) {
                        mp0.t0(jArr3, jArr3, jArrCopyOf.length + i, i, i2);
                    }
                    mp0.t0(jArrCopyOf, jArr3, i, 0, jArrCopyOf.length);
                    dvbVar.b += jArrCopyOf.length;
                }
            } else {
                gtk.h("");
                throw null;
            }
        } else {
            dvbVar = new dvb();
        }
        this.F = dvbVar;
    }

    public tk5(alj aljVar) {
        this.E = 28;
        this.F = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aljVar);
    }
}
