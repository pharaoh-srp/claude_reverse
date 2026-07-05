package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.artifact.model.ArtifactType;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ur0 {
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r14, defpackage.bs0 r15, java.lang.String r16, defpackage.iqb r17, defpackage.clh r18, defpackage.ld4 r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur0.a(boolean, bs0, java.lang.String, iqb, clh, ld4, int, int):void");
    }

    public static final void b(ArtifactMetadata artifactMetadata, String str, zy7 zy7Var, iqb iqbVar, boolean z, ld4 ld4Var, int i, int i2) {
        iqb iqbVar2;
        int i3;
        boolean z2;
        int i4;
        e18 e18Var;
        iqb iqbVar3;
        int i5;
        iqb iqbVar4;
        int i6;
        int i7;
        String strN;
        artifactMetadata.getClass();
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(2035448626);
        int i8 = (e18Var2.f(artifactMetadata) ? 4 : 2) | i | (e18Var2.f(str) ? 32 : 16);
        if ((i & 384) == 0) {
            i8 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 = i8 | 3072;
            iqbVar2 = iqbVar;
        } else {
            iqbVar2 = iqbVar;
            i3 = i8 | (e18Var2.f(iqbVar2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        }
        int i10 = i3 | 24576;
        int i11 = i2 & 32;
        if (i11 != 0) {
            i4 = i3 | 221184;
            z2 = z;
        } else {
            z2 = z;
            i4 = i10 | (e18Var2.g(z2) ? 131072 : 65536);
        }
        int i12 = 1;
        if (e18Var2.Q(i4 & 1, (74899 & i4) != 74898)) {
            if (i9 != 0) {
                iqbVar4 = fqb.E;
                i5 = i11;
            } else {
                i5 = i11;
                iqbVar4 = iqbVar2;
            }
            if (i5 != 0) {
                z2 = false;
            }
            boolean z3 = !artifactMetadata.isComplete();
            String title = artifactMetadata.getTitle();
            if (title == null) {
                e18Var2.a0(1856019455);
                ArtifactMetadata.Companion.getClass();
                title = d4c.j0(ArtifactMetadata.DefaultTitle, e18Var2);
            } else {
                e18Var2.a0(1856018897);
            }
            e18Var2.p(false);
            bs0 bs0VarE = e(artifactMetadata.getType());
            int iOrdinal = bs0VarE.ordinal();
            if (iOrdinal == 0) {
                i6 = 1856027709;
                i7 = R.string.artifact_type_code;
            } else if (iOrdinal == 1) {
                i6 = 1856030468;
                i7 = R.string.artifact_type_interactive;
            } else if (iOrdinal == 2) {
                i6 = 1856035966;
                i7 = R.string.artifact_type_image;
            } else if (iOrdinal == 3) {
                i6 = 1856025057;
                i7 = R.string.artifact_type_document;
            } else {
                if (iOrdinal != 4) {
                    throw ebh.u(e18Var2, 1856023572, false);
                }
                i6 = 1856033312;
                i7 = R.string.artifact_type_diagram;
            }
            String strN2 = vb7.n(e18Var2, i6, i7, e18Var2, false);
            ta4 ta4VarQ0 = fd9.q0(-1473210779, new iv(z3, bs0VarE, str, i12), e18Var2);
            String strJ0 = d4c.j0(R.string.artifact_output_item_click_label, e18Var2);
            if (z2) {
                strN = vb7.n(e18Var2, 1856049626, R.string.artifact_edited, e18Var2, false);
            } else {
                e18Var2.a0(1703008075);
                e18Var2.p(false);
                strN = null;
            }
            String str2 = strN;
            int iOrdinal2 = bs0VarE.ordinal();
            e18Var = e18Var2;
            jwk.m(title, strN2, ta4VarQ0, iqbVar4, zy7Var, strJ0, null, str2, (iOrdinal2 == 1 || iOrdinal2 == 2 || iOrdinal2 == 4) ? lja.K : lja.G, 12.0f, null, null, false, e18Var, (i4 & 7168) | 805306752 | ((i4 << 6) & 57344) | 1572864, 0, 7168);
            iqbVar3 = iqbVar4;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar3 = iqbVar2;
        }
        boolean z4 = z2;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tr0(artifactMetadata, str, zy7Var, iqbVar3, z4, i, i2, 0);
        }
    }

    public static final void c(String str, tkh tkhVar, iqb iqbVar, clh clhVar, ld4 ld4Var, int i) {
        String str2;
        int i2;
        tkh tkhVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1799884953);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (e18Var.f(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            tkhVar2 = tkhVar;
            i2 |= e18Var.f(tkhVar2) ? 32 : 16;
        } else {
            tkhVar2 = tkhVar;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(clhVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            iqb iqbVarJ = gb9.J(iqbVar, 12.0f);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new zv(8);
                e18Var.k0(objN);
            }
            iqb iqbVarA = tjf.a(iqbVarJ, (bz7) objN);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarA);
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
            tkh tkhVar3 = tkhVar2;
            tjh.b(str2, fd9.h0(fqb.E, new p6(3)), 0L, clhVar != null ? clhVar.a : clh.c, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar3, e18Var, i2 & 14, (i2 << 18) & 29360128, 131052);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(str, tkhVar, iqbVar, clhVar, i, 5);
        }
    }

    public static final void d(iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1148433029);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            iqb iqbVarK = gb9.K(iqbVar, 6.0f, 12.0f);
            q64 q64VarA = p64.a(new ho0(4.0f, true, new sz6(1)), lja.S, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarK);
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
            fqb fqbVar = fqb.E;
            dw1.a(yfd.p(b.e(b.c(fqbVar, 0.7f), 3.0f), gm3.a(e18Var).u, xve.b(1.0f)), e18Var, 0);
            dw1.a(yfd.p(b.e(b.c(fqbVar, 0.9f), 3.0f), gm3.a(e18Var).u, xve.b(2.0f)), e18Var, 0);
            dw1.a(yfd.p(b.e(b.c(fqbVar, 0.6f), 3.0f), gm3.a(e18Var).u, xve.b(1.0f)), e18Var, 0);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new i10(iqbVar, i, i3, b);
        }
    }

    public static final bs0 e(ArtifactType artifactType) {
        boolean zR = x44.r(artifactType, ArtifactType.Text.INSTANCE);
        bs0 bs0Var = bs0.H;
        return (zR || x44.r(artifactType, ArtifactType.Markdown.INSTANCE)) ? bs0Var : (x44.r(artifactType, ArtifactType.Code.INSTANCE) || x44.r(artifactType, ArtifactType.Repl.INSTANCE)) ? bs0.E : (x44.r(artifactType, ArtifactType.React.INSTANCE) || x44.r(artifactType, ArtifactType.Html.INSTANCE)) ? bs0.F : x44.r(artifactType, ArtifactType.Mermaid.INSTANCE) ? bs0.I : x44.r(artifactType, ArtifactType.Svg.INSTANCE) ? bs0.G : bs0Var;
    }
}
