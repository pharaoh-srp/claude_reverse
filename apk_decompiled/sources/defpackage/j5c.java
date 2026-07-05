package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j5c extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ m5c G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5c(m5c m5cVar, int i) {
        super(0);
        this.F = i;
        this.G = m5cVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        iei ieiVar = iei.a;
        m5c m5cVar = this.G;
        switch (i) {
            case 0:
                fb2 fb2Var = m5cVar.n0;
                fb2Var.getClass();
                m5cVar.Z0(fb2Var, m5cVar.m0);
                break;
            default:
                m5c m5cVar2 = m5cVar.W;
                if (m5cVar2 != null) {
                    m5cVar2.o1();
                }
                break;
        }
        return ieiVar;
    }
}
