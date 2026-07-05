package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class x92 extends aa2 implements kv1 {
    public final Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x92(Field field, boolean z, Object obj) {
        super(field, z, false);
        field.getClass();
        this.g = obj;
    }

    @Override // defpackage.aa2, defpackage.q92
    public final Object call(Object[] objArr) throws IllegalAccessException {
        objArr.getClass();
        c(objArr);
        ((Field) this.a).set(this.g, mp0.D0(objArr));
        return iei.a;
    }
}
