package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class l7d extends mqh {
    public static final /* synthetic */ int k = 0;
    public final int b;
    public final m5g c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;
    public final mqh[] h;
    public final Object[] i;
    public final HashMap j;

    public l7d(mqh[] mqhVarArr, Object[] objArr, m5g m5gVar) {
        this.c = m5gVar;
        this.b = m5gVar.b.length;
        int length = mqhVarArr.length;
        this.h = mqhVarArr;
        this.f = new int[length];
        this.g = new int[length];
        this.i = objArr;
        this.j = new HashMap();
        int length2 = mqhVarArr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i2 = 0;
        while (i < length2) {
            mqh mqhVar = mqhVarArr[i];
            this.h[i2] = mqhVar;
            this.g[i2] = iO;
            this.f[i2] = iH;
            iO += mqhVar.o();
            iH += this.h[i2].h();
            this.j.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.d = iO;
        this.e = iH;
    }

    @Override // defpackage.mqh
    public final int a(boolean z) {
        if (this.b != 0) {
            int iQ = 0;
            if (z) {
                int[] iArr = this.c.b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                mqh[] mqhVarArr = this.h;
                if (!mqhVarArr[iQ].p()) {
                    return mqhVarArr[iQ].a(z) + this.g[iQ];
                }
                iQ = q(iQ, z);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // defpackage.mqh
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.h[iIntValue].b(obj3)) != -1) {
                return this.f[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // defpackage.mqh
    public final int c(boolean z) {
        int iR;
        int i = this.b;
        if (i != 0) {
            if (z) {
                int[] iArr = this.c.b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i - 1;
            }
            do {
                mqh[] mqhVarArr = this.h;
                if (!mqhVarArr[iR].p()) {
                    return mqhVarArr[iR].c(z) + this.g[iR];
                }
                iR = r(iR, z);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // defpackage.mqh
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int iC = tpi.c(iArr, i + 1, false, false);
        int i3 = iArr[iC];
        mqh[] mqhVarArr = this.h;
        int iE = mqhVarArr[iC].e(i - i3, i2 != 2 ? i2 : 0, z);
        if (iE != -1) {
            return i3 + iE;
        }
        int iQ = q(iC, z);
        while (iQ != -1 && mqhVarArr[iQ].p()) {
            iQ = q(iQ, z);
        }
        if (iQ != -1) {
            return mqhVarArr[iQ].a(z) + iArr[iQ];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.mqh
    public final jqh f(int i, jqh jqhVar, boolean z) {
        int[] iArr = this.f;
        int iC = tpi.c(iArr, i + 1, false, false);
        int i2 = this.g[iC];
        this.h[iC].f(i - iArr[iC], jqhVar, z);
        jqhVar.c += i2;
        if (z) {
            Object obj = this.i[iC];
            Object obj2 = jqhVar.b;
            obj2.getClass();
            jqhVar.b = Pair.create(obj, obj2);
        }
        return jqhVar;
    }

    @Override // defpackage.mqh
    public final jqh g(Object obj, jqh jqhVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.g[iIntValue];
        this.h[iIntValue].g(obj3, jqhVar);
        jqhVar.c += i;
        jqhVar.b = obj;
        return jqhVar;
    }

    @Override // defpackage.mqh
    public final int h() {
        return this.e;
    }

    @Override // defpackage.mqh
    public final int k(int i, int i2) {
        int[] iArr = this.g;
        int iC = tpi.c(iArr, i + 1, false, false);
        int i3 = iArr[iC];
        mqh[] mqhVarArr = this.h;
        int iK = mqhVarArr[iC].k(i - i3, i2 == 2 ? 0 : i2);
        if (iK != -1) {
            return i3 + iK;
        }
        int iR = r(iC, false);
        while (iR != -1 && mqhVarArr[iR].p()) {
            iR = r(iR, false);
        }
        if (iR != -1) {
            return mqhVarArr[iR].c(false) + iArr[iR];
        }
        if (i2 == 2) {
            return c(false);
        }
        return -1;
    }

    @Override // defpackage.mqh
    public final Object l(int i) {
        int[] iArr = this.f;
        int iC = tpi.c(iArr, i + 1, false, false);
        return Pair.create(this.i[iC], this.h[iC].l(i - iArr[iC]));
    }

    @Override // defpackage.mqh
    public final kqh m(int i, kqh kqhVar, long j) {
        int[] iArr = this.g;
        int iC = tpi.c(iArr, i + 1, false, false);
        int i2 = iArr[iC];
        int i3 = this.f[iC];
        this.h[iC].m(i - i2, kqhVar, j);
        Object objCreate = this.i[iC];
        Object obj = kqh.o;
        Object obj2 = kqhVar.a;
        if (obj != obj2) {
            objCreate = Pair.create(objCreate, obj2);
        }
        kqhVar.a = objCreate;
        kqhVar.l += i3;
        kqhVar.m += i3;
        return kqhVar;
    }

    @Override // defpackage.mqh
    public final int o() {
        return this.d;
    }

    public final int q(int i, boolean z) {
        if (!z) {
            if (i < this.b - 1) {
                return i + 1;
            }
            return -1;
        }
        m5g m5gVar = this.c;
        int i2 = m5gVar.c[i] + 1;
        int[] iArr = m5gVar.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int r(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        m5g m5gVar = this.c;
        int i2 = m5gVar.c[i] - 1;
        if (i2 >= 0) {
            return m5gVar.b[i2];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l7d(ArrayList arrayList, m5g m5gVar) {
        mqh[] mqhVarArr = new mqh[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            mqhVarArr[i2] = ((g8b) it.next()).b();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((g8b) it2.next()).a();
            i++;
        }
        this(mqhVarArr, objArr, m5gVar);
    }
}
