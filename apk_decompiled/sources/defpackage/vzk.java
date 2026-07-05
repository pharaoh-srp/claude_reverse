package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class vzk extends isj {
    public final lrb F;

    public vzk(lrb lrbVar) {
        this.F = lrbVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.isj, defpackage.lsj
    public final lsj m(String str, c61 c61Var, ArrayList arrayList) {
        byte b = -1;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    b = 0;
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    b = 1;
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    b = 2;
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    b = 3;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    b = 4;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    b = 5;
                }
                break;
        }
        lrb lrbVar = this.F;
        switch (b) {
            case 0:
                gqk.n(arrayList, 0, "getEventName");
                return new qsj(((bqj) lrbVar.G).a);
            case 1:
                gqk.n(arrayList, 0, "getTimestamp");
                return new yqj(Double.valueOf(((bqj) lrbVar.G).b));
            case 2:
                gqk.n(arrayList, 1, "getParamValue");
                String strH = ((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(0)).h();
                HashMap map = ((bqj) lrbVar.G).c;
                return csk.l(map.containsKey(strH) ? map.get(strH) : null);
            case 3:
                gqk.n(arrayList, 0, "getParams");
                HashMap map2 = ((bqj) lrbVar.G).c;
                isj isjVar = new isj();
                for (String str2 : map2.keySet()) {
                    isjVar.o(str2, csk.l(map2.get(str2)));
                }
                return isjVar;
            case 4:
                gqk.n(arrayList, 2, "setParamValue");
                String strH2 = ((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(0)).h();
                lsj lsjVarN = ((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(1));
                bqj bqjVar = (bqj) lrbVar.G;
                Object objJ = gqk.j(lsjVarN);
                HashMap map3 = bqjVar.c;
                if (objJ == null) {
                    map3.remove(strH2);
                    return lsjVarN;
                }
                map3.put(strH2, bqj.b(map3.get(strH2), objJ, strH2));
                return lsjVarN;
            case 5:
                gqk.n(arrayList, 1, "setEventName");
                lsj lsjVarN2 = ((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(0));
                if (lsj.v.equals(lsjVarN2) || lsj.w.equals(lsjVarN2)) {
                    sz6.p("Illegal event name");
                    return null;
                }
                ((bqj) lrbVar.G).a = lsjVarN2.h();
                return new qsj(lsjVarN2.h());
            default:
                return super.m(str, c61Var, arrayList);
        }
    }
}
