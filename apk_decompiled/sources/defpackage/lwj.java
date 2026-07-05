package defpackage;

import android.text.SpannableStringBuilder;
import android.text.format.DateUtils;
import android.view.View;
import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.api.chat.MessageImageFile;
import com.anthropic.claude.api.chat.MessageUnknownFile;
import com.anthropic.claude.api.memory.MemorySynthesisResponse;
import com.anthropic.claude.types.strings.FileId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lwj {
    public static final ta4 a = new ta4(-2012883664, false, new xa4(26));
    public static final ta4 b = new ta4(-615067445, false, new ua4(26));
    public static final ta4 c = new ta4(588338755, false, new ua4(27));
    public static final ta4 d = new ta4(1270137556, false, new ua4(28));
    public static final ta4 e = new ta4(295847620, false, new ua4(29));
    public static final xb f = new xb(9);

    public static final void a(final s64 s64Var, final boolean z, final boolean z2, bz7 bz7Var, final pz7 pz7Var, final boolean z3, final boolean z4, final bz7 bz7Var2, final MemorySynthesisResponse memorySynthesisResponse, final boolean z5, final boolean z6, final zy7 zy7Var, final boolean z7, final hcb hcbVar, final boolean z8, final bz7 bz7Var3, final zy7 zy7Var2, final String str, final zy7 zy7Var3, pl3 pl3Var, qi3 qi3Var, ld4 ld4Var, final int i) {
        int i2;
        boolean z9;
        pz7 pz7Var2;
        e18 e18Var;
        final pl3 pl3Var2;
        final qi3 qi3Var2;
        int i3;
        qi3 qi3Var3;
        int i4;
        pl3 pl3Var3;
        int i5;
        boolean z10;
        nwb nwbVar;
        int i6;
        boolean z11;
        final bz7 bz7Var4 = bz7Var;
        s64Var.getClass();
        bz7Var4.getClass();
        pz7Var.getClass();
        bz7Var2.getClass();
        zy7Var.getClass();
        bz7Var3.getClass();
        zy7Var2.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1327516912);
        if ((i & 48) == 0) {
            i2 = (e18Var2.g(z) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        int i7 = i & 384;
        int i8 = FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        if (i7 == 0) {
            z9 = z2;
            i2 |= e18Var2.g(z9) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            z9 = z2;
        }
        int i9 = i & 3072;
        int i10 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
        if (i9 == 0) {
            i2 |= e18Var2.h(bz7Var4) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : 1024;
        }
        int i11 = i & 24576;
        int i12 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        if (i11 == 0) {
            pz7Var2 = pz7Var;
            i2 |= e18Var2.h(pz7Var2) ? 16384 : 8192;
        } else {
            pz7Var2 = pz7Var;
        }
        if ((i & 196608) == 0) {
            i2 |= e18Var2.g(z3) ? 131072 : 65536;
        }
        int i13 = i & 1572864;
        int i14 = FreeTypeConstants.FT_LOAD_COLOR;
        if (i13 == 0) {
            i2 |= e18Var2.g(z4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= e18Var2.h(bz7Var2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= e18Var2.f(memorySynthesisResponse) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= e18Var2.g(z5) ? 536870912 : 268435456;
        }
        int i15 = (e18Var2.g(z6) ? 4 : 2) | (e18Var2.h(zy7Var) ? 32 : 16);
        if (!e18Var2.g(z7)) {
            i8 = FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i16 = i15 | i8;
        if (e18Var2.d(hcbVar.ordinal())) {
            i10 = FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
        }
        int i17 = i16 | i10;
        if (e18Var2.g(z8)) {
            i12 = 16384;
        }
        int i18 = i17 | i12 | (e18Var2.h(bz7Var3) ? 131072 : 65536);
        if (!e18Var2.h(zy7Var2)) {
            i14 = 524288;
        }
        int i19 = i18 | i14 | (e18Var2.f(str) ? 8388608 : 4194304) | (e18Var2.h(zy7Var3) ? 67108864 : 33554432) | 268435456;
        if (e18Var2.Q(i2 & 1, ((i2 & 306783377) == 306783376 && (i19 & 306783379) == 306783378) ? false : true)) {
            e18Var2.V();
            int i20 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i20 == 0 || e18Var2.A()) {
                i3 = i2;
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(pl3.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                int i21 = i19 & (-1879048193);
                pl3Var = (pl3) objN;
                m7f m7fVarN2 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF2 = e18Var2.f(null) | e18Var2.f(m7fVarN2);
                Object objN2 = e18Var2.N();
                if (zF2 || objN2 == lz1Var) {
                    Object objA = m7fVarN2.a(jce.a.b(qi3.class), null, null);
                    e18Var2.k0(objA);
                    objN2 = objA;
                }
                e18Var2.p(false);
                e18Var2.p(false);
                qi3Var3 = (qi3) objN2;
                i4 = i21;
            } else {
                e18Var2.T();
                qi3Var3 = qi3Var;
                i4 = i19 & (-1879048193);
                i3 = i2;
            }
            pl3 pl3Var4 = pl3Var;
            e18Var2.q();
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                objN3 = mpk.P(Boolean.FALSE);
                e18Var2.k0(objN3);
            }
            nwb nwbVar2 = (nwb) objN3;
            if (z3) {
                e18Var2.a0(-1500526);
                i5 = i4;
                pl3Var3 = pl3Var4;
                yhk.a(null, fd9.q0(-411353484, new tw(z4, bz7Var2, pl3Var4, 1), e18Var2), e18Var2, 48);
                z10 = false;
                e18Var2.p(false);
            } else {
                pl3Var3 = pl3Var4;
                i5 = i4;
                z10 = false;
                e18Var2.a0(-639470);
                e18Var2.p(false);
            }
            if (z3 && z) {
                e18Var2.a0(-565752);
                qnc qncVar = qf2.a;
                grc.z(fqb.E, 12.0f, e18Var2, z10);
            } else {
                e18Var2.a0(-494638);
                e18Var2.p(z10);
            }
            if (z) {
                e18Var2.a0(-369398);
                if (z7) {
                    e18Var2.a0(-406102);
                    int i22 = i5 >> 6;
                    int i23 = ((i5 >> 9) & 14) | ((i5 << 3) & 112) | (i22 & 896) | (i22 & 7168) | (57344 & i22) | (458752 & i22) | (i22 & 3670016);
                    int i24 = i3 >> 3;
                    d(hcbVar, z6, z8, bz7Var3, zy7Var2, str, zy7Var3, memorySynthesisResponse, z5, pz7Var2, pl3Var3, qi3Var3, e18Var2, i23 | (29360128 & i24) | (i24 & 234881024) | ((i3 << 15) & 1879048192), 0);
                    e18Var = e18Var2;
                    z11 = false;
                    e18Var.p(false);
                    nwbVar = nwbVar2;
                    i6 = i3;
                    bz7Var4 = bz7Var;
                } else {
                    e18Var = e18Var2;
                    e18Var.a0(352127);
                    i6 = i3;
                    nwbVar = nwbVar2;
                    bz7Var4 = bz7Var;
                    yhk.a(null, fd9.q0(-1180128296, new jv(z6, z9, bz7Var, pl3Var3, nwbVar, memorySynthesisResponse, z5, pz7Var), e18Var), e18Var, 48);
                    z11 = false;
                    e18Var.p(false);
                }
                e18Var.p(z11);
            } else {
                e18Var = e18Var2;
                nwbVar = nwbVar2;
                i6 = i3;
                bz7Var4 = bz7Var;
                e18Var.a0(2467474);
                e18Var.p(false);
            }
            if (((Boolean) nwbVar.getValue()).booleanValue()) {
                e18Var.a0(2585553);
                boolean z12 = (i6 & 7168) == 2048;
                Object objN4 = e18Var.N();
                if (z12 || objN4 == lz1Var) {
                    objN4 = new zb2(0, bz7Var4);
                    e18Var.k0(objN4);
                }
                zy7 zy7Var4 = (zy7) objN4;
                Object objN5 = e18Var.N();
                if (objN5 == lz1Var) {
                    objN5 = new ve(20, nwbVar);
                    e18Var.k0(objN5);
                }
                cqk.b(zy7Var4, zy7Var, (zy7) objN5, e18Var, (i5 & 112) | 384);
                e18Var.p(false);
            } else {
                e18Var.a0(2832530);
                e18Var.p(false);
            }
            pl3Var2 = pl3Var3;
            qi3Var2 = qi3Var3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            pl3Var2 = pl3Var;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: ac2
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i | 1);
                    lwj.a(s64Var, z, z2, bz7Var4, pz7Var, z3, z4, bz7Var2, memorySynthesisResponse, z5, z6, zy7Var, z7, hcbVar, z8, bz7Var3, zy7Var2, str, zy7Var3, pl3Var2, qi3Var2, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void b(iqb iqbVar, long j, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1144739902);
        int i2 = i | 182;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                j = gm3.a(e18Var).O;
                iqbVar = fqb.E;
            } else {
                e18Var.T();
            }
            iqb iqbVar2 = iqbVar;
            long j2 = j;
            e18Var.q();
            iv1.b(ud0.C, null, iqbVar2, ef2.F, j2, e18Var, 3504, 0);
            iqbVar = iqbVar2;
            j = j2;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new g10(iqbVar, j, i);
        }
    }

    public static final void c(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(615082992);
        int i2 = (e18Var2.h(zy7Var) ? 4 : 2) | i | 48;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            qnc qncVar = qf2.a;
            fqb fqbVar = fqb.E;
            iqbVar2 = fqbVar;
            e18Var = e18Var2;
            ybi.b(null, mwj.a, b.c(ybi.p(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), qf2.c(e18Var2)), false, null, new vue(0), null, zy7Var, 11), mwj.b, mwj.c, 0L, qncVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, false, null, null, e18Var, 27702, 6, 15264);
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xh(zy7Var, iqbVar2, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.hcb r20, final boolean r21, final boolean r22, defpackage.bz7 r23, defpackage.zy7 r24, final java.lang.String r25, final defpackage.zy7 r26, final com.anthropic.claude.api.memory.MemorySynthesisResponse r27, final boolean r28, final defpackage.pz7 r29, final defpackage.pl3 r30, final defpackage.qi3 r31, defpackage.ld4 r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwj.d(hcb, boolean, boolean, bz7, zy7, java.lang.String, zy7, com.anthropic.claude.api.memory.MemorySynthesisResponse, boolean, pz7, pl3, qi3, ld4, int, int):void");
    }

    public static final void e(String str, qi3 qi3Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1064236307);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(qi3Var) ? 32 : 16) | 384;
        int i3 = 0;
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            eli eliVar = (eli) e18Var2.j(ve4.t);
            qnc qncVar = qf2.a;
            fqb fqbVar = fqb.E;
            iqb iqbVarP = ybi.p(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), qf2.c(e18Var2));
            String strJ0 = d4c.j0(R.string.open, e18Var2);
            vue vueVar = new vue(0);
            boolean zH = ((i2 & 112) == 32) | e18Var2.h(eliVar) | ((i2 & 14) == 4);
            Object objN = e18Var2.N();
            if (zH || objN == jd4.a) {
                objN = new wb2(qi3Var, eliVar, str, i3);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            ybi.b(null, mwj.d, b.c(iqbVarP, false, strJ0, vueVar, null, (zy7) objN, 9), mwj.e, null, 0L, qncVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, false, null, null, e18Var, 3126, 6, 15280);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m6(str, i, qi3Var, iqbVar2, 23);
        }
    }

    public static final void f(hcb hcbVar, boolean z, pl3 pl3Var, bz7 bz7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1669075254);
        int i2 = i | (e18Var.d(hcbVar.ordinal()) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.f(pl3Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            nxf nxfVarA = qf2.a(e18Var);
            View view = (View) e18Var.j(w00.f);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            qnc qncVar = qf2.a;
            iqb iqbVarP = ybi.p(androidx.compose.foundation.layout.b.c(fqb.E, 1.0f), qf2.c(e18Var));
            vue vueVar = new vue(6);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new ve(18, nwbVar);
                e18Var.k0(objN2);
            }
            iqb iqbVarC = b.c(iqbVarP, z, null, vueVar, null, (zy7) objN2, 10);
            ta4 ta4VarQ0 = fd9.q0(1798594110, new xb2(nxfVarA, z, i3), e18Var);
            ta4 ta4VarQ02 = fd9.q0(-1587711013, new iv(hcbVar, nxfVarA, z, 6), e18Var);
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new ve(19, nwbVar);
                e18Var.k0(objN3);
            }
            ybi.b(null, ta4VarQ0, iqbVarC, null, ta4VarQ02, 0L, qncVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, zBooleanValue, (zy7) objN3, fd9.q0(-910218461, new xe(nwbVar, hcbVar, pl3Var, view, bz7Var, 11), e18Var), e18Var, 24630, 3456, 1960);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sq(i, 3, hcbVar, pl3Var, bz7Var, z);
        }
    }

    public static final void g(zb0 zb0Var, String str, boolean z, boolean z2, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        boolean z3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-442131322);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(zb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i3 = i2 | 196608;
        if (e18Var.Q(i3 & 1, (i3 & 74899) != 74898)) {
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarC = androidx.compose.foundation.layout.b.c(fqbVar, 1.0f);
            qnc qncVar = qf2.a;
            iqb iqbVarI = gb9.I(b.c(yfd.p(xn5.V(iqbVarC, gm3.b(e18Var).a), gm3.a(e18Var).n, zni.b), !z2, null, null, null, zy7Var, 14), qf2.a);
            cxe cxeVarA = axe.a(ko0.g, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarI);
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
            hw9 hw9VarN = kgh.n(e18Var, iqbVarE, z80Var4, 1.0f, true);
            q64 q64VarA = p64.a(new ho0(4.0f, true, new sz6(1)), lja.S, e18Var, 6);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, hw9VarN);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            tjh.c(zb0Var, null, gm3.a(e18Var).N, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, i3 & 14, 0, 262138);
            e18Var = e18Var;
            if (str != null) {
                e18Var.a0(-272330999);
                tjh.b(str, null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, (i3 >> 3) & 14, 0, 131066);
                e18Var = e18Var;
                z3 = false;
                e18Var.p(false);
            } else {
                z3 = false;
                e18Var.a0(-272139326);
                e18Var.p(false);
            }
            e18Var.p(true);
            if (z) {
                e18Var.a0(857523518);
                ez1.a(null, vf2.G, gm3.a(e18Var).O, e18Var, 48, 1);
                e18Var.p(z3);
            } else {
                e18Var.a0(857671512);
                e18Var.p(z3);
            }
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yb2(zb0Var, str, z, z2, zy7Var, iqbVar2, i, 0);
        }
    }

    public static final void h(MemorySynthesisResponse memorySynthesisResponse, boolean z, pz7 pz7Var, ld4 ld4Var, int i) {
        String strN;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(604114003);
        int i2 = i | (e18Var.f(memorySynthesisResponse) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.h(pz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            String memory = memorySynthesisResponse != null ? memorySynthesisResponse.getMemory() : null;
            Date updated_at = memorySynthesisResponse != null ? memorySynthesisResponse.getUpdated_at() : null;
            zb0 zb0VarI = zrk.i(R.string.memory_summary_button_title, e18Var);
            if (memory == null || updated_at == null) {
                strN = vb7.n(e18Var, 732998296, R.string.memory_summary_button_description_null_state, e18Var, false);
            } else {
                e18Var.a0(1247786438);
                CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(updated_at.toInstant().toEpochMilli(), System.currentTimeMillis(), 60000L);
                relativeTimeSpanString.getClass();
                strN = d4c.k0(R.string.memory_preview_last_updated, new Object[]{relativeTimeSpanString}, e18Var);
                e18Var.p(false);
            }
            boolean z2 = (memory == null || memory.length() == 0) && !z;
            boolean zF = e18Var.f(memory) | e18Var.h(updated_at) | ((i2 & 896) == 256);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new ei(memory, updated_at, pz7Var, 13);
                e18Var.k0(objN);
            }
            g(zb0VarI, strN, z, z2, (zy7) objN, null, e18Var, (i2 << 3) & 896);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iv(memorySynthesisResponse, z, pz7Var, i, 5);
        }
    }

    public static final void i(MessageFile messageFile, String str, ej7 ej7Var, zy7 zy7Var, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        String str2;
        ej7 ej7Var2;
        zy7 zy7Var2;
        String str3;
        messageFile.getClass();
        str.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-814477995);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(messageFile) : e18Var.h(messageFile) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= e18Var.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            ej7Var2 = ej7Var;
            i2 |= e18Var.f(ej7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            ej7Var2 = ej7Var;
        }
        if ((i & 3072) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            zy7Var2 = zy7Var;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(ta4Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            String strMo236getFile_uuidExWXDbg = messageFile.mo236getFile_uuidExWXDbg();
            if (messageFile instanceof MessageUnknownFile) {
                str3 = "unknown";
            } else if (messageFile instanceof MessageImageFile) {
                str3 = "image";
            } else if (messageFile instanceof MessageDocumentFile) {
                str3 = "document";
            } else {
                if (!(messageFile instanceof MessageBlobFile)) {
                    wg6.i();
                    return;
                }
                str3 = "blob";
            }
            j(ej7Var2, strMo236getFile_uuidExWXDbg, str3, null, e18Var, (i2 >> 6) & 14);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new oob(19);
                e18Var.k0(objN);
            }
            zy7 zy7Var3 = (zy7) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new oob(19);
                e18Var.k0(objN2);
            }
            otj.e(str2, false, false, zy7Var3, zy7Var2, (zy7) objN2, null, null, null, null, null, fd9.q0(1173305213, new xw9(ta4Var, 7), e18Var), e18Var, ((i2 >> 3) & 14) | 200112 | ((i2 << 3) & 57344), 48, 1984);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk(messageFile, str, ej7Var, zy7Var, ta4Var, i, 24);
        }
    }

    public static final void j(ej7 ej7Var, String str, String str2, qi3 qi3Var, ld4 ld4Var, int i) {
        int i2;
        String str3;
        qi3 qi3Var2;
        qi3 qi3Var3;
        int i3;
        qi3 qi3Var4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1266572567);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(ej7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str != null ? FileId.m1014boximpl(str) : null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str2;
            i2 |= e18Var.f(str3) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            str3 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            e18Var.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3Var3 = (qi3) objN;
                i3 = i2 & (-7169);
            } else {
                e18Var.T();
                i3 = i2 & (-7169);
                qi3Var3 = qi3Var;
            }
            e18Var.q();
            boolean zH = ((i3 & 14) == 4) | ((i3 & 112) == 32) | e18Var.h(qi3Var3) | ((i3 & 896) == 256);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                qi3Var4 = qi3Var3;
                qed qedVar = new qed(qi3Var4, str, str3, ej7Var, null);
                e18Var.k0(qedVar);
                objN2 = qedVar;
            } else {
                qi3Var4 = qi3Var3;
            }
            csg.g((bz7) objN2, e18Var, 0, 1);
            qi3Var2 = qi3Var4;
        } else {
            e18Var.T();
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(ej7Var, str, str2, qi3Var2, i, 16);
        }
    }

    public static void k(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static fs6 l(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            bh9 bh9VarS = qh9Var.s("current_locale");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            strM.getClass();
            return new fs6(strM, strM2);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Application", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Application", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Application", e4);
            return null;
        }
    }

    public static bwi m(qh9 qh9Var) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                Object key = p7aVarA.getKey();
                key.getClass();
                linkedHashMap.put(key, Long.valueOf(((bh9) p7aVarA.getValue()).k()));
            }
            return new bwi(linkedHashMap);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type CustomTimings", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type CustomTimings", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type CustomTimings", e4);
            return null;
        }
    }
}
