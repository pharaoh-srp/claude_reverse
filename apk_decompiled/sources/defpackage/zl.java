package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zl implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ vm F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;

    public /* synthetic */ zl(vm vmVar, String str, String str2, int i) {
        this.E = i;
        this.F = vmVar;
        this.G = str;
        this.H = str2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        tp4 tp4Var = null;
        String str = this.H;
        String str2 = this.G;
        vm vmVar = this.F;
        switch (i) {
            case 0:
                vmVar.O = null;
                b54.w0(new o8(str, 10), vmVar.n);
                return Boolean.valueOf(vmVar.G.f(str2));
            default:
                vmVar.O = null;
                b54.w0(new o8(str2, 9), vmVar.n);
                gb9.D(vmVar.k, null, null, new fm(vmVar, str, tp4Var, 2), 3);
                return iei.a;
        }
    }
}
