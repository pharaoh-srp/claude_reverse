package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fb1 {
    public final dpf a;
    public final vdc b;

    public fb1(dpf dpfVar, vdc vdcVar) {
        this.a = dpfVar;
        this.b = vdcVar;
        if ((dpfVar == null ? vdcVar : dpfVar) != null) {
            return;
        }
        sz6.p("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void a(eb1 eb1Var) {
        dpf dpfVar = this.a;
        if (dpfVar != null) {
            dpf.t(dpfVar, (cb1) eb1Var.b);
            return;
        }
        vdc vdcVar = this.b;
        if (vdcVar == null) {
            sz6.j("Unreachable");
            return;
        }
        db1 db1Var = (db1) eb1Var.a;
        db1Var.getClass();
        pdc pdcVar = new pdc(db1Var, new rdc(null, db1Var));
        db1Var.a.add(pdcVar);
        dpf.t(vdcVar.b().c, pdcVar);
    }

    public final void b(eb1 eb1Var) throws Exception {
        if (this.a != null) {
            ((cb1) eb1Var.b).e();
        } else if (this.b != null) {
            ((db1) eb1Var.a).e();
        } else {
            sz6.j("Unreachable");
        }
    }
}
