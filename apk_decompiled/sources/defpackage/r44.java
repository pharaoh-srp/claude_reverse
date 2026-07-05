package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class r44 extends gg9 {
    public static final ro0 b = new ro0(2);
    public final gg9 a;

    public r44(gg9 gg9Var) {
        this.a = gg9Var;
    }

    public abstract Collection a();

    @Override // defpackage.gg9
    public Object fromJson(ci9 ci9Var) {
        Collection collectionA = a();
        ci9Var.beginArray();
        while (ci9Var.hasNext()) {
            collectionA.add(this.a.fromJson(ci9Var));
        }
        ci9Var.endArray();
        return collectionA;
    }

    @Override // defpackage.gg9
    public void toJson(jj9 jj9Var, Object obj) {
        jj9Var.c();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            this.a.toJson(jj9Var, it.next());
        }
        jj9Var.f();
    }

    public final String toString() {
        return this.a + ".collection()";
    }
}
