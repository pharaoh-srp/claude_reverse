package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class gz9 implements Comparator {
    public final /* synthetic */ int E;
    public final /* synthetic */ l94 F;

    public /* synthetic */ gz9(l94 l94Var, int i) {
        this.E = i;
        this.F = l94Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.E;
        l94 l94Var = this.F;
        switch (i) {
        }
        return Integer.valueOf(l94Var.d(((oz9) obj2).getKey())).compareTo(Integer.valueOf(l94Var.d(((oz9) obj).getKey())));
    }
}
