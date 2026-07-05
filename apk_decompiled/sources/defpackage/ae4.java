package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ae4 extends me1 {
    public final HashMap h = new HashMap();
    public Handler i;
    public yp5 j;

    @Override // defpackage.me1
    public final void c() {
        for (zd4 zd4Var : this.h.values()) {
            zd4Var.a.b(zd4Var.b);
        }
    }

    @Override // defpackage.me1
    public final void e() {
        for (zd4 zd4Var : this.h.values()) {
            zd4Var.a.d(zd4Var.b);
        }
    }

    @Override // defpackage.me1
    public void i() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((zd4) it.next()).a.i();
        }
    }

    @Override // defpackage.me1
    public void o() {
        HashMap map = this.h;
        for (zd4 zd4Var : map.values()) {
            me1 me1Var = zd4Var.a;
            yd4 yd4Var = zd4Var.c;
            me1Var.n(zd4Var.b);
            me1Var.q(yd4Var);
            me1Var.p(yd4Var);
        }
        map.clear();
    }

    public abstract z7b s(Object obj, z7b z7bVar);

    public long t(long j, Object obj) {
        return j;
    }

    public int u(int i, Object obj) {
        return i;
    }

    public abstract void v(Object obj, me1 me1Var, mqh mqhVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [a8b, xd4] */
    public final void w(final Integer num, me1 me1Var) {
        HashMap map = this.h;
        fd9.E(!map.containsKey(num));
        ?? r1 = new a8b() { // from class: xd4
            @Override // defpackage.a8b
            public final void a(me1 me1Var2, mqh mqhVar) {
                this.a.v(num, me1Var2, mqhVar);
            }
        };
        yd4 yd4Var = new yd4(this, num);
        map.put(num, new zd4(me1Var, r1, yd4Var));
        Handler handler = this.i;
        handler.getClass();
        me1Var.getClass();
        tg6 tg6Var = me1Var.c;
        tg6Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = tg6Var.c;
        e8b e8bVar = new e8b();
        e8bVar.a = handler;
        e8bVar.b = yd4Var;
        copyOnWriteArrayList.add(e8bVar);
        this.i.getClass();
        tg6 tg6Var2 = me1Var.d;
        tg6Var2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = tg6Var2.c;
        sg6 sg6Var = new sg6();
        sg6Var.a = yd4Var;
        copyOnWriteArrayList2.add(sg6Var);
        yp5 yp5Var = this.j;
        z6d z6dVar = this.g;
        z6dVar.getClass();
        me1Var.j(r1, yp5Var, z6dVar);
        if (this.b.isEmpty()) {
            me1Var.b(r1);
        }
    }
}
