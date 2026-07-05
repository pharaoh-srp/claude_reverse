package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fr9 {
    public final er9 a = new er9();
    public final boolean b = true;

    public final void a(List list) {
        er9 er9Var = this.a;
        k3a k3aVar = (k3a) er9Var.a.E;
        k3a k3aVar2 = k3a.F;
        int iCompareTo = k3aVar.compareTo(k3aVar2);
        boolean z = this.b;
        if (iCompareTo > 0) {
            er9Var.c(list, z);
            return;
        }
        long jA = brb.a();
        er9Var.c(list, z);
        long jA2 = dqh.a(jA);
        int size = ((ConcurrentHashMap) er9Var.d.F).size();
        rok rokVar = er9Var.a;
        StringBuilder sbU = vb7.u("Started ", size, " definitions in ");
        lz1 lz1Var = uh6.F;
        sbU.append(uh6.o(jA2, zh6.MICROSECONDS) / 1000.0d);
        sbU.append(" ms");
        rokVar.n0(k3aVar2, sbU.toString());
    }
}
