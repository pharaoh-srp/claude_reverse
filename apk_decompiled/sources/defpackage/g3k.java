package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class g3k implements m2l, mec, cec, ydc {
    public final /* synthetic */ int E;
    public final Executor F;
    public final up4 G;
    public final r5l H;

    public /* synthetic */ g3k(Executor executor, up4 up4Var, r5l r5lVar, int i) {
        this.E = i;
        this.F = executor;
        this.G = up4Var;
        this.H = r5lVar;
    }

    @Override // defpackage.ydc
    public void a() {
        this.H.o();
    }

    @Override // defpackage.m2l
    public final void b(d5h d5hVar) {
        switch (this.E) {
            case 0:
                this.F.execute(new c5a(this, 5, d5hVar));
                break;
            default:
                this.F.execute(new c5a(this, 6, d5hVar));
                break;
        }
    }

    @Override // defpackage.cec
    public void onFailure(Exception exc) {
        this.H.m(exc);
    }

    @Override // defpackage.mec
    public void onSuccess(Object obj) {
        this.H.n(obj);
    }
}
