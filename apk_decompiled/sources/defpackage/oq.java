package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oq implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;
    public final /* synthetic */ String G;
    public final /* synthetic */ bz7 H;

    public /* synthetic */ oq(List list, String str, bz7 bz7Var, int i) {
        this.E = i;
        this.F = list;
        this.G = str;
        this.H = bz7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        bz7 bz7Var = this.H;
        String str = this.G;
        List list = this.F;
        switch (i) {
            case 0:
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                j0aVar.W(list.size(), new kp(new q6(23), 2, list), new tq(list, 0), new ta4(802480018, true, new uq(list, str, bz7Var, 0)));
                break;
            default:
                bz7Var.invoke(((Boolean) obj).booleanValue() ? w44.b1(list, str) : w44.X0(list, str));
                break;
        }
        return ieiVar;
    }
}
