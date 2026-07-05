package defpackage;

import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.conway.protocol.ConwaySearchHit;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vsk {
    public static final ta4 a = new ta4(190807873, false, new xb4(3));

    public static final void a(ConwaySearchHit conwaySearchHit, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        int i3;
        int i4;
        String role;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-496841279);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? e18Var.f(conwaySearchHit) : e18Var.h(conwaySearchHit) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        int i5 = i2 | 384;
        if (e18Var.Q(i5 & 1, (i5 & 147) != 146)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarL = gb9.L(b.c(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), false, d4c.j0(R.string.conway_search_result_jump, e18Var), new vue(0), null, zy7Var, 9), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            String role2 = conwaySearchHit.getRole();
            int iHashCode2 = role2.hashCode();
            if (iHashCode2 == 3565976) {
                if (role2.equals("tool")) {
                    i3 = -1187649900;
                    i4 = R.string.conway_role_tool;
                    role = vb7.n(e18Var, i3, i4, e18Var, false);
                }
                e18Var.a0(-1187647697);
                e18Var.p(false);
                role = conwaySearchHit.getRole();
            } else if (iHashCode2 != 3599307) {
                if (iHashCode2 == 1429828318 && role2.equals("assistant")) {
                    i3 = -1187652231;
                    i4 = R.string.conway_role_assistant;
                    role = vb7.n(e18Var, i3, i4, e18Var, false);
                }
                e18Var.a0(-1187647697);
                e18Var.p(false);
                role = conwaySearchHit.getRole();
            } else {
                if (role2.equals("user")) {
                    i3 = -1187654572;
                    i4 = R.string.conway_role_user;
                    role = vb7.n(e18Var, i3, i4, e18Var, false);
                }
                e18Var.a0(-1187647697);
                e18Var.p(false);
                role = conwaySearchHit.getRole();
            }
            tjh.b(role, null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).j, e18Var, 0, 0, 131066);
            tjh.b(conwaySearchHit.getSnippet(), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 24960, 110586);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(i, 21, iqbVar2, conwaySearchHit, zy7Var);
        }
    }

    public static final void b(bz4 bz4Var, bz7 bz7Var, bz7 bz7Var2, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        bz4Var.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(2090846599);
        int i2 = i | (e18Var2.f(bz4Var) ? 4 : 2) | (e18Var2.h(bz7Var) ? 32 : 16) | (e18Var2.h(bz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            iqbVar2 = fqb.E;
            e18Var = e18Var2;
            iuj.f(zy7Var, iqbVar2, iuj.G(true, null, e18Var2, 6, 2), MTTypesetterKt.kLineSkipLimitMultiplier, false, null, gm3.a(e18Var2).o, 0L, 0L, null, null, null, fd9.q0(242556009, new xg4((Object) bz4Var, bz7Var, (Object) bz7Var2, 7), e18Var2), e18Var, (i2 >> 9) & 126, 3072, 8120);
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo((Object) bz4Var, (Object) bz7Var, (Object) bz7Var2, zy7Var, iqbVar2, i, 13);
        }
    }

    public static final void c(bz4 bz4Var, bz7 bz7Var, bz7 bz7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        boolean z;
        xo1 xo1Var = lja.K;
        bz4Var.getClass();
        String str = bz4Var.a;
        String str2 = bz4Var.d;
        bz7Var.getClass();
        bz7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1746052946);
        int i2 = i | (e18Var.f(bz4Var) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.h(bz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            yih yihVarT = cpk.t(0, 2, e18Var, str);
            boolean zF = ((i2 & 112) == 32) | e18Var.f(yihVarT);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new ed3(bz7Var, yihVarT, null, 21);
                e18Var.k0(objN);
            }
            fd9.i(e18Var, (pz7) objN, yihVarT);
            fqb fqbVar = fqb.E;
            iqb iqbVarL = gb9.L(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            gwk.f(yihVarT, androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), null, false, d4c.j0(R.string.conway_search_hint, e18Var), null, 0L, 0L, 0L, 0L, 0L, null, null, e18Var, 48, 8172);
            e18Var = e18Var;
            kxk.g(e18Var, androidx.compose.foundation.layout.b.e(fqbVar, 12.0f));
            if (bz4Var.c) {
                e18Var.a0(558512649);
                iqb iqbVarJ = gb9.J(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), 24.0f);
                o5b o5bVarD = dw1.d(xo1Var, false);
                int iHashCode2 = Long.hashCode(e18Var.T);
                hyc hycVarL2 = e18Var.l();
                iqb iqbVarE2 = kxk.E(e18Var, iqbVarJ);
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
                tjd.a(null, gm3.a(e18Var).N, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 0, 61);
                z = true;
                e18Var.p(true);
                e18Var.p(false);
            } else if (str2 != null) {
                e18Var.a0(558822060);
                tjh.b(d4c.k0(R.string.conway_search_error, new Object[]{str2}, e18Var), gb9.J(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), 24.0f), gm3.a(e18Var).z, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 48, 0, 130040);
                e18Var = e18Var;
                e18Var.p(false);
                z = true;
            } else if (bsg.I0(str) || !bz4Var.b.isEmpty()) {
                e18Var.a0(18049716);
                iqb iqbVarG = androidx.compose.foundation.layout.b.g(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 480.0f, 1);
                boolean z2 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
                Object objN2 = e18Var.N();
                if (z2 || objN2 == lz1Var) {
                    objN2 = new lj2(bz4Var, 28, bz7Var2);
                    e18Var.k0(objN2);
                }
                knk.h(iqbVarG, null, null, false, null, null, null, false, null, (bz7) objN2, e18Var, 6, 510);
                e18Var = e18Var;
                e18Var.p(false);
                z = true;
            } else {
                e18Var.a0(559249302);
                iqb iqbVarL2 = gb9.L(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 24.0f, 1);
                o5b o5bVarD2 = dw1.d(xo1Var, false);
                int iHashCode3 = Long.hashCode(e18Var.T);
                hyc hycVarL3 = e18Var.l();
                iqb iqbVarE3 = kxk.E(e18Var, iqbVarL2);
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, z80Var, o5bVarD2);
                d4c.i0(e18Var, z80Var2, hycVarL3);
                ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
                d4c.i0(e18Var, z80Var4, iqbVarE3);
                xb5.b(bz4Var.a, null, null, e18Var, 0, 6);
                z = true;
                e18Var.p(true);
                e18Var.p(false);
            }
            e18Var.p(z);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fn((Object) bz4Var, (Object) bz7Var, (Object) bz7Var2, iqbVar2, i, 28);
        }
    }

    public static final fab d(qqb qqbVar, bbi bbiVar, es9 es9Var) {
        fab fabVarH;
        qqb qqbVar2 = qqbVar instanceof qqb ? qqbVar : null;
        if (qqbVar2 != null && (fabVarH = qqbVar2.H(bbiVar, es9Var)) != null) {
            return fabVarH;
        }
        fab fabVarO = qqbVar.o(bbiVar);
        fabVarO.getClass();
        return fabVarO;
    }

    public static final fab e(qqb qqbVar, es9 es9Var) {
        fab fabVarM0;
        qqb qqbVar2 = qqbVar instanceof qqb ? qqbVar : null;
        if (qqbVar2 != null && (fabVarM0 = qqbVar2.m0(es9Var)) != null) {
            return fabVarM0;
        }
        fab fabVarL0 = qqbVar.l0();
        fabVarL0.getClass();
        return fabVarL0;
    }

    public static Object[] f(int i, Object[] objArr) {
        if (objArr.length < i) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public static final void g(CharSequence charSequence, char[] cArr, int i, int i2, int i3) {
        if (charSequence instanceof efh) {
            g(((efh) charSequence).G, cArr, i, i2, i3);
            return;
        }
        while (i2 < i3) {
            cArr[i] = charSequence.charAt(i2);
            i2++;
            i++;
        }
    }
}
