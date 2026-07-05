package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class u4i implements fs {
    public final aqh a;
    public double b;
    public final LinkedHashSet c;

    public u4i(aqh aqhVar) {
        aqhVar.getClass();
        this.a = aqhVar;
        this.c = new LinkedHashSet();
    }

    @Override // defpackage.fs
    public final hs a() {
        Map mapSingletonMap;
        LinkedHashSet linkedHashSet = this.c;
        boolean zIsEmpty = linkedHashSet.isEmpty();
        nm6 nm6Var = nm6.E;
        if (zIsEmpty) {
            mapSingletonMap = nm6Var;
        } else {
            mapSingletonMap = Collections.singletonMap(qac.I0.a(), Double.valueOf(this.b));
            mapSingletonMap.getClass();
        }
        return new hs(nm6Var, mapSingletonMap, linkedHashSet);
    }

    @Override // defpackage.fs
    public final void b(y7e y7eVar) {
        qac qacVar = (qac) y7eVar;
        qacVar.getClass();
        double d = this.b;
        fva fvaVar = qacVar.L;
        fvaVar.getClass();
        this.b = (vok.p(qacVar, this.a) * fvaVar.b()) + d;
        this.c.add(qacVar.e.c);
    }
}
