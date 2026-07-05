package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class by1 extends la1 {
    public ua2 a;
    public bz7 b;

    @Override // defpackage.la1
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // defpackage.la1
    public final void b(Throwable th) {
        ua2 ua2Var = this.a;
        if (ua2Var != null) {
            ua2Var.resumeWith(sf5.u(th));
        }
    }
}
