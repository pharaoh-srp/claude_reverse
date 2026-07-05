package com.anthropic.claude.core.telemetry;

import defpackage.mdj;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/core/telemetry/ClaudeRegionUnavailableException;", "Ljava/io/IOException;", "Claude.core:telemetry"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class ClaudeRegionUnavailableException extends IOException {
    public ClaudeRegionUnavailableException() {
        super("Claude is not available in this region");
    }
}
