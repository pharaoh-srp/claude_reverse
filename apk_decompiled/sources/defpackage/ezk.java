package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ezk implements Runnable {
    public final /* synthetic */ u1l E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ rvj G;
    public final /* synthetic */ hyk H;

    public ezk(hyk hykVar, u1l u1lVar, boolean z, rvj rvjVar) {
        this.E = u1lVar;
        this.F = z;
        this.G = rvjVar;
        this.H = hykVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        hyk hykVar = this.H;
        pfk pfkVar = hykVar.H;
        if (pfkVar == null) {
            hykVar.b0().J.b("Discarding data. Failed to send event to service");
        } else {
            hykVar.U0(pfkVar, this.F ? null : this.G, this.E);
            hykVar.c1();
        }
    }
}
