package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bte {
    public static final xe4 a = new xe4(new afe(18));
    public static final xe4 b = new xe4(bw.K);

    /* JADX WARN: Removed duplicated region for block: B:135:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1 A[PHI: r16
      0x00b1: PHI (r16v17 int) = (r16v0 int), (r16v6 int), (r16v7 int) binds: [B:57:0x00af, B:67:0x00cc, B:66:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.cte r21, defpackage.zb0 r22, defpackage.iqb r23, defpackage.bz7 r24, java.util.Map r25, defpackage.bz7 r26, defpackage.bz7 r27, defpackage.bz7 r28, defpackage.ld4 r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bte.a(cte, zb0, iqb, bz7, java.util.Map, bz7, bz7, bz7, ld4, int, int):void");
    }

    public static final void b(cte cteVar, zb0 zb0Var, iqb iqbVar, bz7 bz7Var, Map map, ld4 ld4Var, int i) {
        int i2;
        cpc cpcVar;
        cteVar.getClass();
        zb0Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(559740240);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(cteVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(zb0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.d(1) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.g(true) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.d(Integer.MAX_VALUE) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? e18Var.f(map) : e18Var.h(map) ? 8388608 : 4194304;
        }
        if (e18Var.Q(i2 & 1, (4793491 & i2) != 4793490)) {
            e18Var.a0(1039469618);
            long jD = e(cteVar, e18Var).d();
            if (jD == 16) {
                jD = d(cteVar, e18Var);
            }
            long j = jD;
            e18Var.p(false);
            tkh tkhVarB = tkh.b(e(cteVar, e18Var), j, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214);
            int length = zb0Var.F.length();
            int i3 = i2 >> 6;
            umg umgVar = oqg.a;
            iqbVar.getClass();
            bz7Var.getClass();
            e18Var.a0(1687138294);
            nqg nqgVar = (nqg) e18Var.j(oqg.a);
            if (nqgVar == null) {
                cpcVar = new cpc(iqbVar, bz7Var);
                e18Var.p(false);
            } else {
                Object objN = e18Var.N();
                lz1 lz1Var = jd4.a;
                if (objN == lz1Var) {
                    objN = zh4.a(1.0f);
                    e18Var.k0(objN);
                }
                a80 a80Var = (a80) objN;
                Integer numValueOf = Integer.valueOf(length);
                boolean zH = e18Var.h(a80Var) | e18Var.f(nqgVar);
                Object objN2 = e18Var.N();
                if (zH || objN2 == lz1Var) {
                    objN2 = new o6e(a80Var, nqgVar, null, 24);
                    e18Var.k0(objN2);
                }
                fd9.i(e18Var, (pz7) objN2, numValueOf);
                nb0 nb0Var = a80Var.c;
                Object objN3 = e18Var.N();
                if (objN3 == lz1Var) {
                    objN3 = mpk.P(lm6.E);
                    e18Var.k0(objN3);
                }
                nwb nwbVar = (nwb) objN3;
                boolean zF = e18Var.f(nqgVar) | e18Var.f(nb0Var);
                Object objN4 = e18Var.N();
                if (zF || objN4 == lz1Var) {
                    objN4 = new kgf(nqgVar, nb0Var, nwbVar);
                    e18Var.k0(objN4);
                }
                iqb iqbVarI0 = xn5.i0(iqbVar, (bz7) objN4);
                boolean zF2 = e18Var.f(nqgVar) | ((((i3 & 112) ^ 48) > 32 && e18Var.f(bz7Var)) || (i3 & 48) == 32);
                Object objN5 = e18Var.N();
                if (zF2 || objN5 == lz1Var) {
                    objN5 = new f2d(nqgVar, bz7Var, nwbVar, 16);
                    e18Var.k0(objN5);
                }
                cpcVar = new cpc(iqbVarI0, (bz7) objN5);
                e18Var.p(false);
            }
            mpk.a(zb0Var, (iqb) cpcVar.E, tkhVarB, (bz7) cpcVar.F, 1, true, Integer.MAX_VALUE, 0, map, e18Var, ((i2 >> 3) & 14) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | ((i2 << 3) & 234881024), 0, 1664);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk(cteVar, zb0Var, iqbVar, bz7Var, map, i);
        }
    }

    public static final void c(final cte cteVar, final String str, iqb iqbVar, bz7 bz7Var, int i, boolean z, int i2, ld4 ld4Var, final int i3) {
        int i4;
        String str2;
        final iqb iqbVar2;
        final bz7 bz7Var2;
        final int i5;
        final boolean z2;
        final int i6;
        cteVar.getClass();
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1456639868);
        if ((i3 & 6) == 0) {
            i4 = i3 | (e18Var.f(cteVar) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            str2 = str;
            i4 |= e18Var.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        int i7 = i4 | 1797504;
        if (e18Var.Q(i7 & 1, (599187 & i7) != 599186)) {
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new f7d(26);
                e18Var.k0(objN);
            }
            bz7 bz7Var3 = (bz7) objN;
            e18Var.a0(328434118);
            long jD = e(cteVar, e18Var).d();
            if (jD == 16) {
                jD = d(cteVar, e18Var);
            }
            long j = jD;
            e18Var.p(false);
            iqbVar2 = fqb.E;
            mpk.b(str2, iqbVar2, tkh.b(e(cteVar, e18Var), j, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), bz7Var3, 1, true, Integer.MAX_VALUE, 0, e18Var, ((i7 >> 3) & 126) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (i7 & 3670016), 896);
            bz7Var2 = bz7Var3;
            i5 = 1;
            z2 = true;
            i6 = Integer.MAX_VALUE;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            bz7Var2 = bz7Var;
            i5 = i;
            z2 = z;
            i6 = i2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: ate
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bte.c(cteVar, str, iqbVar2, bz7Var2, i5, z2, i6, (ld4) obj, x44.p0(i3 | 1));
                    return iei.a;
                }
            };
        }
    }

    public static final long d(cte cteVar, ld4 ld4Var) {
        cteVar.getClass();
        return ((d54) ((rte) ((e18) ld4Var).j(ste.a)).c.invoke(ld4Var, 0)).a;
    }

    public static final tkh e(cte cteVar, ld4 ld4Var) {
        cteVar.getClass();
        return (tkh) ((rte) ((e18) ld4Var).j(ste.a)).a.invoke(ld4Var, 0);
    }
}
