package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class f6l extends nrj {
    public final w05 G;
    public final HashMap H;

    public f6l(w05 w05Var) {
        super("require");
        this.H = new HashMap();
        this.G = w05Var;
    }

    @Override // defpackage.nrj
    public final lsj c(c61 c61Var, List list) {
        lsj lsjVar;
        gqk.n(list, 1, "require");
        String strH = ((mvd) c61Var.G).n(c61Var, (lsj) list.get(0)).h();
        HashMap map = this.H;
        if (map.containsKey(strH)) {
            return (lsj) map.get(strH);
        }
        HashMap map2 = this.G.a;
        if (map2.containsKey(strH)) {
            try {
                lsjVar = (lsj) ((Callable) map2.get(strH)).call();
            } catch (Exception unused) {
                sz6.j(ij0.i("Failed to create API implementation: ", strH));
                return null;
            }
        } else {
            lsjVar = lsj.v;
        }
        if (lsjVar instanceof nrj) {
            map.put(strH, (nrj) lsjVar);
        }
        return lsjVar;
    }
}
