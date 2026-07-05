package defpackage;

import android.content.Context;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class svj {
    public static final ta4 a = new ta4(921602183, false, new ua4(22));
    public static final am4 b = new am4(17);

    public static final void a(ze0 ze0Var, zy7 zy7Var, iqb iqbVar, nn6 nn6Var, fk0 fk0Var, qi3 qi3Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        nn6 nn6Var2;
        fk0 fk0Var2;
        qi3 qi3Var2;
        fk0 fk0Var3;
        iqb iqbVar3;
        qi3 qi3Var3;
        int i2;
        nn6 nn6Var3;
        ze0Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(84354041);
        int i3 = i | (e18Var.h(ze0Var) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | 75136;
        if (e18Var.Q(i3 & 1, (74899 & i3) != 74898)) {
            e18Var.V();
            int i4 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarB = gr9.b(e18Var);
                boolean zH = e18Var.h(ze0Var) | e18Var.h(m7fVarB);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new f25(ze0Var, 9, m7fVarB);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                nn6 nn6Var4 = (nn6) fd9.r0(kceVar.b(nn6.class), oq5.B(kceVar.b(nn6.class)), (bz7) objN, e18Var);
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN2 = e18Var.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = m7fVarN.a(kceVar.b(fk0.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                fk0Var3 = (fk0) objN2;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN3 = e18Var.N();
                if (zF2 || objN3 == lz1Var) {
                    objN3 = m7fVarN2.a(kceVar.b(qi3.class), null, null);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                e18Var.p(false);
                iqbVar3 = fqb.E;
                qi3Var3 = (qi3) objN3;
                i2 = i3 & (-523265);
                nn6Var3 = nn6Var4;
            } else {
                e18Var.T();
                iqbVar3 = iqbVar;
                fk0Var3 = fk0Var;
                qi3Var3 = qi3Var;
                i2 = i3 & (-523265);
                nn6Var3 = nn6Var;
            }
            e18Var.q();
            boolean zH2 = e18Var.h(qi3Var3);
            Object objN4 = e18Var.N();
            if (zH2 || objN4 == lz1Var) {
                objN4 = new gw(qi3Var3, tp4Var, 14);
                e18Var.k0(objN4);
            }
            csg.g((bz7) objN4, e18Var, 0, 1);
            Context context = (Context) e18Var.j(w00.b);
            ze0 ze0VarO = nn6Var3.O();
            boolean zF3 = e18Var.f(nn6Var3) | e18Var.h(context);
            Object objN5 = e18Var.N();
            if (zF3 || objN5 == lz1Var) {
                objN5 = new u73(nn6Var3, context, tp4Var, 19);
                e18Var.k0(objN5);
            }
            fd9.i(e18Var, (pz7) objN5, ze0VarO);
            ssj.c("Select API Endpoint", zy7Var, iqbVar3, null, null, 0L, fd9.q0(1404916168, new xg4(nn6Var3, ze0Var, fk0Var3, 12), e18Var), e18Var, (i2 & 112) | 1573254, 56);
            iqbVar2 = iqbVar3;
            fk0Var2 = fk0Var3;
            qi3Var2 = qi3Var3;
            nn6Var2 = nn6Var3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            nn6Var2 = nn6Var;
            fk0Var2 = fk0Var;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ne(ze0Var, zy7Var, iqbVar2, nn6Var2, fk0Var2, qi3Var2, i);
        }
    }

    public static final int b(String str, String str2) {
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (lowerCase.equals(str)) {
            return 0;
        }
        return isg.q0(lowerCase, str, false) ? 1 : 2;
    }

    public static final m1c c(pqe pqeVar) {
        BufferedSource bufferedSourceG0;
        int i = pqeVar.H;
        long j = pqeVar.P;
        long j2 = pqeVar.Q;
        wg8 wg8Var = pqeVar.J;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = wg8Var.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                break;
            }
            cpc cpcVar = (cpc) f2Var.next();
            String str = (String) cpcVar.E;
            String str2 = (String) cpcVar.F;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }
        z0c z0cVar = new z0c(sta.q0(linkedHashMap));
        rqe rqeVar = pqeVar.K;
        return new m1c(i, j, j2, z0cVar, (rqeVar == null || (bufferedSourceG0 = rqeVar.G0()) == null) ? null : new afg(bufferedSourceG0), pqeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.kie d(defpackage.j1c r5, defpackage.vp4 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.a92
            if (r0 == 0) goto L13
            r0 = r6
            a92 r0 = (defpackage.a92) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            a92 r0 = new a92
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.E
            int r0 = r0.F
            r1 = 0
            if (r0 == 0) goto L42
            r5 = 1
            if (r0 != r5) goto L3c
            defpackage.sf5.h0(r6)
            okio.ByteString r6 = (okio.ByteString) r6
            if (r6 == 0) goto L37
            sie r5 = defpackage.tie.Companion
            r5.getClass()
            pie r5 = new pie
            r5.<init>(r1, r6)
            r6 = r1
            r0 = r6
            r2 = r0
            goto L57
        L37:
            r5 = r1
            r6 = r5
            r0 = r6
            r2 = r0
            goto L53
        L3c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r1
        L42:
            defpackage.sf5.h0(r6)
            jie r6 = new jie
            r6.<init>()
            java.lang.String r0 = r5.a
            r6.g(r0)
            java.lang.String r0 = r5.b
            r2 = r0
            r0 = r6
        L53:
            r4 = r6
            r6 = r5
            r5 = r1
            r1 = r4
        L57:
            r1.e(r2, r5)
            z0c r5 = r6.c
            gmf r6 = new gmf
            r1 = 16
            r6.<init>(r1)
            java.util.Map r5 = r5.a
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L6d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L89:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r6.u(r2, r3)
            goto L89
        L99:
            wg8 r5 = r6.v()
            r0.getClass()
            gmf r5 = r5.g()
            r0.c = r5
            kie r5 = new kie
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svj.d(j1c, vp4):kie");
    }

    public static final void e(vxi vxiVar, q28 q28Var, c4a c4aVar) {
        q28Var.getClass();
        c4aVar.getClass();
        l5f l5fVar = (l5f) vxiVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (l5fVar == null || l5fVar.G) {
            return;
        }
        l5fVar.c(q28Var, c4aVar);
        a4a a4aVarB = c4aVar.b();
        if (a4aVarB == a4a.F || a4aVarB.compareTo(a4a.H) >= 0) {
            q28Var.D();
        } else {
            c4aVar.a(new k2a(q28Var, c4aVar));
        }
    }

    public static byte[] f(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            sz6.p("The key length in bytes must be 32.");
            return null;
        }
        long jG = g(bArr, 0) & 67108863;
        int i = 3;
        long jG2 = (g(bArr, 3) >> 2) & 67108611;
        long jG3 = (g(bArr, 6) >> 4) & 67092735;
        long jG4 = (g(bArr, 9) >> 6) & 66076671;
        long jG5 = (g(bArr, 12) >> 8) & 1048575;
        long j = jG2 * 5;
        long j2 = jG3 * 5;
        long j3 = jG4 * 5;
        long j4 = jG5 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (i2 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jG6 = j9 + (g(bArr3, 0) & 67108863);
            long jG7 = j5 + ((g(bArr3, i) >> 2) & 67108863);
            long jG8 = j6 + ((g(bArr3, 6) >> 4) & 67108863);
            long jG9 = j7 + ((g(bArr3, 9) >> 6) & 67108863);
            long j10 = jG2;
            long jG10 = j8 + (((g(bArr3, 12) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j11 = (jG10 * j) + (jG9 * j2) + (jG8 * j3) + (jG7 * j4) + (jG6 * jG);
            long j12 = (jG10 * j2) + (jG9 * j3) + (jG8 * j4) + (jG7 * jG) + (jG6 * j10);
            long j13 = (jG10 * j3) + (jG9 * j4) + (jG8 * jG) + (jG7 * j10) + (jG6 * jG3);
            long j14 = (jG10 * j4) + (jG9 * jG) + (jG8 * j10) + (jG7 * jG3) + (jG6 * jG4);
            long j15 = jG9 * j10;
            long j16 = jG10 * jG;
            long j17 = j12 + (j11 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j16 + j15 + (jG8 * jG3) + (jG7 * jG4) + (jG6 * jG5) + (j19 >> 26);
            long j21 = j20 >> 26;
            j8 = j20 & 67108863;
            long j22 = (j21 * 5) + (j11 & 67108863);
            i2 += 16;
            j6 = j18 & 67108863;
            j7 = j19 & 67108863;
            j9 = j22 & 67108863;
            j5 = (j17 & 67108863) + (j22 >> 26);
            jG2 = j10;
            i = 3;
        }
        long j23 = j6 + (j5 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j7 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j8 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = ((j27 >> 26) * 5) + j9;
        long j30 = j29 >> 26;
        long j31 = j29 & 67108863;
        long j32 = (j5 & 67108863) + j30;
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = j32 + (j33 >> 26);
        long j36 = j24 + (j35 >> 26);
        long j37 = j26 + (j36 >> 26);
        long j38 = j37 & 67108863;
        long j39 = (j28 + (j37 >> 26)) - 67108864;
        long j40 = j39 >> 63;
        long j41 = j31 & j40;
        long j42 = j32 & j40;
        long j43 = j24 & j40;
        long j44 = j26 & j40;
        long j45 = j28 & j40;
        long j46 = ~j40;
        long j47 = j42 | (j35 & 67108863 & j46);
        long j48 = j43 | (j36 & 67108863 & j46);
        long j49 = j44 | (j38 & j46);
        long j50 = (j41 | (j34 & j46) | (j47 << 26)) & 4294967295L;
        long j51 = ((j47 >> 6) | (j48 << 20)) & 4294967295L;
        long j52 = ((j48 >> 12) | (j49 << 14)) & 4294967295L;
        long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & 4294967295L;
        long jG11 = g(bArr, 16) + j50;
        long j54 = jG11 & 4294967295L;
        long jG12 = g(bArr, 20) + j51 + (jG11 >> 32);
        long jG13 = g(bArr, 24) + j52 + (jG12 >> 32);
        long jG14 = (g(bArr, 28) + j53 + (jG13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        i(j54, 0, bArr4);
        i(jG12 & 4294967295L, 4, bArr4);
        i(jG13 & 4294967295L, 8, bArr4);
        i(jG14, 12, bArr4);
        return bArr4;
    }

    public static long g(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    public static final dui h(int i, int i2, ld4 ld4Var) {
        boolean z = true;
        boolean z2 = (i2 & 1) != 0;
        r8f r8fVar = hj6.Q;
        wg6 wg6Var = c0l.G;
        yig yigVarK = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 7);
        Object[] objArr = {Boolean.valueOf(z2), r8fVar, r8fVar, wg6Var, yigVarK};
        int i3 = (i & 14) ^ 6;
        boolean z3 = (i3 > 4 && ((e18) ld4Var).g(z2)) || (i & 6) == 4;
        e18 e18Var = (e18) ld4Var;
        boolean zF = z3 | e18Var.f(r8fVar) | e18Var.f(wg6Var) | e18Var.f(yigVarK);
        Object objN = e18Var.N();
        int i4 = 5;
        lz1 lz1Var = jd4.a;
        if (zF || objN == lz1Var) {
            objN = new y5f(new fk1(z2, r8fVar, r8fVar, wg6Var, yigVarK), new hzh(i4));
            e18Var.k0(objN);
        }
        x5f x5fVar = (x5f) objN;
        if ((i3 <= 4 || !e18Var.g(z2)) && (i & 6) != 4) {
            z = false;
        }
        boolean zH = e18Var.h(r8fVar) | z | e18Var.h(r8fVar) | e18Var.h(wg6Var) | e18Var.h(yigVarK);
        Object objN2 = e18Var.N();
        if (zH || objN2 == lz1Var) {
            objN2 = new vv(z2, yigVarK, i4);
            e18Var.k0(objN2);
        }
        return (dui) iuj.K(objArr, x5fVar, (zy7) objN2, e18Var, 0);
    }

    public static void i(long j, int i, byte[] bArr) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }
}
