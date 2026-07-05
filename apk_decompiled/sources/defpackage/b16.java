package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b16 extends l08 implements bz7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b16(int i, Object obj) {
        super(1, obj);
        this.E = i;
    }

    @Override // defpackage.g92, defpackage.ll9
    public final String getName() {
        switch (this.E) {
            case 0:
                return "simpleType";
            case 1:
                return "getValueClassPropertyType";
            case 2:
                return "prepareType";
            case 3:
                return "searchMethodsByNameWithoutBuiltinMagic";
            default:
                return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }
    }

    @Override // defpackage.g92
    public final fm9 getOwner() {
        switch (this.E) {
        }
        return jce.a.b(zx9.class);
    }

    @Override // defpackage.g92
    public final String getSignature() {
        switch (this.E) {
            case 0:
                return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
            case 1:
                return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
            case 2:
                return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
            case 3:
                return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            default:
                return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        switch (this.E) {
            case 0:
                ntd ntdVar = (ntd) obj;
                ntdVar.getClass();
                return ((aai) this.receiver).d(ntdVar, true);
            case 1:
                sxb sxbVar = (sxb) obj;
                sxbVar.getClass();
                return ((c16) this.receiver).w0(sxbVar);
            case 2:
                cs9 cs9Var = (cs9) obj;
                cs9Var.getClass();
                return ((ds9) this.receiver).a(cs9Var);
            case 3:
                sxb sxbVar2 = (sxb) obj;
                sxbVar2.getClass();
                return zx9.v((zx9) this.receiver, sxbVar2);
            default:
                sxb sxbVar3 = (sxb) obj;
                sxbVar3.getClass();
                return zx9.w((zx9) this.receiver, sxbVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b16(int i, Object obj, int i2) {
        super(i, obj);
        this.E = i2;
    }
}
