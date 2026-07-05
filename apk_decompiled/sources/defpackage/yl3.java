package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yl3 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ x0a F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ yl3(x0a x0aVar, nwb nwbVar, int i) {
        this.E = i;
        this.F = x0aVar;
        this.G = nwbVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        nwb nwbVar = this.G;
        x0a x0aVar = this.F;
        switch (i) {
            case 0:
                return ykk.g(x0aVar, ((Number) nwbVar.getValue()).intValue());
            default:
                p0a p0aVarH = x0aVar.h();
                int i2 = p0aVarH.n;
                q0a q0aVar = (q0a) w44.V0(p0aVarH.k);
                boolean z = false;
                if ((q0aVar != null ? q0aVar.a : 0) + 1 > i2 - 5 && ((hgf) nwbVar.getValue()).a) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
