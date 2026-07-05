package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class px7 implements ox7 {
    public final int a;
    public final /* synthetic */ rx7 b;

    public px7(rx7 rx7Var, int i) {
        this.b = rx7Var;
        this.a = i;
    }

    @Override // defpackage.ox7
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        rx7 rx7Var = this.b;
        cx7 cx7Var = rx7Var.z;
        int i = this.a;
        if (cx7Var == null || i >= 0 || !cx7Var.i().S(-1, 0)) {
            return rx7Var.T(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
