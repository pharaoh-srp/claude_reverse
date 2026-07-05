package com.anthropic.claude.artifact.model;

import com.anthropic.claude.types.strings.ChatId;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kaj;
import defpackage.laj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vs2;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J$\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Lcom/anthropic/claude/artifact/model/WiggleArtifactIdentifier;", "", "Lcom/anthropic/claude/types/strings/ChatId;", "chatId", "", "encodedPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$artifact", "(Lcom/anthropic/claude/artifact/model/WiggleArtifactIdentifier;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-RjYBDck", "()Ljava/lang/String;", "component1", "component2", "copy-JXrY7Xo", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/artifact/model/WiggleArtifactIdentifier;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getChatId-RjYBDck", "getEncodedPath", "Companion", "kaj", "laj", "artifact"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class WiggleArtifactIdentifier {
    public static final int $stable = 0;
    public static final laj Companion = new laj();
    private final String chatId;
    private final String encodedPath;

    private /* synthetic */ WiggleArtifactIdentifier(int i, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, kaj.a.getDescriptor());
            throw null;
        }
        this.chatId = str;
        this.encodedPath = str2;
    }

    /* JADX INFO: renamed from: copy-JXrY7Xo$default, reason: not valid java name */
    public static /* synthetic */ WiggleArtifactIdentifier m539copyJXrY7Xo$default(WiggleArtifactIdentifier wiggleArtifactIdentifier, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wiggleArtifactIdentifier.chatId;
        }
        if ((i & 2) != 0) {
            str2 = wiggleArtifactIdentifier.encodedPath;
        }
        return wiggleArtifactIdentifier.m541copyJXrY7Xo(str, str2);
    }

    public static final /* synthetic */ void write$Self$artifact(WiggleArtifactIdentifier self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, vs2.a, ChatId.m978boximpl(self.chatId));
        output.q(serialDesc, 1, self.encodedPath);
    }

    /* JADX INFO: renamed from: component1-RjYBDck, reason: not valid java name and from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEncodedPath() {
        return this.encodedPath;
    }

    /* JADX INFO: renamed from: copy-JXrY7Xo, reason: not valid java name */
    public final WiggleArtifactIdentifier m541copyJXrY7Xo(String chatId, String encodedPath) {
        chatId.getClass();
        encodedPath.getClass();
        return new WiggleArtifactIdentifier(chatId, encodedPath, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WiggleArtifactIdentifier)) {
            return false;
        }
        WiggleArtifactIdentifier wiggleArtifactIdentifier = (WiggleArtifactIdentifier) other;
        return ChatId.m981equalsimpl0(this.chatId, wiggleArtifactIdentifier.chatId) && x44.r(this.encodedPath, wiggleArtifactIdentifier.encodedPath);
    }

    /* JADX INFO: renamed from: getChatId-RjYBDck, reason: not valid java name */
    public final String m542getChatIdRjYBDck() {
        return this.chatId;
    }

    public final String getEncodedPath() {
        return this.encodedPath;
    }

    public int hashCode() {
        return this.encodedPath.hashCode() + (ChatId.m982hashCodeimpl(this.chatId) * 31);
    }

    public String toString() {
        return ij0.l("WiggleArtifactIdentifier(chatId=", ChatId.m983toStringimpl(this.chatId), ", encodedPath=", this.encodedPath, ")");
    }

    public /* synthetic */ WiggleArtifactIdentifier(String str, String str2, mq5 mq5Var) {
        this(str, str2);
    }

    public /* synthetic */ WiggleArtifactIdentifier(int i, String str, String str2, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, vnfVar);
    }

    private WiggleArtifactIdentifier(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.chatId = str;
        this.encodedPath = str2;
    }
}
