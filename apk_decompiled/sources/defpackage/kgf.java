package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kgf implements bz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ wlg F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ kgf(wlg wlgVar, nwb nwbVar) {
        this.F = wlgVar;
        this.G = nwbVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        nwb nwbVar = this.G;
        wlg wlgVar = this.F;
        switch (i) {
            case 0:
                ((r4a) obj).getClass();
                if (((Boolean) wlgVar.getValue()).booleanValue()) {
                    ((hgf) nwbVar.getValue()).c.a();
                }
                return new le(25);
            default:
                xre xreVar = (xre) obj;
                xreVar.getClass();
                xreVar.f(((List) nwbVar.getValue()).isEmpty() ? null : (vfe) qqg.E.invoke((List) nwbVar.getValue(), wlgVar.getValue()));
                return iei.a;
        }
    }

    public /* synthetic */ kgf(nqg nqgVar, nb0 nb0Var, nwb nwbVar) {
        this.F = nb0Var;
        this.G = nwbVar;
    }
}
