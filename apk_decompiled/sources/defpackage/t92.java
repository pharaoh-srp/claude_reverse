package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class t92 extends w92 implements kv1 {
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t92(Field field, Object obj) {
        super(field, false);
        field.getClass();
        this.e = obj;
    }

    @Override // defpackage.w92, defpackage.q92
    public final Object call(Object[] objArr) {
        objArr.getClass();
        tvj.b(this, objArr);
        return ((Field) this.a).get(this.e);
    }
}
