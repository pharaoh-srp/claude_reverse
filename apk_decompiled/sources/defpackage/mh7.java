package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mh7 {
    public final String a;
    public final Map b;

    public mh7(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static mh7 b(String str) {
        return new mh7(str, Collections.EMPTY_MAP);
    }

    public final Annotation a(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh7)) {
            return false;
        }
        mh7 mh7Var = (mh7) obj;
        return this.a.equals(mh7Var.a) && this.b.equals(mh7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
