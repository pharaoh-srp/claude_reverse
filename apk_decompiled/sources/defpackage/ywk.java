package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ywk implements Runnable {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ long F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ yak J;

    public ywk(jsk jskVar, qrk qrkVar, long j, boolean z, qrk qrkVar2) {
        this.H = qrkVar;
        this.F = j;
        this.G = z;
        this.I = qrkVar2;
        this.J = jskVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        Object obj = this.I;
        Object obj2 = this.H;
        yak yakVar = this.J;
        switch (i) {
            case 0:
                jsk jskVar = (jsk) yakVar;
                qrk qrkVar = (qrk) obj2;
                jskVar.b1(qrkVar);
                jsk.d1(jskVar, qrkVar, this.F, false, this.G);
                jsk.e1(jskVar, qrkVar, (qrk) obj);
                break;
            default:
                ((vxk) yakVar).V0((xxk) obj2, (xxk) obj, this.F, this.G, null);
                break;
        }
    }

    public ywk(vxk vxkVar, xxk xxkVar, xxk xxkVar2, long j, boolean z) {
        this.H = xxkVar;
        this.I = xxkVar2;
        this.F = j;
        this.G = z;
        this.J = vxkVar;
    }
}
