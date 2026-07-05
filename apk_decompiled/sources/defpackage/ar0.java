package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ar0 {
    public static final void a(ArtifactFullScreenParams artifactFullScreenParams, zy7 zy7Var, pz7 pz7Var, iqb iqbVar, qi3 qi3Var, u4f u4fVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        qi3 qi3Var2;
        u4f u4fVar2;
        iqb iqbVar3;
        int i2;
        u4f u4fVar3;
        qi3 qi3Var3;
        u4f u4fVar4;
        int i3;
        artifactFullScreenParams.getClass();
        zy7Var.getClass();
        pz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1119065175);
        int i4 = i | (e18Var.f(artifactFullScreenParams) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.h(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 76800;
        if (e18Var.Q(i4 & 1, (74899 & i4) != 74898)) {
            e18Var.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3 qi3Var4 = (qi3) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(u4f.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                iqbVar3 = fqb.E;
                i2 = i4 & (-516097);
                u4fVar3 = (u4f) objN2;
                qi3Var3 = qi3Var4;
            } else {
                e18Var.T();
                iqbVar3 = iqbVar;
                qi3Var3 = qi3Var;
                i2 = i4 & (-516097);
                u4fVar3 = u4fVar;
            }
            e18Var.q();
            boolean zH = e18Var.h(qi3Var3);
            Object objN3 = e18Var.N();
            if (zH || objN3 == lz1Var) {
                objN3 = new gw(qi3Var3, null, 4);
                e18Var.k0(objN3);
            }
            csg.g((bz7) objN3, e18Var, 0, 1);
            Context context = (Context) e18Var.j(w00.b);
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN4);
            }
            l45 l45Var = (l45) objN4;
            m7f m7fVar = (m7f) e18Var.j(gr9.b);
            boolean zH2 = ((((i2 & 14) ^ 6) > 4 && e18Var.f(artifactFullScreenParams)) || (i2 & 6) == 4) | e18Var.h(m7fVar);
            Object objN5 = e18Var.N();
            if (zH2 || objN5 == lz1Var) {
                objN5 = new l0(artifactFullScreenParams, 14, m7fVar);
                e18Var.k0(objN5);
            }
            kce kceVar = jce.a;
            xq0 xq0Var = (xq0) fd9.r0(kceVar.b(xq0.class), oq5.B(kceVar.b(xq0.class)), (bz7) objN5, e18Var);
            Object objN6 = e18Var.N();
            if (objN6 == lz1Var) {
                objN6 = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objN6;
            lsc lscVar = xq0Var.l;
            Object objN7 = e18Var.N();
            if (objN7 == lz1Var) {
                objN7 = mpk.P(null);
                e18Var.k0(objN7);
            }
            nwb nwbVar = (nwb) objN7;
            String strJ0 = d4c.j0(R.string.artifact_viewer_title_page, e18Var);
            Object objN8 = e18Var.N();
            if (objN8 == lz1Var) {
                objN8 = u4fVar3.a(context, strJ0);
                e18Var.k0(objN8);
            }
            t4f t4fVar = (t4f) objN8;
            boolean zH3 = e18Var.h(t4fVar);
            Object objN9 = e18Var.N();
            if (zH3 || objN9 == lz1Var) {
                objN9 = new l0(t4fVar, 15, nwbVar);
                e18Var.k0(objN9);
            }
            int i6 = t4f.a0;
            fd9.d(t4fVar, (bz7) objN9, e18Var);
            String str = (String) nwbVar.getValue();
            if (str == null) {
                e18Var.a0(-533221744);
                e18Var.p(false);
                u4fVar4 = u4fVar3;
                i3 = 0;
            } else {
                e18Var.a0(-533221743);
                Object objN10 = e18Var.N();
                if (objN10 == lz1Var) {
                    u4fVar4 = u4fVar3;
                    objN10 = new ve(10, nwbVar);
                    e18Var.k0(objN10);
                } else {
                    u4fVar4 = u4fVar3;
                }
                skk.a(str, (zy7) objN10, e18Var, 48);
                i3 = 0;
                e18Var.p(false);
            }
            int i7 = i2;
            iqb iqbVar4 = iqbVar3;
            u4f u4fVar5 = u4fVar4;
            ta4 ta4VarQ0 = fd9.q0(1099848774, new lw(iqbVar4, zy7Var, artifactFullScreenParams, l45Var, xq0Var, t4fVar, lscVar), e18Var);
            ta4 ta4VarQ02 = fd9.q0(-1483840155, new kn(xq0Var, 5, ybgVar), e18Var);
            ta4 ta4VarQ03 = fd9.q0(227438212, new rn(ybgVar, 3), e18Var);
            ta4 ta4VarQ04 = fd9.q0(1027756467, new bn((Object) artifactFullScreenParams, (Object) t4fVar, (Object) xq0Var, zy7Var, 2), e18Var);
            qi3Var2 = qi3Var3;
            int i8 = i3;
            v40.b(null, null, ta4VarQ0, ta4VarQ02, ta4VarQ03, null, 0, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, ta4VarQ04, e18Var, 28032, 2019);
            e18Var = e18Var;
            zy1 zy1Var = xq0Var.i;
            int i9 = (i7 & 896) == 256 ? 1 : i8;
            Object objN11 = e18Var.N();
            if (i9 != 0 || objN11 == lz1Var) {
                objN11 = new g9(pz7Var, (tp4) null, 9);
                e18Var.k0(objN11);
            }
            x44.b(zy1Var, (pz7) objN11, e18Var, i8);
            iqbVar2 = iqbVar4;
            u4fVar2 = u4fVar5;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            qi3Var2 = qi3Var;
            u4fVar2 = u4fVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ne(artifactFullScreenParams, zy7Var, pz7Var, iqbVar2, qi3Var2, u4fVar2, i, 4);
        }
    }

    public static final void b(ArtifactFullScreenParams artifactFullScreenParams, t4f t4fVar, xq0 xq0Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        float f;
        float f2;
        boolean z;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-339476041);
        int i2 = i | (e18Var.h(t4fVar) ? 32 : 16) | (e18Var.f(xq0Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var.Q(i2 & 1, (i2 & 9361) != 9360)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            if (((Boolean) nwbVar.getValue()).booleanValue()) {
                f = 1.0f;
                f2 = 0.0f;
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            float f3 = f2;
            t4fVar.setAlpha(((Number) n80.b(f, null, null, e18Var, 0, 30).getValue()).floatValue());
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN2);
            }
            l45 l45Var = (l45) objN2;
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
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
            iqb iqbVarH = xkk.h(e18Var, xn5.V(gb9.L(fqb.E, 8.0f, f3, 2).B(b.c), xve.b(16.0f)));
            int i3 = i2 & 112;
            boolean z2 = i3 == 32 || e18Var.h(t4fVar);
            Object objN3 = e18Var.N();
            if (z2 || objN3 == lz1Var) {
                z = false;
                objN3 = new yq0(t4fVar, 0);
                e18Var.k0(objN3);
            } else {
                z = false;
            }
            bz7 bz7Var = (bz7) objN3;
            boolean zH = ((i3 == 32 || e18Var.h(t4fVar)) ? true : z) | e18Var.h(l45Var) | ((i2 & 896) == 256 ? true : z) | ((i2 & 7168) == 2048 ? true : z);
            Object objN4 = e18Var.N();
            if (zH || objN4 == lz1Var) {
                w20 w20Var = new w20(l45Var, xq0Var, t4fVar, zy7Var, nwbVar, 1);
                nwbVar = nwbVar;
                e18Var.k0(w20Var);
                objN4 = w20Var;
            }
            uj5.a(bz7Var, iqbVarH, (bz7) objN4, e18Var, 0, 0);
            wd6.M(!((Boolean) nwbVar.getValue()).booleanValue(), null, gp6.e(null, 3), gp6.f(null, 3), null, cvj.c, e18Var, 200064, 18);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo((Object) artifactFullScreenParams, (Object) t4fVar, (Object) xq0Var, zy7Var, iqbVar, i, 3);
        }
    }
}
