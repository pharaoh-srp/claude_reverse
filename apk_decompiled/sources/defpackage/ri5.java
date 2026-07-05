package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ri5 extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ kq4 G;
    public final /* synthetic */ List H;
    public final /* synthetic */ s52 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri5(kq4 kq4Var, List list, s52 s52Var, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.G = kq4Var;
        this.H = list;
        this.I = s52Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new ri5(this.G, this.H, this.I, tp4Var, 0);
            default:
                return new ri5(this.G, this.H, this.I, tp4Var, 1);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
        }
        return ((ri5) create(tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        s52 s52Var = this.I;
        List list = this.H;
        m45 m45Var = m45.E;
        kq4 kq4Var = this.G;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    e62 e62VarS = kq4Var.a.s();
                    this.F = 1;
                    if (e62VarS.c(list, this) != m45Var) {
                    }
                } else if (i2 == 1) {
                    sf5.h0(obj);
                } else if (i2 != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                w52 w52VarR = kq4Var.a.r();
                this.F = 2;
                if (w52VarR.b(s52Var, this) != m45Var) {
                }
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    e62 e62VarS2 = kq4Var.a.s();
                    this.F = 1;
                    if (e62VarS2.c(list, this) != m45Var) {
                    }
                } else if (i3 == 1) {
                    sf5.h0(obj);
                } else if (i3 != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                w52 w52VarR2 = kq4Var.a.r();
                this.F = 2;
                if (w52VarR2.b(s52Var, this) != m45Var) {
                }
                break;
        }
        return m45Var;
    }
}
