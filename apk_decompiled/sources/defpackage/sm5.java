package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sm5 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    public /* synthetic */ sm5(int i, int i2) {
        this.E = i2;
        this.F = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        int iAbs = this.F;
        switch (i) {
            case 0:
                ((Integer) obj).intValue();
                break;
            case 1:
                return Boolean.valueOf(((Integer) obj).intValue() >= iAbs);
            case 2:
                iAbs = Math.abs(iAbs - ((Integer) obj).intValue());
                break;
            case 3:
                gj7 gj7Var = (gj7) obj;
                gj7Var.getClass();
                gj7Var.evaluateJavascript("document.documentElement.style.setProperty('--bottom-inset','" + iAbs + "px')", null);
                return ieiVar;
            case 4:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return Boolean.valueOf(((Number) entry.getValue()).intValue() == iAbs);
            default:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                p44 p44Var = new p44(0, iAbs);
                wn9[] wn9VarArr = ckf.a;
                dkf dkfVar = akf.g;
                wn9 wn9Var = ckf.a[25];
                ekfVar.a(dkfVar, p44Var);
                ckf.e(ekfVar);
                return ieiVar;
        }
        return Integer.valueOf(iAbs);
    }
}
