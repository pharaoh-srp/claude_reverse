package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class xic extends ln7 {
    public static final xic d = new xic(0, 1, 1);

    @Override // defpackage.ln7
    public final void c(gjc gjcVar, hn0 hn0Var, vag vagVar, p60 p60Var, fjc fjcVar) {
        r7e r7eVar = (r7e) gjcVar.b(0);
        ewb ewbVar = (ewb) p60Var.M;
        svc svcVar = ewbVar != null ? (svc) ewbVar.g(r7eVar) : null;
        if (svcVar != null) {
            ArrayList arrayList = (ArrayList) p60Var.N;
            if (arrayList == null) {
                arrayList = new ArrayList();
                p60Var.N = arrayList;
            }
            arrayList.add((wwb) p60Var.I);
            p60Var.I = svcVar.F;
        }
    }
}
