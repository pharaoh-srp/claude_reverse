package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class sb1 extends LinkedBlockingQueue {
    public final AtomicLong E;
    public final h99 F;
    public final String G;
    public final int H;
    public final int I;
    public final zy7 J;
    public final bz7 K;
    public final int L;
    public final iuj M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb1(h99 h99Var, String str, int i, int i2, zy7 zy7Var, bz7 bz7Var, int i3, iuj iujVar) {
        super(i2);
        h99Var.getClass();
        iujVar.getClass();
        this.E = new AtomicLong(0L);
        this.F = h99Var;
        this.G = str;
        this.H = i2;
        this.I = i;
        this.J = zy7Var;
        this.K = bz7Var;
        this.L = i3;
        this.M = iujVar;
    }

    public final void a(Object obj) {
        String string;
        this.K.invoke(obj);
        yxb yxbVar = obj instanceof yxb ? (yxb) obj : null;
        if (yxbVar == null || (string = yxbVar.getName()) == null) {
            string = obj.toString();
        }
        ((rl) this.F).L(5, g99.F, new rb1(string, 0), null, false, sta.h0(new cpc("backpressure.capacity", Integer.valueOf(this.H)), new cpc("executor.context", this.G)));
    }

    public final void b() {
        String name;
        this.M.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AtomicLong atomicLong = this.E;
        long j = atomicLong.get();
        LinkedHashMap linkedHashMap = null;
        if (jCurrentTimeMillis - j > 5000 && super.size() <= 2048 && atomicLong.compareAndSet(j, jCurrentTimeMillis)) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Object[] array = toArray();
            array.getClass();
            for (Object obj : array) {
                yxb yxbVar = obj instanceof yxb ? (yxb) obj : null;
                if (yxbVar != null && (name = yxbVar.getName()) != null) {
                    Integer num = (Integer) linkedHashMap2.get(name);
                    linkedHashMap2.put(name, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                }
            }
            linkedHashMap = linkedHashMap2;
        }
        lqa lqaVar = new lqa();
        lqaVar.put("capacity", Integer.valueOf(this.H));
        if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
            lqaVar.put("dump", linkedHashMap);
        }
        lqa lqaVarC = lqaVar.c();
        this.J.a();
        ((rl) this.F).M(4, x44.X(g99.F, g99.G), new v01(1, this), null, false, sta.h0(new cpc("backpressure", lqaVarC), new cpc("executor.context", this.G)));
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public final boolean offer(Object obj) throws InterruptedException {
        obj.getClass();
        if (remainingCapacity() != 0) {
            if (super.size() + 1 == this.I) {
                b();
            }
            return super.offer(obj);
        }
        int i = this.L;
        int i2 = i == 0 ? -1 : qb1.a[sq6.F(i)];
        if (i2 != -1) {
            if (i2 == 1) {
                Object objTake = take();
                objTake.getClass();
                a(objTake);
                return super.offer(obj);
            }
            if (i2 != 2) {
                mr9.b();
                return false;
            }
        }
        a(obj);
        return true;
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.concurrent.BlockingQueue
    public final void put(Object obj) throws InterruptedException {
        obj.getClass();
        if (super.size() + 1 == this.I) {
            b();
        }
        super.put(obj);
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.concurrent.BlockingQueue
    public final boolean offer(Object obj, long j, TimeUnit timeUnit) {
        obj.getClass();
        if (!super.offer(obj, j, timeUnit)) {
            return offer(obj);
        }
        if (super.size() != this.I) {
            return true;
        }
        b();
        return true;
    }
}
