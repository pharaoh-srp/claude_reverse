package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vl implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ vm F;

    public /* synthetic */ vl(vm vmVar, int i) {
        this.E = i;
        this.F = vmVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        vm vmVar = this.F;
        switch (i) {
            case 0:
                return Boolean.valueOf(vmVar.e());
            case 1:
                return Boolean.valueOf(vmVar.e());
            default:
                isc iscVar = vmVar.C;
                iscVar.i(iscVar.h() + 1);
                return iei.a;
        }
    }
}
