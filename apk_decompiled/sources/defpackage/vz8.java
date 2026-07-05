package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.types.strings.ProjectId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocket;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class vz8 implements lfh, ia4, jjk, cw5, go0, jo0, sac, fi5, twb, i5c, oid, w3g, fdg {
    public static final vz8 F = new vz8(1);
    public static final vz8 G = new vz8(2);
    public static final vz8 H = new vz8(3);
    public static final vz8 I = new vz8(6);
    public static final vz8 J = new vz8(7);
    public static final vz8 K = new vz8(8);
    public static final vz8 L = new vz8(9);
    public static final wdj M = new wdj();
    public static final vz8 N = new vz8(11);
    public final /* synthetic */ int E;

    public /* synthetic */ vz8(int i) {
        this.E = i;
    }

    public static ffh A(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, nkh nkhVar, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, ld4 ld4Var, int i, int i2) {
        long j39 = (i & 1) != 0 ? d54.h : j;
        long j40 = (i & 2) != 0 ? d54.h : j2;
        long j41 = (i & 4) != 0 ? d54.h : j3;
        long j42 = (i & 8) != 0 ? d54.h : j4;
        long j43 = (i & 16) != 0 ? d54.h : j5;
        long j44 = (i & 32) != 0 ? d54.h : j6;
        long j45 = (i & 64) != 0 ? d54.h : j7;
        long j46 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? d54.h : j8;
        long j47 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? d54.h : j9;
        long j48 = (i & 512) != 0 ? d54.h : j10;
        nkh nkhVar2 = (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : nkhVar;
        long j49 = (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? d54.h : j11;
        long j50 = (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? d54.h : j12;
        long j51 = (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? d54.h : j13;
        long j52 = (i & 16384) != 0 ? d54.h : j14;
        long j53 = (32768 & i) != 0 ? d54.h : j15;
        long j54 = (65536 & i) != 0 ? d54.h : j16;
        long j55 = (131072 & i) != 0 ? d54.h : j17;
        long j56 = (262144 & i) != 0 ? d54.h : j18;
        long j57 = (524288 & i) != 0 ? d54.h : j19;
        long j58 = (1048576 & i) != 0 ? d54.h : j20;
        long j59 = (2097152 & i) != 0 ? d54.h : j21;
        long j60 = (4194304 & i) != 0 ? d54.h : j22;
        long j61 = (8388608 & i) != 0 ? d54.h : j23;
        long j62 = (16777216 & i) != 0 ? d54.h : j24;
        long j63 = (33554432 & i) != 0 ? d54.h : j25;
        long j64 = (67108864 & i) != 0 ? d54.h : j26;
        long j65 = (134217728 & i) != 0 ? d54.h : j27;
        long j66 = (268435456 & i) != 0 ? d54.h : j28;
        long j67 = (536870912 & i) != 0 ? d54.h : j29;
        long j68 = (i & 1073741824) != 0 ? d54.h : j30;
        long j69 = d54.h;
        e18 e18Var = (e18) ld4Var;
        return C(((gwa) e18Var.j(jwa.a)).a, (nkh) e18Var.j(okh.a)).b(j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, nkhVar2, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60, j61, j62, j63, j64, j65, j66, j67, j68, j69, j69, j69, j69, (i2 & 16) != 0 ? j69 : j31, (i2 & 32) != 0 ? j69 : j32, (i2 & 64) != 0 ? j69 : j33, (i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? j69 : j34, (i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? j69 : j35, (i2 & 512) != 0 ? j69 : j36, (i2 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? j69 : j37, (i2 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? j69 : j38);
    }

    public static wu8 B(n54 n54Var, long j) {
        wu8 wu8Var = n54Var.f0;
        if (wu8Var != null) {
            return wu8Var;
        }
        long j2 = d54.g;
        wu8 wu8Var2 = new wu8(j2, j, j2, d54.b(uwj.c, j));
        n54Var.f0 = wu8Var2;
        return wu8Var2;
    }

    public static ffh C(n54 n54Var, nkh nkhVar) {
        ffh ffhVar = n54Var.o0;
        if (ffhVar != null) {
            if (x44.r(ffhVar.k, nkhVar)) {
                return ffhVar;
            }
            ffh ffhVarB = ffhVar.b(ffhVar.a, ffhVar.b, ffhVar.c, ffhVar.d, ffhVar.e, ffhVar.f, ffhVar.g, ffhVar.h, ffhVar.i, ffhVar.j, nkhVar, ffhVar.l, ffhVar.m, ffhVar.n, ffhVar.o, ffhVar.p, ffhVar.q, ffhVar.r, ffhVar.s, ffhVar.t, ffhVar.u, ffhVar.v, ffhVar.w, ffhVar.x, ffhVar.y, ffhVar.z, ffhVar.A, ffhVar.B, ffhVar.C, ffhVar.D, ffhVar.E, ffhVar.F, ffhVar.G, ffhVar.H, ffhVar.I, ffhVar.J, ffhVar.K, ffhVar.L, ffhVar.M, ffhVar.N, ffhVar.O, ffhVar.P, ffhVar.Q);
            n54Var.o0 = ffhVarB;
            return ffhVarB;
        }
        long jC = p54.c(n54Var, yb5.E);
        long jC2 = p54.c(n54Var, yb5.J);
        o54 o54Var = yb5.m;
        long jC3 = p54.c(n54Var, o54Var);
        float f = yb5.n;
        long jB = d54.b(f, jC3);
        long jC4 = p54.c(n54Var, yb5.y);
        o54 o54Var2 = yb5.i;
        long jC5 = p54.c(n54Var, o54Var2);
        long jC6 = p54.c(n54Var, o54Var2);
        long jC7 = p54.c(n54Var, o54Var2);
        long jC8 = p54.c(n54Var, o54Var2);
        long jC9 = p54.c(n54Var, yb5.h);
        long jC10 = p54.c(n54Var, yb5.x);
        long jC11 = p54.c(n54Var, yb5.D);
        long jC12 = p54.c(n54Var, yb5.g);
        long jB2 = d54.b(yb5.l, p54.c(n54Var, yb5.k));
        long jC13 = p54.c(n54Var, yb5.w);
        long jC14 = p54.c(n54Var, yb5.G);
        long jC15 = p54.c(n54Var, yb5.O);
        long jB3 = d54.b(yb5.r, p54.c(n54Var, yb5.q));
        long jC16 = p54.c(n54Var, yb5.A);
        long jC17 = p54.c(n54Var, yb5.I);
        long jC18 = p54.c(n54Var, yb5.Q);
        long jB4 = d54.b(yb5.v, p54.c(n54Var, yb5.u));
        long jC19 = p54.c(n54Var, yb5.C);
        long jC20 = p54.c(n54Var, yb5.F);
        long jC21 = p54.c(n54Var, yb5.N);
        long jB5 = d54.b(yb5.p, p54.c(n54Var, yb5.o));
        long jC22 = p54.c(n54Var, yb5.z);
        o54 o54Var3 = yb5.K;
        long jC23 = p54.c(n54Var, o54Var3);
        long jC24 = p54.c(n54Var, o54Var3);
        long jB6 = d54.b(f, p54.c(n54Var, o54Var));
        long jC25 = p54.c(n54Var, o54Var3);
        long jC26 = p54.c(n54Var, yb5.H);
        long jC27 = p54.c(n54Var, yb5.P);
        long jB7 = d54.b(yb5.t, p54.c(n54Var, yb5.s));
        long jC28 = p54.c(n54Var, yb5.B);
        o54 o54Var4 = yb5.L;
        long jC29 = p54.c(n54Var, o54Var4);
        long jC30 = p54.c(n54Var, o54Var4);
        long jB8 = d54.b(f, p54.c(n54Var, o54Var4));
        long jC31 = p54.c(n54Var, o54Var4);
        o54 o54Var5 = yb5.M;
        ffh ffhVar2 = new ffh(jC, jC2, jB, jC4, jC5, jC6, jC7, jC8, jC9, jC10, nkhVar, jC11, jC12, jB2, jC13, jC14, jC15, jB3, jC16, jC17, jC18, jB4, jC19, jC20, jC21, jB5, jC22, jC23, jC24, jB6, jC25, jC26, jC27, jB7, jC28, jC29, jC30, jB8, jC31, p54.c(n54Var, o54Var5), p54.c(n54Var, o54Var5), d54.b(f, p54.c(n54Var, o54Var5)), p54.c(n54Var, o54Var5));
        n54Var.o0 = ffhVar2;
        return ffhVar2;
    }

    public static wu8 E(long j, long j2, ld4 ld4Var, int i) {
        wu8 wu8Var;
        long j3 = d54.h;
        n54 n54Var = ((gwa) ((e18) ld4Var).j(jwa.a)).a;
        wu8 wu8Var2 = n54Var.g0;
        if (wu8Var2 == null) {
            wu8 wu8Var3 = new wu8(p54.c(n54Var, kxk.e), p54.c(n54Var, kxk.j), d54.b(kxk.g, p54.c(n54Var, kxk.f)), d54.b(kxk.i, p54.c(n54Var, kxk.h)));
            n54Var.g0 = wu8Var3;
            wu8Var = wu8Var3;
        } else {
            wu8Var = wu8Var2;
        }
        return wu8Var.a(j, j2, j3, j3);
    }

    public static String F(ft2 ft2Var) {
        ft2Var.getClass();
        if (ft2Var.equals(ct2.a)) {
            return "RECENT";
        }
        if (ft2Var.equals(et2.a)) {
            return "STARRED";
        }
        if (ft2Var instanceof bt2) {
            return ij0.i("PROJECT:", ((bt2) ft2Var).b());
        }
        if (ft2Var.equals(dt2.a)) {
            sz6.j("Search is view-only and should not be persisted");
            return null;
        }
        mr9.b();
        return null;
    }

    public static wu8 G(long j, long j2, long j3, ld4 ld4Var, int i) {
        if ((i & 1) != 0) {
            j = d54.h;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = ((d54) ((e18) ld4Var).j(on4.a)).a;
        }
        long j5 = j2;
        e18 e18Var = (e18) ld4Var;
        return B(((gwa) e18Var.j(jwa.a)).a, ((d54) e18Var.j(on4.a)).a).a(j4, j5, d54.h, (i & 8) != 0 ? d54.b(uwj.c, j5) : j3);
    }

    public static LinkedHashMap J(LinkedHashMap linkedHashMap, h99 h99Var) {
        h99 h99Var2;
        h99Var.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            try {
                linkedHashMap2.put(entry.getKey(), M(entry.getValue()));
                h99Var2 = h99Var;
            } catch (Exception e) {
                h99Var2 = h99Var;
                dch.I(h99Var2, 5, x44.X(g99.E, g99.G), new rj5(entry, 2), e, 48);
            }
            h99Var = h99Var2;
        }
        return linkedHashMap2;
    }

    public static long K() {
        float f = xn5.d;
        return mpk.d(xn5.e + f + f, 40.0f);
    }

    public static ft2 L(String str) {
        str.getClass();
        if (str.equals("RECENT")) {
            return ct2.a;
        }
        if (str.equals("STARRED")) {
            return et2.a;
        }
        if (isg.q0(str, "PROJECT:", false)) {
            return new bt2(ProjectId.m1080constructorimpl(bsg.R0(str, "PROJECT:")));
        }
        throw new IllegalStateException("Unknown ChatIdListSource: ".concat(str).toString());
    }

    public static bh9 M(Object obj) {
        boolean zR = x44.r(obj, u00.d);
        oh9 oh9Var = oh9.E;
        if (zR || obj == null || obj.equals(oh9Var)) {
            return oh9Var;
        }
        if (obj instanceof Boolean) {
            return new vh9((Boolean) obj);
        }
        if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double)) {
            if (obj instanceof String) {
                return new vh9((String) obj);
            }
            if (obj instanceof Date) {
                return new vh9(Long.valueOf(((Date) obj).getTime()));
            }
            if (obj instanceof ig9) {
                return (bh9) obj;
            }
            if (obj instanceof Iterable) {
                ig9 ig9Var = new ig9();
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    ig9Var.o(M(it.next()));
                }
                return ig9Var;
            }
            if (obj instanceof Map) {
                qh9 qh9Var = new qh9();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    qh9Var.o(String.valueOf(entry.getKey()), M(entry.getValue()));
                }
                return qh9Var;
            }
            if (!(obj instanceof qh9) && !(obj instanceof vh9)) {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    qh9 qh9Var2 = new qh9();
                    Iterator<String> itKeys = jSONObject.keys();
                    itKeys.getClass();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        qh9Var2.o(next, M(jSONObject.get(next)));
                    }
                    return qh9Var2;
                }
                if (!(obj instanceof JSONArray)) {
                    return new vh9(obj.toString());
                }
                JSONArray jSONArray = (JSONArray) obj;
                ig9 ig9Var2 = new ig9();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    ig9Var2.o(M(jSONArray.get(i)));
                }
                return ig9Var2;
            }
            return (bh9) obj;
        }
        return new vh9((Number) obj);
    }

    public static ffh z(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        return C(((gwa) e18Var.j(jwa.a)).a, (nkh) e18Var.j(okh.a));
    }

    public String D(int i, Method method) {
        return "parameter #" + (i + 1);
    }

    public Object H(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean I(Method method) {
        return false;
    }

    @Override // defpackage.cw5
    public boolean a(SSLSocket sSLSocket) {
        return isg.q0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.twb
    public void b() {
    }

    @Override // defpackage.twb
    public void c(String str, String str2, Map map) {
        str.getClass();
    }

    @Override // defpackage.go0, defpackage.jo0
    public float d() {
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.jjk
    public glk e(Class cls) {
        if (!zdk.class.isAssignableFrom(cls)) {
            sz6.p("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (glk) zdk.m(cls.asSubclass(zdk.class)).j(3);
        } catch (Exception e) {
            xh6.f("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // defpackage.w3g
    public kp7 f(nvg nvgVar) {
        return new pj4(2, nvgVar);
    }

    @Override // defpackage.i5c
    public boolean g(hqb hqbVar) {
        return false;
    }

    @Override // defpackage.i5c
    public int h() {
        return 8;
    }

    @Override // defpackage.i5c
    public boolean i(hqb hqbVar) {
        return v40.E(fd9.r(yfd.W(hqbVar), false));
    }

    @Override // defpackage.go0
    public void j(cz5 cz5Var, int i, int[] iArr, fu9 fu9Var, int[] iArr2) {
        if (fu9Var == fu9.E) {
            ko0.c(i, iArr, iArr2, false);
        } else {
            ko0.c(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.lfh
    public void k(ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2101003086);
        int i2 = (e18Var.f(this) ? 32 : 16) | i;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            ta4Var.invoke(e18Var, 6);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kn(this, ta4Var, i, 11);
        }
    }

    @Override // defpackage.i5c
    public void l(av9 av9Var, long j, dn8 dn8Var, int i, boolean z) {
        g5c g5cVar = av9Var.k0;
        m5c m5cVar = (m5c) g5cVar.I;
        xre xreVar = m5c.t0;
        ((m5c) g5cVar.I).m1(m5c.x0, m5cVar.e1(j, true), dn8Var, 1, z);
    }

    @Override // defpackage.twb
    public void m(String str) {
    }

    @Override // defpackage.oid
    public void n(int i, Object obj) {
    }

    @Override // defpackage.i5c
    public boolean o(dn8 dn8Var, av9 av9Var) {
        return false;
    }

    @Override // defpackage.sac
    public Object o0() {
        return new ArrayList();
    }

    @Override // defpackage.i5c
    public boolean p(av9 av9Var) {
        qjf qjfVarI = av9Var.I();
        boolean z = false;
        if (qjfVarI != null && qjfVarI.H) {
            z = true;
        }
        return !z;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b A[RETURN] */
    @Override // defpackage.fdg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean q(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            zgh r4 = (defpackage.zgh) r4
            zgh r5 = (defpackage.zgh) r5
            r3 = 0
            r0 = 1
            if (r4 == 0) goto L2d
            if (r5 == 0) goto L2d
            i5i r1 = r4.a
            i5i r2 = r5.a
            if (r1 != r2) goto L3b
            tkh r1 = r4.b
            tkh r2 = r5.b
            boolean r1 = defpackage.x44.r(r1, r2)
            if (r1 == 0) goto L3b
            boolean r1 = r4.c
            boolean r2 = r5.c
            if (r1 != r2) goto L3b
            boolean r1 = r4.d
            boolean r2 = r5.d
            if (r1 != r2) goto L3b
            boolean r4 = r4.e
            boolean r5 = r5.e
            if (r4 != r5) goto L3b
            goto L3a
        L2d:
            if (r4 != 0) goto L31
            r4 = r0
            goto L32
        L31:
            r4 = r3
        L32:
            if (r5 != 0) goto L36
            r5 = r0
            goto L37
        L36:
            r5 = r3
        L37:
            r4 = r4 ^ r5
            if (r4 != 0) goto L3b
        L3a:
            return r0
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz8.q(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // defpackage.twb
    public xmi r() {
        return new xmi(null, 31);
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        Object objI = el5Var.i(new qzd(wb1.class, Executor.class));
        objI.getClass();
        return d4c.N((Executor) objI);
    }

    @Override // defpackage.cw5
    public xdg t(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                sz6.h(grc.s(cls, "No OpenSSLSocketImpl superclass of socket of type "));
                return null;
            }
        }
        return new v50(superclass);
    }

    public String toString() {
        switch (this.E) {
            case 13:
                return "Arrangement#SpaceEvenly";
            case 28:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.fi5
    public wki u(lj5 lj5Var, List list, byte[] bArr, ih1 ih1Var) {
        lj5Var.getClass();
        list.getClass();
        return uki.d;
    }

    @Override // defpackage.jo0
    public void v(cz5 cz5Var, int i, int[] iArr, int[] iArr2) {
        ko0.c(i, iArr, iArr2, false);
    }

    @Override // defpackage.jjk
    public boolean w(Class cls) {
        return zdk.class.isAssignableFrom(cls);
    }

    public void x(final boolean z, w79 w79Var, final ffh ffhVar, final e0g e0gVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-818661242);
        int i2 = i | (e18Var.g(z) ? 4 : 2) | (e18Var.g(false) ? 32 : 16) | (e18Var.f(w79Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(ffhVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.f(e0gVar) ? 131072 : 65536);
        if (e18Var.Q(i2 & 1, (38347923 & i2) != 38347922)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            boolean z2 = (i2 & 896) == 256;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z2 || objN == lz1Var) {
                objN = new qwb(w79Var);
                e18Var.k0(objN);
            }
            qwb qwbVar = (qwb) objN;
            final yig yigVarP = u00.P(asb.H, e18Var);
            boolean zH = ((i2 & 14) == 4) | ((((57344 & i2) ^ 24576) > 16384 && e18Var.f(ffhVar)) || (i2 & 24576) == 16384) | ((((458752 & i2) ^ 196608) > 131072 && e18Var.f(e0gVar)) || (i2 & 196608) == 131072) | ((i2 & 112) == 32) | e18Var.h(yigVarP);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new eug() { // from class: xfh
                    @Override // defpackage.eug
                    public final void a(jne jneVar) {
                        jneVar.H |= 6;
                        jneVar.m0 = e0gVar;
                        final ffh ffhVar2 = ffhVar;
                        final boolean z3 = z;
                        jneVar.b(ffhVar2.a(z3, false, false));
                        final yig yigVar = yigVarP;
                        fd9.U(jneVar, new eug() { // from class: yfh
                            @Override // defpackage.eug
                            public final void a(jne jneVar2) {
                                final ffh ffhVar3 = ffhVar2;
                                final boolean z4 = z3;
                                jneVar2.a(yigVar, new eug() { // from class: zfh
                                    @Override // defpackage.eug
                                    public final void a(jne jneVar3) {
                                        jneVar3.b(ffhVar3.a(z4, false, true));
                                    }
                                });
                            }
                        });
                    }
                };
                e18Var.k0(objN2);
            }
            eug eugVar = (eug) objN2;
            dw1.a((eugVar == dug.a ? fqb.E : new iug(qwbVar, eugVar).B(jug.E)).B(new i19(z, w79Var, ffhVar, e0gVar)), e18Var, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bv(this, z, w79Var, ffhVar, e0gVar, i);
        }
    }

    public void y(final String str, final pz7 pz7Var, final boolean z, final boolean z2, final pzi pziVar, final w79 w79Var, final pz7 pz7Var2, final pz7 pz7Var3, final pz7 pz7Var4, final pz7 pz7Var5, final e0g e0gVar, final ffh ffhVar, mnc mncVar, pz7 pz7Var6, ld4 ld4Var, final int i) {
        int i2;
        boolean z3;
        e18 e18Var;
        final mnc mncVar2;
        final pz7 pz7Var7;
        int i3;
        mnc qncVar;
        int i4;
        pz7 pz7VarQ0;
        int i5;
        ta4 ta4VarQ0;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1806980801);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(pz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i6 = i & 3072;
        int i7 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
        if (i6 == 0) {
            z3 = z2;
            i2 |= e18Var2.g(z3) ? 2048 : 1024;
        } else {
            z3 = z2;
        }
        int i8 = i & 24576;
        int i9 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        if (i8 == 0) {
            i2 |= e18Var2.f(pziVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.f(w79Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= e18Var2.g(false) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= e18Var2.h(pz7Var2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= e18Var2.h(pz7Var3) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= e18Var2.h(pz7Var4) ? 536870912 : 268435456;
        }
        int i10 = 100663296 | (e18Var2.h(pz7Var5) ? 4 : 2) | (e18Var2.h(null) ? 32 : 16) | (e18Var2.h(null) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.h(null)) {
            i7 = 2048;
        }
        int i11 = i10 | i7;
        if (e18Var2.f(e0gVar)) {
            i9 = 16384;
        }
        int i12 = i11 | i9 | (e18Var2.f(ffhVar) ? 131072 : 65536) | 13107200;
        if (e18Var2.Q(i2 & 1, ((i2 & 306783379) == 306783378 && (38347923 & i12) == 38347922) ? false : true)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                if (pz7Var2 == null) {
                    i3 = -3670017;
                    qncVar = new qnc(16.0f, 16.0f, 16.0f, 16.0f);
                } else {
                    i3 = -3670017;
                    qncVar = new qnc(16.0f, 8.0f, 16.0f, 8.0f);
                }
                i4 = i12 & i3;
                pz7VarQ0 = fd9.q0(417908150, new sq(z, w79Var, ffhVar, e0gVar, 20), e18Var2);
            } else {
                e18Var2.T();
                i4 = i12 & (-3670017);
                qncVar = mncVar;
                pz7VarQ0 = pz7Var6;
            }
            e18Var2.q();
            boolean z4 = ((i2 & 14) == 4) | ((i2 & 57344) == 16384);
            Object objN = e18Var2.N();
            if (z4 || objN == jd4.a) {
                objN = pziVar.a(new zb0(str));
                e18Var2.k0(objN);
            }
            String str2 = ((f5i) objN).a.F;
            wgh wghVar = new wgh();
            if (pz7Var2 == null) {
                e18Var2.a0(-1353147063);
                e18Var2.p(false);
                i5 = 57344;
                ta4VarQ0 = null;
            } else {
                e18Var2.a0(-1353147062);
                i5 = 57344;
                ta4VarQ0 = fd9.q0(1110058497, new ck1(9, pz7Var2), e18Var2);
                e18Var2.p(false);
            }
            int i13 = i2 >> 9;
            int i14 = i4 << 21;
            e18Var = e18Var2;
            mnc mncVar3 = qncVar;
            xn5.I(bjh.E, str2, pz7Var, wghVar, ta4VarQ0, pz7Var3, pz7Var4, pz7Var5, null, null, z3, z, false, w79Var, mncVar3, ffhVar, pz7VarQ0, e18Var, ((i2 << 3) & 896) | 6 | (i13 & 458752) | (i13 & 3670016) | (i14 & 29360128) | (i14 & 234881024) | (i14 & 1879048192), (i2 & 896) | ((i4 >> 9) & 14) | ((i2 >> 6) & 112) | (i13 & 7168) | ((i2 >> 3) & i5) | ((i4 << 3) & 3670016) | 12582912);
            mncVar2 = mncVar3;
            pz7Var7 = pz7VarQ0;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            mncVar2 = mncVar;
            pz7Var7 = pz7Var6;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: wfh
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i | 1);
                    this.E.y(str, pz7Var, z, z2, pziVar, w79Var, pz7Var2, pz7Var3, pz7Var4, pz7Var5, e0gVar, ffhVar, mncVar2, pz7Var7, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }
}
