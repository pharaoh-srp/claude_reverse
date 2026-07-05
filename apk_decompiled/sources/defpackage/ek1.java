package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ek1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ wlg F;

    public /* synthetic */ ek1(wlg wlgVar, int i) {
        this.E = i;
        this.F = wlgVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        wlg wlgVar = this.F;
        switch (i) {
            case 0:
                xre xreVar = (xre) obj;
                xreVar.getClass();
                xreVar.l(((Number) wlgVar.getValue()).floatValue());
                xreVar.m(((Number) wlgVar.getValue()).floatValue());
                return ieiVar;
            case 1:
                ((xre) obj).b(((Number) wlgVar.getValue()).floatValue());
                return ieiVar;
            case 2:
                xre xreVar2 = (xre) obj;
                xreVar2.getClass();
                xreVar2.b(((Number) wlgVar.getValue()).floatValue());
                return ieiVar;
            case 3:
                xre xreVar3 = (xre) obj;
                xreVar3.getClass();
                xreVar3.b(((Number) wlgVar.getValue()).floatValue());
                return ieiVar;
            case 4:
                xre xreVar4 = (xre) obj;
                xreVar4.getClass();
                xreVar4.l(((Number) wlgVar.getValue()).floatValue());
                xreVar4.m(((Number) wlgVar.getValue()).floatValue());
                return ieiVar;
            case 5:
                xre xreVar5 = (xre) obj;
                xreVar5.getClass();
                xreVar5.b(((Number) wlgVar.getValue()).floatValue());
                return ieiVar;
            default:
                ((cz5) obj).getClass();
                return new y69(((y69) wlgVar.getValue()).a);
        }
    }
}
