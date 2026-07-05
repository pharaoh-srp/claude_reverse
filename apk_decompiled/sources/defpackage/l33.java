package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class l33 implements lp7 {
    public static final l33 F = new l33(0);
    public static final l33 G = new l33(1);
    public static final l33 H = new l33(2);
    public static final l33 I = new l33(3);
    public final /* synthetic */ int E;

    public /* synthetic */ l33(int i) {
        this.E = i;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ieiVar;
            case 1:
                return ieiVar;
            case 2:
                return ieiVar;
            case 3:
                return ieiVar;
            default:
                if (obj == null) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new ClassCastException();
        }
    }
}
