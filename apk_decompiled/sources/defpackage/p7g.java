package defpackage;

import com.anthropic.claude.types.strings.ToolUseId;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p7g implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ m83 F;
    public final /* synthetic */ mtc G;

    public /* synthetic */ p7g(m83 m83Var, mtc mtcVar, int i) {
        this.E = i;
        this.F = m83Var;
        this.G = mtcVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        mtc mtcVar = this.G;
        m83 m83Var = this.F;
        switch (i) {
            case 0:
                m83Var.m.invoke(mtcVar);
                break;
            case 1:
                btc btcVar = (btc) mtcVar;
                m83Var.k.invoke(btcVar.a, btcVar.b);
                break;
            case 2:
                zsc zscVar = (zsc) mtcVar;
                m83Var.h.invoke(zscVar.c, zscVar.a);
                break;
            case 3:
                m83Var.i.invoke(ToolUseId.m1157boximpl(((ysc) mtcVar).a));
                break;
            default:
                m83Var.l.invoke(mtcVar);
                break;
        }
        return ieiVar;
    }
}
