package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.ChatFeedbackType;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fs2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ChatFeedbackType F;

    public /* synthetic */ fs2(ChatFeedbackType chatFeedbackType, int i) {
        this.E = i;
        this.F = chatFeedbackType;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.E;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        ChatFeedbackType chatFeedbackType = this.F;
        switch (i3) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    tjh.b(d4c.j0(ns2.c(chatFeedbackType), e18Var), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 0, 0, 262142);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    if (chatFeedbackType == ChatFeedbackType.UPVOTE) {
                        ud0 ud0Var = ud0.d;
                        i = R.drawable.anthropicon_thumbs_up_filled;
                    } else {
                        ud0 ud0Var2 = ud0.d;
                        i = R.drawable.anthropicon_thumbs_up;
                    }
                    cv8.b(u00.D(i, 0, e18Var2), d4c.j0(R.string.voice_feedback_positive_label, e18Var2), b.o(fqbVar, 20.0f), gm3.a(e18Var2).O, e18Var2, 392, 0);
                }
                break;
            default:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    if (chatFeedbackType == null || chatFeedbackType == ChatFeedbackType.UPVOTE) {
                        ud0 ud0Var3 = ud0.d;
                        i2 = R.drawable.anthropicon_thumbs_down;
                    } else {
                        ud0 ud0Var4 = ud0.d;
                        i2 = R.drawable.anthropicon_thumbs_down_filled;
                    }
                    cv8.b(u00.D(i2, 0, e18Var3), d4c.j0(R.string.voice_feedback_negative_label, e18Var3), b.o(fqbVar, 20.0f), gm3.a(e18Var3).O, e18Var3, 392, 0);
                }
                break;
        }
        return ieiVar;
    }
}
