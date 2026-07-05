package defpackage;

import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class l82 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ o82 F;
    public final /* synthetic */ k82 G;

    public /* synthetic */ l82(o82 o82Var, k82 k82Var, int i) {
        this.E = i;
        this.F = o82Var;
        this.G = k82Var;
    }

    @Override // defpackage.zy7
    public final Object a() throws JSONException {
        int i = this.E;
        iei ieiVar = iei.a;
        k82 k82Var = this.G;
        o82 o82Var = this.F;
        switch (i) {
            case 0:
                o82Var.Q(k82Var.a);
                break;
            default:
                o82Var.Q(k82Var.a);
                break;
        }
        return ieiVar;
    }
}
