package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f50 implements Comparator {
    public final /* synthetic */ int E;

    public /* synthetic */ f50(int i) {
        this.E = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                return x44.z(((dgd) obj2).a(), ((dgd) obj).a());
            case 1:
                return x44.z(((tb9) obj).b, ((tb9) obj2).b);
            case 2:
                b79 b79Var = (b79) obj;
                b79 b79Var2 = (b79) obj2;
                return (b79Var.F - b79Var.E) - (b79Var2.F - b79Var2.E);
            case 3:
                av9 av9Var = (av9) obj;
                av9 av9Var2 = (av9) obj2;
                return av9Var.K() == av9Var2.K() ? x44.z(av9Var.H(), av9Var2.H()) : Float.compare(av9Var.K(), av9Var2.K());
            default:
                return x44.z(((oz9) obj).getIndex(), ((oz9) obj2).getIndex());
        }
    }
}
