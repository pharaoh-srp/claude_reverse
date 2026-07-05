package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class agg implements zfg {
    public final AtomicLong b = new AtomicLong(0);
    public final AtomicLong c = new AtomicLong(0);

    public agg() {
        ArrayList arrayList = new ArrayList(2);
        int i = 28;
        arrayList.add(new dd8(i));
        arrayList.add(new dd8(i));
        Collections.unmodifiableList(arrayList);
    }

    @Override // defpackage.zfg
    public final void a() {
        this.c.incrementAndGet();
    }

    @Override // defpackage.zfg
    public final void b() {
        this.b.incrementAndGet();
    }
}
