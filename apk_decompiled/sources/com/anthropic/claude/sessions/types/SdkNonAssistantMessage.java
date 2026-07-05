package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.pfb;
import defpackage.qbf;
import defpackage.rbf;
import defpackage.vd4;
import defpackage.vnf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0002 !B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkNonAssistantMessage;", "Lcom/anthropic/claude/sessions/types/SdkMessage;", "", "role", "", "Lcom/anthropic/claude/sessions/types/SdkMessageContent;", "content", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkNonAssistantMessage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getRole", "()Ljava/lang/String;", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "getContent$annotations", "()V", "Companion", "qbf", "rbf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkNonAssistantMessage implements SdkMessage {
    public static final rbf Companion = new rbf();
    private final List<SdkMessageContent> content;
    private final String role;

    public /* synthetic */ SdkNonAssistantMessage(int i, String str, List list, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, qbf.a.getDescriptor());
            throw null;
        }
        this.role = str;
        this.content = list;
    }

    @onf(with = pfb.class)
    public static /* synthetic */ void getContent$annotations() {
    }

    public static final /* synthetic */ void write$Self$sessions(SdkNonAssistantMessage self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.getRole());
        output.r(serialDesc, 1, pfb.a, self.content);
    }

    public final List<SdkMessageContent> getContent() {
        return this.content;
    }

    @Override // com.anthropic.claude.sessions.types.SdkMessage
    public String getRole() {
        return this.role;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SdkNonAssistantMessage(String str, List<? extends SdkMessageContent> list) {
        str.getClass();
        list.getClass();
        this.role = str;
        this.content = list;
    }
}
