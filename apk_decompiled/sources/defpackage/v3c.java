package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v3c extends la1 {
    public v01 a;

    public v3c(v01 v01Var) {
        this.a = v01Var;
    }

    @Override // defpackage.la1
    public final void a() {
        this.a = null;
    }

    @Override // defpackage.la1
    public final void b(Throwable th) throws Throwable {
        throw th;
    }

    public final void c() {
        v01 v01Var = this.a;
        if (v01Var != null) {
            v01Var.a();
        }
    }
}
