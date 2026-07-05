package io.sentry;

import defpackage.pmf;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator {
    public int E;
    public int F = -1;
    public boolean G;
    public final /* synthetic */ i H;

    public h(i iVar) {
        this.H = iVar;
        this.E = iVar.F;
        this.G = iVar.H;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.G || this.E != this.H.G;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            pmf.d();
            return null;
        }
        this.G = false;
        int i = this.E;
        this.F = i;
        int i2 = i + 1;
        i iVar = this.H;
        this.E = i2 < iVar.I ? i2 : 0;
        return iVar.E[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        i iVar = this.H;
        int i2 = iVar.I;
        Object[] objArr = iVar.E;
        int i3 = this.F;
        if (i3 == -1) {
            e0.b();
            return;
        }
        int i4 = iVar.F;
        if (i3 == i4) {
            iVar.remove();
            this.F = -1;
            return;
        }
        int i5 = i3 + 1;
        if (i4 >= i3 || i5 >= (i = iVar.G)) {
            while (i5 != iVar.G) {
                if (i5 >= i2) {
                    objArr[i5 - 1] = objArr[0];
                } else {
                    int i6 = i5 - 1;
                    if (i6 < 0) {
                        i6 = i2 - 1;
                    }
                    objArr[i6] = objArr[i5];
                    i5++;
                    if (i5 >= i2) {
                    }
                }
                i5 = 0;
            }
        } else {
            System.arraycopy(objArr, i5, objArr, i3, i - i5);
        }
        this.F = -1;
        int i7 = iVar.G - 1;
        if (i7 < 0) {
            i7 = i2 - 1;
        }
        iVar.G = i7;
        objArr[i7] = null;
        iVar.H = false;
        int i8 = this.E - 1;
        if (i8 < 0) {
            i8 = i2 - 1;
        }
        this.E = i8;
    }
}
