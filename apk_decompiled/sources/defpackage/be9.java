package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class be9 extends ow5 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ be9(kzi kziVar, int i) {
        super(kziVar);
        this.b = i;
    }

    @Override // defpackage.ow5
    public final boolean a(m6e m6eVar, go5 go5Var, bo5 bo5Var) {
        switch (this.b) {
            case 0:
                if (bo5Var != null) {
                    return ce9.c(go5Var, bo5Var);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
            case 1:
                if (bo5Var != null) {
                    return ce9.b(m6eVar, go5Var, bo5Var);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
            default:
                if (bo5Var != null) {
                    return ce9.b(m6eVar, go5Var, bo5Var);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }
}
