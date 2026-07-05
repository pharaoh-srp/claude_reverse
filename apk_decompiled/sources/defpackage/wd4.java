package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class wd4 implements i4a {
    public final /* synthetic */ int E;
    public final Object F;

    public /* synthetic */ wd4(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.i4a
    public final void d(m4a m4aVar, y3a y3aVar) {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                new HashMap();
                w18[] w18VarArr = (w18[]) obj;
                if (w18VarArr.length > 0) {
                    w18 w18Var = w18VarArr[0];
                    throw null;
                }
                if (w18VarArr.length <= 0) {
                    return;
                }
                w18 w18Var2 = w18VarArr[0];
                throw null;
            default:
                if (y3aVar == y3a.ON_STOP) {
                    ((cx7) obj).getClass();
                    return;
                }
                return;
        }
    }
}
