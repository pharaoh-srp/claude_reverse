package com.anthropic.claude.mcpapps;

import defpackage.mdj;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/anthropic/claude/mcpapps/McpAppApi$ShttpException", "Ljava/io/IOException;", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class McpAppApi$ShttpException extends IOException {
    public final int E;

    public McpAppApi$ShttpException(int i, String str) {
        super(str);
        this.E = i;
    }
}
