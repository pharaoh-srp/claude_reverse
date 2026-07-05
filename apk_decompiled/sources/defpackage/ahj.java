package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ahj {
    public final cve a;
    public final u52 b = new u52(7);

    public ahj(cve cveVar) {
        this.a = cveVar;
    }

    public final void a(lze lzeVar, bp0 bp0Var) {
        xo0 xo0Var = (xo0) bp0Var.keySet();
        if (xo0Var.isEmpty()) {
            return;
        }
        if (bp0Var.G > 999) {
            elk.f(bp0Var, new zgj(this, lzeVar, 0));
            return;
        }
        StringBuilder sbO = ij0.o("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        yfd.k(xo0Var.size(), sbO);
        sbO.append(")");
        tze tzeVarL0 = lzeVar.L0(sbO.toString());
        Iterator it = xo0Var.iterator();
        int i = 1;
        while (true) {
            v09 v09Var = (v09) it;
            if (!v09Var.hasNext()) {
                try {
                    break;
                } finally {
                    tzeVarL0.close();
                }
            } else {
                tzeVarL0.N(i, (String) v09Var.next());
                i++;
            }
        }
        tzeVarL0.getClass();
        int iM = iv1.m(tzeVarL0, "work_spec_id");
        if (iM == -1) {
            return;
        }
        while (tzeVarL0.H0()) {
            List list = (List) bp0Var.get(tzeVarL0.g0(iM));
            if (list != null) {
                byte[] blob = tzeVarL0.getBlob(0);
                pf5 pf5Var = pf5.b;
                list.add(rvk.j(blob));
            }
        }
    }

    public final void b(lze lzeVar, bp0 bp0Var) {
        xo0 xo0Var = (xo0) bp0Var.keySet();
        if (xo0Var.isEmpty()) {
            return;
        }
        if (bp0Var.G > 999) {
            elk.f(bp0Var, new zgj(this, lzeVar, 1));
            return;
        }
        StringBuilder sbO = ij0.o("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        yfd.k(xo0Var.size(), sbO);
        sbO.append(")");
        tze tzeVarL0 = lzeVar.L0(sbO.toString());
        Iterator it = xo0Var.iterator();
        int i = 1;
        while (true) {
            v09 v09Var = (v09) it;
            if (!v09Var.hasNext()) {
                try {
                    break;
                } finally {
                    tzeVarL0.close();
                }
            } else {
                tzeVarL0.N(i, (String) v09Var.next());
                i++;
            }
        }
        tzeVarL0.getClass();
        int iM = iv1.m(tzeVarL0, "work_spec_id");
        if (iM == -1) {
            return;
        }
        while (tzeVarL0.H0()) {
            List list = (List) bp0Var.get(tzeVarL0.g0(iM));
            if (list != null) {
                list.add(tzeVarL0.g0(0));
            }
        }
    }

    public final zfj c(String str) {
        str.getClass();
        return (zfj) u00.E(this.a, true, false, new hti(str, 7));
    }

    public final tgj d(String str) {
        str.getClass();
        return (tgj) u00.E(this.a, true, false, new hti(str, 9));
    }

    public final void e(long j, String str) {
        str.getClass();
        ((Number) u00.E(this.a, false, true, new ygj(j, 0, str))).intValue();
    }

    public final void f(int i, String str) {
        str.getClass();
        u00.E(this.a, false, true, new wy8(str, i, 2));
    }

    public final void g(long j, String str) {
        str.getClass();
        u00.E(this.a, false, true, new ygj(j, 1, str));
    }

    public final void h(zfj zfjVar, String str) {
        str.getClass();
        ((Number) u00.E(this.a, false, true, new nif(zfjVar, 21, str))).intValue();
    }

    public final void i(int i, String str) {
        str.getClass();
        u00.E(this.a, false, true, new wy8(i, str));
    }
}
