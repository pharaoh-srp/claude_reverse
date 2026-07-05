package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p94 {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final ia4 f;
    public final Set g;

    public p94(String str, Set set, Set set2, int i, int i2, ia4 ia4Var, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = ia4Var;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static o94 a(qzd qzdVar) {
        return new o94(qzdVar, new qzd[0]);
    }

    public static o94 b(Class cls) {
        return new o94(cls, new Class[0]);
    }

    public static p94 c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qzd.a(cls));
        for (Class cls2 : clsArr) {
            iuj.q("Null interface", cls2);
            hashSet.add(qzd.a(cls2));
        }
        return new p94(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new n94(1, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
