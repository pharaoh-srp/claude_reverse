package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pz1 {
    public static final pz1 m = new pz1();
    public final oc7 a;
    public final t28 b;
    public final t28 c;
    public final t28 d;
    public final t28 e;
    public final t28 f;
    public final t28 g;
    public final t28 h;
    public final t28 i;
    public final t28 j;
    public final t28 k;
    public final t28 l;

    public pz1() {
        oc7 oc7Var = new oc7();
        wz1.a(oc7Var);
        wz1.a.getClass();
        t28 t28Var = wz1.c;
        t28Var.getClass();
        t28 t28Var2 = wz1.b;
        t28Var2.getClass();
        t28 t28Var3 = wz1.d;
        t28Var3.getClass();
        t28 t28Var4 = wz1.e;
        t28Var4.getClass();
        t28 t28Var5 = wz1.f;
        t28Var5.getClass();
        t28 t28Var6 = wz1.g;
        t28Var6.getClass();
        t28 t28Var7 = wz1.i;
        t28Var7.getClass();
        t28 t28Var8 = wz1.h;
        t28Var8.getClass();
        t28 t28Var9 = wz1.j;
        t28Var9.getClass();
        t28 t28Var10 = wz1.k;
        t28Var10.getClass();
        t28 t28Var11 = wz1.l;
        t28Var11.getClass();
        this.a = oc7Var;
        this.b = t28Var;
        this.c = t28Var2;
        this.d = t28Var3;
        this.e = t28Var4;
        this.f = t28Var5;
        this.g = t28Var6;
        this.h = t28Var7;
        this.i = t28Var8;
        this.j = t28Var9;
        this.k = t28Var10;
        this.l = t28Var11;
    }

    public static String a(ww7 ww7Var) {
        String strB;
        ww7Var.getClass();
        StringBuilder sb = new StringBuilder();
        String strReplace = ww7Var.b().replace('.', '/');
        strReplace.getClass();
        sb.append(strReplace);
        sb.append('/');
        if (ww7Var.d()) {
            strB = "default-package";
        } else {
            strB = ww7Var.f().b();
            strB.getClass();
        }
        sb.append(strB.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
