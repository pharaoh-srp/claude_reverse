package defpackage;

import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o24 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ i F;

    public /* synthetic */ o24(i iVar, int i) {
        this.E = i;
        this.F = iVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        tp4 tp4Var = null;
        iei ieiVar = iei.a;
        i iVar = this.F;
        switch (i) {
            case 0:
                iVar.k1.setValue(Boolean.FALSE);
                iVar.j1();
                break;
            case 1:
                iVar.i1.setValue(Boolean.TRUE);
                break;
            case 2:
                iVar.k1.setValue(Boolean.FALSE);
                iVar.j1();
                break;
            case 3:
                iVar.j1.setValue(Boolean.FALSE);
                break;
            case 4:
                break;
            case 5:
                iVar.d0();
                iVar.M1 = iVar.H0();
                iVar.b0();
                if (!iVar.R0()) {
                    String str = iVar.d.m;
                    String strE0 = iVar.E0();
                    int i2 = 1;
                    boolean zM1117equalsimpl0 = false;
                    if (str == null) {
                        if (strE0 == null) {
                            zM1117equalsimpl0 = true;
                        }
                    } else if (strE0 != null) {
                        zM1117equalsimpl0 = SessionId.m1117equalsimpl0(str, strE0);
                    }
                    if (zM1117equalsimpl0) {
                        iqf iqfVar = iVar.y0;
                        amg amgVar = iqfVar.j;
                        if (amgVar.getValue() == null) {
                            amgVar.n(null, "pending");
                            gb9.D(iqfVar.b, null, null, new gqf(iqfVar, tp4Var, i2), 3);
                        }
                    }
                }
                break;
            default:
                iVar.Z1.setValue(null);
                break;
        }
        return ieiVar;
    }
}
