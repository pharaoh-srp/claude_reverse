package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n06 extends l08 implements bz7 {
    public static final n06 E = new n06(1);

    @Override // defpackage.g92, defpackage.ll9
    public final String getName() {
        return "declaresDefaultValue";
    }

    @Override // defpackage.g92
    public final fm9 getOwner() {
        return jce.a.b(eri.class);
    }

    @Override // defpackage.g92
    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        eri eriVar = (eri) obj;
        eriVar.getClass();
        return Boolean.valueOf(eriVar.P0());
    }
}
