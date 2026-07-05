package defpackage;

import io.sentry.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class tzc extends k2 {
    public final pzc G;
    public int H;
    public v6i I;
    public int J;

    public tzc(pzc pzcVar, int i) {
        super(i, pzcVar.size());
        this.G = pzcVar;
        this.H = pzcVar.g();
        this.J = -1;
        c();
    }

    public final void a() {
        if (this.H == this.G.g()) {
            return;
        }
        sz6.c();
    }

    @Override // defpackage.k2, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.E;
        pzc pzcVar = this.G;
        pzcVar.add(i, obj);
        this.E++;
        this.F = pzcVar.size();
        this.H = pzcVar.g();
        this.J = -1;
        c();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void c() {
        pzc pzcVar = this.G;
        Object[] objArr = pzcVar.J;
        if (objArr == null) {
            this.I = null;
            return;
        }
        int size = (pzcVar.size() - 1) & (-32);
        int i = this.E;
        if (i > size) {
            i = size;
        }
        int i2 = (pzcVar.H / 5) + 1;
        v6i v6iVar = this.I;
        if (v6iVar == null) {
            this.I = new v6i(objArr, i, size, i2);
            return;
        }
        v6iVar.E = i;
        v6iVar.F = size;
        v6iVar.G = i2;
        if (v6iVar.H.length < i2) {
            v6iVar.H = new Object[i2];
        }
        v6iVar.H[0] = objArr;
        ?? r0 = i == size ? 1 : 0;
        v6iVar.I = r0;
        v6iVar.c(i - r0, 1);
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
        v6i v6iVar = this.I;
        pzc pzcVar = this.G;
        if (v6iVar == null) {
            Object[] objArr = pzcVar.K;
            this.E = i + 1;
            return objArr[i];
        }
        if (v6iVar.hasNext()) {
            this.E++;
            return v6iVar.next();
        }
        Object[] objArr2 = pzcVar.K;
        int i2 = this.E;
        this.E = i2 + 1;
        return objArr2[i2 - v6iVar.F];
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
        v6i v6iVar = this.I;
        pzc pzcVar = this.G;
        if (v6iVar == null) {
            Object[] objArr = pzcVar.K;
            int i2 = i - 1;
            this.E = i2;
            return objArr[i2];
        }
        int i3 = v6iVar.F;
        if (i <= i3) {
            this.E = i - 1;
            return v6iVar.previous();
        }
        Object[] objArr2 = pzcVar.K;
        int i4 = i - 1;
        this.E = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.k2, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.J;
        if (i == -1) {
            e0.b();
            return;
        }
        pzc pzcVar = this.G;
        pzcVar.remove(i);
        int i2 = this.J;
        if (i2 < this.E) {
            this.E = i2;
        }
        this.F = pzcVar.size();
        this.H = pzcVar.g();
        this.J = -1;
        c();
    }

    @Override // defpackage.k2, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.J;
        if (i == -1) {
            e0.b();
            return;
        }
        pzc pzcVar = this.G;
        pzcVar.set(i, obj);
        this.H = pzcVar.g();
        c();
    }
}
