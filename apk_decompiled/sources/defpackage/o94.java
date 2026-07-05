package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class o94 {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public int d;
    public int e;
    public ia4 f;
    public final HashSet g;

    public o94(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(qzd.a(cls));
        for (Class cls2 : clsArr) {
            iuj.q("Null interface", cls2);
            this.b.add(qzd.a(cls2));
        }
    }

    public final void a(iz5 iz5Var) {
        if (this.b.contains(iz5Var.a)) {
            sz6.p("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.c.add(iz5Var);
        }
    }

    public final p94 b() {
        if (this.f != null) {
            return new p94(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }
        sz6.j("Missing required property: factory.");
        return null;
    }

    public o94(qzd qzdVar, qzd[] qzdVarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(qzdVar);
        for (qzd qzdVar2 : qzdVarArr) {
            iuj.q("Null interface", qzdVar2);
        }
        Collections.addAll(this.b, qzdVarArr);
    }
}
