package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sj1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ fn1 F;
    public final /* synthetic */ pl3 G;
    public final /* synthetic */ View H;

    public /* synthetic */ sj1(fn1 fn1Var, pl3 pl3Var, View view, int i) {
        this.E = i;
        this.F = fn1Var;
        this.G = pl3Var;
        this.H = view;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        View view = this.H;
        pl3 pl3Var = this.G;
        fn1 fn1Var = this.F;
        switch (i) {
            case 0:
                if (fn1Var != null && !((tn1) fn1Var).y()) {
                    pl3Var.a(view);
                }
                if (fn1Var != null) {
                    ((tn1) fn1Var).Q();
                }
                break;
            case 1:
                if (fn1Var != null && !((tn1) fn1Var).y()) {
                    pl3Var.a(view);
                }
                if (fn1Var != null) {
                    ((tn1) fn1Var).Q();
                }
                break;
            default:
                if (fn1Var != null && !((tn1) fn1Var).y()) {
                    pl3Var.a(view);
                }
                if (fn1Var != null) {
                    ((tn1) fn1Var).Q();
                }
                break;
        }
        return ieiVar;
    }
}
