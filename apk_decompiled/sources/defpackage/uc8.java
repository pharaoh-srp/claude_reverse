package defpackage;

import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uc8 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ bz7 b;

    public /* synthetic */ uc8(int i, bz7 bz7Var) {
        this.a = i;
        this.b = bz7Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        bz7 bz7Var = this.b;
        switch (i) {
            case 0:
                return (String) ((fg7) bz7Var).invoke(obj);
            case 1:
                return (kdg) ((fg7) bz7Var).invoke(obj);
            default:
                return ((v78) bz7Var).invoke(obj);
        }
    }
}
