package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zp {
    public static final vve a = xve.b(10.0f);

    public static final void a(int i, final zy7 zy7Var, final bz7 bz7Var, rc8 rc8Var, ld4 ld4Var, int i2) {
        rc8 rc8Var2;
        int i3;
        rc8 rc8Var3;
        zy7Var.getClass();
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(775583524);
        int i4 = i2 | (e18Var.d(i) ? 4 : 2) | (e18Var.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | FreeTypeConstants.FT_LOAD_NO_RECURSE;
        final int i5 = 1;
        final int i6 = 0;
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            e18Var.V();
            int i7 = i2 & 1;
            lz1 lz1Var = jd4.a;
            if (i7 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(rc8.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                i3 = i4 & (-7169);
                rc8Var3 = (rc8) objN;
            } else {
                e18Var.T();
                i3 = i4 & (-7169);
                rc8Var3 = rc8Var;
            }
            e18Var.q();
            Context context = (Context) e18Var.j(w00.b);
            int max_per_message_upload_count = amk.c(rc8Var3).getMax_per_message_upload_count();
            final boolean z = i < max_per_message_upload_count;
            int i8 = i3 & 896;
            boolean zH = (i8 == 256) | e18Var.h(context);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new l6(context, bz7Var, zy7Var, 2);
                e18Var.k0(objN2);
            }
            final l4h l4hVarM = u00.M(e18Var, (bz7) objN2);
            int i9 = max_per_message_upload_count - i;
            if (i9 < 1) {
                i9 = 1;
            }
            boolean z2 = i8 == 256;
            Object objN3 = e18Var.N();
            if (z2 || objN3 == lz1Var) {
                objN3 = new bz7() { // from class: xp
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        int i10 = i6;
                        iei ieiVar = iei.a;
                        zy7 zy7Var2 = zy7Var;
                        bz7 bz7Var2 = bz7Var;
                        List list = (List) obj;
                        switch (i10) {
                            case 0:
                                list.getClass();
                                if (!list.isEmpty()) {
                                    bz7Var2.invoke(list);
                                }
                                zy7Var2.a();
                                break;
                            default:
                                list.getClass();
                                if (!list.isEmpty()) {
                                    bz7Var2.invoke(list);
                                }
                                zy7Var2.a();
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var.k0(objN3);
            }
            final q2d q2dVarI = uuj.i(i9, false, (bz7) objN3, e18Var, 0, 2);
            boolean z3 = i8 == 256;
            Object objN4 = e18Var.N();
            if (z3 || objN4 == lz1Var) {
                objN4 = new bz7() { // from class: xp
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        int i10 = i5;
                        iei ieiVar = iei.a;
                        zy7 zy7Var2 = zy7Var;
                        bz7 bz7Var2 = bz7Var;
                        List list = (List) obj;
                        switch (i10) {
                            case 0:
                                list.getClass();
                                if (!list.isEmpty()) {
                                    bz7Var2.invoke(list);
                                }
                                zy7Var2.a();
                                break;
                            default:
                                list.getClass();
                                if (!list.isEmpty()) {
                                    bz7Var2.invoke(list);
                                }
                                zy7Var2.a();
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var.k0(objN4);
            }
            final ti7 ti7VarA = ui7.a(null, (bz7) objN4, e18Var, 0, 1);
            vkc.a(gb9.S(null, null, null, zy7Var, e18Var, 3072, 7), gik.l((nrg) drg.b.getValue(), e18Var), null, null, false, false, null, null, null, null, null, null, fd9.q0(-215247073, new sz7() { // from class: yp
                @Override // defpackage.sz7
                public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
                    boolean z4;
                    lz1 lz1Var2;
                    fxe fxeVar;
                    ld4 ld4Var2 = (ld4) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((s64) obj).getClass();
                    ((mnc) obj2).getClass();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 129) != 128)) {
                        ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
                        fqb fqbVar = fqb.E;
                        iqb iqbVarN = gb9.N(gb9.L(b.c(fqbVar, 1.0f), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 7);
                        cxe cxeVarA = axe.a(ho0Var, lja.P, e18Var2, 6);
                        int iHashCode = Long.hashCode(e18Var2.T);
                        hyc hycVarL = e18Var2.l();
                        iqb iqbVarE = kxk.E(e18Var2, iqbVarN);
                        dd4.e.getClass();
                        re4 re4Var = cd4.b;
                        e18Var2.e0();
                        if (e18Var2.S) {
                            e18Var2.k(re4Var);
                        } else {
                            e18Var2.n0();
                        }
                        d4c.i0(e18Var2, cd4.f, cxeVarA);
                        d4c.i0(e18Var2, cd4.e, hycVarL);
                        d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                        d4c.h0(e18Var2, cd4.h);
                        d4c.i0(e18Var2, cd4.d, iqbVarE);
                        l4h l4hVar = l4hVarM;
                        boolean z5 = z;
                        lz1 lz1Var3 = jd4.a;
                        fxe fxeVar2 = fxe.a;
                        if (l4hVar != null) {
                            e18Var2.a0(776419745);
                            bpc bpcVarA = a.a(ud0.A, e18Var2);
                            String strJ0 = d4c.j0(R.string.upload_camera_button, e18Var2);
                            boolean zH2 = e18Var2.h(l4hVar);
                            Object objN5 = e18Var2.N();
                            if (zH2 || objN5 == lz1Var3) {
                                fxeVar = fxeVar2;
                                xn xnVar = new xn(0, l4hVar, l4h.class, "launchCamera", "launchCamera()V", 0, 8);
                                e18Var2.k0(xnVar);
                                objN5 = xnVar;
                            } else {
                                fxeVar = fxeVar2;
                            }
                            z4 = z5;
                            lz1Var2 = lz1Var3;
                            xuk.a(bpcVarA, strJ0, z4, (zy7) ((jm9) objN5), fxeVar.a(fqbVar, 1.0f, true), null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2, 8, 480);
                            e18Var2.p(false);
                        } else {
                            z4 = z5;
                            lz1Var2 = lz1Var3;
                            fxeVar = fxeVar2;
                            e18Var2.a0(776763783);
                            e18Var2.p(false);
                        }
                        bpc bpcVarA2 = a.a(ud0.B0, e18Var2);
                        String strJ02 = d4c.j0(R.string.upload_photos_button, e18Var2);
                        q2d q2dVar = q2dVarI;
                        boolean zH3 = e18Var2.h(q2dVar);
                        Object objN6 = e18Var2.N();
                        if (zH3 || objN6 == lz1Var2) {
                            xn xnVar2 = new xn(0, q2dVar, q2d.class, "launchMediaPicker", "launchMediaPicker()V", 0, 9);
                            e18Var2.k0(xnVar2);
                            objN6 = xnVar2;
                        }
                        xuk.a(bpcVarA2, strJ02, z4, (zy7) ((jm9) objN6), fxeVar.a(fqbVar, 1.0f, true), null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2, 8, 480);
                        bpc bpcVarA3 = a.a(ud0.n0, e18Var2);
                        String strJ03 = d4c.j0(R.string.upload_file_button, e18Var2);
                        ti7 ti7Var = ti7VarA;
                        boolean zF2 = e18Var2.f(ti7Var);
                        Object objN7 = e18Var2.N();
                        if (zF2 || objN7 == lz1Var2) {
                            objN7 = new xn(0, ti7Var, ti7.class, "launch", "launch()V", 0, 10);
                            e18Var2.k0(objN7);
                        }
                        xuk.a(bpcVarA3, strJ03, z4, (zy7) ((jm9) objN7), fxeVar.a(fqbVar, 1.0f, true), null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2, 8, 480);
                        e18Var2.p(true);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, 196616, 3072, 8156);
            e18Var = e18Var;
            rc8Var2 = rc8Var3;
        } else {
            e18Var.T();
            rc8Var2 = rc8Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(i, zy7Var, bz7Var, rc8Var2, i2);
        }
    }

    public static final void b(ol olVar, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        int i2;
        fqb fqbVar;
        xo1 xo1Var;
        re4 re4Var;
        z80 z80Var;
        wo8 wo8Var;
        boolean z;
        z80 z80Var2;
        bx bxVar;
        z80 z80Var3;
        boolean z2;
        boolean z3;
        lsc lscVar = olVar.c;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-542808678);
        int i3 = i | (e18Var.f(olVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar2 = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar2);
            dd4.e.getClass();
            re4 re4Var2 = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var2);
            } else {
                e18Var.n0();
            }
            z80 z80Var4 = cd4.f;
            d4c.i0(e18Var, z80Var4, o5bVarD);
            z80 z80Var5 = cd4.e;
            d4c.i0(e18Var, z80Var5, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var6 = cd4.g;
            d4c.i0(e18Var, z80Var6, numValueOf);
            bx bxVar2 = cd4.h;
            d4c.h0(e18Var, bxVar2);
            z80 z80Var7 = cd4.d;
            d4c.i0(e18Var, z80Var7, iqbVarE);
            xo1 xo1Var2 = lja.K;
            iqb iqbVarV = xn5.V(b.o(fqbVar2, 72.0f), a);
            long j = gm3.a(e18Var).q;
            wo8 wo8Var2 = zni.b;
            iqb iqbVarP = yfd.p(iqbVarV, j, wo8Var2);
            o5b o5bVarD2 = dw1.d(xo1Var2, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarP);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var2);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var4, o5bVarD2);
            d4c.i0(e18Var, z80Var5, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var6, e18Var, bxVar2);
            d4c.i0(e18Var, z80Var7, iqbVarE2);
            if (((Boolean) olVar.d.getValue()).booleanValue()) {
                e18Var.a0(-1525105922);
                i2 = i4;
                wo8Var = wo8Var2;
                z = false;
                fqbVar = fqbVar2;
                xo1Var = xo1Var2;
                re4Var = re4Var2;
                z80Var = z80Var4;
                nuk.e(olVar.b, (String) lscVar.getValue(), b.c, null, null, null, ho4.a, MTTypesetterKt.kLineSkipLimitMultiplier, 0, false, e18Var, 12583296, 3960);
                e18Var = e18Var;
                e18Var.p(false);
                z80Var3 = z80Var6;
                z80Var2 = z80Var7;
                bxVar = bxVar2;
                z2 = true;
            } else {
                i2 = i4;
                fqbVar = fqbVar2;
                xo1Var = xo1Var2;
                re4Var = re4Var2;
                z80Var = z80Var4;
                wo8Var = wo8Var2;
                z = false;
                e18Var.a0(-1524804230);
                vo1 vo1Var = lja.T;
                ho0 ho0Var = new ho0(4.0f, false, new do0(0, lja.Q));
                iqb iqbVarJ = gb9.J(fqbVar, 8.0f);
                q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var, 54);
                int iHashCode3 = Long.hashCode(e18Var.T);
                hyc hycVarL3 = e18Var.l();
                iqb iqbVarE3 = kxk.E(e18Var, iqbVarJ);
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, z80Var, q64VarA);
                d4c.i0(e18Var, z80Var5, hycVarL3);
                ij0.t(iHashCode3, e18Var, z80Var6, e18Var, bxVar2);
                d4c.i0(e18Var, z80Var7, iqbVarE3);
                cv8.b(u00.D(uaj.a((String) lscVar.getValue()), 0, e18Var), null, b.o(fqbVar, 28.0f), d54.h, e18Var, 3512, 0);
                z80Var2 = z80Var7;
                bxVar = bxVar2;
                z80Var3 = z80Var6;
                tjh.b((String) lscVar.getValue(), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).k, e18Var, 0, 24960, 110586);
                e18Var = e18Var;
                z2 = true;
                e18Var.p(true);
                e18Var.p(false);
            }
            nl nlVarB = olVar.b();
            if (x44.r(nlVarB, ml.a)) {
                e18Var.a0(-1523824692);
                iqb iqbVarP2 = yfd.p(b.c, d54.b(0.6f, gm3.a(e18Var).n), wo8Var);
                o5b o5bVarD3 = dw1.d(xo1Var, z);
                int iHashCode4 = Long.hashCode(e18Var.T);
                hyc hycVarL4 = e18Var.l();
                iqb iqbVarE4 = kxk.E(e18Var, iqbVarP2);
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, z80Var, o5bVarD3);
                d4c.i0(e18Var, z80Var5, hycVarL4);
                ij0.t(iHashCode4, e18Var, z80Var3, e18Var, bxVar);
                d4c.i0(e18Var, z80Var2, iqbVarE4);
                e18 e18Var2 = e18Var;
                z3 = z2;
                tjd.a(b.o(fqbVar, 24.0f), gm3.a(e18Var).N, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2, 390, 56);
                e18Var = e18Var2;
                e18Var.p(z3);
                e18Var.p(z);
            } else {
                boolean z4 = z2;
                xo1 xo1Var3 = xo1Var;
                wo8 wo8Var3 = wo8Var;
                z80 z80Var8 = z80Var3;
                bx bxVar3 = bxVar;
                z80 z80Var9 = z80Var2;
                if (x44.r(nlVarB, kl.a) || x44.r(nlVarB, ll.a)) {
                    e18Var.a0(-1523210241);
                    iqb iqbVarP3 = yfd.p(b.c, d54.b(0.7f, gm3.a(e18Var).n), wo8Var3);
                    o5b o5bVarD4 = dw1.d(xo1Var3, false);
                    int iHashCode5 = Long.hashCode(e18Var.T);
                    hyc hycVarL5 = e18Var.l();
                    iqb iqbVarE5 = kxk.E(e18Var, iqbVarP3);
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, z80Var, o5bVarD4);
                    d4c.i0(e18Var, z80Var5, hycVarL5);
                    ij0.t(iHashCode5, e18Var, z80Var8, e18Var, bxVar3);
                    d4c.i0(e18Var, z80Var9, iqbVarE5);
                    z3 = z4;
                    iv1.b(ud0.K1, gik.l((nrg) drg.m.getValue(), e18Var), null, null, gm3.a(e18Var).y, e18Var, 0, 12);
                    e18Var.p(z3);
                    e18Var.p(false);
                } else {
                    if (!(nlVarB instanceof jl)) {
                        throw ebh.u(e18Var, 1336315883, z);
                    }
                    e18Var.a0(1336355890);
                    e18Var.p(z);
                    z3 = z4;
                }
            }
            e18Var.p(z3);
            ez1.d(zy7Var, b.o(gb9.J(nw1.a.a(fqbVar, lja.I), 4.0f), 20.0f), false, null, vz8.E(gm3.a(e18Var).M, gm3.a(e18Var).n, e18Var, 24576), stj.a, e18Var, ((i2 >> 3) & 14) | 1572864, 44);
            e18Var.p(z3);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(i, 4, iqbVar2, olVar, zy7Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.util.List r14, defpackage.bz7 r15, defpackage.iqb r16, defpackage.ld4 r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zp.c(java.util.List, bz7, iqb, ld4, int, int):void");
    }
}
