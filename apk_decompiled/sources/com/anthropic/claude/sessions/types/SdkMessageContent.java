package com.anthropic.claude.sessions.types;

import defpackage.lbf;
import defpackage.mbf;
import defpackage.mdj;
import defpackage.onf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\b\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkMessageContent;", "", "", "getType", "()Ljava/lang/String;", "type", "Companion", "lbf", "Lcom/anthropic/claude/sessions/types/SdkImageContent;", "Lcom/anthropic/claude/sessions/types/SdkRedactedThinkingContent;", "Lcom/anthropic/claude/sessions/types/SdkTextContent;", "Lcom/anthropic/claude/sessions/types/SdkTextMessageContent;", "Lcom/anthropic/claude/sessions/types/SdkThinkingContent;", "Lcom/anthropic/claude/sessions/types/SdkToolResultContent;", "Lcom/anthropic/claude/sessions/types/SdkToolUseContent;", "Lcom/anthropic/claude/sessions/types/SdkUnknownMessageContent;", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = mbf.class)
public interface SdkMessageContent {
    public static final lbf Companion = lbf.a;

    String getType();
}
