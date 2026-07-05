package defpackage;

import com.anthropic.claude.api.chat.InputMode;

/* JADX INFO: loaded from: classes2.dex */
public interface whd {
    InputMode a();

    boolean b();

    String c();

    default boolean d() {
        return b() && a() == InputMode.VOICE;
    }

    String e();

    int getIndex();
}
