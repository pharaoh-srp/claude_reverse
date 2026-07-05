package defpackage;

import android.os.Build;
import android.util.SparseArray;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class u31 {
    public static final vde e;
    public static final u31 f;
    public static final vde g;
    public static final aee h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final nz8 c;
    public final nz8 d;

    static {
        vde vdeVarU = nz8.u(12);
        e = vdeVarU;
        f = new u31(nz8.u(t31.d), vdeVarU, vde.I);
        Object[] objArr = {2, 5, 6};
        bvk.e(3, objArr);
        g = nz8.m(3, objArr);
        s20 s20Var = new s20(4);
        s20Var.l(5, 6);
        s20Var.l(17, 6);
        s20Var.l(7, 6);
        s20Var.l(30, 10);
        s20Var.l(18, 6);
        s20Var.l(6, 8);
        s20Var.l(8, 8);
        s20Var.l(14, 8);
        h = s20Var.d(true);
    }

    public u31(vde vdeVar, nz8 nz8Var, List list) {
        for (int i = 0; i < vdeVar.H; i++) {
            t31 t31Var = (t31) vdeVar.get(i);
            this.a.put(t31Var.a, t31Var);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            iMax = Math.max(iMax, ((t31) this.a.valueAt(i2)).b);
        }
        this.b = iMax;
        this.c = nz8.q(nz8Var);
        this.d = nz8.q(list);
    }

    public static vde a(int i, int[] iArr) {
        hz8 hz8VarO = nz8.o();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            hz8VarO.b(new t31(i2, i));
        }
        return hz8VarO.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c3 A[PHI: r2 r18
      0x01c3: PHI (r2v23 nz8) = (r2v22 nz8), (r2v24 nz8), (r2v27 nz8) binds: [B:142:0x01ef, B:130:0x01cf, B:126:0x01c1] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r18v3 int) = (r18v2 int), (r18v5 int), (r18v7 int) binds: [B:142:0x01ef, B:130:0x01cf, B:126:0x01c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.u31 b(android.content.Context r20, android.content.Intent r21, defpackage.p31 r22, android.media.AudioDeviceInfo r23, java.util.List r24) {
        /*
            Method dump skipped, instruction units count: 1019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u31.b(android.content.Context, android.content.Intent, p31, android.media.AudioDeviceInfo, java.util.List):u31");
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair c(defpackage.jw7 r14, defpackage.p31 r15) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u31.c(jw7, p31):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this != obj) {
            if (obj instanceof u31) {
                u31 u31Var = (u31) obj;
                SparseArray sparseArray = u31Var.a;
                String str = tpi.a;
                SparseArray sparseArray2 = this.a;
                if (sparseArray2 != null) {
                    if (sparseArray != null) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            zContentEquals = sparseArray2.contentEquals(sparseArray);
                        } else {
                            int size = sparseArray2.size();
                            if (size == sparseArray.size()) {
                                for (int i = 0; i < size; i++) {
                                    if (Objects.equals(sparseArray2.valueAt(i), sparseArray.get(sparseArray2.keyAt(i)))) {
                                    }
                                }
                                zContentEquals = true;
                            }
                        }
                    }
                    zContentEquals = false;
                    break;
                } else {
                    if (sparseArray != null) {
                        zContentEquals = false;
                        break;
                    }
                    zContentEquals = true;
                }
                if (!zContentEquals || this.b != u31Var.b || !Objects.equals(this.c, u31Var.c) || !Objects.equals(this.d, u31Var.d)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.b * 31;
        String str = tpi.a;
        int i2 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.a;
        if (i2 >= 31) {
            iHashCode = sparseArray.contentHashCode();
        } else {
            iHashCode = 17;
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i3)) + ((sparseArray.keyAt(i3) + (iHashCode * 31)) * 31);
            }
        }
        return Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((i + iHashCode) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
