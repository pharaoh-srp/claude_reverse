package defpackage;

import io.sentry.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class lzc extends jzc {
    public final izc I;
    public Object J;
    public boolean K;
    public int L;

    /* JADX WARN: Illegal instructions before constructor call */
    public lzc(izc izcVar) {
        Object obj = izcVar.F;
        nyc nycVar = izcVar.H;
        super(obj, nycVar, 1);
        this.I = izcVar;
        this.L = nycVar.I;
    }

    @Override // defpackage.jzc, java.util.Iterator
    public final Object next() {
        if (this.I.H.I != this.L) {
            sz6.c();
            return null;
        }
        Object next = super.next();
        this.J = next;
        this.K = true;
        return next;
    }

    @Override // defpackage.jzc, java.util.Iterator
    public final void remove() {
        if (!this.K) {
            e0.b();
            return;
        }
        Object obj = this.J;
        izc izcVar = this.I;
        nai.j(izcVar).remove(obj);
        this.J = null;
        this.K = false;
        this.L = izcVar.H.I;
        this.H--;
    }
}
