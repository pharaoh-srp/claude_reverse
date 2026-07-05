package com.anthropic.claude.api.chat.messages;

import defpackage.bn4;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qg9;
import java.util.Date;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013R+\u0010\t\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR+\u0010\u000b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\b\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/ContentBlock;", "", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "getStart_timestamp", "()Ljava/util/Date;", "start_timestamp", "getStop_timestamp", "stop_timestamp", "", "Lcom/anthropic/claude/api/chat/messages/MessageFlag;", "getFlags", "()Ljava/util/Set;", "flags", "Companion", "bn4", "gqk", "Lcom/anthropic/claude/api/chat/messages/BellNoteBlock;", "Lcom/anthropic/claude/api/chat/messages/FlagBlock;", "Lcom/anthropic/claude/api/chat/messages/TextBlock;", "Lcom/anthropic/claude/api/chat/messages/ThinkingBlock;", "Lcom/anthropic/claude/api/chat/messages/ToolResultBlock;", "Lcom/anthropic/claude/api/chat/messages/ToolUseBlock;", "Lcom/anthropic/claude/api/chat/messages/UnknownContentBlock;", "Lcom/anthropic/claude/api/chat/messages/VoiceNoteBlock;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "type")
public interface ContentBlock {
    public static final bn4 Companion = bn4.a;
    public static final String DISCRIMINATOR = "type";

    Set<MessageFlag> getFlags();

    Date getStart_timestamp();

    Date getStop_timestamp();
}
