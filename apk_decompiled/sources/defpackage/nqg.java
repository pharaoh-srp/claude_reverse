package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nqg {
    public final int a;
    public final int b;
    public final long c;

    public nqg(int i, int i2, long j) {
        qqg qqgVar = qqg.E;
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqg)) {
            return false;
        }
        nqg nqgVar = (nqg) obj;
        if (this.a != nqgVar.a || this.b != nqgVar.b || this.c != nqgVar.c) {
            return false;
        }
        qqg qqgVar = qqg.E;
        return qqgVar.equals(qqgVar);
    }

    public final int hashCode() {
        return qqg.E.hashCode() + vb7.e(vb7.c(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        qqg qqgVar = qqg.E;
        StringBuilder sbV = vb7.v("StreamingFadeConfig(tailChars=", ", durationMs=", this.a, this.b, ", settleDelayMs=");
        sbV.append(this.c);
        sbV.append(", buildTailRenderEffect=");
        sbV.append(qqgVar);
        sbV.append(")");
        return sbV.toString();
    }
}
