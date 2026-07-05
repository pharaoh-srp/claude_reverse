package com.anthropic.claude.app.main;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.anthropic.claude.app.main.MainAppScreens;
import com.anthropic.claude.login.WelcomeNotice;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.ab0;
import defpackage.ae5;
import defpackage.af2;
import defpackage.bz7;
import defpackage.csg;
import defpackage.dk0;
import defpackage.e18;
import defpackage.eli;
import defpackage.es0;
import defpackage.eve;
import defpackage.ez1;
import defpackage.f4c;
import defpackage.f73;
import defpackage.fd9;
import defpackage.fk0;
import defpackage.ft9;
import defpackage.g78;
import defpackage.gf8;
import defpackage.gr9;
import defpackage.gu5;
import defpackage.hvd;
import defpackage.hx2;
import defpackage.ia0;
import defpackage.iei;
import defpackage.il3;
import defpackage.im6;
import defpackage.iqb;
import defpackage.iv1;
import defpackage.j8;
import defpackage.j9;
import defpackage.jce;
import defpackage.jd4;
import defpackage.jga;
import defpackage.jj;
import defpackage.kce;
import defpackage.kd7;
import defpackage.kgh;
import defpackage.kj3;
import defpackage.km3;
import defpackage.l45;
import defpackage.ld4;
import defpackage.lm3;
import defpackage.lsc;
import defpackage.lz1;
import defpackage.lz9;
import defpackage.m63;
import defpackage.m7f;
import defpackage.mdg;
import defpackage.mpk;
import defpackage.mr9;
import defpackage.mwa;
import defpackage.ny4;
import defpackage.o7f;
import defpackage.oai;
import defpackage.ol3;
import defpackage.olh;
import defpackage.oq5;
import defpackage.oyk;
import defpackage.p7f;
import defpackage.ppa;
import defpackage.ps7;
import defpackage.pz7;
import defpackage.q7f;
import defpackage.ql3;
import defpackage.r7e;
import defpackage.rwe;
import defpackage.rz7;
import defpackage.sq6;
import defpackage.swe;
import defpackage.sz7;
import defpackage.ta4;
import defpackage.tca;
import defpackage.tu2;
import defpackage.twe;
import defpackage.u2a;
import defpackage.umg;
import defpackage.vc8;
import defpackage.ve4;
import defpackage.vk3;
import defpackage.w00;
import defpackage.w59;
import defpackage.w7;
import defpackage.x13;
import defpackage.x44;
import defpackage.xah;
import defpackage.xja;
import defpackage.zy1;
import defpackage.zy7;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final void a(final zy7 zy7Var, swe sweVar, final iqb iqbVar, fk0 fk0Var, u2a u2aVar, g78 g78Var, w59 w59Var, ld4 ld4Var, int i) {
        fk0 fk0Var2;
        u2a u2aVar2;
        g78 g78Var2;
        w59 w59Var2;
        final fk0 fk0Var3;
        u2a u2aVar3;
        g78 g78Var3;
        w59 w59Var3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2091474201);
        int i2 = i | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.f(sweVar) ? 32 : 16) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 599040;
        if (e18Var.Q(i2 & 1, (599187 & i2) != 599186)) {
            e18Var.V();
            int i3 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(fk0.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                fk0Var3 = (fk0) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(u2a.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                u2aVar3 = (u2a) objN2;
                m7f m7fVarN3 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF3 = e18Var.f(null) | e18Var.f(m7fVarN3);
                Object objN3 = e18Var.N();
                if (zF3 || objN3 == lz1Var) {
                    objN3 = m7fVarN3.a(jce.a.b(g78.class), null, null);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                e18Var.p(false);
                g78Var3 = (g78) objN3;
                m7f m7fVarN4 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF4 = e18Var.f(null) | e18Var.f(m7fVarN4);
                Object objN4 = e18Var.N();
                if (zF4 || objN4 == lz1Var) {
                    objN4 = m7fVarN4.a(jce.a.b(w59.class), null, null);
                    e18Var.k0(objN4);
                }
                e18Var.p(false);
                e18Var.p(false);
                w59Var3 = (w59) objN4;
            } else {
                e18Var.T();
                fk0Var3 = fk0Var;
                u2aVar3 = u2aVar;
                g78Var3 = g78Var;
                w59Var3 = w59Var;
            }
            e18Var.q();
            boolean zH = e18Var.h(u2aVar3) | e18Var.h(w59Var3);
            Object objN5 = e18Var.N();
            if (zH || objN5 == lz1Var) {
                objN5 = new ab0(u2aVar3, w59Var3, null, 13);
                e18Var.k0(objN5);
            }
            iei ieiVar = iei.a;
            fd9.i(e18Var, (pz7) objN5, ieiVar);
            Object objN6 = e18Var.N();
            if (objN6 == lz1Var) {
                objN6 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN6);
            }
            l45 l45Var = (l45) objN6;
            boolean zH2 = e18Var.h(l45Var) | e18Var.h(g78Var3);
            Object objN7 = e18Var.N();
            if (zH2 || objN7 == lz1Var) {
                objN7 = new vk3(l45Var, 16, g78Var3);
                e18Var.k0(objN7);
            }
            mwa.d(ieiVar, null, (bz7) objN7, e18Var, 6);
            j8.c(twe.a.a(sweVar), fd9.q0(230487591, new pz7() { // from class: com.anthropic.claude.app.main.g
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    Object obj3;
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        m7f m7fVar = (m7f) e18Var2.j(gr9.b);
                        boolean zH3 = e18Var2.h(m7fVar);
                        fk0 fk0Var4 = fk0Var3;
                        boolean zH4 = zH3 | e18Var2.h(fk0Var4);
                        Object objN8 = e18Var2.N();
                        lz1 lz1Var2 = jd4.a;
                        if (zH4 || objN8 == lz1Var2) {
                            objN8 = new vc8(m7fVar, 13, fk0Var4);
                            e18Var2.k0(objN8);
                        }
                        kce kceVar = jce.a;
                        final rwe rweVarP = eve.P(kceVar.b(MainAppScreens.class), oq5.B(kceVar.b(MainAppScreens.class)), true, iv1.M(kceVar.b(MainAppScreens.class)), (zy7) objN8, e18Var2);
                        x44.q0(rweVarP, e18Var2);
                        boolean zH5 = e18Var2.h(rweVarP);
                        Object objN9 = e18Var2.N();
                        if (zH5 || objN9 == lz1Var2) {
                            objN9 = new zy7() { // from class: com.anthropic.claude.app.main.h
                                @Override // defpackage.zy7
                                public final Object a() {
                                    rweVarP.E.m(new jga(9, new MainAppScreens[]{MainAppScreens.RequiredUpdate.INSTANCE}), new ae5(28));
                                    return iei.a;
                                }
                            };
                            e18Var2.k0(objN9);
                        }
                        ez1.j((zy7) objN9, null, null, e18Var2, 0);
                        if (fk0Var4.n()) {
                            e18Var2.a0(-1839662930);
                            obj3 = (gf8) e18Var2.j(ve4.l);
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(-1839662505);
                            e18Var2.p(false);
                            obj3 = f4c.a;
                        }
                        km3 km3VarA = oai.a(((dk0) fk0Var4.u.getValue()) == dk0.H, e18Var2, 0);
                        Context context = (Context) e18Var2.j(w00.b);
                        umg umgVar = ve4.t;
                        eli eliVar = (eli) e18Var2.j(umgVar);
                        boolean zF5 = e18Var2.f(eliVar) | e18Var2.f(context);
                        Object objN10 = e18Var2.N();
                        if (zF5 || objN10 == lz1Var2) {
                            objN10 = new lm3(eliVar, context, 4);
                            e18Var2.k0(objN10);
                        }
                        lm3 lm3Var = (lm3) objN10;
                        boolean zF6 = e18Var2.f(eliVar);
                        Object objN11 = e18Var2.N();
                        if (zF6 || objN11 == lz1Var2) {
                            objN11 = new lm3(eliVar, (Context) null, 6);
                            e18Var2.k0(objN11);
                        }
                        lm3 lm3Var2 = (lm3) objN11;
                        umg umgVar2 = ve4.i;
                        ps7 ps7Var = (ps7) e18Var2.j(umgVar2);
                        boolean zF7 = e18Var2.f(ps7Var);
                        Object objN12 = e18Var2.N();
                        if (zF7 || objN12 == lz1Var2) {
                            objN12 = new ol3(ps7Var);
                            e18Var2.k0(objN12);
                        }
                        j8.d(new hvd[]{ve4.l.a(obj3), olh.c.a(km3VarA), il3.a.a(af2.a), umgVar.a(lm3Var), kd7.a.a(lm3Var2), umgVar2.a((ol3) objN12)}, fd9.q0(-881280665, new f73(rweVarP, zy7Var, iqbVar, fk0Var4), e18Var2), e18Var2, 48);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, 56);
            w59Var2 = w59Var3;
            fk0Var2 = fk0Var3;
            u2aVar2 = u2aVar3;
            g78Var2 = g78Var3;
        } else {
            e18Var.T();
            fk0Var2 = fk0Var;
            u2aVar2 = u2aVar;
            g78Var2 = g78Var;
            w59Var2 = w59Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hx2(zy7Var, sweVar, iqbVar, fk0Var2, u2aVar2, g78Var2, w59Var2, i);
        }
    }

    public static final void b(final rwe rweVar, final zy7 zy7Var, final iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1573772245);
        int i2 = (e18Var.f(rweVar) ? 4 : 2) | i | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            mwa.l(rweVar, iqbVar, csg.q(rweVar, e18Var, i3 | 384), fd9.q0(813628073, new sz7() { // from class: com.anthropic.claude.app.main.a
                @Override // defpackage.sz7
                public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
                    final MainAppScreens mainAppScreens = (MainAppScreens) obj2;
                    ld4 ld4Var2 = (ld4) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((ia0) obj).getClass();
                    mainAppScreens.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= (iIntValue & 64) == 0 ? ((e18) ld4Var2).f(mainAppScreens) : ((e18) ld4Var2).h(mainAppScreens) ? 32 : 16;
                    }
                    e18 e18Var2 = (e18) ld4Var2;
                    boolean zQ = e18Var2.Q(iIntValue & 1, (iIntValue & 145) != 144);
                    iei ieiVar = iei.a;
                    if (!zQ) {
                        e18Var2.T();
                        return ieiVar;
                    }
                    boolean z = mainAppScreens instanceof MainAppScreens.LoggedOut;
                    final zy7 zy7Var2 = zy7Var;
                    final rwe rweVar2 = rweVar;
                    lz1 lz1Var = jd4.a;
                    if (z) {
                        e18Var2.a0(-2001402042);
                        boolean zH = e18Var2.h(rweVar2);
                        Object objN = e18Var2.N();
                        if (zH || objN == lz1Var) {
                            objN = new kj3(rweVar2, 28);
                            e18Var2.k0(objN);
                        }
                        zy7 zy7Var3 = (zy7) objN;
                        boolean zH2 = e18Var2.h(rweVar2);
                        Object objN2 = e18Var2.N();
                        if (zH2 || objN2 == lz1Var) {
                            objN2 = new i(rweVar2);
                            e18Var2.k0(objN2);
                        }
                        com.anthropic.claude.app.main.loggedout.b.a(zy7Var2, zy7Var3, (rz7) objN2, ((MainAppScreens.LoggedOut) mainAppScreens).getNotice(), e18Var2, 0);
                        e18Var2.p(false);
                        return ieiVar;
                    }
                    boolean z2 = mainAppScreens instanceof MainAppScreens.LoggedIn;
                    final iqb iqbVar2 = iqbVar;
                    if (z2) {
                        e18Var2.a0(-2000731233);
                        e18Var2.a0(-1168520582);
                        m7f m7fVarB = gr9.b(e18Var2);
                        e18Var2.a0(-1633490746);
                        boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarB);
                        Object objN3 = e18Var2.N();
                        if (zF || objN3 == lz1Var) {
                            objN3 = m7fVarB.a(jce.a.b(fk0.class), null, null);
                            e18Var2.k0(objN3);
                        }
                        e18Var2.p(false);
                        e18Var2.p(false);
                        final fk0 fk0Var = (fk0) objN3;
                        m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                        boolean zF2 = e18Var2.f(null) | e18Var2.f(m7fVarN);
                        Object objN4 = e18Var2.N();
                        if (zF2 || objN4 == lz1Var) {
                            objN4 = m7fVarN.a(jce.a.b(w7.class), null, null);
                            e18Var2.k0(objN4);
                        }
                        e18Var2.p(false);
                        e18Var2.p(false);
                        final w7 w7Var = (w7) objN4;
                        final Context context = (Context) e18Var2.j(w00.b);
                        p7f p7fVar = new p7f(((MainAppScreens.LoggedIn) mainAppScreens).m501getAccountIdislZJdo());
                        ta4 ta4VarQ0 = fd9.q0(157318620, new rz7() { // from class: com.anthropic.claude.app.main.b
                            @Override // defpackage.rz7
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                Object jVar;
                                Context context2;
                                final MainAppScreens mainAppScreens2;
                                final j9 j9Var;
                                rwe rweVar3;
                                final zy7 zy7Var4 = (zy7) obj5;
                                ld4 ld4Var3 = (ld4) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                zy7Var4.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= ((e18) ld4Var3).h(zy7Var4) ? 4 : 2;
                                }
                                e18 e18Var3 = (e18) ld4Var3;
                                if (e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    m7f m7fVarN2 = sq6.n(e18Var3, -1168520582, e18Var3, -1633490746);
                                    boolean zF3 = e18Var3.f(null) | e18Var3.f(m7fVarN2);
                                    Object objN5 = e18Var3.N();
                                    lz1 lz1Var2 = jd4.a;
                                    if (zF3 || objN5 == lz1Var2) {
                                        objN5 = m7fVarN2.a(jce.a.b(j9.class), null, null);
                                        e18Var3.k0(objN5);
                                    }
                                    e18Var3.p(false);
                                    e18Var3.p(false);
                                    j9 j9Var2 = (j9) objN5;
                                    zy1 zy1Var = w7Var.a;
                                    MainAppScreens mainAppScreens3 = mainAppScreens;
                                    boolean zH3 = e18Var3.h(mainAppScreens3) | e18Var3.h(j9Var2);
                                    int i4 = iIntValue2 & 14;
                                    boolean z3 = i4 == 4;
                                    Context context3 = context;
                                    boolean zH4 = zH3 | z3 | e18Var3.h(context3);
                                    rwe rweVar4 = rweVar2;
                                    boolean zH5 = zH4 | e18Var3.h(rweVar4);
                                    Object objN6 = e18Var3.N();
                                    if (zH5 || objN6 == lz1Var2) {
                                        context2 = context3;
                                        jVar = new j(mainAppScreens3, j9Var2, zy7Var4, rweVar4, context2, null);
                                        mainAppScreens2 = mainAppScreens3;
                                        j9Var = j9Var2;
                                        zy7Var4 = zy7Var4;
                                        rweVar3 = rweVar4;
                                        e18Var3.k0(jVar);
                                    } else {
                                        jVar = objN6;
                                        rweVar3 = rweVar4;
                                        mainAppScreens2 = mainAppScreens3;
                                        j9Var = j9Var2;
                                        context2 = context3;
                                    }
                                    x44.b(zy1Var, (pz7) jVar, e18Var3, 0);
                                    MainAppScreens.LoggedIn loggedIn = (MainAppScreens.LoggedIn) mainAppScreens2;
                                    String strM502getInitialOrganizationIdQUMPZR0 = loggedIn.m502getInitialOrganizationIdQUMPZR0();
                                    jj ageSignalsResult = loggedIn.getAgeSignalsResult();
                                    boolean zH6 = e18Var3.h(j9Var) | (i4 == 4);
                                    final fk0 fk0Var2 = fk0Var;
                                    boolean zH7 = zH6 | e18Var3.h(fk0Var2) | e18Var3.h(mainAppScreens2) | e18Var3.h(context2) | e18Var3.h(rweVar3);
                                    Object objN7 = e18Var3.N();
                                    if (zH7 || objN7 == lz1Var2) {
                                        final Context context4 = context2;
                                        final rwe rweVar5 = rweVar3;
                                        bz7 bz7Var = new bz7() { // from class: com.anthropic.claude.app.main.d
                                            @Override // defpackage.bz7
                                            public final Object invoke(Object obj8) {
                                                xja xjaVar = (xja) obj8;
                                                xjaVar.getClass();
                                                int iOrdinal = xjaVar.ordinal();
                                                WelcomeNotice welcomeNotice = null;
                                                if (iOrdinal != 0) {
                                                    if (iOrdinal == 1) {
                                                        welcomeNotice = WelcomeNotice.SessionExpired;
                                                    } else {
                                                        if (iOrdinal != 2) {
                                                            mr9.b();
                                                            return null;
                                                        }
                                                        welcomeNotice = WelcomeNotice.AccountRestricted;
                                                    }
                                                }
                                                l.c(j9Var, zy7Var4, fk0Var2, mainAppScreens2, rweVar5, context4, welcomeNotice);
                                                return iei.a;
                                            }
                                        };
                                        fk0Var2 = fk0Var2;
                                        rweVar3 = rweVar5;
                                        context2 = context4;
                                        e18Var3.k0(bz7Var);
                                        objN7 = bz7Var;
                                    }
                                    bz7 bz7Var2 = (bz7) objN7;
                                    boolean zH8 = e18Var3.h(j9Var) | (i4 == 4) | e18Var3.h(fk0Var2) | e18Var3.h(mainAppScreens2) | e18Var3.h(context2) | e18Var3.h(rweVar3);
                                    Object objN8 = e18Var3.N();
                                    if (zH8 || objN8 == lz1Var2) {
                                        final Context context5 = context2;
                                        final rwe rweVar6 = rweVar3;
                                        final fk0 fk0Var3 = fk0Var2;
                                        zy7 zy7Var5 = new zy7() { // from class: com.anthropic.claude.app.main.e
                                            @Override // defpackage.zy7
                                            public final Object a() {
                                                l.c(j9Var, zy7Var4, fk0Var3, mainAppScreens2, rweVar6, context5, null);
                                                return iei.a;
                                            }
                                        };
                                        rweVar3 = rweVar6;
                                        e18Var3.k0(zy7Var5);
                                        objN8 = zy7Var5;
                                    }
                                    zy7 zy7Var6 = (zy7) objN8;
                                    boolean zH9 = e18Var3.h(rweVar3);
                                    Object objN9 = e18Var3.N();
                                    if (zH9 || objN9 == lz1Var2) {
                                        objN9 = new kj3(rweVar3, 29);
                                        e18Var3.k0(objN9);
                                    }
                                    com.anthropic.claude.app.main.loggedin.i.c(strM502getInitialOrganizationIdQUMPZR0, ageSignalsResult, bz7Var2, zy7Var2, zy7Var6, (zy7) objN9, iqbVar2, null, e18Var3, 0);
                                } else {
                                    e18Var3.T();
                                }
                                return iei.a;
                            }
                        }, e18Var2);
                        m7f m7fVarN2 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                        boolean zF3 = e18Var2.f(null) | e18Var2.f(m7fVarN2);
                        Object objN5 = e18Var2.N();
                        if (zF3 || objN5 == lz1Var) {
                            objN5 = m7fVarN2.a(jce.a.b(ql3.class), null, null);
                            e18Var2.k0(objN5);
                        }
                        e18Var2.p(false);
                        e18Var2.p(false);
                        ql3 ql3Var = (ql3) objN5;
                        boolean zF4 = e18Var2.f(p7fVar);
                        Object objN6 = e18Var2.N();
                        if (zF4 || objN6 == lz1Var) {
                            objN6 = new o7f(ql3Var.c(p7fVar));
                            e18Var2.k0(objN6);
                        }
                        m7f m7fVar = ((o7f) objN6).a;
                        boolean zH3 = e18Var2.h(ql3Var) | e18Var2.h(p7fVar);
                        Object objN7 = e18Var2.N();
                        if (zH3 || objN7 == lz1Var) {
                            objN7 = new vc8(ql3Var, 7, p7fVar);
                            e18Var2.k0(objN7);
                        }
                        x44.h(m7fVar, (zy7) objN7, ta4VarQ0, e18Var2, 384);
                        e18Var2.p(false);
                        return ieiVar;
                    }
                    if (mainAppScreens instanceof MainAppScreens.AddAccount) {
                        e18Var2.a0(-1996028440);
                        boolean zF5 = e18Var2.f(zy7Var2);
                        Object objN8 = e18Var2.N();
                        if (zF5 || objN8 == lz1Var) {
                            objN8 = new es0(zy7Var2, null, 11);
                            e18Var2.k0(objN8);
                        }
                        fd9.i(e18Var2, (pz7) objN8, ieiVar);
                        e18Var2.a0(-1168520582);
                        m7f m7fVarB2 = gr9.b(e18Var2);
                        e18Var2.a0(-1633490746);
                        boolean zF6 = e18Var2.f(null) | e18Var2.f(m7fVarB2);
                        Object objN9 = e18Var2.N();
                        if (zF6 || objN9 == lz1Var) {
                            objN9 = m7fVarB2.a(jce.a.b(fk0.class), null, null);
                            e18Var2.k0(objN9);
                        }
                        e18Var2.p(false);
                        e18Var2.p(false);
                        fk0 fk0Var2 = (fk0) objN9;
                        m7f m7fVarN3 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                        boolean zF7 = e18Var2.f(null) | e18Var2.f(m7fVarN3);
                        Object objN10 = e18Var2.N();
                        if (zF7 || objN10 == lz1Var) {
                            objN10 = m7fVarN3.a(jce.a.b(w7.class), null, null);
                            e18Var2.k0(objN10);
                        }
                        e18Var2.p(false);
                        e18Var2.p(false);
                        Context context2 = (Context) e18Var2.j(w00.b);
                        q7f q7fVar = q7f.a;
                        x44.d(fd9.q0(1442381149, new lz9(fk0Var2, context2, (w7) objN10, rweVar2, 2), e18Var2), e18Var2);
                        e18Var2.p(false);
                        return ieiVar;
                    }
                    if (mainAppScreens instanceof MainAppScreens.StepUpReauth) {
                        e18Var2.a0(-1993343468);
                        boolean zF8 = e18Var2.f(zy7Var2);
                        Object objN11 = e18Var2.N();
                        if (zF8 || objN11 == lz1Var) {
                            objN11 = new es0(zy7Var2, null, 12);
                            e18Var2.k0(objN11);
                        }
                        fd9.i(e18Var2, (pz7) objN11, ieiVar);
                        e18Var2.a0(-1168520582);
                        m7f m7fVarB3 = gr9.b(e18Var2);
                        e18Var2.a0(-1633490746);
                        boolean zF9 = e18Var2.f(null) | e18Var2.f(m7fVarB3);
                        Object objN12 = e18Var2.N();
                        if (zF9 || objN12 == lz1Var) {
                            objN12 = m7fVarB3.a(jce.a.b(fk0.class), null, null);
                            e18Var2.k0(objN12);
                        }
                        e18Var2.p(false);
                        e18Var2.p(false);
                        final fk0 fk0Var3 = (fk0) objN12;
                        m7f m7fVarN4 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                        boolean zF10 = e18Var2.f(null) | e18Var2.f(m7fVarN4);
                        Object objN13 = e18Var2.N();
                        if (zF10 || objN13 == lz1Var) {
                            objN13 = m7fVarN4.a(jce.a.b(w7.class), null, null);
                            e18Var2.k0(objN13);
                        }
                        e18Var2.p(false);
                        e18Var2.p(false);
                        final w7 w7Var2 = (w7) objN13;
                        final Context context3 = (Context) e18Var2.j(w00.b);
                        final Activity activity = (Activity) e18Var2.j(tca.a);
                        q7f q7fVar2 = q7f.a;
                        x44.d(fd9.q0(-1567523618, new rz7() { // from class: com.anthropic.claude.app.main.c
                            @Override // defpackage.rz7
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                zy7 zy7Var4 = (zy7) obj5;
                                ld4 ld4Var3 = (ld4) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                zy7Var4.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= ((e18) ld4Var3).h(zy7Var4) ? 4 : 2;
                                }
                                e18 e18Var3 = (e18) ld4Var3;
                                boolean zQ2 = e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18);
                                iei ieiVar2 = iei.a;
                                if (!zQ2) {
                                    e18Var3.T();
                                    return ieiVar2;
                                }
                                Activity activity2 = activity;
                                boolean zH4 = e18Var3.h(activity2);
                                final w7 w7Var3 = w7Var2;
                                boolean zH5 = zH4 | e18Var3.h(w7Var3) | ((iIntValue2 & 14) == 4);
                                Object objN14 = e18Var3.N();
                                if (zH5 || objN14 == jd4.a) {
                                    objN14 = new ny4(activity2, w7Var3, zy7Var4, 15);
                                    e18Var3.k0(objN14);
                                }
                                fd9.d(ieiVar2, (bz7) objN14, e18Var3);
                                final MainAppScreens mainAppScreens2 = mainAppScreens;
                                final rwe rweVar3 = rweVar2;
                                final fk0 fk0Var4 = fk0Var3;
                                final Context context4 = context3;
                                olh.a(false, null, null, fd9.q0(2029274971, new pz7() { // from class: com.anthropic.claude.app.main.f
                                    @Override // defpackage.pz7
                                    public final Object invoke(Object obj8, Object obj9) {
                                        ld4 ld4Var4 = (ld4) obj8;
                                        int iIntValue3 = ((Integer) obj9).intValue();
                                        e18 e18Var4 = (e18) ld4Var4;
                                        if (e18Var4.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            MainAppScreens mainAppScreens3 = mainAppScreens2;
                                            boolean zH6 = e18Var4.h(mainAppScreens3);
                                            w7 w7Var4 = w7Var3;
                                            boolean zH7 = zH6 | e18Var4.h(w7Var4);
                                            rwe rweVar4 = rweVar3;
                                            boolean zH8 = zH7 | e18Var4.h(rweVar4);
                                            fk0 fk0Var5 = fk0Var4;
                                            boolean zH9 = zH8 | e18Var4.h(fk0Var5);
                                            Context context5 = context4;
                                            boolean zH10 = e18Var4.h(context5) | zH9;
                                            Object objN15 = e18Var4.N();
                                            lz1 lz1Var2 = jd4.a;
                                            if (zH10 || objN15 == lz1Var2) {
                                                k kVar = new k(mainAppScreens3, w7Var4, rweVar4, fk0Var5, context5);
                                                e18Var4.k0(kVar);
                                                objN15 = kVar;
                                            }
                                            rz7 rz7Var = (rz7) objN15;
                                            boolean zH11 = e18Var4.h(w7Var4) | e18Var4.h(rweVar4);
                                            Object objN16 = e18Var4.N();
                                            if (zH11 || objN16 == lz1Var2) {
                                                objN16 = new ft9(w7Var4, 6, rweVar4);
                                                e18Var4.k0(objN16);
                                            }
                                            com.anthropic.claude.login.b.a(rz7Var, null, null, null, (zy7) objN16, null, e18Var4, 0, 46);
                                        } else {
                                            e18Var4.T();
                                        }
                                        return iei.a;
                                    }
                                }, e18Var3), e18Var3, 3072, 7);
                                return ieiVar2;
                            }
                        }, e18Var2), e18Var2);
                        e18Var2.p(false);
                        return ieiVar;
                    }
                    if (mainAppScreens instanceof MainAppScreens.UiDemoApp) {
                        e18Var2.a0(-1989261636);
                        boolean zF11 = e18Var2.f(zy7Var2);
                        Object objN14 = e18Var2.N();
                        if (zF11 || objN14 == lz1Var) {
                            objN14 = new es0(zy7Var2, null, 13);
                            e18Var2.k0(objN14);
                        }
                        fd9.i(e18Var2, (pz7) objN14, ieiVar);
                        oyk.a(iqbVar2, e18Var2, 0);
                        e18Var2.p(false);
                        return ieiVar;
                    }
                    int i4 = 10;
                    if (!(mainAppScreens instanceof MainAppScreens.InternalSettings)) {
                        if (!(mainAppScreens instanceof MainAppScreens.RequiredUpdate)) {
                            throw kgh.s(e18Var2, 212544911, false);
                        }
                        e18Var2.a0(-1987832753);
                        boolean zF12 = e18Var2.f(zy7Var2);
                        Object objN15 = e18Var2.N();
                        if (zF12 || objN15 == lz1Var) {
                            objN15 = new es0(zy7Var2, null, 10);
                            e18Var2.k0(objN15);
                        }
                        fd9.i(e18Var2, (pz7) objN15, ieiVar);
                        olh.a(false, null, null, fd9.q0(460670992, new gu5(iqbVar2), e18Var2), e18Var2, 3072, 7);
                        e18Var2.p(false);
                        return ieiVar;
                    }
                    e18Var2.a0(-1989052417);
                    boolean zF13 = e18Var2.f(zy7Var2);
                    Object objN16 = e18Var2.N();
                    if (zF13 || objN16 == lz1Var) {
                        objN16 = new es0(zy7Var2, null, 14);
                        e18Var2.k0(objN16);
                    }
                    fd9.i(e18Var2, (pz7) objN16, ieiVar);
                    e18Var2.a0(-1168520582);
                    m7f m7fVarB4 = gr9.b(e18Var2);
                    e18Var2.a0(-1633490746);
                    boolean zF14 = e18Var2.f(null) | e18Var2.f(m7fVarB4);
                    Object objN17 = e18Var2.N();
                    if (zF14 || objN17 == lz1Var) {
                        objN17 = m7fVarB4.a(jce.a.b(ql3.class), null, null);
                        e18Var2.k0(objN17);
                    }
                    e18Var2.p(false);
                    e18Var2.p(false);
                    ql3 ql3Var2 = (ql3) objN17;
                    boolean zF15 = e18Var2.f(ql3Var2);
                    Object objN18 = e18Var2.N();
                    if (zF15 || objN18 == lz1Var) {
                        m7f m7fVarD = ql3Var2.d();
                        o7f o7fVar = m7fVarD != null ? new o7f(m7fVarD) : null;
                        e18Var2.k0(o7fVar);
                        objN18 = o7fVar;
                    }
                    o7f o7fVar2 = (o7f) objN18;
                    m7f m7fVar2 = o7fVar2 != null ? o7fVar2.a : null;
                    ta4 ta4VarQ02 = fd9.q0(620621392, new x13(rweVar2, i4), e18Var2);
                    if (m7fVar2 != null) {
                        e18Var2.a0(-1988064633);
                        j8.c(gr9.b.a(m7fVar2), fd9.q0(1661366257, new tu2(ta4VarQ02, 6), e18Var2), e18Var2, 48);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-1987947701);
                        ta4VarQ02.invoke(e18Var2, 6);
                        e18Var2.p(false);
                    }
                    e18Var2.p(false);
                    return ieiVar;
                }
            }, e18Var), e18Var, ((i2 >> 3) & 112) | i3 | 3072, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m63(rweVar, i, zy7Var, iqbVar, 16);
        }
    }

    public static final void c(j9 j9Var, zy7 zy7Var, fk0 fk0Var, MainAppScreens mainAppScreens, rwe rweVar, Context context, WelcomeNotice welcomeNotice) {
        List list = xah.a;
        xah.e(6, "Closing account scope", null, null);
        j9Var.a();
        zy7Var.a();
        String strE = fk0Var.e();
        if (strE == null || AccountId.m946equalsimpl0(strE, ((MainAppScreens.LoggedIn) mainAppScreens).m501getAccountIdislZJdo())) {
            rweVar.E.m(new jga(11, new MainAppScreens[]{new MainAppScreens.LoggedOut(welcomeNotice)}), new ppa(8));
        } else {
            d(context, rweVar, strE);
        }
    }

    public static final void d(Context context, rwe rweVar, String str) {
        context.getClass();
        str.getClass();
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("account_prefs".concat(str), 0);
        sharedPreferences.getClass();
        String string = sharedPreferences.getString("selected_org_id", null);
        String strM1066constructorimpl = string != null ? OrganizationId.m1066constructorimpl(string) : null;
        lsc lscVarP = mpk.P(strM1066constructorimpl != null ? OrganizationId.m1065boximpl(strM1066constructorimpl) : null);
        mpk.P(sharedPreferences.getString("display_email", null));
        mpk.P(sharedPreferences.getString("conway_saved_client_id", null));
        new mdg();
        new mdg();
        OrganizationId organizationId = (OrganizationId) lscVarP.getValue();
        rweVar.E.m(new jga(12, new MainAppScreens[]{new MainAppScreens.LoggedIn(str, organizationId != null ? organizationId.m1071unboximpl() : null, jj.M, null)}), new ppa(9));
    }
}
