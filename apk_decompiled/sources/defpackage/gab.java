package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class gab implements fab {
    @Override // defpackage.fab
    public Set a() {
        Collection collectionB = b(c06.p, f06.N);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionB) {
            if (obj instanceof c7g) {
                sxb name = ((c7g) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.fab
    public Collection b(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        return lm6.E;
    }

    @Override // defpackage.fab
    public Set c() {
        return null;
    }

    @Override // defpackage.fab
    public Collection d(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        return lm6.E;
    }

    @Override // defpackage.fab
    public xh3 e(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        return null;
    }

    @Override // defpackage.fab
    public Set f() {
        Collection collectionB = b(c06.q, f06.N);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionB) {
            if (obj instanceof c7g) {
                sxb name = ((c7g) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.fab
    public Collection g(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        return lm6.E;
    }
}
