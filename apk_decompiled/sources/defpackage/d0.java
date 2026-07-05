package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends xv8 {
    public final /* synthetic */ qb5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(qb5 qb5Var, hab habVar) {
        super(qb5Var, habVar);
        this.L = qb5Var;
    }

    public final hi6 D(int i, gh3 gh3Var, xae xaeVar) {
        hab habVar = new hab(((hab) this.F).a + '@' + i);
        qb5 qb5Var = this.L;
        HashMap map = (HashMap) qb5Var.F;
        List arrayList = (List) map.get(habVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(habVar, arrayList);
        }
        return ((rl) qb5Var.E).I(gh3Var, xaeVar, arrayList);
    }
}
