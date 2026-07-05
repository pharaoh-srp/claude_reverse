package defpackage;

import android.content.Context;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tvk {
    public static final ta4 a = new ta4(1434717837, false, new ya4(22));

    static {
        new ta4(1757613698, false, new cc4(29));
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final void b(final bpc bpcVar, final zy7 zy7Var, final iqb iqbVar, final boolean z, final String str, final float f, final tkh tkhVar, final wz2 wz2Var, zy7 zy7Var2, ld4 ld4Var, final int i, final int i2) {
        int i3;
        int i4;
        e18 e18Var;
        final zy7 zy7Var3;
        zy7 zy7Var4;
        long j;
        long j2;
        tp4 tp4Var;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-447358758);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? e18Var2.f(bpcVar) : e18Var2.h(bpcVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var2.f(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var2.g(false) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var2.g(false) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i3 |= e18Var2.g(false) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i3 |= e18Var2.h(zy7Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= e18Var2.g(z) ? 8388608 : 4194304;
        }
        int i5 = i3 | 100663296;
        if ((i & 805306368) == 0) {
            i5 |= e18Var2.f(str) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (e18Var2.c(f) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var2.f(tkhVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= e18Var2.f(wz2Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i6 = i4 | 27648;
        if (e18Var2.Q(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 9363) == 9362) ? false : true)) {
            e18Var2.V();
            int i7 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i7 == 0 || e18Var2.A()) {
                Object objN = e18Var2.N();
                if (objN == lz1Var) {
                    objN = new oob(19);
                    e18Var2.k0(objN);
                }
                zy7Var4 = (zy7) objN;
            } else {
                e18Var2.T();
                zy7Var4 = zy7Var2;
            }
            e18Var2.q();
            long j3 = !z ? wz2Var.g : wz2Var.d;
            long j4 = !z ? wz2Var.h : wz2Var.e;
            if (z) {
                j = j4;
                j2 = wz2Var.f;
            } else {
                j = j4;
                j2 = wz2Var.i;
            }
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = vb7.f(e18Var2);
            }
            final zub zubVar = (zub) objN2;
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                objN3 = vb7.f(e18Var2);
            }
            final zub zubVar2 = (zub) objN3;
            Boolean bool = Boolean.FALSE;
            final long j5 = j2;
            Object[] objArr = {null, bool, bool};
            int i8 = i5 & 112;
            int i9 = i5 & 896;
            int i10 = i5 & 7168;
            boolean z2 = (i8 == 32) | (i9 == 256) | (i10 == 2048);
            Object objN4 = e18Var2.N();
            if (z2 || objN4 == lz1Var) {
                objN4 = new ew0(8);
                e18Var2.k0(objN4);
            }
            final nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN4, e18Var2, 0);
            nwb nwbVarZ = mpk.Z(zy7Var4, e18Var2);
            boolean zF = (i9 == 256) | (i8 == 32) | (i10 == 2048) | ((i6 & 7168) == 2048) | e18Var2.f(nwbVar) | e18Var2.f(nwbVarZ);
            Object objN5 = e18Var2.N();
            if (zF || objN5 == lz1Var) {
                tp4Var = null;
                objN5 = new sd1(nwbVarZ, nwbVar, tp4Var, 0);
                e18Var2.k0(objN5);
            } else {
                tp4Var = null;
            }
            fd9.k(tp4Var, bool, bool, (pz7) objN5, e18Var2);
            e18Var = e18Var2;
            final long j6 = j;
            j8.c(sq6.m(j3, on4.a), fd9.q0(-1296949862, new pz7(zubVar, zubVar2, iqbVar, j6, j5, str, z, zy7Var, bpcVar, f, nwbVar, tkhVar) { // from class: qd1
                public final /* synthetic */ zub E;
                public final /* synthetic */ iqb F;
                public final /* synthetic */ long G;
                public final /* synthetic */ long H;
                public final /* synthetic */ String I;
                public final /* synthetic */ boolean J;
                public final /* synthetic */ zy7 K;
                public final /* synthetic */ bpc L;
                public final /* synthetic */ float M;

                {
                    this.E = zubVar2;
                    this.F = iqbVar;
                    this.G = j6;
                    this.H = j5;
                    this.I = str;
                    this.J = z;
                    this.K = zy7Var;
                    this.L = bpcVar;
                    this.M = f;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    e18 e18Var3 = (e18) ld4Var2;
                    if (e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        vve vveVar = xve.a;
                        iqb iqbVarT = ez1.t(yfd.p(xn5.V(this.F, vveVar), this.G, zni.b), MTTypesetterKt.kLineSkipLimitMultiplier, this.H, vveVar);
                        String str2 = this.I;
                        boolean zF2 = e18Var3.f(str2);
                        Object objN6 = e18Var3.N();
                        lz1 lz1Var2 = jd4.a;
                        if (zF2 || objN6 == lz1Var2) {
                            objN6 = new o8(str2, 15);
                            e18Var3.k0(objN6);
                        }
                        iqb iqbVarB = tjf.b(iqbVarT, false, (bz7) objN6);
                        e18Var3.a0(93464902);
                        h19 h19Var = (h19) e18Var3.j(d19.a);
                        vue vueVar = new vue(0);
                        fqb fqbVar = fqb.E;
                        iqb iqbVarA = b.a(fqbVar, this.E, h19Var, this.J, null, vueVar, this.K);
                        boolean zG = e18Var3.g(false);
                        Object objN7 = e18Var3.N();
                        if (zG || objN7 == lz1Var2) {
                            objN7 = new zv(13);
                            e18Var3.k0(objN7);
                        }
                        iqb iqbVarB2 = tjf.b(iqbVarA, false, (bz7) objN7);
                        e18Var3.p(false);
                        iqb iqbVarB3 = iqbVarB.B(iqbVarB2);
                        o5b o5bVarD = dw1.d(lja.G, false);
                        int iHashCode = Long.hashCode(e18Var3.T);
                        hyc hycVarL = e18Var3.l();
                        iqb iqbVarE = kxk.E(e18Var3, iqbVarB3);
                        dd4.e.getClass();
                        re4 re4Var = cd4.b;
                        e18Var3.e0();
                        if (e18Var3.S) {
                            e18Var3.k(re4Var);
                        } else {
                            e18Var3.n0();
                        }
                        z80 z80Var = cd4.f;
                        d4c.i0(e18Var3, z80Var, o5bVarD);
                        z80 z80Var2 = cd4.e;
                        d4c.i0(e18Var3, z80Var2, hycVarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        z80 z80Var3 = cd4.g;
                        d4c.i0(e18Var3, z80Var3, numValueOf);
                        bx bxVar = cd4.h;
                        d4c.h0(e18Var3, bxVar);
                        z80 z80Var4 = cd4.d;
                        d4c.i0(e18Var3, z80Var4, iqbVarE);
                        wo1 wo1Var = lja.Q;
                        iqb iqbVarE2 = androidx.compose.foundation.layout.b.e(androidx.compose.foundation.layout.b.v(fqbVar, 32.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 32.0f);
                        cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var3, 48);
                        int iHashCode2 = Long.hashCode(e18Var3.T);
                        hyc hycVarL2 = e18Var3.l();
                        iqb iqbVarE3 = kxk.E(e18Var3, iqbVarE2);
                        e18Var3.e0();
                        if (e18Var3.S) {
                            e18Var3.k(re4Var);
                        } else {
                            e18Var3.n0();
                        }
                        d4c.i0(e18Var3, z80Var, cxeVarA);
                        d4c.i0(e18Var3, z80Var2, hycVarL2);
                        ij0.t(iHashCode2, e18Var3, z80Var3, e18Var3, bxVar);
                        d4c.i0(e18Var3, z80Var4, iqbVarE3);
                        kxk.g(e18Var3, androidx.compose.foundation.layout.b.t(fqbVar, 6.0f));
                        bpc bpcVar2 = this.L;
                        if (bpcVar2 != null) {
                            e18Var3.a0(-1331345281);
                            xo1 xo1Var = lja.K;
                            iqb iqbVarO = androidx.compose.foundation.layout.b.o(fqbVar, 20.0f);
                            o5b o5bVarD2 = dw1.d(xo1Var, false);
                            int iHashCode3 = Long.hashCode(e18Var3.T);
                            hyc hycVarL3 = e18Var3.l();
                            iqb iqbVarE4 = kxk.E(e18Var3, iqbVarO);
                            e18Var3.e0();
                            if (e18Var3.S) {
                                e18Var3.k(re4Var);
                            } else {
                                e18Var3.n0();
                            }
                            d4c.i0(e18Var3, z80Var, o5bVarD2);
                            d4c.i0(e18Var3, z80Var2, hycVarL3);
                            ij0.t(iHashCode3, e18Var3, z80Var3, e18Var3, bxVar);
                            d4c.i0(e18Var3, z80Var4, iqbVarE4);
                            cv8.b(bpcVar2, null, androidx.compose.foundation.layout.b.o(fqbVar, this.M), 0L, e18Var3, 56, 8);
                            e18Var3.p(true);
                            z3 = false;
                            e18Var3.p(false);
                        } else {
                            z3 = false;
                            e18Var3.a0(-1330928610);
                            e18Var3.p(false);
                        }
                        e18Var3.a0(-1330008034);
                        e18Var3.p(z3);
                        kxk.g(e18Var3, androidx.compose.foundation.layout.b.t(fqbVar, 6.0f));
                        e18Var3.p(true);
                        e18Var3.p(true);
                    } else {
                        e18Var3.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, 56);
            zy7Var3 = zy7Var4;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            zy7Var3 = zy7Var2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: rd1
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tvk.b(bpcVar, zy7Var, iqbVar, z, str, f, tkhVar, wz2Var, zy7Var3, (ld4) obj, x44.p0(i | 1), x44.p0(i2));
                    return iei.a;
                }
            };
        }
    }

    public static final File c(Context context, String str) {
        context.getClass();
        str.getClass();
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static final boolean d(String str, String str2) {
        return x44.r(str, str2);
    }

    public static int e(String str) {
        return str.hashCode();
    }

    public static final iqb f(iqb iqbVar) {
        return tjf.b(iqbVar, false, new d6f(6));
    }

    public static final ExtractedText g(cjh cjhVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = cjhVar.a.F;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = cjhVar.b;
        extractedText.selectionStart = kkh.g(j);
        extractedText.selectionEnd = kkh.f(j);
        extractedText.flags = !bsg.v0(cjhVar.a.F, '\n') ? 1 : 0;
        return extractedText;
    }

    public static String h(String str) {
        return ij0.j("OpenChatSource(source=", str, ")");
    }
}
