package defpackage;

import android.content.Context;
import android.graphics.PathMeasure;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.connector.auth.b;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dqk {
    public static final ta4 E = new ta4(-1872668959, false, new tb4(17));

    public static final void a(zy7 zy7Var, bz7 bz7Var, zy7 zy7Var2, iqb iqbVar, kk4 kk4Var, qi3 qi3Var, pl3 pl3Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        kk4 kk4Var2;
        qi3 qi3Var2;
        pl3 pl3Var2;
        kk4 kk4Var3;
        pl3 pl3Var3;
        qi3 qi3Var3;
        int i2;
        iqb iqbVar3;
        nwb nwbVar;
        zy7Var.getClass();
        bz7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-7642220);
        int i3 = i | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 601088;
        if (e18Var.Q(i3 & 1, (599187 & i3) != 599186)) {
            e18Var.V();
            int i4 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarB = gr9.b(e18Var);
                boolean zH = e18Var.h(m7fVarB);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new di(m7fVarB, 10);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                kk4Var3 = (kk4) fd9.r0(kceVar.b(kk4.class), oq5.B(kceVar.b(kk4.class)), (bz7) objN, e18Var);
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN2 = e18Var.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = m7fVarN.a(kceVar.b(qi3.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3 qi3Var4 = (qi3) objN2;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN3 = e18Var.N();
                if (zF2 || objN3 == lz1Var) {
                    objN3 = m7fVarN2.a(kceVar.b(pl3.class), null, null);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                e18Var.p(false);
                pl3Var3 = (pl3) objN3;
                qi3Var3 = qi3Var4;
                i2 = i3 & (-4186113);
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                kk4Var3 = kk4Var;
                qi3Var3 = qi3Var;
                pl3Var3 = pl3Var;
                i2 = i3 & (-4186113);
                iqbVar3 = iqbVar;
            }
            e18Var.q();
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objN4;
            Context context = (Context) e18Var.j(w00.b);
            Object[] objArr = new Object[0];
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = new l84(15);
                e18Var.k0(objN5);
            }
            nwb nwbVar2 = (nwb) iuj.I(objArr, (zy7) objN5, e18Var, 48);
            boolean zH2 = e18Var.h(qi3Var3) | e18Var.h(kk4Var3);
            Object objN6 = e18Var.N();
            if (zH2 || objN6 == lz1Var) {
                objN6 = new dv(qi3Var3, kk4Var3, tp4Var, 6);
                e18Var.k0(objN6);
            }
            csg.g((bz7) objN6, e18Var, 0, 1);
            b bVar = kk4Var3.d;
            koi koiVar = kk4Var3.c;
            hi4 hi4VarR = ez1.R(bVar, kk4Var3.h, e18Var);
            nwb nwbVarU = mpk.u(hi4VarR.a.g, e18Var);
            Boolean boolValueOf = Boolean.valueOf(!koiVar.f().isEmpty());
            boolean zH3 = e18Var.h(kk4Var3);
            iqb iqbVar4 = iqbVar3;
            Object objN7 = e18Var.N();
            if (zH3 || objN7 == lz1Var) {
                nwbVar = nwbVar2;
                objN7 = new kk0(kk4Var3, null, 19);
                e18Var.k0(objN7);
            } else {
                nwbVar = nwbVar2;
            }
            fd9.i(e18Var, (pz7) objN7, boolValueOf);
            kk4 kk4Var4 = kk4Var3;
            int i5 = ((i2 << 3) & 112) | 1600896;
            qi3 qi3Var5 = qi3Var3;
            nwb nwbVar3 = nwbVar;
            ssj.c(d4c.j0(R.string.connectors_setting_title, e18Var), zy7Var, iqbVar4, fd9.q0(-354690427, new ii(kk4Var3, 23, zy7Var2), e18Var), fd9.q0(-779881250, new rn(ybgVar, 8), e18Var), 0L, fd9.q0(568416163, new yc2(kk4Var4, ybgVar, nwbVarU, bz7Var, hi4VarR, context, pl3Var3, nwbVar, 2), e18Var), e18Var, i5, 32);
            e18Var = e18Var;
            List listF = koiVar.f();
            String str = (String) nwbVar3.getValue();
            boolean zF3 = e18Var.f(nwbVar3);
            Object objN8 = e18Var.N();
            if (zF3 || objN8 == lz1Var) {
                objN8 = new vi4(4, nwbVar3);
                e18Var.k0(objN8);
            }
            aqk.a(listF, str, (zy7) objN8, "custom", e18Var, 0);
            qi3Var2 = qi3Var5;
            iqbVar2 = iqbVar4;
            kk4Var2 = kk4Var4;
            pl3Var2 = pl3Var3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            kk4Var2 = kk4Var;
            qi3Var2 = qi3Var;
            pl3Var2 = pl3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw(zy7Var, bz7Var, zy7Var2, iqbVar2, kk4Var2, qi3Var2, pl3Var2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.iqb r21, final defpackage.ka2 r22, final defpackage.zy7 r23, defpackage.ysa r24, final defpackage.gta r25, defpackage.tr5 r26, defpackage.zy7 r27, defpackage.mnc r28, final defpackage.ta4 r29, defpackage.ld4 r30, final int r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqk.b(iqb, ka2, zy7, ysa, gta, tr5, zy7, mnc, ta4, ld4, int, int, int):void");
    }

    public static final void c(mnc mncVar, String str, bz7 bz7Var, ld4 ld4Var, int i) {
        int i2;
        mncVar.getClass();
        str.getClass();
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1580829432);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(mncVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarF = tvk.f(gb9.I(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), mncVar));
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarF);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            ud0 ud0Var = ud0.V0;
            String strJ0 = d4c.j0(R.string.memory_pause_title, e18Var);
            String strJ02 = d4c.j0(R.string.memory_pause_description, e18Var);
            boolean zEquals = str.equals("pause");
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = new zb2(9, bz7Var);
                e18Var.k0(objN);
            }
            bqk.b(ud0Var, strJ0, strJ02, zEquals, (zy7) objN, androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), e18Var, 196608);
            ud0 ud0Var2 = ud0.i;
            String strJ03 = d4c.j0(R.string.memory_reset_title, e18Var);
            String strJ04 = d4c.j0(R.string.memory_reset_description, e18Var);
            boolean zEquals2 = str.equals("reset");
            boolean z2 = i3 == 256;
            Object objN2 = e18Var.N();
            if (z2 || objN2 == lz1Var) {
                objN2 = new zb2(10, bz7Var);
                e18Var.k0(objN2);
            }
            bqk.b(ud0Var2, strJ03, strJ04, zEquals2, (zy7) objN2, androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), e18Var, 196608);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(mncVar, i, str, bz7Var, 17);
        }
    }

    public static final e40 d() {
        return new e40(new PathMeasure());
    }

    public static bpe e(String str) {
        for (bpe bpeVar : bpe.values()) {
            if (x44.r(bpeVar.E.toString(), str)) {
                return bpeVar;
            }
        }
        pmf.h("Array contains no element matching the predicate.");
        return null;
    }

    public static final long f(yjh yjhVar, int i, boolean z, boolean z2) {
        qtb qtbVar = yjhVar.b;
        long j = yjhVar.c;
        int iD = qtbVar.d(i);
        if (iD >= qtbVar.f) {
            return 9205357640488583168L;
        }
        return (((long) Float.floatToRawIntBits(wd6.d0(yjhVar.e(i, yjhVar.a(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == yjhVar.i(i)), MTTypesetterKt.kLineSkipLimitMultiplier, (int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(wd6.d0(qtbVar.b(iD), MTTypesetterKt.kLineSkipLimitMultiplier, (int) (j & 4294967295L)))) & 4294967295L);
    }
}
