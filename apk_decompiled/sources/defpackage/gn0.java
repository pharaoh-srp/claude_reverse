package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class gn0 extends a0 {
    @Override // defpackage.hn0
    public final /* bridge */ /* synthetic */ void a(int i, Object obj) {
    }

    @Override // defpackage.hn0
    public final void d(int i, int i2, int i3) {
        a0.m(o(), i, i2, i3);
    }

    @Override // defpackage.hn0
    public final void e(int i, int i2) {
        ArrayList arrayListO = o();
        if (i2 == 1) {
            arrayListO.remove(i);
        } else {
            arrayListO.subList(i, i2 + i).clear();
        }
    }

    @Override // defpackage.hn0
    public final void h(int i, Object obj) {
        qk6 qk6Var = (qk6) obj;
        Object obj2 = this.G;
        obj2.getClass();
        int i2 = ((zk6) obj2).a;
        if (i2 > 0) {
            if (qk6Var instanceof zk6) {
                ((zk6) qk6Var).a = i2 - 1;
            }
            o().add(i, qk6Var);
            return;
        }
        Object obj3 = this.F;
        obj3.getClass();
        throw new IllegalArgumentException(("Too many embedded views for the current surface. The maximum depth is: " + ((zk6) obj3).a).toString());
    }

    @Override // defpackage.a0
    public final void n() {
        Object obj = this.F;
        obj.getClass();
        ((zk6) obj).b.clear();
    }

    public final ArrayList o() {
        qk6 qk6Var = (qk6) this.G;
        if (qk6Var instanceof zk6) {
            return ((zk6) qk6Var).b;
        }
        sz6.j("Current node cannot accept children");
        return null;
    }
}
