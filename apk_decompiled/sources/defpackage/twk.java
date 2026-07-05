package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class twk implements Runnable {
    public final /* synthetic */ qrk E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ qrk I;
    public final /* synthetic */ jsk J;

    public twk(jsk jskVar, qrk qrkVar, long j, long j2, boolean z, qrk qrkVar2) {
        this.E = qrkVar;
        this.F = j;
        this.G = j2;
        this.H = z;
        this.I = qrkVar2;
        this.J = jskVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jsk jskVar = this.J;
        qrk qrkVar = this.E;
        jskVar.b1(qrkVar);
        x1l.a();
        if (!((umk) jskVar.E).K.X0(null, zvj.a1)) {
            jskVar.T0(this.F, false);
        }
        jsk.d1(jskVar, qrkVar, this.G, true, this.H);
        jsk.e1(jskVar, qrkVar, this.I);
    }
}
