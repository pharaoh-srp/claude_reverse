package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zxe extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ aye G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zxe(aye ayeVar, int i) {
        super(0);
        this.F = i;
        this.G = ayeVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        aye ayeVar = this.G;
        switch (i) {
            case 0:
                bz7 bz7Var = ayeVar.H;
                k99 k99Var = ayeVar.E;
                k99Var.getClass();
                return (gk5) bz7Var.invoke(k99Var);
            default:
                ayeVar.G.getClass();
                k99 k99Var2 = ayeVar.E;
                return new eye(new tk5(23, new ah5(k99Var2.t(), 1)), k99Var2.t());
        }
    }
}
