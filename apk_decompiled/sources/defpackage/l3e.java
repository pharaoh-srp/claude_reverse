package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l3e implements ur9 {
    public static final boolean M = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
    public static final HashMap N;
    public int[] E;
    public String F;
    public int G;
    public String[] H;
    public String[] I;
    public String[] J;
    public pr9 K;
    public String[] L;

    static {
        HashMap map = new HashMap();
        N = map;
        map.put(gh3.j(new ww7("kotlin.jvm.internal.KotlinClass")), pr9.CLASS);
        map.put(gh3.j(new ww7("kotlin.jvm.internal.KotlinFileFacade")), pr9.FILE_FACADE);
        map.put(gh3.j(new ww7("kotlin.jvm.internal.KotlinMultifileClass")), pr9.MULTIFILE_CLASS);
        map.put(gh3.j(new ww7("kotlin.jvm.internal.KotlinMultifileClassPart")), pr9.MULTIFILE_CLASS_PART);
        map.put(gh3.j(new ww7("kotlin.jvm.internal.KotlinSyntheticClass")), pr9.SYNTHETIC_CLASS);
    }

    @Override // defpackage.ur9
    public final sr9 a(gh3 gh3Var, xae xaeVar) {
        pr9 pr9Var;
        ww7 ww7VarB = gh3Var.b();
        if (ww7VarB.equals(mj9.a)) {
            return new n78(21, this);
        }
        if (ww7VarB.equals(mj9.o)) {
            return new xzd(2, this);
        }
        if (M || this.K != null || (pr9Var = (pr9) N.get(gh3Var)) == null) {
            return null;
        }
        this.K = pr9Var;
        return new ro6(23, this);
    }
}
