package com.anthropic.claude.tasks.ui;

import androidx.compose.foundation.layout.FillElement;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;
import com.anthropic.claude.tasks.ui.TasksListOverlay;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.aah;
import defpackage.bz7;
import defpackage.c3g;
import defpackage.cah;
import defpackage.cd4;
import defpackage.d4c;
import defpackage.dah;
import defpackage.dd4;
import defpackage.dw1;
import defpackage.e18;
import defpackage.eah;
import defpackage.ebh;
import defpackage.eg0;
import defpackage.eve;
import defpackage.ez1;
import defpackage.fd9;
import defpackage.fqb;
import defpackage.g77;
import defpackage.gb9;
import defpackage.gm3;
import defpackage.gr9;
import defpackage.hyc;
import defpackage.ia0;
import defpackage.idi;
import defpackage.iei;
import defpackage.im6;
import defpackage.iqb;
import defpackage.iv1;
import defpackage.jce;
import defpackage.jd4;
import defpackage.jm3;
import defpackage.kce;
import defpackage.knk;
import defpackage.kxk;
import defpackage.l45;
import defpackage.l5h;
import defpackage.ld4;
import defpackage.lja;
import defpackage.lz1;
import defpackage.m7f;
import defpackage.ml3;
import defpackage.mwa;
import defpackage.n2i;
import defpackage.n7h;
import defpackage.o5b;
import defpackage.oq5;
import defpackage.pz7;
import defpackage.qnc;
import defpackage.r4g;
import defpackage.r7e;
import defpackage.re4;
import defpackage.rn;
import defpackage.rwe;
import defpackage.sq6;
import defpackage.sz7;
import defpackage.t2g;
import defpackage.t4g;
import defpackage.tjh;
import defpackage.u4g;
import defpackage.uah;
import defpackage.ufe;
import defpackage.v40;
import defpackage.vf2;
import defpackage.x44;
import defpackage.xo1;
import defpackage.ybg;
import defpackage.yl1;
import defpackage.zee;
import defpackage.zkd;
import defpackage.zl1;
import defpackage.ztj;
import defpackage.zy7;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {
    public static final void a(Map map, boolean z, boolean z2, boolean z3, final int i, final zy7 zy7Var, final bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i2) {
        Map map2;
        int i3;
        boolean z4;
        iqb iqbVar2;
        xo1 xo1Var = lja.K;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-718860433);
        if ((i2 & 6) == 0) {
            map2 = map;
            i3 = (e18Var.f(map2) ? 4 : 2) | i2;
        } else {
            map2 = map;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            z4 = z3;
            i3 |= e18Var.g(z4) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            z4 = z3;
        }
        if ((i2 & 24576) == 0) {
            i3 |= e18Var.d(i) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i2) == 0) {
            i3 |= e18Var.h(zy7Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= e18Var.h(bz7Var) ? 1048576 : 524288;
        }
        int i4 = i3 | 12582912;
        if (e18Var.Q(i4 & 1, (i4 & 4793491) != 4793490)) {
            if (z) {
                e18Var.a0(-863899617);
                FillElement fillElement = androidx.compose.foundation.layout.b.c;
                o5b o5bVarD = dw1.d(xo1Var, false);
                int iHashCode = Long.hashCode(e18Var.T);
                hyc hycVarL = e18Var.l();
                iqb iqbVarE = kxk.E(e18Var, fillElement);
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
                ez1.a(null, vf2.J, 0L, e18Var, 48, 5);
                e18Var.p(true);
                e18Var.p(false);
            } else if (z2) {
                e18Var.a0(-863695389);
                FillElement fillElement2 = androidx.compose.foundation.layout.b.c;
                o5b o5bVarD2 = dw1.d(xo1Var, false);
                int iHashCode2 = Long.hashCode(e18Var.T);
                hyc hycVarL2 = e18Var.l();
                iqb iqbVarE2 = kxk.E(e18Var, fillElement2);
                dd4.e.getClass();
                re4 re4Var2 = cd4.b;
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var2);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, cd4.f, o5bVarD2);
                d4c.i0(e18Var, cd4.e, hycVarL2);
                d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode2));
                d4c.h0(e18Var, cd4.h);
                d4c.i0(e18Var, cd4.d, iqbVarE2);
                tjh.b(d4c.j0(R.string.tasks_screen_placeholder, e18Var), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131066);
                e18Var = e18Var;
                e18Var.p(true);
                e18Var.p(false);
            } else {
                e18Var.a0(-863313686);
                qnc qncVarD = gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 24.0f, 7);
                FillElement fillElement3 = androidx.compose.foundation.layout.b.c;
                boolean z5 = ((3670016 & i4) == 1048576) | ((i4 & 14) == 4) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384) | ((i4 & 458752) == 131072);
                Object objN = e18Var.N();
                if (z5 || objN == jd4.a) {
                    final Map map3 = map2;
                    final boolean z6 = z4;
                    bz7 bz7Var2 = new bz7() { // from class: bah
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj) {
                            j0a j0aVar = (j0a) obj;
                            j0aVar.getClass();
                            for (n6e n6eVar : n6e.P) {
                                List list = (List) map3.get(n6eVar);
                                if (list == null) {
                                    list = lm6.E;
                                }
                                if (!list.isEmpty()) {
                                    j0a.V(j0aVar, "header-" + n6eVar, null, new ta4(880729862, true, new hp(n6eVar, 2)), 2);
                                    j0aVar.W(list.size(), new zkd(new x2h(10), 15, list), new wxf(list, 2), new ta4(802480018, true, new es4(5, bz7Var, list)));
                                }
                            }
                            if (z6) {
                                j0a.V(j0aVar, "sentinel", null, new ta4(-57844194, true, new ik4(i, zy7Var)), 2);
                            }
                            return iei.a;
                        }
                    };
                    e18Var.k0(bz7Var2);
                    objN = bz7Var2;
                }
                knk.h(fillElement3, null, qncVarD, false, null, null, null, false, null, (bz7) objN, e18Var, 384, 506);
                e18Var = e18Var;
                e18Var.p(false);
            }
            iqbVar2 = fqb.E;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new cah(map, z, z2, z3, i, zy7Var, bz7Var, iqbVar2, i2);
        }
    }

    public static final void b(ml3 ml3Var, pz7 pz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        pz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(405517218);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(ml3Var) : e18Var.h(ml3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(pz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            m7f m7fVar = (m7f) e18Var.j(gr9.b);
            boolean zH = e18Var.h(m7fVar);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zH || objN == lz1Var) {
                objN = new t2g(m7fVar, i3);
                e18Var.k0(objN);
            }
            kce kceVar = jce.a;
            aah aahVar = (aah) fd9.r0(kceVar.b(aah.class), oq5.B(kceVar.b(aah.class)), (bz7) objN, e18Var);
            qnc qncVar = n2i.a;
            g77 g77VarA = n2i.a(eg0.h(e18Var), e18Var, 14);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objN2;
            TasksBottomSheetDestination.Closed closed = TasksBottomSheetDestination.Closed.INSTANCE;
            String strB = oq5.B(kceVar.b(TasksBottomSheetDestination.class));
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new yl1(closed, 4);
                e18Var.k0(objN3);
            }
            rwe rweVarP = eve.P(kceVar.b(TasksBottomSheetDestination.class), strB, true, iv1.M(kceVar.b(TasksBottomSheetDestination.class)), (zy7) objN3, e18Var);
            x44.q0(rweVarP, e18Var);
            r4g r4gVarS = gb9.S(u4g.E, null, null, new zl1(rweVarP, closed, 2), e18Var, 6, 6);
            boolean zF = e18Var.f(rweVarP) | e18Var.f(r4gVarS);
            Object objN4 = e18Var.N();
            if (zF || objN4 == lz1Var) {
                objN4 = new t4g(rweVarP, r4gVarS);
                e18Var.k0(objN4);
            }
            t4g t4gVar = (t4g) objN4;
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = new n7h(10);
                e18Var.k0(objN5);
            }
            final rwe rweVarP2 = eve.P(kceVar.b(TasksListOverlay.class), oq5.B(kceVar.b(TasksListOverlay.class)), true, iv1.M(kceVar.b(TasksListOverlay.class)), (zy7) objN5, e18Var);
            final l5h l5hVarL = v40.L(e18Var);
            Object objN6 = e18Var.N();
            if (objN6 == lz1Var) {
                objN6 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN6);
            }
            final l45 l45Var = (l45) objN6;
            int i4 = i2;
            v40.b(ztj.i(iqbVar, g77VarA.e, null), null, fd9.q0(1337899493, new ufe(g77VarA, 20, ml3Var), e18Var), null, fd9.q0(1181918951, new rn(ybgVar, 25), e18Var), null, 0, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-240039592, new zee(aahVar, ybgVar, t4gVar, 3), e18Var), e18Var, 24960, 2026);
            List listH = ((uah) aahVar.b).h();
            boolean zH2 = e18Var.h(t4gVar) | ((i4 & 112) == 32);
            Object objN7 = e18Var.N();
            if (zH2 || objN7 == lz1Var) {
                objN7 = new zkd(t4gVar, 16, pz7Var);
                e18Var.k0(objN7);
            }
            bz7 bz7Var = (bz7) objN7;
            boolean zH3 = e18Var.h(t4gVar) | e18Var.h(rweVarP2);
            Object objN8 = e18Var.N();
            if (zH3 || objN8 == lz1Var) {
                objN8 = new w(t4gVar, rweVarP2);
                e18Var.k0(objN8);
            }
            q.j(listH, t4gVar, null, bz7Var, (pz7) objN8, e18Var, 0, 4);
            mwa.l(rweVarP2, null, null, fd9.q0(2072955909, new sz7() { // from class: com.anthropic.claude.tasks.ui.u
                @Override // defpackage.sz7
                public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
                    final TasksListOverlay tasksListOverlay = (TasksListOverlay) obj2;
                    ld4 ld4Var2 = (ld4) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((ia0) obj).getClass();
                    tasksListOverlay.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= (iIntValue & 64) == 0 ? ((e18) ld4Var2).f(tasksListOverlay) : ((e18) ld4Var2).h(tasksListOverlay) ? 32 : 16;
                    }
                    boolean z = true;
                    e18 e18Var2 = (e18) ld4Var2;
                    if (!e18Var2.Q(iIntValue & 1, (iIntValue & 145) != 144)) {
                        e18Var2.T();
                    } else if (tasksListOverlay.equals(TasksListOverlay.None.INSTANCE)) {
                        e18Var2.a0(-1905189701);
                        e18Var2.p(false);
                    } else {
                        if (!(tasksListOverlay instanceof TasksListOverlay.BrowserTakeover)) {
                            throw ebh.u(e18Var2, -754195568, false);
                        }
                        e18Var2.a0(-1905122648);
                        final String strJ0 = d4c.j0(R.string.browser_takeover_done_message_for_claude, e18Var2);
                        String takeoverPath = ((TasksListOverlay.BrowserTakeover) tasksListOverlay).getTakeoverPath();
                        int i5 = iIntValue;
                        final rwe rweVar = rweVarP2;
                        boolean zH4 = e18Var2.h(rweVar);
                        final l45 l45Var2 = l45Var;
                        boolean zH5 = zH4 | e18Var2.h(l45Var2);
                        final l5h l5hVar = l5hVarL;
                        boolean zH6 = zH5 | e18Var2.h(l5hVar);
                        if ((i5 & 112) != 32 && ((i5 & 64) == 0 || !e18Var2.h(tasksListOverlay))) {
                            z = false;
                        }
                        boolean zF2 = zH6 | z | e18Var2.f(strJ0);
                        Object objN9 = e18Var2.N();
                        if (zF2 || objN9 == jd4.a) {
                            zy7 zy7Var = new zy7() { // from class: com.anthropic.claude.tasks.ui.v
                                @Override // defpackage.zy7
                                public final Object a() {
                                    dah dahVar = dah.F;
                                    eah eahVar = new eah(0);
                                    rwe rweVar2 = rweVar;
                                    rweVar2.getClass();
                                    rweVar2.E.m(dahVar, eahVar);
                                    gb9.D(l45Var2, null, null, new x(l5hVar, tasksListOverlay, strJ0, null), 3);
                                    return iei.a;
                                }
                            };
                            e18Var2.k0(zy7Var);
                            objN9 = zy7Var;
                        }
                        idi.b(takeoverPath, (zy7) objN9, null, null, null, e18Var2, 0);
                        e18Var2.p(false);
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, 3072, 6);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new c3g(ml3Var, i, pz7Var, iqbVar, 3);
        }
    }
}
