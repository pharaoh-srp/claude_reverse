package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rma extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rma(Object obj, int i, int i2) {
        super(1);
        this.F = i2;
        this.G = obj;
        this.H = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        int i2 = this.H;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                return Boolean.valueOf(uma.a((uma) obj2, i2, ((Number) obj).longValue()));
            case 1:
                return Boolean.valueOf(uma.a((uma) obj2, i2, ((Number) obj).longValue()));
            default:
                Boolean boolValueOf = Boolean.valueOf(((jt7) obj).w1(i2));
                ((dae) obj2).E = boolValueOf;
                return boolValueOf;
        }
    }
}
