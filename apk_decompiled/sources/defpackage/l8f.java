package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class l8f {
    public final e40 a;
    public final float b;

    public l8f(String str) {
        e40 e40VarD = dqk.d();
        q28 q28Var = new q28(21);
        ArrayList arrayList = (ArrayList) q28Var.F;
        if (arrayList == null) {
            arrayList = new ArrayList();
            q28Var.F = arrayList;
        } else {
            arrayList.clear();
        }
        q28Var.x(str, arrayList);
        c40 c40VarA = f40.a();
        ArrayList arrayList2 = (ArrayList) q28Var.F;
        e40VarD.c(arrayList2 != null ? sf5.j0(arrayList2, c40VarA) : f40.a());
        this.a = e40VarD;
        this.b = e40VarD.a.getLength();
    }
}
