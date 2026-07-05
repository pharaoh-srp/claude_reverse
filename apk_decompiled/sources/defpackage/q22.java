package defpackage;

import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.net.Uri;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q22 {
    public static final vve a = xve.b(12.0f);
    public static final float b = 20.0f;
    public static final float c = 8.0f;

    public static final void a(int i, ld4 ld4Var, bz7 bz7Var, iqb iqbVar, List list) {
        list.getClass();
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1726270918);
        int i2 = (e18Var.f(list) ? 4 : 2) | i | (e18Var.h(bz7Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(c, true, new sz6(1));
            iqb iqbVarN = gb9.N(mpk.b0(iqbVar, mpk.Y(e18Var), false), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarN);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            e18Var.a0(291465206);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                o32 o32Var = (o32) it.next();
                e18Var.X(1075258215, o32Var.a);
                boolean zF = ((i2 & 112) == 32) | e18Var.f(o32Var);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = new ik1(bz7Var, 6, o32Var);
                    e18Var.k0(objN);
                }
                b(o32Var, (zy7) objN, null, e18Var, 0);
                e18Var.p(false);
            }
            e18Var.p(false);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new p22(list, bz7Var, iqbVar, i, 0);
        }
    }

    public static final void b(o32 o32Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        long j;
        String str;
        boolean z;
        boolean z2;
        xo1 xo1Var;
        String str2;
        wo8 wo8Var;
        o32 o32Var2;
        lz1 lz1Var;
        iqb iqbVarA;
        z80 z80Var;
        z80 z80Var2;
        bx bxVar;
        z80 z80Var3;
        re4 re4Var;
        fqb fqbVar;
        lz1 lz1Var2;
        e18 e18Var;
        boolean z3;
        String str3;
        boolean z4;
        int i2;
        int i3;
        fqb fqbVar2;
        int i4;
        Long l;
        lsc lscVar = o32Var.f;
        Uri uri = o32Var.b;
        lsc lscVar2 = o32Var.c;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-935382351);
        int i5 = i | (e18Var2.f(o32Var) ? 4 : 2) | (e18Var2.h(zy7Var) ? 32 : 16) | 384;
        if (e18Var2.Q(i5 & 1, (i5 & 147) != 146)) {
            boolean zF = e18Var2.f(uri);
            Object objN = e18Var2.N();
            lz1 lz1Var3 = jd4.a;
            if (zF || objN == lz1Var3) {
                objN = mpk.P(Boolean.FALSE);
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            boolean z5 = (((Boolean) o32Var.d.getValue()).booleanValue() || o32Var.b()) && !((Boolean) nwbVar.getValue()).booleanValue();
            String strK0 = null;
            if (!o32Var.b() || (l = (Long) lscVar.getValue()) == null) {
                j = 1;
                str = null;
            } else {
                long jLongValue = (l.longValue() + 500) / 1000;
                if (jLongValue < 1) {
                    jLongValue = 1;
                }
                long j2 = jLongValue / 3600;
                long j3 = (jLongValue % 3600) / 60;
                long j4 = jLongValue % 60;
                if (j2 > 0) {
                    j = 1;
                    str = String.format(Locale.ROOT, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)}, 3));
                } else {
                    j = 1;
                    str = String.format(Locale.ROOT, "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, 2));
                }
            }
            boolean z6 = (o32Var.a() instanceof k32) || (o32Var.a() instanceof l32);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            fqb fqbVar3 = fqb.E;
            iqb iqbVarE = kxk.E(e18Var2, fqbVar3);
            dd4.e.getClass();
            re4 re4Var2 = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var2);
            } else {
                e18Var2.n0();
            }
            z80 z80Var4 = cd4.f;
            d4c.i0(e18Var2, z80Var4, o5bVarD);
            z80 z80Var5 = cd4.e;
            d4c.i0(e18Var2, z80Var5, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var6 = cd4.g;
            d4c.i0(e18Var2, z80Var6, numValueOf);
            bx bxVar2 = cd4.h;
            d4c.h0(e18Var2, bxVar2);
            z80 z80Var7 = cd4.d;
            d4c.i0(e18Var2, z80Var7, iqbVarE);
            xo1 xo1Var2 = lja.K;
            iqb iqbVarO = b.o(fqbVar3, 64.0f);
            vve vveVar = a;
            iqb iqbVarV = xn5.V(iqbVarO, vveVar);
            String str4 = str;
            long j5 = gm3.a(e18Var2).q;
            wo8 wo8Var2 = zni.b;
            iqb iqbVarT = ez1.t(yfd.p(iqbVarV, j5, wo8Var2), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var2).u, vveVar);
            o5b o5bVarD2 = dw1.d(xo1Var2, false);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, iqbVarT);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var2);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var4, o5bVarD2);
            d4c.i0(e18Var2, z80Var5, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var6, e18Var2, bxVar2);
            d4c.i0(e18Var2, z80Var7, iqbVarE2);
            Long l2 = (Long) lscVar.getValue();
            if (o32Var.b() && l2 != null) {
                e18Var2.a0(1172881916);
                String str5 = (String) lscVar2.getValue();
                long jLongValue2 = (l2.longValue() + 500) / 1000;
                if (jLongValue2 >= j) {
                    j = jLongValue2;
                }
                long j6 = j / 3600;
                long j7 = (j % 3600) / 60;
                long j8 = j % 60;
                d8a d8aVarE = x44.E();
                int i6 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
                if (i6 > 0) {
                    i4 = i6;
                    d8aVarE.add(new Measure(Long.valueOf(j6), MeasureUnit.HOUR));
                } else {
                    i4 = i6;
                }
                if (i4 > 0 || j7 > 0) {
                    d8aVarE.add(new Measure(Long.valueOf(j7), MeasureUnit.MINUTE));
                }
                d8aVarE.add(new Measure(Long.valueOf(j8), MeasureUnit.SECOND));
                d8a d8aVarV = x44.v(d8aVarE);
                MeasureFormat measureFormat = MeasureFormat.getInstance(Locale.getDefault(), MeasureFormat.FormatWidth.WIDE);
                Measure[] measureArr = (Measure[]) d8aVarV.toArray(new Measure[0]);
                String measures = measureFormat.formatMeasures((Measure[]) Arrays.copyOf(measureArr, measureArr.length));
                measures.getClass();
                strK0 = d4c.k0(R.string.ccr_video_attachment_a11y, new Object[]{str5, measures}, e18Var2);
                e18Var2.p(false);
                z = false;
            } else if (o32Var.b()) {
                e18Var2.a0(1172886700);
                strK0 = d4c.k0(R.string.ccr_video_attachment_a11y_no_duration, new Object[]{(String) lscVar2.getValue()}, e18Var2);
                z = false;
                e18Var2.p(false);
            } else {
                z = false;
                e18Var2.a0(1999850176);
                e18Var2.p(false);
            }
            String str6 = strK0;
            if (z5) {
                e18Var2.a0(1999928204);
                if (str6 == null) {
                    str6 = (String) lscVar2.getValue();
                }
                String str7 = str6;
                FillElement fillElement = b.c;
                boolean zF2 = ((i5 & 14) == 4 ? true : z) | e18Var2.f(nwbVar);
                Object objN2 = e18Var2.N();
                if (zF2 || objN2 == lz1Var3) {
                    o32Var2 = o32Var;
                    objN2 = new l0(o32Var2, 24, nwbVar);
                    e18Var2.k0(objN2);
                } else {
                    o32Var2 = o32Var;
                }
                xo1Var = xo1Var2;
                wo8Var = wo8Var2;
                z2 = false;
                nuk.d(uri, str7, fillElement, null, null, null, null, (bz7) objN2, null, ho4.a, MTTypesetterKt.kLineSkipLimitMultiplier, 0, false, e18Var2, 384, 48, 62968);
                e18Var = e18Var2;
                e18Var.p(false);
                re4Var = re4Var2;
                str2 = str4;
                fqbVar = fqbVar3;
                z80Var3 = z80Var4;
                z80Var = z80Var5;
                z80Var2 = z80Var6;
                bxVar = bxVar2;
                lz1Var2 = lz1Var3;
                z3 = true;
            } else {
                z2 = z;
                xo1Var = xo1Var2;
                str2 = str4;
                wo8Var = wo8Var2;
                o32Var2 = o32Var;
                e18Var2.a0(2000431303);
                vo1 vo1Var = lja.T;
                ho0 ho0Var = new ho0(4.0f, z2, new do0(z2 ? 1 : 0, lja.Q));
                iqb iqbVarJ = gb9.J(fqbVar3, 6.0f);
                if (str6 != null) {
                    e18Var2.a0(2000834334);
                    boolean zF3 = e18Var2.f(str6);
                    Object objN3 = e18Var2.N();
                    lz1Var = lz1Var3;
                    if (zF3 || objN3 == lz1Var) {
                        objN3 = new o8(str6, 21);
                        e18Var2.k0(objN3);
                    }
                    iqbVarA = tjf.a(fqbVar3, (bz7) objN3);
                    e18Var2.p(z2);
                } else {
                    lz1Var = lz1Var3;
                    e18Var2.a0(2000972253);
                    e18Var2.p(z2);
                    iqbVarA = fqbVar3;
                }
                iqb iqbVarB = iqbVarJ.B(iqbVarA);
                q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var2, 54);
                int iHashCode3 = Long.hashCode(e18Var2.T);
                hyc hycVarL3 = e18Var2.l();
                iqb iqbVarE3 = kxk.E(e18Var2, iqbVarB);
                e18Var2.e0();
                if (e18Var2.S) {
                    e18Var2.k(re4Var2);
                } else {
                    e18Var2.n0();
                }
                d4c.i0(e18Var2, z80Var4, q64VarA);
                d4c.i0(e18Var2, z80Var5, hycVarL3);
                ij0.t(iHashCode3, e18Var2, z80Var6, e18Var2, bxVar2);
                d4c.i0(e18Var2, z80Var7, iqbVarE3);
                z80Var = z80Var5;
                z80Var2 = z80Var6;
                bxVar = bxVar2;
                z80Var3 = z80Var4;
                cv8.b(u00.D(uaj.a((String) lscVar2.getValue()), z2 ? 1 : 0, e18Var2), null, b.o(fqbVar3, 24.0f), d54.h, e18Var2, 3512, 0);
                re4Var = re4Var2;
                fqbVar = fqbVar3;
                lz1Var2 = lz1Var;
                tjh.b((String) lscVar2.getValue(), null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var2).e.E).k, e18Var2, 0, 24960, 110586);
                e18Var = e18Var2;
                z3 = true;
                e18Var.p(true);
                e18Var.p(z2);
            }
            n32 n32VarA = o32Var2.a();
            if (x44.r(n32VarA, m32.a)) {
                e18Var.a0(2001839261);
                iqb iqbVarP = yfd.p(b.c, d54.b(0.6f, gm3.a(e18Var).n), wo8Var);
                o5b o5bVarD3 = dw1.d(xo1Var, z2);
                int iHashCode4 = Long.hashCode(e18Var.T);
                hyc hycVarL4 = e18Var.l();
                iqb iqbVarE4 = kxk.E(e18Var, iqbVarP);
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, z80Var3, o5bVarD3);
                d4c.i0(e18Var, z80Var, hycVarL4);
                ij0.t(iHashCode4, e18Var, z80Var2, e18Var, bxVar);
                d4c.i0(e18Var, z80Var7, iqbVarE4);
                fqb fqbVar4 = fqbVar;
                e18 e18Var3 = e18Var;
                tjd.a(b.o(fqbVar4, 20.0f), gm3.a(e18Var).N, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var3, 390, 56);
                e18Var = e18Var3;
                e18Var.p(z3);
                e18Var.p(z2);
                fqbVar2 = fqbVar4;
                str3 = str2;
            } else {
                xo1 xo1Var3 = xo1Var;
                wo8 wo8Var3 = wo8Var;
                z80 z80Var8 = z80Var;
                z80 z80Var9 = z80Var2;
                bx bxVar3 = bxVar;
                re4 re4Var3 = re4Var;
                fqb fqbVar5 = fqbVar;
                boolean zR = x44.r(n32VarA, k32.a);
                l32 l32Var = l32.a;
                if (zR || x44.r(n32VarA, l32Var)) {
                    e18Var.a0(2002450488);
                    str3 = str2;
                    iqb iqbVarP2 = yfd.p(b.c, d54.b(0.7f, gm3.a(e18Var).n), wo8Var3);
                    o5b o5bVarD4 = dw1.d(xo1Var3, false);
                    int iHashCode5 = Long.hashCode(e18Var.T);
                    hyc hycVarL5 = e18Var.l();
                    iqb iqbVarE5 = kxk.E(e18Var, iqbVarP2);
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var3);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, z80Var3, o5bVarD4);
                    d4c.i0(e18Var, z80Var8, hycVarL5);
                    ij0.t(iHashCode5, e18Var, z80Var9, e18Var, bxVar3);
                    d4c.i0(e18Var, z80Var7, iqbVarE5);
                    if (x44.r(o32Var2.a(), l32Var)) {
                        i2 = -953611311;
                        i3 = R.string.ccr_upload_too_large;
                        z4 = false;
                    } else {
                        z4 = false;
                        i2 = -953608818;
                        i3 = R.string.ccr_upload_failed;
                    }
                    fqbVar2 = fqbVar5;
                    cv8.b(a.a(ud0.K1, e18Var), vb7.n(e18Var, i2, i3, e18Var, z4), b.o(fqbVar2, 20.0f), gm3.a(e18Var).y, e18Var, 392, 0);
                    e18Var.p(true);
                    e18Var.p(z4);
                } else {
                    if (!(n32VarA instanceof j32)) {
                        throw ebh.u(e18Var, 1172952762, z2);
                    }
                    e18Var.a0(1173000705);
                    e18Var.p(z2);
                    str3 = str2;
                    fqbVar2 = fqbVar5;
                }
            }
            nw1 nw1Var = nw1.a;
            if (!z5 || str3 == null || z6) {
                e18Var.a0(2003856741);
                e18Var.p(false);
            } else {
                e18Var.a0(2003580934);
                iqb iqbVarJ2 = gb9.J(nw1Var.a(fqbVar2, lja.M), 4.0f);
                Object objN4 = e18Var.N();
                if (objN4 == lz1Var2) {
                    objN4 = new zv(28);
                    e18Var.k0(objN4);
                }
                c(str3, tjf.a(iqbVarJ2, (bz7) objN4), e18Var, 0);
                e18Var.p(false);
            }
            e18Var.p(true);
            e18 e18Var4 = e18Var;
            ez1.d(zy7Var, b.o(gb9.J(nw1Var.a(fqbVar2, lja.I), 4.0f), b), false, null, vz8.E(gm3.a(e18Var).M, gm3.a(e18Var).n, e18Var4, 24576), xvj.a, e18Var4, ((i5 >> 3) & 14) | 1572864, 44);
            e18Var2 = e18Var4;
            e18Var2.p(true);
            iqbVar2 = fqbVar2;
        } else {
            e18Var2.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var2.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m6(i, 19, o32Var, zy7Var, iqbVar2, false);
        }
    }

    public static final void c(String str, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(262771362);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(iqbVar) ? 32 : 16);
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var = e18Var2;
            tjh.b(str, gb9.K(yfd.p(xn5.V(iqbVar, xve.b(4.0f)), d54.b(0.9f, gm3.a(e18Var2).n), zni.b), 4.0f, 1.0f), gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((jm3) gm3.c(e18Var2).e.E).k, e18Var, i2 & 14, 24576, 114680);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar, i, 3);
        }
    }
}
