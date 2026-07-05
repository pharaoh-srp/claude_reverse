package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ibe extends l08 implements bz7 {
    public static final ibe E = new ibe(1);

    @Override // defpackage.g92, defpackage.ll9
    public final String getName() {
        return "<init>";
    }

    @Override // defpackage.g92
    public final fm9 getOwner() {
        return jce.a.b(tbe.class);
    }

    @Override // defpackage.g92
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        Method method = (Method) obj;
        method.getClass();
        return new tbe(method);
    }
}
