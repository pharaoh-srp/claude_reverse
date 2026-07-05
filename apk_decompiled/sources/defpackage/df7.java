package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class df7 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ g6a F;

    public /* synthetic */ df7(g6a g6aVar, int i) {
        this.E = i;
        this.F = g6aVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                xd6 xd6Var = (xd6) obj;
                xd6Var.getClass();
                xd6.S0(xd6Var, this.F, 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 0, 126);
                break;
            case 1:
                cv9 cv9Var = (cv9) obj;
                cv9Var.getClass();
                cv9Var.a();
                xd6.S0(cv9Var, this.F, 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 6, 62);
                break;
            default:
                cv9 cv9Var2 = (cv9) obj;
                cv9Var2.getClass();
                cv9Var2.a();
                xd6.S0(cv9Var2, this.F, 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 6, 62);
                break;
        }
        return ieiVar;
    }
}
