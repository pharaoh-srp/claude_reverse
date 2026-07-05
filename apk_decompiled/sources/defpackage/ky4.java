package defpackage;

import com.anthropic.claude.conway.protocol.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class ky4 extends xzg implements rz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ lp7 G;
    public /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ky4(int i, tp4 tp4Var, int i2) {
        super(i, tp4Var);
        this.E = i2;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = 3;
        lp7 lp7Var = (lp7) obj;
        switch (i) {
            case 0:
                ky4 ky4Var = new ky4(i2, (tp4) obj3, 0);
                ky4Var.G = lp7Var;
                ky4Var.H = obj2;
                return ky4Var.invokeSuspend(ieiVar);
            default:
                ky4 ky4Var2 = new ky4(i2, (tp4) obj3, 1);
                ky4Var2.G = lp7Var;
                ky4Var2.H = (Object[]) obj2;
                return ky4Var2.invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        kp7 pj4Var;
        xl4 xl4Var;
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        int i2 = 1;
        xl4 xl4Var2 = null;
        switch (i) {
            case 0:
                lp7 lp7Var = this.G;
                Object obj2 = this.H;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    b0 b0Var = (b0) obj2;
                    if (b0Var == null || (pj4Var = b0Var.p) == null) {
                        pj4Var = new pj4(i2, Boolean.FALSE);
                    }
                    this.G = null;
                    this.H = null;
                    this.F = 1;
                    if (j8.D(lp7Var, pj4Var, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    lp7 lp7Var2 = this.G;
                    xl4[] xl4VarArr = (xl4[]) ((Object[]) this.H);
                    int length = xl4VarArr.length;
                    int i5 = 0;
                    while (true) {
                        xl4Var = vl4.a;
                        if (i5 < length) {
                            xl4 xl4Var3 = xl4VarArr[i5];
                            if (x44.r(xl4Var3, xl4Var)) {
                                i5++;
                            } else {
                                xl4Var2 = xl4Var3;
                            }
                        }
                    }
                    if (xl4Var2 != null) {
                        xl4Var = xl4Var2;
                    }
                    this.F = 1;
                    if (lp7Var2.g(xl4Var, this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
