package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r9i implements Iterable, mm9 {
    public static final cbf F = new cbf(14);
    public static final r9i G = new r9i(lm6.E);
    public final ap0 E;

    public r9i(List list) {
        this.E = fm6.E;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yc0 yc0Var = (yc0) it.next();
            yc0Var.getClass();
            int iG = F.g(yc0.b());
            int iA = this.E.a();
            if (iA != 0) {
                if (iA == 1) {
                    ap0 ap0Var = this.E;
                    ap0Var.getClass();
                    rgc rgcVar = (rgc) ap0Var;
                    if (rgcVar.g() == iG) {
                        this.E = new rgc(yc0Var, iG);
                    } else {
                        dp0 dp0Var = new dp0();
                        this.E = dp0Var;
                        dp0Var.e(rgcVar.g(), rgcVar.h());
                    }
                }
                this.E.e(iG, yc0Var);
            } else {
                this.E = new rgc(yc0Var, iG);
            }
        }
    }

    public final boolean isEmpty() {
        return this.E.a() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.E.iterator();
    }
}
