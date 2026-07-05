package defpackage;

import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.e;
import com.anthropic.claude.sessions.types.SessionResource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c14 extends m08 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ c F;
    public final /* synthetic */ SessionResource G;
    public final /* synthetic */ bz7 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c14(c cVar, SessionResource sessionResource, bz7 bz7Var, int i) {
        super(0, gb9.class, "archive", "SessionRow$archive(Lcom/anthropic/claude/code/remote/CodeRemoteListScreenData;Lcom/anthropic/claude/sessions/types/SessionResource;Lkotlin/jvm/functions/Function1;)V", 0);
        this.E = i;
        switch (i) {
            case 1:
                this.F = cVar;
                this.G = sessionResource;
                this.H = bz7Var;
                super(0, gb9.class, "unarchive", "SessionRow$unarchive(Lcom/anthropic/claude/code/remote/CodeRemoteListScreenData;Lcom/anthropic/claude/sessions/types/SessionResource;Lkotlin/jvm/functions/Function1;)V", 0);
                break;
            default:
                this.F = cVar;
                this.G = sessionResource;
                this.H = bz7Var;
                break;
        }
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        bz7 bz7Var = this.H;
        SessionResource sessionResource = this.G;
        c cVar = this.F;
        switch (i) {
            case 0:
                e.j(cVar, sessionResource, bz7Var);
                break;
            default:
                e.k(cVar, sessionResource, bz7Var);
                break;
        }
        return ieiVar;
    }
}
