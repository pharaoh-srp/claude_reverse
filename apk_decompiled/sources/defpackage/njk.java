package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class njk implements m2l, mec, cec, ydc {
    public final /* synthetic */ int E;
    public final Executor F;
    public final Object G;
    public final Object H;

    public njk(Executor executor, ydc ydcVar) {
        this.E = 0;
        this.G = new Object();
        this.F = executor;
        this.H = ydcVar;
    }

    @Override // defpackage.ydc
    public void a() {
        ((r5l) this.H).o();
    }

    @Override // defpackage.m2l
    public final void b(d5h d5hVar) {
        switch (this.E) {
            case 0:
                if (((r5l) d5hVar).d) {
                    synchronized (this.G) {
                        break;
                    }
                    this.F.execute(new k51(20, this));
                    return;
                }
                return;
            case 1:
                synchronized (this.G) {
                    break;
                }
                this.F.execute(new c5a(this, 8, d5hVar));
                return;
            case 2:
                if (d5hVar.g() || ((r5l) d5hVar).d) {
                    return;
                }
                synchronized (this.G) {
                    break;
                }
                this.F.execute(new c5a(this, 9, d5hVar));
                return;
            case 3:
                if (d5hVar.g()) {
                    synchronized (this.G) {
                        break;
                    }
                    this.F.execute(new c5a(this, 11, d5hVar));
                    return;
                }
                return;
            default:
                this.F.execute(new c5a(this, 13, d5hVar));
                return;
        }
    }

    @Override // defpackage.cec
    public void onFailure(Exception exc) {
        ((r5l) this.H).m(exc);
    }

    @Override // defpackage.mec
    public void onSuccess(Object obj) {
        ((r5l) this.H).n(obj);
    }

    public njk(Executor executor, zdc zdcVar) {
        this.E = 1;
        this.G = new Object();
        this.F = executor;
        this.H = zdcVar;
    }

    public njk(Executor executor, cec cecVar) {
        this.E = 2;
        this.G = new Object();
        this.F = executor;
        this.H = cecVar;
    }

    public njk(Executor executor, mec mecVar) {
        this.E = 3;
        this.G = new Object();
        this.F = executor;
        this.H = mecVar;
    }

    public njk(Executor executor, gxg gxgVar, r5l r5lVar) {
        this.E = 4;
        this.F = executor;
        this.G = gxgVar;
        this.H = r5lVar;
    }
}
