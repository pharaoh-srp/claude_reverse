package io.sentry;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j2 {
    public final ArrayList a;

    public j2(List list) {
        this.a = new ArrayList(list == null ? new ArrayList(0) : list);
    }

    public e2 a() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (e2) arrayList.get(arrayList.size() - 1);
    }

    public ArrayList b() {
        return this.a;
    }

    public boolean c() {
        if (this.a.size() == 1) {
            return true;
        }
        e2 e2VarA = a();
        e();
        if (!(a() instanceof h2)) {
            if (!(a() instanceof f2)) {
                return false;
            }
            f2 f2Var = (f2) a();
            if (e2VarA == null || f2Var == null) {
                return false;
            }
            f2Var.a.add(e2VarA.getValue());
            return false;
        }
        h2 h2Var = (h2) a();
        e();
        g2 g2Var = (g2) a();
        if (h2Var == null || e2VarA == null || g2Var == null) {
            return false;
        }
        g2Var.a.put(h2Var.a, e2VarA.getValue());
        return false;
    }

    public boolean d(d2 d2Var) {
        Object objC = d2Var.c();
        if (a() == null && objC != null) {
            this.a.add(new i2(objC));
            return true;
        }
        if (a() instanceof h2) {
            h2 h2Var = (h2) a();
            e();
            ((g2) a()).a.put(h2Var.a, objC);
            return false;
        }
        if (!(a() instanceof f2)) {
            return false;
        }
        ((f2) a()).a.add(objC);
        return false;
    }

    public void e() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    public j2() {
        this.a = new ArrayList();
    }
}
