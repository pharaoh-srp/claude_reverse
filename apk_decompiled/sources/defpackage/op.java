package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class op implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;
    public final /* synthetic */ isc G;

    public /* synthetic */ op(nwb nwbVar, isc iscVar, int i) {
        this.E = i;
        this.F = nwbVar;
        this.G = iscVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        isc iscVar = this.G;
        nwb nwbVar = this.F;
        switch (i) {
            case 0:
                nwbVar.setValue(Boolean.TRUE);
                iscVar.i(iscVar.h() + 1);
                break;
            case 1:
                nwbVar.setValue(Boolean.FALSE);
                iscVar.i(iscVar.h() + 1);
                break;
            case 2:
                nwbVar.setValue(null);
                iscVar.i(iscVar.h() + 1);
                break;
            default:
                nwbVar.setValue(d1e.a);
                iscVar.i(iscVar.h() + 1);
                break;
        }
        return ieiVar;
    }
}
