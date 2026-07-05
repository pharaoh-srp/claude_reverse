package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uge extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ che G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uge(che cheVar, int i) {
        super(1);
        this.F = i;
        this.G = cheVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        che cheVar = this.G;
        switch (i) {
            case 0:
                bhe bheVar = (bhe) obj;
                bheVar.getClass();
                break;
            case 1:
                xre xreVar = (xre) obj;
                xreVar.getClass();
                xreVar.w(fcc.g(cheVar.e()));
                break;
            case 2:
                xre xreVar2 = (xre) obj;
                xreVar2.getClass();
                xreVar2.v(fcc.f(cheVar.e()));
                break;
            case 3:
                xre xreVar3 = (xre) obj;
                xreVar3.getClass();
                xreVar3.w(fcc.g(((fcc) cheVar.s.e()).a));
                break;
            default:
                xre xreVar4 = (xre) obj;
                xreVar4.getClass();
                xreVar4.v(fcc.f(((fcc) cheVar.s.e()).a));
                break;
        }
        return ieiVar;
    }
}
