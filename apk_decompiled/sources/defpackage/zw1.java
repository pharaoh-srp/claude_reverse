package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zw1 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ bx1 G;
    public final /* synthetic */ xw1 H;
    public final /* synthetic */ String I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw1(bx1 bx1Var, xw1 xw1Var, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = bx1Var;
        this.H = xw1Var;
        this.I = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new zw1(this.G, this.H, this.I, tp4Var, 0);
            default:
                return new zw1(this.G, this.H, this.I, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((zw1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        xw1 xw1Var = this.H;
        bx1 bx1Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    jwf jwfVar = bx1Var.a;
                    String str = xw1Var.a;
                    String str2 = xw1Var.b;
                    Integer num = xw1Var.c;
                    this.F = 1;
                    Object objN = jwfVar.a.n(jwfVar.b, str, str2, this.I, null, num, this);
                    if (objN == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    jwf jwfVar2 = bx1Var.a;
                    String str3 = xw1Var.a;
                    String str4 = xw1Var.b;
                    String str5 = bx1Var.m;
                    Integer num2 = xw1Var.c;
                    this.F = 1;
                    Object objN2 = jwfVar2.a.n(jwfVar2.b, str3, str4, str5, this.I, num2, this);
                    if (objN2 == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
