package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.ViewGroup;
import coil.compose.AsyncImagePainter;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.login.VerifyResponse;
import com.google.android.gms.maps.model.LatLng;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rlk {
    public static final ta4 a = new ta4(-561778214, false, new rb4(14));

    public static final void a(String str, String str2, int i, zy7 zy7Var, iqb iqbVar, zy7 zy7Var2, ld4 ld4Var, int i2, int i3) {
        iqb iqbVar2;
        int i4;
        zy7 zy7Var3;
        e18 e18Var;
        iqb iqbVar3;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(196419);
        int i5 = 4;
        int i6 = i2 | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(str2) ? 32 : 16) | (e18Var2.d(i) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        int i7 = i3 & 16;
        if (i7 != 0) {
            i4 = i6 | 24576;
            iqbVar2 = iqbVar;
        } else {
            iqbVar2 = iqbVar;
            i4 = i6 | (e18Var2.f(iqbVar2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        }
        if ((i2 & 196608) == 0) {
            zy7Var3 = zy7Var2;
            i4 |= e18Var2.h(zy7Var3) ? 131072 : 65536;
        } else {
            zy7Var3 = zy7Var2;
        }
        byte b = 0;
        if (e18Var2.Q(i4 & 1, (74899 & i4) != 74898)) {
            if (i7 != 0) {
                iqbVar2 = fqb.E;
            }
            Set set = uaj.a;
            String strReplace = bsg.i1('.', str, str).replace('_', ' ');
            strReplace.getClass();
            String strReplace2 = strReplace.replace('-', ' ');
            strReplace2.getClass();
            if (strReplace2.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(strReplace2.charAt(0));
                strValueOf.getClass();
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                sb.append((Object) upperCase);
                sb.append(strReplace2.substring(1));
                strReplace2 = sb.toString();
            }
            int i8 = (i4 & 112) | 100663680 | ((i4 >> 3) & 7168);
            int i9 = i4 << 3;
            String str3 = strReplace2;
            iqb iqbVar4 = iqbVar2;
            e18Var = e18Var2;
            jwk.m(str3, str2, fd9.q0(-873093706, new gq0(i, i5, b), e18Var2), iqbVar4, zy7Var, d4c.k0(R.string.chat_open_a_file, new Object[]{strReplace2}, e18Var2), zy7Var3, null, lja.K, MTTypesetterKt.kLineSkipLimitMultiplier, zdd.F, ((jm3) gm3.c(e18Var2).e.E).e, false, e18Var, i8 | (57344 & i9) | (i9 & 3670016), 6, 4736);
            iqbVar3 = iqbVar4;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar3 = iqbVar2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kd1(str, str2, i, zy7Var, iqbVar3, zy7Var2, i2, i3);
        }
    }

    public static final void b(final pua puaVar, String str, float f, long j, sq1 sq1Var, long j2, boolean z, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, bz7 bz7Var4, ld4 ld4Var, final int i, final int i2) {
        sq1 sq1Var2;
        int i3;
        bz7 bz7Var5;
        int i4;
        bz7 bz7Var6;
        bz7 bz7Var7;
        bz7 bz7Var8;
        bz7 bz7Var9;
        bz7 bz7Var10;
        float f2;
        long j3;
        long j4;
        boolean z2;
        String str2;
        e18 e18Var;
        final String str3;
        final float f3;
        final long j5;
        final sq1 sq1Var3;
        final long j6;
        final boolean z3;
        final bz7 bz7Var11;
        final bz7 bz7Var12;
        final bz7 bz7Var13;
        final bz7 bz7Var14;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(122922304);
        int i5 = 2;
        int i6 = 4;
        int i7 = i | (e18Var2.f(puaVar) ? 4 : 2);
        int i8 = 224688 | i7;
        int i9 = i2 & 64;
        if (i9 != 0) {
            i3 = i7 | 1797552;
            sq1Var2 = sq1Var;
        } else {
            sq1Var2 = sq1Var;
            i3 = i8 | (e18Var2.f(sq1Var2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288);
        }
        int i10 = i3 | 918552576;
        int i11 = i2 & 16384;
        if (i11 != 0) {
            i4 = 28086;
            bz7Var5 = bz7Var;
        } else {
            bz7Var5 = bz7Var;
            i4 = (e18Var2.h(bz7Var5) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | 3510;
        }
        int i12 = i4 | 14352384;
        if ((306783379 & i10) == 306783378 && (4793491 & i12) == 4793490 && e18Var2.C()) {
            e18Var2.T();
            f3 = f;
            j5 = j;
            z3 = z;
            bz7Var12 = bz7Var2;
            bz7Var13 = bz7Var3;
            bz7Var14 = bz7Var4;
            e18Var = e18Var2;
            sq1Var3 = sq1Var2;
            bz7Var11 = bz7Var5;
            str3 = str;
            j6 = j2;
        } else {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                long jB = hvk.b(0.5f, 1.0f);
                if (i9 != 0) {
                    sq1Var2 = null;
                }
                long jB2 = hvk.b(0.5f, MTTypesetterKt.kLineSkipLimitMultiplier);
                lz1 lz1Var = jd4.a;
                int i13 = 1;
                if (i11 != 0) {
                    e18Var2.a0(1095176621);
                    Object objN = e18Var2.N();
                    if (objN == lz1Var) {
                        objN = new jua(i13);
                        e18Var2.k0(objN);
                    }
                    bz7Var6 = (bz7) objN;
                    e18Var2.p(false);
                } else {
                    bz7Var6 = bz7Var5;
                }
                e18Var2.a0(1095178310);
                Object objN2 = e18Var2.N();
                if (objN2 == lz1Var) {
                    objN2 = new jua(i5);
                    e18Var2.k0(objN2);
                }
                bz7 bz7Var15 = (bz7) objN2;
                e18Var2.p(false);
                e18Var2.a0(1095179782);
                Object objN3 = e18Var2.N();
                if (objN3 == lz1Var) {
                    objN3 = new jua(3);
                    e18Var2.k0(objN3);
                }
                bz7 bz7Var16 = (bz7) objN3;
                e18Var2.p(false);
                e18Var2.a0(1095181382);
                Object objN4 = e18Var2.N();
                if (objN4 == lz1Var) {
                    objN4 = new jua(i6);
                    e18Var2.k0(objN4);
                }
                e18Var2.p(false);
                bz7Var7 = bz7Var15;
                bz7Var8 = (bz7) objN4;
                bz7Var9 = bz7Var6;
                bz7Var10 = bz7Var16;
                f2 = 1.0f;
                j3 = jB;
                j4 = jB2;
                z2 = true;
                str2 = "";
            } else {
                e18Var2.T();
                str2 = str;
                f2 = f;
                j3 = j;
                j4 = j2;
                z2 = z;
                bz7Var7 = bz7Var2;
                bz7Var10 = bz7Var3;
                bz7Var8 = bz7Var4;
                bz7Var9 = bz7Var5;
            }
            sq1 sq1Var4 = sq1Var2;
            e18Var2.q();
            e18Var = e18Var2;
            d(puaVar, str2, f2, j3, sq1Var4, j4, z2, bz7Var9, bz7Var7, bz7Var10, bz7Var8, e18Var, i10 & 2147483646, i12 & 33554430);
            str3 = str2;
            f3 = f2;
            j5 = j3;
            sq1Var3 = sq1Var4;
            j6 = j4;
            z3 = z2;
            bz7Var11 = bz7Var9;
            bz7Var12 = bz7Var7;
            bz7Var13 = bz7Var10;
            bz7Var14 = bz7Var8;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(str3, f3, j5, sq1Var3, j6, z3, bz7Var11, bz7Var12, bz7Var13, bz7Var14, i, i2) { // from class: lua
                public final /* synthetic */ String F;
                public final /* synthetic */ float G;
                public final /* synthetic */ long H;
                public final /* synthetic */ sq1 I;
                public final /* synthetic */ long J;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ bz7 L;
                public final /* synthetic */ bz7 M;
                public final /* synthetic */ bz7 N;
                public final /* synthetic */ bz7 O;
                public final /* synthetic */ int P;

                {
                    this.P = i2;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    rlk.b(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, (ld4) obj, iP0, this.P);
                    return iei.a;
                }
            };
        }
    }

    public static final void c(final Object[] objArr, final pua puaVar, String str, float f, long j, long j2, boolean z, final bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, bz7 bz7Var4, final ta4 ta4Var, ld4 ld4Var, final int i) {
        long jB;
        String str2;
        boolean z2;
        bz7 bz7Var5;
        bz7 bz7Var6;
        bz7 bz7Var7;
        long j3;
        final float f2;
        final long j4;
        final String str3;
        final long j5;
        final boolean z3;
        final bz7 bz7Var8;
        final bz7 bz7Var9;
        final bz7 bz7Var10;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1649920301);
        int i2 = i | (e18Var.f(puaVar) ? 32 : 16) | 920350080;
        int i3 = (e18Var.h(bz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | 115019190;
        e18Var.X(-766448671, Integer.valueOf(objArr.length));
        int i4 = 0;
        for (Object obj : objArr) {
            i2 |= e18Var.h(obj) ? 4 : 0;
        }
        e18Var.p(false);
        if ((i2 & 14) == 0) {
            i2 |= 2;
        }
        if ((306783379 & i2) == 306783378 && (38347923 & i3) == 38347922 && e18Var.C()) {
            e18Var.T();
            str3 = str;
            f2 = f;
            j4 = j;
            j5 = j2;
            z3 = z;
            bz7Var8 = bz7Var2;
            bz7Var9 = bz7Var3;
            bz7Var10 = bz7Var4;
        } else {
            e18Var.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                jB = hvk.b(0.5f, 1.0f);
                long jB2 = hvk.b(0.5f, MTTypesetterKt.kLineSkipLimitMultiplier);
                e18Var.a0(-766431757);
                Object objN = e18Var.N();
                if (objN == lz1Var) {
                    objN = new e69(28);
                    e18Var.k0(objN);
                }
                bz7 bz7Var11 = (bz7) objN;
                e18Var.p(false);
                e18Var.a0(-766430285);
                Object objN2 = e18Var.N();
                if (objN2 == lz1Var) {
                    objN2 = new e69(29);
                    e18Var.k0(objN2);
                }
                bz7 bz7Var12 = (bz7) objN2;
                e18Var.p(false);
                e18Var.a0(-766428685);
                Object objN3 = e18Var.N();
                if (objN3 == lz1Var) {
                    objN3 = new jua(i4);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                str2 = "";
                z2 = true;
                bz7Var5 = (bz7) objN3;
                bz7Var6 = bz7Var11;
                bz7Var7 = bz7Var12;
                j3 = jB2;
                f2 = 1.0f;
            } else {
                e18Var.T();
                str2 = str;
                f2 = f;
                jB = j;
                j3 = j2;
                z2 = z;
                bz7Var6 = bz7Var2;
                bz7Var7 = bz7Var3;
                bz7Var5 = bz7Var4;
            }
            e18Var.q();
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            int i6 = i2;
            ta4 ta4VarQ0 = fd9.q0(-1211332052, new u74(2, ta4Var), e18Var);
            int i7 = jee.a;
            e18Var.a0(1871105836);
            Object objJ = e18Var.j(w00.f);
            objJ.getClass();
            ViewGroup viewGroup = (ViewGroup) objJ;
            c18 c18VarF = iuj.F(e18Var);
            nwb nwbVarZ = mpk.Z(ta4VarQ0, e18Var);
            wig wigVar = new wig(4);
            wigVar.a(viewGroup);
            wigVar.a(c18VarF);
            wigVar.a((pz7) nwbVarZ.getValue());
            wigVar.b(objArrCopyOf);
            ArrayList arrayList = wigVar.a;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            int length = array.length;
            int i8 = 0;
            boolean zF = false;
            while (i8 < length) {
                Object[] objArr2 = array;
                zF |= e18Var.f(objArr2[i8]);
                i8++;
                array = objArr2;
            }
            Object objN4 = e18Var.N();
            if (zF || objN4 == lz1Var) {
                pz7 pz7Var = (pz7) nwbVarZ.getValue();
                Context context = viewGroup.getContext();
                context.getClass();
                ed4 ed4Var = new ed4(context);
                ed4Var.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                ed4Var.setParentCompositionContext(c18VarF);
                ed4Var.setContent(pz7Var);
                viewGroup.addView(ed4Var);
                int i9 = jee.a;
                ed4Var.measure(i9, i9);
                if (ed4Var.getMeasuredWidth() == 0 || ed4Var.getMeasuredHeight() == 0) {
                    sz6.j("The ComposeView was measured to have a width or height of zero. Make sure that the content has a non-zero size.");
                    return;
                }
                ed4Var.layout(0, 0, ed4Var.getMeasuredWidth(), ed4Var.getMeasuredHeight());
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(ed4Var.getMeasuredWidth(), ed4Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                ed4Var.draw(new Canvas(bitmapCreateBitmap));
                viewGroup.removeView(ed4Var);
                dgj.w("image must not be null", bitmapCreateBitmap);
                try {
                    kuk kukVar = nv1.h;
                    dgj.w("IBitmapDescriptorFactory is not initialized", kukVar);
                    gnk gnkVar = (gnk) kukVar;
                    Parcel parcelH = gnkVar.H();
                    gyj.c(parcelH, bitmapCreateBitmap);
                    Parcel parcelF = gnkVar.F(parcelH, 6);
                    lu8 lu8VarF = cbc.F(parcelF.readStrongBinder());
                    parcelF.recycle();
                    sq1 sq1Var = new sq1(lu8VarF);
                    e18Var.k0(sq1Var);
                    objN4 = sq1Var;
                } catch (RemoteException e) {
                    poc.q(e);
                    return;
                }
            }
            e18Var.p(false);
            int i10 = 33554430 & i3;
            j4 = jB;
            bz7 bz7Var13 = bz7Var6;
            bz7 bz7Var14 = bz7Var7;
            bz7 bz7Var15 = bz7Var5;
            str3 = str2;
            d(puaVar, str3, f2, j4, (sq1) objN4, j3, z2, bz7Var, bz7Var13, bz7Var14, bz7Var15, e18Var, ((i6 >> 3) & 524286) | 918552576, i10);
            j5 = j3;
            z3 = z2;
            bz7Var8 = bz7Var13;
            bz7Var9 = bz7Var14;
            bz7Var10 = bz7Var15;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(objArr, puaVar, str3, f2, j4, j5, z3, bz7Var, bz7Var8, bz7Var9, bz7Var10, ta4Var, i) { // from class: kua
                public final /* synthetic */ Object[] E;
                public final /* synthetic */ pua F;
                public final /* synthetic */ String G;
                public final /* synthetic */ float H;
                public final /* synthetic */ long I;
                public final /* synthetic */ long J;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ bz7 L;
                public final /* synthetic */ bz7 M;
                public final /* synthetic */ bz7 N;
                public final /* synthetic */ bz7 O;
                public final /* synthetic */ ta4 P;

                @Override // defpackage.pz7
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    Object[] objArr3 = this.E;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    int iP0 = x44.p0(1);
                    rlk.c(objArrCopyOf2, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (ld4) obj2, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void d(pua puaVar, final String str, final float f, final long j, sq1 sq1Var, long j2, final boolean z, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, bz7 bz7Var4, ld4 ld4Var, final int i, final int i2) {
        int i3;
        int i4;
        Object obj;
        Float f2;
        a0 a0Var;
        Boolean bool;
        e18 e18Var;
        final long j3;
        final pua puaVar2 = puaVar;
        final sq1 sq1Var2 = sq1Var;
        final long j4 = j2;
        final bz7 bz7Var5 = bz7Var;
        final bz7 bz7Var6 = bz7Var2;
        final bz7 bz7Var7 = bz7Var3;
        final bz7 bz7Var8 = bz7Var4;
        Float fValueOf = Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier);
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1052021632);
        a0 a0Var2 = e18Var2.a;
        if ((i & 6) == 0) {
            i3 = i | (e18Var2.f(puaVar2) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var2.f(str) ? 32 : 16;
        }
        int i5 = i & 384;
        int i6 = FreeTypeConstants.FT_LOAD_PEDANTIC;
        if (i5 == 0) {
            i3 |= e18Var2.c(f) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : 128;
        }
        int i7 = i & 3072;
        int i8 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
        if (i7 == 0) {
            i3 |= e18Var2.e(j) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : 1024;
        }
        int i9 = i & 24576;
        int i10 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        if (i9 == 0) {
            i3 |= e18Var2.g(false) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= e18Var2.g(false) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= e18Var2.f(sq1Var2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= e18Var2.e(j4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= e18Var2.c(MTTypesetterKt.kLineSkipLimitMultiplier) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= e18Var2.f(null) ? 536870912 : 268435456;
        }
        int i11 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (e18Var2.h(null) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var2.f(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (e18Var2.g(z)) {
                i6 = FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
            }
            i4 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (e18Var2.c(MTTypesetterKt.kLineSkipLimitMultiplier)) {
                i8 = FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
            }
            i4 |= i8;
        }
        if ((i2 & 24576) == 0) {
            if (e18Var2.h(bz7Var5)) {
                i10 = 16384;
            }
            i4 |= i10;
        }
        if ((i2 & 196608) == 0) {
            i4 |= e18Var2.h(bz7Var6) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= e18Var2.h(bz7Var7) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= e18Var2.h(bz7Var8) ? 8388608 : 4194304;
        }
        int i12 = i4 | 905969664;
        if ((i11 & 306783379) == 306783378 && (i12 & 306783379) == 306783378 && e18Var2.C()) {
            e18Var2.T();
            j3 = j;
            e18Var = e18Var2;
        } else {
            e18Var2.V();
            if ((i & 1) != 0 && !e18Var2.A()) {
                e18Var2.T();
            }
            e18Var2.q();
            hqa hqaVar = a0Var2 instanceof hqa ? (hqa) a0Var2 : null;
            final c18 c18VarF = iuj.F(e18Var2);
            e18Var2.a0(-1882686388);
            final hqa hqaVar2 = hqaVar;
            boolean zH = ((i11 & 112) == 32) | e18Var2.h(hqaVar) | ((i11 & 896) == 256) | ((i11 & 7168) == 2048) | ((i11 & 57344) == 16384) | ((i11 & 458752) == 131072) | ((i11 & 3670016) == 1048576) | ((i11 & 29360128) == 8388608) | ((((i11 & 14) ^ 6) > 4 && e18Var2.f(puaVar2)) || (i11 & 6) == 4) | ((i11 & 234881024) == 67108864) | ((i11 & 1879048192) == 536870912) | ((i12 & 112) == 32) | ((i12 & 896) == 256) | ((i12 & 7168) == 2048) | e18Var2.h(null) | e18Var2.h(c18VarF) | ((i12 & 57344) == 16384) | ((i12 & 458752) == 131072) | ((i12 & 3670016) == 1048576) | ((i12 & 29360128) == 8388608) | ((i12 & 234881024) == 67108864) | ((i12 & 1879048192) == 536870912);
            Object objN = e18Var2.N();
            if (zH || objN == jd4.a) {
                f2 = fValueOf;
                a0Var = a0Var2;
                bool = false;
                obj = new zy7() { // from class: iua
                    @Override // defpackage.zy7
                    public final Object a() {
                        n88 n88Var;
                        fua gfVar;
                        hqa hqaVar3 = hqaVar2;
                        if (hqaVar3 != null && (n88Var = hqaVar3.I) != null) {
                            nua nuaVar = new nua();
                            nuaVar.I = 0.5f;
                            nuaVar.J = 1.0f;
                            nuaVar.L = true;
                            nuaVar.M = false;
                            nuaVar.N = MTTypesetterKt.kLineSkipLimitMultiplier;
                            nuaVar.O = 0.5f;
                            nuaVar.P = MTTypesetterKt.kLineSkipLimitMultiplier;
                            nuaVar.S = 0;
                            nuaVar.V = str;
                            nuaVar.Q = f;
                            long j5 = j;
                            float f3 = fcc.f(j5);
                            float fG = fcc.g(j5);
                            nuaVar.I = f3;
                            nuaVar.J = fG;
                            nuaVar.K = false;
                            nuaVar.M = false;
                            nuaVar.H = sq1Var2;
                            long j6 = j4;
                            float f4 = fcc.f(j6);
                            float fG2 = fcc.g(j6);
                            nuaVar.O = f4;
                            nuaVar.P = fG2;
                            pua puaVar3 = puaVar2;
                            LatLng latLng = (LatLng) puaVar3.a.getValue();
                            if (latLng == null) {
                                sz6.p("latlng cannot be null - a position is required.");
                                return null;
                            }
                            nuaVar.E = latLng;
                            nuaVar.N = MTTypesetterKt.kLineSkipLimitMultiplier;
                            nuaVar.G = null;
                            nuaVar.F = null;
                            nuaVar.L = z;
                            nuaVar.R = MTTypesetterKt.kLineSkipLimitMultiplier;
                            try {
                                hfk hfkVar = n88Var.a;
                                Parcel parcelH = hfkVar.H();
                                gyj.c(parcelH, nuaVar);
                                Parcel parcelF = hfkVar.F(parcelH, 11);
                                crj crjVarH = xqj.H(parcelF.readStrongBinder());
                                parcelF.recycle();
                                if (crjVarH != null) {
                                    gfVar = nuaVar.U == 1 ? new gf(crjVarH) : new fua(crjVarH);
                                } else {
                                    gfVar = null;
                                }
                                if (gfVar != null) {
                                    gfVar.c(null);
                                    return new mua(c18VarF, gfVar, puaVar3, bz7Var5, bz7Var6, bz7Var7, bz7Var8);
                                }
                            } catch (RemoteException e) {
                                poc.q(e);
                                return null;
                            }
                        }
                        sz6.j("Error adding marker");
                        return null;
                    }
                };
                bz7Var7 = bz7Var7;
                sq1Var2 = sq1Var2;
                bz7Var8 = bz7Var8;
                j4 = j4;
                puaVar2 = puaVar2;
                e18Var = e18Var2;
                bz7Var5 = bz7Var5;
                bz7Var6 = bz7Var6;
                j3 = j;
                e18Var.k0(obj);
            } else {
                j3 = j;
                obj = objN;
                e18Var = e18Var2;
                f2 = fValueOf;
                a0Var = a0Var2;
                bool = false;
            }
            zy7 zy7Var = (zy7) obj;
            e18Var.p(false);
            if (!(a0Var instanceof hqa)) {
                iuj.A();
                throw null;
            }
            e18Var.Y();
            if (e18Var.S) {
                e18Var.k(zy7Var);
            } else {
                e18Var.n0();
            }
            d4c.q0(e18Var, new uw8(24), bz7Var5);
            d4c.q0(e18Var, new uw8(25), bz7Var6);
            d4c.q0(e18Var, new uw8(26), bz7Var7);
            d4c.q0(e18Var, new uw8(27), bz7Var8);
            d4c.q0(e18Var, new uw8(28), null);
            d4c.q0(e18Var, new uw8(29), null);
            d4c.q0(e18Var, new uw8(11), Float.valueOf(f));
            d4c.q0(e18Var, new uw8(12), new fcc(j3));
            Boolean bool2 = bool;
            d4c.q0(e18Var, new uw8(13), bool2);
            d4c.q0(e18Var, new uw8(14), bool2);
            d4c.q0(e18Var, new uw8(15), sq1Var2);
            d4c.q0(e18Var, new uw8(16), new fcc(j4));
            d4c.q0(e18Var, new uw8(17), (LatLng) puaVar2.a.getValue());
            Float f3 = f2;
            d4c.q0(e18Var, new uw8(18), f3);
            d4c.q0(e18Var, new uw8(19), null);
            d4c.q0(e18Var, new uw8(20), null);
            d4c.q0(e18Var, new uw8(21), null);
            d4c.q0(e18Var, new uw8(22), Boolean.valueOf(z));
            d4c.q0(e18Var, new uw8(23), f3);
            e18Var.p(true);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: hua
                @Override // defpackage.pz7
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP0 = x44.p0(i | 1);
                    int iP02 = x44.p0(i2);
                    rlk.d(puaVar2, str, f, j3, sq1Var2, j4, z, bz7Var5, bz7Var6, bz7Var7, bz7Var8, (ld4) obj2, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }

    public static final void e(int i, ld4 ld4Var, iqb iqbVar, String str, String str2) {
        lja ljaVar = ho4.d;
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-980895233);
        int i2 = (e18Var.f(str) ? 4 : 2) | i | (e18Var.f(str2) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(ljaVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            umg umgVar = w00.b;
            gx8 gx8Var = new gx8((Context) e18Var.j(umgVar));
            gx8Var.c = str;
            i8g i8gVar = i8g.c;
            gx8Var.m = new b5e();
            gx8Var.o = null;
            gx8Var.p = null;
            gx8Var.q = null;
            gx8Var.g = new oc5(100);
            kx8 kx8VarA = gx8Var.a();
            e18Var.b0(-1494234083);
            ex exVar = ex.X;
            lz1 lz1Var = ho4.b;
            s4e s4eVar = (s4e) e18Var.j(qda.a);
            if (s4eVar == null) {
                Context context = (Context) e18Var.j(umgVar);
                s4eVar = tqh.J;
                if (s4eVar == null) {
                    synchronized (tqh.I) {
                        s4eVar = tqh.J;
                        if (s4eVar == null) {
                            context.getApplicationContext();
                            s4e s4eVarF = ztk.f(context);
                            tqh.J = s4eVarF;
                            s4eVar = s4eVarF;
                        }
                    }
                }
            }
            e18Var.b0(-2020614074);
            int i4 = eqi.a;
            Object obj = kx8VarA.b;
            if (obj instanceof gx8) {
                sz6.p("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
                return;
            }
            if (obj instanceof r20) {
                t9e.C("ImageBitmap");
                throw null;
            }
            if (obj instanceof py8) {
                t9e.C("ImageVector");
                throw null;
            }
            if (obj instanceof bpc) {
                t9e.C("Painter");
                throw null;
            }
            if (kx8VarA.c != null) {
                sz6.p("request.target must be null.");
                return;
            }
            e18Var.b0(-492369756);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new AsyncImagePainter(kx8VarA, s4eVar);
                e18Var.k0(objN);
            }
            e18Var.p(false);
            AsyncImagePainter asyncImagePainter = (AsyncImagePainter) objN;
            asyncImagePainter.Q = exVar;
            asyncImagePainter.R = lz1Var;
            asyncImagePainter.S = 1;
            asyncImagePainter.T = ((Boolean) e18Var.j(p59.a)).booleanValue();
            asyncImagePainter.W.setValue(s4eVar);
            asyncImagePainter.V.setValue(kx8VarA);
            asyncImagePainter.g();
            e18Var.p(false);
            e18Var.p(false);
            xn5.H(iqbVar, lja.K, false, fd9.q0(-1906883371, new zee((cz5) e18Var.j(ve4.h), asyncImagePainter, str2, i3), e18Var), e18Var, ((i2 >> 6) & 14) | 3120, 4);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t6e(str, str2, iqbVar, i, 1);
        }
    }

    public static final String f(String str) {
        return "type.googleapis.com/".concat(bsg.e1(str, "/", str));
    }

    public static Collection g(qqb qqbVar) {
        if (qqbVar.q() != 2) {
            return lm6.E;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        bo5 bo5VarH = qqbVar.h();
        if (bo5VarH instanceof wmc) {
            h(qqbVar, linkedHashSet, ((wmc) bo5VarH).G(), false);
        }
        fab fabVarK0 = qqbVar.k0();
        fabVarK0.getClass();
        h(qqbVar, linkedHashSet, fabVarK0, true);
        return w44.i1(linkedHashSet, new mt7(15));
    }

    public static final void h(qqb qqbVar, LinkedHashSet linkedHashSet, fab fabVar, boolean z) {
        for (bo5 bo5Var : cok.p(fabVar, c06.o, 2)) {
            if (bo5Var instanceof qqb) {
                qqb qqbVarN0 = (qqb) bo5Var;
                if (qqbVarN0.x()) {
                    sxb name = qqbVarN0.getName();
                    name.getClass();
                    xh3 xh3VarE = fabVar.e(name, 13);
                    qqbVarN0 = xh3VarE instanceof qqb ? (qqb) xh3VarE : xh3VarE instanceof q16 ? ((q16) xh3VarE).N0() : null;
                }
                if (qqbVarN0 != null) {
                    int i = m06.a;
                    Iterator it = qqbVarN0.p().b().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (m06.p((yr9) it.next(), qqbVar.a())) {
                                linkedHashSet.add(qqbVarN0);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        fab fabVarK0 = qqbVarN0.k0();
                        fabVarK0.getClass();
                        h(qqbVar, linkedHashSet, fabVarK0, z);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        r2.add(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.sa i(defpackage.qh9 r9) {
        /*
            java.lang.String r0 = "Unable to parse json into type Frustration"
            r1 = 0
            java.lang.String r2 = "type"
            bh9 r9 = r9.s(r2)     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            ig9 r9 = r9.e()     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            java.util.ArrayList r9 = r9.E     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            int r3 = r9.size()     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            r2.<init>(r3)     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
        L1c:
            boolean r3 = r9.hasNext()     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            if (r3 == 0) goto L56
            java.lang.Object r3 = r9.next()     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            bh9 r3 = (defpackage.bh9) r3     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            java.lang.String r3 = r3.m()     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            r3.getClass()     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            ab[] r4 = defpackage.ab.values()     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            int r5 = r4.length     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            r6 = 0
        L35:
            if (r6 >= r5) goto L4e
            r7 = r4[r6]     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            java.lang.String r8 = r7.E     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            boolean r8 = r8.equals(r3)     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            if (r8 == 0) goto L4b
            r2.add(r7)     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            goto L1c
        L45:
            r9 = move-exception
            goto L5c
        L47:
            r9 = move-exception
            goto L60
        L49:
            r9 = move-exception
            goto L64
        L4b:
            int r6 = r6 + 1
            goto L35
        L4e:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            java.lang.String r2 = "Array contains no element matching the predicate."
            r9.<init>(r2)     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            throw r9     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
        L56:
            sa r9 = new sa     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            r9.<init>(r2)     // Catch: java.lang.NullPointerException -> L45 java.lang.NumberFormatException -> L47 java.lang.IllegalStateException -> L49
            return r9
        L5c:
            defpackage.pmf.j(r0, r9)
            return r1
        L60:
            defpackage.pmf.j(r0, r9)
            return r1
        L64:
            defpackage.pmf.j(r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlk.i(qh9):sa");
    }

    public static ubh j(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("stack");
            String strM = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s(VerifyResponse.AuthenticationState.DISCRIMINATOR);
            return new ubh(strM, bh9VarS2 != null ? bh9VarS2.m() : null);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Error", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Error", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Error", e3);
            return null;
        }
    }

    public static final pua k(LatLng latLng, e18 e18Var) {
        e18Var.a0(1974742690);
        e18Var.a0(-160872764);
        Object objN = e18Var.N();
        if (objN == jd4.a) {
            objN = new pua(latLng);
            e18Var.k0(objN);
        }
        pua puaVar = (pua) objN;
        e18Var.p(false);
        puaVar.a.setValue(latLng);
        e18Var.p(false);
        return puaVar;
    }
}
