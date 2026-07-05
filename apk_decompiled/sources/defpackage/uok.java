package defpackage;

import androidx.compose.foundation.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.health.platform.client.proto.e;
import androidx.health.platform.client.proto.s;
import androidx.health.platform.client.proto.z;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uok {
    public static final ta4 F = new ta4(-1576412099, false, new tb4(4));
    public final /* synthetic */ int E = 4;

    public static final void d(int i, int i2, ld4 ld4Var, zy7 zy7Var, iqb iqbVar) {
        iqb iqbVar2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-728184452);
        int i3 = i2 | (e18Var.d(i) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | 384;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            String strK0 = d4c.k0(R.string.diff_comments_chip_description, new Object[]{Integer.valueOf(i)}, e18Var);
            vve vveVarB = xve.b(16.0f);
            fqb fqbVar = fqb.E;
            iqb iqbVarK = gb9.K(b.c(yfd.p(xn5.V(fqbVar, vveVarB), d54.b(0.1f, gm3.a(e18Var).M), vveVarB), false, null, null, null, zy7Var, 15), 10.0f, 6.0f);
            boolean zF = e18Var.f(strK0);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new w43(strK0, 21);
                e18Var.k0(objN);
            }
            iqb iqbVarB = tjf.b(iqbVarK, false, (bz7) objN);
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarB);
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
            cv8.b(a.a(ud0.H, e18Var), null, androidx.compose.foundation.layout.b.o(fqbVar, 14.0f), gm3.a(e18Var).N, e18Var, 440, 0);
            kxk.g(e18Var, androidx.compose.foundation.layout.b.t(fqbVar, 4.0f));
            tjh.b(d4c.f0(R.plurals.diff_comments_chip_text, i, new Object[]{Integer.valueOf(i)}, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).j, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mu(i, i2, 10, zy7Var, iqbVar2);
        }
    }

    public static final void e(String str, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        str.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(2115273293);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        byte b = 0;
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var = e18Var2;
            trk.b(zy7Var2, fd9.q0(-251321142, new sxa(zy7Var, 3, b), e18Var2), null, fd9.q0(-862590200, new sxa(zy7Var2, i3, b), e18Var2), fd9.q0(-1473859258, new yi7(str, 14), e18Var2), null, null, 0L, 0L, 0L, 0L, null, e18Var, ((i2 >> 6) & 14) | 199728, 0, 16340);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t2b(str, zy7Var, zy7Var2, i, 0);
        }
    }

    public static final void f(boolean z, lne lneVar, zhh zhhVar, ld4 ld4Var, int i) {
        int i2;
        zjh zjhVarD;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1344558920);
        if ((i & 6) == 0) {
            i2 = (e18Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.d(lneVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zhhVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            int i4 = i2 & 14;
            boolean zF = (i4 == 4) | e18Var.f(zhhVar);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new lif(zhhVar, z);
                e18Var.k0(objN);
            }
            zeh zehVar = (zeh) objN;
            boolean zH = e18Var.h(zhhVar) | (i4 == 4);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new aih(zhhVar, z);
                e18Var.k0(objN2);
            }
            qcc qccVar = (qcc) objN2;
            boolean zH2 = kkh.h(zhhVar.t().b);
            int i5 = (int) (z ? zhhVar.t().b >> 32 : zhhVar.t().b & 4294967295L);
            m2a m2aVar = zhhVar.d;
            float fD = (m2aVar == null || (zjhVarD = m2aVar.d()) == null) ? MTTypesetterKt.kLineSkipLimitMultiplier : xpk.d(zjhVarD.a, i5);
            boolean zH3 = e18Var.h(zehVar);
            Object objN3 = e18Var.N();
            if (zH3 || objN3 == lz1Var) {
                objN3 = new vhf(zehVar, i3);
                e18Var.k0(objN3);
            }
            rqk.f(qccVar, z, lneVar, zH2, 0L, fD, a0h.a(fqb.E, zehVar, (PointerInputEventHandler) objN3), e18Var, (i2 << 3) & 1008, 16);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ds0(z, lneVar, zhhVar, i, 13);
        }
    }

    public static final void g(cp4 cp4Var, hp4 hp4Var, ieh iehVar, boolean z, zy7 zy7Var) {
        if (z) {
            cp4.b(cp4Var, new u74(0, iehVar), null, new p4(zy7Var, 13, hp4Var), 14);
        }
    }

    public static goe i(qh9 qh9Var) {
        try {
            Number numberL = qh9Var.s("session_sample_rate").l();
            bh9 bh9VarS = qh9Var.s("session_replay_sample_rate");
            Number numberL2 = bh9VarS != null ? bh9VarS.l() : null;
            bh9 bh9VarS2 = qh9Var.s("profiling_sample_rate");
            Number numberL3 = bh9VarS2 != null ? bh9VarS2.l() : null;
            bh9 bh9VarS3 = qh9Var.s("trace_sample_rate");
            Number numberL4 = bh9VarS3 != null ? bh9VarS3.l() : null;
            numberL.getClass();
            return new goe(numberL, numberL2, numberL3, numberL4);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Configuration", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Configuration", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Configuration", e3);
            return null;
        }
    }

    public static final s j(lr lrVar) {
        lrVar.getClass();
        yje yjeVarU = s.u();
        z zVarL = psk.l(lrVar.b);
        yjeVarU.b();
        s.p((s) yjeVarU.F, zVarL);
        ArrayList arrayListM = m(lrVar.d);
        yjeVarU.b();
        s.r((s) yjeVarU.F, arrayListM);
        Set set = lrVar.a;
        ArrayList arrayList = new ArrayList(x44.y(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(qok.p((vr) it.next()));
        }
        yjeVarU.b();
        s.q((s) yjeVarU.F, arrayList);
        long millis = lrVar.c.toMillis();
        yjeVarU.b();
        s.s((s) yjeVarU.F, millis);
        return (s) yjeVarU.a();
    }

    public static final s k(mr mrVar) {
        mrVar.getClass();
        yje yjeVarU = s.u();
        z zVarL = psk.l(mrVar.b);
        yjeVarU.b();
        s.p((s) yjeVarU.F, zVarL);
        ArrayList arrayListM = m(mrVar.d);
        yjeVarU.b();
        s.r((s) yjeVarU.F, arrayListM);
        Set set = mrVar.a;
        ArrayList arrayList = new ArrayList(x44.y(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(qok.p((vr) it.next()));
        }
        yjeVarU.b();
        s.q((s) yjeVarU.F, arrayList);
        String string = mrVar.c.toString();
        yjeVarU.b();
        s.t((s) yjeVarU.F, string);
        return (s) yjeVarU.a();
    }

    public static final s l(xr xrVar) {
        xrVar.getClass();
        yje yjeVarU = s.u();
        z zVarL = psk.l(xrVar.b);
        yjeVarU.b();
        s.p((s) yjeVarU.F, zVarL);
        ArrayList arrayListM = m(xrVar.c);
        yjeVarU.b();
        s.r((s) yjeVarU.F, arrayListM);
        Set set = xrVar.a;
        ArrayList arrayList = new ArrayList(x44.y(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(qok.p((vr) it.next()));
        }
        yjeVarU.b();
        s.q((s) yjeVarU.F, arrayList);
        return (s) yjeVarU.a();
    }

    public static final ArrayList m(Set set) {
        Set<cg5> set2 = set;
        ArrayList arrayList = new ArrayList(x44.y(set2, 10));
        for (cg5 cg5Var : set2) {
            ig5 ig5VarS = e.s();
            String str = cg5Var.a;
            ig5VarS.b();
            e.p((e) ig5VarS.F, str);
            arrayList.add((e) ig5VarS.a());
        }
        return arrayList;
    }

    public static final void n(StringBuilder sb, Iterator it, bm4 bm4Var) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(bm4.s(entry.getKey()));
            sb.append(" : ");
            sb.append(bm4.s(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(bm4.s(entry2.getKey()));
                sb.append(" : ");
                sb.append(bm4.s(entry2.getValue()));
            }
        }
    }

    public abstract Object h();

    public String toString() {
        switch (this.E) {
            case 4:
                return h().toString();
            default:
                return super.toString();
        }
    }
}
