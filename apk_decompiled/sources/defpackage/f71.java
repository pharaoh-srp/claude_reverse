package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f71 implements tac {
    public static final f71 a = new f71();
    public static final mh7 b = mh7.b("sdkVersion");
    public static final mh7 c = mh7.b("model");
    public static final mh7 d = mh7.b("hardware");
    public static final mh7 e = mh7.b("device");
    public static final mh7 f = mh7.b("product");
    public static final mh7 g = mh7.b("osBuild");
    public static final mh7 h = mh7.b("manufacturer");
    public static final mh7 i = mh7.b("fingerprint");
    public static final mh7 j = mh7.b("locale");
    public static final mh7 k = mh7.b("country");
    public static final mh7 l = mh7.b("mccMnc");
    public static final mh7 m = mh7.b("applicationBuild");

    @Override // defpackage.cn6
    public final void a(Object obj, Object obj2) {
        lz lzVar = (lz) obj;
        uac uacVar = (uac) obj2;
        uacVar.a(b, ((h81) lzVar).a);
        h81 h81Var = (h81) lzVar;
        uacVar.a(c, h81Var.b);
        uacVar.a(d, h81Var.c);
        uacVar.a(e, h81Var.d);
        uacVar.a(f, h81Var.e);
        uacVar.a(g, h81Var.f);
        uacVar.a(h, h81Var.g);
        uacVar.a(i, h81Var.h);
        uacVar.a(j, h81Var.i);
        uacVar.a(k, h81Var.j);
        uacVar.a(l, h81Var.k);
        uacVar.a(m, h81Var.l);
    }
}
