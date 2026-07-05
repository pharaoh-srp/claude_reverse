package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.chat.parse.MemoryToolSummary;
import com.anthropic.claude.code.remote.bottomsheet.CodeRemoteBottomSheetDestination;
import com.anthropic.claude.code.remote.e;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.conway.protocol.ModelInfo;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.tool.model.AlarmCreateV0Input;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ii implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ ii(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        n58 n58Var = (n58) this.F;
        bz7 bz7Var = (bz7) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ia0) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            d68 d68Var = n58Var != null ? n58Var.c : null;
            b68 b68Var = d68Var instanceof b68 ? (b68) d68Var : null;
            if (b68Var != null) {
                e18Var.a0(-1032186261);
                boolean zF = e18Var.f(bz7Var) | e18Var.h(b68Var);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = new ik1(bz7Var, 27, b68Var);
                    e18Var.k0(objN);
                }
                x41.f((zy7) objN, null, e18Var, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(-1032020008);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        List list = (List) this.F;
        zy7 zy7Var = (zy7) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((px9) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            Integer numValueOf = Integer.valueOf(list.size());
            boolean zF = e18Var.f(zy7Var);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new es0(zy7Var, null, 7);
                e18Var.k0(objN);
            }
            fd9.i(e18Var, (pz7) objN, numValueOf);
            xo1 xo1Var = lja.K;
            fqb fqbVar = fqb.E;
            iqb iqbVarJ = gb9.J(b.c(fqbVar, 1.0f), 16.0f);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
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
            tjd.a(b.o(fqbVar, 20.0f), gm3.a(e18Var).N, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 390, 56);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        kk4 kk4Var = (kk4) this.F;
        zy7 zy7Var = (zy7) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((dxe) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            e18Var.T();
        } else if (kk4Var.f.b()) {
            e18Var.a0(-962899448);
            ez1.e(zy7Var, null, false, null, null, sik.a, e18Var, 1572864, 62);
            e18Var.p(false);
        } else {
            e18Var.a0(-962540995);
            e18Var.p(false);
        }
        return iei.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        bz7 bz7Var = (bz7) this.F;
        yo4 yo4Var = (yo4) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new cp4();
                e18Var.k0(objN);
            }
            cp4 cp4Var = (cp4) objN;
            cp4Var.a.clear();
            bz7Var.invoke(cp4Var);
            cp4Var.a(yo4Var, e18Var, 0);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        l45 l45Var = (l45) this.F;
        x0a x0aVar = (x0a) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ia0) obj).getClass();
        int i = 0;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zH = e18Var.h(l45Var) | e18Var.f(x0aVar);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new ht4(l45Var, x0aVar, i);
                e18Var.k0(objN);
            }
            ez1.d((zy7) objN, null, false, null, vz8.E(gm3.a(e18Var).n, gm3.a(e18Var).O, e18Var, 24576), djk.c, e18Var, 1572864, 46);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        p05 p05Var = (p05) this.F;
        xpa xpaVar = (xpa) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((dxe) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            String strJ0 = d4c.j0(R.string.conway_ext_install, e18Var);
            boolean z = p05Var.R() != null;
            boolean zH = e18Var.h(xpaVar);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new uv4(xpaVar, 0);
                e18Var.k0(objN);
            }
            dtj.a(strJ0, null, z, null, f12.a, y02.a, 0L, (zy7) objN, e18Var, 221184, 74);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        long j;
        fz4 fz4Var = (fz4) this.F;
        zy7 zy7Var = (zy7) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((s64) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            if (x44.r(fz4Var, ez4.a)) {
                e18Var.a0(687678816);
                zsk.b(d4c.j0(R.string.conway_system_model_loading, e18Var), null, e18Var, 0);
                e18Var.p(false);
            } else if (fz4Var instanceof cz4) {
                e18Var.a0(687683097);
                zsk.b(((cz4) fz4Var).a, null, e18Var, 0);
                e18Var.p(false);
            } else {
                if (!(fz4Var instanceof dz4)) {
                    throw ebh.u(e18Var, 687678368, false);
                }
                e18Var.a0(-156529651);
                String strM746getCurrenta6HIKFk = ((ModelInfo) ((dz4) fz4Var).a).m746getCurrenta6HIKFk();
                wo1 wo1Var = lja.Q;
                fqb fqbVar = fqb.E;
                iqb iqbVarK = gb9.K(androidx.compose.foundation.b.c(b.c(fqbVar, 1.0f), false, null, null, null, zy7Var, 15), 16.0f, 12.0f);
                cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
                int iHashCode = Long.hashCode(e18Var.T);
                hyc hycVarL = e18Var.l();
                iqb iqbVarE = kxk.E(e18Var, iqbVarK);
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
                String strN = strM746getCurrenta6HIKFk != null ? strM746getCurrenta6HIKFk : null;
                if (strN == null) {
                    strN = vb7.n(e18Var, -762333662, R.string.conway_system_model_none, e18Var, false);
                } else {
                    e18Var.a0(-762334220);
                    e18Var.p(false);
                }
                tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).g;
                if (strM746getCurrenta6HIKFk != null) {
                    e18Var.a0(-762327688);
                    j = gm3.a(e18Var).M;
                } else {
                    e18Var.a0(-762326664);
                    j = gm3.a(e18Var).N;
                }
                e18Var.p(false);
                tjh.b(strN, new hw9(1.0f, true), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var, 0, 0, 131064);
                tjh.b(d4c.j0(R.string.conway_system_model_change, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
                iv1.b(ud0.C, null, gb9.N(fqbVar, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), ef2.F, gm3.a(e18Var).N, e18Var, 3504, 0);
                e18Var.p(true);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zy7 zy7Var;
        nrg nrgVar;
        ud0 ud0Var;
        int i = this.E;
        eo0 eo0Var = ko0.c;
        int i2 = 7;
        lz1 lz1Var = jd4.a;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        int i3 = 14;
        Object obj4 = this.G;
        Object obj5 = this.F;
        switch (i) {
            case 0:
                ggc ggcVar = (ggc) obj5;
                nwb nwbVar = (nwb) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    iqb iqbVarL = gb9.L(b.c(fqbVar, 1.0f), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    q64 q64VarA = p64.a(eo0Var, lja.S, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarL);
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
                    hi hiVar = (hi) nwbVar.getValue();
                    boolean zF = e18Var.f(ggcVar);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        objN = new l0(ggcVar, 4, nwbVar);
                        e18Var.k0(objN);
                    }
                    tnk.a(hiVar, (bz7) objN, b.c(fqbVar, 1.0f), e18Var, 384, 8);
                    e18Var.p(true);
                } else {
                    e18Var.T();
                }
                break;
            case 1:
                an anVar = (an) obj5;
                gh2 gh2Var = (gh2) obj4;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    SessionResource sessionResourceD = ((vm) anVar.b).d();
                    hvf hvfVarV = zni.V("dispatch", sessionResourceD != null ? sessionResourceD.m875getIdOcx55TE() : null, e18Var2, 6);
                    phg phgVarA = qhg.a(hvfVarV, e18Var2, 0);
                    q64 q64VarA2 = p64.a(eo0Var, lja.T, e18Var2, 48);
                    int iHashCode2 = Long.hashCode(e18Var2.T);
                    hyc hycVarL2 = e18Var2.l();
                    iqb iqbVarE2 = kxk.E(e18Var2, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var2);
                    } else {
                        e18Var2.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var2, z80Var, q64VarA2);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var2, z80Var2, hycVarL2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var2, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var2, bxVar);
                    z80 z80Var4 = cd4.d;
                    d4c.i0(e18Var2, z80Var4, iqbVarE2);
                    v40.f(phgVarA.k, gb9.N(gb9.L(fqbVar, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), e18Var2, 48);
                    iqb iqbVarK = gb9.K(yfd.p(ez1.t(xn5.V(xn5.a0(gb9.K(fqbVar, 12.0f, 8.0f), xve.b(24.0f), new tzf(8.0f, d54.b(0.08f, d54.b), MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 56)), xve.b(24.0f)), 1.0f, gm3.a(e18Var2).v, xve.b(24.0f)), gm3.a(e18Var2).o, xve.b(24.0f)), 12.0f, 12.0f);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode3 = Long.hashCode(e18Var2.T);
                    hyc hycVarL3 = e18Var2.l();
                    iqb iqbVarE3 = kxk.E(e18Var2, iqbVarK);
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var2);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, z80Var, o5bVarD);
                    d4c.i0(e18Var2, z80Var2, hycVarL3);
                    ij0.t(iHashCode3, e18Var2, z80Var3, e18Var2, bxVar);
                    d4c.i0(e18Var2, z80Var4, iqbVarE3);
                    iqb iqbVarC = b.c(fqbVar, 1.0f);
                    boolean zF2 = e18Var2.f(anVar);
                    Object objN2 = e18Var2.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = new en(anVar, 0);
                        e18Var2.k0(objN2);
                    }
                    bz7 bz7Var = (bz7) objN2;
                    boolean zH = e18Var2.h(gh2Var);
                    Object objN3 = e18Var2.N();
                    if (zH || objN3 == lz1Var) {
                        objN3 = new ao(gh2Var, null, 0);
                        e18Var2.k0(objN3);
                    }
                    owj.f(bz7Var, hvfVarV, (pz7) objN3, iqbVarC, null, phgVarA, null, e18Var2, 265216, 80);
                    e18Var2.p(true);
                    e18Var2.p(true);
                } else {
                    e18Var2.T();
                }
                break;
            case 2:
                final lwc lwcVar = (lwc) obj5;
                final an anVar2 = (an) obj4;
                px9 px9Var = (px9) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                px9Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).f(px9Var) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    boolean zF3 = e18Var3.f(anVar2) | e18Var3.h(lwcVar);
                    Object objN4 = e18Var3.N();
                    if (zF3 || objN4 == lz1Var) {
                        final int i4 = 0;
                        objN4 = new zy7() { // from class: on
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i5 = i4;
                                iei ieiVar2 = iei.a;
                                lwc lwcVar2 = lwcVar;
                                an anVar3 = anVar2;
                                switch (i5) {
                                    case 0:
                                        String str = lwcVar2.b;
                                        str.getClass();
                                        gb9.D(anVar3.a, null, null, new zm(anVar3, str, null, 1), 3);
                                        break;
                                    case 1:
                                        String str2 = lwcVar2.b;
                                        str2.getClass();
                                        gb9.D(anVar3.a, null, null, new zm(anVar3, str2, null, 0), 3);
                                        break;
                                    default:
                                        String str3 = lwcVar2.b;
                                        str3.getClass();
                                        gb9.D(anVar3.a, null, null, new zm(anVar3, str3, null, 2), 3);
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var3.k0(objN4);
                    }
                    zy7 zy7Var2 = (zy7) objN4;
                    if (lwcVar.h) {
                        e18Var3.a0(-563500672);
                        boolean zF4 = e18Var3.f(anVar2) | e18Var3.h(lwcVar);
                        Object objN5 = e18Var3.N();
                        if (zF4 || objN5 == lz1Var) {
                            final int i5 = 1;
                            objN5 = new zy7() { // from class: on
                                @Override // defpackage.zy7
                                public final Object a() {
                                    int i52 = i5;
                                    iei ieiVar2 = iei.a;
                                    lwc lwcVar2 = lwcVar;
                                    an anVar3 = anVar2;
                                    switch (i52) {
                                        case 0:
                                            String str = lwcVar2.b;
                                            str.getClass();
                                            gb9.D(anVar3.a, null, null, new zm(anVar3, str, null, 1), 3);
                                            break;
                                        case 1:
                                            String str2 = lwcVar2.b;
                                            str2.getClass();
                                            gb9.D(anVar3.a, null, null, new zm(anVar3, str2, null, 0), 3);
                                            break;
                                        default:
                                            String str3 = lwcVar2.b;
                                            str3.getClass();
                                            gb9.D(anVar3.a, null, null, new zm(anVar3, str3, null, 2), 3);
                                            break;
                                    }
                                    return ieiVar2;
                                }
                            };
                            e18Var3.k0(objN5);
                        }
                        e18Var3.p(false);
                        zy7Var = (zy7) objN5;
                    } else {
                        e18Var3.a0(-563389848);
                        e18Var3.p(false);
                        zy7Var = null;
                    }
                    boolean zF5 = e18Var3.f(anVar2) | e18Var3.h(lwcVar);
                    Object objN6 = e18Var3.N();
                    if (zF5 || objN6 == lz1Var) {
                        objN6 = new zy7() { // from class: on
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i52 = i;
                                iei ieiVar2 = iei.a;
                                lwc lwcVar2 = lwcVar;
                                an anVar3 = anVar2;
                                switch (i52) {
                                    case 0:
                                        String str = lwcVar2.b;
                                        str.getClass();
                                        gb9.D(anVar3.a, null, null, new zm(anVar3, str, null, 1), 3);
                                        break;
                                    case 1:
                                        String str2 = lwcVar2.b;
                                        str2.getClass();
                                        gb9.D(anVar3.a, null, null, new zm(anVar3, str2, null, 0), 3);
                                        break;
                                    default:
                                        String str3 = lwcVar2.b;
                                        str3.getClass();
                                        gb9.D(anVar3.a, null, null, new zm(anVar3, str3, null, 2), 3);
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var3.k0(objN6);
                    }
                    nvh.b(lwcVar, zy7Var2, zy7Var, (zy7) objN6, null, gb9.N(px9.a(px9Var, fqbVar, null, null, 7), MTTypesetterKt.kLineSkipLimitMultiplier, wp.c, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), false, e18Var3, 24584, 64);
                } else {
                    e18Var3.T();
                }
                break;
            case 3:
                Set set = (Set) obj5;
                bz7 bz7Var2 = (bz7) obj4;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    for (x76 x76Var : x76.I) {
                        boolean zContains = set.contains(x76Var);
                        int iOrdinal = x76Var.ordinal();
                        if (iOrdinal == 0) {
                            nrgVar = (nrg) drg.h0.getValue();
                        } else if (iOrdinal == 1) {
                            nrgVar = (nrg) drg.g0.getValue();
                        } else if (iOrdinal != 2) {
                            wg6.i();
                        } else {
                            nrgVar = (nrg) drg.f0.getValue();
                        }
                        String strL = gik.l(nrgVar, e18Var4);
                        int iOrdinal2 = x76Var.ordinal();
                        if (iOrdinal2 == 0) {
                            ud0Var = ud0.a0;
                        } else if (iOrdinal2 == 1) {
                            ud0Var = ud0.w1;
                        } else if (iOrdinal2 != 2) {
                            wg6.i();
                        } else {
                            ud0Var = ud0.S;
                        }
                        bpc bpcVarA = a.a(ud0Var, e18Var4);
                        bpc bpcVarA2 = zContains ? a.a(ud0.L, e18Var4) : null;
                        boolean zF6 = e18Var4.f(bz7Var2) | e18Var4.d(x76Var.ordinal());
                        Object objN7 = e18Var4.N();
                        if (zF6 || objN7 == lz1Var) {
                            objN7 = new k6(bz7Var2, i2, x76Var);
                            e18Var4.k0(objN7);
                        }
                        uuj.a(strL, bpcVarA2, (zy7) objN7, null, bpcVarA, false, Boolean.valueOf(zContains), null, null, null, 0, 0, e18Var4, 32832, 4008);
                    }
                } else {
                    e18Var4.T();
                }
                break;
            case 4:
                ts tsVar = (ts) obj5;
                AlarmCreateV0Input alarmCreateV0Input = (AlarmCreateV0Input) obj4;
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((mnc) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    puk.a(tsVar.g, alarmCreateV0Input, null, e18Var5, 0);
                } else {
                    e18Var5.T();
                }
                break;
            case 5:
                fu9 fu9Var = (fu9) obj5;
                ta4 ta4Var = (ta4) obj4;
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    j8.c(ve4.n.a(fu9Var), ta4Var, e18Var6, 8);
                } else {
                    e18Var6.T();
                }
                break;
            case 6:
                zy7 zy7Var3 = (zy7) obj5;
                ml3 ml3Var = (ml3) obj4;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((e18) ld4Var7).g(zBooleanValue) ? 4 : 2;
                }
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    e18Var7.T();
                } else if (zBooleanValue) {
                    e18Var7.a0(-821909563);
                    ez1.e(zy7Var3, null, false, null, null, nuj.c, e18Var7, 1572864, 62);
                    e18Var7.p(false);
                } else {
                    e18Var7.a0(-821492582);
                    int i6 = ml3.f;
                    sf5.b(ml3Var, null, null, e18Var7, 0);
                    e18Var7.p(false);
                }
                break;
            case 7:
                List list = (List) obj5;
                isc iscVar = (isc) obj4;
                dxe dxeVar = (dxe) obj;
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                dxeVar.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((e18) ld4Var8).f(dxeVar) ? 4 : 2;
                }
                e18 e18Var8 = (e18) ld4Var8;
                if (e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    tjh.b(d4c.k0(R.string.ask_user_input_question_indicator, new Object[]{Integer.valueOf(iscVar.h() + 1), Integer.valueOf(list.size())}, e18Var8), gb9.L(dxeVar.a(fqbVar, 1.0f, true), MTTypesetterKt.kLineSkipLimitMultiplier, 6.0f, 1), gm3.a(e18Var8).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var8).e.E).i, e18Var8, 0, 0, 131064);
                } else {
                    e18Var8.T();
                }
                break;
            case 8:
                iqb iqbVar = (iqb) obj5;
                rz7 rz7Var = (rz7) obj4;
                cte cteVar = (cte) obj;
                ld4 ld4Var9 = (ld4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                cteVar.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= ((e18) ld4Var9).f(cteVar) ? 4 : 2;
                }
                e18 e18Var9 = (e18) ld4Var9;
                if (e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    j8.c(p6a.a.a(null), fd9.q0(-230925046, new m6(cteVar, iqbVar, rz7Var, i3), e18Var9), e18Var9, 48);
                } else {
                    e18Var9.T();
                }
                break;
            case 9:
                mj1 mj1Var = (mj1) obj5;
                zy7 zy7Var4 = (zy7) obj4;
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= ((e18) ld4Var10).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var10 = (e18) ld4Var10;
                if (e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    List list2 = (List) mj1Var.t.getValue();
                    String strS = mj1Var.S();
                    boolean zF7 = e18Var10.f(mj1Var) | e18Var10.f(zy7Var4);
                    Object objN8 = e18Var10.N();
                    if (zF7 || objN8 == lz1Var) {
                        objN8 = new km1(mj1Var, zy7Var4, 1);
                        e18Var10.k0(objN8);
                    }
                    kpb.e(list2, strS, (bz7) objN8, i4gVar, e18Var10, (iIntValue10 << 9) & 7168);
                } else {
                    e18Var10.T();
                }
                break;
            case 10:
                zb0 zb0Var = (zb0) obj5;
                rz7 rz7Var2 = (rz7) obj4;
                s64 s64Var = (s64) obj;
                ld4 ld4Var11 = (ld4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                s64Var.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= ((e18) ld4Var11).f(s64Var) ? 4 : 2;
                }
                e18 e18Var11 = (e18) ld4Var11;
                if (e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    tjh.c(zb0Var, s64Var.a(fqbVar, lja.T), gm3.a(e18Var11).N, 0L, 0L, new fdh(3), 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var11).e.E).g, e18Var11, 0, 0, 261112);
                    kxk.g(e18Var11, b.e(fqbVar, 8.0f));
                    if (rz7Var2 != null) {
                        e18Var11.a0(1844724885);
                        rz7Var2.invoke(s64Var, e18Var11, Integer.valueOf(iIntValue11 & 14));
                        grc.z(fqbVar, 8.0f, e18Var11, false);
                    } else {
                        e18Var11.a0(1844821946);
                        e18Var11.p(false);
                    }
                } else {
                    e18Var11.T();
                }
                break;
            case 11:
                List list3 = (List) obj5;
                bz7 bz7Var3 = (bz7) obj4;
                ld4 ld4Var12 = (ld4) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var12 = (e18) ld4Var12;
                if (e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    q64 q64VarA3 = p64.a(eo0Var, lja.T, e18Var12, 48);
                    int iHashCode4 = Long.hashCode(e18Var12.T);
                    hyc hycVarL4 = e18Var12.l();
                    iqb iqbVarE4 = kxk.E(e18Var12, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var12.e0();
                    if (e18Var12.S) {
                        e18Var12.k(re4Var3);
                    } else {
                        e18Var12.n0();
                    }
                    z80 z80Var5 = cd4.f;
                    d4c.i0(e18Var12, z80Var5, q64VarA3);
                    z80 z80Var6 = cd4.e;
                    d4c.i0(e18Var12, z80Var6, hycVarL4);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    z80 z80Var7 = cd4.g;
                    d4c.i0(e18Var12, z80Var7, numValueOf2);
                    bx bxVar2 = cd4.h;
                    d4c.h0(e18Var12, bxVar2);
                    z80 z80Var8 = cd4.d;
                    d4c.i0(e18Var12, z80Var8, iqbVarE4);
                    ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
                    iqb iqbVarL2 = gb9.L(mpk.b0(fqbVar, mpk.Y(e18Var12), false), 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    cxe cxeVarA = axe.a(ho0Var, lja.P, e18Var12, 6);
                    int iHashCode5 = Long.hashCode(e18Var12.T);
                    hyc hycVarL5 = e18Var12.l();
                    iqb iqbVarE5 = kxk.E(e18Var12, iqbVarL2);
                    e18Var12.e0();
                    if (e18Var12.S) {
                        e18Var12.k(re4Var3);
                    } else {
                        e18Var12.n0();
                    }
                    d4c.i0(e18Var12, z80Var5, cxeVarA);
                    d4c.i0(e18Var12, z80Var6, hycVarL5);
                    ij0.t(iHashCode5, e18Var12, z80Var7, e18Var12, bxVar2);
                    d4c.i0(e18Var12, z80Var8, iqbVarE5);
                    e18Var12.a0(-1082446387);
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        xjk.c((mc3) it.next(), bz7Var3, gb9.L(fqbVar, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), null, e18Var12, 384);
                    }
                    ij0.w(e18Var12, false, true, true);
                } else {
                    e18Var12.T();
                }
                break;
            case 12:
                uj4 uj4Var = (uj4) obj5;
                hi4 hi4Var = (hi4) obj4;
                i4g i4gVar2 = (i4g) obj;
                ld4 ld4Var13 = (ld4) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                i4gVar2.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= ((e18) ld4Var13).f(i4gVar2) ? 4 : 2;
                }
                e18 e18Var13 = (e18) ld4Var13;
                if (e18Var13.Q(1 & iIntValue13, (iIntValue13 & 19) != 18)) {
                    Context context = (Context) e18Var13.j(w00.b);
                    float f = i4gVar2.b;
                    boolean zH2 = e18Var13.h(uj4Var) | e18Var13.h(hi4Var) | e18Var13.h(context);
                    Object objN9 = e18Var13.N();
                    Object obj6 = objN9;
                    if (zH2 || objN9 == lz1Var) {
                        uy3 uy3Var = new uy3(uj4Var, hi4Var, context, z ? 1 : 0);
                        e18Var13.k0(uy3Var);
                        obj6 = uy3Var;
                    }
                    ypk.c(uj4Var, (bz7) obj6, null, f, hi4Var, e18Var13, 32776, 4);
                } else {
                    e18Var13.T();
                }
                break;
            case 13:
                c44 c44Var = (c44) obj5;
                t4g t4gVar = (t4g) obj4;
                i4g i4gVar3 = (i4g) obj;
                ld4 ld4Var14 = (ld4) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                i4gVar3.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= ((e18) ld4Var14).f(i4gVar3) ? 4 : 2;
                }
                e18 e18Var14 = (e18) ld4Var14;
                if (e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    String strG = g34.g(c44Var.c, 1, e18Var14, 48);
                    qnc qncVarB = i4gVar3.b();
                    iqb iqbVarC2 = b.c(fqbVar, 1.0f);
                    boolean zH3 = e18Var14.h(c44Var) | e18Var14.h(t4gVar) | e18Var14.f(strG);
                    Object objN10 = e18Var14.N();
                    if (zH3 || objN10 == lz1Var) {
                        objN10 = new l6(c44Var, t4gVar, strG, 17);
                        e18Var14.k0(objN10);
                    }
                    knk.h(iqbVarC2, null, qncVarB, false, null, null, null, false, null, (bz7) objN10, e18Var14, 6, 506);
                } else {
                    e18Var14.T();
                }
                break;
            case 14:
                CodeRemoteBottomSheetDestination codeRemoteBottomSheetDestination = (CodeRemoteBottomSheetDestination) obj5;
                bz7 bz7Var4 = (bz7) obj4;
                i4g i4gVar4 = (i4g) obj;
                ld4 ld4Var15 = (ld4) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                i4gVar4.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= ((e18) ld4Var15).f(i4gVar4) ? 4 : 2;
                }
                e18 e18Var15 = (e18) ld4Var15;
                if (e18Var15.Q(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    fk fkVar = ((CodeRemoteBottomSheetDestination.AttachmentText) codeRemoteBottomSheetDestination).a;
                    boolean zF8 = e18Var15.f(bz7Var4) | e18Var15.h(codeRemoteBottomSheetDestination);
                    Object objN11 = e18Var15.N();
                    if (zF8 || objN11 == lz1Var) {
                        objN11 = new ik1(bz7Var4, 21, codeRemoteBottomSheetDestination);
                        e18Var15.k0(objN11);
                    }
                    x2k.a(fkVar, (zy7) objN11, i4gVar4, b.c, null, null, e18Var15, ((iIntValue15 << 6) & 896) | 3072);
                } else {
                    e18Var15.T();
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                zy7 zy7Var5 = (zy7) obj5;
                x0a x0aVar = (x0a) obj4;
                ld4 ld4Var16 = (ld4) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var16 = (e18) ld4Var16;
                if (e18Var16.Q(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    e0g e0gVar = gm3.b(e18Var16).p;
                    Object objN12 = e18Var16.N();
                    if (objN12 == lz1Var) {
                        objN12 = new it2(29);
                        e18Var16.k0(objN12);
                    }
                    zmk.c(zy7Var5, tjf.b(fqbVar, false, (bz7) objN12), e0gVar, 0L, 0L, null, fd9.q0(-2100051837, new d04(x0aVar), e18Var16), e18Var16, 12582912, 120);
                } else {
                    e18Var16.T();
                }
                break;
            case 16:
                vsf vsfVar = (vsf) obj5;
                oz3 oz3Var = (oz3) obj4;
                ld4 ld4Var17 = (ld4) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var17 = (e18) ld4Var17;
                if (e18Var17.Q(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    e.h(vsfVar, oz3Var, true, null, gb9.d(16.0f, 16.0f, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 8), e18Var17, 384, 8);
                } else {
                    e18Var17.T();
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                String str = (String) obj5;
                iqb iqbVar2 = (iqb) obj4;
                px9 px9Var2 = (px9) obj;
                ld4 ld4Var18 = (ld4) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                px9Var2.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= ((e18) ld4Var18).f(px9Var2) ? 4 : 2;
                }
                e18 e18Var18 = (e18) ld4Var18;
                if (e18Var18.Q(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    m4d.a(str, px9.a(px9Var2, iqbVar2, null, null, 7), null, e18Var18, 0);
                } else {
                    e18Var18.T();
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                i iVar = (i) obj5;
                qnc qncVar = (qnc) obj4;
                px9 px9Var3 = (px9) obj;
                ld4 ld4Var19 = (ld4) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                px9Var3.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= ((e18) ld4Var19).f(px9Var3) ? 4 : 2;
                }
                e18 e18Var19 = (e18) ld4Var19;
                if (e18Var19.Q(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    g34.c(iVar.M0(), xn5.q0(qncVar, gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, n2i.b, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13)), px9.a(px9Var3, fqbVar, null, null, 7), e18Var19, 0, 0);
                } else {
                    e18Var19.T();
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                break;
            case 21:
                MemoryToolSummary memoryToolSummary = (MemoryToolSummary) obj5;
                i4g i4gVar5 = (i4g) obj4;
                ld4 ld4Var20 = (ld4) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var20 = (e18) ld4Var20;
                if (e18Var20.Q(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    stk.b(memoryToolSummary, i4gVar5.a, null, e18Var20, 0);
                } else {
                    e18Var20.T();
                }
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                break;
            case 24:
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                el5 el5Var = (el5) obj5;
                ld4 ld4Var21 = (ld4) obj2;
                ((Integer) obj3).getClass();
                ((noh) el5Var.E).E.c().a(((noh) obj4).F.toString(), fd9.q0(964932639, new um5(el5Var, i, (ia0) obj), ld4Var21), ld4Var21, 48);
                break;
            default:
                x5a x5aVar = (x5a) obj5;
                jl3 jl3Var = (jl3) obj4;
                pz7 pz7Var = (pz7) obj;
                ld4 ld4Var22 = (ld4) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                pz7Var.getClass();
                if ((iIntValue21 & 6) == 0) {
                    iIntValue21 |= ((e18) ld4Var22).h(pz7Var) ? 4 : 2;
                }
                e18 e18Var21 = (e18) ld4Var22;
                if (e18Var21.Q(iIntValue21 & 1, (iIntValue21 & 19) != 18)) {
                    o5b o5bVarD2 = dw1.d(lja.G, false);
                    int iHashCode6 = Long.hashCode(e18Var21.T);
                    hyc hycVarL6 = e18Var21.l();
                    iqb iqbVarE6 = kxk.E(e18Var21, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var4 = cd4.b;
                    e18Var21.e0();
                    if (e18Var21.S) {
                        e18Var21.k(re4Var4);
                    } else {
                        e18Var21.n0();
                    }
                    d4c.i0(e18Var21, cd4.f, o5bVarD2);
                    d4c.i0(e18Var21, cd4.e, hycVarL6);
                    d4c.i0(e18Var21, cd4.g, Integer.valueOf(iHashCode6));
                    d4c.h0(e18Var21, cd4.h);
                    d4c.i0(e18Var21, cd4.d, iqbVarE6);
                    if (x5aVar.a().length() == 0) {
                        e18Var21.a0(-1015172391);
                        tjh.b(d4c.j0(R.string.diff_add_comment_placeholder, e18Var21), null, jl3Var.O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var21).e.E).g, e18Var21, 0, 0, 131066);
                        e18Var21.p(false);
                    } else {
                        e18Var21.a0(-1014898661);
                        e18Var21.p(false);
                    }
                    sq6.B(iIntValue21 & 14, pz7Var, e18Var21, true);
                } else {
                    e18Var21.T();
                }
                break;
        }
        return ieiVar;
    }
}
