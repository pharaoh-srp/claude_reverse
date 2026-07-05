package defpackage;

import androidx.compose.material3.internal.AnchoredDraggableUninitializedException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g15 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ xw4 F;

    public /* synthetic */ g15(xw4 xw4Var, int i) {
        this.E = i;
        this.F = xw4Var;
    }

    @Override // defpackage.zy7
    public final Object a() throws AnchoredDraggableUninitializedException {
        int i = this.E;
        iei ieiVar = iei.a;
        xw4 xw4Var = this.F;
        switch (i) {
            case 0:
                xw4Var.b.invoke(Boolean.FALSE);
                break;
            case 1:
                xw4Var.b.invoke(Boolean.TRUE);
                break;
            default:
                xw4Var.b.invoke(Boolean.FALSE);
                break;
        }
        return ieiVar;
    }
}
