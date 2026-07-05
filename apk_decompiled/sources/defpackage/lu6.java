package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lu6 implements u9i {
    public final mu6 a;
    public final String[] b;
    public final String c;

    public lu6(mu6 mu6Var, String... strArr) {
        mu6Var.getClass();
        this.a = mu6Var;
        this.b = strArr;
        String str = mu6Var.E;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // defpackage.u9i
    public final xh3 a() {
        nu6.a.getClass();
        return nu6.c;
    }

    @Override // defpackage.u9i
    public final Collection b() {
        return lm6.E;
    }

    @Override // defpackage.u9i
    public final boolean c() {
        return false;
    }

    @Override // defpackage.u9i
    public final or9 f() {
        bq5 bq5Var = bq5.f;
        return bq5.f;
    }

    @Override // defpackage.u9i
    public final List getParameters() {
        return lm6.E;
    }

    public final String toString() {
        return this.c;
    }
}
