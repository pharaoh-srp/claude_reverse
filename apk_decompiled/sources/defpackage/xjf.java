package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xjf {
    public final qjf a;
    public final yub b;

    public xjf(wjf wjfVar, w69 w69Var) {
        this.a = wjfVar.d;
        List listJ = wjf.j(4, wjfVar);
        this.b = new yub(listJ.size());
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            wjf wjfVar2 = (wjf) listJ.get(i);
            if (w69Var.a(wjfVar2.f)) {
                this.b.a(wjfVar2.f);
            }
        }
    }
}
