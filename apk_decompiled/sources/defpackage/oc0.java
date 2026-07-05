package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oc0 {
    public static final ww7 a = new ww7("javax.annotation.meta.TypeQualifierNickname");
    public static final ww7 b = new ww7("javax.annotation.meta.TypeQualifier");
    public static final ww7 c = new ww7("javax.annotation.meta.TypeQualifierDefault");
    public static final ww7 d = new ww7("kotlin.annotations.jvm.UnderMigration");
    public static final Map e;
    public static final LinkedHashMap f;
    public static final Set g;

    static {
        nc0 nc0Var = nc0.TYPE_PARAMETER_BOUNDS;
        nc0 nc0Var2 = nc0.TYPE_USE;
        nc0 nc0Var3 = nc0.FIELD;
        nc0 nc0Var4 = nc0.METHOD_RETURN_TYPE;
        nc0 nc0Var5 = nc0.VALUE_PARAMETER;
        List listX = x44.X(nc0Var3, nc0Var4, nc0Var5, nc0Var, nc0Var2);
        ww7 ww7Var = nj9.c;
        p9c p9cVar = p9c.G;
        List list = listX;
        Map mapH0 = sta.h0(new cpc(ww7Var, new zd9(new q9c(p9cVar), list, false)), new cpc(nj9.f, new zd9(new q9c(p9cVar), list, false)));
        e = mapH0;
        f = sta.l0(sta.h0(new cpc(new ww7("javax.annotation.ParametersAreNullableByDefault"), new zd9(new q9c(p9c.F), x44.W(nc0Var5))), new cpc(new ww7("javax.annotation.ParametersAreNonnullByDefault"), new zd9(new q9c(p9cVar), x44.W(nc0Var5)))), mapH0);
        g = mp0.Z0(new ww7[]{nj9.h, nj9.i});
    }

    public static final LinkedHashMap a() {
        return f;
    }

    public static final Set b() {
        return g;
    }

    public static final Map c() {
        return e;
    }

    public static final ww7 d() {
        return d;
    }

    public static final ww7 e() {
        return c;
    }

    public static final ww7 f() {
        return b;
    }

    public static final ww7 g() {
        return a;
    }
}
