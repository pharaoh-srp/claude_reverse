package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jyk extends qtj {
    public final /* synthetic */ int e;
    public final /* synthetic */ hyk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jyk(hyk hykVar, umk umkVar, int i) {
        super(umkVar);
        this.e = i;
        this.f = hykVar;
    }

    @Override // defpackage.qtj
    public final void c() {
        int i = this.e;
        hyk hykVar = this.f;
        switch (i) {
            case 0:
                hykVar.K0();
                if (hykVar.Y0()) {
                    hykVar.b0().R.b("Inactivity, disconnecting from the service");
                    hykVar.X0();
                }
                break;
            default:
                hykVar.b0().M.b("Tasks have been queued for a long time");
                break;
        }
    }
}
