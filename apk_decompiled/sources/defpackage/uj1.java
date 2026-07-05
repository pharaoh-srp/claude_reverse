package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uj1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ pl3 F;
    public final /* synthetic */ View G;
    public final /* synthetic */ zy7 H;

    public /* synthetic */ uj1(zy7 zy7Var, pl3 pl3Var, View view) {
        this.E = 5;
        this.H = zy7Var;
        this.F = pl3Var;
        this.G = view;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        View view = this.G;
        pl3 pl3Var = this.F;
        zy7 zy7Var = this.H;
        switch (i) {
            case 0:
                pl3Var.b(view);
                zy7Var.a();
                break;
            case 1:
                pl3Var.c(view);
                zy7Var.a();
                break;
            case 2:
                pl3Var.b(view);
                zy7Var.a();
                break;
            case 3:
                pl3Var.b(view);
                zy7Var.a();
                break;
            case 4:
                pl3Var.c(view);
                zy7Var.a();
                break;
            default:
                zy7Var.a();
                pl3Var.i(view);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ uj1(pl3 pl3Var, View view, zy7 zy7Var, int i) {
        this.E = i;
        this.F = pl3Var;
        this.G = view;
        this.H = zy7Var;
    }
}
