package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class ok9 extends ne5 {
    public final Field B;

    public ok9(Field field) {
        field.getClass();
        this.B = field;
    }

    @Override // defpackage.ne5
    public final String e() {
        StringBuilder sb = new StringBuilder();
        Field field = this.B;
        String name = field.getName();
        name.getClass();
        sb.append(lj9.a(name));
        sb.append("()");
        Class<?> type = field.getType();
        type.getClass();
        sb.append(yae.b(type));
        return sb.toString();
    }

    public final Field l() {
        return this.B;
    }
}
