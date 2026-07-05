package defpackage;

import io.sentry.e0;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class lve extends l22 {
    public static final int[] L;
    public final int F;
    public final l22 G;
    public final l22 H;
    public final int I;
    public final int J;
    public int K = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        L = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = L;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public lve(l22 l22Var, l22 l22Var2) {
        this.G = l22Var;
        this.H = l22Var2;
        int size = l22Var.size();
        this.I = size;
        this.F = l22Var2.size() + size;
        this.J = Math.max(l22Var.h(), l22Var2.h()) + 1;
    }

    public final boolean equals(Object obj) {
        int iQ;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l22) {
            l22 l22Var = (l22) obj;
            int size = l22Var.size();
            int i = this.F;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.K == 0 || (iQ = l22Var.q()) == 0 || this.K == iQ) {
                    a6c a6cVar = new a6c(this);
                    oba obaVar = (oba) a6cVar.next();
                    a6c a6cVar2 = new a6c(l22Var);
                    oba obaVar2 = (oba) a6cVar2.next();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int length = obaVar.F.length - i2;
                        int length2 = obaVar2.F.length - i3;
                        int iMin = Math.min(length, length2);
                        if (!(i2 == 0 ? obaVar.u(obaVar2, i3, iMin) : obaVar2.u(obaVar, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            e0.b();
                            return false;
                        }
                        if (iMin == length) {
                            obaVar = (oba) a6cVar.next();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == length2) {
                            obaVar2 = (oba) a6cVar2.next();
                            i3 = 0;
                        } else {
                            i3 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.l22
    public final void g(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i3;
        l22 l22Var = this.G;
        int i5 = this.I;
        if (i4 <= i5) {
            l22Var.g(i, i2, i3, bArr);
            return;
        }
        l22 l22Var2 = this.H;
        if (i >= i5) {
            l22Var2.g(i - i5, i2, i3, bArr);
            return;
        }
        int i6 = i5 - i;
        l22Var.g(i, i2, i6, bArr);
        l22Var2.g(0, i2 + i6, i3 - i6, bArr);
    }

    @Override // defpackage.l22
    public final int h() {
        return this.J;
    }

    public final int hashCode() {
        int iO = this.K;
        if (iO == 0) {
            int i = this.F;
            iO = o(i, 0, i);
            if (iO == 0) {
                iO = 1;
            }
            this.K = iO;
        }
        return iO;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new kve(this);
    }

    @Override // defpackage.l22
    public final boolean k() {
        return this.F >= L[this.J];
    }

    @Override // defpackage.l22
    public final boolean l() {
        int iP = this.G.p(0, 0, this.I);
        l22 l22Var = this.H;
        return l22Var.p(iP, 0, l22Var.size()) == 0;
    }

    @Override // defpackage.l22
    public final int o(int i, int i2, int i3) {
        int i4 = i2 + i3;
        l22 l22Var = this.G;
        int i5 = this.I;
        if (i4 <= i5) {
            return l22Var.o(i, i2, i3);
        }
        l22 l22Var2 = this.H;
        if (i2 >= i5) {
            return l22Var2.o(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return l22Var2.o(l22Var.o(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.l22
    public final int p(int i, int i2, int i3) {
        int i4 = i2 + i3;
        l22 l22Var = this.G;
        int i5 = this.I;
        if (i4 <= i5) {
            return l22Var.p(i, i2, i3);
        }
        l22 l22Var2 = this.H;
        if (i2 >= i5) {
            return l22Var2.p(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return l22Var2.p(l22Var.p(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.l22
    public final int q() {
        return this.K;
    }

    @Override // defpackage.l22
    public final String r() {
        byte[] bArr;
        int i = this.F;
        if (i == 0) {
            bArr = v89.a;
        } else {
            byte[] bArr2 = new byte[i];
            g(0, 0, i, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // defpackage.l22
    public final int size() {
        return this.F;
    }

    @Override // defpackage.l22
    public final void t(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        l22 l22Var = this.G;
        int i4 = this.I;
        if (i3 <= i4) {
            l22Var.t(outputStream, i, i2);
            return;
        }
        l22 l22Var2 = this.H;
        if (i >= i4) {
            l22Var2.t(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        l22Var.t(outputStream, i, i5);
        l22Var2.t(outputStream, 0, i2 - i5);
    }
}
