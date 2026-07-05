package defpackage;

import android.content.Context;
import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ztk {
    public static final ta4 a = new ta4(-132848998, false, new cc4(2));

    static {
        new ta4(1495771265, false, new cc4(3));
    }

    public static final void a(List list, zy7 zy7Var, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(658825180);
        int i2 = i | (e18Var.f(list) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new fr4(24);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var, 48);
            boolean z = (i2 & 14) == 4;
            Object objN2 = e18Var.N();
            if (z || objN2 == lz1Var) {
                objN2 = mpk.x(new u45(list, nwbVar, 0), a5.N);
                e18Var.k0(objN2);
            }
            wpk.a(zy7Var, null, fd9.q0(-28651611, new f44(nwbVar, (wlg) objN2, bz7Var), e18Var), e18Var, ((i2 >> 3) & 14) | 384, 2);
            iqbVar2 = fqb.E;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v45(list, zy7Var, bz7Var, iqbVar2, i, 0);
        }
    }

    public static final void b(iqb iqbVar, rp6 rp6Var, bz7 bz7Var, bz7 bz7Var2, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2108385078);
        int i2 = i | (e18Var.f(rp6Var) ? 32 : 16) | (e18Var.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(bz7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            Object[] objArr = new Object[0];
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new fr4(23);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var, 48);
            wo1 wo1Var = lja.Q;
            String strJ0 = d4c.j0(R.string.verification_flow_phone_country_select_action, e18Var);
            int i3 = (i2 & 112) ^ 48;
            boolean zF = ((i2 & 896) == 256) | e18Var.f(nwbVar) | ((i3 > 32 && e18Var.f(rp6Var)) || (i2 & 48) == 32);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new yg4(bz7Var, rp6Var, nwbVar, 9);
                e18Var.k0(objN2);
            }
            iqb iqbVarC = b.c(iqbVar, false, strJ0, null, null, (zy7) objN2, 13);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarC);
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
            tjh.b(((String) rp6Var.o.getValue()) + " +" + rp6Var.Q().E, null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 0, 0, 262138);
            ud0 ud0Var = ud0.B;
            long j = gm3.a(e18Var).N;
            e18Var = e18Var;
            iv1.b(ud0Var, null, null, ef2.F, j, e18Var, 3120, 4);
            e18Var.p(true);
            if (((Boolean) nwbVar.getValue()).booleanValue()) {
                e18Var.a0(1299111020);
                List list = (List) rp6Var.m.getValue();
                int i4 = i2 & 7168;
                boolean zF2 = e18Var.f(nwbVar) | (i4 == 2048);
                Object objN3 = e18Var.N();
                if (zF2 || objN3 == lz1Var) {
                    objN3 = new bi(bz7Var2, nwbVar, 2);
                    e18Var.k0(objN3);
                }
                zy7 zy7Var = (zy7) objN3;
                boolean zF3 = e18Var.f(nwbVar) | ((i3 > 32 && e18Var.f(rp6Var)) || (i2 & 48) == 32) | (i4 == 2048);
                Object objN4 = e18Var.N();
                if (zF3 || objN4 == lz1Var) {
                    objN4 = new ny4(rp6Var, bz7Var2, nwbVar, 3);
                    e18Var.k0(objN4);
                }
                a(list, zy7Var, (bz7) objN4, null, e18Var, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(1299572300);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fn(iqbVar, rp6Var, bz7Var, bz7Var2, i);
        }
    }

    public static final void c(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str) {
        e18 e18Var;
        iqb iqbVar2;
        boolean z;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(528464032);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.h(zy7Var) ? 32 : 16) | 384;
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            jl3 jl3VarA = gm3.a(e18Var2);
            jm3 jm3Var = (jm3) gm3.c(e18Var2).e.E;
            String strK0 = d4c.k0(R.string.ccr_next_prompt_suggestion_a11y, new Object[]{str}, e18Var2);
            boolean z2 = (i2 & 14) == 4;
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (z2 || objN == lz1Var) {
                xb0 xb0Var = new xb0();
                xb0Var.h(str);
                xb0Var.h("  ");
                qvk.b(xb0Var, "accept-pill", "�");
                objN = xb0Var.n();
                e18Var2.k0(objN);
            }
            zb0 zb0Var = (zb0) objN;
            tkh tkhVarB = tkh.b(jm3Var.e, jl3VarA.O, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214);
            Map mapSingletonMap = Collections.singletonMap("accept-pill", new t39(new f3d(eve.L(2.0f, 8589934592L), 4, eve.y(1.4d)), fd9.q0(-1474416000, new nw7(zy7Var, 18, jl3VarA), e18Var2)));
            mapSingletonMap.getClass();
            boolean zF = e18Var2.f(strK0) | ((i2 & 112) == 32);
            Object objN2 = e18Var2.N();
            if (zF || objN2 == lz1Var) {
                z = true;
                objN2 = new go3(1 == true ? 1 : 0, zy7Var, strK0);
                e18Var2.k0(objN2);
            } else {
                z = true;
            }
            fqb fqbVar = fqb.E;
            e18Var = e18Var2;
            tjh.c(zb0Var, tjf.b(fqbVar, z, (bz7) objN2), 0L, 0L, 0L, null, 0L, 2, false, 6, 0, mapSingletonMap, null, tkhVarB, e18Var, 0, 24960, 176124);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uf2(str, zy7Var, iqbVar2, i, 3);
        }
    }

    public static final void d(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str) {
        int i2;
        iqb iqbVar2;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-559831609);
        if ((i & 6) == 0) {
            i2 = i | (e18Var.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            vo1 vo1Var = lja.S;
            q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            iqb iqbVarC = androidx.compose.foundation.layout.b.c(fqbVar, 1.0f);
            q64 q64VarA2 = p64.a(ho0Var, vo1Var, e18Var, 6);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarC);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, e18Var, 0, 7);
            tjh.b(str, gb9.L(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, (i3 & 14) | 48, 0, 131064);
            iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, e18Var, 0, 7);
            e18Var.p(true);
            e0g e0gVar = gm3.b(e18Var).l;
            qnc qncVar = q02.a;
            lnk.d(zy7Var, androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), false, e0gVar, q02.d(0L, gm3.a(e18Var).M, 0L, e18Var, 13), gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1), ((jm3) gm3.c(e18Var).e.E).h, lvk.a, e18Var, ((i3 >> 3) & 14) | 806879280, 164);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bk1(str, zy7Var, iqbVar2, i, 7);
        }
    }

    public static void e() {
        Exception exc = new Exception();
        String simpleName = rkj.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final s4e f(Context context) {
        xv8 xv8Var = new xv8(context);
        Context context2 = (Context) xv8Var.F;
        ct5 ct5Var = (ct5) xv8Var.G;
        u0h u0hVar = new u0h(new xw8(xv8Var, 0));
        u0h u0hVar2 = new u0h(new xw8(xv8Var, 1));
        u0h u0hVar3 = new u0h(qs7.S);
        lm6 lm6Var = lm6.E;
        return new s4e(context2, ct5Var, u0hVar, u0hVar2, u0hVar3, new oa4(lm6Var, lm6Var, lm6Var, lm6Var, lm6Var), (zw8) xv8Var.H);
    }

    public static final iqb g(float f) {
        fqb fqbVar = fqb.E;
        return (f == 1.0f && f == 1.0f) ? fqbVar : xn5.j0(fqbVar, f, f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, false, 524284);
    }
}
