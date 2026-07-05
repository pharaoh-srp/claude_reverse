package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pkj extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ qkj G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pkj(qkj qkjVar, int i) {
        super(0);
        this.F = i;
        this.G = qkjVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        iei ieiVar = iei.a;
        qkj qkjVar = this.G;
        switch (i) {
            case 0:
                qkjVar.c0 = null;
                qkjVar.U.g.l();
                break;
            default:
                gb9.D(qkjVar.d1(), null, null, new bff(qkjVar, null, 13), 3);
                break;
        }
        return ieiVar;
    }
}
