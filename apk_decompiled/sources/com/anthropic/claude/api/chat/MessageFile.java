package com.anthropic.claude.api.chat;

import defpackage.kgb;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qg9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/chat/MessageFile;", "", "Lcom/anthropic/claude/types/strings/FileId;", "getFile_uuid-ExWXDbg", "()Ljava/lang/String;", "file_uuid", "Companion", "kgb", "Lcom/anthropic/claude/api/chat/MessageBlobFile;", "Lcom/anthropic/claude/api/chat/MessageDocumentFile;", "Lcom/anthropic/claude/api/chat/MessageImageFile;", "Lcom/anthropic/claude/api/chat/MessageUnknownFile;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = MessageFile.DISCRIMINATOR)
public interface MessageFile {
    public static final kgb Companion = kgb.a;
    public static final String DISCRIMINATOR = "file_kind";

    /* JADX INFO: renamed from: getFile_uuid-ExWXDbg */
    String mo236getFile_uuidExWXDbg();
}
