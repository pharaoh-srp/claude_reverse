package defpackage;

import android.util.Pair;
import io.sentry.e0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mqh {
    public static final iqh a = new iqh();

    static {
        tpi.w(0);
        tpi.w(1);
        tpi.w(2);
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, jqh jqhVar, kqh kqhVar, int i2, boolean z) {
        int i3 = f(i, jqhVar, false).c;
        if (m(i3, kqhVar, 0L).m != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return m(iE, kqhVar, 0L).l;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        e0.b();
        return 0;
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof mqh) {
                mqh mqhVar = (mqh) obj;
                if (mqhVar.o() == o() && mqhVar.h() == h()) {
                    kqh kqhVar = new kqh();
                    jqh jqhVar = new jqh();
                    kqh kqhVar2 = new kqh();
                    jqh jqhVar2 = new jqh();
                    int i = 0;
                    while (true) {
                        if (i >= o()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= h()) {
                                    int iA = a(true);
                                    if (iA == mqhVar.a(true) && (iC = c(true)) == mqhVar.c(true)) {
                                        while (iA != iC) {
                                            int iE = e(iA, 0, true);
                                            if (iE == mqhVar.e(iA, 0, true)) {
                                                iA = iE;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i2, jqhVar, true).equals(mqhVar.f(i2, jqhVar2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!m(i, kqhVar, 0L).equals(mqhVar.m(i, kqhVar2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract jqh f(int i, jqh jqhVar, boolean z);

    public jqh g(Object obj, jqh jqhVar) {
        return f(b(obj), jqhVar, true);
    }

    public abstract int h();

    public int hashCode() {
        kqh kqhVar = new kqh();
        jqh jqhVar = new jqh();
        int iO = o() + 217;
        for (int i = 0; i < o(); i++) {
            iO = (iO * 31) + m(i, kqhVar, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            iH = (iH * 31) + f(i2, jqhVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(kqh kqhVar, jqh jqhVar, int i, long j) {
        Pair pairJ = j(kqhVar, jqhVar, i, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(kqh kqhVar, jqh jqhVar, int i, long j, long j2) {
        fd9.G(i, o());
        m(i, kqhVar, j2);
        if (j == -9223372036854775807L) {
            j = kqhVar.j;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = kqhVar.l;
        f(i2, jqhVar, false);
        while (i2 < kqhVar.m && jqhVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, jqhVar, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, jqhVar, true);
        long jMin = j - jqhVar.e;
        long j3 = jqhVar.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = jqhVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i, int i2) {
        if (i2 == 0) {
            if (i == a(false)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(false) ? c(false) : i - 1;
        }
        e0.b();
        return 0;
    }

    public abstract Object l(int i);

    public abstract kqh m(int i, kqh kqhVar, long j);

    public final void n(int i, kqh kqhVar) {
        m(i, kqhVar, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
