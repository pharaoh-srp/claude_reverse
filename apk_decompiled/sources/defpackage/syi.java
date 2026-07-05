package defpackage;

import android.view.View;
import com.anthropic.claude.R;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.p0;
import com.google.android.gms.internal.measurement.zzlk;

/* JADX INFO: loaded from: classes.dex */
public abstract class syi {
    public static final eyi a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            eyi eyiVar = tag instanceof eyi ? (eyi) tag : null;
            if (eyiVar != null) {
                return eyiVar;
            }
            Object objA = bmk.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static int b(int i, byte[] bArr, int i2, int i3, dyk dykVar, usk uskVar) {
        txk txkVar = (txk) dykVar;
        int iJ = j(bArr, i2, uskVar);
        txkVar.b(uskVar.a);
        while (iJ < i3) {
            int iJ2 = j(bArr, iJ, uskVar);
            if (i != uskVar.a) {
                break;
            }
            iJ = j(bArr, iJ2, uskVar);
            txkVar.b(uskVar.a);
        }
        return iJ;
    }

    public static int c(int i, byte[] bArr, int i2, int i3, p0l p0lVar, usk uskVar) throws zzlk {
        if ((i >>> 3) == 0) {
            throw new zzlk("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iK = k(bArr, i2, uskVar);
            p0lVar.c(i, Long.valueOf(uskVar.b));
            return iK;
        }
        if (i4 == 1) {
            p0lVar.c(i, Long.valueOf(l(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iJ = j(bArr, i2, uskVar);
            int i5 = uskVar.a;
            if (i5 < 0) {
                throw zzlk.b();
            }
            if (i5 > bArr.length - iJ) {
                throw zzlk.d();
            }
            if (i5 == 0) {
                p0lVar.c(i, suk.G);
            } else {
                p0lVar.c(i, suk.e(bArr, iJ, i5));
            }
            return iJ + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzlk("Protocol message contained an invalid tag (zero).");
            }
            p0lVar.c(i, Integer.valueOf(i(bArr, i2)));
            return i2 + 4;
        }
        p0l p0lVarE = p0l.e();
        int i6 = (i & (-8)) | 4;
        int i7 = uskVar.d + 1;
        uskVar.d = i7;
        if (i7 >= 100) {
            throw new zzlk("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iJ2 = j(bArr, i2, uskVar);
            int i9 = uskVar.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iJ2;
                break;
            }
            i2 = c(i9, bArr, iJ2, i3, p0lVarE, uskVar);
            i8 = i9;
        }
        uskVar.d--;
        if (i2 > i3 || i8 != i6) {
            throw zzlk.c();
        }
        p0lVar.c(i, p0lVarE);
        return i2;
    }

    public static int d(int i, byte[] bArr, int i2, usk uskVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            uskVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            uskVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            uskVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            uskVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                uskVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int e(Object obj, b0l b0lVar, byte[] bArr, int i, int i2, int i3, usk uskVar) throws zzlk {
        p0 p0Var = (p0) b0lVar;
        int i4 = uskVar.d + 1;
        uskVar.d = i4;
        if (i4 >= 100) {
            throw new zzlk("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iJ = p0Var.j(obj, bArr, i, i2, i3, uskVar);
        uskVar.d--;
        uskVar.c = obj;
        return iJ;
    }

    public static int f(Object obj, b0l b0lVar, byte[] bArr, int i, int i2, usk uskVar) throws zzlk {
        int iD = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iD = d(i3, bArr, iD, uskVar);
            i3 = uskVar.a;
        }
        int i4 = iD;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzlk.d();
        }
        int i5 = uskVar.d + 1;
        uskVar.d = i5;
        if (i5 >= 100) {
            throw new zzlk("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i4 + i3;
        b0lVar.b(obj, bArr, i4, i6, uskVar);
        uskVar.d--;
        uskVar.c = obj;
        return i6;
    }

    public static int g(byte[] bArr, int i, usk uskVar) throws zzlk {
        int iJ = j(bArr, i, uskVar);
        int i2 = uskVar.a;
        if (i2 < 0) {
            throw zzlk.b();
        }
        if (i2 > bArr.length - iJ) {
            throw zzlk.d();
        }
        if (i2 == 0) {
            uskVar.c = suk.G;
            return iJ;
        }
        uskVar.c = suk.e(bArr, iJ, i2);
        return iJ + i2;
    }

    public static int h(b0l b0lVar, int i, byte[] bArr, int i2, int i3, dyk dykVar, usk uskVar) throws zzlk {
        n0 n0VarZza = b0lVar.zza();
        b0l b0lVar2 = b0lVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        usk uskVar2 = uskVar;
        int iF = f(n0VarZza, b0lVar2, bArr2, i2, i4, uskVar2);
        b0lVar2.c(n0VarZza);
        uskVar2.c = n0VarZza;
        dykVar.add(n0VarZza);
        while (iF < i4) {
            usk uskVar3 = uskVar2;
            int i5 = i4;
            int iJ = j(bArr2, iF, uskVar3);
            if (i != uskVar3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            b0l b0lVar3 = b0lVar2;
            n0 n0VarZza2 = b0lVar3.zza();
            iF = f(n0VarZza2, b0lVar3, bArr3, iJ, i5, uskVar3);
            b0lVar2 = b0lVar3;
            bArr2 = bArr3;
            i4 = i5;
            uskVar2 = uskVar3;
            b0lVar2.c(n0VarZza2);
            uskVar2.c = n0VarZza2;
            dykVar.add(n0VarZza2);
        }
        return iF;
    }

    public static int i(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int j(byte[] bArr, int i, usk uskVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return d(b, bArr, i2, uskVar);
        }
        uskVar.a = b;
        return i2;
    }

    public static int k(byte[] bArr, int i, usk uskVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            uskVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        uskVar.b = j2;
        return i3;
    }

    public static long l(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
