package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qwc extends swc {
    public final nyj E;

    public qwc(h99 h99Var) {
        this.E = new nyj(qwc.class.getSimpleName(), h99Var);
    }

    @Override // defpackage.swc
    public final void c(rwc rwcVar) {
        this.E.E("PendingTrace enqueued but won't be reported. Root span: {}", rwcVar.b());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.swc
    public final void f() {
    }
}
