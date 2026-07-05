package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q0h {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final qcg f;

    static {
        float f2 = me7.u;
        a = f2;
        b = me7.E;
        c = me7.B;
        float f3 = me7.y;
        d = f3;
        e = (f3 - f2) / 2.0f;
        f = new qcg(0);
    }

    public static final void a(boolean z, bz7 bz7Var, iqb iqbVar, boolean z2, p0h p0hVar, ld4 ld4Var, int i, int i2) {
        int i3;
        p0h p0hVarE;
        e18 e18Var;
        boolean z3;
        p0h p0hVar2;
        iqb iqbVar2;
        int i4;
        p0h p0hVar3;
        fqb fqbVar;
        iqb iqbVar3;
        boolean z4;
        zub zubVar;
        boolean z5;
        iqb iqbVarB;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-263339167);
        if ((i & 6) == 0) {
            i3 = i | (e18Var2.g(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var2.h(bz7Var) ? 32 : 16;
        }
        int i5 = i3 | 28032;
        if ((i & 196608) == 0) {
            if ((i2 & 32) == 0) {
                p0hVarE = p0hVar;
                int i6 = e18Var2.f(p0hVarE) ? 131072 : 65536;
                i5 |= i6;
            } else {
                p0hVarE = p0hVar;
            }
            i5 |= i6;
        } else {
            p0hVarE = p0hVar;
        }
        int i7 = i5 | 1572864;
        if (e18Var2.Q(i7 & 1, (599187 & i7) != 599186)) {
            e18Var2.V();
            int i8 = i & 1;
            fqb fqbVar2 = fqb.E;
            if (i8 == 0 || e18Var2.A()) {
                if ((i2 & 32) != 0) {
                    p0hVarE = djk.e(e18Var2);
                    i7 &= -458753;
                }
                i4 = i7;
                p0hVar3 = p0hVarE;
                fqbVar = fqbVar2;
                iqbVar3 = fqbVar;
                z4 = true;
            } else {
                e18Var2.T();
                if ((i2 & 32) != 0) {
                    i7 &= -458753;
                }
                iqbVar3 = iqbVar;
                i4 = i7;
                p0hVar3 = p0hVarE;
                fqbVar = fqbVar2;
                z4 = z2;
            }
            e18Var2.q();
            e18Var2.a0(1768510810);
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = vb7.f(e18Var2);
            }
            zub zubVar2 = (zub) objN;
            e18Var2.p(false);
            if (bz7Var != null) {
                mo8 mo8Var = z79.a;
                zubVar = zubVar2;
                z5 = z4;
                iqbVarB = pkb.E.B(new srh(z, zubVar2, null, false, z4, new vue(2), bz7Var));
            } else {
                zubVar = zubVar2;
                z5 = z4;
                iqbVarB = fqbVar;
            }
            int i9 = i4 << 3;
            int i10 = i4 >> 6;
            int i11 = (i9 & 112) | (i10 & 896) | (i10 & 7168) | (i9 & 57344);
            zub zubVar3 = zubVar;
            e18Var = e18Var2;
            p0h p0hVar4 = p0hVar3;
            b(b.k(b.y(iqbVar3.B(iqbVarB), lja.K, 2), c, d), z, z5, p0hVar4, zubVar3, k1g.b(me7.r, e18Var2), e18Var, i11);
            z3 = z5;
            p0hVar2 = p0hVar4;
            iqbVar2 = iqbVar3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            z3 = z2;
            p0hVar2 = p0hVarE;
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ak1(z, bz7Var, iqbVar2, z3, p0hVar2, i, i2, 3);
        }
    }

    public static final void b(iqb iqbVar, boolean z, boolean z2, p0h p0hVar, w79 w79Var, e0g e0gVar, ld4 ld4Var, int i) {
        int i2;
        e0g e0gVar2;
        iqb iqbVar2;
        e0g e0gVar3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-670917213);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(p0hVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(null) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.f(w79Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.f(e0gVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if (e18Var.Q(i2 & 1, (599187 & i2) != 599186)) {
            long j = z2 ? z ? p0hVar.b : p0hVar.f : z ? p0hVar.j : p0hVar.n;
            long j2 = z2 ? z ? p0hVar.a : p0hVar.e : z ? p0hVar.i : p0hVar.m;
            e0g e0gVarB = k1g.b(me7.A, e18Var);
            xe4 xe4Var = due.a;
            boolean zR = x44.r(e18Var.j(xe4Var), aue.b);
            iqb iqbVarA = fqb.E;
            if (zR) {
                iqbVar2 = iqbVarA;
                e0gVar3 = e0gVarB;
                iqbVarA = d19.a(iqbVar2, w79Var, due.a(false, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, e0gVarB, true, 7));
            } else {
                iqbVar2 = iqbVarA;
                e0gVar3 = e0gVarB;
            }
            iqb iqbVarB = yfd.p(ez1.t(iqbVar, me7.z, z2 ? z ? p0hVar.c : p0hVar.g : z ? p0hVar.k : p0hVar.o, e0gVar3), j, e0gVar3).B(iqbVarA);
            o5b o5bVarD = dw1.d(lja.G, false);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            e0gVar2 = e0gVar;
            iqb iqbVarP = yfd.p(d19.a(nw1.a.a(iqbVar2, lja.J).B(new eph(w79Var, z, u00.P(asb.F, e18Var))), w79Var, due.a(false, me7.x / 2.0f, 0L, null, x44.r(e18Var.j(xe4Var), aue.a), 220)), j2, e0gVar2);
            o5b o5bVarD2 = dw1.d(lja.K, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarP);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            e18Var.a0(1236071411);
            e18Var.p(false);
            e18Var.p(true);
            e18Var.p(true);
        } else {
            e0gVar2 = e0gVar;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yb2(iqbVar, z, z2, p0hVar, w79Var, e0gVar2, i);
        }
    }
}
