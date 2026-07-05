package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class owj {
    public static final ta4 a = new ta4(-1773777026, false, new bb4(5));
    public static final x2h b = new x2h(2);

    public static final void a(ud0 ud0Var, boolean z, long j, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        long j2;
        long j3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-171159157);
        int i2 = i | (e18Var.f(ud0Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        int i3 = i2 | (e18Var.e(j) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            wlg wlgVarB = n80.b(z ? 1.2f : 1.0f, kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 7), "hold-target-scale", e18Var, 3120, 20);
            if (z) {
                e18Var.a0(-1275180517);
                e18Var.p(false);
                j2 = j;
            } else {
                e18Var.a0(-1275179216);
                j2 = gm3.a(e18Var).q;
                e18Var.p(false);
            }
            wlg wlgVarA = f8g.a(j2, kxk.J(), "hold-target-bg", e18Var, 432, 8);
            e18Var = e18Var;
            if (z) {
                e18Var.a0(-1275171947);
                j3 = gm3.a(e18Var).F;
            } else {
                e18Var.a0(-1275170830);
                j3 = gm3.a(e18Var).O;
            }
            e18Var.p(false);
            long j4 = j3;
            xo1 xo1Var = lja.K;
            fqb fqbVar = fqb.E;
            iqb iqbVarO = b.o(fqbVar, 32.0f);
            boolean zF = e18Var.f(wlgVarB);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new ek1(wlgVarB, 4);
                e18Var.k0(objN);
            }
            iqb iqbVarP = yfd.p(xn5.i0(iqbVarO, (bz7) objN), ((d54) wlgVarA.getValue()).a, xve.a);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new z1g(9);
                e18Var.k0(objN2);
            }
            iqb iqbVarA = tjf.a(iqbVarP, (bz7) objN2);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarA);
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
            d4c.i0(e18Var, cd4.d, iqbVarE);
            iqb iqbVarO2 = b.o(fqbVar, 20.0f);
            ud0 ud0Var2 = ud0.d;
            iv1.b(ud0Var, null, iqbVarO2, null, j4, e18Var, 432 | (i3 & 14), 8);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jhg(ud0Var, z, j, iqbVar2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r33, defpackage.iqb r34, long r35, defpackage.tkh r37, defpackage.mnc r38, defpackage.ld4 r39, final int r40, final int r41) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owj.b(java.lang.String, iqb, long, tkh, mnc, ld4, int, int):void");
    }

    public static final void c(String str, String str2, cj7 cj7Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        str.getClass();
        str2.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1876329461);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(str2) ? 32 : 16) | (e18Var.f(cj7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            lwj.j(cj7Var, null, "image", null, e18Var, ((i2 >> 6) & 14) | 432);
            r4g r4gVarS = gb9.S(u4g.G, null, null, zy7Var, e18Var, (i2 & 7168) | 6, 6);
            String strJ0 = d4c.j0(R.string.chat_image_preview_sheet_title, e18Var);
            ta4 ta4VarQ0 = fd9.q0(-463071082, new u22(r4gVarS, 13), e18Var);
            ta4 ta4VarQ02 = fd9.q0(6184645, new yr4(str, str2, 3), e18Var);
            iqbVar2 = fqb.E;
            auj.b(r4gVarS, strJ0, iqbVar2, null, false, null, a5g.F, null, null, ta4VarQ0, null, null, ta4VarQ02, e18Var, 819462536, 384, 3384);
            e18Var = e18Var;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new w4d(str, str2, cj7Var, zy7Var, iqbVar2, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.zy7 r20, final long r21, final long r23, defpackage.iqb r25, final defpackage.ta4 r26, defpackage.ld4 r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owj.d(zy7, long, long, iqb, ta4, ld4, int, int):void");
    }

    public static final void e(final ud0 ud0Var, final String str, final zy7 zy7Var, final long j, final long j2, iqb iqbVar, ld4 ld4Var, final int i) {
        e18 e18Var;
        final iqb iqbVar2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-262195206);
        int i2 = (e18Var2.f(ud0Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2 | (e18Var2.e(j) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.e(j2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | 196608;
        if (e18Var2.Q(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = i3 >> 6;
            fqb fqbVar = fqb.E;
            e18Var = e18Var2;
            d(zy7Var, j, j2, fqbVar, fd9.q0(219989750, new v55(ud0Var, str), e18Var2), e18Var, (i4 & 896) | (i4 & 14) | 24576 | (i4 & 112) | 3072, 0);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: ihg
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    owj.e(ud0Var, str, zy7Var, j, j2, iqbVar2, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:220:0x0406  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.bz7 r33, defpackage.wsg r34, defpackage.pz7 r35, defpackage.iqb r36, defpackage.sn8 r37, defpackage.phg r38, defpackage.pl3 r39, defpackage.ld4 r40, int r41, int r42) {
        /*
            Method dump skipped, instruction units count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owj.f(bz7, wsg, pz7, iqb, sn8, phg, pl3, ld4, int, int):void");
    }

    public static final yn0 g(yr9 yr9Var) {
        p9i p9iVar;
        yr9Var.getClass();
        if (yr9Var.k0() instanceof sn7) {
            yn0 yn0VarG = g(yb5.A(yr9Var));
            yn0 yn0VarG2 = g(yb5.S(yr9Var));
            return new yn0(nwk.h(yfd.z(yb5.A((yr9) yn0VarG.a), yb5.S((yr9) yn0VarG2.a)), yr9Var), nwk.h(yfd.z(yb5.A((yr9) yn0VarG.b), yb5.S((yr9) yn0VarG2.b)), yr9Var));
        }
        u9i u9iVarO = yr9Var.O();
        boolean z = true;
        if (yr9Var.O() instanceof ic2) {
            u9iVarO.getClass();
            vai vaiVarD = ((ic2) u9iVarO).d();
            yr9 yr9VarB = vaiVarD.b();
            yr9VarB.getClass();
            yr9 yr9VarI = fbi.i(yr9VarB, yr9Var.b0());
            yr9VarI.getClass();
            int iF = sq6.F(vaiVarD.a());
            if (iF == 1) {
                return new yn0(yr9VarI, jwk.x(yr9Var).n());
            }
            if (iF == 2) {
                yr9 yr9VarI2 = fbi.i(jwk.x(yr9Var).m(), yr9Var.b0());
                yr9VarI2.getClass();
                return new yn0(yr9VarI2, yr9VarI);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + vaiVarD);
        }
        if (yr9Var.H().isEmpty() || yr9Var.H().size() != u9iVarO.getParameters().size()) {
            return new yn0(yr9Var, yr9Var);
        }
        ArrayList<p9i> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listH = yr9Var.H();
        List parameters = u9iVarO.getParameters();
        parameters.getClass();
        for (cpc cpcVar : w44.v1(listH, parameters)) {
            vai vaiVar = (vai) cpcVar.E;
            qai qaiVar = (qai) cpcVar.F;
            qaiVar.getClass();
            int iZ = qaiVar.z();
            if (iZ == 0) {
                a.a(35);
                throw null;
            }
            if (vaiVar == null) {
                a.a(36);
                throw null;
            }
            a aVar = a.b;
            int iF2 = sq6.F(vaiVar.c() ? 3 : a.b(iZ, vaiVar.a()));
            if (iF2 == 0) {
                yr9 yr9VarB2 = vaiVar.b();
                yr9VarB2.getClass();
                yr9 yr9VarB3 = vaiVar.b();
                yr9VarB3.getClass();
                p9iVar = new p9i(qaiVar, yr9VarB2, yr9VarB3);
            } else if (iF2 == 1) {
                yr9 yr9VarB4 = vaiVar.b();
                yr9VarB4.getClass();
                p9iVar = new p9i(qaiVar, yr9VarB4, o06.e(qaiVar).n());
            } else {
                if (iF2 != 2) {
                    wg6.i();
                    return null;
                }
                j7g j7gVarM = o06.e(qaiVar).m();
                yr9 yr9VarB5 = vaiVar.b();
                yr9VarB5.getClass();
                p9iVar = new p9i(qaiVar, j7gVarM, yr9VarB5);
            }
            if (vaiVar.c()) {
                arrayList.add(p9iVar);
                arrayList2.add(p9iVar);
            } else {
                yn0 yn0VarG3 = g(p9iVar.b);
                yr9 yr9Var2 = (yr9) yn0VarG3.a;
                yr9 yr9Var3 = (yr9) yn0VarG3.b;
                yn0 yn0VarG4 = g(p9iVar.c);
                yr9 yr9Var4 = (yr9) yn0VarG4.a;
                yr9 yr9Var5 = (yr9) yn0VarG4.b;
                qai qaiVar2 = p9iVar.a;
                p9i p9iVar2 = new p9i(qaiVar2, yr9Var3, yr9Var4);
                p9i p9iVar3 = new p9i(qaiVar2, yr9Var2, yr9Var5);
                arrayList.add(p9iVar2);
                arrayList2.add(p9iVar3);
            }
        }
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            for (p9i p9iVar4 : arrayList) {
                p9iVar4.getClass();
                if (!as9.a.b(p9iVar4.b, p9iVar4.c)) {
                    break;
                }
            }
            z = false;
        }
        return new yn0(z ? jwk.x(yr9Var).m() : j(yr9Var, arrayList), j(yr9Var, arrayList2));
    }

    public static int h(String str) {
        for (int i : sq6.H(4)) {
            if (kgh.f(i).equals(str)) {
                return i;
            }
        }
        pmf.h("Array contains no element matching the predicate.");
        return 0;
    }

    public static is6 i(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("technology");
            String strM = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("carrier_name");
            return new is6(strM, bh9VarS2 != null ? bh9VarS2.m() : null);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Cellular", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Cellular", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Cellular", e3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.yr9 j(defpackage.yr9 r9, java.util.ArrayList r10) {
        /*
            java.util.List r0 = r9.H()
            r0.size()
            r10.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.x44.y(r10, r1)
            r0.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        L19:
            boolean r1 = r10.hasNext()
            r2 = 0
            if (r1 == 0) goto L96
            java.lang.Object r1 = r10.next()
            p9i r1 = (defpackage.p9i) r1
            r1.getClass()
            yr9 r3 = r1.c
            yr9 r4 = r1.b
            qai r1 = r1.a
            d3c r5 = defpackage.as9.a
            r5.b(r4, r3)
            boolean r5 = defpackage.x44.r(r4, r3)
            if (r5 != 0) goto L8d
            int r5 = r1.z()
            r6 = 2
            if (r5 != r6) goto L42
            goto L8d
        L42:
            boolean r5 = defpackage.or9.D(r4)
            r7 = 1
            r8 = 3
            if (r5 == 0) goto L5e
            int r5 = r1.z()
            if (r5 == r6) goto L5e
            wai r2 = new wai
            int r1 = r1.z()
            if (r8 != r1) goto L59
            goto L5a
        L59:
            r7 = r8
        L5a:
            r2.<init>(r7, r3)
            goto L92
        L5e:
            if (r3 == 0) goto L87
            boolean r2 = defpackage.or9.w(r3)
            if (r2 == 0) goto L79
            boolean r2 = r3.b0()
            if (r2 == 0) goto L79
            wai r2 = new wai
            int r1 = r1.z()
            if (r6 != r1) goto L75
            r6 = r7
        L75:
            r2.<init>(r6, r4)
            goto L92
        L79:
            wai r2 = new wai
            int r1 = r1.z()
            if (r8 != r1) goto L82
            goto L83
        L82:
            r7 = r8
        L83:
            r2.<init>(r7, r3)
            goto L92
        L87:
            r9 = 140(0x8c, float:1.96E-43)
            defpackage.or9.a(r9)
            throw r2
        L8d:
            wai r2 = new wai
            r2.<init>(r4)
        L92:
            r0.add(r2)
            goto L19
        L96:
            r10 = 6
            yr9 r9 = defpackage.dwk.i(r9, r0, r2, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owj.j(yr9, java.util.ArrayList):yr9");
    }
}
