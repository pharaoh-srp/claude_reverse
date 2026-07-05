package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i74 extends k74 {
    public i74(List list) {
        this.a.addAll(list);
        g();
    }

    @Override // defpackage.av6
    public final boolean b(yj6 yj6Var, yj6 yj6Var2) {
        for (int i = 0; i < this.c; i++) {
            if (!((av6) this.b.get(i)).b(yj6Var, yj6Var2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.av6
    public final boolean c(yj6 yj6Var, a2a a2aVar) {
        for (int i = 0; i < this.c; i++) {
            if (!((av6) this.b.get(i)).c(yj6Var, a2aVar)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return xrg.j("", this.a);
    }
}
