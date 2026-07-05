package defpackage;

import com.anthropic.claude.conway.f;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hr4 extends m08 implements bz7, uzg {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hr4(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.E = i3;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        switch (this.E) {
            case 0:
                tp4 tp4Var = (tp4) obj;
                f fVar = (f) this.receiver;
                hsf hsfVar = (hsf) fVar.y.getValue();
                tp4 tp4Var2 = null;
                if (hsfVar == null) {
                    return null;
                }
                String strL0 = fVar.l0();
                if (f.u0(strL0)) {
                    return null;
                }
                oqb oqbVar = k25.a;
                x4f x4fVar = fVar.g;
                x4fVar.getClass();
                g25 g25VarC = k25.c(x4fVar);
                String str = g25VarC != null ? g25VarC.b : null;
                if (str == null) {
                    return null;
                }
                rs4 rs4VarA = ((tw4) fVar.h).a(strL0, str, fVar.f.e);
                return gb9.c0(rs4VarA.c.b(), new ps4(rs4VarA, hsfVar.a, tp4Var2, 0), tp4Var);
            case 1:
                return f.Z((f) this.receiver, (tp4) obj);
            default:
                return x0c.b((x0c) this.receiver, (tp4) obj);
        }
    }
}
