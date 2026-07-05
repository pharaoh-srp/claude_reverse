package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jcd {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ kcd f;

    public jcd(kcd kcdVar, List list) {
        this.f = kcdVar;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            e39.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
