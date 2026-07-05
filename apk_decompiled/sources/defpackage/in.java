package defpackage;

import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.sessions.types.SessionResource;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class in implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ zy7 I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Serializable K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ qz7 O;
    public final /* synthetic */ Object P;

    public /* synthetic */ in(ml3 ml3Var, String str, ArrayList arrayList, SessionResource sessionResource, String str2, rk rkVar, Boolean bool, bz7 bz7Var, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, int i) {
        this.J = ml3Var;
        this.F = str;
        this.K = arrayList;
        this.L = sessionResource;
        this.G = str2;
        this.M = rkVar;
        this.N = bool;
        this.O = bz7Var;
        this.H = zy7Var;
        this.I = zy7Var2;
        this.P = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.P;
        qz7 qz7Var = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        Object obj6 = this.L;
        Serializable serializable = this.K;
        Object obj7 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(1);
                cok.e((ml3) obj7, this.F, (ArrayList) serializable, (SessionResource) obj6, this.G, (rk) obj5, (Boolean) obj4, (bz7) qz7Var, this.H, this.I, (iqb) obj3, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(7);
                dtk.f((ta4) obj7, this.F, this.G, (String) serializable, (String) obj6, (String) obj5, (ToolDisplayContent) obj4, this.H, this.I, (zy7) qz7Var, (zy7) obj3, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ in(ta4 ta4Var, String str, String str2, String str3, String str4, String str5, ToolDisplayContent toolDisplayContent, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, int i) {
        this.J = ta4Var;
        this.F = str;
        this.G = str2;
        this.K = str3;
        this.L = str4;
        this.M = str5;
        this.N = toolDisplayContent;
        this.H = zy7Var;
        this.I = zy7Var2;
        this.O = zy7Var3;
        this.P = zy7Var4;
    }
}
