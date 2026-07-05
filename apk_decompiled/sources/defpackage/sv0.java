package defpackage;

import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sv0 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ lvh F;

    public /* synthetic */ sv0(lvh lvhVar, int i) {
        this.E = i;
        this.F = lvhVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        lvh lvhVar = this.F;
        switch (i) {
            case 0:
                zy7 zy7Var = lvhVar.j;
                if (zy7Var == null) {
                    sz6.p("Required value was null.");
                } else {
                    zy7Var.a();
                }
                break;
            case 1:
                gh2 gh2Var = lvhVar.b;
                if (gh2Var != null) {
                    gh2Var.r(new pt6(R.string.connector_discovery_opt_in_save_failed));
                }
                break;
            default:
                gh2 gh2Var2 = lvhVar.b;
                if (gh2Var2 != null) {
                    gh2Var2.r(new pt6(R.string.connector_discovery_opt_in_save_failed));
                }
                break;
        }
        return ieiVar;
    }
}
