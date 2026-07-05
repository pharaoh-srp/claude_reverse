package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class wcg implements Iterable, mm9 {
    public static final wcg I = new wcg(0, 0, 0, null);
    public final long E;
    public final long F;
    public final long G;
    public final long[] H;

    public wcg(long j, long j2, long j3, long[] jArr) {
        this.E = j;
        this.F = j2;
        this.G = j3;
        this.H = jArr;
    }

    public final wcg a(wcg wcgVar) {
        long[] jArr;
        wcg wcgVarE = this;
        wcg wcgVar2 = I;
        if (wcgVar == wcgVar2) {
            return wcgVarE;
        }
        if (wcgVarE == wcgVar2) {
            return wcgVar2;
        }
        long j = wcgVar.G;
        long j2 = wcgVar.G;
        long[] jArr2 = wcgVar.H;
        long j3 = wcgVar.F;
        long j4 = wcgVar.E;
        long j5 = wcgVarE.G;
        if (j == j5 && jArr2 == (jArr = wcgVarE.H)) {
            return new wcg(wcgVarE.E & (~j4), wcgVarE.F & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                wcgVarE = wcgVarE.e(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    wcgVarE = wcgVarE.e(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    wcgVarE = wcgVarE.e(((long) i2) + j2 + 64);
                }
            }
        }
        return wcgVarE;
    }

    public final wcg e(long j) {
        long[] jArr;
        int iN;
        long[] jArr2;
        long j2 = j - this.G;
        if (x44.A(j2, 0L) >= 0 && x44.A(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.F;
            if ((j4 & j3) != 0) {
                return new wcg(this.E, j4 & (~j3), this.G, this.H);
            }
        } else if (x44.A(j2, 64L) >= 0 && x44.A(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.E;
            if ((j6 & j5) != 0) {
                return new wcg(j6 & (~j5), this.F, this.G, this.H);
            }
        } else if (x44.A(j2, 0L) < 0 && (jArr = this.H) != null && (iN = knk.n(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iN > 0) {
                    mp0.t0(jArr, jArr3, 0, 0, iN);
                }
                if (iN < i) {
                    mp0.t0(jArr, jArr3, iN, iN + 1, length);
                }
                jArr2 = jArr3;
            }
            return new wcg(this.E, this.F, this.G, jArr2);
        }
        return this;
    }

    public final boolean g(long j) {
        long[] jArr;
        long j2 = j - this.G;
        return (x44.A(j2, 0L) < 0 || x44.A(j2, 64L) >= 0) ? (x44.A(j2, 64L) < 0 || x44.A(j2, 128L) >= 0) ? x44.A(j2, 0L) <= 0 && (jArr = this.H) != null && knk.n(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.E) != 0 : ((1 << ((int) j2)) & this.F) != 0;
    }

    public final wcg h(wcg wcgVar) {
        wcg wcgVarK;
        long[] jArr;
        wcg wcgVarK2 = this;
        wcg wcgVar2 = I;
        if (wcgVar == wcgVar2) {
            return wcgVarK2;
        }
        if (wcgVarK2 == wcgVar2) {
            return wcgVar;
        }
        long j = wcgVar.G;
        long j2 = wcgVar.G;
        long[] jArr2 = wcgVar.H;
        long j3 = wcgVar.F;
        long j4 = wcgVar.E;
        long j5 = wcgVarK2.G;
        long j6 = wcgVarK2.F;
        long j7 = wcgVarK2.E;
        if (j == j5 && jArr2 == (jArr = wcgVarK2.H)) {
            return new wcg(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = wcgVarK2.H;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    wcgVarK2 = wcgVarK2.k(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        wcgVarK2 = wcgVarK2.k(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        wcgVarK2 = wcgVarK2.k(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return wcgVarK2;
        }
        if (jArr3 != null) {
            wcgVarK = wcgVar;
            for (long j9 : jArr3) {
                wcgVarK = wcgVarK.k(j9);
            }
        } else {
            wcgVarK = wcgVar;
        }
        long j10 = wcgVarK2.G;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    wcgVarK = wcgVarK.k(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    wcgVarK = wcgVarK.k(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return wcgVarK;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new pp0(1, new vcg(this, null)).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wcg k(long r30) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wcg.k(long):wcg");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(x44.y(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
