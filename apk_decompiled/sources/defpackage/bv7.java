package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bv7 {
    public final List a;

    public bv7(yu7... yu7VarArr) {
        for (yu7 yu7Var : yu7VarArr) {
            String strB = yu7Var.b();
            int i = 0;
            for (yu7 yu7Var2 : yu7VarArr) {
                if (x44.r(yu7Var2.b(), strB)) {
                    i++;
                }
            }
            if (i != 1) {
                StringBuilder sbX = sq6.x("'", strB, "' must be unique. Actual [");
                ArrayList arrayList = new ArrayList();
                for (yu7 yu7Var3 : yu7VarArr) {
                    if (x44.r(yu7Var3.b(), strB)) {
                        arrayList.add(yu7Var3);
                    }
                }
                sbX.append(arrayList);
                sbX.append(']');
                c39.a(sbX.toString());
            }
        }
        this.a = mp0.Y0(yu7VarArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bv7) {
            return x44.r(this.a, ((bv7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
