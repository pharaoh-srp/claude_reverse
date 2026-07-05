package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j74 extends k74 {
    public j74(av6... av6VarArr) {
        List listAsList = Arrays.asList(av6VarArr);
        int i = this.c;
        ArrayList arrayList = this.a;
        if (i > 1) {
            arrayList.add(new i74(listAsList));
        } else {
            arrayList.addAll(listAsList);
        }
        g();
    }

    @Override // defpackage.av6
    public final boolean b(yj6 yj6Var, yj6 yj6Var2) {
        for (int i = 0; i < this.c; i++) {
            if (((av6) this.b.get(i)).b(yj6Var, yj6Var2)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.av6
    public final boolean c(yj6 yj6Var, a2a a2aVar) {
        for (int i = 0; i < this.c; i++) {
            if (((av6) this.b.get(i)).c(yj6Var, a2aVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return xrg.j(", ", this.a);
    }
}
