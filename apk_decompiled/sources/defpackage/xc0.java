package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xc0 implements wc0 {
    public final /* synthetic */ int E;
    public final Object F;

    public xc0(wc0[] wc0VarArr) {
        this.E = 1;
        this.F = mp0.Y0(wc0VarArr);
    }

    @Override // defpackage.wc0
    public final jc0 P(ww7 ww7Var) {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return bsk.c(this, ww7Var);
            case 1:
                ww7Var.getClass();
                return (jc0) bnf.W(bnf.c0(w44.E0((List) obj), new td4(ww7Var, 0)));
            default:
                ww7Var.getClass();
                if (ww7Var.equals((ww7) obj)) {
                    return so6.a;
                }
                return null;
        }
    }

    @Override // defpackage.wc0
    public final boolean isEmpty() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return ((List) obj).isEmpty();
            case 1:
                List list = (List) obj;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((wc0) it.next()).isEmpty()) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return ((List) obj).iterator();
            case 1:
                return new qn7(new rn7(w44.E0((List) obj), ex.g0, enf.E));
            default:
                return km6.E;
        }
    }

    public String toString() {
        switch (this.E) {
            case 0:
                return ((List) this.F).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.wc0
    public final boolean x(ww7 ww7Var) {
        switch (this.E) {
            case 1:
                ww7Var.getClass();
                Iterator it = ((Iterable) w44.E0((List) this.F).b).iterator();
                while (it.hasNext()) {
                    if (((wc0) it.next()).x(ww7Var)) {
                        break;
                    }
                }
                break;
        }
        return bsk.d(this, ww7Var);
    }

    public /* synthetic */ xc0(List list, int i) {
        this.E = i;
        this.F = list;
    }

    public xc0(ww7 ww7Var) {
        this.E = 2;
        ww7Var.getClass();
        this.F = ww7Var;
    }
}
