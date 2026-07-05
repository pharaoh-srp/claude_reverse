package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p8i implements wd7 {
    public final int a;
    public final List b;
    public final ssc c = new ssc(new byte[9400], 0);
    public final SparseIntArray d;
    public final ig2 e;
    public final bxg f;
    public final SparseArray g;
    public final SparseBooleanArray h;
    public final SparseBooleanArray i;
    public final nvd j;
    public vm7 k;
    public yd7 l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;

    public p8i(int i, bxg bxgVar, frh frhVar, ig2 ig2Var) {
        this.e = ig2Var;
        this.a = i;
        this.f = bxgVar;
        this.b = Collections.singletonList(frhVar);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.h = sparseBooleanArray;
        this.i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        this.d = new SparseIntArray();
        this.j = new nvd(1);
        this.l = yd7.j;
        this.q = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.put(sparseArray2.keyAt(i2), (r8i) sparseArray2.valueAt(i2));
        }
        sparseArray.put(0, new ref(new mvd(this)));
    }

    @Override // defpackage.wd7
    public final void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [r8i] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // defpackage.wd7
    public final int b(xd7 xd7Var, xm7 xm7Var) {
        xd7 xd7Var2;
        int i;
        ?? r1;
        boolean z;
        long jK;
        long length = xd7Var.getLength();
        if (this.n) {
            long j = -9223372036854775807L;
            nvd nvdVar = this.j;
            if (length != -1 && !nvdVar.d) {
                int i2 = this.q;
                frh frhVar = nvdVar.b;
                ssc sscVar = nvdVar.c;
                if (i2 <= 0) {
                    nvdVar.a(xd7Var);
                    return 0;
                }
                if (nvdVar.f) {
                    if (nvdVar.h == -9223372036854775807L) {
                        nvdVar.a(xd7Var);
                        return 0;
                    }
                    if (nvdVar.e) {
                        long j2 = nvdVar.g;
                        if (j2 == -9223372036854775807L) {
                            nvdVar.a(xd7Var);
                            return 0;
                        }
                        nvdVar.i = frhVar.c(nvdVar.h) - frhVar.b(j2);
                        nvdVar.a(xd7Var);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800L, xd7Var.getLength());
                    if (xd7Var.getPosition() != 0) {
                        xm7Var.a = 0L;
                        return 1;
                    }
                    sscVar.J(iMin);
                    xd7Var.k();
                    xd7Var.p(sscVar.a, 0, iMin);
                    int i3 = sscVar.b;
                    int i4 = sscVar.c;
                    while (true) {
                        if (i3 >= i4) {
                            jK = -9223372036854775807L;
                            break;
                        }
                        if (sscVar.a[i3] == 71) {
                            jK = kvk.k(sscVar, i3, i2);
                            if (jK != -9223372036854775807L) {
                                break;
                            }
                        }
                        i3++;
                    }
                    nvdVar.g = jK;
                    nvdVar.e = true;
                    return 0;
                }
                long length2 = xd7Var.getLength();
                int iMin2 = (int) Math.min(112800L, length2);
                long j3 = length2 - ((long) iMin2);
                if (xd7Var.getPosition() != j3) {
                    xm7Var.a = j3;
                    return 1;
                }
                sscVar.J(iMin2);
                xd7Var.k();
                xd7Var.p(sscVar.a, 0, iMin2);
                int i5 = sscVar.b;
                int i6 = sscVar.c;
                int i7 = i6 - 188;
                while (true) {
                    if (i7 < i5) {
                        break;
                    }
                    byte[] bArr = sscVar.a;
                    int i8 = -4;
                    int i9 = 0;
                    while (true) {
                        if (i8 > 4) {
                            break;
                        }
                        int i10 = (i8 * 188) + i7;
                        if (i10 < i5 || i10 >= i6 || bArr[i10] != 71) {
                            i9 = 0;
                        } else {
                            i9++;
                            if (i9 == 5) {
                                long jK2 = kvk.k(sscVar, i7, i2);
                                if (jK2 != -9223372036854775807L) {
                                    j = jK2;
                                    break;
                                }
                            }
                        }
                        i8++;
                    }
                    i7--;
                }
                nvdVar.h = j;
                nvdVar.f = true;
                return 0;
            }
            if (this.o) {
                i = 1;
                z = false;
            } else {
                this.o = true;
                long j4 = nvdVar.i;
                if (j4 != -9223372036854775807L) {
                    frh frhVar2 = nvdVar.b;
                    int i11 = this.q;
                    c0l c0lVar = new c0l(24);
                    s20 s20Var = new s20();
                    s20Var.E = i11;
                    s20Var.F = frhVar2;
                    s20Var.G = new ssc();
                    i = 1;
                    z = false;
                    vm7 vm7Var = new vm7(c0lVar, s20Var, j4, j4 + 1, 0L, length, 188L, 940);
                    this.k = vm7Var;
                    this.l.q(vm7Var.a);
                } else {
                    z = false;
                    i = 1;
                    this.l.q(new z91(j4));
                }
            }
            if (this.p) {
                this.p = z;
                d(0L, 0L);
                if (xd7Var.getPosition() != 0) {
                    xm7Var.a = 0L;
                    return i;
                }
            }
            vm7 vm7Var2 = this.k;
            if (vm7Var2 != null && vm7Var2.c != null) {
                return vm7Var2.b(xd7Var, xm7Var);
            }
            xd7Var2 = xd7Var;
            r1 = z;
        } else {
            xd7Var2 = xd7Var;
            i = 1;
            r1 = 0;
        }
        ssc sscVar2 = this.c;
        byte[] bArr2 = sscVar2.a;
        if (9400 - sscVar2.b < 188) {
            int iA = sscVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, sscVar2.b, bArr2, r1, iA);
            }
            sscVar2.K(bArr2, iA);
        }
        while (true) {
            int iA2 = sscVar2.a();
            ?? r7 = this.g;
            if (iA2 >= 188) {
                int i12 = sscVar2.b;
                int i13 = sscVar2.c;
                byte[] bArr3 = sscVar2.a;
                while (i12 < i13 && bArr3[i12] != 71) {
                    i12++;
                }
                sscVar2.M(i12);
                int i14 = i12 + 188;
                int i15 = sscVar2.c;
                if (i14 > i15) {
                    return r1;
                }
                int iM = sscVar2.m();
                if ((8388608 & iM) != 0) {
                    sscVar2.M(i14);
                    return r1;
                }
                ?? r6 = (4194304 & iM) != 0 ? 1 : r1;
                int i16 = (2096896 & iM) >> 8;
                ?? r9 = (iM & 32) != 0 ? 1 : r1;
                ?? r72 = (iM & 16) != 0 ? (r8i) r7.get(i16) : 0;
                if (r72 == 0) {
                    sscVar2.M(i14);
                    return r1;
                }
                int i17 = iM & 15;
                SparseIntArray sparseIntArray = this.d;
                int i18 = sparseIntArray.get(i16, i17 - 1);
                sparseIntArray.put(i16, i17);
                if (i18 == i17) {
                    sscVar2.M(i14);
                    return r1;
                }
                if (i17 != ((i18 + 1) & 15)) {
                    r72.d();
                }
                if (r9 != 0) {
                    int iZ = sscVar2.z();
                    r6 = (r6 == true ? 1 : 0) | ((sscVar2.z() & 64) != 0 ? 2 : r1);
                    sscVar2.N(iZ - 1);
                }
                boolean z2 = this.n;
                if (z2 || !this.i.get(i16, r1)) {
                    sscVar2.L(i14);
                    r72.b(r6, sscVar2);
                    sscVar2.L(i15);
                }
                if (!z2 && this.n && length != -1) {
                    this.p = true;
                }
                sscVar2.M(i14);
                return r1;
            }
            int i19 = sscVar2.c;
            int i20 = xd7Var2.read(bArr2, i19, 9400 - i19);
            if (i20 == -1) {
                for (?? r62 = r1; r62 < r7.size(); r62++) {
                    r8i r8iVar = (r8i) r7.valueAt(r62);
                    if (r8iVar instanceof b0d) {
                        b0d b0dVar = (b0d) r8iVar;
                        if (b0dVar.c == 3 && b0dVar.j == -1) {
                            b0dVar.b(i, new ssc());
                        }
                    }
                    i = 1;
                }
                return -1;
            }
            sscVar2.L(i19 + i20);
            i = 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // defpackage.wd7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.xd7 r6) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r5 = this;
            ssc r5 = r5.c
            byte[] r5 = r5.a
            fr5 r6 = (defpackage.fr5) r6
            r0 = 0
            r1 = 940(0x3ac, float:1.317E-42)
            r6.d(r5, r0, r1, r0)
            r1 = r0
        Ld:
            r2 = 188(0xbc, float:2.63E-43)
            if (r1 >= r2) goto L29
            r2 = r0
        L12:
            r3 = 5
            if (r2 >= r3) goto L24
            int r3 = r2 * 188
            int r3 = r3 + r1
            r3 = r5[r3]
            r4 = 71
            if (r3 == r4) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r2 = r2 + 1
            goto L12
        L24:
            r6.c(r1, r0)
            r5 = 1
            return r5
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p8i.c(xd7):boolean");
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        vm7 vm7Var;
        long j3;
        SparseArray sparseArray = this.g;
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            frh frhVar = (frh) list.get(i);
            synchronized (frhVar) {
                j3 = frhVar.b;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long jD = frhVar.d();
                z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
            }
            if (z) {
                frhVar.e(j2);
            }
        }
        if (j2 != 0 && (vm7Var = this.k) != null) {
            vm7Var.d(j2);
        }
        this.c.J(0);
        this.d.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((r8i) sparseArray.valueAt(i2)).d();
        }
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        if ((this.a & 1) == 0) {
            yd7Var = new s31(yd7Var, this.f);
        }
        this.l = yd7Var;
    }
}
