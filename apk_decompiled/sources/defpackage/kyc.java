package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kyc implements Iterator, mm9 {
    public final y6i[] E;
    public int F;
    public boolean G;

    public kyc(w6i w6iVar, y6i[] y6iVarArr) {
        w6iVar.getClass();
        this.E = y6iVarArr;
        this.G = true;
        y6i y6iVar = y6iVarArr[0];
        Object[] objArr = w6iVar.d;
        int iBitCount = Integer.bitCount(w6iVar.a) * 2;
        y6iVar.getClass();
        objArr.getClass();
        y6iVar.E = objArr;
        y6iVar.F = iBitCount;
        y6iVar.G = 0;
        this.F = 0;
        a();
    }

    public final void a() {
        int i = this.F;
        y6i[] y6iVarArr = this.E;
        y6i y6iVar = y6iVarArr[i];
        if (y6iVar.G < y6iVar.F) {
            return;
        }
        while (-1 < i) {
            int iC = c(i);
            if (iC == -1) {
                y6i y6iVar2 = y6iVarArr[i];
                int i2 = y6iVar2.G;
                Object[] objArr = y6iVar2.E;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    y6iVar2.G = i2 + 1;
                    iC = c(i);
                }
            }
            if (iC != -1) {
                this.F = iC;
                return;
            }
            if (i > 0) {
                y6i y6iVar3 = y6iVarArr[i - 1];
                int i3 = y6iVar3.G;
                int length2 = y6iVar3.E.length;
                y6iVar3.G = i3 + 1;
            }
            y6i y6iVar4 = y6iVarArr[i];
            Object[] objArr2 = w6i.e.d;
            y6iVar4.getClass();
            objArr2.getClass();
            y6iVar4.E = objArr2;
            y6iVar4.F = 0;
            y6iVar4.G = 0;
            i--;
        }
        this.G = false;
    }

    public final int c(int i) {
        y6i[] y6iVarArr = this.E;
        y6i y6iVar = y6iVarArr[i];
        int i2 = y6iVar.G;
        if (i2 < y6iVar.F) {
            return i;
        }
        Object[] objArr = y6iVar.E;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        w6i w6iVar = (w6i) obj;
        if (i == 6) {
            y6i y6iVar2 = y6iVarArr[i + 1];
            Object[] objArr2 = w6iVar.d;
            int length2 = objArr2.length;
            y6iVar2.getClass();
            y6iVar2.E = objArr2;
            y6iVar2.F = length2;
            y6iVar2.G = 0;
        } else {
            y6i y6iVar3 = y6iVarArr[i + 1];
            Object[] objArr3 = w6iVar.d;
            int iBitCount = Integer.bitCount(w6iVar.a) * 2;
            y6iVar3.getClass();
            objArr3.getClass();
            y6iVar3.E = objArr3;
            y6iVar3.F = iBitCount;
            y6iVar3.G = 0;
        }
        return c(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.G;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.G) {
            pmf.d();
            return null;
        }
        Object next = this.E[this.F].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
