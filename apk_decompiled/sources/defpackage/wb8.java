package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wb8 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ wb8(boolean z, nwb nwbVar, int i) {
        this.E = i;
        this.F = z;
        this.G = nwbVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        boolean z = true;
        nwb nwbVar = this.G;
        boolean z2 = this.F;
        switch (i) {
            case 0:
                if (!((Boolean) nwbVar.getValue()).booleanValue() && !z2) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                if (((aji) nwbVar.getValue()) == null && !z2) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
