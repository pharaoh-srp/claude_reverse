package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tdd implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ e1a F;

    public /* synthetic */ tdd(e1a e1aVar, int i) {
        this.E = i;
        this.F = e1aVar;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        iei ieiVar = iei.a;
        mw1 mw1Var = (mw1) obj;
        ld4 ld4Var = (ld4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        switch (i) {
            case 0:
                mw1Var.getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 129) != 128)) {
                    e18Var.T();
                } else {
                    rwj.b(this.F, null, "PreviewAttachmentContent", yrk.a, e18Var, 3464);
                }
                break;
            default:
                mw1Var.getClass();
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 129) != 128)) {
                    e18Var2.T();
                } else {
                    rwj.b(this.F, null, "PreviewTextContent", zrk.a, e18Var2, 3456);
                }
                break;
        }
        return ieiVar;
    }
}
