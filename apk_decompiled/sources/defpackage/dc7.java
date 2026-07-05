package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dc7 extends t3 {
    public final c92 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc7(c92 c92Var, yr9 yr9Var) {
        super(yr9Var);
        if (yr9Var == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.G = c92Var;
    }

    @Override // defpackage.t3
    public final String toString() {
        return getType() + ": Ext {" + this.G + "}";
    }
}
