package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class be4 implements zmc {
    public final List a;
    public final String b;

    public be4(List list, String str) {
        this.a = list;
        this.b = str;
        list.size();
        w44.t1(list).size();
    }

    @Override // defpackage.zmc
    public final boolean a(ww7 ww7Var) {
        ww7Var.getClass();
        List list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!j8.S((zmc) it.next(), ww7Var)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.zmc
    public final void b(ww7 ww7Var, ArrayList arrayList) {
        ww7Var.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            j8.v((zmc) it.next(), ww7Var, arrayList);
        }
    }

    @Override // defpackage.zmc
    public final Collection g(ww7 ww7Var, bz7 bz7Var) {
        ww7Var.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((zmc) it.next()).g(ww7Var, bz7Var));
        }
        return hashSet;
    }

    public final String toString() {
        return this.b;
    }
}
