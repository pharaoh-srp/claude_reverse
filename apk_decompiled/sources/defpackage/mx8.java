package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mx8 {
    public static final efe a;
    public static final efe b;
    public static final efe c;
    public static final efe d;

    static {
        int i = 1;
        a = new efe(i, lm6.E);
        b = new efe(i, nvj.a(FreeTypeConstants.FT_LOAD_MONOCHROME, FreeTypeConstants.FT_LOAD_MONOCHROME));
        c = new efe(i, Boolean.FALSE);
        d = new efe(i, Boolean.TRUE);
    }

    public static final void a(fx8 fx8Var) {
        efe efeVar = nx8.a;
        fx8Var.d().a(nx8.a, new nc5(200));
    }

    public static final boolean b(qjc qjcVar) {
        return ((Boolean) dch.z(qjcVar, c)).booleanValue();
    }

    public static final j8g c(jx8 jx8Var) {
        return (j8g) dch.y(jx8Var, b);
    }

    public static final List d(jx8 jx8Var) {
        return (List) dch.y(jx8Var, a);
    }
}
