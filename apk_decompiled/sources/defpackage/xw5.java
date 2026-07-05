package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xw5 implements Callable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ xw5(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.E;
        Object obj = this.H;
        Object obj2 = this.G;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                return ((zw5) obj3).E.submit(new yw5((Callable) obj2, 0, (ax5) obj));
            default:
                String str = (String) obj;
                WorkDatabase workDatabase = ((xhd) obj3).e;
                chj chjVarX = workDatabase.x();
                chjVarX.getClass();
                str.getClass();
                ((ArrayList) obj2).addAll((List) u00.E(chjVarX.a, true, false, new hti(str, 15)));
                return workDatabase.w().d(str);
        }
    }
}
