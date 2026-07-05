package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.e;
import androidx.datastore.preferences.protobuf.f;
import com.anthropic.claude.tool.model.TimerCreateV0Input;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.h1;
import io.sentry.i4;
import io.sentry.p1;
import io.sentry.r1;
import io.sentry.s7;
import io.sentry.t4;
import io.sentry.t7;
import io.sentry.util.k;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class k2e implements xp3, ia4, cof, eqh, jo4, fe7, b1c, zr9, lp3 {
    public static final k2e F = new k2e(1);
    public static final k2e G = new k2e(2);
    public static final k2e H = new k2e(3);
    public static final k2e I = new k2e(4);
    public static final k2e J = new k2e(5);
    public static final k2e K = new k2e(6);
    public static final k2e L = new k2e(7);
    public static final k2e M = new k2e(9);
    public static final /* synthetic */ k2e N = new k2e(10);
    public static final /* synthetic */ k2e O = new k2e(11);
    public final /* synthetic */ int E;

    public k2e(crh crhVar) {
        this.E = 29;
    }

    public static /* synthetic */ void l(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final zf3 o(k2e k2eVar, String str) {
        zf3 zf3Var = new zf3(str);
        zf3.d.put(str, zf3Var);
        return zf3Var;
    }

    public static ffh p(int i, ld4 ld4Var) {
        return t(((gwa) ((e18) ld4Var).j(jwa.a)).a, ld4Var);
    }

    public static ffh q(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, ld4 ld4Var, int i) {
        long j21 = (i & 1) != 0 ? d54.h : j;
        long j22 = (i & 2) != 0 ? d54.h : j2;
        long j23 = d54.h;
        return t(((gwa) ((e18) ld4Var).j(jwa.a)).a, ld4Var).b(j21, j22, j23, j23, (i & 16) != 0 ? j23 : j3, (i & 32) != 0 ? j23 : j4, (i & 64) != 0 ? j23 : j5, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? j23 : j6, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? j23 : j7, (i & 512) != 0 ? j23 : j8, null, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? j23 : j9, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? j23 : j10, (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? j23 : j11, (i & 16384) != 0 ? j23 : j12, (32768 & i) != 0 ? j23 : j13, (65536 & i) != 0 ? j23 : j14, (131072 & i) != 0 ? j23 : j15, (262144 & i) != 0 ? j23 : j16, j23, j23, j23, j23, j23, j23, j23, j23, (134217728 & i) != 0 ? j23 : j17, (268435456 & i) != 0 ? j23 : j18, (536870912 & i) != 0 ? j23 : j19, (i & 1073741824) != 0 ? j23 : j20, j23, j23, j23, j23, j23, j23, j23, j23, j23, j23, j23, j23);
    }

    public static ffh t(n54 n54Var, ld4 ld4Var) {
        ffh ffhVarB = n54Var.n0;
        if (ffhVarB == null) {
            e18 e18Var = (e18) ld4Var;
            e18Var.a0(390452338);
            e18Var.p(false);
            ffhVarB = null;
        } else {
            e18 e18Var2 = (e18) ld4Var;
            e18Var2.a0(390452339);
            nkh nkhVar = (nkh) e18Var2.j(okh.a);
            if (!x44.r(ffhVarB.k, nkhVar)) {
                ffhVarB = ffhVarB.b(ffhVarB.a, ffhVarB.b, ffhVarB.c, ffhVarB.d, ffhVarB.e, ffhVarB.f, ffhVarB.g, ffhVarB.h, ffhVarB.i, ffhVarB.j, nkhVar, ffhVarB.l, ffhVarB.m, ffhVarB.n, ffhVarB.o, ffhVarB.p, ffhVarB.q, ffhVarB.r, ffhVarB.s, ffhVarB.t, ffhVarB.u, ffhVarB.v, ffhVarB.w, ffhVarB.x, ffhVarB.y, ffhVarB.z, ffhVarB.A, ffhVarB.B, ffhVarB.C, ffhVarB.D, ffhVarB.E, ffhVarB.F, ffhVarB.G, ffhVarB.H, ffhVarB.I, ffhVarB.J, ffhVarB.K, ffhVarB.L, ffhVarB.M, ffhVarB.N, ffhVarB.O, ffhVarB.P, ffhVarB.Q);
                n54Var.n0 = ffhVarB;
            }
            e18Var2.p(false);
        }
        if (ffhVarB != null) {
            e18 e18Var3 = (e18) ld4Var;
            e18Var3.a0(-1788515437);
            e18Var3.p(false);
            return ffhVarB;
        }
        e18 e18Var4 = (e18) ld4Var;
        e18Var4.a0(-1788321191);
        long jC = p54.c(n54Var, oq5.s);
        long jC2 = p54.c(n54Var, oq5.y);
        o54 o54Var = oq5.f;
        long jB = d54.b(0.38f, p54.c(n54Var, o54Var));
        long jC3 = p54.c(n54Var, oq5.m);
        long j = d54.g;
        long jC4 = p54.c(n54Var, oq5.d);
        long jC5 = p54.c(n54Var, oq5.l);
        nkh nkhVar2 = (nkh) e18Var4.j(okh.a);
        long jC6 = p54.c(n54Var, oq5.v);
        long jC7 = p54.c(n54Var, oq5.E);
        long jB2 = d54.b(0.12f, p54.c(n54Var, oq5.i));
        long jC8 = p54.c(n54Var, oq5.p);
        long jC9 = p54.c(n54Var, oq5.u);
        long jC10 = p54.c(n54Var, oq5.D);
        long jB3 = d54.b(0.38f, p54.c(n54Var, oq5.h));
        long jC11 = p54.c(n54Var, oq5.o);
        long jC12 = p54.c(n54Var, oq5.x);
        long jC13 = p54.c(n54Var, oq5.G);
        long jB4 = d54.b(0.38f, p54.c(n54Var, oq5.k));
        long jC14 = p54.c(n54Var, oq5.r);
        long jC15 = p54.c(n54Var, oq5.t);
        long jC16 = p54.c(n54Var, oq5.C);
        long jB5 = d54.b(0.38f, p54.c(n54Var, oq5.g));
        long jC17 = p54.c(n54Var, oq5.n);
        o54 o54Var2 = oq5.z;
        long jC18 = p54.c(n54Var, o54Var2);
        long jC19 = p54.c(n54Var, o54Var2);
        long jB6 = d54.b(0.38f, p54.c(n54Var, o54Var));
        long jC20 = p54.c(n54Var, o54Var2);
        long jC21 = p54.c(n54Var, oq5.w);
        long jC22 = p54.c(n54Var, oq5.F);
        long jB7 = d54.b(0.38f, p54.c(n54Var, oq5.j));
        long jC23 = p54.c(n54Var, oq5.q);
        o54 o54Var3 = oq5.A;
        long jC24 = p54.c(n54Var, o54Var3);
        long jC25 = p54.c(n54Var, o54Var3);
        long jB8 = d54.b(0.38f, p54.c(n54Var, o54Var3));
        long jC26 = p54.c(n54Var, o54Var3);
        o54 o54Var4 = oq5.B;
        ffh ffhVar = new ffh(jC, jC2, jB, jC3, j, j, j, j, jC4, jC5, nkhVar2, jC6, jC7, jB2, jC8, jC9, jC10, jB3, jC11, jC12, jC13, jB4, jC14, jC15, jC16, jB5, jC17, jC18, jC19, jB6, jC20, jC21, jC22, jB7, jC23, jC24, jC25, jB8, jC26, p54.c(n54Var, o54Var4), p54.c(n54Var, o54Var4), d54.b(0.38f, p54.c(n54Var, o54Var4)), p54.c(n54Var, o54Var4));
        n54Var.n0 = ffhVar;
        e18Var4.p(false);
        return ffhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.d08 u(java.lang.String r7, defpackage.ww7 r8) {
        /*
            r8.getClass()
            e08[] r0 = defpackage.e08.values()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        La:
            r4 = 0
            if (r3 >= r1) goto L23
            r5 = r0[r3]
            ww7 r6 = r5.E
            boolean r6 = defpackage.x44.r(r6, r8)
            if (r6 == 0) goto L20
            java.lang.String r6 = r5.F
            boolean r6 = defpackage.isg.q0(r7, r6, r2)
            if (r6 == 0) goto L20
            goto L24
        L20:
            int r3 = r3 + 1
            goto La
        L23:
            r5 = r4
        L24:
            if (r5 != 0) goto L27
            goto L62
        L27:
            java.lang.String r8 = r5.F
            int r8 = r8.length()
            java.lang.String r7 = r7.substring(r8)
            int r8 = r7.length()
            if (r8 != 0) goto L39
        L37:
            r7 = r4
            goto L56
        L39:
            int r8 = r7.length()
            r0 = r2
        L3e:
            if (r2 >= r8) goto L52
            char r1 = r7.charAt(r2)
            int r1 = r1 + (-48)
            if (r1 < 0) goto L37
            r3 = 10
            if (r1 >= r3) goto L37
            int r0 = r0 * 10
            int r0 = r0 + r1
            int r2 = r2 + 1
            goto L3e
        L52:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L56:
            if (r7 == 0) goto L62
            int r7 = r7.intValue()
            d08 r8 = new d08
            r8.<init>(r5, r7)
            return r8
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k2e.u(java.lang.String, ww7):d08");
    }

    public static p1 v(String str, String str2, p1 p1Var) {
        if (p1Var == null) {
            p1Var = (t4.d && k.a) ? t4.g().s() : t4.g().c();
        }
        if (p1Var != null) {
            return p1Var.B(str, str2);
        }
        t7 t7Var = new t7();
        t7Var.e = i4.ON;
        h1 h1VarG = t4.g();
        h1VarG.getClass();
        r1 r1VarT = h1VarG.t(new s7(str2, str), t7Var);
        r1VarT.getClass();
        return r1VarT;
    }

    @Override // defpackage.b1c
    public void a(Context context) {
    }

    @Override // defpackage.jo4
    public long b(long j, long j2) {
        float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        int i = m6f.a;
        return jFloatToRawIntBits;
    }

    @Override // defpackage.xp3
    public c69 c() {
        return d69.a.c();
    }

    @Override // defpackage.eqh
    public dqh d() {
        return new dqh(brb.a());
    }

    @Override // defpackage.cof
    public Object e() {
        return new yvb(true);
    }

    @Override // defpackage.cof
    public void f(Object obj, udi udiVar) {
        f fVarA;
        Map mapA = ((yvb) obj).a();
        bcd bcdVarO = dcd.o();
        for (Map.Entry entry : mapA.entrySet()) {
            xbd xbdVar = (xbd) entry.getKey();
            Object value = entry.getValue();
            String str = xbdVar.a;
            if (value instanceof Boolean) {
                gcd gcdVarE = hcd.E();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                gcdVarE.c();
                hcd.r((hcd) gcdVarE.F, zBooleanValue);
                fVarA = gcdVarE.a();
            } else if (value instanceof Float) {
                gcd gcdVarE2 = hcd.E();
                float fFloatValue = ((Number) value).floatValue();
                gcdVarE2.c();
                hcd.s((hcd) gcdVarE2.F, fFloatValue);
                fVarA = gcdVarE2.a();
            } else if (value instanceof Double) {
                gcd gcdVarE3 = hcd.E();
                double dDoubleValue = ((Number) value).doubleValue();
                gcdVarE3.c();
                hcd.p((hcd) gcdVarE3.F, dDoubleValue);
                fVarA = gcdVarE3.a();
            } else if (value instanceof Integer) {
                gcd gcdVarE4 = hcd.E();
                int iIntValue = ((Number) value).intValue();
                gcdVarE4.c();
                hcd.t((hcd) gcdVarE4.F, iIntValue);
                fVarA = gcdVarE4.a();
            } else if (value instanceof Long) {
                gcd gcdVarE5 = hcd.E();
                long jLongValue = ((Number) value).longValue();
                gcdVarE5.c();
                hcd.m((hcd) gcdVarE5.F, jLongValue);
                fVarA = gcdVarE5.a();
            } else if (value instanceof String) {
                gcd gcdVarE6 = hcd.E();
                gcdVarE6.c();
                hcd.n((hcd) gcdVarE6.F, (String) value);
                fVarA = gcdVarE6.a();
            } else if (value instanceof Set) {
                gcd gcdVarE7 = hcd.E();
                ecd ecdVarQ = fcd.q();
                ecdVarQ.f((Set) value);
                gcdVarE7.c();
                hcd.o((hcd) gcdVarE7.F, (fcd) ecdVarQ.a());
                fVarA = gcdVarE7.a();
            } else {
                if (!(value instanceof byte[])) {
                    sz6.j("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return;
                }
                gcd gcdVarE8 = hcd.E();
                byte[] bArr = (byte[]) value;
                i22 i22VarE = i22.e(bArr, 0, bArr.length);
                gcdVarE8.c();
                hcd.q((hcd) gcdVarE8.F, i22VarE);
                fVarA = gcdVarE8.a();
            }
            bcdVarO.getClass();
            bcdVarO.c();
            dcd.m((dcd) bcdVarO.F).put(str, (hcd) fVarA);
        }
        dcd dcdVar = (dcd) bcdVarO.a();
        int iA = dcdVar.a(null);
        Logger logger = e.f;
        if (iA > 4096) {
            iA = 4096;
        }
        e eVar = new e(udiVar, iA);
        dcdVar.l(eVar);
        if (eVar.d > 0) {
            eVar.k();
        }
    }

    @Override // defpackage.cof
    public Object g(FileInputStream fileInputStream) throws CorruptionException {
        byte[] bArr;
        try {
            dcd dcdVarP = dcd.p(fileInputStream);
            yvb yvbVar = new yvb(false);
            ybd[] ybdVarArr = (ybd[]) Arrays.copyOf(new ybd[0], 0);
            yvbVar.b();
            if (ybdVarArr.length > 0) {
                ybd ybdVar = ybdVarArr[0];
                throw null;
            }
            Map mapN = dcdVarP.n();
            mapN.getClass();
            for (Map.Entry entry : mapN.entrySet()) {
                String str = (String) entry.getKey();
                hcd hcdVar = (hcd) entry.getValue();
                str.getClass();
                hcdVar.getClass();
                int iD = hcdVar.D();
                switch (iD == 0 ? -1 : zbd.a[sq6.F(iD)]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null);
                    case 0:
                    default:
                        mr9.b();
                        return null;
                    case 1:
                        yvbVar.e(new xbd(str), Boolean.valueOf(hcdVar.u()));
                        break;
                    case 2:
                        yvbVar.e(new xbd(str), Float.valueOf(hcdVar.y()));
                        break;
                    case 3:
                        yvbVar.e(new xbd(str), Double.valueOf(hcdVar.x()));
                        break;
                    case 4:
                        yvbVar.e(new xbd(str), Integer.valueOf(hcdVar.z()));
                        break;
                    case 5:
                        yvbVar.e(new xbd(str), Long.valueOf(hcdVar.A()));
                        break;
                    case 6:
                        yvbVar.e(new xbd(str), hcdVar.B());
                        break;
                    case 7:
                        xbd xbdVar = new xbd(str);
                        q89 q89VarP = hcdVar.C().p();
                        q89VarP.getClass();
                        yvbVar.e(xbdVar, w44.t1(q89VarP));
                        break;
                    case 8:
                        xbd xbdVar2 = new xbd(str);
                        i22 i22VarV = hcdVar.v();
                        int size = i22VarV.size();
                        if (size == 0) {
                            bArr = w89.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            i22VarV.g(bArr2, size);
                            bArr = bArr2;
                        }
                        yvbVar.e(xbdVar2, bArr);
                        break;
                    case 9:
                        throw new CorruptionException("Value not set.", null);
                }
            }
            return new yvb(new LinkedHashMap(yvbVar.a()), true);
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Unable to parse preferences proto.", e);
        }
    }

    @Override // defpackage.ivd
    public Object get() {
        return new j3f(0, Executors.newSingleThreadExecutor());
    }

    @Override // defpackage.zr9
    public boolean h(u9i u9iVar, u9i u9iVar2) {
        if (u9iVar == null) {
            l(0);
            throw null;
        }
        if (u9iVar2 != null) {
            return u9iVar.equals(u9iVar2);
        }
        l(1);
        throw null;
    }

    @Override // defpackage.b1c
    public void i(Context context) {
        context.getClass();
    }

    @Override // defpackage.eqh
    public dqh j() {
        return new dqh(brb.a());
    }

    @Override // defpackage.b1c
    public a1c k() {
        return new a1c(0, null, null, null, null, null, null, 127);
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(final boolean r25, final boolean r26, final defpackage.w79 r27, defpackage.iqb r28, final defpackage.ffh r29, final defpackage.e0g r30, float r31, float r32, defpackage.ld4 r33, final int r34, final int r35) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k2e.m(boolean, boolean, w79, iqb, ffh, e0g, float, float, ld4, int, int):void");
    }

    public void n(final String str, final pz7 pz7Var, final boolean z, final boolean z2, final pzi pziVar, final w79 w79Var, final boolean z3, final pz7 pz7Var2, final pz7 pz7Var3, final pz7 pz7Var4, final pz7 pz7Var5, final pz7 pz7Var6, final pz7 pz7Var7, final ffh ffhVar, mnc mncVar, final ta4 ta4Var, ld4 ld4Var, final int i) {
        int i2;
        boolean z4;
        boolean z5;
        e18 e18Var;
        final mnc mncVar2;
        mnc qncVar;
        int i3;
        ta4 ta4VarQ0;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1732281618);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(pz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z4 = z;
            i2 |= e18Var2.g(z4) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            z4 = z;
        }
        int i4 = i & 3072;
        int i5 = FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
        if (i4 == 0) {
            z5 = z2;
            i2 |= e18Var2.g(z5) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            z5 = z2;
        }
        int i6 = i & 24576;
        int i7 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        if (i6 == 0) {
            i2 |= e18Var2.f(pziVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.f(w79Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= e18Var2.g(z3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
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
        int i8 = 14155776 | (e18Var2.h(pz7Var5) ? 4 : 2) | (e18Var2.h(pz7Var6) ? 32 : 16) | (e18Var2.h(null) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (!e18Var2.h(pz7Var7)) {
            i5 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i9 = i8 | i5;
        if (e18Var2.f(ffhVar)) {
            i7 = 16384;
        }
        int i10 = i9 | i7 | 65536;
        if (e18Var2.Q(i2 & 1, ((i2 & 306783379) == 306783378 && (i10 & 4793491) == 4793490) ? false : true)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                qncVar = new qnc(16.0f, 16.0f, 16.0f, 16.0f);
                i3 = i10 & (-458753);
            } else {
                e18Var2.T();
                i3 = i10 & (-458753);
                qncVar = mncVar;
            }
            e18Var2.q();
            int i11 = i3;
            boolean z6 = ((i2 & 57344) == 16384) | ((i2 & 14) == 4);
            Object objN = e18Var2.N();
            if (z6 || objN == jd4.a) {
                objN = pziVar.a(new zb0(str));
                e18Var2.k0(objN);
            }
            String str2 = ((f5i) objN).a.F;
            wgh wghVar = new wgh();
            if (pz7Var2 == null) {
                e18Var2.a0(1927042940);
                e18Var2.p(false);
                ta4VarQ0 = null;
            } else {
                e18Var2.a0(1927042941);
                ta4VarQ0 = fd9.q0(-1459717586, new pu2(1, pz7Var2), e18Var2);
                e18Var2.p(false);
            }
            int i12 = i2 >> 9;
            int i13 = i11 << 21;
            e18Var = e18Var2;
            bjh bjhVar = bjh.F;
            boolean z7 = z4;
            boolean z8 = z5;
            ta4 ta4Var2 = ta4VarQ0;
            xn5.I(bjhVar, str2, pz7Var, wghVar, ta4Var2, pz7Var3, pz7Var4, pz7Var5, pz7Var6, pz7Var7, z8, z7, z3, w79Var, qncVar, ffhVar, ta4Var, e18Var, ((i2 << 3) & 896) | 6 | (i12 & 458752) | (i12 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192), (i12 & 7168) | (i2 & 896) | ((i11 >> 9) & 14) | ((i2 >> 6) & 112) | ((i2 >> 3) & 57344) | ((i11 << 6) & 3670016) | 12582912);
            mncVar2 = qncVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            mncVar2 = mncVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: llc
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i | 1);
                    this.E.n(str, pz7Var, z, z2, pziVar, w79Var, z3, pz7Var2, pz7Var3, pz7Var4, pz7Var5, pz7Var6, pz7Var7, ffhVar, mncVar2, ta4Var, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public synchronized zf3 r(String str) {
        zf3 zf3Var;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = zf3.d;
            zf3Var = (zf3) linkedHashMap.get(str);
            if (zf3Var == null) {
                zf3Var = (zf3) linkedHashMap.get(isg.q0(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : isg.q0(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (zf3Var == null) {
                    zf3Var = new zf3(str);
                }
                linkedHashMap.put(str, zf3Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zf3Var;
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        switch (this.E) {
            case 3:
                Object objI = el5Var.i(new qzd(xr1.class, Executor.class));
                objI.getClass();
                return d4c.N((Executor) objI);
            case 10:
                ArrayList arrayList = new ArrayList(el5Var.d(qzd.a(xs9.class)));
                dgj.x("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, mt7.M);
                return new ffk((Context) el5Var.a(Context.class), (xs9) arrayList.get(0));
            default:
                return new dfe(el5Var.e(efk.class));
        }
    }

    public String toString() {
        switch (this.E) {
            case 9:
                int i = brb.F;
                return "TimeSource(System.nanoTime())";
            case 28:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.lp3
    public Object w(Context context, Object obj, String str, cxh cxhVar) {
        TimerCreateV0Input timerCreateV0Input = (TimerCreateV0Input) obj;
        Intent intent = new Intent("android.intent.action.SET_TIMER");
        intent.setFlags(268435456);
        intent.putExtra("android.intent.extra.alarm.LENGTH", timerCreateV0Input.getDuration_seconds());
        intent.putExtra("android.intent.extra.alarm.MESSAGE", timerCreateV0Input.getMessage());
        intent.putExtra("android.intent.extra.alarm.SKIP_UI", true);
        try {
            context.startActivity(intent);
            return pyk.E0("Timer was set on Android device.");
        } catch (Throwable unused) {
            return pyk.z0("Failed to set timer on device.");
        }
    }

    public /* synthetic */ k2e(int i) {
        this.E = i;
    }
}
