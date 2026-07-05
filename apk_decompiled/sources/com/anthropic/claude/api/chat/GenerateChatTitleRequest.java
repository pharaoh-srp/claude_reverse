package com.anthropic.claude.api.chat;

import defpackage.c97;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.o18;
import defpackage.onf;
import defpackage.p18;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.y6a;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/api/chat/GenerateChatTitleRequest;", "", "", "message_content", "", "recent_titles", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/GenerateChatTitleRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/api/chat/GenerateChatTitleRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage_content", "Ljava/util/List;", "getRecent_titles", "Companion", "o18", "p18", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GenerateChatTitleRequest {
    public static final int $stable = 0;
    private final String message_content;
    private final List<String> recent_titles;
    public static final p18 Companion = new p18();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new c97(14))};

    public /* synthetic */ GenerateChatTitleRequest(int i, String str, List list, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, o18.a.getDescriptor());
            throw null;
        }
        this.message_content = str;
        this.recent_titles = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenerateChatTitleRequest copy$default(GenerateChatTitleRequest generateChatTitleRequest, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generateChatTitleRequest.message_content;
        }
        if ((i & 2) != 0) {
            list = generateChatTitleRequest.recent_titles;
        }
        return generateChatTitleRequest.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$api(GenerateChatTitleRequest self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.message_content);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.recent_titles);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage_content() {
        return this.message_content;
    }

    public final List<String> component2() {
        return this.recent_titles;
    }

    public final GenerateChatTitleRequest copy(String message_content, List<String> recent_titles) {
        message_content.getClass();
        recent_titles.getClass();
        return new GenerateChatTitleRequest(message_content, recent_titles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateChatTitleRequest)) {
            return false;
        }
        GenerateChatTitleRequest generateChatTitleRequest = (GenerateChatTitleRequest) other;
        return x44.r(this.message_content, generateChatTitleRequest.message_content) && x44.r(this.recent_titles, generateChatTitleRequest.recent_titles);
    }

    public final String getMessage_content() {
        return this.message_content;
    }

    public final List<String> getRecent_titles() {
        return this.recent_titles;
    }

    public int hashCode() {
        return this.recent_titles.hashCode() + (this.message_content.hashCode() * 31);
    }

    public String toString() {
        return y6a.o("GenerateChatTitleRequest(message_content=", this.message_content, ", recent_titles=", this.recent_titles, ")");
    }

    public GenerateChatTitleRequest(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.message_content = str;
        this.recent_titles = list;
    }
}
