package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tz1 extends l08 implements bz7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tz1(int i, Object obj, int i2) {
        super(i, obj);
        this.E = i2;
    }

    @Override // defpackage.g92, defpackage.ll9
    public final String getName() {
        switch (this.E) {
            case 0:
                return "loadResource";
            default:
                return "<init>";
        }
    }

    @Override // defpackage.g92
    public final fm9 getOwner() {
        switch (this.E) {
            case 0:
                return jce.a.b(xz1.class);
            default:
                return jce.a.b(y06.class);
        }
    }

    @Override // defpackage.g92
    public final String getSignature() {
        switch (this.E) {
            case 0:
                return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
            default:
                return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        switch (this.E) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((xz1) this.receiver).getClass();
                return xz1.a(str);
            default:
                es9 es9Var = (es9) obj;
                es9Var.getClass();
                return new y06((c16) this.receiver, es9Var);
        }
    }
}
