package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class iic extends ln7 {
    public static final iic d = new iic(0, 1, 1);

    @Override // defpackage.ln7
    public final void c(gjc gjcVar, hn0 hn0Var, vag vagVar, p60 p60Var, fjc fjcVar) {
        wwb wwbVar;
        r7e r7eVar = (r7e) gjcVar.b(0);
        ewb ewbVar = (ewb) p60Var.M;
        if (ewbVar == null || ((svc) ewbVar.g(r7eVar)) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) p60Var.N;
        if (arrayList != null && (wwbVar = (wwb) arrayList.remove(arrayList.size() - 1)) != null) {
            p60Var.I = wwbVar;
        }
        ewbVar.k(r7eVar);
    }
}
