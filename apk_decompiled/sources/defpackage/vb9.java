package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class vb9 {
    public final cve a;
    public final o7i b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final q59 e;
    public final q59 f;
    public final Object g;

    public vb9(cve cveVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = cveVar;
        o7i o7iVar = new o7i(cveVar, linkedHashMap, linkedHashMap2, strArr, cveVar.k, new n0(1, this, vb9.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 11));
        this.b = o7iVar;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new q59(this, 3);
        this.f = new q59(this, 4);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.g = new Object();
        o7iVar.k = new dg8(8, this);
    }

    public final Object a(xzg xzgVar) throws Throwable {
        Object objF = this.b.f(xzgVar);
        return objF == m45.E ? objF : iei.a;
    }
}
