package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jx9 implements iee {
    public final /* synthetic */ int E;
    public final /* synthetic */ aaf F;

    public /* synthetic */ jx9(aaf aafVar, int i) {
        this.E = i;
        this.F = aafVar;
    }

    @Override // defpackage.iee
    public final void w(av9 av9Var) {
        int i = this.E;
        aaf aafVar = this.F;
        switch (i) {
            case 0:
                ((lx9) aafVar).j = av9Var;
                break;
            default:
                ((koc) aafVar).y.setValue(av9Var);
                break;
        }
    }
}
