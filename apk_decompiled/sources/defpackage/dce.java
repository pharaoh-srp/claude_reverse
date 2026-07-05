package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dce extends l08 implements pz7 {
    public static final dce E = new dce(2);

    @Override // defpackage.g92, defpackage.ll9
    public final String getName() {
        return "loadFunction";
    }

    @Override // defpackage.g92
    public final fm9 getOwner() {
        return jce.a.b(bab.class);
    }

    @Override // defpackage.g92
    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        bab babVar = (bab) obj;
        usd usdVar = (usd) obj2;
        babVar.getClass();
        usdVar.getClass();
        return babVar.e(usdVar);
    }
}
