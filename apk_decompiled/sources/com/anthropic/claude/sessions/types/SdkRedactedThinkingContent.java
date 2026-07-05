package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vbf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wbf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkRedactedThinkingContent;", "Lcom/anthropic/claude/sessions/types/SdkMessageContent;", "", "type", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkRedactedThinkingContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getData", "Companion", "vbf", "wbf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkRedactedThinkingContent implements SdkMessageContent {
    public static final wbf Companion = new wbf();
    private final String data;
    private final String type;

    public /* synthetic */ SdkRedactedThinkingContent(int i, String str, String str2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, vbf.a.getDescriptor());
            throw null;
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.data = null;
        } else {
            this.data = str2;
        }
    }

    public static final /* synthetic */ void write$Self$sessions(SdkRedactedThinkingContent self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.getType());
        if (!output.E(serialDesc) && self.data == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.data);
    }

    public final String getData() {
        return this.data;
    }

    @Override // com.anthropic.claude.sessions.types.SdkMessageContent
    public String getType() {
        return this.type;
    }

    public SdkRedactedThinkingContent(String str, String str2) {
        str.getClass();
        this.type = str;
        this.data = str2;
    }

    public /* synthetic */ SdkRedactedThinkingContent(String str, String str2, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
