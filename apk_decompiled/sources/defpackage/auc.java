package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class auc {
    public final List a;
    public final List b;

    public auc(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(w44.S0(this.a, ", ", null, null, null, 62));
        sb.append('(');
        return vb7.s(sb, w44.S0(this.b, ";", null, null, null, 62), ')');
    }
}
