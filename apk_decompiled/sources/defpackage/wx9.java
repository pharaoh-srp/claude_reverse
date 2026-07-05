package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wx9 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ zx9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx9(zx9 zx9Var, int i) {
        super(1);
        this.F = i;
        this.G = zx9Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        zx9 zx9Var = this.G;
        switch (i) {
            case 0:
                sxb sxbVar = (sxb) obj;
                sxbVar.getClass();
                return zx9.v(zx9Var, sxbVar);
            default:
                sxb sxbVar2 = (sxb) obj;
                sxbVar2.getClass();
                return zx9.w(zx9Var, sxbVar2);
        }
    }
}
