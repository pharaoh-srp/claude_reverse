package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class en implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ an F;

    public /* synthetic */ en(an anVar, int i) {
        this.E = i;
        this.F = anVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        an anVar = this.F;
        switch (i) {
            case 0:
                lsc lscVar = anVar.e;
                aig aigVar = (aig) obj;
                aigVar.getClass();
                if (aigVar instanceof zhg) {
                    lscVar.setValue(((zhg) aigVar).a);
                } else if (aigVar instanceof yhg) {
                    lscVar.setValue(((yhg) aigVar).a);
                } else if (!(aigVar instanceof xhg)) {
                    wg6.i();
                    return null;
                }
                anVar.f.setValue(Boolean.FALSE);
                return ieiVar;
            default:
                String str = (String) obj;
                str.getClass();
                anVar.e.setValue(str);
                return ieiVar;
        }
    }
}
