package com.anthropic.claude.sessions.types;

import defpackage.ebf;
import defpackage.fbf;
import defpackage.mdj;
import defpackage.onf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \b2\u00020\u0001:\u0001\tR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0001\r\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkEvent;", "", "", "getType", "()Ljava/lang/String;", "type", "getParent_tool_use_id", "parent_tool_use_id", "Companion", "ebf", "Lcom/anthropic/claude/sessions/types/SdkControlCancelRequestEvent;", "Lcom/anthropic/claude/sessions/types/SdkControlRequestEvent;", "Lcom/anthropic/claude/sessions/types/SdkControlResponseEvent;", "Lcom/anthropic/claude/sessions/types/SdkEnvManagerLogEvent;", "Lcom/anthropic/claude/sessions/types/SdkMessageEvent;", "Lcom/anthropic/claude/sessions/types/SdkPromptSuggestionEvent;", "Lcom/anthropic/claude/sessions/types/SdkRateLimitEvent;", "Lcom/anthropic/claude/sessions/types/SdkResultEvent;", "Lcom/anthropic/claude/sessions/types/SdkStreamEvent;", "Lcom/anthropic/claude/sessions/types/SdkSystemEvent;", "Lcom/anthropic/claude/sessions/types/SdkToolProgressEvent;", "Lcom/anthropic/claude/sessions/types/SdkToolUseSummaryEvent;", "Lcom/anthropic/claude/sessions/types/SdkUnknownEvent;", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = fbf.class)
public interface SdkEvent {
    public static final ebf Companion = ebf.a;

    String getParent_tool_use_id();

    String getType();
}
