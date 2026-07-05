package com.anthropic.claude.api.chat;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.os2;
import defpackage.ps2;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.xq2;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/anthropic/claude/api/chat/ChatFeedbackType;", "", "", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getValue", "Companion", "os2", "UPVOTE", "FLAG", "FLAG_BUG", "FLAG_HARMFUL", "FLAG_REFUSAL", "FLAG_FILE", "FLAG_INSTRUCTIONS", "FLAG_FACTS", "FLAG_INCOMPLETE", "FLAG_MEMORY", "FLAG_SAFETY_CLASSIFIER_FALSE_POSITIVE", "FLAG_OTHER", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = ps2.class)
public final class ChatFeedbackType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatFeedbackType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final os2 Companion;
    private final String value;
    public static final ChatFeedbackType UPVOTE = new ChatFeedbackType("UPVOTE", 0, "upvote");
    public static final ChatFeedbackType FLAG = new ChatFeedbackType("FLAG", 1, "flag");
    public static final ChatFeedbackType FLAG_BUG = new ChatFeedbackType("FLAG_BUG", 2, "flag/bug");
    public static final ChatFeedbackType FLAG_HARMFUL = new ChatFeedbackType("FLAG_HARMFUL", 3, "flag/harmful");
    public static final ChatFeedbackType FLAG_REFUSAL = new ChatFeedbackType("FLAG_REFUSAL", 4, "flag/refusal");
    public static final ChatFeedbackType FLAG_FILE = new ChatFeedbackType("FLAG_FILE", 5, "flag/file");
    public static final ChatFeedbackType FLAG_INSTRUCTIONS = new ChatFeedbackType("FLAG_INSTRUCTIONS", 6, "flag/instructions");
    public static final ChatFeedbackType FLAG_FACTS = new ChatFeedbackType("FLAG_FACTS", 7, "flag/facts");
    public static final ChatFeedbackType FLAG_INCOMPLETE = new ChatFeedbackType("FLAG_INCOMPLETE", 8, "flag/incomplete");
    public static final ChatFeedbackType FLAG_MEMORY = new ChatFeedbackType("FLAG_MEMORY", 9, "flag/memory");
    public static final ChatFeedbackType FLAG_SAFETY_CLASSIFIER_FALSE_POSITIVE = new ChatFeedbackType("FLAG_SAFETY_CLASSIFIER_FALSE_POSITIVE", 10, "sc/false_positive");
    public static final ChatFeedbackType FLAG_OTHER = new ChatFeedbackType("FLAG_OTHER", 11, "flag/other");

    private static final /* synthetic */ ChatFeedbackType[] $values() {
        return new ChatFeedbackType[]{UPVOTE, FLAG, FLAG_BUG, FLAG_HARMFUL, FLAG_REFUSAL, FLAG_FILE, FLAG_INSTRUCTIONS, FLAG_FACTS, FLAG_INCOMPLETE, FLAG_MEMORY, FLAG_SAFETY_CLASSIFIER_FALSE_POSITIVE, FLAG_OTHER};
    }

    static {
        ChatFeedbackType[] chatFeedbackTypeArr$values = $values();
        $VALUES = chatFeedbackTypeArr$values;
        $ENTRIES = wd6.n0(chatFeedbackTypeArr$values);
        Companion = new os2();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new xq2(14));
    }

    private ChatFeedbackType(String str, int i, String str2) {
        this.value = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.chat.ChatFeedbackType", values(), new String[]{"upvote", "flag", "flag/bug", "flag/harmful", "flag/refusal", "flag/file", "flag/instructions", "flag/facts", "flag/incomplete", "flag/memory", "sc/false_positive", "flag/other"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatFeedbackType valueOf(String str) {
        return (ChatFeedbackType) Enum.valueOf(ChatFeedbackType.class, str);
    }

    public static ChatFeedbackType[] values() {
        return (ChatFeedbackType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
