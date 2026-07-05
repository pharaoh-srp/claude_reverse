package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qif implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ cz5 F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ qif(cz5 cz5Var, nwb nwbVar, int i) {
        this.E = i;
        this.F = cz5Var;
        this.G = nwbVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        d5d d5dVar = h5d.a;
        f5d f5dVar = f5d.a;
        iei ieiVar = iei.a;
        nwb nwbVar = this.G;
        cz5 cz5Var = this.F;
        switch (i) {
            case 0:
                kw0 kw0Var = new kw0(17, (zy7) obj);
                qif qifVar = new qif(cz5Var, nwbVar, 1);
                if (!ipa.a()) {
                    pmf.n("Magnifier is only supported on API level 28 and higher.");
                    return null;
                }
                if (Build.VERSION.SDK_INT == 28) {
                    d5dVar = f5dVar;
                }
                return ipa.b(kw0Var, qifVar, d5dVar);
            case 1:
                za6 za6Var = (za6) obj;
                int iM0 = cz5Var.M0(za6.d(za6Var.a));
                nwbVar.setValue(new g79((((long) cz5Var.M0(za6.c(za6Var.a))) & 4294967295L) | (((long) iM0) << 32)));
                return ieiVar;
            case 2:
                kw0 kw0Var2 = new kw0(18, (zy7) obj);
                qif qifVar2 = new qif(cz5Var, nwbVar, 3);
                if (!ipa.a()) {
                    pmf.n("Magnifier is only supported on API level 28 and higher.");
                    return null;
                }
                if (Build.VERSION.SDK_INT == 28) {
                    d5dVar = f5dVar;
                }
                return ipa.b(kw0Var2, qifVar2, d5dVar);
            default:
                za6 za6Var2 = (za6) obj;
                int iM02 = cz5Var.M0(za6.d(za6Var2.a));
                nwbVar.setValue(new g79((((long) cz5Var.M0(za6.c(za6Var2.a))) & 4294967295L) | (((long) iM02) << 32)));
                return ieiVar;
        }
    }
}
