package defpackage;

import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class vbe extends xbe {
    public final Class a;

    public vbe(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.xbe
    public final Type b() {
        return this.a;
    }

    public final vfd c() {
        Class cls = Void.TYPE;
        Class cls2 = this.a;
        if (cls2.equals(cls)) {
            return null;
        }
        return nk9.b(cls2.getName()).c();
    }

    @Override // defpackage.sd9
    public final Collection getAnnotations() {
        return lm6.E;
    }
}
