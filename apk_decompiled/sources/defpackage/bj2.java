package defpackage;

import com.anthropic.claude.api.chat.messages.BellNoteBlock;
import com.anthropic.claude.api.chat.messages.ContentBlock;
import com.anthropic.claude.api.chat.messages.TextBlock;
import com.anthropic.claude.api.chat.messages.ThinkingBlock;
import com.anthropic.claude.api.chat.messages.VoiceNoteBlock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bj2 {
    public static final /* synthetic */ int a = 0;

    static {
        lz1 lz1Var = uh6.F;
        v40.Q(16, zh6.MILLISECONDS);
    }

    public static final int a(ContentBlock contentBlock) {
        String text;
        if (contentBlock instanceof TextBlock) {
            return ((TextBlock) contentBlock).getText().length();
        }
        if (contentBlock instanceof ThinkingBlock) {
            return ((ThinkingBlock) contentBlock).getThinking().length();
        }
        if (contentBlock instanceof VoiceNoteBlock) {
            String text2 = ((VoiceNoteBlock) contentBlock).getText();
            if (text2 != null) {
                return text2.length();
            }
            return 0;
        }
        if (!(contentBlock instanceof BellNoteBlock) || (text = ((BellNoteBlock) contentBlock).getText()) == null) {
            return 0;
        }
        return text.length();
    }

    public static b3f b(gq7 gq7Var, long j) {
        return new b3f(new p0(k2e.M, j, gq7Var, (tp4) null, 1));
    }

    public static final String c(int i, String str) {
        if (1 <= i && i < str.length()) {
            int i2 = i - 1;
            if (Character.isHighSurrogate(str.charAt(i2))) {
                i = i2;
            }
        }
        return bsg.j1(i, str);
    }
}
