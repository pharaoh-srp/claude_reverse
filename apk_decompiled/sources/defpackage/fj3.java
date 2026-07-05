package defpackage;

import com.anthropic.claude.app.ClaudeAppDestination;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fj3 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zqc F;
    public final /* synthetic */ z93 G;

    public /* synthetic */ fj3(zqc zqcVar, z93 z93Var, int i) {
        this.E = i;
        this.F = zqcVar;
        this.G = z93Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        z93 z93Var = this.G;
        zqc zqcVar = this.F;
        switch (i) {
            case 0:
                iv1.H(zqcVar, new ClaudeAppDestination.Detail.Chat(z93.b(z93Var, null, null, null, 14)));
                break;
            default:
                ie3 ie3Var = (ie3) w44.V0(((te3) zqcVar.F.getValue()).b);
                if (!((ie3Var != null ? (ClaudeAppDestination.Detail) ie3Var.a : null) instanceof ClaudeAppDestination.Detail.Chat)) {
                    iv1.F(zqcVar, new ClaudeAppDestination.Detail.Chat(z93.b(z93Var, null, null, null, 14)));
                }
                break;
        }
        return ieiVar;
    }
}
