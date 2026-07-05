package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bd2 implements lp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;

    public /* synthetic */ bd2(int i, nwb nwbVar) {
        this.E = i;
        this.F = nwbVar;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.F;
        switch (i) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                q7d q7dVar = (q7d) nwbVar.getValue();
                if (q7dVar != null) {
                    long j = q7dVar.a;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + fFloatValue;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                    nwbVar.setValue(new q7d((((long) Float.floatToIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToIntBits(fIntBitsToFloat2)) & 4294967295L)));
                }
                break;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    xe4 xe4Var = z23.a;
                    nwbVar.setValue(Boolean.TRUE);
                }
                break;
        }
        return ieiVar;
    }
}
