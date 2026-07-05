package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jb1 implements w4a {
    public final /* synthetic */ int a;
    public final /* synthetic */ eb1 b;

    public /* synthetic */ jb1(v4a v4aVar, eb1 eb1Var, int i) {
        this.a = i;
        this.b = eb1Var;
    }

    @Override // defpackage.w4a
    public final void a() {
        int i = this.a;
        eb1 eb1Var = this.b;
        switch (i) {
            case 0:
                nc4 nc4Var = (nc4) eb1Var;
                ((db1) nc4Var.a).f(false);
                ((cb1) nc4Var.b).f(false);
                break;
            default:
                ((vc4) eb1Var).l(false);
                break;
        }
    }
}
