package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o5i implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ a6i F;

    public /* synthetic */ o5i(a6i a6iVar, int i) {
        this.E = i;
        this.F = a6iVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        a6i a6iVar = this.F;
        switch (i) {
            case 0:
                return Boolean.valueOf((x44.r(a6iVar.d.getValue(), a6iVar.a.q0()) && a6iVar.g.h() == Long.MIN_VALUE && !((Boolean) a6iVar.h.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(a6iVar.b());
        }
    }
}
