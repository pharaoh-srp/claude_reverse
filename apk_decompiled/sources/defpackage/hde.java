package defpackage;

import java.lang.reflect.Method;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.jsoup.helper.ValidationException;

/* JADX INFO: loaded from: classes3.dex */
public class hde {
    public static final boolean b;
    public final Pattern a;

    static {
        boolean z = false;
        try {
            try {
                Class<?> cls = Class.forName("pvc", false, hde.class.getClassLoader());
                try {
                    Class<?> cls2 = Class.forName("java.lang.Module");
                    Method method = Class.class.getMethod("getModule", null);
                    Object objInvoke = method.invoke(hde.class, null);
                    Object objInvoke2 = method.invoke(cls, null);
                    if (!((Boolean) cls2.getMethod("canRead", cls2).invoke(objInvoke, objInvoke2)).booleanValue()) {
                        cls2.getMethod("addReads", cls2).invoke(objInvoke, objInvoke2);
                    }
                } catch (ClassNotFoundException unused) {
                }
                z = true;
            } catch (ClassNotFoundException unused2) {
            }
        } catch (ReflectiveOperationException e) {
            System.err.println("Warning: (bug? please report) couldn't access re2j from jsoup due to modules: " + e);
        }
        b = z;
    }

    public hde(Pattern pattern) {
        this.a = pattern;
    }

    public static hde a(String str) {
        if (!b || !Boolean.parseBoolean(System.getProperty("jsoup.useRe2j", "true"))) {
            try {
                return new hde(Pattern.compile(str));
            } catch (PatternSyntaxException e) {
                throw new ValidationException("Pattern syntax error: " + e.getMessage());
            }
        }
        try {
            return new l2e(pvc.a(str));
        } catch (OutOfMemoryError | StackOverflowError e2) {
            throw new ValidationException("Pattern complexity error: " + e2.getMessage());
        } catch (RuntimeException e3) {
            throw new ValidationException("Pattern syntax error: " + e3.getMessage());
        }
    }

    public ro6 b(String str) {
        return new ro6(25, this.a.matcher(str));
    }

    public String toString() {
        return this.a.toString();
    }
}
