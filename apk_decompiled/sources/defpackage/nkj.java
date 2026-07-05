package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nkj extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ qkj G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nkj(qkj qkjVar, int i) {
        super(1);
        this.F = i;
        this.G = qkjVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                xre xreVar = (xre) obj;
                xreVar.getClass();
                qkj qkjVar = this.G;
                xreVar.l(qkjVar.U.c());
                xreVar.m(qkjVar.U.c());
                xreVar.v(((Number) qkjVar.U.c.e()).floatValue());
                xreVar.w(((Number) qkjVar.U.d.e()).floatValue());
                break;
            default:
                long j = ((fcc) obj).a;
                qkj qkjVar2 = this.G;
                gb9.D(qkjVar2.d1(), null, null, new l70(qkjVar2, j, null, 4), 3);
                break;
        }
        return ieiVar;
    }
}
