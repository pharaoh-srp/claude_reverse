package defpackage;

import com.anthropic.claude.core.telemetry.SilentException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class se2 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ se2(int i, tp4 tp4Var, String str) {
        super(2, tp4Var);
        this.E = i;
        this.F = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        String str = this.F;
        switch (i) {
            case 0:
                return new se2(0, tp4Var, str);
            case 1:
                return new se2(1, tp4Var, str);
            case 2:
                return new se2(2, tp4Var, str);
            case 3:
                return new se2(3, tp4Var, str);
            default:
                return new se2(4, tp4Var, str);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((se2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                ((se2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 2:
                ((se2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 3:
                return ((se2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((se2) create((String) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = 0;
        String str = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                qtc qtcVar = new qtc();
                x3h x3hVar = new x3h();
                ez8 ez8Var = new ez8();
                ez8Var.E = true;
                qtcVar.a(mp0.C0(new bc7[]{x3hVar, new yqg(ez8Var), new o91(1), new o91(i2)}));
                qtcVar.d = 2;
                qtc qtcVar2 = new qtc(qtcVar);
                str.getClass();
                jt9 jt9VarA = kt9.a(str);
                String str2 = jt9VarA.a;
                List list = jt9VarA.b;
                b5c b5cVarB = qtcVar2.b(str2);
                new ot9(list).a(b5cVarB);
                jz0 jz0VarF = puk.f(b5cVarB, null, null);
                if (jz0VarF != null) {
                    return jz0VarF;
                }
                sz6.p("Could not convert the generated Commonmark Node into an ASTNode!");
                return null;
            case 1:
                sf5.h0(obj);
                SilentException.a(new SilentException(ij0.j("ExperienceBulletRow: Unknown icon name '", str, "'")), null, false, 3);
                return ieiVar;
            case 2:
                sf5.h0(obj);
                SilentException.a(new SilentException(ij0.j("ExperienceFeatureCardRow: Unknown icon name '", str, "'")), null, false, 3);
                return ieiVar;
            case 3:
                sf5.h0(obj);
                return rwj.p(str);
            default:
                sf5.h0(obj);
                return str;
        }
    }
}
