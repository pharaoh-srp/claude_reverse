package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class r6a implements Iterator {
    public final String E;
    public final q6a F;
    public int G = 0;
    public a7a H = null;

    public r6a(String str, q6a q6aVar) {
        this.E = str;
        this.F = q6aVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.G < this.E.length();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            pmf.d();
            return null;
        }
        if (this.H == null) {
            q6a q6aVar = this.F;
            if (!q6aVar.hasNext()) {
                int length = this.E.length();
                l42 l42Var = new l42(this.G, length, 4);
                this.G = length;
                return l42Var;
            }
            if (!q6aVar.hasNext()) {
                pmf.d();
                return null;
            }
            a7a a7aVar = q6aVar.F;
            q6aVar.F = null;
            this.H = a7aVar;
        }
        int i = this.G;
        a7a a7aVar2 = this.H;
        int i2 = a7aVar2.b;
        if (i < i2) {
            l42 l42Var2 = new l42(i, i2, 4);
            this.G = i2;
            return l42Var2;
        }
        this.G = a7aVar2.c;
        this.H = null;
        return a7aVar2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
