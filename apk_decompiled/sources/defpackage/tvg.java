package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tvg implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ cji F;

    public /* synthetic */ tvg(cji cjiVar, int i) {
        this.E = i;
        this.F = cjiVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        cji cjiVar = this.F;
        switch (i) {
            case 0:
                gwg gwgVar = (gwg) obj;
                gwgVar.getClass();
                cjiVar.v.setValue(gwgVar);
                break;
            case 1:
                dwg dwgVar = (dwg) obj;
                dwgVar.getClass();
                cjiVar.w.setValue(dwgVar);
                break;
            case 2:
                gwg gwgVar2 = (gwg) obj;
                gwgVar2.getClass();
                cjiVar.v.setValue(gwgVar2);
                break;
            default:
                dwg dwgVar2 = (dwg) obj;
                dwgVar2.getClass();
                cjiVar.w.setValue(dwgVar2);
                break;
        }
        return ieiVar;
    }
}
