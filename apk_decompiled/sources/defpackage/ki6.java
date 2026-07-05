package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class ki6 implements bl4 {
    public static final xh6 H = new xh6(3);
    public static final xh6 I = new xh6(4);
    public static final xh6 J = new xh6(5);
    public final /* synthetic */ int E;
    public Object F;
    public volatile Object G;

    public ki6(int i) {
        this.E = i;
        switch (i) {
            case 1:
                this.F = new CopyOnWriteArraySet();
                break;
            case 2:
                l4i l4iVar = l4i.G;
                this.F = new LinkedList();
                this.G = l4iVar;
                break;
        }
    }

    public static HashMap a(Set set, yz7 yz7Var) {
        HashMap map = new HashMap((set.size() * 4) / 3);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            map.put((String) H.apply(entry), (String) yz7Var.apply(entry));
        }
        return new HashMap(map);
    }

    @Override // defpackage.bl4
    public synchronized void b() {
        ((LinkedList) this.F).clear();
    }

    @Override // defpackage.bl4
    public synchronized void c(wk4 wk4Var) {
        ((LinkedList) this.F).remove(wk4Var);
    }

    @Override // defpackage.bl4
    public synchronized void g(l4i l4iVar) {
        if (l4iVar == ((l4i) this.G)) {
            return;
        }
        l4i l4iVar2 = (l4i) this.G;
        this.G = l4iVar;
        for (wk4 wk4Var : (LinkedList) this.F) {
            wk4Var.getClass();
            l4iVar2.getClass();
            l4i l4iVar3 = l4iVar;
            v40.p(wk4Var.H, "Data migration", wk4Var.I, new lg1(wk4Var, l4iVar2, wk4Var.a(l4iVar2), l4iVar3, wk4Var.a(l4iVar), 1));
            l4iVar = l4iVar3;
        }
    }

    @Override // defpackage.bl4
    public l4i m() {
        return (l4i) this.G;
    }

    @Override // defpackage.bl4
    public synchronized void q(wk4 wk4Var) {
        ((LinkedList) this.F).add(wk4Var);
    }

    public String toString() {
        switch (this.E) {
            case 0:
                return ((l35) this.G).toString();
            default:
                return super.toString();
        }
    }
}
