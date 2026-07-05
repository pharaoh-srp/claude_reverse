package defpackage;

import com.anthropic.claude.api.chat.ChatFeedbackType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ps2 extends kq6 {
    public static final ps2 d;

    static {
        ChatFeedbackType.Companion.getClass();
        d = new ps2((KSerializer) ChatFeedbackType.$cachedKeepSerializer$delegate.getValue(), 0);
    }
}
