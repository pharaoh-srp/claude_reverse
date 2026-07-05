package com.anthropic.claude.api.chat.messages;

import defpackage.cn4;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qg9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004\u0082\u0001\u000b\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/ContentBlockDelta;", "", "Companion", "cn4", "mqk", "Lcom/anthropic/claude/api/chat/messages/BellNoteDelta;", "Lcom/anthropic/claude/api/chat/messages/CitationEndDelta;", "Lcom/anthropic/claude/api/chat/messages/CitationStartDelta;", "Lcom/anthropic/claude/api/chat/messages/FlagDelta;", "Lcom/anthropic/claude/api/chat/messages/InputJsonDelta;", "Lcom/anthropic/claude/api/chat/messages/TextDelta;", "Lcom/anthropic/claude/api/chat/messages/ThinkingDelta;", "Lcom/anthropic/claude/api/chat/messages/ThinkingSummaryDelta;", "Lcom/anthropic/claude/api/chat/messages/ToolUseBlockUpdateDelta;", "Lqei;", "Lcom/anthropic/claude/api/chat/messages/VoiceNoteDelta;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "type")
public interface ContentBlockDelta {
    public static final cn4 Companion = cn4.a;
    public static final String DISCRIMINATOR = "type";
}
