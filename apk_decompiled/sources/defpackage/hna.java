package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hna extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ ina G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hna(ina inaVar, int i) {
        super(0);
        this.F = i;
        this.G = inaVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        ina inaVar = this.G;
        switch (i) {
            case 0:
                return Boolean.valueOf((((bna) inaVar.F.getValue()) == null && ((Throwable) inaVar.G.getValue()) == null) ? false : true);
            case 1:
                return Boolean.valueOf(((Throwable) inaVar.G.getValue()) != null);
            case 2:
                if (((bna) inaVar.F.getValue()) == null && ((Throwable) inaVar.G.getValue()) == null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(((bna) inaVar.F.getValue()) != null);
        }
    }
}
