package com.anthropic.claude.api.chat;

import defpackage.fq6;
import defpackage.g9b;
import defpackage.kw9;
import defpackage.lib;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/anthropic/claude/api/chat/MessageSender;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "lib", "HUMAN", "ASSISTANT", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class MessageSender {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MessageSender[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final lib Companion;
    public static final MessageSender HUMAN = new MessageSender("HUMAN", 0);
    public static final MessageSender ASSISTANT = new MessageSender("ASSISTANT", 1);

    private static final /* synthetic */ MessageSender[] $values() {
        return new MessageSender[]{HUMAN, ASSISTANT};
    }

    static {
        MessageSender[] messageSenderArr$values = $values();
        $VALUES = messageSenderArr$values;
        $ENTRIES = wd6.n0(messageSenderArr$values);
        Companion = new lib();
        $cachedSerializer$delegate = yb5.w(w1a.F, new g9b(21));
    }

    private MessageSender(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.chat.MessageSender", values(), new String[]{"human", "assistant"}, new Annotation[][]{null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MessageSender valueOf(String str) {
        return (MessageSender) Enum.valueOf(MessageSender.class, str);
    }

    public static MessageSender[] values() {
        return (MessageSender[]) $VALUES.clone();
    }
}
