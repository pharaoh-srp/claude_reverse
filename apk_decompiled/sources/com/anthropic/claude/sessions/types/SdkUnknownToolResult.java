package com.anthropic.claude.sessions.types;

import defpackage.ddf;
import defpackage.edf;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vnf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkUnknownToolResult;", "Lcom/anthropic/claude/sessions/types/ToolResult;", "", "type", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkUnknownToolResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Companion", "ddf", "edf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkUnknownToolResult implements ToolResult {
    public static final edf Companion = new edf();
    private final String type;

    public /* synthetic */ SdkUnknownToolResult(int i, String str, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.type = str;
        } else {
            gvj.f(i, 1, ddf.a.getDescriptor());
            throw null;
        }
    }

    @Override // com.anthropic.claude.sessions.types.ToolResult
    public String getType() {
        return this.type;
    }

    public SdkUnknownToolResult(String str) {
        str.getClass();
        this.type = str;
    }
}
