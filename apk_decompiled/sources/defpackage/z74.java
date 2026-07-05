package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z74 {
    public final qtc a;

    public z74(aua auaVar) {
        auaVar.getClass();
        qtc qtcVar = new qtc();
        x3h x3hVar = new x3h();
        ez8 ez8Var = new ez8();
        ez8Var.E = true;
        qtcVar.a(mp0.C0(new bc7[]{x3hVar, new yqg(ez8Var), new o91(1), auaVar.a ? new o91(0) : null}));
        qtcVar.d = 2;
        this.a = new qtc(qtcVar);
    }

    public final jz0 a(String str) {
        str.getClass();
        jt9 jt9VarA = kt9.a(str);
        String strA = jt9VarA.a();
        List listB = jt9VarA.b();
        b5c b5cVarB = this.a.b(strA);
        new ot9(listB).a(b5cVarB);
        jz0 jz0VarF = puk.f(b5cVarB, null, null);
        if (jz0VarF != null) {
            return jz0VarF;
        }
        sz6.p("Could not convert the generated Commonmark Node into an ASTNode!");
        return null;
    }
}
