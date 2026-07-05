package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c6i implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ a6i F;

    public /* synthetic */ c6i(a6i a6iVar, int i) {
        this.E = i;
        this.F = a6iVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        a6i a6iVar = this.F;
        switch (i) {
            case 0:
                return new d6i(a6iVar, 0);
            default:
                return new d6i(a6iVar, 1);
        }
    }
}
