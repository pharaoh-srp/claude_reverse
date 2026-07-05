package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class osj extends nrj {
    public final ArrayList G;
    public final ArrayList H;
    public final c61 I;

    public osj(String str, ArrayList arrayList, List list, c61 c61Var) {
        super(str);
        this.G = new ArrayList();
        this.I = c61Var;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.G.add(((lsj) it.next()).h());
            }
        }
        this.H = new ArrayList(list);
    }

    @Override // defpackage.nrj
    public final lsj c(c61 c61Var, List list) {
        ltj ltjVar;
        c61 c61VarL = this.I.L();
        mvd mvdVar = (mvd) c61VarL.G;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.G;
            int size = arrayList.size();
            ltjVar = lsj.v;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                c61VarL.Q((String) arrayList.get(i), ((mvd) c61Var.G).n(c61Var, (lsj) list.get(i)));
            } else {
                c61VarL.Q((String) arrayList.get(i), ltjVar);
            }
            i++;
        }
        for (lsj lsjVar : this.H) {
            lsj lsjVarN = mvdVar.n(c61VarL, lsjVar);
            if (lsjVarN instanceof tsj) {
                lsjVarN = mvdVar.n(c61VarL, lsjVar);
            }
            if (lsjVarN instanceof drj) {
                return ((drj) lsjVarN).E;
            }
        }
        return ltjVar;
    }

    @Override // defpackage.nrj, defpackage.lsj
    public final lsj l() {
        return new osj(this);
    }

    public osj(osj osjVar) {
        super(osjVar.E);
        ArrayList arrayList = new ArrayList(osjVar.G.size());
        this.G = arrayList;
        arrayList.addAll(osjVar.G);
        ArrayList arrayList2 = new ArrayList(osjVar.H.size());
        this.H = arrayList2;
        arrayList2.addAll(osjVar.H);
        this.I = osjVar.I;
    }
}
