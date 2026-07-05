package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o40 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o40(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(0);
        this.F = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
        this.K = obj5;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        Object obj = this.K;
        Object obj2 = this.J;
        Object obj3 = this.I;
        Object obj4 = this.H;
        Object obj5 = this.G;
        switch (i) {
            case 0:
                ((r9d) obj5).o((zy7) obj4, (v9d) obj3, (String) obj2, (fu9) obj);
                return iei.a;
            default:
                cbf cbfVar = (cbf) ((fj0) obj5).G;
                qai qaiVar = (qai) obj4;
                ze9 ze9Var = (ze9) obj3;
                xh3 xh3VarA = ((u9i) obj2).a();
                return cbfVar.f(qaiVar, ze9.a(ze9Var, 0, false, null, xh3VarA != null ? xh3VarA.W() : null, 31).h(((mbe) obj).g()));
        }
    }
}
