package defpackage;

import io.sentry.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class kzc extends jzc {
    public final hzc I;
    public Object J;
    public boolean K;
    public int L;

    /* JADX WARN: Illegal instructions before constructor call */
    public kzc(hzc hzcVar) {
        Object obj = hzcVar.F;
        myc mycVar = hzcVar.H;
        super(obj, mycVar, 0);
        this.I = hzcVar;
        this.L = mycVar.I;
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
        hzc hzcVar = this.I;
        nai.j(hzcVar).remove(obj);
        this.J = null;
        this.K = false;
        this.L = hzcVar.H.I;
        this.H--;
    }
}
