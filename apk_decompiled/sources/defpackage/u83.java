package defpackage;

import com.anthropic.claude.code.remote.e;

/* JADX INFO: loaded from: classes2.dex */
public final class u83 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;

    public /* synthetic */ u83(int i, nwb nwbVar) {
        this.E = i;
        this.F = nwbVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.F;
        switch (i) {
            case 0:
                iqb iqbVar = e93.a;
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 1:
                iqb iqbVar2 = e93.a;
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 2:
                iqb iqbVar3 = e93.a;
                nwbVar.setValue(null);
                break;
            default:
                ad9 ad9Var = e.a;
                nwbVar.setValue(null);
                break;
        }
        return ieiVar;
    }
}
