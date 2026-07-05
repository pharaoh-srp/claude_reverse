package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ej2 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ ej2(nwb nwbVar, nwb nwbVar2, int i) {
        this.E = i;
        this.F = nwbVar;
        this.G = nwbVar2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i;
        int i2 = this.E;
        z1d z1dVar = z1d.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.G;
        nwb nwbVar2 = this.F;
        switch (i2) {
            case 0:
                nwbVar2.setValue(Boolean.FALSE);
                nwbVar.setValue(Boolean.TRUE);
                return ieiVar;
            case 1:
                nwbVar2.setValue(Boolean.FALSE);
                nwbVar.setValue(null);
                return ieiVar;
            case 2:
                nwbVar.setValue((fm1) nwbVar2.getValue());
                return ieiVar;
            case 3:
                if (!((Boolean) nwbVar2.getValue()).booleanValue()) {
                    nwbVar.setValue(Boolean.FALSE);
                }
                return ieiVar;
            case 4:
                nwbVar2.setValue(z1dVar);
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case 5:
                nwbVar2.setValue(z1dVar);
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case 6:
                nwbVar2.setValue(ce8.Settings);
                nwbVar.setValue(Boolean.TRUE);
                return ieiVar;
            default:
                if (nwbVar2.getValue() == null || nwbVar.getValue() == null) {
                    i = 0;
                } else {
                    Object value = nwbVar2.getValue();
                    value.getClass();
                    long jQ = ((cu9) value).q(0L);
                    Object value2 = nwbVar.getValue();
                    value2.getClass();
                    long j = ((fcc) value2).a;
                    i = Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (jQ >> 32)) ? Float.intBitsToFloat((int) (j & 4294967295L)) < Float.intBitsToFloat((int) (jQ & 4294967295L)) ? 1 : 3 : Float.intBitsToFloat((int) (j & 4294967295L)) < Float.intBitsToFloat((int) (jQ & 4294967295L)) ? 2 : 4;
                }
                return Integer.valueOf(i);
        }
    }
}
