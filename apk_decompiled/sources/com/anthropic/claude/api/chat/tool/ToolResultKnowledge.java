package com.anthropic.claude.api.chat.tool;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nlh;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wyh;
import defpackage.x44;
import defpackage.xyh;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006."}, d2 = {"Lcom/anthropic/claude/api/chat/tool/ToolResultKnowledge;", "Lcom/anthropic/claude/api/chat/tool/ToolResultContent;", "", "title", "url", "Lcom/anthropic/claude/api/chat/tool/SourceMetadata;", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/SourceMetadata;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/SourceMetadata;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/ToolResultKnowledge;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/api/chat/tool/SourceMetadata;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/SourceMetadata;)Lcom/anthropic/claude/api/chat/tool/ToolResultKnowledge;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getUrl", "Lcom/anthropic/claude/api/chat/tool/SourceMetadata;", "getMetadata", "Companion", "wyh", "xyh", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ToolResultKnowledge implements ToolResultContent {
    public static final int $stable = 0;
    private final SourceMetadata metadata;
    private final String title;
    private final String url;
    public static final xyh Companion = new xyh();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new nlh(18))};

    public /* synthetic */ ToolResultKnowledge(int i, String str, String str2, SourceMetadata sourceMetadata, vnf vnfVar) {
        if (5 != (i & 5)) {
            gvj.f(i, 5, wyh.a.getDescriptor());
            throw null;
        }
        this.title = str;
        if ((i & 2) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
        this.metadata = sourceMetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return SourceMetadata.Companion.serializer();
    }

    public static /* synthetic */ ToolResultKnowledge copy$default(ToolResultKnowledge toolResultKnowledge, String str, String str2, SourceMetadata sourceMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolResultKnowledge.title;
        }
        if ((i & 2) != 0) {
            str2 = toolResultKnowledge.url;
        }
        if ((i & 4) != 0) {
            sourceMetadata = toolResultKnowledge.metadata;
        }
        return toolResultKnowledge.copy(str, str2, sourceMetadata);
    }

    public static final /* synthetic */ void write$Self$api(ToolResultKnowledge self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.title);
        if (output.E(serialDesc) || self.url != null) {
            output.B(serialDesc, 1, srg.a, self.url);
        }
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SourceMetadata getMetadata() {
        return this.metadata;
    }

    public final ToolResultKnowledge copy(String title, String url, SourceMetadata metadata) {
        title.getClass();
        metadata.getClass();
        return new ToolResultKnowledge(title, url, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolResultKnowledge)) {
            return false;
        }
        ToolResultKnowledge toolResultKnowledge = (ToolResultKnowledge) other;
        return x44.r(this.title, toolResultKnowledge.title) && x44.r(this.url, toolResultKnowledge.url) && x44.r(this.metadata, toolResultKnowledge.metadata);
    }

    public final SourceMetadata getMetadata() {
        return this.metadata;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.url;
        return this.metadata.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.url;
        SourceMetadata sourceMetadata = this.metadata;
        StringBuilder sbR = kgh.r("ToolResultKnowledge(title=", str, ", url=", str2, ", metadata=");
        sbR.append(sourceMetadata);
        sbR.append(")");
        return sbR.toString();
    }

    public ToolResultKnowledge(String str, String str2, SourceMetadata sourceMetadata) {
        str.getClass();
        sourceMetadata.getClass();
        this.title = str;
        this.url = str2;
        this.metadata = sourceMetadata;
    }

    public /* synthetic */ ToolResultKnowledge(String str, String str2, SourceMetadata sourceMetadata, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, sourceMetadata);
    }
}
