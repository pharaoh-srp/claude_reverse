package defpackage;

import com.anthropic.claude.bell.api.BellApiClientMessage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sk1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ fn1 F;

    public /* synthetic */ sk1(fn1 fn1Var, int i) {
        this.E = i;
        this.F = fn1Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        fn1 fn1Var = this.F;
        switch (i) {
            case 0:
                s51 s51Var = (s51) obj;
                s51Var.getClass();
                if (fn1Var != null) {
                    ((tn1) fn1Var).J(s51Var);
                }
                break;
            case 1:
                ((tn1) fn1Var).I();
                break;
            case 2:
                tn1 tn1Var = (tn1) fn1Var;
                if (tn1Var.q().a && !tn1Var.g.c() && tn1Var.q().a && tn1Var.q().e) {
                    tn1Var.O = true;
                    tn1Var.s.b(BellApiClientMessage.ManualInputEnd.INSTANCE);
                    tn1Var.E();
                } else if (tn1Var.j()) {
                    tn1Var.t();
                }
                break;
            default:
                s51 s51Var2 = (s51) obj;
                s51Var2.getClass();
                if (fn1Var != null) {
                    ((tn1) fn1Var).J(s51Var2);
                }
                break;
        }
        return iei.a;
    }
}
