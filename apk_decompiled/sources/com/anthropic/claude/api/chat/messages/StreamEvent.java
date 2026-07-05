package com.anthropic.claude.api.chat.messages;

import defpackage.mdj;
import defpackage.onf;
import defpackage.qg9;
import defpackage.ypg;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0082\u0001\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/StreamEvent;", "", "Companion", "ypg", "Lcom/anthropic/claude/api/chat/messages/CompactionStatusEvent;", "Lcom/anthropic/claude/api/chat/messages/ContentBlockDeltaEvent;", "Lcom/anthropic/claude/api/chat/messages/ContentBlockRetractEvent;", "Lcom/anthropic/claude/api/chat/messages/ContentBlockStartEvent;", "Lcom/anthropic/claude/api/chat/messages/ContentBlockStopEvent;", "Lcom/anthropic/claude/api/chat/messages/ConversationReadyEvent;", "Lcom/anthropic/claude/api/chat/messages/McpAuthRequiredEvent;", "Lcom/anthropic/claude/api/chat/messages/MessageDeltaEvent;", "Lcom/anthropic/claude/api/chat/messages/MessageLimitEvent;", "Lcom/anthropic/claude/api/chat/messages/MessageStartEvent;", "Lcom/anthropic/claude/api/chat/messages/MessageStopEvent;", "Lcom/anthropic/claude/api/chat/messages/ModelUpdateEvent;", "Lcom/anthropic/claude/api/chat/messages/UnknownStreamEvent;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "type")
public interface StreamEvent {
    public static final ypg Companion = ypg.a;
    public static final String DISCRIMINATOR = "type";
}
