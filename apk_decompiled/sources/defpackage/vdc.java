package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class vdc {
    public final Runnable a;
    public final u0h b = new u0h(new dg8(18, this));

    public vdc(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(m4a m4aVar, qdc qdcVar) {
        qdcVar.getClass();
        final c4a c4aVarA = m4aVar.a();
        if (c4aVarA.b() == a4a.E) {
            return;
        }
        pdc pdcVar = new pdc(qdcVar, new rdc(m4aVar, qdcVar));
        qdcVar.a.add(pdcVar);
        pdcVar.g(false);
        dpf.t(b().c, pdcVar);
        final bs5 bs5Var = new bs5(pdcVar, this, c4aVarA);
        c4aVarA.a(bs5Var);
        qdcVar.c.add(new AutoCloseable() { // from class: sdc
            @Override // java.lang.AutoCloseable
            public final void close() {
                c4aVarA.c(bs5Var);
            }
        });
    }

    public final tdc b() {
        return (tdc) this.b.getValue();
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        b().c.v(new mdc(onBackInvokedDispatcher, 0), 1);
        b().c.v(new mdc(onBackInvokedDispatcher, 1000000), 0);
    }
}
