package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class al6 extends kvj {
    public final /* synthetic */ bl6 e;

    public al6(bl6 bl6Var) {
        this.e = bl6Var;
    }

    @Override // defpackage.kvj
    public final void f(Throwable th) {
        this.e.a.f(th);
    }

    @Override // defpackage.kvj
    public final void g(c61 c61Var) {
        bl6 bl6Var = this.e;
        bl6Var.c = c61Var;
        c61 c61Var2 = bl6Var.c;
        gl6 gl6Var = bl6Var.a;
        bl6Var.b = new xv8(c61Var2, gl6Var.g, gl6Var.i, nvj.f());
        gl6 gl6Var2 = bl6Var.a;
        ArrayList arrayList = new ArrayList();
        gl6Var2.a.writeLock().lock();
        try {
            gl6Var2.c = 1;
            arrayList.addAll(gl6Var2.b);
            gl6Var2.b.clear();
            gl6Var2.a.writeLock().unlock();
            gl6Var2.d.post(new el6(arrayList, gl6Var2.c, null));
        } catch (Throwable th) {
            gl6Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
