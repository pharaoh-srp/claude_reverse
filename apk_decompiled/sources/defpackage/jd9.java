package defpackage;

import java.util.function.BiFunction;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jd9 implements BiFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ pz7 b;

    public /* synthetic */ jd9(int i, pz7 pz7Var) {
        this.a = i;
        this.b = pz7Var;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.a;
        pz7 pz7Var = this.b;
        switch (i) {
            case 0:
                return (Integer) ((gg7) pz7Var).invoke(obj, obj2);
            default:
                return (Integer) ((a21) pz7Var).invoke(obj, obj2);
        }
    }
}
