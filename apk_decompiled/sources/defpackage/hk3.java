package defpackage;

import android.content.Context;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.app.j0;
import com.anthropic.claude.app.k0;
import com.anthropic.claude.app.l0;
import com.anthropic.claude.app.l1;
import com.anthropic.claude.app.m0;
import com.anthropic.claude.app.n0;
import com.anthropic.claude.code.remote.stores.b;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hk3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ Context G;
    public final /* synthetic */ nwb H;
    public final /* synthetic */ iqb I;

    public /* synthetic */ hk3(zy7 zy7Var, Context context, nwb nwbVar, iqb iqbVar, int i) {
        this.E = i;
        this.F = zy7Var;
        this.G = context;
        this.H = nwbVar;
        this.I = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        b1i b1iVar;
        final qzb qzbVar;
        z93 z93Var;
        b bVar;
        int i;
        int i2 = this.E;
        iei ieiVar = iei.a;
        final int i3 = 0;
        final int i4 = 1;
        switch (i2) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    olh.a(false, null, null, fd9.q0(1675959418, new hk3(this.F, this.G, this.H, this.I, 1), e18Var), e18Var, 3072, 7);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                    break;
                } else {
                    m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                    boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                    Object objN = e18Var2.N();
                    lz1 lz1Var = jd4.a;
                    if (zF || objN == lz1Var) {
                        objN = m7fVarN.a(jce.a.b(qzb.class), null, null);
                        e18Var2.k0(objN);
                    }
                    e18Var2.p(false);
                    e18Var2.p(false);
                    final qzb qzbVar2 = (qzb) objN;
                    boolean zH = e18Var2.h(qzbVar2);
                    Object objN2 = e18Var2.N();
                    if (zH || objN2 == lz1Var) {
                        objN2 = new zy7() { // from class: fk3
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i5 = i4;
                                qzb qzbVar3 = qzbVar2;
                                switch (i5) {
                                    case 0:
                                        pg7 pg7Var = (pg7) qzbVar3.d.getValue();
                                        return Boolean.valueOf(pg7Var != null ? pg7Var.b.getOn() : true);
                                    default:
                                        Boolean bool = (Boolean) qzbVar3.c.getValue();
                                        bool.getClass();
                                        return bool;
                                }
                            }
                        };
                        e18Var2.k0(objN2);
                    }
                    zy7 zy7Var = (zy7) objN2;
                    boolean zH2 = e18Var2.h(qzbVar2);
                    Object objN3 = e18Var2.N();
                    if (zH2 || objN3 == lz1Var) {
                        objN3 = new zy7() { // from class: fk3
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i5 = i3;
                                qzb qzbVar3 = qzbVar2;
                                switch (i5) {
                                    case 0:
                                        pg7 pg7Var = (pg7) qzbVar3.d.getValue();
                                        return Boolean.valueOf(pg7Var != null ? pg7Var.b.getOn() : true);
                                    default:
                                        Boolean bool = (Boolean) qzbVar3.c.getValue();
                                        bool.getClass();
                                        return bool;
                                }
                            }
                        };
                        e18Var2.k0(objN3);
                    }
                    kqc kqcVarI = u00.i(zy7Var, (zy7) objN3, e18Var2, 1);
                    ye3 ye3Var = kqcVarI.a > 1 ? ye3.F : ye3.E;
                    m7f m7fVarN2 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                    boolean zF2 = e18Var2.f(null) | e18Var2.f(m7fVarN2);
                    Object objN4 = e18Var2.N();
                    if (zF2 || objN4 == lz1Var) {
                        objN4 = m7fVarN2.a(jce.a.b(b1i.class), null, null);
                        e18Var2.k0(objN4);
                    }
                    e18Var2.p(false);
                    e18Var2.p(false);
                    b1i b1iVar2 = (b1i) objN4;
                    m7f m7fVarN3 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                    boolean zF3 = e18Var2.f(null) | e18Var2.f(m7fVarN3);
                    Object objN5 = e18Var2.N();
                    if (zF3 || objN5 == lz1Var) {
                        objN5 = m7fVarN3.a(jce.a.b(tae.class), null, null);
                        e18Var2.k0(objN5);
                    }
                    e18Var2.p(false);
                    e18Var2.p(false);
                    tae taeVar = (tae) objN5;
                    m7f m7fVarN4 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                    boolean zF4 = e18Var2.f(null) | e18Var2.f(m7fVarN4);
                    Object objN6 = e18Var2.N();
                    if (zF4 || objN6 == lz1Var) {
                        objN6 = m7fVarN4.a(jce.a.b(nf7.class), null, null);
                        e18Var2.k0(objN6);
                    }
                    e18Var2.p(false);
                    e18Var2.p(false);
                    nf7 nf7Var = (nf7) objN6;
                    m7f m7fVarN5 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                    boolean zF5 = e18Var2.f(null) | e18Var2.f(m7fVarN5);
                    Object objN7 = e18Var2.N();
                    if (zF5 || objN7 == lz1Var) {
                        objN7 = m7fVarN5.a(jce.a.b(rc8.class), null, null);
                        e18Var2.k0(objN7);
                    }
                    e18Var2.p(false);
                    e18Var2.p(false);
                    rc8 rc8Var = (rc8) objN7;
                    m7f m7fVarN6 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                    boolean zF6 = e18Var2.f(null) | e18Var2.f(m7fVarN6);
                    Object objN8 = e18Var2.N();
                    if (zF6 || objN8 == lz1Var) {
                        objN8 = m7fVarN6.a(jce.a.b(sl.class), null, null);
                        e18Var2.k0(objN8);
                    }
                    e18Var2.p(false);
                    e18Var2.p(false);
                    sl slVar = (sl) objN8;
                    m7f m7fVarN7 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                    boolean zF7 = e18Var2.f(null) | e18Var2.f(m7fVarN7);
                    Object objN9 = e18Var2.N();
                    if (zF7 || objN9 == lz1Var) {
                        objN9 = m7fVarN7.a(jce.a.b(b.class), null, null);
                        e18Var2.k0(objN9);
                    }
                    e18Var2.p(false);
                    e18Var2.p(false);
                    b bVar2 = (b) objN9;
                    m7f m7fVarN8 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                    boolean zF8 = e18Var2.f(null) | e18Var2.f(m7fVarN8);
                    Object objN10 = e18Var2.N();
                    if (zF8 || objN10 == lz1Var) {
                        objN10 = m7fVarN8.a(jce.a.b(z93.class), null, null);
                        e18Var2.k0(objN10);
                    }
                    e18Var2.p(false);
                    e18Var2.p(false);
                    z93 z93Var2 = (z93) objN10;
                    m7f m7fVarN9 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                    boolean zF9 = e18Var2.f(null) | e18Var2.f(m7fVarN9);
                    Object objN11 = e18Var2.N();
                    if (zF9 || objN11 == lz1Var) {
                        Object objA = m7fVarN9.a(jce.a.b(zf6.class), null, null);
                        e18Var2.k0(objA);
                        objN11 = objA;
                    }
                    e18Var2.p(false);
                    e18Var2.p(false);
                    zf6 zf6Var = (zf6) objN11;
                    me6 me6Var = qzbVar2.f() ? null : me6.a;
                    Boolean boolValueOf = Boolean.valueOf(qzbVar2.f());
                    boolean zH3 = e18Var2.h(qzbVar2) | e18Var2.h(zf6Var);
                    Object objN12 = e18Var2.N();
                    int i5 = 4;
                    if (zH3 || objN12 == lz1Var) {
                        b1iVar = b1iVar2;
                        objN12 = new zw(qzbVar2, zf6Var, null, i5);
                        e18Var2.k0(objN12);
                    } else {
                        b1iVar = b1iVar2;
                    }
                    oe6 oe6Var = (oe6) mpk.S(me6Var, boolValueOf, (pz7) objN12, e18Var2, 0).getValue();
                    if (oe6Var != null) {
                        boolean zH4 = e18Var2.h(oe6Var) | e18Var2.h(qzbVar2) | e18Var2.f(nf7Var) | e18Var2.h(rc8Var) | e18Var2.d(ye3Var.ordinal()) | e18Var2.h(z93Var2);
                        Object objN13 = e18Var2.N();
                        if (zH4 || objN13 == lz1Var) {
                            objN13 = new s63(oe6Var, qzbVar2, nf7Var, rc8Var, ye3Var, z93Var2, 2);
                            qzbVar = qzbVar2;
                            z93Var = z93Var2;
                            e18Var2.k0(objN13);
                        } else {
                            qzbVar = qzbVar2;
                            z93Var = z93Var2;
                        }
                        zy7 zy7Var2 = (zy7) objN13;
                        kce kceVar = jce.a;
                        String strC = ij0.C(oq5.B(kceVar.b(ClaudeAppDestination.List.class)), oq5.B(kceVar.b(ClaudeAppDestination.Detail.class)), oq5.B(kceVar.b(ClaudeAppDestination.Extra.class)));
                        KSerializer kSerializerM = iv1.M(kceVar.b(ClaudeAppDestination.List.class));
                        KSerializer kSerializerM2 = iv1.M(kceVar.b(ClaudeAppDestination.Detail.class));
                        KSerializer kSerializerM3 = iv1.M(kceVar.b(ClaudeAppDestination.Extra.class));
                        kceVar.b(ClaudeAppDestination.List.class);
                        kceVar.b(ClaudeAppDestination.Detail.class);
                        kceVar.b(ClaudeAppDestination.Extra.class);
                        zy7Var2.getClass();
                        swe sweVar = (swe) e18Var2.j(twe.a);
                        String str = ((Object) strC) + ".router";
                        r7i r7iVar = (kSerializerM == null || kSerializerM2 == null || kSerializerM3 == null) ? null : new r7i(kSerializerM, kSerializerM2, kSerializerM3);
                        boolean zF10 = e18Var2.f(str) | e18Var2.f(sweVar);
                        Object objN14 = e18Var2.N();
                        if (zF10 || objN14 == lz1Var) {
                            zqc zqcVar = (zqc) sweVar.b.get(str);
                            if (zqcVar == null) {
                                tk5 tk5Var = new tk5(11);
                                bVar = bVar2;
                                zqc zqcVar2 = new zqc(tk5Var, ez1.q(com.arkivanov.decompose.router.children.b.a(sweVar, tk5Var, str, new px2(4, zy7Var2), new a2(7, new we3(r7iVar, 0)), new a2(8, new we3(r7iVar, 1)), new s03(4), new s03(5), new vu2(2, new s03(3)), new xe3(0), new a73(10), new m63(new y1c(19), new y1c(20), new y1c(21), 3)), sweVar.a.a()));
                                sweVar.b.put(str, zqcVar2);
                                objN14 = zqcVar2;
                            } else {
                                bVar = bVar2;
                                objN14 = zqcVar;
                            }
                            e18Var2.k0(objN14);
                        } else {
                            bVar = bVar2;
                        }
                        final zqc zqcVar3 = (zqc) objN14;
                        Object objN15 = e18Var2.N();
                        if (objN15 == lz1Var) {
                            objN15 = new w53(28);
                            e18Var2.k0(objN15);
                        }
                        String strB = oq5.B(kceVar.b(ClaudeAppOverlay.class));
                        KSerializer kSerializerM4 = iv1.M(kceVar.b(ClaudeAppOverlay.class));
                        pl9 pl9VarB = kceVar.b(ClaudeAppOverlay.class);
                        b1i b1iVar3 = b1iVar;
                        int i6 = 10;
                        rwe rweVarP = eve.P(pl9VarB, strB, true, kSerializerM4, (zy7) objN15, e18Var2);
                        x44.q0(rweVarP, e18Var2);
                        x44.e(zqcVar3, e18Var2, 0);
                        List list = qzb.n;
                        l1.a(zqcVar3, nf7Var, qzbVar, e18Var2, 512);
                        Object objN16 = e18Var2.N();
                        if (objN16 == lz1Var) {
                            objN16 = sq6.p(e18Var2);
                        }
                        ybg ybgVar = (ybg) objN16;
                        boolean zH5 = e18Var2.h(rweVarP);
                        Object objN17 = e18Var2.N();
                        if (zH5 || objN17 == lz1Var) {
                            objN17 = new kj3(rweVarP, 9);
                            e18Var2.k0(objN17);
                        }
                        iqb iqbVar = this.I;
                        zy7 zy7Var3 = this.F;
                        e3g.a((zy7) objN17, fd9.q0(1687402957, new gk3(iqbVar, rweVarP, zqcVar3, zy7Var3, kqcVarI), e18Var2), e18Var2, 48);
                        iv1.c(ybgVar, mpk.k0(mpk.k0(androidx.compose.foundation.layout.b.y(androidx.compose.foundation.layout.b.c, lja.N, 2), mpk.o), mpk.n), e18Var2, 6, 0);
                        boolean zH6 = e18Var2.h(rweVarP);
                        Object objN18 = e18Var2.N();
                        if (zH6 || objN18 == lz1Var) {
                            objN18 = new kj3(rweVarP, i6);
                            e18Var2.k0(objN18);
                        }
                        zy7 zy7Var4 = (zy7) objN18;
                        boolean zH7 = e18Var2.h(rweVarP);
                        Object objN19 = e18Var2.N();
                        if (zH7 || objN19 == lz1Var) {
                            objN19 = new kj3(rweVarP, 11);
                            e18Var2.k0(objN19);
                        }
                        d4c.z(ybgVar, zy7Var4, (zy7) objN19, null, e18Var2, 6);
                        boolean zH8 = e18Var2.h(zqcVar3) | e18Var2.h(z93Var);
                        Object objN20 = e18Var2.N();
                        if (zH8 || objN20 == lz1Var) {
                            objN20 = new fj3(zqcVar3, z93Var, 1);
                            e18Var2.k0(objN20);
                        }
                        n0.n(null, null, (zy7) objN20, e18Var2, 0);
                        boolean zH9 = e18Var2.h(zqcVar3);
                        Object objN21 = e18Var2.N();
                        if (zH9 || objN21 == lz1Var) {
                            i = 7;
                            objN21 = new hj3(zqcVar3, i);
                            e18Var2.k0(objN21);
                        } else {
                            i = 7;
                        }
                        n0.d(null, null, null, null, null, null, (bz7) objN21, e18Var2, 0);
                        boolean zH10 = e18Var2.h(rweVarP);
                        Object objN22 = e18Var2.N();
                        if (zH10 || objN22 == lz1Var) {
                            objN22 = new x13(rweVarP, i);
                            e18Var2.k0(objN22);
                        }
                        n0.c(null, null, (pz7) objN22, e18Var2, 0);
                        boolean zH11 = e18Var2.h(rweVarP);
                        Object objN23 = e18Var2.N();
                        if (zH11 || objN23 == lz1Var) {
                            objN23 = new m0(rweVarP);
                            e18Var2.k0(objN23);
                        }
                        n0.l(null, (bz7) objN23, e18Var2, 0);
                        boolean zH12 = e18Var2.h(rweVarP);
                        Object objN24 = e18Var2.N();
                        if (zH12 || objN24 == lz1Var) {
                            objN24 = new kj3(rweVarP, 12);
                            e18Var2.k0(objN24);
                        }
                        zy7 zy7Var5 = (zy7) objN24;
                        boolean zH13 = e18Var2.h(rweVarP);
                        Object objN25 = e18Var2.N();
                        if (zH13 || objN25 == lz1Var) {
                            objN25 = new f13(rweVarP, 11);
                            e18Var2.k0(objN25);
                        }
                        n0.o(zy7Var5, (bz7) objN25, zy7Var3, null, null, null, null, e18Var2, 0);
                        boolean zH14 = e18Var2.h(qzbVar) | e18Var2.h(zqcVar3);
                        Object objN26 = e18Var2.N();
                        if (zH14 || objN26 == lz1Var) {
                            objN26 = new o5(qzbVar, 22, zqcVar3);
                            e18Var2.k0(objN26);
                        }
                        n0.e(null, null, null, null, null, (bz7) objN26, e18Var2, 0);
                        b bVar3 = bVar;
                        boolean zH15 = e18Var2.h(qzbVar) | e18Var2.h(zqcVar3) | e18Var2.f(bVar3);
                        Context context = this.G;
                        boolean zH16 = zH15 | e18Var2.h(context);
                        Object objN27 = e18Var2.N();
                        if (zH16 || objN27 == lz1Var) {
                            objN27 = new j0(qzbVar, zqcVar3, bVar3, ybgVar, context, null);
                            e18Var2.k0(objN27);
                        }
                        final int i7 = 0;
                        n0.m(null, (pz7) objN27, e18Var2, 0);
                        boolean zH17 = e18Var2.h(qzbVar) | e18Var2.h(zqcVar3);
                        Object objN28 = e18Var2.N();
                        if (zH17 || objN28 == lz1Var) {
                            objN28 = new zy7() { // from class: ek3
                                @Override // defpackage.zy7
                                public final Object a() {
                                    int i8 = i7;
                                    iei ieiVar2 = iei.a;
                                    zqc zqcVar4 = zqcVar3;
                                    qzb qzbVar3 = qzbVar;
                                    switch (i8) {
                                        case 0:
                                            if (qzbVar3.d()) {
                                                ClaudeAppDestination.List.CodeRemote codeRemote = ClaudeAppDestination.List.CodeRemote.INSTANCE;
                                                pj3 pj3Var = pj3.Z;
                                                zqcVar4.E.m(new qj3(codeRemote, zqcVar4, 13), pj3Var);
                                            }
                                            break;
                                        default:
                                            if (qzbVar3.e()) {
                                                ClaudeAppDestination.List.CoworkRemote coworkRemote = ClaudeAppDestination.List.CoworkRemote.INSTANCE;
                                                pj3 pj3Var2 = pj3.a0;
                                                zqcVar4.E.m(new qj3(coworkRemote, zqcVar4, 14), pj3Var2);
                                            }
                                            break;
                                    }
                                    return ieiVar2;
                                }
                            };
                            e18Var2.k0(objN28);
                        }
                        n0.f(null, (zy7) objN28, e18Var2, 0);
                        boolean zH18 = e18Var2.h(qzbVar) | e18Var2.h(zqcVar3);
                        Object objN29 = e18Var2.N();
                        if (zH18 || objN29 == lz1Var) {
                            final int i8 = 1;
                            objN29 = new zy7() { // from class: ek3
                                @Override // defpackage.zy7
                                public final Object a() {
                                    int i82 = i8;
                                    iei ieiVar2 = iei.a;
                                    zqc zqcVar4 = zqcVar3;
                                    qzb qzbVar3 = qzbVar;
                                    switch (i82) {
                                        case 0:
                                            if (qzbVar3.d()) {
                                                ClaudeAppDestination.List.CodeRemote codeRemote = ClaudeAppDestination.List.CodeRemote.INSTANCE;
                                                pj3 pj3Var = pj3.Z;
                                                zqcVar4.E.m(new qj3(codeRemote, zqcVar4, 13), pj3Var);
                                            }
                                            break;
                                        default:
                                            if (qzbVar3.e()) {
                                                ClaudeAppDestination.List.CoworkRemote coworkRemote = ClaudeAppDestination.List.CoworkRemote.INSTANCE;
                                                pj3 pj3Var2 = pj3.a0;
                                                zqcVar4.E.m(new qj3(coworkRemote, zqcVar4, 14), pj3Var2);
                                            }
                                            break;
                                    }
                                    return ieiVar2;
                                }
                            };
                            e18Var2.k0(objN29);
                        }
                        n0.h(null, (zy7) objN29, e18Var2, 0);
                        boolean zH19 = e18Var2.h(qzbVar) | e18Var2.h(slVar) | e18Var2.h(zqcVar3);
                        Object objN30 = e18Var2.N();
                        if (zH19 || objN30 == lz1Var) {
                            objN30 = new k0(qzbVar, zqcVar3, slVar);
                            e18Var2.k0(objN30);
                        }
                        n0.i(null, null, null, null, null, (bz7) objN30, e18Var2, 0);
                        n0.b(null, null, e18Var2, 0);
                        boolean zH20 = e18Var2.h(zqcVar3);
                        Object objN31 = e18Var2.N();
                        if (zH20 || objN31 == lz1Var) {
                            objN31 = new gj3(zqcVar3, 5);
                            e18Var2.k0(objN31);
                        }
                        n0.g(null, null, null, null, null, (zy7) objN31, e18Var2, 0);
                        boolean zH21 = e18Var2.h(zqcVar3);
                        Object objN32 = e18Var2.N();
                        if (zH21 || objN32 == lz1Var) {
                            objN32 = new l0(zqcVar3);
                            e18Var2.k0(objN32);
                        }
                        n0.j(null, (bz7) objN32, e18Var2, 0);
                        boolean zH22 = e18Var2.h(taeVar) | e18Var2.h(b1iVar3) | e18Var2.h(zqcVar3);
                        Object objN33 = e18Var2.N();
                        if (zH22 || objN33 == lz1Var) {
                            objN33 = new nf1(taeVar, b1iVar3, zqcVar3, i);
                            e18Var2.k0(objN33);
                        }
                        n0.k(null, (bz7) objN33, e18Var2, 0);
                        nwb nwbVar = this.H;
                        if (((String) nwbVar.getValue()).length() <= 0) {
                            e18Var2.a0(-471148600);
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(-471304282);
                            String str2 = (String) nwbVar.getValue();
                            boolean zF11 = e18Var2.f(nwbVar);
                            Object objN34 = e18Var2.N();
                            if (zF11 || objN34 == lz1Var) {
                                objN34 = new fg1(6, nwbVar);
                                e18Var2.k0(objN34);
                            }
                            skk.a(str2, (zy7) objN34, e18Var2, 0);
                            e18Var2.p(false);
                        }
                        break;
                    }
                }
                break;
        }
        return ieiVar;
    }
}
