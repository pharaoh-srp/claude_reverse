package defpackage;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import kotlinx.datetime.internal.format.parser.ParseException;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xsc {
    public static final tqh a;
    public static final lyk b;
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        int i = 23;
        a = new tqh(i);
        b = new lyk(i);
    }

    public static final void a(int i, int i2, tkh tkhVar, ld4 ld4Var, int i3) {
        int i4;
        e18 e18Var;
        e18 e18Var2;
        int i5;
        boolean z;
        tkh tkhVar2 = tkhVar;
        tkhVar2.getClass();
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(-734067869);
        if ((i3 & 6) == 0) {
            i4 = (e18Var3.d(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= e18Var3.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= e18Var3.f(tkhVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var3.Q(i4 & 1, (i4 & 147) != 146)) {
            if (i > 0) {
                e18Var3.a0(1357694572);
                i5 = i4;
                z = false;
                tjh.b(" +" + i, null, gm3.a(e18Var3).B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, tkhVar, e18Var3, 0, ((i4 << 15) & 29360128) | 27648, 106490);
                e18Var2 = e18Var3;
                e18Var2.p(false);
            } else {
                e18Var2 = e18Var3;
                i5 = i4;
                z = false;
                e18Var2.a0(1357872543);
                e18Var2.p(false);
            }
            if (i2 > 0) {
                e18Var2.a0(1357909867);
                e18 e18Var4 = e18Var2;
                tjh.b(" -" + i2, null, gm3.a(e18Var2).z, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, tkhVar, e18Var4, 0, ((i5 << 15) & 29360128) | 27648, 106490);
                tkhVar2 = tkhVar;
                e18Var = e18Var4;
                e18Var.p(z);
            } else {
                e18Var = e18Var2;
                tkhVar2 = tkhVar;
                e18Var.a0(1358088799);
                e18Var.p(z);
            }
        } else {
            e18Var = e18Var3;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new b46(i, i2, tkhVar2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0330 A[PHI: r3
      0x0330: PHI (r3v12 java.lang.CharSequence) = (r3v10 java.lang.CharSequence), (r3v13 java.lang.CharSequence) binds: [B:179:0x032e, B:175:0x0327] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x033a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.Integer r42, final java.lang.Integer r43, java.lang.CharSequence r44, float r45, defpackage.zy7 r46, boolean r47, boolean r48, defpackage.iqb r49, final defpackage.iqb r50, defpackage.ld4 r51, final int r52, final int r53) {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xsc.b(java.lang.Integer, java.lang.Integer, java.lang.CharSequence, float, zy7, boolean, boolean, iqb, iqb, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r57, java.lang.String r58, int r59, int r60, defpackage.zy7 r61, boolean r62, defpackage.iqb r63, defpackage.ld4 r64, int r65, int r66) {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xsc.c(java.lang.String, java.lang.String, int, int, zy7, boolean, iqb, ld4, int, int):void");
    }

    public static final void d(final int i, final float f, final boolean z, final boolean z2, final zy7 zy7Var, final zy7 zy7Var2, zy7 zy7Var3, ld4 ld4Var, final int i2, final int i3) {
        zy7 zy7Var4;
        zy7 zy7Var5;
        int i4;
        final zy7 zy7Var6;
        zy7 zy7Var7;
        String strN;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(345706822);
        int i5 = (e18Var.d(i) ? 4 : 2) | i2 | (e18Var.c(f) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i5 |= e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i5 |= e18Var.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i6 = i5 | (e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if ((196608 & i2) == 0) {
            zy7Var4 = zy7Var2;
            i6 |= e18Var.h(zy7Var4) ? 131072 : 65536;
        } else {
            zy7Var4 = zy7Var2;
        }
        int i7 = i3 & 64;
        if (i7 != 0) {
            i4 = i6 | 1572864;
            zy7Var5 = zy7Var3;
        } else {
            zy7Var5 = zy7Var3;
            i4 = i6 | (e18Var.h(zy7Var5) ? FreeTypeConstants.FT_LOAD_COLOR : 524288);
        }
        if (e18Var.Q(i4 & 1, (599187 & i4) != 599186)) {
            int i8 = 19;
            lz1 lz1Var = jd4.a;
            if (i7 != 0) {
                Object objN = e18Var.N();
                if (objN == lz1Var) {
                    objN = new oob(i8);
                    e18Var.k0(objN);
                }
                zy7Var7 = (zy7) objN;
            } else {
                zy7Var7 = zy7Var5;
            }
            jl3 jl3VarA = gm3.a(e18Var);
            boolean zF = v40.F(e18Var);
            long jO = d4c.o(zF ? 4280165941L : 4294113277L);
            long jO2 = d4c.o(zF ? 4280628292L : 4293325307L);
            boolean z3 = z && z2;
            String strN2 = z3 ? vb7.n(e18Var, 1511793454, R.string.diff_expand_all, e18Var, false) : z ? vb7.n(e18Var, 1511795501, R.string.diff_expand_up, e18Var, false) : z2 ? vb7.n(e18Var, 1511797583, R.string.diff_expand_down, e18Var, false) : vb7.n(e18Var, 1511799434, R.string.diff_expand, e18Var, false);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new oob(19);
                e18Var.k0(objN2);
            }
            zy7 zy7Var8 = z3 ? zy7Var7 : z ? zy7Var : z2 ? zy7Var4 : (zy7) objN2;
            ud0 ud0Var = z3 ? ud0.E : (!z && z2) ? ud0.D : ud0.B;
            if (i > 0) {
                e18Var.a0(-378372495);
                strN = d4c.k0(R.string.diff_hidden_lines, new Object[]{Integer.valueOf(i)}, e18Var);
                e18Var.p(false);
            } else {
                strN = vb7.n(e18Var, -378292856, R.string.diff_expand, e18Var, false);
            }
            String str = strN;
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, false, null, null, null, zy7Var8, 15);
            String str2 = strN2;
            cxe cxeVarA = axe.a(ko0.a, lja.P, e18Var, 0);
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
            xo1 xo1Var = lja.K;
            iqb iqbVarT = androidx.compose.foundation.layout.b.t(fqbVar, f);
            wo8 wo8Var = zni.b;
            iqb iqbVarL = gb9.L(yfd.p(iqbVarT, jO2, wo8Var), MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, 1);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarL);
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
            cv8.b(a.a(ud0Var, e18Var), str2, androidx.compose.foundation.layout.b.o(fqbVar, 20.0f), jl3VarA.O, e18Var, 392, 0);
            e18Var.p(true);
            xo1 xo1Var2 = lja.J;
            iqb iqbVarN = gb9.N(yfd.p(zni.u(new hw9(1.0f, true), new j10(jO2, 4)), jO, wo8Var), 8.0f, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, 4);
            o5b o5bVarD2 = dw1.d(xo1Var2, false);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, iqbVarN);
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
            tjh.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkh.b((tkh) ((wk) gm3.c(e18Var).e.F).i, jl3VarA.O, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), e18Var, 0, 0, 131070);
            e18Var = e18Var;
            e18Var.p(true);
            e18Var.p(true);
            zy7Var6 = zy7Var7;
        } else {
            e18Var.T();
            zy7Var6 = zy7Var5;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: j46
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xsc.d(i, f, z, z2, zy7Var, zy7Var2, zy7Var6, (ld4) obj, x44.p0(i2 | 1), i3);
                    return iei.a;
                }
            };
        }
    }

    public static final void e(x5a x5aVar, zy7 zy7Var, final zy7 zy7Var2, zy7 zy7Var3, float f, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        jl3 jl3Var;
        fqb fqbVar;
        boolean z;
        nwb nwbVar;
        x5aVar.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1516743291);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(x5aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.c(f) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i3 = i2 | 196608;
        boolean z2 = false;
        if (e18Var.Q(i3 & 1, (74899 & i3) != 74898)) {
            jl3 jl3VarA = gm3.a(e18Var);
            fqb fqbVar2 = fqb.E;
            iqb iqbVarP = yfd.p(androidx.compose.foundation.layout.b.c(fqbVar2, 1.0f), jl3VarA.n, zni.b);
            long j = jl3VarA.t;
            iqbVarP.getClass();
            iqb iqbVarB = b.b(gb9.N(gb9.K(zni.t(gb9.L(zni.u(iqbVarP, new i46(f, j, z2)), MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, 1), new np(jl3VarA.n, 1, jl3VarA.u)), 12.0f, 8.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), null, null, false, null, null, zy7Var, 28);
            cxe cxeVarA = axe.a(ko0.a, lja.P, e18Var, 0);
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
            if (((Boolean) x5aVar.c.getValue()).booleanValue()) {
                e18Var.a0(-173683250);
                final float fQ0 = ((cz5) e18Var.j(ve4.h)).q0(20.0f);
                Object objN = e18Var.N();
                lz1 lz1Var = jd4.a;
                if (objN == lz1Var) {
                    objN = fd9.O(im6.E, e18Var);
                    e18Var.k0(objN);
                }
                final l45 l45Var = (l45) objN;
                Object objN2 = e18Var.N();
                if (objN2 == lz1Var) {
                    objN2 = new qx1();
                    e18Var.k0(objN2);
                }
                final qx1 qx1Var = (qx1) objN2;
                Object objN3 = e18Var.N();
                if (objN3 == lz1Var) {
                    objN3 = ij0.d(e18Var);
                }
                bt7 bt7Var = (bt7) objN3;
                Object objN4 = e18Var.N();
                if (objN4 == lz1Var) {
                    objN4 = mpk.P(Boolean.FALSE);
                    e18Var.k0(objN4);
                }
                final nwb nwbVar2 = (nwb) objN4;
                Object objN5 = e18Var.N();
                if (objN5 == lz1Var) {
                    objN5 = mpk.P(0);
                    e18Var.k0(objN5);
                }
                nwb nwbVar3 = (nwb) objN5;
                Object objN6 = e18Var.N();
                tp4 tp4Var = null;
                if (objN6 == lz1Var) {
                    objN6 = new fz3(bt7Var, tp4Var, 5);
                    e18Var.k0(objN6);
                }
                fd9.i(e18Var, (pz7) objN6, iei.a);
                Integer numValueOf = Integer.valueOf(((Number) nwbVar3.getValue()).intValue());
                boolean zC = e18Var.c(fQ0) | e18Var.h(qx1Var);
                Object objN7 = e18Var.N();
                if (zC || objN7 == lz1Var) {
                    objN7 = new k46(fQ0, qx1Var, nwbVar3, null, 0);
                    nwbVar = nwbVar3;
                    e18Var.k0(objN7);
                } else {
                    nwbVar = nwbVar3;
                }
                fd9.i(e18Var, (pz7) objN7, numValueOf);
                String strA = x5aVar.a();
                boolean z3 = (i3 & 14) == 4;
                Object objN8 = e18Var.N();
                if (z3 || objN8 == lz1Var) {
                    objN8 = new py3(15, x5aVar);
                    e18Var.k0(objN8);
                }
                bz7 bz7Var = (bz7) objN8;
                if (1.0f <= 0.0d) {
                    z29.a("invalid weight; must be greater than zero");
                }
                int i4 = 1;
                iqb iqbVarL = eve.l(iv1.s(new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), bt7Var), qx1Var);
                Object objN9 = e18Var.N();
                if (objN9 == lz1Var) {
                    objN9 = new ol5(i4, nwbVar);
                    e18Var.k0(objN9);
                }
                iqb iqbVarV0 = wd6.v0(iqbVarL, (bz7) objN9);
                boolean zH = ((i3 & 896) == 256) | e18Var.h(l45Var) | e18Var.c(fQ0) | e18Var.h(qx1Var);
                Object objN10 = e18Var.N();
                if (zH || objN10 == lz1Var) {
                    final nwb nwbVar4 = nwbVar;
                    bz7 bz7Var2 = new bz7() { // from class: c46
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj) {
                            ft7 ft7Var = (ft7) obj;
                            ft7Var.getClass();
                            nwb nwbVar5 = nwbVar2;
                            if (((Boolean) nwbVar5.getValue()).booleanValue() && !ft7Var.b()) {
                                zy7Var2.a();
                            }
                            if (ft7Var.b()) {
                                nwbVar5.setValue(Boolean.TRUE);
                                gb9.D(l45Var, null, null, new k46(fQ0, qx1Var, nwbVar4, null, 1), 3);
                            }
                            return iei.a;
                        }
                    };
                    e18Var.k0(bz7Var2);
                    objN10 = bz7Var2;
                }
                fqbVar = fqbVar2;
                z = true;
                jl3Var = jl3VarA;
                bg1.c(strA, bz7Var, u00.C(iqbVarV0, (bz7) objN10), false, false, tkh.b(((jm3) gm3.c(e18Var).e.E).g, jl3VarA.N, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), null, null, false, 0, 0, null, null, null, new eeg(jl3VarA.M), fd9.q0(-1416979711, new ii(x5aVar, 29, jl3VarA), e18Var), e18Var, 0, 16344);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                jl3Var = jl3VarA;
                fqbVar = fqbVar2;
                z = true;
                e18Var.a0(-170724548);
                String strA2 = x5aVar.a();
                tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).g;
                long j2 = jl3Var.M;
                if (1.0f <= 0.0d) {
                    z29.a("invalid weight; must be greater than zero");
                }
                tjh.b(strA2, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var, 0, 0, 131064);
                e18Var = e18Var;
                e18Var.p(false);
            }
            fqb fqbVar3 = fqbVar;
            cv8.b(a.a(ud0.M1, e18Var), null, androidx.compose.foundation.layout.b.o(b.c(fqbVar3, false, null, null, null, zy7Var3, 15), 18.0f), jl3Var.O, e18Var, 56, 0);
            e18Var.p(z);
            iqbVar2 = fqbVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tk1(x5aVar, zy7Var, zy7Var2, zy7Var3, f, iqbVar2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(List list, final bz7 bz7Var, final bz7 bz7Var2, final bz7 bz7Var3, float f, iqb iqbVar, ld4 ld4Var, int i) {
        float f2;
        Object obj;
        final int i2;
        list.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        bz7Var3.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-300930986);
        int i3 = 32;
        int i4 = i | (e18Var.f(list) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16);
        boolean zH = e18Var.h(bz7Var2);
        int i5 = FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        int i6 = i4 | (zH ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(bz7Var3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        final int i7 = 0;
        if (e18Var.Q(i6 & 1, (74899 & i6) != 74898)) {
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
            dd4.e.getClass();
            zy7 zy7Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(zy7Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            e18Var.a0(-462519858);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final x5a x5aVar = (x5a) it.next();
                int i8 = ((i6 & 896) == i5 ? 1 : i7) | (e18Var.f(x5aVar) ? 1 : 0);
                Object objN = e18Var.N();
                Object obj2 = jd4.a;
                Object obj3 = objN;
                if (i8 != 0 || objN == obj2) {
                    Object obj4 = new zy7() { // from class: f46
                        @Override // defpackage.zy7
                        public final Object a() {
                            int i9 = i7;
                            iei ieiVar = iei.a;
                            x5a x5aVar2 = x5aVar;
                            bz7 bz7Var4 = bz7Var2;
                            switch (i9) {
                                case 0:
                                    bz7Var4.invoke(x5aVar2);
                                    break;
                                case 1:
                                    bz7Var4.invoke(x5aVar2);
                                    break;
                                default:
                                    bz7Var4.invoke(x5aVar2);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var.k0(obj4);
                    obj3 = obj4;
                }
                zy7 zy7Var2 = (zy7) obj3;
                int i9 = ((i6 & 112) == i3 ? 1 : i7) | (e18Var.f(x5aVar) ? 1 : 0);
                Object objN2 = e18Var.N();
                if (i9 != 0 || objN2 == obj2) {
                    final int i10 = 1;
                    Object obj5 = new zy7() { // from class: f46
                        @Override // defpackage.zy7
                        public final Object a() {
                            int i92 = i10;
                            iei ieiVar = iei.a;
                            x5a x5aVar2 = x5aVar;
                            bz7 bz7Var4 = bz7Var;
                            switch (i92) {
                                case 0:
                                    bz7Var4.invoke(x5aVar2);
                                    break;
                                case 1:
                                    bz7Var4.invoke(x5aVar2);
                                    break;
                                default:
                                    bz7Var4.invoke(x5aVar2);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var.k0(obj5);
                    obj = obj5;
                } else {
                    obj = objN2;
                }
                zy7 zy7Var3 = (zy7) obj;
                boolean zF = ((i6 & 7168) == 2048) | e18Var.f(x5aVar);
                Object objN3 = e18Var.N();
                if (zF || objN3 == obj2) {
                    i2 = 2;
                    objN3 = new zy7() { // from class: f46
                        @Override // defpackage.zy7
                        public final Object a() {
                            int i92 = i2;
                            iei ieiVar = iei.a;
                            x5a x5aVar2 = x5aVar;
                            bz7 bz7Var4 = bz7Var3;
                            switch (i92) {
                                case 0:
                                    bz7Var4.invoke(x5aVar2);
                                    break;
                                case 1:
                                    bz7Var4.invoke(x5aVar2);
                                    break;
                                default:
                                    bz7Var4.invoke(x5aVar2);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var.k0(objN3);
                } else {
                    i2 = 2;
                }
                e(x5aVar, zy7Var2, zy7Var3, (zy7) objN3, 30.0f, null, e18Var, 24576);
                i7 = 0;
                i3 = 32;
                i5 = FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
            }
            e18Var.p(i7);
            e18Var.p(true);
            f2 = 30.0f;
        } else {
            e18Var.T();
            f2 = f;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new g46(list, bz7Var, bz7Var2, bz7Var3, f2, iqbVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.bpc r36, java.lang.String r37, defpackage.zy7 r38, defpackage.iqb r39, defpackage.pz7 r40, java.lang.String r41, boolean r42, defpackage.nxf r43, defpackage.oxf r44, defpackage.mnc r45, float r46, defpackage.wo1 r47, defpackage.mnc r48, float r49, long r50, defpackage.tkh r52, int r53, defpackage.ld4 r54, int r55, int r56, int r57) {
        /*
            Method dump skipped, instruction units count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xsc.g(bpc, java.lang.String, zy7, iqb, pz7, java.lang.String, boolean, nxf, oxf, mnc, float, wo1, mnc, float, long, tkh, int, ld4, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final boolean r28, final boolean r29, final defpackage.zy7 r30, final java.util.List r31, final defpackage.gwg r32, final defpackage.bz7 r33, final java.util.List r34, defpackage.iqb r35, boolean r36, defpackage.j9f r37, defpackage.ld4 r38, final int r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xsc.h(boolean, boolean, zy7, java.util.List, gwg, bz7, java.util.List, iqb, boolean, j9f, ld4, int, int):void");
    }

    public static String i(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length; i++) {
            int i2 = (bArr[i] & 240) >>> 4;
            char[] cArr = c;
            sb.append(cArr[i2]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }

    public static jo9 j(fo9 fo9Var) {
        return new jo9(lo9.F, fo9Var);
    }

    public static jo9 k(fo9 fo9Var) {
        return new jo9(lo9.G, fo9Var);
    }

    public static final BoringLayout l(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, metrics, z, truncateAt, i2);
    }

    public static jo9 m() {
        return jo9.c;
    }

    public static jo9 n(fo9 fo9Var) {
        return new jo9(lo9.E, fo9Var);
    }

    public static final BoringLayout.Metrics o(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }

    public static l25 p(auc aucVar, String str, l25 l25Var) throws IOException, ParseException {
        String string;
        l25Var.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListA0 = x44.a0(new stc(l25Var, aucVar, 0));
        while (true) {
            stc stcVar = (stc) b54.A0(arrayListA0);
            if (stcVar == null) {
                if (arrayList.size() > 1) {
                    a54.s0(arrayList, new g67(18));
                }
                if (arrayList.size() == 1) {
                    string = "Position " + ((usc) arrayList.get(0)).a + ": " + ((String) ((usc) arrayList.get(0)).b.a());
                } else {
                    StringBuilder sb = new StringBuilder(arrayList.size() * 33);
                    w44.R0(arrayList, sb, ", ", "Errors: ", null, new kac(24), 56);
                    string = sb.toString();
                }
                throw new ParseException(string);
            }
            l25 l25Var2 = (l25) ((l25) stcVar.a).a();
            int iIntValue = stcVar.c;
            auc aucVar2 = stcVar.b;
            List list = aucVar2.a;
            List list2 = aucVar2.b;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    Object objA = ((ztc) aucVar2.a.get(i)).a(l25Var2, str, iIntValue);
                    if (objA instanceof Integer) {
                        iIntValue = ((Number) objA).intValue();
                        i++;
                    } else {
                        if (!(objA instanceof usc)) {
                            sz6.j(ij0.B("Unexpected parse result: ", objA));
                            return null;
                        }
                        arrayList.add((usc) objA);
                    }
                } else if (!list2.isEmpty()) {
                    int size2 = list2.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i2 = size2 - 1;
                            arrayListA0.add(new stc(l25Var2, (auc) list2.get(size2), iIntValue));
                            if (i2 < 0) {
                                break;
                            }
                            size2 = i2;
                        }
                    }
                } else {
                    if (iIntValue == str.length()) {
                        return l25Var2;
                    }
                    arrayList.add(new usc(iIntValue, bw.J));
                }
            }
        }
    }

    public static final i49 q(BufferedSource bufferedSource) {
        InputStream inputStreamM0 = bufferedSource.M0();
        q2f q2fVar = new q2f();
        q2fVar.a = null;
        q2fVar.b = null;
        q2fVar.c = false;
        q2fVar.e = false;
        q2fVar.f = null;
        q2fVar.g = null;
        q2fVar.h = false;
        q2fVar.i = null;
        if (!inputStreamM0.markSupported()) {
            inputStreamM0 = new BufferedInputStream(inputStreamM0);
        }
        try {
            inputStreamM0.mark(3);
            int i = inputStreamM0.read() + (inputStreamM0.read() << 8);
            inputStreamM0.reset();
            if (i == 35615) {
                inputStreamM0 = new BufferedInputStream(new GZIPInputStream(inputStreamM0));
            }
        } catch (IOException unused) {
        }
        try {
            inputStreamM0.mark(FreeTypeConstants.FT_LOAD_MONOCHROME);
            q2fVar.B(inputStreamM0);
            return new i49(q2fVar.a);
        } finally {
            try {
                inputStreamM0.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }
}
