package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kc5 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ a6i F;

    public /* synthetic */ kc5(a6i a6iVar, int i) {
        this.E = i;
        this.F = a6iVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        a6i a6iVar = this.F;
        switch (i) {
            case 0:
                return a6iVar.d.getValue();
            case 1:
                return a6iVar.f();
            case 2:
                return a6iVar.d.getValue();
            case 3:
                return a6iVar.f();
            case 4:
                return a6iVar.d.getValue();
            case 5:
                return a6iVar.f();
            case 6:
                return a6iVar.d.getValue();
            default:
                return a6iVar.f();
        }
    }
}
