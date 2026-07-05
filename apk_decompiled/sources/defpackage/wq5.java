package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wq5 implements cd6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd6 b;

    public /* synthetic */ wq5(pd6 pd6Var, int i) {
        this.a = i;
        this.b = pd6Var;
    }

    @Override // defpackage.cd6
    public final void a(float f) {
        int i = this.a;
        pd6 pd6Var = this.b;
        switch (i) {
            case 0:
                ((xq5) pd6Var).a.invoke(Float.valueOf(f));
                break;
            default:
                ((mag) pd6Var).b(f);
                break;
        }
    }
}
