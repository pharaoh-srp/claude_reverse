package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class en9 extends l08 implements pz7 {
    public static final en9 E = new en9(2);

    @Override // defpackage.g92, defpackage.ll9
    public final String getName() {
        return "loadProperty";
    }

    @Override // defpackage.g92
    public final fm9 getOwner() {
        return jce.a.b(bab.class);
    }

    @Override // defpackage.g92
    public final String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        bab babVar = (bab) obj;
        ctd ctdVar = (ctd) obj2;
        babVar.getClass();
        ctdVar.getClass();
        return babVar.f(ctdVar);
    }
}
