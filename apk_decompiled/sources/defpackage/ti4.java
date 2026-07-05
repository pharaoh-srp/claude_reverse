package defpackage;

import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutput;
import com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutputConnectorsItem;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ti4 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ ti4(ml3 ml3Var, String str, boolean z, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, int i, int i2) {
        this.E = 6;
        this.J = ml3Var;
        this.K = str;
        this.F = z;
        this.M = bz7Var;
        this.L = zy7Var;
        this.G = iqbVar;
        this.H = i;
        this.I = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        Object obj3 = this.M;
        Object obj4 = this.G;
        Object obj5 = this.L;
        Object obj6 = this.K;
        Object obj7 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                wi4.a((DirectoryServer) obj7, (ek4) obj6, this.F, (zy7) obj5, (zy7) obj3, (iqb) obj4, (ld4) obj, iP0, this.I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                e05.a((ConwaySuggestConnectorsOutput) obj7, (ConwaySuggestConnectorsOutputConnectorsItem) obj6, this.F, (bz7) obj5, (bz7) obj3, (iqb) obj4, (ld4) obj, iP02, this.I);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                gwj.a((String) obj7, (bpc) obj6, this.F, (zy7) obj5, (x0a) obj3, (iqb) obj4, (ld4) obj, iP03, this.I);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP04 = x44.p0(i2 | 1);
                gpk.c((z4b) obj7, (List) obj6, (bz7) obj5, (iqb) obj4, this.F, (mnc) obj3, (ld4) obj, iP04, this.I);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iP05 = x44.p0(i2 | 1);
                ywj.d((String) obj7, (String) obj6, (iid) obj5, (iqb) obj4, (String) obj3, this.F, (ld4) obj, iP05, this.I);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iP06 = x44.p0(i2 | 1);
                ((tqh) obj7).y((ud0) obj6, (String) obj3, (wu8) obj4, this.F, (zy7) obj5, (ld4) obj, iP06, this.I);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iP07 = x44.p0(i2 | 1);
                kzj.d((ml3) obj7, (String) obj6, this.F, (bz7) obj3, (zy7) obj5, (iqb) obj4, (ld4) obj, iP07, this.I);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int iP08 = x44.p0(i2 | 1);
                tik.f((zy7) obj5, (iqb) obj4, (pz7) obj7, this.F, (cji) obj6, (qi3) obj3, (ld4) obj, iP08, this.I);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP09 = x44.p0(i2 | 1);
                e2i.b((u9d) obj7, (ta4) obj6, (l2i) obj5, (iqb) obj4, this.F, (pz7) obj3, (ld4) obj, iP09, this.I);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ti4(zy7 zy7Var, iqb iqbVar, pz7 pz7Var, boolean z, cji cjiVar, qi3 qi3Var, int i, int i2) {
        this.E = 7;
        this.L = zy7Var;
        this.G = iqbVar;
        this.J = pz7Var;
        this.F = z;
        this.K = cjiVar;
        this.M = qi3Var;
        this.H = i;
        this.I = i2;
    }

    public /* synthetic */ ti4(tqh tqhVar, ud0 ud0Var, String str, wu8 wu8Var, boolean z, zy7 zy7Var, int i, int i2) {
        this.E = 5;
        this.J = tqhVar;
        this.K = ud0Var;
        this.M = str;
        this.G = wu8Var;
        this.F = z;
        this.L = zy7Var;
        this.H = i;
        this.I = i2;
    }

    public /* synthetic */ ti4(Object obj, Object obj2, Object obj3, iqb iqbVar, boolean z, Object obj4, int i, int i2, int i3) {
        this.E = i3;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
        this.G = iqbVar;
        this.F = z;
        this.M = obj4;
        this.H = i;
        this.I = i2;
    }

    public /* synthetic */ ti4(Object obj, Object obj2, boolean z, qz7 qz7Var, Object obj3, iqb iqbVar, int i, int i2, int i3) {
        this.E = i3;
        this.J = obj;
        this.K = obj2;
        this.F = z;
        this.L = qz7Var;
        this.M = obj3;
        this.G = iqbVar;
        this.H = i;
        this.I = i2;
    }

    public /* synthetic */ ti4(String str, String str2, iid iidVar, iqb iqbVar, String str3, boolean z, int i, int i2) {
        this.E = 4;
        this.J = str;
        this.K = str2;
        this.L = iidVar;
        this.G = iqbVar;
        this.M = str3;
        this.F = z;
        this.H = i;
        this.I = i2;
    }
}
