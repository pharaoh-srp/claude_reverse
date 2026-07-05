package defpackage;

import com.anthropic.claude.analytics.events.LoginEvents$EmailLoginSSOSuccess;
import com.anthropic.claude.analytics.events.LoginEvents$SignInWithGoogleFinished;

/* JADX INFO: loaded from: classes2.dex */
public final class j9j implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ m9j F;

    public /* synthetic */ j9j(m9j m9jVar, int i) {
        this.E = i;
        this.F = m9jVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        m9j m9jVar = this.F;
        switch (i) {
            case 0:
                m9jVar.g.e(new LoginEvents$SignInWithGoogleFinished(), LoginEvents$SignInWithGoogleFinished.Companion.serializer());
                m9jVar.h.c(hd.GOOGLE);
                break;
            default:
                m9jVar.g.e(new LoginEvents$EmailLoginSSOSuccess(), LoginEvents$EmailLoginSSOSuccess.Companion.serializer());
                break;
        }
        return ieiVar;
    }
}
