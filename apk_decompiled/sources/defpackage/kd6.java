package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kd6 implements v86 {
    public final /* synthetic */ zy7 a;
    public final /* synthetic */ nwb b;
    public final /* synthetic */ nwb c;
    public final /* synthetic */ l45 d;

    public kd6(zy7 zy7Var, nwb nwbVar, nwb nwbVar2, l45 l45Var) {
        this.a = zy7Var;
        this.b = nwbVar;
        this.c = nwbVar2;
        this.d = l45Var;
    }

    @Override // defpackage.v86
    public final void a() {
        nwb nwbVar = this.b;
        if (((Boolean) nwbVar.getValue()).booleanValue()) {
            ad6 ad6Var = (ad6) this.c.getValue();
            if (ad6Var != null) {
                gb9.D(this.d, null, null, new jd6(ad6Var, null, 0), 3);
            }
            if (((Boolean) nwbVar.getValue()).booleanValue()) {
                this.a.a();
            }
            nwbVar.setValue(Boolean.FALSE);
        }
    }
}
