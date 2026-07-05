package defpackage;

import com.anthropic.claude.api.chat.ChatFeedbackType;
import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes2.dex */
public final class h1j implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ fn1 F;
    public final /* synthetic */ y0j G;

    public /* synthetic */ h1j(fn1 fn1Var, y0j y0jVar, int i) {
        this.E = i;
        this.F = fn1Var;
        this.G = y0jVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        y0j y0jVar = this.G;
        fn1 fn1Var = this.F;
        switch (i) {
            case 0:
                String str = y0jVar.b;
                str.getClass();
                jud judVar = ((tn1) fn1Var).o;
                ChatFeedbackType chatFeedbackType = ChatFeedbackType.UPVOTE;
                ((mdg) judVar.g).put(MessageId.m1051boximpl(str), chatFeedbackType);
                gb9.D((l45) judVar.f, null, null, new o0(judVar, str, chatFeedbackType, null, 23), 3);
                break;
            default:
                String str2 = y0jVar.b;
                str2.getClass();
                jud judVar2 = ((tn1) fn1Var).o;
                ChatFeedbackType chatFeedbackType2 = ChatFeedbackType.FLAG_OTHER;
                ((mdg) judVar2.g).put(MessageId.m1051boximpl(str2), chatFeedbackType2);
                gb9.D((l45) judVar2.f, null, null, new o0(judVar2, str2, chatFeedbackType2, null, 23), 3);
                break;
        }
        return ieiVar;
    }
}
