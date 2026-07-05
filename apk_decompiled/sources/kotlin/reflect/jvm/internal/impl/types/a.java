package kotlin.reflect.jvm.internal.impl.types;

import defpackage.bbi;
import defpackage.djk;
import defpackage.ex;
import defpackage.fbi;
import defpackage.fsh;
import defpackage.hc2;
import defpackage.l66;
import defpackage.mu6;
import defpackage.nu6;
import defpackage.owj;
import defpackage.vai;
import defpackage.w9i;
import defpackage.wai;
import defpackage.yr9;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final a b = new a(bbi.a);
    public final bbi a;

    public a(bbi bbiVar) {
        this.a = bbiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.a.a(int):void");
    }

    public static int b(int i, int i2) {
        if (i == 0) {
            a(38);
            throw null;
        }
        if (i2 == 0) {
            a(39);
            throw null;
        }
        if (i == 1) {
            if (i2 == 0) {
                a(40);
                throw null;
            }
        } else {
            if (i2 == 1) {
                if (i != 0) {
                    return i;
                }
                a(41);
                throw null;
            }
            if (i != i2) {
                throw new AssertionError("Variance conflict: type parameter variance '" + fsh.E(i) + "' and projection kind '" + fsh.E(i2) + "' cannot be combined");
            }
            if (i2 == 0) {
                a(42);
                throw null;
            }
        }
        return i2;
    }

    public static int c(int i, int i2) {
        if (i == 2 && i2 == 3) {
            return 3;
        }
        return (i == 3 && i2 == 2) ? 2 : 1;
    }

    public static a d(yr9 yr9Var) {
        if (yr9Var == null) {
            a(6);
            throw null;
        }
        return new a(w9i.b.h(yr9Var.O(), yr9Var.H()));
    }

    public static a e(bbi bbiVar) {
        return new a(bbiVar);
    }

    public static a f(bbi bbiVar, bbi bbiVar2) {
        if (bbiVar == null) {
            a(3);
            throw null;
        }
        if (bbiVar2 == null) {
            a(4);
            throw null;
        }
        if (bbiVar.f()) {
            bbiVar = bbiVar2;
        } else if (!bbiVar2.f()) {
            bbiVar = new l66(bbiVar, bbiVar2);
        }
        return new a(bbiVar);
    }

    public static String j(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (djk.i(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public final bbi g() {
        return this.a;
    }

    public final boolean h() {
        return this.a.f();
    }

    public final yr9 i(int i, yr9 yr9Var) {
        if (yr9Var == null) {
            a(9);
            throw null;
        }
        if (i == 0) {
            a(10);
            throw null;
        }
        if (this.a.f()) {
            return yr9Var;
        }
        try {
            yr9 yr9VarB = l(new wai(i, yr9Var), null, 0).b();
            if (yr9VarB != null) {
                return yr9VarB;
            }
            a(12);
            throw null;
        } catch (TypeSubstitutor$SubstitutionException e) {
            return nu6.c(mu6.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
        }
    }

    public final yr9 k(int i, yr9 yr9Var) {
        if (yr9Var == null) {
            a(14);
            throw null;
        }
        if (i == 0) {
            a(15);
            throw null;
        }
        bbi bbiVar = this.a;
        vai waiVar = new wai(i, bbiVar.g(i, yr9Var));
        if (!bbiVar.f()) {
            try {
                waiVar = l(waiVar, null, 0);
            } catch (TypeSubstitutor$SubstitutionException unused) {
                waiVar = null;
            }
        }
        if (bbiVar.a() || bbiVar.b()) {
            boolean zB = bbiVar.b();
            if (waiVar == null) {
                waiVar = null;
            } else if (!waiVar.c()) {
                yr9 yr9VarB = waiVar.b();
                yr9VarB.getClass();
                if (fbi.c(yr9VarB, ex.a0, null)) {
                    int iA = waiVar.a();
                    if (iA == 0) {
                        throw null;
                    }
                    if (iA == 3) {
                        waiVar = new wai(iA, (yr9) owj.g(yr9VarB).b);
                    } else if (zB) {
                        waiVar = new wai(iA, (yr9) owj.g(yr9VarB).a);
                    } else {
                        hc2 hc2Var = new hc2();
                        a aVar = new a(hc2Var);
                        if (!hc2Var.f()) {
                            try {
                                waiVar = aVar.l(waiVar, null, 0);
                            } catch (TypeSubstitutor$SubstitutionException unused2) {
                                waiVar = null;
                            }
                        }
                    }
                }
            }
        }
        if (waiVar == null) {
            return null;
        }
        return waiVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vai l(defpackage.vai r17, defpackage.qai r18, int r19) throws kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$SubstitutionException {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.a.l(vai, qai, int):vai");
    }
}
