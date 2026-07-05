package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j71 implements tac {
    public static final j71 a = new j71();
    public static final mh7 b = mh7.b("requestTimeMs");
    public static final mh7 c = mh7.b("requestUptimeMs");
    public static final mh7 d = mh7.b("clientInfo");
    public static final mh7 e = mh7.b("logSource");
    public static final mh7 f = mh7.b("logSourceName");
    public static final mh7 g = mh7.b("logEvent");
    public static final mh7 h = mh7.b("qosTier");

    @Override // defpackage.cn6
    public final void a(Object obj, Object obj2) {
        tfa tfaVar = (tfa) obj;
        uac uacVar = (uac) obj2;
        uacVar.e(b, ((v81) tfaVar).a);
        v81 v81Var = (v81) tfaVar;
        uacVar.e(c, v81Var.b);
        uacVar.a(d, v81Var.c);
        uacVar.a(e, v81Var.d);
        uacVar.a(f, v81Var.e);
        uacVar.a(g, v81Var.f);
        uacVar.a(h, v81Var.g);
    }
}
