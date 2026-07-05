package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.g9b;
import defpackage.hfb;
import defpackage.ifb;
import defpackage.kw9;
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
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/tool/model/MessageComposeV1InputKind;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "hfb", "EMAIL", "TEXTMESSAGE", "OTHER", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = ifb.class)
public final class MessageComposeV1InputKind {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MessageComposeV1InputKind[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final hfb Companion;
    private final String loggingName;
    public static final MessageComposeV1InputKind EMAIL = new MessageComposeV1InputKind("EMAIL", 0, "email");
    public static final MessageComposeV1InputKind TEXTMESSAGE = new MessageComposeV1InputKind("TEXTMESSAGE", 1, "textMessage");
    public static final MessageComposeV1InputKind OTHER = new MessageComposeV1InputKind("OTHER", 2, "other");

    private static final /* synthetic */ MessageComposeV1InputKind[] $values() {
        return new MessageComposeV1InputKind[]{EMAIL, TEXTMESSAGE, OTHER};
    }

    static {
        MessageComposeV1InputKind[] messageComposeV1InputKindArr$values = $values();
        $VALUES = messageComposeV1InputKindArr$values;
        $ENTRIES = wd6.n0(messageComposeV1InputKindArr$values);
        Companion = new hfb();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new g9b(8));
    }

    private MessageComposeV1InputKind(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.MessageComposeV1InputKind", values(), new String[]{"email", "textMessage", "other"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MessageComposeV1InputKind valueOf(String str) {
        return (MessageComposeV1InputKind) Enum.valueOf(MessageComposeV1InputKind.class, str);
    }

    public static MessageComposeV1InputKind[] values() {
        return (MessageComposeV1InputKind[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
