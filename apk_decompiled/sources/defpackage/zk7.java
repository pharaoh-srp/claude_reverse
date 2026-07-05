package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zk7 implements wc0 {
    public final wc0 E;
    public final dah F;

    public zk7(wc0 wc0Var, dah dahVar) {
        this.E = wc0Var;
        this.F = dahVar;
    }

    @Override // defpackage.wc0
    public final jc0 P(ww7 ww7Var) {
        ww7Var.getClass();
        if (((Boolean) this.F.invoke(ww7Var)).booleanValue()) {
            return this.E.P(ww7Var);
        }
        return null;
    }

    @Override // defpackage.wc0
    public final boolean isEmpty() {
        wc0 wc0Var = this.E;
        if ((wc0Var instanceof Collection) && ((Collection) wc0Var).isEmpty()) {
            return false;
        }
        Iterator it = wc0Var.iterator();
        while (it.hasNext()) {
            ww7 ww7VarE = ((jc0) it.next()).e();
            if (ww7VarE != null && ((Boolean) this.F.invoke(ww7VarE)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.E) {
            ww7 ww7VarE = ((jc0) obj).e();
            if (ww7VarE != null && ((Boolean) this.F.invoke(ww7VarE)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // defpackage.wc0
    public final boolean x(ww7 ww7Var) {
        ww7Var.getClass();
        if (((Boolean) this.F.invoke(ww7Var)).booleanValue()) {
            return this.E.x(ww7Var);
        }
        return false;
    }
}
