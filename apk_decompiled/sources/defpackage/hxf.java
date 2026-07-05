package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hxf implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bpc F;
    public final /* synthetic */ nxf G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ mnc I;
    public final /* synthetic */ long J;

    public /* synthetic */ hxf(bpc bpcVar, nxf nxfVar, boolean z, mnc mncVar, long j, int i) {
        this.E = i;
        this.F = bpcVar;
        this.G = nxfVar;
        this.H = z;
        this.I = mncVar;
        this.J = j;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        boolean z = this.H;
        nxf nxfVar = this.G;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    t9e.a(this.F, null, z ? nxfVar.b : nxfVar.e, this.I, this.J, e18Var, 8, 2);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    t9e.a(this.F, null, z ? nxfVar.b : nxfVar.e, this.I, this.J, e18Var2, 8, 2);
                }
                break;
            default:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    t9e.a(this.F, null, z ? nxfVar.b : nxfVar.e, this.I, this.J, e18Var3, 8, 2);
                }
                break;
        }
        return ieiVar;
    }
}
