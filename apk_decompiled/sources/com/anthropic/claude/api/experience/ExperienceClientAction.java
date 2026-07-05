package com.anthropic.claude.api.experience;

import defpackage.k97;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qg9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0082\u0001\u0005\u0004\u0005\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceClientAction;", "", "Companion", "k97", "Lcom/anthropic/claude/api/experience/NewChatAction;", "Lcom/anthropic/claude/api/experience/OpenLinkAction;", "Lcom/anthropic/claude/api/experience/RefreshCacheAction;", "Lcom/anthropic/claude/api/experience/RemoteAction;", "Lcom/anthropic/claude/api/experience/UnknownClientAction;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "type")
public interface ExperienceClientAction {
    public static final k97 Companion = k97.a;
    public static final String DISCRIMINATOR = "type";
}
