package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class jp0 implements g9i {
    public final /* synthetic */ int E;

    public /* synthetic */ jp0(int i) {
        this.E = i;
    }

    @Override // defpackage.g9i
    public final f9i a(xd8 xd8Var, dbi dbiVar) {
        int i = 0;
        switch (this.E) {
            case 0:
                Type type = dbiVar.b;
                boolean z = type instanceof GenericArrayType;
                if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new kp0(xd8Var, xd8Var.c(new dbi(genericComponentType)), yb5.u(genericComponentType));
            case 1:
                if (dbiVar.a == Date.class) {
                    return new zig(2);
                }
                return null;
            case 2:
                if (dbiVar.a == Object.class) {
                    return new bbc(xd8Var);
                }
                return null;
            case 3:
                if (dbiVar.a == java.sql.Date.class) {
                    return new zig(0);
                }
                return null;
            case 4:
                if (dbiVar.a == Time.class) {
                    return new zig(1);
                }
                return null;
            case 5:
                if (dbiVar.a == Timestamp.class) {
                    return new ajg(xd8Var.c(new dbi(Date.class)), i);
                }
                return null;
            default:
                Class superclass = dbiVar.a;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new m9i(superclass);
        }
    }
}
