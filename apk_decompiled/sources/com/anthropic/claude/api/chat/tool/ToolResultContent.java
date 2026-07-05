package com.anthropic.claude.api.chat.tool;

import defpackage.mdj;
import defpackage.onf;
import defpackage.qg9;
import defpackage.qyh;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0082\u0001\u0005\u0004\u0005\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/ToolResultContent;", "", "Companion", "qyh", "Lcom/anthropic/claude/api/chat/tool/ToolResultImage;", "Lcom/anthropic/claude/api/chat/tool/ToolResultImageGallery;", "Lcom/anthropic/claude/api/chat/tool/ToolResultKnowledge;", "Lcom/anthropic/claude/api/chat/tool/ToolResultText;", "Lcom/anthropic/claude/api/chat/tool/ToolResultUnknown;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "type")
public interface ToolResultContent {
    public static final qyh Companion = qyh.a;
    public static final String DISCRIMINATOR = "type";
}
