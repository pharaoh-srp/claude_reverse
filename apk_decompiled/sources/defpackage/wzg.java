package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wzg {
    public static final qub a;

    static {
        nu6 nu6Var = nu6.a;
        pm6 pm6Var = new pm6(nu6.b, pkg.e);
        sxb sxbVarF = pkg.f.f();
        xea xeaVar = gfa.e;
        qub qubVar = new qub(pm6Var, sxbVarF, xeaVar);
        qubVar.L = 4;
        p06 p06Var = q06.e;
        if (p06Var == null) {
            qub.t0(9);
            throw null;
        }
        qubVar.M = p06Var;
        List listW = x44.W(rai.Q0(qubVar, 2, sxb.e("T"), 0, xeaVar));
        if (qubVar.O != null) {
            xh6.n("Type parameters are already set for ", qubVar.getName());
            return;
        }
        ArrayList arrayList = new ArrayList(listW);
        qubVar.O = arrayList;
        qubVar.N = new ph3(qubVar, arrayList, qubVar.P, qubVar.Q);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            qub.t0(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((tg3) ((h08) it.next())).K = qubVar.W();
        }
        a = qubVar;
    }
}
