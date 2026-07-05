package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gih implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ sih F;

    public /* synthetic */ gih(sih sihVar, int i) {
        this.E = i;
        this.F = sihVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        sih sihVar = this.F;
        switch (i) {
            case 0:
                ykh ykhVar = (ykh) sihVar.t.getValue();
                ykh ykhVar2 = ykh.F;
                if (ykhVar == ykhVar2) {
                    ykhVar2 = ykh.E;
                }
                sihVar.E(ykhVar2);
                break;
            default:
                sihVar.i();
                break;
        }
        return ieiVar;
    }
}
