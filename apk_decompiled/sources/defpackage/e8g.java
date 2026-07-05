package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e8g extends rok {
    public Object F;
    public Object G;
    public fwb H;
    public fwb I;
    public mkf J;
    public final tz9 K;
    public final cd L;

    public e8g() {
        super(5);
        this.K = new tz9(27, this);
        a21 a21Var = new a21(22, this);
        ycg.e(ycg.a);
        synchronized (ycg.c) {
            ycg.h = w44.b1(ycg.h, a21Var);
        }
        this.L = new cd(15, a21Var);
    }

    @Override // defpackage.rok
    public final void l0(mkf mkfVar) {
        this.G = null;
        this.I = null;
    }

    @Override // defpackage.rok
    public final void m0() {
        synchronized (this.E) {
            try {
                this.F = this.G;
                if (this.I == null) {
                    this.H = null;
                } else {
                    if (this.H == null) {
                        fwb fwbVar = v6f.a;
                        this.H = new fwb();
                    }
                    fwb fwbVar2 = this.H;
                    this.H = this.I;
                    this.I = fwbVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rok
    public final void o0() {
        this.L.h();
        this.G = null;
        this.I = null;
        synchronized (this.E) {
            this.J = null;
            this.F = null;
            this.H = null;
        }
    }

    @Override // defpackage.rok
    public final bz7 v0(mkf mkfVar) {
        mkf mkfVar2 = this.J;
        if (mkfVar2 != null && !mkfVar2.equals(mkfVar)) {
            zad.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.J = mkfVar;
        return this.K;
    }

    @Override // defpackage.rok
    public final void w0(gh2 gh2Var) {
        this.J = null;
        this.G = null;
        this.I = null;
        m0();
    }
}
