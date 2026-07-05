package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mj2 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ mj2(nwb nwbVar, nwb nwbVar2, int i) {
        this.E = i;
        this.F = nwbVar;
        this.G = nwbVar2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.G;
        nwb nwbVar2 = this.F;
        switch (i) {
            case 0:
                long j = ((fcc) obj).a;
                yl4 yl4Var = pj2.a;
                nwbVar2.setValue(new fcc(j));
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                nwbVar2.setValue(str);
                nwbVar.setValue(Boolean.TRUE);
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                nwbVar2.setValue(str2);
                nwbVar.setValue(Boolean.FALSE);
                break;
        }
        return ieiVar;
    }
}
