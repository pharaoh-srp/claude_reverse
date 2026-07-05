package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nj1 implements bz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ Object F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ nj1(String str, String str2, String str3, String str4, String str5, boolean z, o1j o1jVar, m7f m7fVar) {
        this.F = str;
        this.H = str2;
        this.I = str3;
        this.J = str4;
        this.K = str5;
        this.G = z;
        this.L = o1jVar;
        this.M = m7fVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.M;
        Object obj3 = this.L;
        Object obj4 = this.K;
        Object obj5 = this.J;
        Object obj6 = this.I;
        Object obj7 = this.H;
        Object obj8 = this.F;
        switch (i) {
            case 0:
                m7f m7fVar = (m7f) obj2;
                ((swe) obj).getClass();
                kce kceVar = jce.a;
                break;
            case 1:
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                cqk.g(j0aVar, (List) obj5, (bz7) obj4, (pl3) obj3, null, null, (String) obj8, new t04((pz7) obj6, 24, (Set) obj7), new x40(29, (nwb) obj2), this.G, 24);
                break;
            default:
                List list = (List) obj8;
                pz7 pz7Var = (pz7) obj7;
                bz7 bz7Var = (bz7) obj6;
                bz7 bz7Var2 = (bz7) obj5;
                hgf hgfVar = (hgf) obj4;
                i4g i4gVar = (i4g) obj3;
                ta4 ta4Var = (ta4) obj2;
                j0a j0aVar2 = (j0a) obj;
                j0aVar2.getClass();
                int i2 = 1;
                if (this.G) {
                    j0aVar2.U(lgf.F, mgf.F, ktk.a);
                } else if (!list.isEmpty()) {
                    j0aVar2.W(list.size(), bz7Var != null ? new s72(2, bz7Var, list) : null, new s72(3, bz7Var2, list), new ta4(802480018, true, new fr0(list, 6, ta4Var)));
                } else if (pz7Var != null) {
                    j0aVar2.U(lgf.G, mgf.G, new ta4(2002176087, true, new u3e(i4gVar, 5, pz7Var)));
                }
                if (hgfVar != null && hgfVar.b) {
                    j0aVar2.U(lgf.H, mgf.H, ktk.b);
                }
                j0aVar2.U(lgf.E, mgf.E, new ta4(1129542363, true, new k1a(i4gVar, i2)));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ nj1(Set set, pz7 pz7Var, List list, bz7 bz7Var, pl3 pl3Var, String str, boolean z, nwb nwbVar) {
        this.H = set;
        this.I = pz7Var;
        this.J = list;
        this.K = bz7Var;
        this.L = pl3Var;
        this.F = str;
        this.G = z;
        this.M = nwbVar;
    }

    public /* synthetic */ nj1(boolean z, List list, pz7 pz7Var, bz7 bz7Var, bz7 bz7Var2, hgf hgfVar, i4g i4gVar, ta4 ta4Var) {
        this.G = z;
        this.F = list;
        this.H = pz7Var;
        this.I = bz7Var;
        this.J = bz7Var2;
        this.K = hgfVar;
        this.L = i4gVar;
        this.M = ta4Var;
    }
}
