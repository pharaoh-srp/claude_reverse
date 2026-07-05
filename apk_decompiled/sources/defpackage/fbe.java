package defpackage;

import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fbe extends l08 implements bz7 {
    public static final fbe E = new fbe(1);

    @Override // defpackage.g92, defpackage.ll9
    public final String getName() {
        return "<init>";
    }

    @Override // defpackage.g92
    public final fm9 getOwner() {
        return jce.a.b(nbe.class);
    }

    @Override // defpackage.g92
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        Constructor constructor = (Constructor) obj;
        constructor.getClass();
        return new nbe(constructor);
    }
}
