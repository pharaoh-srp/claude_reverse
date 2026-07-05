package defpackage;

import com.anthropic.claude.api.account.Account;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fja {
    public static final oqb e;
    public final x4f a;
    public final j25 b;
    public final fk0 c;
    public final ql3 d;

    static {
        oqb oqbVar = new oqb();
        kce kceVar = jce.a;
        xai xaiVar = new xai(kceVar.b(lja.class));
        w7f w7fVar = new w7f(new qh1(xaiVar, kceVar.b(fja.class), null, new s79(16), kq9.G));
        oqbVar.a(w7fVar);
        fd9.n0(new ir9(oqbVar, w7fVar));
        oqbVar.d.add(xaiVar);
        e = oqbVar;
    }

    public fja(x4f x4fVar, j25 j25Var, fk0 fk0Var, ql3 ql3Var) {
        this.a = x4fVar;
        this.b = j25Var;
        this.c = fk0Var;
        this.d = ql3Var;
    }

    public final void a(Account account) {
        if (isg.h0(account.m105getEmail_addressZiuLfiY(), "@anthropic.com", false)) {
            fk0 fk0Var = this.c;
            fk0Var.d.setValue(Boolean.TRUE);
            vb7.B(fk0Var.a, "is_ant", true);
        }
        x4f x4fVar = this.a;
        List listD = x4fVar.c.d();
        x4fVar.d();
        String strM106getUuidislZJdo = account.m106getUuidislZJdo();
        strM106getUuidislZJdo.getClass();
        m7f m7fVarB = this.d.a.b("AccountScope:".concat(strM106getUuidislZJdo));
        if (m7fVarB == null) {
            m7fVarB = null;
        }
        x4f x4fVarD = m7fVarB != null ? (x4f) m7fVarB.a(jce.a.b(x4f.class), null, null) : null;
        if (x4fVarD == null) {
            String strM106getUuidislZJdo2 = account.m106getUuidislZJdo();
            strM106getUuidislZJdo2.getClass();
            oqb oqbVar = k25.a;
            j25 j25Var = this.b;
            x4fVarD = k25.d(j25Var.a, strM106getUuidislZJdo2, j25Var.b, j25Var.d, j25Var.c);
        }
        x4fVarD.c(listD);
    }
}
