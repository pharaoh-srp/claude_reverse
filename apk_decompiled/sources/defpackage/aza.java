package defpackage;

import com.anthropic.claude.code.remote.CodeRemoteSessionScreenParams;
import com.anthropic.claude.mcpapps.transport.ContainerDimensions;
import com.anthropic.claude.mcpapps.transport.SafeAreaInsets;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aza implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ zy7 J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ iqb L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ int P;

    public /* synthetic */ aza(CodeRemoteSessionScreenParams codeRemoteSessionScreenParams, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, iqb iqbVar, b1i b1iVar, qi3 qi3Var, ysg ysgVar, fk0 fk0Var, int i) {
        this.E = 2;
        this.F = codeRemoteSessionScreenParams;
        this.J = zy7Var;
        this.G = zy7Var2;
        this.H = zy7Var3;
        this.I = zy7Var4;
        this.L = iqbVar;
        this.K = b1iVar;
        this.M = qi3Var;
        this.N = ysgVar;
        this.O = fk0Var;
        this.P = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.P;
        Object obj3 = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        Object obj6 = this.K;
        Object obj7 = this.I;
        Object obj8 = this.H;
        Object obj9 = this.G;
        Object obj10 = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                lok.b((String) obj10, (fj0) obj9, (SafeAreaInsets) obj8, (ContainerDimensions) obj7, this.J, (bz7) obj6, this.L, (bg9) obj5, (mn5) obj4, (b4e) obj3, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                lok.b((String) obj10, (fj0) obj9, (SafeAreaInsets) obj8, (ContainerDimensions) obj7, this.J, (bz7) obj6, this.L, (bg9) obj5, (mn5) obj4, (b4e) obj3, (ld4) obj, iP02);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                g34.a((CodeRemoteSessionScreenParams) obj10, this.J, (zy7) obj9, (zy7) obj8, (zy7) obj7, this.L, (b1i) obj6, (qi3) obj5, (ysg) obj4, (fk0) obj3, (ld4) obj, iP03);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ aza(String str, fj0 fj0Var, SafeAreaInsets safeAreaInsets, ContainerDimensions containerDimensions, zy7 zy7Var, bz7 bz7Var, iqb iqbVar, bg9 bg9Var, mn5 mn5Var, b4e b4eVar, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = fj0Var;
        this.H = safeAreaInsets;
        this.I = containerDimensions;
        this.J = zy7Var;
        this.K = bz7Var;
        this.L = iqbVar;
        this.M = bg9Var;
        this.N = mn5Var;
        this.O = b4eVar;
        this.P = i;
    }
}
