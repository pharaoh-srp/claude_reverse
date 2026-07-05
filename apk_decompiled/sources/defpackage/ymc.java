package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ymc implements zmc {
    public final ArrayList a;

    public ymc(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.zmc
    public final boolean a(ww7 ww7Var) {
        ww7Var.getClass();
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (x44.r(((xmc) ((wmc) it.next())).I, ww7Var)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.zmc
    public final void b(ww7 ww7Var, ArrayList arrayList) {
        ww7Var.getClass();
        for (Object obj : this.a) {
            if (x44.r(((xmc) ((wmc) obj)).I, ww7Var)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // defpackage.zmc
    public final Collection g(ww7 ww7Var, bz7 bz7Var) {
        ww7Var.getClass();
        return bnf.e0(bnf.V(bnf.b0(new c54(0, this.a), f06.j0), new td4(ww7Var, 1)));
    }
}
