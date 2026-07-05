package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class luk extends nrj {
    public final /* synthetic */ int G = 2;
    public Object H;

    public luk(hsi hsiVar) {
        super("internal.logger");
        this.H = hsiVar;
        this.F.put("log", new d5l(this, false, true));
        this.F.put("silent", new ppj("silent", 2));
        ((nrj) this.F.get("silent")).o("log", new d5l(this, true, true));
        this.F.put("unmonitored", new ppj("unmonitored", 3));
        ((nrj) this.F.get("unmonitored")).o("log", new d5l(this, false, false));
    }

    @Override // defpackage.nrj
    public final lsj c(c61 c61Var, List list) {
        TreeMap treeMap;
        int i = this.G;
        String str = this.E;
        ltj ltjVar = lsj.v;
        String str2 = null;
        switch (i) {
            case 0:
                gqk.n(list, 3, str);
                String strH = ((mvd) c61Var.G).n(c61Var, (lsj) list.get(0)).h();
                lsj lsjVar = (lsj) list.get(1);
                mvd mvdVar = (mvd) c61Var.G;
                long jI = (long) gqk.i(mvdVar.n(c61Var, lsjVar).a().doubleValue());
                lsj lsjVarN = mvdVar.n(c61Var, (lsj) list.get(2));
                HashMap mapK = lsjVarN instanceof isj ? gqk.k((isj) lsjVarN) : new HashMap();
                lrb lrbVar = (lrb) this.H;
                lrbVar.getClass();
                HashMap map = new HashMap();
                for (String str3 : mapK.keySet()) {
                    HashMap map2 = ((bqj) lrbVar.F).c;
                    map.put(str3, bqj.b(map2.containsKey(str3) ? map2.get(str3) : null, mapK.get(str3), str3));
                }
                ((ArrayList) lrbVar.H).add(new bqj(strH, jI, map));
                return ltjVar;
            case 1:
                gqk.n(list, 2, "getValue");
                lsj lsjVarN2 = ((mvd) c61Var.G).n(c61Var, (lsj) list.get(0));
                lsj lsjVarN3 = ((mvd) c61Var.G).n(c61Var, (lsj) list.get(1));
                String strH2 = lsjVarN2.h();
                mvd mvdVar2 = (mvd) this.H;
                Map map3 = (Map) ((pkk) mvdVar2.G).H.get((String) mvdVar2.F);
                if (map3 != null && map3.containsKey(strH2)) {
                    str2 = (String) map3.get(strH2);
                }
                return str2 != null ? new qsj(str2) : lsjVarN3;
            case 2:
                return ltjVar;
            case 3:
                gqk.n(list, 3, str);
                ((mvd) c61Var.G).n(c61Var, (lsj) list.get(0)).h();
                lsj lsjVar2 = (lsj) list.get(1);
                mvd mvdVar3 = (mvd) c61Var.G;
                lsj lsjVarN4 = mvdVar3.n(c61Var, lsjVar2);
                if (lsjVarN4 instanceof osj) {
                    lsj lsjVarN5 = mvdVar3.n(c61Var, (lsj) list.get(2));
                    if (lsjVarN5 instanceof isj) {
                        isj isjVar = (isj) lsjVarN5;
                        HashMap map4 = isjVar.E;
                        if (map4.containsKey("type")) {
                            String strH3 = isjVar.b("type").h();
                            int iQ = map4.containsKey("priority") ? gqk.q(isjVar.b("priority").a().doubleValue()) : 1000;
                            ire ireVar = (ire) this.H;
                            osj osjVar = (osj) lsjVarN4;
                            ireVar.getClass();
                            if ("create".equals(strH3)) {
                                treeMap = (TreeMap) ireVar.G;
                            } else if ("edit".equals(strH3)) {
                                treeMap = (TreeMap) ireVar.F;
                            } else {
                                sz6.j(ij0.i("Unknown callback type: ", strH3));
                            }
                            if (treeMap.containsKey(Integer.valueOf(iQ))) {
                                iQ = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(iQ), osjVar);
                            return ltjVar;
                        }
                        sz6.p("Undefined rule type");
                    } else {
                        sz6.p("Invalid callback params");
                    }
                } else {
                    sz6.p("Invalid callback type");
                }
                return null;
            default:
                try {
                    return csk.l(((ukk) this.H).call());
                } catch (Exception unused) {
                    return ltjVar;
                }
        }
    }

    public /* synthetic */ luk(String str) {
        super(str);
    }

    public luk(ukk ukkVar) {
        super("internal.appMetadata");
        this.H = ukkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public luk(mvd mvdVar) {
        super("getValue");
        this.H = mvdVar;
    }

    public luk(lrb lrbVar) {
        super("internal.eventLogger");
        this.H = lrbVar;
    }
}
