package defpackage;

import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.tool.model.SuggestConnectorsOutputConnectorsItem;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class red implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ String H;
    public final /* synthetic */ iqb I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ qz7 P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ red(u3g u3gVar, x3g x3gVar, String str, boolean z, bz7 bz7Var, ta4 ta4Var, zy7 zy7Var, mnc mncVar, iqb iqbVar, boolean z2, int i, int i2) {
        this.N = u3gVar;
        this.O = x3gVar;
        this.H = str;
        this.F = z;
        this.P = bz7Var;
        this.Q = ta4Var;
        this.G = zy7Var;
        this.J = mncVar;
        this.I = iqbVar;
        this.K = z2;
        this.L = i;
        this.M = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.L;
        qz7 qz7Var = this.P;
        Object obj3 = this.J;
        Object obj4 = this.Q;
        Object obj5 = this.O;
        Object obj6 = this.N;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                mwj.c((MessageImageAsset) obj6, (ej7) obj5, this.G, (zy7) qz7Var, (zy7) obj4, this.I, this.H, (String) obj3, this.F, this.K, (ld4) obj, iP0, this.M);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                ywj.b(this.F, this.G, this.H, (iid) obj6, this.I, (String) obj3, (String) obj5, (pz7) qz7Var, this.K, (pl3) obj4, (ld4) obj, iP02, this.M);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                jpi.e((u3g) obj6, (x3g) obj5, this.H, this.F, (bz7) qz7Var, (ta4) obj4, this.G, (mnc) obj3, this.I, this.K, (ld4) obj, iP03, this.M);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP04 = x44.p0(i2 | 1);
                zxg.a(this.H, (List) obj6, this.F, this.K, (SuggestConnectorsOutputConnectorsItem) obj5, this.G, (bz7) obj4, (bz7) obj3, (zy7) qz7Var, this.I, (ld4) obj, iP04, this.M);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ red(MessageImageAsset messageImageAsset, ej7 ej7Var, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar, String str, String str2, boolean z, boolean z2, int i, int i2) {
        this.N = messageImageAsset;
        this.O = ej7Var;
        this.G = zy7Var;
        this.P = zy7Var2;
        this.Q = zy7Var3;
        this.I = iqbVar;
        this.H = str;
        this.J = str2;
        this.F = z;
        this.K = z2;
        this.L = i;
        this.M = i2;
    }

    public /* synthetic */ red(String str, List list, boolean z, boolean z2, SuggestConnectorsOutputConnectorsItem suggestConnectorsOutputConnectorsItem, zy7 zy7Var, bz7 bz7Var, bz7 bz7Var2, zy7 zy7Var2, iqb iqbVar, int i, int i2) {
        this.H = str;
        this.N = list;
        this.F = z;
        this.K = z2;
        this.O = suggestConnectorsOutputConnectorsItem;
        this.G = zy7Var;
        this.Q = bz7Var;
        this.J = bz7Var2;
        this.P = zy7Var2;
        this.I = iqbVar;
        this.L = i;
        this.M = i2;
    }

    public /* synthetic */ red(boolean z, zy7 zy7Var, String str, iid iidVar, iqb iqbVar, String str2, String str3, pz7 pz7Var, boolean z2, pl3 pl3Var, int i, int i2) {
        this.F = z;
        this.G = zy7Var;
        this.H = str;
        this.N = iidVar;
        this.I = iqbVar;
        this.J = str2;
        this.O = str3;
        this.P = pz7Var;
        this.K = z2;
        this.Q = pl3Var;
        this.L = i;
        this.M = i2;
    }
}
