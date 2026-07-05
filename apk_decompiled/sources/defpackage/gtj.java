package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gtj {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ int b;

    public gtj(int i) {
        this.b = i;
    }

    public static lsj a(iwj iwjVar, Iterator it, lsj lsjVar) {
        if (it != null) {
            while (it.hasNext()) {
                lsj lsjVarO = iwjVar.j((lsj) it.next()).O((jqj) lsjVar);
                if (lsjVarO instanceof drj) {
                    drj drjVar = (drj) lsjVarO;
                    String str = drjVar.F;
                    if ("break".equals(str)) {
                        return lsj.v;
                    }
                    if ("return".equals(str)) {
                        return drjVar;
                    }
                }
            }
        }
        return lsj.v;
    }

    public static osj b(c61 c61Var, List list) {
        gqk.s(lxj.FN, 2, list);
        lsj lsjVarN = ((mvd) c61Var.G).n(c61Var, (lsj) list.get(0));
        lsj lsjVarN2 = ((mvd) c61Var.G).n(c61Var, (lsj) list.get(1));
        if (!(lsjVarN2 instanceof jqj)) {
            sz6.p(ij0.i("FN requires an ArrayValue of parameter names found ", lsjVarN2.getClass().getCanonicalName()));
            return null;
        }
        ArrayList arrayListY = ((jqj) lsjVarN2).y();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new osj(lsjVarN.h(), arrayListY, arrayList, c61Var);
    }

    public static boolean d(lsj lsjVar, lsj lsjVar2) {
        lsj yqjVar;
        lsj yqjVar2;
        while (!lsjVar.getClass().equals(lsjVar2.getClass())) {
            if (((lsjVar instanceof ltj) || (lsjVar instanceof csj)) && ((lsjVar2 instanceof ltj) || (lsjVar2 instanceof csj))) {
                return true;
            }
            boolean z = lsjVar instanceof yqj;
            if (z && (lsjVar2 instanceof qsj)) {
                yqjVar2 = new yqj(lsjVar2.a());
            } else {
                boolean z2 = lsjVar instanceof qsj;
                if (z2 && (lsjVar2 instanceof yqj)) {
                    yqjVar = new yqj(lsjVar.a());
                } else if (lsjVar instanceof pqj) {
                    yqjVar = new yqj(lsjVar.a());
                } else if (lsjVar2 instanceof pqj) {
                    yqjVar2 = new yqj(lsjVar2.a());
                } else if ((z2 || z) && (lsjVar2 instanceof grj)) {
                    yqjVar2 = new qsj(lsjVar2.h());
                } else {
                    if (!(lsjVar instanceof grj) || (!(lsjVar2 instanceof qsj) && !(lsjVar2 instanceof yqj))) {
                        return false;
                    }
                    yqjVar = new qsj(lsjVar.h());
                }
                lsjVar = yqjVar;
            }
            lsjVar2 = yqjVar2;
        }
        if ((lsjVar instanceof ltj) || (lsjVar instanceof csj)) {
            return true;
        }
        return lsjVar instanceof yqj ? (Double.isNaN(lsjVar.a().doubleValue()) || Double.isNaN(lsjVar2.a().doubleValue()) || lsjVar.a().doubleValue() != lsjVar2.a().doubleValue()) ? false : true : lsjVar instanceof qsj ? lsjVar.h().equals(lsjVar2.h()) : lsjVar instanceof pqj ? lsjVar.k().equals(lsjVar2.k()) : lsjVar == lsjVar2;
    }

    public static lsj e(iwj iwjVar, lsj lsjVar, lsj lsjVar2) {
        if (lsjVar instanceof Iterable) {
            return a(iwjVar, ((Iterable) lsjVar).iterator(), lsjVar2);
        }
        sz6.p("Non-iterable type in for...of loop.");
        return null;
    }

    public static boolean f(lsj lsjVar, lsj lsjVar2) {
        if (lsjVar instanceof grj) {
            lsjVar = new qsj(lsjVar.h());
        }
        if (lsjVar2 instanceof grj) {
            lsjVar2 = new qsj(lsjVar2.h());
        }
        if ((lsjVar instanceof qsj) && (lsjVar2 instanceof qsj)) {
            return ((qsj) lsjVar).E.compareTo(((qsj) lsjVar2).E) < 0;
        }
        double dDoubleValue = lsjVar.a().doubleValue();
        double dDoubleValue2 = lsjVar2.a().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == -0.0d) || ((dDoubleValue == -0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static boolean g(lsj lsjVar, lsj lsjVar2) {
        if (lsjVar instanceof grj) {
            lsjVar = new qsj(lsjVar.h());
        }
        if (lsjVar2 instanceof grj) {
            lsjVar2 = new qsj(lsjVar2.h());
        }
        return (((lsjVar instanceof qsj) && (lsjVar2 instanceof qsj)) || !(Double.isNaN(lsjVar.a().doubleValue()) || Double.isNaN(lsjVar2.a().doubleValue()))) && !f(lsjVar2, lsjVar);
    }

    public final void c(String str) {
        if (!this.a.contains(gqk.l(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException(ij0.i("Command not implemented: ", str));
    }
}
