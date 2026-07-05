package defpackage;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xgg {
    public static final LinkedHashSet a;
    public static final gh3 b;

    static {
        List listX = x44.X(mj9.a, mj9.h, mj9.i, mj9.c, mj9.d, mj9.f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listX.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(gh3.j((ww7) it.next()));
        }
        a = linkedHashSet;
        b = gh3.j(mj9.g);
    }

    public static LinkedHashSet a() {
        return a;
    }

    public static boolean b(bce bceVar) {
        Class cls = bceVar.a;
        cls.getClass();
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        boolean z = false;
        for (Annotation annotation : declaredAnnotations) {
            annotation.getClass();
            if (yae.a(ez1.I(ez1.H(annotation))).equals(lj9.b)) {
                z = true;
            }
        }
        return z;
    }
}
