package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ts1 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ mr G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts1(mr mrVar, int i) {
        super(1);
        this.F = i;
        this.G = mrVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        mr mrVar = this.G;
        switch (i) {
            case 0:
                ((cea) obj).getClass();
                return new vs1(mrVar.a);
            case 1:
                cea ceaVar = (cea) obj;
                ceaVar.getClass();
                return new iof(jce.a.b(te5.class), mrVar.a, ceaVar);
            case 2:
                cea ceaVar2 = (cea) obj;
                ceaVar2.getClass();
                return new iof(jce.a.b(dig.class), mrVar.a, ceaVar2);
            default:
                cea ceaVar3 = (cea) obj;
                ceaVar3.getClass();
                return new iof(jce.a.b(mng.class), mrVar.a, ceaVar3);
        }
    }
}
