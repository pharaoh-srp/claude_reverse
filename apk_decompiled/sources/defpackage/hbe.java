package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hbe extends l08 implements bz7 {
    public static final hbe E = new hbe(1);

    @Override // defpackage.g92, defpackage.ll9
    public final String getName() {
        return "<init>";
    }

    @Override // defpackage.g92
    public final fm9 getOwner() {
        return jce.a.b(qbe.class);
    }

    @Override // defpackage.g92
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        Field field = (Field) obj;
        field.getClass();
        return new qbe(field);
    }
}
