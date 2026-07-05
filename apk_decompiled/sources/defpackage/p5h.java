package defpackage;

import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.tasks.CustomToolUseEvent;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.api.tasks.TaskSessionEvent;
import com.anthropic.claude.api.tasks.f;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.types.strings.TaskId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p5h {
    public static final SimpleDateFormat a = new SimpleDateFormat("HH:mm:ss", Locale.US);

    public static final void a(u7h u7hVar, boolean z, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var;
        int i2;
        boolean z2;
        long j;
        TaskSessionEvent taskSessionEvent = u7hVar.c;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1618970367);
        int i3 = i | (e18Var2.f(u7hVar) ? 4 : 2) | (e18Var2.g(z) ? 32 : 16) | (e18Var2.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), false, null, null, null, zy7Var, 15);
            boolean z3 = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objN = e18Var2.N();
            if (z3 || objN == jd4.a) {
                objN = new lyb(z, zy7Var, 2);
                e18Var2.k0(objN);
            }
            iqb iqbVarL = gb9.L(tjf.b(iqbVarC, false, (bz7) objN), MTTypesetterKt.kLineSkipLimitMultiplier, 10.0f, 1);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarL);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            cxe cxeVarA = axe.a(new ho0(8.0f, true, new sz6(1)), lja.Q, e18Var2, 54);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, fqbVar);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, cxeVarA);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            JsonObject jsonObject = f.a;
            taskSessionEvent.getClass();
            if ((taskSessionEvent instanceof CustomToolUseEvent) || ((taskSessionEvent instanceof cfi) && ((cfi) taskSessionEvent).a.equals("task_update"))) {
                i2 = 0;
                e18Var2.a0(-1925437071);
                dw1.a(yfd.p(androidx.compose.foundation.layout.b.o(fqbVar, 6.0f), gm3.a(e18Var2).c, xve.a), e18Var2, 0);
                e18Var2.p(false);
            } else {
                e18Var2.a0(-1925242949);
                i2 = 0;
                e18Var2.p(false);
            }
            h(u7hVar.b, e18Var2, i2);
            String strA = u7hVar.a();
            tkh tkhVar = (tkh) ((wk) gm3.c(e18Var2).e.F).i;
            int iOrdinal = f.b(taskSessionEvent).ordinal();
            if (iOrdinal == 0) {
                z2 = false;
                e18Var2.a0(1836933586);
                j = gm3.a(e18Var2).j;
                e18Var2.p(false);
            } else if (iOrdinal == 1) {
                z2 = false;
                e18Var2.a0(1836936423);
                j = gm3.a(e18Var2).M;
                e18Var2.p(false);
            } else if (iOrdinal == 2) {
                z2 = false;
                e18Var2.a0(1836938759);
                j = gm3.a(e18Var2).N;
                e18Var2.p(false);
            } else if (iOrdinal == 3) {
                z2 = false;
                e18Var2.a0(1836941165);
                j = gm3.a(e18Var2).c;
                e18Var2.p(false);
            } else if (iOrdinal == 4) {
                z2 = false;
                e18Var2.a0(1836943561);
                j = gm3.a(e18Var2).x;
                e18Var2.p(false);
            } else {
                if (iOrdinal != 5) {
                    throw ebh.u(e18Var2, 1836931391, false);
                }
                e18Var2.a0(1836945831);
                j = gm3.a(e18Var2).O;
                z2 = false;
                e18Var2.p(false);
            }
            int i4 = 1;
            boolean z4 = z2;
            tjh.b(strA, new hw9(1.0f, true), j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tkhVar, e18Var2, 0, 24960, 110584);
            String str = a.format(new Date(u7hVar.d));
            str.getClass();
            tjh.b(str, null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 131066);
            e18Var = e18Var2;
            iv1.b(z ? ud0.D : ud0.B, null, null, ef2.F, gm3.a(e18Var2).O, e18Var, 3120, 4);
            e18Var.p(true);
            if (z) {
                e18Var.a0(1251771147);
                xvk.c(null, fd9.q0(1600311245, new jsg(i4, u7hVar), e18Var), e18Var, 48, 1);
                e18Var.p(z4);
            } else {
                e18Var.a0(1252274711);
                e18Var.p(z4);
            }
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wvg(u7hVar, z, zy7Var, i, 1);
        }
    }

    public static final void b(int i, int i2, List list, Set set, bz7 bz7Var, ld4 ld4Var, int i3) {
        nwb nwbVar;
        List list2 = list;
        Set set2 = set;
        bz7 bz7Var2 = bz7Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1411934064);
        int i4 = i3 | (e18Var.d(i) ? 4 : 2) | (e18Var.d(i2) ? 32 : 16) | (e18Var.f(list2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(set2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(bz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var.Q(i4 & 1, (i4 & 9363) != 9362)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar2 = (nwb) objN;
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarN = gb9.N(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 7);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            tjh.b(vb7.k(i, "Events (", i == i2 ? "" : grc.p(i2, " of "), ", newest first)"), new hw9(1.0f, true), gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131064);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, fqbVar);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            bpc bpcVarA = a.a(ud0.p0, e18Var);
            long j = gm3.a(e18Var).N;
            iqb iqbVarO = androidx.compose.foundation.layout.b.o(fqbVar, 20.0f);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                nwbVar = nwbVar2;
                objN2 = new lxf(12, nwbVar);
                e18Var.k0(objN2);
            } else {
                nwbVar = nwbVar2;
            }
            cv8.b(bpcVarA, "Filter kinds", b.c(iqbVarO, false, null, null, null, (zy7) objN2, 15), j, e18Var, 56, 0);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new lxf(13, nwbVar);
                e18Var.k0(objN3);
            }
            list2 = list;
            set2 = set;
            bz7Var2 = bz7Var;
            j8.b(zBooleanValue, (zy7) objN3, null, 0L, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-1244625731, new zee(bz7Var2, list2, set2, 2), e18Var), e18Var, 48, 2044);
            e18Var = e18Var;
            e18Var.p(true);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zh(i, i2, list2, set2, bz7Var2, i3);
        }
    }

    public static final void c(List list, boolean z, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1248523535);
        int i2 = i | (e18Var2.f(list) ? 4 : 2) | (e18Var2.g(z) ? 32 : 16) | (e18Var2.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), false, null, null, null, zy7Var, 15);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objN = e18Var2.N();
            if (z2 || objN == jd4.a) {
                objN = new lyb(z, zy7Var, 3);
                e18Var2.k0(objN);
            }
            iqb iqbVarL = gb9.L(tjf.b(iqbVarC, false, (bz7) objN), MTTypesetterKt.kLineSkipLimitMultiplier, 10.0f, 1);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarL);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var2, 48);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, fqbVar);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, cxeVarA);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            tjh.b(list.size() + " MCP server init errors", new hw9(1.0f, true), gm3.a(e18Var2).x, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var2).e.F).i, e18Var2, 0, 0, 131064);
            e18Var = e18Var2;
            iv1.b(z ? ud0.D : ud0.B, null, null, ef2.F, gm3.a(e18Var2).O, e18Var, 3120, 4);
            e18Var.p(true);
            if (z) {
                e18Var.a0(1293259439);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String strC = f.c(((u7h) it.next()).c);
                    if (strC != null) {
                        arrayList.add(strC);
                    }
                }
                TreeSet treeSet = new TreeSet();
                w44.m1(arrayList, treeSet);
                tjh.b(w44.S0(treeSet, "\n", null, null, null, 62), gb9.J(yfd.p(gb9.N(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), gm3.a(e18Var).p, xve.b(6.0f)), 10.0f), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var).e.F).i, e18Var, 0, 0, 131064);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                e18Var.a0(1293776457);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wvg(list, z, zy7Var, i, 2);
        }
    }

    public static final void d(String str, String str2, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-784287252);
        int i2 = i | (e18Var.f(str2) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, fqb.E);
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
            tjh.b(str, null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 6, 0, 131066);
            e18Var = e18Var;
            kxk.g(e18Var, new hw9(1.0f, true));
            xvk.c(null, fd9.q0(-2089404557, new ngf(str2, 8), e18Var), e18Var, 48, 1);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ny3(i, 8, str, str2);
        }
    }

    public static final void e(TaskResponse taskResponse, z7h z7hVar, ld4 ld4Var, int i) {
        String str;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(284182668);
        int i2 = (e18Var.f(taskResponse) ? 4 : 2) | i | (e18Var.f(z7hVar) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            q64 q64VarA = p64.a(new ho0(4.0f, true, new sz6(1)), lja.S, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, fqb.E);
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
            d("task", taskResponse.m450getUuidFxcw9s(), e18Var, 6);
            String session_id = taskResponse.getSession_id();
            if (session_id == null) {
                session_id = "—";
            }
            d("session", session_id, e18Var, 6);
            d("status", taskResponse.getStatus().getValue(), e18Var, 6);
            if (x44.r(z7hVar, w7h.a)) {
                str = "idle";
            } else if (x44.r(z7hVar, x7h.a)) {
                str = "loading history…";
            } else if (x44.r(z7hVar, y7h.a)) {
                str = "streaming";
            } else {
                if (!(z7hVar instanceof v7h)) {
                    wg6.i();
                    return;
                }
                Throwable th = ((v7h) z7hVar).a;
                if (th != null) {
                    String message = th.getMessage();
                    if (message != null) {
                        th = message;
                    }
                    str = "ended: " + th;
                } else {
                    str = "ended";
                }
            }
            d("phase", str, e18Var, 6);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ufe(taskResponse, z7hVar, i, 14);
        }
    }

    public static final void f(int i, int i2, ld4 ld4Var, zy7 zy7Var, boolean z) {
        e18 e18Var;
        String str;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-2058954025);
        int i3 = i2 | (e18Var2.d(i) ? 4 : 2) | (e18Var2.g(z) ? 32 : 16) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            if (z) {
                str = "Hide noise";
            } else {
                str = i + " noisy events hidden (MCP init errors) — tap to show";
            }
            e18Var = e18Var2;
            tjh.b(str, gb9.L(b.c(androidx.compose.foundation.layout.b.c(fqb.E, 1.0f), false, null, null, null, zy7Var, 15), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1), gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var, 0, 0, 131064);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw0(i, i2, 5, zy7Var, z);
        }
    }

    public static final void g(pz7 pz7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-721453667);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(pz7Var) : e18Var2.h(pz7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            Object[] objArr = new Object[0];
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new crg(18);
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var2, 48);
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(Boolean.FALSE);
                e18Var2.k0(objN2);
            }
            nwb nwbVar2 = (nwb) objN2;
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                objN3 = fd9.O(im6.E, e18Var2);
                e18Var2.k0(objN3);
            }
            l45 l45Var = (l45) objN3;
            String str = (String) nwbVar.getValue();
            boolean z = !((Boolean) nwbVar2.getValue()).booleanValue();
            iqb iqbVarN = gb9.N(androidx.compose.foundation.layout.b.c(fqb.E, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 5);
            boolean zF = e18Var2.f(nwbVar);
            Object objN4 = e18Var2.N();
            if (zF || objN4 == lz1Var) {
                objN4 = new shf(4, nwbVar);
                e18Var2.k0(objN4);
            }
            e18Var = e18Var2;
            mwa.b(str, (bz7) objN4, "Send a message to this task", iqbVarN, z, false, null, null, vuk.c, null, fd9.q0(-426299187, new v3e(l45Var, pz7Var, nwbVar, nwbVar2, 11), e18Var2), null, null, null, false, 0, 0, 0L, null, e18Var, 100666752, 6, 2095840);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ay3(pz7Var, i, 8);
        }
    }

    public static final void h(a8h a8hVar, ld4 ld4Var, int i) {
        e18 e18Var;
        cpc cpcVar;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1270776226);
        int i2 = (e18Var2.d(a8hVar.ordinal()) ? 4 : 2) | i;
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            int iOrdinal = a8hVar.ordinal();
            if (iOrdinal == 0) {
                e18Var2.a0(1445245752);
                cpcVar = new cpc(new d54(gm3.a(e18Var2).O), new d54(gm3.a(e18Var2).q));
                e18Var2.p(false);
            } else {
                if (iOrdinal != 1) {
                    throw ebh.u(e18Var2, 1445243690, false);
                }
                e18Var2.a0(1445249264);
                cpcVar = new cpc(new d54(gm3.a(e18Var2).j), new d54(gm3.a(e18Var2).m));
                e18Var2.p(false);
            }
            e18Var = e18Var2;
            tjh.b(a8hVar.name(), gb9.K(yfd.p(fqb.E, ((d54) cpcVar.F).a, xve.a), 8.0f, 2.0f), ((d54) cpcVar.E).a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131064);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jsg(a8hVar, i, 2);
        }
    }

    public static final void i(TaskResponse taskResponse, e8h e8hVar, pz7 pz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        e8hVar.getClass();
        pz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-270038296);
        int i2 = i | (e18Var.f(taskResponse) ? 4 : 2) | (e18Var.h(e8hVar) ? 32 : 16) | (e18Var.f(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            TaskId taskIdM1128boximpl = TaskId.m1128boximpl(taskResponse.m450getUuidFxcw9s());
            boolean zH = e18Var.h(e8hVar) | ((i2 & 14) == 4);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new o6e(e8hVar, taskResponse, null, 29);
                e18Var.k0(objN);
            }
            fd9.i(e18Var, (pz7) objN, taskIdM1128boximpl);
            j(taskResponse, e8hVar, pz7Var, iqbVar, e18Var, i2 & 8190);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v3e(taskResponse, e8hVar, pz7Var, iqbVar, i, 10);
        }
    }

    public static final void j(TaskResponse taskResponse, e8h e8hVar, pz7 pz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        TaskResponse taskResponse2;
        int i2;
        e18 e18Var;
        int i3;
        boolean z;
        hw9 hw9Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-846223793);
        if ((i & 6) == 0) {
            taskResponse2 = taskResponse;
            i2 = (e18Var2.f(taskResponse2) ? 4 : 2) | i;
        } else {
            taskResponse2 = taskResponse;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(e8hVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var2.f(pz7Var) : e18Var2.h(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            kdg kdgVar = e8hVar.c;
            Object[] objArr = {TaskId.m1128boximpl(taskResponse2.m450getUuidFxcw9s())};
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new crg(19);
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var2, 48);
            Object[] objArr2 = {TaskId.m1128boximpl(taskResponse2.m450getUuidFxcw9s())};
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = new crg(20);
                e18Var2.k0(objN2);
            }
            nwb nwbVar2 = (nwb) iuj.I(objArr2, (zy7) objN2, e18Var2, 48);
            Object[] objArr3 = {TaskId.m1128boximpl(taskResponse2.m450getUuidFxcw9s())};
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                objN3 = new crg(21);
                e18Var2.k0(objN3);
            }
            nwb nwbVar3 = (nwb) iuj.I(objArr3, (zy7) objN3, e18Var2, 48);
            boolean zF = e18Var2.f(taskResponse2.m450getUuidFxcw9s());
            Object objN4 = e18Var2.N();
            um6 um6Var = um6.E;
            if (zF || objN4 == lz1Var) {
                objN4 = mpk.P(um6Var);
                e18Var2.k0(objN4);
            }
            nwb nwbVar4 = (nwb) objN4;
            boolean zF2 = e18Var2.f(taskResponse2.m450getUuidFxcw9s());
            Object objN5 = e18Var2.N();
            if (zF2 || objN5 == lz1Var) {
                objN5 = mpk.P(um6Var);
                e18Var2.k0(objN5);
            }
            nwb nwbVar5 = (nwb) objN5;
            Object objN6 = e18Var2.N();
            if (objN6 == lz1Var) {
                objN6 = mpk.w(new ws5(kdgVar, 5));
                e18Var2.k0(objN6);
            }
            wlg wlgVar = (wlg) objN6;
            Object objN7 = e18Var2.N();
            if (objN7 == lz1Var) {
                objN7 = mpk.w(new u45(kdgVar, nwbVar2, 1));
                e18Var2.k0(objN7);
            }
            wlg wlgVar2 = (wlg) objN7;
            Object objN8 = e18Var2.N();
            if (objN8 == lz1Var) {
                i3 = i2;
                objN8 = mpk.w(new mw8(wlgVar2, nwbVar4, nwbVar, 1));
                e18Var2.k0(objN8);
            } else {
                i3 = i2;
            }
            wlg wlgVar3 = (wlg) objN8;
            Object objN9 = e18Var2.N();
            int i4 = 6;
            if (objN9 == lz1Var) {
                objN9 = mpk.w(new cnb(wlgVar2, i4));
                e18Var2.k0(objN9);
            }
            wlg wlgVar4 = (wlg) objN9;
            iqb iqbVarB = iqbVar.B(androidx.compose.foundation.layout.b.c);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarB);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            String str = (String) nwbVar.getValue();
            iqb iqbVarN = gb9.N(androidx.compose.foundation.layout.b.c(fqb.E, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 7);
            boolean zF3 = e18Var2.f(nwbVar);
            Object objN10 = e18Var2.N();
            if (zF3 || objN10 == lz1Var) {
                objN10 = new shf(3, nwbVar);
                e18Var2.k0(objN10);
            }
            mwa.b(str, (bz7) objN10, "Filter by kind or payload", iqbVarN, false, false, null, null, vuk.a, null, null, null, null, null, false, 0, 0, 0L, null, e18Var2, 100666752, 0, 2096880);
            qnc qncVarD = gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 7);
            hw9 hw9Var2 = new hw9(1.0f, true);
            boolean zH = e18Var2.h(e8hVar) | ((i3 & 14) == 4) | e18Var2.h(kdgVar) | e18Var2.f(nwbVar4) | e18Var2.f(nwbVar2) | e18Var2.f(nwbVar3) | e18Var2.f(nwbVar5);
            Object objN11 = e18Var2.N();
            if (zH || objN11 == lz1Var) {
                z = true;
                hw9Var = hw9Var2;
                ad2 ad2Var = new ad2(e8hVar, taskResponse, kdgVar, nwbVar4, wlgVar3, wlgVar4, nwbVar2, wlgVar, nwbVar3, nwbVar5, 2);
                e18Var2.k0(ad2Var);
                objN11 = ad2Var;
            } else {
                hw9Var = hw9Var2;
                z = true;
            }
            knk.h(hw9Var, null, qncVarD, false, null, null, null, false, null, (bz7) objN11, e18Var2, 384, 506);
            e18Var = e18Var2;
            g(pz7Var, e18Var, (i3 >> 6) & 14);
            e18Var.p(z);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new p3h(i, 2, pz7Var, iqbVar, taskResponse, e8hVar);
        }
    }

    public static final void k(e8h e8hVar, ld4 ld4Var, int i) {
        e8hVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-247603957);
        int i2 = (e18Var.h(e8hVar) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            pp3 pp3Var = (pp3) e18Var.j(ve4.e);
            tqh tqhVar = tqh.T;
            ud0 ud0Var = ud0.Y;
            boolean z = !e8hVar.c.isEmpty();
            boolean zH = e18Var.h(pp3Var) | e18Var.h(e8hVar);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new ytf(pp3Var, 12, e8hVar);
                e18Var.k0(objN);
            }
            tqhVar.y(ud0Var, "Copy all events", null, z, (zy7) objN, e18Var, 196656, 4);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m5h(e8hVar, i);
        }
    }

    public static final e8h l(TaskId taskId, e18 e18Var) {
        taskId.getClass();
        m7f m7fVar = (m7f) e18Var.j(gr9.b);
        boolean zF = e18Var.f(taskId);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = (e8h) m7fVar.a(jce.a.b(e8h.class), null, null);
            e18Var.k0(objN);
        }
        return (e8h) objN;
    }
}
