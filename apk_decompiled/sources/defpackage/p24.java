package defpackage;

import com.anthropic.claude.code.remote.i;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p24 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ fk0 F;
    public final /* synthetic */ i G;
    public final /* synthetic */ nwb H;

    public /* synthetic */ p24(fk0 fk0Var, i iVar, nwb nwbVar, int i) {
        this.E = i;
        this.F = fk0Var;
        this.G = iVar;
        this.H = nwbVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.H;
        i iVar = this.G;
        fk0 fk0Var = this.F;
        switch (i) {
            case 0:
                if (!fk0Var.g()) {
                    iVar.j1.setValue(Boolean.TRUE);
                } else {
                    ((zy7) nwbVar.getValue()).a();
                }
                break;
            default:
                fk0Var.t(true);
                iVar.j1.setValue(Boolean.FALSE);
                ((zy7) nwbVar.getValue()).a();
                break;
        }
        return ieiVar;
    }
}
