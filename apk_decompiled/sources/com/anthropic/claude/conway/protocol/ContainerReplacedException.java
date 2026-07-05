package com.anthropic.claude.conway.protocol;

import defpackage.mdj;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ContainerReplacedException;", "Ljava/io/IOException;", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class ContainerReplacedException extends IOException {
    public final String E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContainerReplacedException(String str) {
        super("container replaced; current is ".concat(str));
        str.getClass();
        this.E = str;
    }
}
