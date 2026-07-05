package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i71 implements tac {
    public static final i71 a = new i71();
    public static final mh7 b = mh7.b("eventTimeMs");
    public static final mh7 c = mh7.b("eventCode");
    public static final mh7 d = mh7.b("eventUptimeMs");
    public static final mh7 e = mh7.b("sourceExtension");
    public static final mh7 f = mh7.b("sourceExtensionJsonProto3");
    public static final mh7 g = mh7.b("timezoneOffsetSeconds");
    public static final mh7 h = mh7.b("networkConnectionInfo");

    @Override // defpackage.cn6
    public final void a(Object obj, Object obj2) {
        mfa mfaVar = (mfa) obj;
        uac uacVar = (uac) obj2;
        uacVar.e(b, ((u81) mfaVar).a);
        u81 u81Var = (u81) mfaVar;
        uacVar.a(c, u81Var.b);
        uacVar.e(d, u81Var.c);
        uacVar.a(e, u81Var.d);
        uacVar.a(f, u81Var.e);
        uacVar.e(g, u81Var.f);
        uacVar.a(h, u81Var.g);
    }
}
