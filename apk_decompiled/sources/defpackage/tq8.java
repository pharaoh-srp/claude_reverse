package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum tq8 extends hr8 {
    public tq8() {
        super("Initial", 0);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        if (hr8.a(hshVar)) {
            return true;
        }
        if (hshVar.a()) {
            iq8Var.w((zrh) hshVar);
            return true;
        }
        boolean zB = hshVar.b();
        zq8 zq8Var = hr8.F;
        if (!zB) {
            iq8Var.d.P = 2;
            iq8Var.l = zq8Var;
            return iq8Var.I(hshVar);
        }
        ash ashVar = (ash) hshVar;
        wsc wscVar = iq8Var.h;
        String strS = ashVar.d.s();
        wscVar.getClass();
        String strTrim = strS.trim();
        if (!wscVar.a) {
            strTrim = ouk.g(strTrim);
        }
        String strS2 = ashVar.f.s();
        String strS3 = ashVar.g.s();
        aa6 aa6Var = new aa6(strTrim);
        pqi.p(strS2);
        pqi.p(strS3);
        n31 n31VarK = aa6Var.k();
        n31VarK.b("name", strTrim);
        n31VarK.b("publicId", strS2);
        n31VarK.b("systemId", strS3);
        if (aa6Var.U("publicId")) {
            aa6Var.k().b("pubSysKey", "PUBLIC");
        } else if (aa6Var.U("systemId")) {
            aa6Var.k().b("pubSysKey", "SYSTEM");
        }
        String str = ashVar.e;
        if (str != null) {
            aa6Var.h("pubSysKey", str);
        }
        iq8Var.d.O(aa6Var);
        if (ashVar.i || !aa6Var.g("name").equals("html") || aa6Var.g("publicId").equalsIgnoreCase("HTML")) {
            iq8Var.d.P = 2;
        }
        iq8Var.l = zq8Var;
        return true;
    }
}
