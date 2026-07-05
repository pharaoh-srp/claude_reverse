package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class gfa {
    public static final String d;
    public static final xea e;
    public final f7g a;
    public final efk b;
    public final String c;

    static {
        String canonicalName = gfa.class.getCanonicalName();
        canonicalName.getClass();
        int iL0 = bsg.L0(canonicalName, 6, ".");
        d = iL0 == -1 ? "" : canonicalName.substring(0, iL0);
        e = new xea("NO_LOCKS", lja.W);
    }

    public gfa(String str) {
        this(str, new efe(12, new ReentrantLock()));
    }

    public static void e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!stackTrace[i].getClassName().startsWith(d)) {
                break;
            } else {
                i++;
            }
        }
        List listSubList = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
    }

    public final dfa a(zy7 zy7Var) {
        return new dfa(this, zy7Var);
    }

    public final afa b(bz7 bz7Var) {
        return new afa(this, new ConcurrentHashMap(3, 1.0f, 2), bz7Var, 1);
    }

    public final efa c(bz7 bz7Var) {
        return new efa(this, new ConcurrentHashMap(3, 1.0f, 2), bz7Var);
    }

    public z5l d(String str, Object obj) {
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        sb.append(obj == null ? "" : ij0.h("on input: ", obj));
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return ij0.m(sb, this.c, ")");
    }

    public gfa(String str, f7g f7gVar) {
        efk efkVar = efk.L;
        this.a = f7gVar;
        this.b = efkVar;
        this.c = str;
    }
}
