package defpackage;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pwa implements vef {
    public final uf3 a;
    public final SparseArray b;
    public final long c;
    public final int d;

    public pwa(SparseArray sparseArray, long j, int i, long j2, long j3) {
        uf3 uf3Var;
        int i2;
        this.b = sparseArray;
        this.c = j;
        this.d = i;
        List list = (List) sparseArray.get(i);
        if (list == null || list.isEmpty()) {
            uf3Var = null;
        } else {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                owa owaVar = (owa) list.get(i4);
                jArrCopyOf3[i4] = owaVar.E;
                jArrCopyOf[i4] = owaVar.F;
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArrCopyOf[i3] = (int) (jArrCopyOf[i5] - jArrCopyOf[i3]);
                jArrCopyOf2[i3] = jArrCopyOf3[i5] - jArrCopyOf3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArrCopyOf3[i6] >= j) {
                i6--;
            }
            iArrCopyOf[i6] = (int) ((j2 + j3) - jArrCopyOf[i6]);
            jArrCopyOf2[i6] = j - jArrCopyOf3[i6];
            if (i6 < i2) {
                ysj.u("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i7);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i7);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i7);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i7);
            }
            uf3Var = new uf3(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.a = uf3Var;
    }

    @Override // defpackage.vef
    public final boolean b() {
        List list = (List) this.b.get(this.d);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // defpackage.vef
    public final uef e(long j) {
        uf3 uf3Var = this.a;
        if (uf3Var != null) {
            return uf3Var.e(j);
        }
        xef xefVar = xef.c;
        return new uef(xefVar, xefVar);
    }

    @Override // defpackage.vef
    public final long g() {
        return this.c;
    }
}
