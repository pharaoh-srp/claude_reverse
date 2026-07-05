package com.anthropic.claude.api.chat.tool;

import defpackage.grd;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qg9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/PropertyDefinition;", "", "", "getDescription", "()Ljava/lang/String;", "description", "Companion", "grd", "Lcom/anthropic/claude/api/chat/tool/ArrayProperty;", "Lcom/anthropic/claude/api/chat/tool/BooleanProperty;", "Lcom/anthropic/claude/api/chat/tool/IntegerProperty;", "Lcom/anthropic/claude/api/chat/tool/NumberProperty;", "Lcom/anthropic/claude/api/chat/tool/ObjectProperty;", "Lcom/anthropic/claude/api/chat/tool/StringProperty;", "Lcom/anthropic/claude/api/chat/tool/UnknownProperty;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "type")
public interface PropertyDefinition {
    public static final grd Companion = grd.a;
    public static final String DISCRIMINATOR = "type";

    String getDescription();
}
