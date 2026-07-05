package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class pjj {
    public static hwi a(qh9 qh9Var) {
        try {
            return new hwi(qh9Var.s("count").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Error", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Error", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Error", e3);
            return null;
        }
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
    public static final Object b(vp4 vp4Var) {
        Object obj;
        c45 context = vp4Var.getContext();
        knk.u(context);
        tp4 tp4VarI = zni.I(vp4Var);
        z76 z76Var = tp4VarI instanceof z76 ? (z76) tp4VarI : null;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        if (z76Var == null) {
            obj = ieiVar;
        } else {
            e45 e45Var = z76Var.H;
            if (a86.c(e45Var, context)) {
                z76Var.J = ieiVar;
                z76Var.G = 1;
                e45Var.P0(context, z76Var);
            } else {
                ojj ojjVar = new ojj(ojj.G);
                c45 c45VarR0 = context.r0(ojjVar);
                z76Var.J = ieiVar;
                z76Var.G = 1;
                e45Var.P0(c45VarR0, z76Var);
                if (ojjVar.F) {
                    vz6 vz6VarA = vnh.a();
                    qo0 qo0Var = vz6VarA.I;
                    if (!(qo0Var != null ? qo0Var.isEmpty() : true)) {
                        if (vz6VarA.G >= 4294967296L) {
                            z76Var.J = ieiVar;
                            z76Var.G = 1;
                            vz6VarA.T0(z76Var);
                        } else {
                            vz6VarA.U0(true);
                            try {
                                z76Var.run();
                                do {
                                } while (vz6VarA.W0());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = ieiVar;
                }
            }
            obj = m45Var;
        }
        return obj == m45Var ? obj : ieiVar;
    }
}
