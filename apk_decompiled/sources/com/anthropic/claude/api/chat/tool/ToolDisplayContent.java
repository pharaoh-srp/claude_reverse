package com.anthropic.claude.api.chat.tool;

import defpackage.mdj;
import defpackage.onf;
import defpackage.qg9;
import defpackage.qwh;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0082\u0001\u0007\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "", "Companion", "qwh", "Lcom/anthropic/claude/api/chat/tool/CodeBlockDisplayContent;", "Lcom/anthropic/claude/api/chat/tool/JsonBlockDisplayContent;", "Lcom/anthropic/claude/api/chat/tool/RichItemsDisplayContent;", "Lcom/anthropic/claude/api/chat/tool/RichLinkDisplayContent;", "Lcom/anthropic/claude/api/chat/tool/TableDisplayContent;", "Lcom/anthropic/claude/api/chat/tool/TextDisplayContent;", "Lcom/anthropic/claude/api/chat/tool/UnknownDisplayContent;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "type")
public interface ToolDisplayContent {
    public static final qwh Companion = qwh.a;
    public static final String DISCRIMINATOR = "type";
}
