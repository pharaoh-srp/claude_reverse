package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class jqa implements Iterator, mm9 {
    public final lqa E;
    public int F;
    public int G;
    public int H;
    public final /* synthetic */ int I;

    public jqa(lqa lqaVar, int i) {
        this.I = i;
        lqaVar.getClass();
        this.E = lqaVar;
        this.G = -1;
        this.H = lqaVar.L;
        c();
    }

    public final void a() {
        if (this.E.L == this.H) {
            return;
        }
        sz6.c();
    }

    public final void c() {
        while (true) {
            int i = this.F;
            lqa lqaVar = this.E;
            if (i >= lqaVar.J || lqaVar.G[i] >= 0) {
                return;
            } else {
                this.F = i + 1;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.F < this.E.J;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.I;
        lqa lqaVar = this.E;
        switch (i) {
            case 0:
                a();
                int i2 = this.F;
                if (i2 >= lqaVar.J) {
                    pmf.d();
                } else {
                    this.F = i2 + 1;
                    this.G = i2;
                    kqa kqaVar = new kqa(lqaVar, i2);
                    c();
                }
                break;
            case 1:
                a();
                int i3 = this.F;
                if (i3 >= lqaVar.J) {
                    pmf.d();
                } else {
                    this.F = i3 + 1;
                    this.G = i3;
                    Object obj = lqaVar.E[i3];
                    c();
                }
                break;
            default:
                a();
                int i4 = this.F;
                if (i4 >= lqaVar.J) {
                    pmf.d();
                } else {
                    this.F = i4 + 1;
                    this.G = i4;
                    Object[] objArr = lqaVar.F;
                    objArr.getClass();
                    Object obj2 = objArr[this.G];
                    c();
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        if (this.G == -1) {
            sz6.j("Call next() before removing element from the iterator.");
            return;
        }
        lqa lqaVar = this.E;
        lqaVar.d();
        lqaVar.l(this.G);
        this.G = -1;
        this.H = lqaVar.L;
    }
}
