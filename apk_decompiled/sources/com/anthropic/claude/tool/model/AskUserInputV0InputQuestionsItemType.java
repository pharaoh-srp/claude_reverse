package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.os0;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.yv0;
import defpackage.zv0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/tool/model/AskUserInputV0InputQuestionsItemType;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "yv0", "SINGLE_SELECT", "MULTI_SELECT", "RANK_PRIORITIES", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = zv0.class)
public final class AskUserInputV0InputQuestionsItemType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ AskUserInputV0InputQuestionsItemType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final yv0 Companion;
    private final String loggingName;
    public static final AskUserInputV0InputQuestionsItemType SINGLE_SELECT = new AskUserInputV0InputQuestionsItemType("SINGLE_SELECT", 0, "single_select");
    public static final AskUserInputV0InputQuestionsItemType MULTI_SELECT = new AskUserInputV0InputQuestionsItemType("MULTI_SELECT", 1, "multi_select");
    public static final AskUserInputV0InputQuestionsItemType RANK_PRIORITIES = new AskUserInputV0InputQuestionsItemType("RANK_PRIORITIES", 2, "rank_priorities");

    private static final /* synthetic */ AskUserInputV0InputQuestionsItemType[] $values() {
        return new AskUserInputV0InputQuestionsItemType[]{SINGLE_SELECT, MULTI_SELECT, RANK_PRIORITIES};
    }

    static {
        AskUserInputV0InputQuestionsItemType[] askUserInputV0InputQuestionsItemTypeArr$values = $values();
        $VALUES = askUserInputV0InputQuestionsItemTypeArr$values;
        $ENTRIES = wd6.n0(askUserInputV0InputQuestionsItemTypeArr$values);
        Companion = new yv0();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new os0(28));
    }

    private AskUserInputV0InputQuestionsItemType(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.AskUserInputV0InputQuestionsItemType", values(), new String[]{"single_select", "multi_select", "rank_priorities"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static AskUserInputV0InputQuestionsItemType valueOf(String str) {
        return (AskUserInputV0InputQuestionsItemType) Enum.valueOf(AskUserInputV0InputQuestionsItemType.class, str);
    }

    public static AskUserInputV0InputQuestionsItemType[] values() {
        return (AskUserInputV0InputQuestionsItemType[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
