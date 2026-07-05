package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j3e extends rok {
    public final /* synthetic */ int F;
    public final /* synthetic */ n78 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3e(n78 n78Var, int i) {
        super(4);
        this.F = i;
        this.G = n78Var;
    }

    @Override // defpackage.rok
    public final void A0(String[] strArr) {
        int i = this.F;
        n78 n78Var = this.G;
        switch (i) {
            case 0:
                if (strArr == null) {
                    sz6.p("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((l3e) n78Var.F).H = strArr;
                }
                break;
            default:
                if (strArr == null) {
                    sz6.p("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                } else {
                    ((l3e) n78Var.F).I = strArr;
                }
                break;
        }
    }
}
