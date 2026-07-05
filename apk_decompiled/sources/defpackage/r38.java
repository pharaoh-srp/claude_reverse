package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r38 {
    public final List a;

    public r38(List list) {
        this.a = list;
        if (list.isEmpty()) {
            sz6.p("credentialOptions should not be empty");
            throw null;
        }
        if (list.size() > 1) {
            List<p95> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (p95 p95Var : list2) {
                }
            }
            for (p95 p95Var2 : this.a) {
            }
        }
    }
}
