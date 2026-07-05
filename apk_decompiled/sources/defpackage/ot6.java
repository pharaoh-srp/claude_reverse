package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ot6 implements vt6 {
    public final int a;

    public ot6(int i) {
        this.a = i;
    }

    @Override // defpackage.vt6
    public final zb0 a(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(673923129);
        StringBuilder sb = new StringBuilder(16);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        sb.append(d4c.j0(this.a, e18Var));
        String string = sb.toString();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((wb0) arrayList.get(i)).a(sb.length()));
        }
        zb0 zb0Var = new zb0(string, (List) arrayList2);
        e18Var.p(false);
        return zb0Var;
    }

    @Override // defpackage.vt6
    public final yt6 d() {
        return new xt6();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ot6) && this.a == ((ot6) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return grc.u("DevicePermissionDeniedError(stringResourceId=", this.a, ")");
    }
}
