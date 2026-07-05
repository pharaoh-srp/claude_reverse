package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutputConnectorsItem;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c05 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ long I;
    public final /* synthetic */ Object J;

    public /* synthetic */ c05(ovi oviVar, long j, boolean z, iqb iqbVar, qcc qccVar) {
        this.E = 2;
        this.F = oviVar;
        this.I = j;
        this.H = z;
        this.G = iqbVar;
        this.J = qccVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        lz1 lz1Var = jd4.a;
        boolean z = this.H;
        iei ieiVar = iei.a;
        Object obj3 = this.J;
        Object obj4 = this.G;
        Object obj5 = this.F;
        switch (i) {
            case 0:
                ConwaySuggestConnectorsOutputConnectorsItem conwaySuggestConnectorsOutputConnectorsItem = (ConwaySuggestConnectorsOutputConnectorsItem) obj5;
                ConwaySuggestConnectorsOutputConnectorsItem conwaySuggestConnectorsOutputConnectorsItem2 = (ConwaySuggestConnectorsOutputConnectorsItem) obj4;
                bz7 bz7Var = (bz7) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    String strJ0 = d4c.j0(R.string.conway_connector_button_allow, e18Var);
                    boolean zR = x44.r(conwaySuggestConnectorsOutputConnectorsItem, conwaySuggestConnectorsOutputConnectorsItem2);
                    boolean z2 = !z;
                    iqb iqbVar = e05.a;
                    boolean zF = e18Var.f(bz7Var) | e18Var.f(conwaySuggestConnectorsOutputConnectorsItem2);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        objN = new a05(bz7Var, conwaySuggestConnectorsOutputConnectorsItem2, 1);
                        e18Var.k0(objN);
                    }
                    dxj.a(strJ0, zR, iqbVar, z2, null, f12.a, y02.a, this.I, (zy7) objN, e18Var, 1769856, 16);
                }
                break;
            case 1:
                ConwaySuggestConnectorsOutputConnectorsItem conwaySuggestConnectorsOutputConnectorsItem3 = (ConwaySuggestConnectorsOutputConnectorsItem) obj5;
                ConwaySuggestConnectorsOutputConnectorsItem conwaySuggestConnectorsOutputConnectorsItem4 = (ConwaySuggestConnectorsOutputConnectorsItem) obj4;
                bz7 bz7Var2 = (bz7) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    String strJ02 = d4c.j0(R.string.suggested_connector_button_reconnect, e18Var2);
                    boolean zR2 = x44.r(conwaySuggestConnectorsOutputConnectorsItem3, conwaySuggestConnectorsOutputConnectorsItem4);
                    boolean z3 = !z;
                    iqb iqbVar2 = e05.a;
                    boolean zF2 = e18Var2.f(bz7Var2) | e18Var2.f(conwaySuggestConnectorsOutputConnectorsItem4);
                    Object objN2 = e18Var2.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = new a05(bz7Var2, conwaySuggestConnectorsOutputConnectorsItem4, 0);
                        e18Var2.k0(objN2);
                    }
                    dxj.a(strJ02, zR2, iqbVar2, z3, null, e12.a, y02.a, this.I, (zy7) objN2, e18Var2, 1769856, 16);
                }
                break;
            default:
                ovi oviVar = (ovi) obj5;
                iqb iqbVar3 = (iqb) obj4;
                qcc qccVar = (qcc) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    j8.c(ve4.u.a(oviVar), fd9.q0(1260045569, new p50(this.I, this.H, iqbVar3, qccVar), e18Var3), e18Var3, 56);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ c05(ConwaySuggestConnectorsOutputConnectorsItem conwaySuggestConnectorsOutputConnectorsItem, ConwaySuggestConnectorsOutputConnectorsItem conwaySuggestConnectorsOutputConnectorsItem2, boolean z, long j, bz7 bz7Var, int i) {
        this.E = i;
        this.F = conwaySuggestConnectorsOutputConnectorsItem;
        this.G = conwaySuggestConnectorsOutputConnectorsItem2;
        this.H = z;
        this.I = j;
        this.J = bz7Var;
    }
}
