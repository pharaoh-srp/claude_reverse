package defpackage;

import com.anthropic.claude.chat.ChatScreenParams;
import com.arkivanov.essenty.statekeeper.b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class u53 {
    public static final List a = x44.X(1500L, 3000L, 6000L);
    public static final ide b = new ide("\"loading_messages\"\\s*:\\s*(\\[[^\\]]*\\])\\s*,\\s*\"");

    public static final t53 a(ChatScreenParams chatScreenParams, ld4 ld4Var, int i) {
        chatScreenParams.getClass();
        e18 e18Var = (e18) ld4Var;
        m7f m7fVar = (m7f) e18Var.j(gr9.b);
        b bVarC = ((swe) e18Var.j(twe.a)).a.c();
        boolean zH = ((((i & 14) ^ 6) > 4 && e18Var.f(chatScreenParams)) || (i & 6) == 4) | e18Var.h(bVarC) | e18Var.h(m7fVar);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            objN = new nf1(chatScreenParams, bVarC, m7fVar, 3);
            e18Var.k0(objN);
        }
        kce kceVar = jce.a;
        return (t53) fd9.r0(kceVar.b(t53.class), oq5.B(kceVar.b(t53.class)), (bz7) objN, e18Var);
    }
}
