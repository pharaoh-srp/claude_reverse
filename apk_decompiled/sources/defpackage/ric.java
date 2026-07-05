package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ric extends ln7 {
    public static final ric d = new ric(0, 1, 1);

    @Override // defpackage.ln7
    public final void c(gjc gjcVar, hn0 hn0Var, vag vagVar, p60 p60Var, fjc fjcVar) {
        r7e r7eVar = (r7e) gjcVar.b(0);
        Set set = (Set) p60Var.E;
        if (set == null) {
            return;
        }
        svc svcVar = new svc(set);
        ewb ewbVar = (ewb) p60Var.M;
        if (ewbVar == null) {
            long[] jArr = u6f.a;
            ewbVar = new ewb();
            p60Var.M = ewbVar;
        }
        ewbVar.m(r7eVar, svcVar);
        ((wwb) p60Var.I).b(new i18(svcVar, -1));
    }
}
