package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mp1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ eli F;

    public /* synthetic */ mp1(eli eliVar, int i) {
        this.E = i;
        this.F = eliVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        eli eliVar = this.F;
        switch (i) {
            case 0:
                eliVar.a("https://play.google.com/store/account/subscriptions?package=com.anthropic.claude");
                break;
            case 1:
                eliVar.a("https://github.com/apps/claude/installations/new");
                break;
            case 2:
                eliVar.a("https://claude.ai/upgrade");
                break;
            case 3:
                eliVar.a("https://code.claude.com/docs/en/permission-modes");
                break;
            case 4:
                eliVar.a("https://code.claude.com/docs/en/security");
                break;
            default:
                eliVar.a(tyg.CLAUDE_PRO_USAGE.a());
                break;
        }
        return ieiVar;
    }
}
