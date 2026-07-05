package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uj9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ wj9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uj9(wj9 wj9Var, int i) {
        super(0);
        this.F = i;
        this.G = wj9Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        wj9 wj9Var = this.G;
        switch (i) {
            case 0:
                return wj9Var.E.H.e();
            default:
                List listW = x44.W(tc0.a(wj9Var.E.H));
                return listW.isEmpty() ? dd8.F : new xc0(listW, 0);
        }
    }
}
