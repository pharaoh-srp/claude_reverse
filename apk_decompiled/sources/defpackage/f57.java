package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f57 implements g9i, Cloneable {
    public static final f57 G;
    public List E;
    public List F;

    static {
        f57 f57Var = new f57();
        List list = Collections.EMPTY_LIST;
        f57Var.E = list;
        f57Var.F = list;
        G = f57Var;
    }

    public static boolean c(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    @Override // defpackage.g9i
    public final f9i a(xd8 xd8Var, dbi dbiVar) {
        boolean z;
        boolean z2;
        boolean zC = c(dbiVar.a);
        if (zC) {
            z = true;
        } else {
            b(true);
            z = false;
        }
        if (zC) {
            z2 = true;
        } else {
            b(false);
            z2 = false;
        }
        if (z || z2) {
            return new e57(this, z2, z, xd8Var, dbiVar);
        }
        return null;
    }

    public final void b(boolean z) {
        Iterator it = (z ? this.E : this.F).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            mr9.o();
        }
    }

    public final Object clone() {
        try {
            return (f57) super.clone();
        } catch (CloneNotSupportedException e) {
            sz6.h(e);
            return null;
        }
    }
}
