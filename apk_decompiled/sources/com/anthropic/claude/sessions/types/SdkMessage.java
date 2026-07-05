package com.anthropic.claude.sessions.types;

import defpackage.kbf;
import defpackage.mdj;
import defpackage.onf;
import defpackage.pbf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkMessage;", "", "", "getRole", "()Ljava/lang/String;", "role", "Companion", "kbf", "Lcom/anthropic/claude/sessions/types/SdkAssistantMessage;", "Lcom/anthropic/claude/sessions/types/SdkNonAssistantMessage;", "Lcom/anthropic/claude/sessions/types/SdkUnknownMessage;", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = pbf.class)
public interface SdkMessage {
    public static final kbf Companion = kbf.a;

    String getRole();
}
