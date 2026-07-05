package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutputConnectorsItem;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d05 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ long G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ d05(aag aagVar, zub zubVar, iqb iqbVar, v9g v9gVar, boolean z, long j, int i) {
        this.H = aagVar;
        this.I = zubVar;
        this.J = iqbVar;
        this.K = v9gVar;
        this.F = z;
        this.G = j;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.K;
        Object obj4 = this.J;
        Object obj5 = this.I;
        Object obj6 = this.H;
        switch (i) {
            case 0:
                ConwaySuggestConnectorsOutputConnectorsItem conwaySuggestConnectorsOutputConnectorsItem = (ConwaySuggestConnectorsOutputConnectorsItem) obj6;
                ConwaySuggestConnectorsOutputConnectorsItem conwaySuggestConnectorsOutputConnectorsItem2 = (ConwaySuggestConnectorsOutputConnectorsItem) obj5;
                ns4 ns4Var = (ns4) obj4;
                bz7 bz7Var = (bz7) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    String strJ0 = d4c.j0(R.string.suggested_connector_button_connect, e18Var);
                    boolean zR = x44.r(conwaySuggestConnectorsOutputConnectorsItem, conwaySuggestConnectorsOutputConnectorsItem2);
                    boolean z = (ns4Var.b == ms4.I || conwaySuggestConnectorsOutputConnectorsItem2.getUrl() == null || this.F) ? false : true;
                    iqb iqbVar = e05.a;
                    boolean zF = e18Var.f(bz7Var) | e18Var.f(conwaySuggestConnectorsOutputConnectorsItem2);
                    Object objN = e18Var.N();
                    if (zF || objN == jd4.a) {
                        objN = new a05(bz7Var, conwaySuggestConnectorsOutputConnectorsItem2, 2);
                        e18Var.k0(objN);
                    }
                    dxj.a(strJ0, zR, iqbVar, z, null, e12.a, y02.a, this.G, (zy7) objN, e18Var, 1769856, 16);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((aag) obj6).a((zub) obj5, (iqb) obj4, (v9g) obj3, this.F, this.G, (ld4) obj, x44.p0(196609));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ d05(ConwaySuggestConnectorsOutputConnectorsItem conwaySuggestConnectorsOutputConnectorsItem, ConwaySuggestConnectorsOutputConnectorsItem conwaySuggestConnectorsOutputConnectorsItem2, ns4 ns4Var, boolean z, long j, bz7 bz7Var) {
        this.H = conwaySuggestConnectorsOutputConnectorsItem;
        this.I = conwaySuggestConnectorsOutputConnectorsItem2;
        this.J = ns4Var;
        this.F = z;
        this.G = j;
        this.K = bz7Var;
    }
}
