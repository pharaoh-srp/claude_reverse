package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public abstract class mj9 {
    public static final ww7 a;
    public static final sxb b;
    public static final ww7 c;
    public static final ww7 d;
    public static final ww7 e;
    public static final ww7 f;
    public static final ww7 g;
    public static final ww7 h;
    public static final ww7 i;
    public static final ww7 j;
    public static final ww7 k;
    public static final ww7 l;
    public static final ww7 m;
    public static final ww7 n;
    public static final ww7 o;
    public static final ww7 p;
    public static final ww7 q;

    static {
        ww7 ww7Var = new ww7("kotlin.Metadata");
        a = ww7Var;
        zj9.c(ww7Var).e();
        b = sxb.e(ExperienceToggle.DEFAULT_PARAM_KEY);
        c = new ww7(Target.class.getName());
        new ww7(ElementType.class.getName());
        d = new ww7(Retention.class.getName());
        new ww7(RetentionPolicy.class.getName());
        e = new ww7(Deprecated.class.getName());
        f = new ww7(Documented.class.getName());
        g = new ww7("java.lang.annotation.Repeatable");
        h = new ww7("org.jetbrains.annotations.NotNull");
        i = new ww7("org.jetbrains.annotations.Nullable");
        j = new ww7("org.jetbrains.annotations.Mutable");
        k = new ww7("org.jetbrains.annotations.ReadOnly");
        l = new ww7("kotlin.annotations.jvm.ReadOnly");
        m = new ww7("kotlin.annotations.jvm.Mutable");
        n = new ww7("kotlin.jvm.PurelyImplements");
        new ww7("kotlin.jvm.internal");
        ww7 ww7Var2 = new ww7("kotlin.jvm.internal.SerializedIr");
        o = ww7Var2;
        zj9.c(ww7Var2).e();
        p = new ww7("kotlin.jvm.internal.EnhancedNullability");
        q = new ww7("kotlin.jvm.internal.EnhancedMutability");
    }
}
