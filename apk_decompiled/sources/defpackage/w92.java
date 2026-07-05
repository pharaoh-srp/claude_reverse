package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w92 extends fa2 {
    /* JADX WARN: Illegal instructions before constructor call */
    public w92(Field field, boolean z) {
        Type genericType = field.getGenericType();
        genericType.getClass();
        super(field, genericType, z ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // defpackage.q92
    public Object call(Object[] objArr) {
        objArr.getClass();
        c(objArr);
        return ((Field) this.a).get(this.c != null ? mp0.D0(objArr) : null);
    }
}
