package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qse extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ rse G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qse(rse rseVar, int i) {
        super(1);
        this.F = i;
        this.G = rseVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        rse rseVar = this.G;
        switch (i) {
            case 0:
                return Double.valueOf(rseVar.n.a(wd6.c0(((Number) obj).doubleValue(), rseVar.e, rseVar.f)));
            default:
                return Double.valueOf(wd6.c0(rseVar.k.a(((Number) obj).doubleValue()), rseVar.e, rseVar.f));
        }
    }
}
