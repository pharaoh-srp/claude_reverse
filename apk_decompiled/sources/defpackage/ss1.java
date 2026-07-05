package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ss1 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ lr G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ss1(lr lrVar, int i) {
        super(1);
        this.F = i;
        this.G = lrVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        lr lrVar = this.G;
        switch (i) {
            case 0:
                ((h69) obj).getClass();
                return new vs1(lrVar.a);
            case 1:
                h69 h69Var = (h69) obj;
                h69Var.getClass();
                return new iof(jce.a.b(te5.class), lrVar.a, h69Var);
            case 2:
                h69 h69Var2 = (h69) obj;
                h69Var2.getClass();
                return new iof(jce.a.b(dig.class), lrVar.a, h69Var2);
            default:
                h69 h69Var3 = (h69) obj;
                h69Var3.getClass();
                return new iof(jce.a.b(mng.class), lrVar.a, h69Var3);
        }
    }
}
