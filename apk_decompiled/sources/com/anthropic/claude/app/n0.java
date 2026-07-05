package com.anthropic.claude.app;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.anthropic.claude.analytics.events.PushEvents$ChatNotificationClicked;
import com.anthropic.claude.analytics.events.ResearchEvents$ResearchCompletedNotificationClicked;
import com.anthropic.claude.analytics.events.ResearchEvents$ResearchStatusNotificationClicked;
import com.anthropic.claude.api.account.Organization;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.types.strings.OrganizationId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.a2;
import defpackage.ahc;
import defpackage.b0g;
import defpackage.bhc;
import defpackage.blg;
import defpackage.bz7;
import defpackage.bzd;
import defpackage.chc;
import defpackage.cm;
import defpackage.dhc;
import defpackage.dkc;
import defpackage.e18;
import defpackage.ehc;
import defpackage.fd9;
import defpackage.fg1;
import defpackage.fhc;
import defpackage.g03;
import defpackage.g09;
import defpackage.ghc;
import defpackage.gr9;
import defpackage.hb1;
import defpackage.hhc;
import defpackage.hk3;
import defpackage.hx2;
import defpackage.iei;
import defpackage.ihc;
import defpackage.ik3;
import defpackage.im6;
import defpackage.iqb;
import defpackage.iuj;
import defpackage.j8;
import defpackage.j8f;
import defpackage.jce;
import defpackage.jd4;
import defpackage.jhc;
import defpackage.ju1;
import defpackage.ka0;
import defpackage.ka1;
import defpackage.kce;
import defpackage.kk3;
import defpackage.koi;
import defpackage.l45;
import defpackage.l80;
import defpackage.ld4;
import defpackage.lz1;
import defpackage.m63;
import defpackage.m7f;
import defpackage.mpk;
import defpackage.mwa;
import defpackage.nf1;
import defpackage.no3;
import defpackage.nwb;
import defpackage.o5;
import defpackage.ok3;
import defpackage.oq5;
import defpackage.ow1;
import defpackage.phc;
import defpackage.pl3;
import defpackage.pz7;
import defpackage.q7;
import defpackage.qhc;
import defpackage.qi3;
import defpackage.qua;
import defpackage.r7e;
import defpackage.rhc;
import defpackage.sc8;
import defpackage.shc;
import defpackage.sq6;
import defpackage.tca;
import defpackage.thc;
import defpackage.uhc;
import defpackage.vgc;
import defpackage.vhc;
import defpackage.w00;
import defpackage.w53;
import defpackage.wgc;
import defpackage.whc;
import defpackage.x70;
import defpackage.x89;
import defpackage.yk3;
import defpackage.z93;
import defpackage.zgc;
import defpackage.zkg;
import defpackage.zsj;
import defpackage.zy7;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    public static final void a(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-168029993);
        int i2 = 2;
        int i3 = (e18Var.h(zy7Var) ? 4 : 2) | i | (e18Var.f(iqbVar) ? 32 : 16);
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            m7f m7fVar = (m7f) e18Var.j(gr9.b);
            boolean zH = e18Var.h(m7fVar);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zH || objN == lz1Var) {
                objN = new g03(m7fVar, i4);
                e18Var.k0(objN);
            }
            kce kceVar = jce.a;
            m7f m7fVarB = gr9.b(e18Var);
            boolean zH2 = e18Var.h(m7fVarB);
            Object objN2 = e18Var.N();
            if (zH2 || objN2 == lz1Var) {
                objN2 = new g03(m7fVarB, i2);
                e18Var.k0(objN2);
            }
            yk3 yk3Var = (yk3) fd9.r0(kceVar.b(yk3.class), oq5.B(kceVar.b(yk3.class)), (bz7) objN2, e18Var);
            boolean zF = e18Var.f(yk3Var);
            Object objN3 = e18Var.N();
            if (zF || objN3 == lz1Var) {
                objN3 = new a2(15, yk3Var);
                e18Var.k0(objN3);
            }
            mwa.d(iei.a, null, (bz7) objN3, e18Var, 6);
            Context context = (Context) e18Var.j(w00.b);
            Object[] objArr = new Object[0];
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = new w53(29);
                e18Var.k0(objN4);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN4, e18Var, 48);
            j8.c(no3.a.a(new kk3(context, nwbVar)), fd9.q0(-53337065, new hk3(zy7Var, context, nwbVar, iqbVar, 0), e18Var), e18Var, 48);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ik3(zy7Var, iqbVar, i);
        }
    }

    public static final void b(qua quaVar, bzd bzdVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1868230170);
        int i2 = i | 18;
        int i3 = 18;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(qua.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                qua quaVar2 = (qua) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(bzd.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                bzdVar = (bzd) objN2;
                quaVar = quaVar2;
            } else {
                e18Var.T();
            }
            e18Var.q();
            if (((String) quaVar.a.getValue()) != null) {
                e18Var.a0(-2035953057);
                boolean zH = e18Var.h(quaVar) | e18Var.h(bzdVar);
                Object objN3 = e18Var.N();
                if (zH || objN3 == lz1Var) {
                    objN3 = new o5(quaVar, 28, bzdVar);
                    e18Var.k0(objN3);
                }
                mwa.d(iei.a, null, (bz7) objN3, e18Var, 6);
                e18Var.p(false);
            } else {
                e18Var.a0(-2035729144);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ow1(quaVar, bzdVar, i, i3);
        }
    }

    public static final void c(wgc wgcVar, vgc vgcVar, pz7 pz7Var, ld4 ld4Var, int i) {
        wgc wgcVar2;
        vgc vgcVar2;
        wgc wgcVar3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(134302874);
        int i2 = i | 18 | (e18Var.h(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.V();
            int i3 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(wgc.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                wgc wgcVar4 = (wgc) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(vgc.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                vgcVar = (vgc) objN2;
                wgcVar3 = wgcVar4;
            } else {
                e18Var.T();
                wgcVar3 = wgcVar;
            }
            vgc vgcVar3 = vgcVar;
            e18Var.q();
            Context context = (Context) e18Var.j(w00.b);
            nwb nwbVarZ = mpk.Z(pz7Var, e18Var);
            if (((zgc) wgcVar3.a.getValue()) != null) {
                e18Var.a0(-1892190747);
                boolean zH = e18Var.h(wgcVar3) | e18Var.h(vgcVar3) | e18Var.h(context) | e18Var.f(nwbVarZ);
                Object objN3 = e18Var.N();
                if (zH || objN3 == lz1Var) {
                    x70 x70Var = new x70(wgcVar3, vgcVar3, context, nwbVarZ, 3);
                    e18Var.k0(x70Var);
                    objN3 = x70Var;
                }
                mwa.d(iei.a, null, (bz7) objN3, e18Var, 6);
                e18Var.p(false);
            } else {
                e18Var.a0(-1891449816);
                e18Var.p(false);
            }
            wgcVar2 = wgcVar3;
            vgcVar2 = vgcVar3;
        } else {
            e18Var.T();
            wgcVar2 = wgcVar;
            vgcVar2 = vgcVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m63(wgcVar2, i, vgcVar2, pz7Var, 5);
        }
    }

    public static final void d(bhc bhcVar, qi3 qi3Var, koi koiVar, q7 q7Var, dkc dkcVar, z93 z93Var, bz7 bz7Var, ld4 ld4Var, int i) {
        bhc bhcVar2;
        qi3 qi3Var2;
        koi koiVar2;
        q7 q7Var2;
        dkc dkcVar2;
        z93 z93Var2;
        qi3 qi3Var3;
        dkc dkcVar3;
        z93 z93Var3;
        final bhc bhcVar3;
        final koi koiVar3;
        final q7 q7Var3;
        final z93 z93Var4;
        final qi3 qi3Var4;
        final dkc dkcVar4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1566382235);
        int i2 = i | 74898 | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288);
        if (e18Var.Q(i2 & 1, (599187 & i2) != 599186)) {
            e18Var.V();
            int i3 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(bhc.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                bhc bhcVar4 = (bhc) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3Var3 = (qi3) objN2;
                m7f m7fVarN3 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF3 = e18Var.f(null) | e18Var.f(m7fVarN3);
                Object objN3 = e18Var.N();
                if (zF3 || objN3 == lz1Var) {
                    objN3 = m7fVarN3.a(jce.a.b(koi.class), null, null);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                e18Var.p(false);
                koi koiVar4 = (koi) objN3;
                m7f m7fVarN4 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF4 = e18Var.f(null) | e18Var.f(m7fVarN4);
                Object objN4 = e18Var.N();
                if (zF4 || objN4 == lz1Var) {
                    objN4 = m7fVarN4.a(jce.a.b(q7.class), null, null);
                    e18Var.k0(objN4);
                }
                e18Var.p(false);
                e18Var.p(false);
                q7 q7Var4 = (q7) objN4;
                m7f m7fVarN5 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF5 = e18Var.f(null) | e18Var.f(m7fVarN5);
                Object objN5 = e18Var.N();
                if (zF5 || objN5 == lz1Var) {
                    objN5 = m7fVarN5.a(jce.a.b(dkc.class), null, null);
                    e18Var.k0(objN5);
                }
                e18Var.p(false);
                e18Var.p(false);
                dkcVar3 = (dkc) objN5;
                m7f m7fVarN6 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF6 = e18Var.f(null) | e18Var.f(m7fVarN6);
                Object objN6 = e18Var.N();
                if (zF6 || objN6 == lz1Var) {
                    objN6 = m7fVarN6.a(jce.a.b(z93.class), null, null);
                    e18Var.k0(objN6);
                }
                e18Var.p(false);
                e18Var.p(false);
                z93Var3 = (z93) objN6;
                bhcVar3 = bhcVar4;
                koiVar3 = koiVar4;
                q7Var3 = q7Var4;
            } else {
                e18Var.T();
                bhcVar3 = bhcVar;
                qi3Var3 = qi3Var;
                koiVar3 = koiVar;
                q7Var3 = q7Var;
                dkcVar3 = dkcVar;
                z93Var3 = z93Var;
            }
            e18Var.q();
            final nwb nwbVarZ = mpk.Z(bz7Var, e18Var);
            if (((ahc) bhcVar3.a.getValue()) != null) {
                e18Var.a0(727140960);
                boolean zH = e18Var.h(bhcVar3) | e18Var.f(koiVar3) | e18Var.f(q7Var3) | e18Var.h(dkcVar3) | e18Var.h(qi3Var3) | e18Var.f(nwbVarZ) | e18Var.h(z93Var3);
                Object objN7 = e18Var.N();
                if (zH || objN7 == lz1Var) {
                    z93Var4 = z93Var3;
                    qi3Var4 = qi3Var3;
                    dkcVar4 = dkcVar3;
                    bz7 bz7Var2 = new bz7() { // from class: jk3
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj) {
                            Object next;
                            r4a r4aVar = (r4a) obj;
                            r4aVar.getClass();
                            lsc lscVar = bhcVar3.a;
                            ahc ahcVar = (ahc) lscVar.getValue();
                            if (ahcVar != null) {
                                String str = ahcVar.a;
                                String str2 = ahcVar.c;
                                koi koiVar5 = koiVar3;
                                String str3 = koiVar5.e;
                                if (str2 == null || OrganizationId.m1068equalsimpl0(str3, str2)) {
                                    lscVar.setValue(null);
                                    String str4 = ahcVar.e;
                                    boolean zD = str4 == null ? false : tvk.d(str4, "ResearchService");
                                    qi3 qi3Var5 = qi3Var4;
                                    if (zD) {
                                        qi3Var5.e(new ResearchEvents$ResearchStatusNotificationClicked(str3, str), ResearchEvents$ResearchStatusNotificationClicked.Companion.serializer());
                                    } else {
                                        if (str4 == null ? false : tvk.d(str4, "ResearchPush")) {
                                            qi3Var5.e(new ResearchEvents$ResearchCompletedNotificationClicked(str3, str), ResearchEvents$ResearchCompletedNotificationClicked.Companion.serializer());
                                        } else {
                                            if (str4 != null ? tvk.d(str4, "Notification") : false) {
                                                qi3Var5.e(new PushEvents$ChatNotificationClicked(str3, koiVar5.d, str), PushEvents$ChatNotificationClicked.Companion.serializer());
                                            }
                                        }
                                    }
                                    ((bz7) nwbVarZ.getValue()).invoke(z93.a(z93Var4, str, ahcVar.d, ahcVar.f, 8));
                                } else {
                                    Iterator it = ((List) q7Var3.c.getValue()).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                        if (OrganizationId.m1068equalsimpl0(((Organization) next).m116getUuidXjkXN6I(), str2)) {
                                            break;
                                        }
                                    }
                                    if (((Organization) next) != null) {
                                        dkcVar4.a(str2);
                                    } else {
                                        SilentException.a(new SilentException(ij0.j("Requested organization ID ", OrganizationId.m1070toStringimpl(str2), " is not in the list of organizations with chat")), null, true, 1);
                                    }
                                }
                            }
                            return new le(r4aVar, 9);
                        }
                    };
                    e18Var.k0(bz7Var2);
                    objN7 = bz7Var2;
                } else {
                    z93Var4 = z93Var3;
                    qi3Var4 = qi3Var3;
                    dkcVar4 = dkcVar3;
                }
                mwa.d(iei.a, null, (bz7) objN7, e18Var, 6);
                e18Var.p(false);
            } else {
                z93Var4 = z93Var3;
                qi3Var4 = qi3Var3;
                dkcVar4 = dkcVar3;
                e18Var.a0(729690493);
                e18Var.p(false);
            }
            bhcVar2 = bhcVar3;
            koiVar2 = koiVar3;
            q7Var2 = q7Var3;
            dkcVar2 = dkcVar4;
            qi3Var2 = qi3Var4;
            z93Var2 = z93Var4;
        } else {
            e18Var.T();
            bhcVar2 = bhcVar;
            qi3Var2 = qi3Var;
            koiVar2 = koiVar;
            q7Var2 = q7Var;
            dkcVar2 = dkcVar;
            z93Var2 = z93Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hx2(bhcVar2, qi3Var2, koiVar2, q7Var2, dkcVar2, z93Var2, bz7Var, i);
        }
    }

    public static final void e(dhc dhcVar, qi3 qi3Var, koi koiVar, q7 q7Var, dkc dkcVar, bz7 bz7Var, ld4 ld4Var, int i) {
        dhc dhcVar2;
        qi3 qi3Var2;
        koi koiVar2;
        q7 q7Var2;
        dkc dkcVar2;
        qi3 qi3Var3;
        dkc dkcVar3;
        dhc dhcVar3;
        koi koiVar3;
        q7 q7Var3;
        dkc dkcVar4;
        qi3 qi3Var4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1859390207);
        int i2 = i | 9362 | (e18Var.h(bz7Var) ? 131072 : 65536);
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            e18Var.V();
            int i3 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(dhc.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                dhc dhcVar4 = (dhc) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3Var3 = (qi3) objN2;
                m7f m7fVarN3 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF3 = e18Var.f(null) | e18Var.f(m7fVarN3);
                Object objN3 = e18Var.N();
                if (zF3 || objN3 == lz1Var) {
                    objN3 = m7fVarN3.a(jce.a.b(koi.class), null, null);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                e18Var.p(false);
                koi koiVar4 = (koi) objN3;
                m7f m7fVarN4 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF4 = e18Var.f(null) | e18Var.f(m7fVarN4);
                Object objN4 = e18Var.N();
                if (zF4 || objN4 == lz1Var) {
                    objN4 = m7fVarN4.a(jce.a.b(q7.class), null, null);
                    e18Var.k0(objN4);
                }
                e18Var.p(false);
                e18Var.p(false);
                q7 q7Var4 = (q7) objN4;
                m7f m7fVarN5 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF5 = e18Var.f(null) | e18Var.f(m7fVarN5);
                Object objN5 = e18Var.N();
                if (zF5 || objN5 == lz1Var) {
                    objN5 = m7fVarN5.a(jce.a.b(dkc.class), null, null);
                    e18Var.k0(objN5);
                }
                e18Var.p(false);
                e18Var.p(false);
                dkcVar3 = (dkc) objN5;
                dhcVar3 = dhcVar4;
                koiVar3 = koiVar4;
                q7Var3 = q7Var4;
            } else {
                e18Var.T();
                dhcVar3 = dhcVar;
                qi3Var3 = qi3Var;
                koiVar3 = koiVar;
                q7Var3 = q7Var;
                dkcVar3 = dkcVar;
            }
            e18Var.q();
            nwb nwbVarZ = mpk.Z(bz7Var, e18Var);
            if (((chc) dhcVar3.a.getValue()) != null) {
                e18Var.a0(-899897816);
                boolean zH = e18Var.h(dhcVar3) | e18Var.f(koiVar3) | e18Var.f(q7Var3) | e18Var.h(dkcVar3) | e18Var.h(qi3Var3) | e18Var.f(nwbVarZ);
                Object objN6 = e18Var.N();
                if (zH || objN6 == lz1Var) {
                    dkcVar4 = dkcVar3;
                    qi3Var4 = qi3Var3;
                    ju1 ju1Var = new ju1(dhcVar3, koiVar3, q7Var3, dkcVar4, qi3Var4, nwbVarZ, 4);
                    e18Var.k0(ju1Var);
                    objN6 = ju1Var;
                } else {
                    dkcVar4 = dkcVar3;
                    qi3Var4 = qi3Var3;
                }
                mwa.d(iei.a, null, (bz7) objN6, e18Var, 6);
                e18Var.p(false);
            } else {
                dkcVar4 = dkcVar3;
                qi3Var4 = qi3Var3;
                e18Var.a0(-898551455);
                e18Var.p(false);
            }
            dhcVar2 = dhcVar3;
            koiVar2 = koiVar3;
            q7Var2 = q7Var3;
            dkcVar2 = dkcVar4;
            qi3Var2 = qi3Var4;
        } else {
            e18Var.T();
            dhcVar2 = dhcVar;
            qi3Var2 = qi3Var;
            koiVar2 = koiVar;
            q7Var2 = q7Var;
            dkcVar2 = dkcVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ka0(dhcVar2, qi3Var2, koiVar2, q7Var2, dkcVar2, bz7Var, i, 4);
        }
    }

    public static final void f(ehc ehcVar, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(373479);
        int i2 = i | 2 | (e18Var.h(zy7Var) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var.V();
            int i3 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(ehc.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                ehcVar = (ehc) objN;
            } else {
                e18Var.T();
            }
            e18Var.q();
            nwb nwbVarZ = mpk.Z(zy7Var, e18Var);
            if (((Boolean) ehcVar.a.getValue()).booleanValue()) {
                e18Var.a0(-1758365363);
                boolean zH = e18Var.h(ehcVar) | e18Var.f(nwbVarZ);
                Object objN2 = e18Var.N();
                if (zH || objN2 == lz1Var) {
                    objN2 = new o5(ehcVar, 24, nwbVarZ);
                    e18Var.k0(objN2);
                }
                mwa.d(iei.a, null, (bz7) objN2, e18Var, 6);
                e18Var.p(false);
            } else {
                e18Var.a0(-1758198149);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ow1(ehcVar, zy7Var, i, 13);
        }
    }

    public static final void g(ghc ghcVar, koi koiVar, q7 q7Var, dkc dkcVar, sc8 sc8Var, zy7 zy7Var, ld4 ld4Var, int i) {
        ghc ghcVar2;
        koi koiVar2;
        q7 q7Var2;
        dkc dkcVar2;
        sc8 sc8Var2;
        q7 q7Var3;
        dkc dkcVar3;
        sc8 sc8Var3;
        ghc ghcVar3;
        koi koiVar3;
        sc8 sc8Var4;
        q7 q7Var4;
        dkc dkcVar4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-885351829);
        int i2 = i | 9362 | (e18Var.h(zy7Var) ? 131072 : 65536);
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            e18Var.V();
            int i3 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(ghc.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                ghc ghcVar4 = (ghc) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(koi.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                koi koiVar4 = (koi) objN2;
                m7f m7fVarN3 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF3 = e18Var.f(null) | e18Var.f(m7fVarN3);
                Object objN3 = e18Var.N();
                if (zF3 || objN3 == lz1Var) {
                    objN3 = m7fVarN3.a(jce.a.b(q7.class), null, null);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                e18Var.p(false);
                q7Var3 = (q7) objN3;
                m7f m7fVarN4 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF4 = e18Var.f(null) | e18Var.f(m7fVarN4);
                Object objN4 = e18Var.N();
                if (zF4 || objN4 == lz1Var) {
                    objN4 = m7fVarN4.a(jce.a.b(dkc.class), null, null);
                    e18Var.k0(objN4);
                }
                e18Var.p(false);
                e18Var.p(false);
                dkcVar3 = (dkc) objN4;
                m7f m7fVarN5 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF5 = e18Var.f(null) | e18Var.f(m7fVarN5);
                Object objN5 = e18Var.N();
                if (zF5 || objN5 == lz1Var) {
                    objN5 = m7fVarN5.a(jce.a.b(sc8.class), null, null);
                    e18Var.k0(objN5);
                }
                e18Var.p(false);
                e18Var.p(false);
                sc8Var3 = (sc8) objN5;
                ghcVar3 = ghcVar4;
                koiVar3 = koiVar4;
            } else {
                e18Var.T();
                ghcVar3 = ghcVar;
                koiVar3 = koiVar;
                q7Var3 = q7Var;
                dkcVar3 = dkcVar;
                sc8Var3 = sc8Var;
            }
            e18Var.q();
            nwb nwbVarZ = mpk.Z(zy7Var, e18Var);
            boolean z = ((fhc) ghcVar3.a.getValue()) != null;
            boolean zB = sc8Var3.a(koiVar3.e).b();
            if (z) {
                e18Var.a0(-121339721);
                Boolean boolValueOf = Boolean.valueOf(zB);
                boolean zH = e18Var.h(ghcVar3) | e18Var.f(koiVar3) | e18Var.h(sc8Var3) | e18Var.f(q7Var3) | e18Var.h(dkcVar3) | e18Var.f(nwbVarZ);
                Object objN6 = e18Var.N();
                if (zH || objN6 == lz1Var) {
                    sc8Var4 = sc8Var3;
                    q7Var4 = q7Var3;
                    dkcVar4 = dkcVar3;
                    ju1 ju1Var = new ju1(ghcVar3, koiVar3, sc8Var4, q7Var4, dkcVar4, nwbVarZ, 3);
                    e18Var.k0(ju1Var);
                    objN6 = ju1Var;
                } else {
                    sc8Var4 = sc8Var3;
                    q7Var4 = q7Var3;
                    dkcVar4 = dkcVar3;
                }
                mwa.d(boolValueOf, null, (bz7) objN6, e18Var, 0);
                e18Var.p(false);
            } else {
                sc8Var4 = sc8Var3;
                q7Var4 = q7Var3;
                dkcVar4 = dkcVar3;
                e18Var.a0(-118756553);
                e18Var.p(false);
            }
            ghcVar2 = ghcVar3;
            koiVar2 = koiVar3;
            sc8Var2 = sc8Var4;
            q7Var2 = q7Var4;
            dkcVar2 = dkcVar4;
        } else {
            e18Var.T();
            ghcVar2 = ghcVar;
            koiVar2 = koiVar;
            q7Var2 = q7Var;
            dkcVar2 = dkcVar;
            sc8Var2 = sc8Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ka0(ghcVar2, koiVar2, q7Var2, dkcVar2, sc8Var2, zy7Var, i);
        }
    }

    public static final void h(hhc hhcVar, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1594502535);
        int i2 = 16;
        int i3 = i | 2 | (e18Var.h(zy7Var) ? 32 : 16);
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            e18Var.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(hhc.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                hhcVar = (hhc) objN;
            } else {
                e18Var.T();
            }
            e18Var.q();
            nwb nwbVarZ = mpk.Z(zy7Var, e18Var);
            if (((Boolean) hhcVar.a.getValue()).booleanValue()) {
                e18Var.a0(-513041941);
                boolean zH = e18Var.h(hhcVar) | e18Var.f(nwbVarZ);
                Object objN2 = e18Var.N();
                if (zH || objN2 == lz1Var) {
                    objN2 = new o5(hhcVar, 27, nwbVarZ);
                    e18Var.k0(objN2);
                }
                mwa.d(iei.a, null, (bz7) objN2, e18Var, 6);
                e18Var.p(false);
            } else {
                e18Var.a0(-512872805);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ow1(hhcVar, zy7Var, i, i2);
        }
    }

    public static final void i(jhc jhcVar, qi3 qi3Var, koi koiVar, q7 q7Var, dkc dkcVar, bz7 bz7Var, ld4 ld4Var, int i) {
        jhc jhcVar2;
        qi3 qi3Var2;
        koi koiVar2;
        q7 q7Var2;
        dkc dkcVar2;
        qi3 qi3Var3;
        dkc dkcVar3;
        jhc jhcVar3;
        koi koiVar3;
        q7 q7Var3;
        dkc dkcVar4;
        qi3 qi3Var4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-255676313);
        int i2 = i | 9362 | (e18Var.h(bz7Var) ? 131072 : 65536);
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            e18Var.V();
            int i3 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(jhc.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                jhc jhcVar4 = (jhc) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3Var3 = (qi3) objN2;
                m7f m7fVarN3 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF3 = e18Var.f(null) | e18Var.f(m7fVarN3);
                Object objN3 = e18Var.N();
                if (zF3 || objN3 == lz1Var) {
                    objN3 = m7fVarN3.a(jce.a.b(koi.class), null, null);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                e18Var.p(false);
                koi koiVar4 = (koi) objN3;
                m7f m7fVarN4 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF4 = e18Var.f(null) | e18Var.f(m7fVarN4);
                Object objN4 = e18Var.N();
                if (zF4 || objN4 == lz1Var) {
                    objN4 = m7fVarN4.a(jce.a.b(q7.class), null, null);
                    e18Var.k0(objN4);
                }
                e18Var.p(false);
                e18Var.p(false);
                q7 q7Var4 = (q7) objN4;
                m7f m7fVarN5 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF5 = e18Var.f(null) | e18Var.f(m7fVarN5);
                Object objN5 = e18Var.N();
                if (zF5 || objN5 == lz1Var) {
                    objN5 = m7fVarN5.a(jce.a.b(dkc.class), null, null);
                    e18Var.k0(objN5);
                }
                e18Var.p(false);
                e18Var.p(false);
                dkcVar3 = (dkc) objN5;
                jhcVar3 = jhcVar4;
                koiVar3 = koiVar4;
                q7Var3 = q7Var4;
            } else {
                e18Var.T();
                jhcVar3 = jhcVar;
                qi3Var3 = qi3Var;
                koiVar3 = koiVar;
                q7Var3 = q7Var;
                dkcVar3 = dkcVar;
            }
            e18Var.q();
            nwb nwbVarZ = mpk.Z(bz7Var, e18Var);
            if (((ihc) jhcVar3.a.getValue()) != null) {
                e18Var.a0(-1875473159);
                boolean zH = e18Var.h(jhcVar3) | e18Var.f(koiVar3) | e18Var.f(q7Var3) | e18Var.h(dkcVar3) | e18Var.h(qi3Var3) | e18Var.f(nwbVarZ);
                Object objN6 = e18Var.N();
                if (zH || objN6 == lz1Var) {
                    dkcVar4 = dkcVar3;
                    qi3Var4 = qi3Var3;
                    ju1 ju1Var = new ju1(jhcVar3, koiVar3, q7Var3, dkcVar4, nwbVarZ, qi3Var4, 2);
                    e18Var.k0(ju1Var);
                    objN6 = ju1Var;
                } else {
                    dkcVar4 = dkcVar3;
                    qi3Var4 = qi3Var3;
                }
                mwa.d(iei.a, null, (bz7) objN6, e18Var, 6);
                e18Var.p(false);
            } else {
                dkcVar4 = dkcVar3;
                qi3Var4 = qi3Var3;
                e18Var.a0(-1873995141);
                e18Var.p(false);
            }
            jhcVar2 = jhcVar3;
            koiVar2 = koiVar3;
            q7Var2 = q7Var3;
            dkcVar2 = dkcVar4;
            qi3Var2 = qi3Var4;
        } else {
            e18Var.T();
            jhcVar2 = jhcVar;
            qi3Var2 = qi3Var;
            koiVar2 = koiVar;
            q7Var2 = q7Var;
            dkcVar2 = dkcVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ka0(jhcVar2, qi3Var2, koiVar2, q7Var2, dkcVar2, bz7Var, i, 2);
        }
    }

    public static final void j(qhc qhcVar, bz7 bz7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(809030026);
        int i2 = i | 2 | (e18Var.h(bz7Var) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var.V();
            int i3 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(qhc.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                qhcVar = (qhc) objN;
            } else {
                e18Var.T();
            }
            e18Var.q();
            nwb nwbVarZ = mpk.Z(bz7Var, e18Var);
            if (((phc) qhcVar.a.getValue()) != null) {
                e18Var.a0(-1542696371);
                boolean zH = e18Var.h(qhcVar) | e18Var.f(nwbVarZ);
                Object objN2 = e18Var.N();
                if (zH || objN2 == lz1Var) {
                    objN2 = new o5(qhcVar, 23, nwbVarZ);
                    e18Var.k0(objN2);
                }
                mwa.d(iei.a, null, (bz7) objN2, e18Var, 6);
                e18Var.p(false);
            } else {
                e18Var.a0(-1542470536);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ow1(qhcVar, bz7Var, i, 12);
        }
    }

    public static final void k(shc shcVar, bz7 bz7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(194506202);
        int i2 = i | 2 | (e18Var.h(bz7Var) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var.V();
            int i3 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(shc.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                shcVar = (shc) objN;
            } else {
                e18Var.T();
            }
            e18Var.q();
            nwb nwbVarZ = mpk.Z(bz7Var, e18Var);
            if (((rhc) shcVar.a.getValue()) != null) {
                e18Var.a0(623646623);
                boolean zH = e18Var.h(shcVar) | e18Var.f(nwbVarZ);
                Object objN2 = e18Var.N();
                if (zH || objN2 == lz1Var) {
                    objN2 = new o5(shcVar, 26, nwbVarZ);
                    e18Var.k0(objN2);
                }
                mwa.d(iei.a, null, (bz7) objN2, e18Var, 6);
                e18Var.p(false);
            } else {
                e18Var.a0(623870536);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ow1(shcVar, bz7Var, i, 15);
        }
    }

    public static final void l(uhc uhcVar, bz7 bz7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-254559718);
        int i2 = i | 2 | (e18Var.h(bz7Var) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var.V();
            int i3 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(uhc.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                uhcVar = (uhc) objN;
            } else {
                e18Var.T();
            }
            e18Var.q();
            nwb nwbVarZ = mpk.Z(bz7Var, e18Var);
            if (((thc) uhcVar.a.getValue()) != null) {
                e18Var.a0(1323990809);
                boolean zH = e18Var.h(uhcVar) | e18Var.f(nwbVarZ);
                Object objN2 = e18Var.N();
                if (zH || objN2 == lz1Var) {
                    objN2 = new o5(uhcVar, 25, nwbVarZ);
                    e18Var.k0(objN2);
                }
                mwa.d(iei.a, null, (bz7) objN2, e18Var, 6);
                e18Var.p(false);
            } else {
                e18Var.a0(1324220488);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ow1(uhcVar, bz7Var, i, 14);
        }
    }

    public static final void m(whc whcVar, pz7 pz7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-53707928);
        int i2 = i | 2 | (e18Var.f(pz7Var) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var.V();
            int i3 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(whc.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                whcVar = (whc) objN;
            } else {
                e18Var.T();
            }
            e18Var.q();
            nwb nwbVarZ = mpk.Z(pz7Var, e18Var);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN2);
            }
            l45 l45Var = (l45) objN2;
            if (((vhc) whcVar.a.getValue()) != null) {
                e18Var.a0(2010289246);
                boolean zH = e18Var.h(whcVar) | e18Var.h(l45Var) | e18Var.f(nwbVarZ);
                Object objN3 = e18Var.N();
                if (zH || objN3 == lz1Var) {
                    objN3 = new nf1((Object) whcVar, (Object) l45Var, nwbVarZ, 8);
                    e18Var.k0(objN3);
                }
                mwa.d(iei.a, null, (bz7) objN3, e18Var, 6);
                e18Var.p(false);
            } else {
                e18Var.a0(2010531418);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ow1(whcVar, pz7Var, i, 17);
        }
    }

    public static final void n(g09 g09Var, zkg zkgVar, zy7 zy7Var, ld4 ld4Var, int i) {
        g09 g09Var2;
        zkg zkgVar2;
        g09 g09Var3;
        zkg zkgVar3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1671816426);
        int i2 = i | 18 | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.V();
            int i3 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(g09.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                g09Var3 = (g09) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(zkg.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                zkgVar3 = (zkg) objN2;
            } else {
                e18Var.T();
                g09Var3 = g09Var;
                zkgVar3 = zkgVar;
            }
            e18Var.q();
            nwb nwbVarZ = mpk.Z(zy7Var, e18Var);
            boolean z = !g09Var3.a.isEmpty() || (((blg) zkgVar3.a.getValue()) != null);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zG = e18Var.g(z) | e18Var.f(nwbVarZ);
            Object objN3 = e18Var.N();
            if (zG || objN3 == lz1Var) {
                objN3 = new hb1(z, nwbVarZ, 1);
                e18Var.k0(objN3);
            }
            mwa.d(boolValueOf, null, (bz7) objN3, e18Var, 0);
            zkgVar2 = zkgVar3;
            g09Var2 = g09Var3;
        } else {
            e18Var.T();
            g09Var2 = g09Var;
            zkgVar2 = zkgVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m63(g09Var2, i, zkgVar2, zy7Var, 4);
        }
    }

    public static final void o(zy7 zy7Var, bz7 bz7Var, zy7 zy7Var2, b0g b0gVar, j8f j8fVar, pl3 pl3Var, x89 x89Var, ld4 ld4Var, int i) {
        b0g b0gVar2;
        j8f j8fVar2;
        pl3 pl3Var2;
        x89 x89Var2;
        j8f j8fVar3;
        x89 x89Var3;
        b0g b0gVar3;
        pl3 pl3Var3;
        Object ok3Var;
        pl3 pl3Var4;
        x89 x89Var4;
        nwb nwbVar;
        nwb nwbVar2;
        nwb nwbVar3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1248191394);
        int i2 = i | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 599040;
        if (e18Var.Q(i2 & 1, (599187 & i2) != 599186)) {
            e18Var.V();
            int i3 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(b0g.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                b0g b0gVar4 = (b0g) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(j8f.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                j8fVar3 = (j8f) objN2;
                m7f m7fVarN3 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF3 = e18Var.f(null) | e18Var.f(m7fVarN3);
                Object objN3 = e18Var.N();
                if (zF3 || objN3 == lz1Var) {
                    objN3 = m7fVarN3.a(jce.a.b(pl3.class), null, null);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                e18Var.p(false);
                pl3 pl3Var5 = (pl3) objN3;
                m7f m7fVarN4 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF4 = e18Var.f(null) | e18Var.f(m7fVarN4);
                Object objN4 = e18Var.N();
                if (zF4 || objN4 == lz1Var) {
                    objN4 = m7fVarN4.a(jce.a.b(x89.class), null, null);
                    e18Var.k0(objN4);
                }
                e18Var.p(false);
                e18Var.p(false);
                x89Var3 = (x89) objN4;
                b0gVar3 = b0gVar4;
                pl3Var3 = pl3Var5;
            } else {
                e18Var.T();
                b0gVar3 = b0gVar;
                j8fVar3 = j8fVar;
                pl3Var3 = pl3Var;
                x89Var3 = x89Var;
            }
            e18Var.q();
            boolean zH = e18Var.h(b0gVar3);
            Object objN5 = e18Var.N();
            if (zH || objN5 == lz1Var) {
                objN5 = new a2(16, b0gVar3);
                e18Var.k0(objN5);
            }
            mwa.d(b0gVar3, null, (bz7) objN5, e18Var, 8);
            View view = (View) e18Var.j(w00.f);
            Activity activity = (Activity) e18Var.j(tca.a);
            nwb nwbVarZ = mpk.Z(zy7Var, e18Var);
            nwb nwbVarZ2 = mpk.Z(bz7Var, e18Var);
            nwb nwbVarZ3 = mpk.Z(zy7Var2, e18Var);
            Object objN6 = e18Var.N();
            if (objN6 == lz1Var) {
                objN6 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN6);
            }
            nwb nwbVar4 = (nwb) objN6;
            Object objN7 = e18Var.N();
            if (objN7 == lz1Var) {
                objN7 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN7);
            }
            nwb nwbVar5 = (nwb) objN7;
            boolean zH2 = e18Var.h(b0gVar3) | e18Var.h(pl3Var3) | e18Var.h(view) | e18Var.h(x89Var3) | e18Var.f(nwbVarZ) | e18Var.h(activity) | e18Var.h(j8fVar3) | e18Var.f(nwbVarZ2);
            Object objN8 = e18Var.N();
            if (zH2 || objN8 == lz1Var) {
                x89 x89Var5 = x89Var3;
                ok3Var = new ok3(b0gVar3, pl3Var3, view, x89Var5, nwbVar4, nwbVar5, nwbVarZ, activity, j8fVar3, nwbVarZ2, null);
                pl3Var4 = pl3Var3;
                x89Var4 = x89Var5;
                nwbVar = nwbVar4;
                nwbVar2 = nwbVar5;
                nwbVar3 = nwbVarZ2;
                e18Var.k0(ok3Var);
            } else {
                x89Var4 = x89Var3;
                ok3Var = objN8;
                nwbVar3 = nwbVarZ2;
                pl3Var4 = pl3Var3;
                nwbVar = nwbVar4;
                nwbVar2 = nwbVar5;
            }
            fd9.i(e18Var, (pz7) ok3Var, b0gVar3);
            if (((Boolean) nwbVar.getValue()).booleanValue()) {
                e18Var.a0(-954533744);
                Object objN9 = e18Var.N();
                if (objN9 == lz1Var) {
                    objN9 = new fg1(7, nwbVar);
                    e18Var.k0(objN9);
                }
                zy7 zy7Var3 = (zy7) objN9;
                boolean zF5 = e18Var.f(nwbVarZ);
                Object objN10 = e18Var.N();
                if (zF5 || objN10 == lz1Var) {
                    objN10 = new ka1(nwbVar, nwbVarZ, nwbVar2, 11);
                    e18Var.k0(objN10);
                }
                zy7 zy7Var4 = (zy7) objN10;
                boolean zF6 = e18Var.f(nwbVarZ3);
                Object objN11 = e18Var.N();
                if (zF6 || objN11 == lz1Var) {
                    objN11 = new l80(nwbVar, 21, nwbVarZ3);
                    e18Var.k0(objN11);
                }
                zsj.c(zy7Var3, zy7Var4, (zy7) objN11, e18Var, 6);
                e18Var.p(false);
            } else {
                e18Var.a0(-953995584);
                e18Var.p(false);
            }
            if (!((Boolean) nwbVar2.getValue()).booleanValue() || ((Boolean) nwbVar.getValue()).booleanValue()) {
                e18Var.a0(-953327968);
                e18Var.p(false);
            } else {
                e18Var.a0(-953937242);
                boolean zH3 = e18Var.h(activity) | e18Var.h(j8fVar3) | e18Var.f(nwbVar3);
                Object objN12 = e18Var.N();
                if (zH3 || objN12 == lz1Var) {
                    cm cmVar = new cm(activity, j8fVar3, nwbVar3, nwbVar2, null, 23);
                    e18Var.k0(cmVar);
                    objN12 = cmVar;
                }
                fd9.i(e18Var, (pz7) objN12, iei.a);
                e18Var.p(false);
            }
            pl3Var2 = pl3Var4;
            x89Var2 = x89Var4;
            j8fVar2 = j8fVar3;
            b0gVar2 = b0gVar3;
        } else {
            e18Var.T();
            b0gVar2 = b0gVar;
            j8fVar2 = j8fVar;
            pl3Var2 = pl3Var;
            x89Var2 = x89Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hx2(zy7Var, bz7Var, zy7Var2, b0gVar2, j8fVar2, pl3Var2, x89Var2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(android.app.Activity r4, defpackage.j8f r5, defpackage.nwb r6, defpackage.tp4 r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.pk3
            if (r0 == 0) goto L13
            r0 = r7
            pk3 r0 = (defpackage.pk3) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            pk3 r0 = new pk3
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.F
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            nwb r6 = r0.E
            defpackage.sf5.h0(r7)
            goto L40
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L2e:
            defpackage.sf5.h0(r7)
            if (r4 == 0) goto L43
            r0.E = r6
            r0.G = r2
            java.lang.Comparable r7 = r5.a(r4, r0)
            m45 r4 = defpackage.m45.E
            if (r7 != r4) goto L40
            return r4
        L40:
            r3 = r7
            android.net.Uri r3 = (android.net.Uri) r3
        L43:
            java.lang.Object r4 = r6.getValue()
            bz7 r4 = (defpackage.bz7) r4
            r4.invoke(r3)
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.app.n0.p(android.app.Activity, j8f, nwb, tp4):java.lang.Object");
    }
}
