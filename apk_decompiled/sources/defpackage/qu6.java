package defpackage;

import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qu6 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ av6 b;
    public final /* synthetic */ yj6 c;

    public /* synthetic */ qu6(av6 av6Var, yj6 yj6Var, int i) {
        this.a = i;
        this.b = av6Var;
        this.c = yj6Var;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        yj6 yj6Var = this.c;
        av6 av6Var = this.b;
        switch (i) {
            case 0:
                return av6Var.b(yj6Var, (yj6) obj);
            default:
                return av6Var.d(yj6Var, (c5c) obj);
        }
    }
}
