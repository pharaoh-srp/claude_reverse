package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dl7 extends l08 implements bz7 {
    public static final dl7 E = new dl7(1);

    @Override // defpackage.g92, defpackage.ll9
    public final String getName() {
        return "getOuterClassId";
    }

    @Override // defpackage.g92
    public final fm9 getOwner() {
        return jce.a.b(gh3.class);
    }

    @Override // defpackage.g92
    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        gh3 gh3Var = (gh3) obj;
        gh3Var.getClass();
        return gh3Var.f();
    }
}
