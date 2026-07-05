package com.anthropic.claude.tool.model;

import defpackage.dfb;
import defpackage.efb;
import defpackage.fq6;
import defpackage.g9b;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/tool/model/MessageComposeV0InputKind;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "dfb", "EMAIL", "TEXTMESSAGE", "OTHER", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = efb.class)
public final class MessageComposeV0InputKind {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MessageComposeV0InputKind[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final dfb Companion;
    private final String loggingName;
    public static final MessageComposeV0InputKind EMAIL = new MessageComposeV0InputKind("EMAIL", 0, "email");
    public static final MessageComposeV0InputKind TEXTMESSAGE = new MessageComposeV0InputKind("TEXTMESSAGE", 1, "textMessage");
    public static final MessageComposeV0InputKind OTHER = new MessageComposeV0InputKind("OTHER", 2, "other");

    private static final /* synthetic */ MessageComposeV0InputKind[] $values() {
        return new MessageComposeV0InputKind[]{EMAIL, TEXTMESSAGE, OTHER};
    }

    static {
        MessageComposeV0InputKind[] messageComposeV0InputKindArr$values = $values();
        $VALUES = messageComposeV0InputKindArr$values;
        $ENTRIES = wd6.n0(messageComposeV0InputKindArr$values);
        Companion = new dfb();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new g9b(7));
    }

    private MessageComposeV0InputKind(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.MessageComposeV0InputKind", values(), new String[]{"email", "textMessage", "other"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MessageComposeV0InputKind valueOf(String str) {
        return (MessageComposeV0InputKind) Enum.valueOf(MessageComposeV0InputKind.class, str);
    }

    public static MessageComposeV0InputKind[] values() {
        return (MessageComposeV0InputKind[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
