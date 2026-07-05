package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rb {
    public final Object a;

    public rb(String str) {
        this.a = str;
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
        if (!(obj instanceof rb)) {
            return false;
        }
        qb qbVar = vsj.a;
        return qbVar.equals(qbVar) && x44.r(this.a, ((rb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 807599070;
    }

    public final String toString() {
        return "(com.anthropic.claude.intent.extra.START_CHAT_MODE, " + this.a + ')';
    }
}
