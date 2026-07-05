package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k3e extends rok {
    public final /* synthetic */ int F;
    public final /* synthetic */ sr9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3e(sr9 sr9Var, int i) {
        super(4);
        this.F = i;
        this.G = sr9Var;
    }

    @Override // defpackage.rok
    public final void A0(String[] strArr) {
        int i = this.F;
        sr9 sr9Var = this.G;
        switch (i) {
            case 0:
                if (strArr == null) {
                    sz6.p("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((l3e) ((ro6) sr9Var).F).H = strArr;
                }
                break;
            case 1:
                if (strArr == null) {
                    sz6.p("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                } else {
                    ((l3e) ((ro6) sr9Var).F).I = strArr;
                }
                break;
            default:
                if (strArr == null) {
                    sz6.p("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((l3e) ((xzd) sr9Var).F).L = strArr;
                }
                break;
        }
    }
}
