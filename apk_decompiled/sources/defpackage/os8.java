package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class os8 {
    public final nd5 a;
    public final t82 b;
    public final br4 c;

    public os8(nd5 nd5Var, t82 t82Var, br4 br4Var) {
        this.a = nd5Var;
        this.b = t82Var;
        this.c = br4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x011a, code lost:
    
        throw defpackage.zni.O(r28, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:386:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x08fb A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.os8 b(defpackage.qre r26, java.lang.Class r27, java.lang.reflect.Method r28) {
        /*
            Method dump skipped, instruction units count: 2836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os8.b(qre, java.lang.Class, java.lang.reflect.Method):os8");
    }

    public abstract Object a(fdc fdcVar, Object[] objArr);
}
