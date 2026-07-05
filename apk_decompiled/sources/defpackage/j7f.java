package defpackage;

import com.google.protobuf.e;
import com.google.protobuf.f;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class j7f {
    public static final Class a;
    public static final e b;
    public static final e c;
    public static final tei d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = a(false);
        c = a(true);
        d = new tei();
    }

    public static e a(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (e) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
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
    public static void b(e eVar, Object obj, Object obj2) {
        ((tei) eVar).getClass();
        v28 v28Var = (v28) obj;
        f fVar = v28Var.c;
        f fVar2 = ((v28) obj2).c;
        f fVar3 = f.e;
        if (!fVar3.equals(fVar2)) {
            if (fVar3.equals(fVar)) {
                int i = fVar.a + fVar2.a;
                int[] iArrCopyOf = Arrays.copyOf(fVar.b, i);
                System.arraycopy(fVar2.b, 0, iArrCopyOf, fVar.a, fVar2.a);
                Object[] objArrCopyOf = Arrays.copyOf(fVar.c, i);
                System.arraycopy(fVar2.c, 0, objArrCopyOf, fVar.a, fVar2.a);
                fVar = new f(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                fVar.getClass();
                if (!fVar2.equals(fVar3)) {
                    if (!fVar.d) {
                        mr9.x();
                        return;
                    }
                    int i2 = fVar.a + fVar2.a;
                    fVar.a(i2);
                    System.arraycopy(fVar2.b, 0, fVar.b, fVar.a, fVar2.a);
                    System.arraycopy(fVar2.c, 0, fVar.c, fVar.a, fVar2.a);
                    fVar.a = i2;
                }
            }
        }
        v28Var.c = fVar;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
