package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u84 implements Comparator {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ u84(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.E;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                for (bz7 bz7Var : (bz7[]) obj3) {
                    int iR = nai.r((Comparable) bz7Var.invoke(obj), (Comparable) bz7Var.invoke(obj2));
                    if (iR != 0) {
                        return iR;
                    }
                }
                return 0;
            case 1:
                r6b r6bVar = (r6b) obj3;
                return r6bVar.e(obj2) - r6bVar.e(obj);
            case 2:
                return ((Number) ((ska) obj3).invoke(obj, obj2)).intValue();
            default:
                return ((Number) ((pz7) obj3).invoke(obj, obj2)).intValue();
        }
    }
}
