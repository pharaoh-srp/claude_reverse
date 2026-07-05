package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class tg6 {
    public final int a;
    public final z7b b;
    public final CopyOnWriteArrayList c;

    public /* synthetic */ tg6(CopyOnWriteArrayList copyOnWriteArrayList, int i, z7b z7bVar) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = z7bVar;
    }

    public void a(gm4 gm4Var) {
        for (e8b e8bVar : this.c) {
            tpi.F(e8bVar.a, new yw5(gm4Var, 18, e8bVar.b));
        }
    }
}
