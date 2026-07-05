package defpackage;

import io.sentry.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class szc extends j2 {
    public final ozc G;
    public int H;
    public u6i I;
    public int J;

    public szc(ozc ozcVar, int i) {
        super(i, ozcVar.size());
        this.G = ozcVar;
        this.H = ozcVar.g();
        this.J = -1;
        c();
    }

    public final void a() {
        if (this.H == this.G.g()) {
            return;
        }
        sz6.c();
    }

    @Override // defpackage.j2, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.E;
        ozc ozcVar = this.G;
        ozcVar.add(i, obj);
        this.E++;
        this.F = ozcVar.size();
        this.H = ozcVar.g();
        this.J = -1;
        c();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void c() {
        ozc ozcVar = this.G;
        Object[] objArr = ozcVar.H;
        if (objArr == null) {
            this.I = null;
            return;
        }
        int size = (ozcVar.size() - 1) & (-32);
        int i = this.E;
        if (i > size) {
            i = size;
        }
        int i2 = (ozcVar.E / 5) + 1;
        u6i u6iVar = this.I;
        if (u6iVar == null) {
            this.I = new u6i(objArr, i, size, i2);
            return;
        }
        u6iVar.E = i;
        u6iVar.F = size;
        u6iVar.G = i2;
        if (u6iVar.H.length < i2) {
            u6iVar.H = new Object[i2];
        }
        u6iVar.H[0] = objArr;
        ?? r0 = i == size ? 1 : 0;
        u6iVar.I = r0;
        u6iVar.c(i - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            pmf.d();
            return null;
        }
        int i = this.E;
        this.J = i;
        u6i u6iVar = this.I;
        ozc ozcVar = this.G;
        if (u6iVar == null) {
            Object[] objArr = ozcVar.I;
            this.E = i + 1;
            return objArr[i];
        }
        if (u6iVar.hasNext()) {
            this.E++;
            return u6iVar.next();
        }
        Object[] objArr2 = ozcVar.I;
        int i2 = this.E;
        this.E = i2 + 1;
        return objArr2[i2 - u6iVar.F];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            pmf.d();
            return null;
        }
        int i = this.E;
        this.J = i - 1;
        u6i u6iVar = this.I;
        ozc ozcVar = this.G;
        if (u6iVar == null) {
            Object[] objArr = ozcVar.I;
            int i2 = i - 1;
            this.E = i2;
            return objArr[i2];
        }
        int i3 = u6iVar.F;
        if (i <= i3) {
            this.E = i - 1;
            return u6iVar.previous();
        }
        Object[] objArr2 = ozcVar.I;
        int i4 = i - 1;
        this.E = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.j2, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.J;
        if (i == -1) {
            e0.b();
            return;
        }
        ozc ozcVar = this.G;
        ozcVar.remove(i);
        int i2 = this.J;
        if (i2 < this.E) {
            this.E = i2;
        }
        this.F = ozcVar.size();
        this.H = ozcVar.g();
        this.J = -1;
        c();
    }

    @Override // defpackage.j2, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.J;
        if (i == -1) {
            e0.b();
            return;
        }
        ozc ozcVar = this.G;
        ozcVar.set(i, obj);
        this.H = ozcVar.g();
        c();
    }
}
