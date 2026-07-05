package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class lce extends kce {
    public static im9 l(g92 g92Var) {
        fm9 owner = g92Var.getOwner();
        return owner instanceof im9 ? (im9) owner : hm6.F;
    }

    @Override // defpackage.kce
    public final jm9 a(l08 l08Var) {
        return new lm9(l(l08Var), l08Var.getName(), l08Var.getSignature(), l08Var.getBoundReceiver());
    }

    @Override // defpackage.kce
    public final pl9 b(Class cls) {
        return i62.a(cls);
    }

    @Override // defpackage.kce
    public final fm9 c(Class cls, String str) {
        df4 df4Var = i62.a;
        cls.getClass();
        return (fm9) i62.b.X(cls);
    }

    @Override // defpackage.kce
    public final rm9 d(awb awbVar) {
        return new tm9(l(awbVar), awbVar.getName(), awbVar.getSignature(), awbVar.getBoundReceiver());
    }

    @Override // defpackage.kce
    public final um9 e(bwb bwbVar) {
        return new wm9(l(bwbVar), bwbVar.getName(), bwbVar.getSignature(), bwbVar.getBoundReceiver());
    }

    @Override // defpackage.kce
    public final kn9 f(lrd lrdVar) {
        return new nn9(l(lrdVar), lrdVar.getName(), lrdVar.getSignature(), lrdVar.getBoundReceiver());
    }

    @Override // defpackage.kce
    public final on9 g(mrd mrdVar) {
        return new rn9(l(mrdVar), mrdVar.getName(), mrdVar.getSignature(), mrdVar.getBoundReceiver());
    }

    @Override // defpackage.kce
    public final sn9 h(nrd nrdVar) {
        return new vn9(l(nrdVar), nrdVar.getName(), nrdVar.getSignature());
    }

    @Override // defpackage.kce
    public final String i(a08 a08Var) {
        lm9 lm9VarB;
        lm9 lm9VarI = xkk.i(a08Var);
        if (lm9VarI == null || (lm9VarB = vpi.b(lm9VarI)) == null) {
            return super.i(a08Var);
        }
        g06 g06Var = pce.a;
        return pce.c(lm9VarB.t());
    }

    @Override // defpackage.kce
    public final String j(ts9 ts9Var) {
        return i(ts9Var);
    }

    @Override // defpackage.kce
    public final eo9 k(pl9 pl9Var) {
        List list = Collections.EMPTY_LIST;
        if (!(pl9Var instanceof sg3)) {
            return wd6.k0(pl9Var, list, false, list);
        }
        Class clsA = ((sg3) pl9Var).a();
        df4 df4Var = i62.a;
        clsA.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return (eo9) i62.c.X(clsA);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) i62.d.X(clsA);
        cpc cpcVar = new cpc(list, Boolean.FALSE);
        Object obj = concurrentHashMap.get(cpcVar);
        if (obj == null) {
            fo9 fo9VarK0 = wd6.k0(i62.a(clsA), list, false, lm6.E);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cpcVar, fo9VarK0);
            obj = objPutIfAbsent == null ? fo9VarK0 : objPutIfAbsent;
        }
        return (eo9) obj;
    }
}
