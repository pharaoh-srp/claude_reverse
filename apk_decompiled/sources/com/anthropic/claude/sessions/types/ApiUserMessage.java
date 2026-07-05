package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.sf0;
import defpackage.tf0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/sessions/types/ApiUserMessage;", "", "Lcom/anthropic/claude/sessions/types/ApiUserMessageContent;", "content", "", "role", "<init>", "(Lcom/anthropic/claude/sessions/types/ApiUserMessageContent;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/sessions/types/ApiUserMessageContent;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ApiUserMessage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/sessions/types/ApiUserMessageContent;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/anthropic/claude/sessions/types/ApiUserMessageContent;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/ApiUserMessage;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/sessions/types/ApiUserMessageContent;", "getContent", "Ljava/lang/String;", "getRole", "Companion", "sf0", "tf0", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ApiUserMessage {
    public static final tf0 Companion = new tf0();
    private final ApiUserMessageContent content;
    private final String role;

    public /* synthetic */ ApiUserMessage(int i, ApiUserMessageContent apiUserMessageContent, String str, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, sf0.a.getDescriptor());
            throw null;
        }
        this.content = apiUserMessageContent;
        if ((i & 2) == 0) {
            this.role = "user";
        } else {
            this.role = str;
        }
    }

    public static /* synthetic */ ApiUserMessage copy$default(ApiUserMessage apiUserMessage, ApiUserMessageContent apiUserMessageContent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            apiUserMessageContent = apiUserMessage.content;
        }
        if ((i & 2) != 0) {
            str = apiUserMessage.role;
        }
        return apiUserMessage.copy(apiUserMessageContent, str);
    }

    public static final /* synthetic */ void write$Self$sessions(ApiUserMessage self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, e.a, self.content);
        if (!output.E(serialDesc) && x44.r(self.role, "user")) {
            return;
        }
        output.q(serialDesc, 1, self.role);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiUserMessageContent getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    public final ApiUserMessage copy(ApiUserMessageContent content, String role) {
        content.getClass();
        role.getClass();
        return new ApiUserMessage(content, role);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiUserMessage)) {
            return false;
        }
        ApiUserMessage apiUserMessage = (ApiUserMessage) other;
        return x44.r(this.content, apiUserMessage.content) && x44.r(this.role, apiUserMessage.role);
    }

    public final ApiUserMessageContent getContent() {
        return this.content;
    }

    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        return this.role.hashCode() + (this.content.hashCode() * 31);
    }

    public String toString() {
        return "ApiUserMessage(content=" + this.content + ", role=" + this.role + ")";
    }

    public ApiUserMessage(ApiUserMessageContent apiUserMessageContent, String str) {
        apiUserMessageContent.getClass();
        str.getClass();
        this.content = apiUserMessageContent;
        this.role = str;
    }

    public /* synthetic */ ApiUserMessage(ApiUserMessageContent apiUserMessageContent, String str, int i, mq5 mq5Var) {
        this(apiUserMessageContent, (i & 2) != 0 ? "user" : str);
    }
}
