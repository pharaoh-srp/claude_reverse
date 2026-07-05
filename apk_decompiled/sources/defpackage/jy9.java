package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class jy9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ ly9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jy9(ly9 ly9Var, int i) {
        super(0);
        this.F = i;
        this.G = ly9Var;
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
    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        ly9 ly9Var = this.G;
        switch (i) {
            case 0:
                c06 c06Var = c06.m;
                fab.a.getClass();
                f06 f06Var = f06.c0;
                c06Var.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                bm4 bm4Var = c06.c;
                if (c06Var.a(bm4.h())) {
                    for (sxb sxbVar : ly9Var.h(c06Var, f06Var)) {
                        f06Var.invoke(sxbVar);
                        xh3 xh3VarE = ly9Var.e(sxbVar, 13);
                        if (xh3VarE != null) {
                            linkedHashSet.add(xh3VarE);
                        }
                    }
                }
                bm4 bm4Var2 = c06.c;
                if (c06Var.a(bm4.i()) && !c06Var.b().contains(yz5.a)) {
                    for (sxb sxbVar2 : ly9Var.i(c06Var, f06Var)) {
                        f06Var.invoke(sxbVar2);
                        linkedHashSet.addAll(ly9Var.g(sxbVar2, 13));
                    }
                }
                bm4 bm4Var3 = c06.c;
                if (c06Var.a(bm4.n()) && !c06Var.b().contains(yz5.a)) {
                    for (sxb sxbVar3 : ly9Var.o(c06Var)) {
                        f06Var.invoke(sxbVar3);
                        linkedHashSet.addAll(ly9Var.d(sxbVar3, 13));
                    }
                }
                return w44.p1(linkedHashSet);
            case 1:
                return ly9Var.h(c06.o, null);
            case 2:
                return ly9Var.k();
            case 3:
                return ly9Var.i(c06.p, null);
            default:
                return ly9Var.o(c06.q);
        }
    }
}
