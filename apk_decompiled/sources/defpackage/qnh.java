package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qnh {
    public static final sqb a = new sqb("NO_THREAD_ELEMENTS", 1);
    public static final lwf b = new lwf(16);
    public static final lwf c = new lwf(17);
    public static final lwf d = new lwf(18);

    public static final void a(c45 c45Var, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof aoh)) {
            Object objK = c45Var.K(c, null);
            objK.getClass();
            ((unh) objK).a(obj);
            return;
        }
        aoh aohVar = (aoh) obj;
        unh[] unhVarArr = aohVar.c;
        int length = unhVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            unh unhVar = unhVarArr[length];
            unhVar.getClass();
            unhVar.a(aohVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object b(c45 c45Var) {
        Object objK = c45Var.K(b, 0);
        objK.getClass();
        return objK;
    }

    public static final Object c(c45 c45Var, Object obj) {
        if (obj == null) {
            obj = b(c45Var);
        }
        if (obj == 0) {
            return a;
        }
        if (!(obj instanceof Integer)) {
            return ((unh) obj).b();
        }
        return c45Var.K(d, new aoh(((Number) obj).intValue(), c45Var));
    }
}
