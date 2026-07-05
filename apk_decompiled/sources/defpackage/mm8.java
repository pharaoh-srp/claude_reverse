package defpackage;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mm8 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final c61 o;

    public mm8(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, c61 c61Var) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = c61Var;
    }

    public static mm8 a(ssc sscVar, boolean z, c61 c61Var) {
        boolean z2;
        x9c x9cVarY;
        int i;
        int i2 = 4;
        try {
            if (z) {
                sscVar.N(4);
            } else {
                sscVar.N(21);
            }
            int iZ = sscVar.z() & 3;
            int iZ2 = sscVar.z();
            int i3 = sscVar.b;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                z2 = true;
                if (i5 >= iZ2) {
                    break;
                }
                sscVar.N(1);
                int iG = sscVar.G();
                for (int i7 = 0; i7 < iG; i7++) {
                    int iG2 = sscVar.G();
                    i6 += iG2 + 4;
                    sscVar.N(iG2);
                }
                i5++;
            }
            sscVar.M(i3);
            byte[] bArr = new byte[i6];
            c61 c61Var2 = c61Var;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            float f = 1.0f;
            String strA = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 < iZ2) {
                int iZ3 = sscVar.z() & 63;
                int iG3 = sscVar.G();
                int i20 = i4;
                c61 c61VarA = c61Var2;
                while (i20 < iG3) {
                    boolean z3 = z2;
                    int iG4 = sscVar.G();
                    int i21 = iZ;
                    System.arraycopy(stj.b, i4, bArr, i19, i2);
                    int i22 = i19 + 4;
                    System.arraycopy(sscVar.a, sscVar.b, bArr, i22, iG4);
                    if (iZ3 == 32 && i20 == 0) {
                        c61VarA = stj.A(bArr, i22, i22 + iG4);
                    } else {
                        if (iZ3 == 33 && i20 == 0) {
                            oxb oxbVarZ = stj.z(bArr, i22, i22 + iG4, c61VarA);
                            i8 = oxbVarZ.a + 1;
                            i9 = oxbVarZ.g;
                            int i23 = oxbVarZ.h;
                            i11 = oxbVarZ.c + 8;
                            i12 = oxbVarZ.d + 8;
                            int i24 = oxbVarZ.k;
                            i10 = i23;
                            int i25 = oxbVarZ.l;
                            int i26 = oxbVarZ.m;
                            float f2 = oxbVarZ.i;
                            int i27 = oxbVarZ.j;
                            mxb mxbVar = oxbVarZ.b;
                            if (mxbVar != null) {
                                i = i27;
                                strA = q34.a(mxbVar.a, mxbVar.b, mxbVar.c, mxbVar.d, mxbVar.e, mxbVar.f);
                            } else {
                                i = i27;
                            }
                            i17 = i;
                            f = f2;
                            i15 = i26;
                            i14 = i25;
                            i13 = i24;
                        } else if (iZ3 == 39 && i20 == 0 && (x9cVarY = stj.y(bArr, i22, i22 + iG4)) != null && c61VarA != null) {
                            i4 = 0;
                            i16 = x9cVarY.F == ((lxb) ((nz8) c61VarA.F).get(0)).b ? 4 : 5;
                        }
                        i4 = 0;
                    }
                    i19 = i22 + iG4;
                    sscVar.N(iG4);
                    i20++;
                    z2 = z3;
                    iZ = i21;
                    i2 = 4;
                }
                i18++;
                c61Var2 = c61VarA;
                i2 = 4;
            }
            return new mm8(i6 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iZ + 1, i8, i9, i10, i11, i12, i13, i14, i15, i16, f, i17, strA, c61Var2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
