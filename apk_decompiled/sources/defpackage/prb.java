package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class prb {
    public static final ArrayList d;
    public final List a;
    public final ThreadLocal b = new ThreadLocal();
    public final LinkedHashMap c = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        d = arrayList;
        arrayList.add(yfd.h);
        arrayList.add(r44.b);
        arrayList.add(so0.e);
        arrayList.add(so0.d);
        arrayList.add(y8e.a);
        arrayList.add(ih3.d);
    }

    public prb(mrb mrbVar) {
        ArrayList arrayList = mrbVar.a;
        int size = arrayList.size();
        ArrayList arrayList2 = d;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.a = Collections.unmodifiableList(arrayList3);
    }

    public final gg9 a(Class cls) {
        return b(cls, spi.a, null);
    }

    public final gg9 b(Type type, Set set, String str) {
        if (type == null) {
            mr9.h("type == null");
            return null;
        }
        if (set == null) {
            mr9.h("annotations == null");
            return null;
        }
        Type typeI = spi.i(spi.a(type));
        Object objAsList = set.isEmpty() ? typeI : Arrays.asList(typeI, set);
        synchronized (this.c) {
            try {
                gg9 gg9Var = (gg9) this.c.get(objAsList);
                if (gg9Var != null) {
                    return gg9Var;
                }
                orb orbVar = (orb) this.b.get();
                if (orbVar == null) {
                    orbVar = new orb(this);
                    this.b.set(orbVar);
                }
                gg9 gg9VarD = orbVar.d(typeI, str, objAsList);
                try {
                    if (gg9VarD != null) {
                        return gg9VarD;
                    }
                    try {
                        int size = this.a.size();
                        for (int i = 0; i < size; i++) {
                            gg9 gg9VarCreate = ((fg9) this.a.get(i)).create(typeI, set, this);
                            if (gg9VarCreate != null) {
                                orbVar.a(gg9VarCreate);
                                orbVar.c(true);
                                return gg9VarCreate;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + spi.m(typeI, set));
                    } catch (IllegalArgumentException e) {
                        throw orbVar.b(e);
                    }
                } finally {
                    orbVar.c(false);
                }
            } finally {
            }
        }
    }
}
