package defpackage;

import com.anthropic.claude.chat.dialogs.d;
import com.anthropic.claude.login.LoginScreens;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y53 implements zy7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ rwe G;

    public /* synthetic */ y53(zy7 zy7Var, rwe rweVar) {
        this.F = zy7Var;
        this.G = rweVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        rwe rweVar = this.G;
        zy7 zy7Var = this.F;
        switch (i) {
            case 0:
                d.b(rweVar);
                zy7Var.a();
                break;
            default:
                if (zy7Var != null && (iv1.t(rweVar) instanceof LoginScreens.Welcome)) {
                    zy7Var.a();
                }
                rweVar.E.m(be5.O, new ae5(19));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ y53(rwe rweVar, zy7 zy7Var) {
        this.G = rweVar;
        this.F = zy7Var;
    }
}
