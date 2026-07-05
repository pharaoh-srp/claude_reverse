package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class lyc implements Iterator, mm9 {
    public final z6i[] E;
    public int F;
    public boolean G = true;

    public lyc(x6i x6iVar, z6i[] z6iVarArr) {
        this.E = z6iVarArr;
        z6iVarArr[0].a(x6iVar.d, Integer.bitCount(x6iVar.a) * 2, 0);
        this.F = 0;
        a();
    }

    public final void a() {
        int i = this.F;
        z6i[] z6iVarArr = this.E;
        z6i z6iVar = z6iVarArr[i];
        if (z6iVar.G < z6iVar.F) {
            return;
        }
        while (-1 < i) {
            int iC = c(i);
            if (iC == -1) {
                z6i z6iVar2 = z6iVarArr[i];
                int i2 = z6iVar2.G;
                Object[] objArr = z6iVar2.E;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    z6iVar2.G = i2 + 1;
                    iC = c(i);
                }
            }
            if (iC != -1) {
                this.F = iC;
                return;
            }
            if (i > 0) {
                z6i z6iVar3 = z6iVarArr[i - 1];
                int i3 = z6iVar3.G;
                int length2 = z6iVar3.E.length;
                z6iVar3.G = i3 + 1;
            }
            z6iVarArr[i].a(x6i.e.d, 0, 0);
            i--;
        }
        this.G = false;
    }

    public final int c(int i) {
        z6i[] z6iVarArr = this.E;
        z6i z6iVar = z6iVarArr[i];
        int i2 = z6iVar.G;
        if (i2 < z6iVar.F) {
            return i;
        }
        Object[] objArr = z6iVar.E;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        x6i x6iVar = (x6i) obj;
        if (i == 6) {
            z6i z6iVar2 = z6iVarArr[i + 1];
            Object[] objArr2 = x6iVar.d;
            z6iVar2.a(objArr2, objArr2.length, 0);
        } else {
            z6iVarArr[i + 1].a(x6iVar.d, Integer.bitCount(x6iVar.a) * 2, 0);
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
