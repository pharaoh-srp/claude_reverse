package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class am implements zy7 {
    public final /* synthetic */ vm E;
    public final /* synthetic */ int F;
    public final /* synthetic */ lwc G;

    public /* synthetic */ am(vm vmVar, int i, lwc lwcVar) {
        this.E = vmVar;
        this.F = i;
        this.G = lwcVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        kdg kdgVar = this.E.I;
        int size = kdgVar.size();
        int i = this.F;
        if (i <= size) {
            size = i;
        }
        kdgVar.add(size, this.G);
        return iei.a;
    }
}
