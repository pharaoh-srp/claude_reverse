package com.anthropic.claude.api.chat.tool;

import defpackage.ebh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.sse;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vse;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.zcd;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/api/chat/tool/RichItemsDisplayContent;", "Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "", "Lcom/anthropic/claude/api/chat/tool/RichItem;", "content", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/RichItemsDisplayContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/anthropic/claude/api/chat/tool/RichItemsDisplayContent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getContent", "Companion", "use", "vse", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RichItemsDisplayContent implements ToolDisplayContent {
    public static final int $stable = 0;
    private final List<RichItem> content;
    public static final vse Companion = new vse();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new zcd(19))};

    public /* synthetic */ RichItemsDisplayContent(int i, List list, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.content = lm6.E;
        } else {
            this.content = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(sse.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RichItemsDisplayContent copy$default(RichItemsDisplayContent richItemsDisplayContent, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = richItemsDisplayContent.content;
        }
        return richItemsDisplayContent.copy(list);
    }

    public static final /* synthetic */ void write$Self$api(RichItemsDisplayContent self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (!output.E(serialDesc) && x44.r(self.content, lm6.E)) {
            return;
        }
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.content);
    }

    public final List<RichItem> component1() {
        return this.content;
    }

    public final RichItemsDisplayContent copy(List<RichItem> content) {
        content.getClass();
        return new RichItemsDisplayContent(content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RichItemsDisplayContent) && x44.r(this.content, ((RichItemsDisplayContent) other).content);
    }

    public final List<RichItem> getContent() {
        return this.content;
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public String toString() {
        return ebh.n("RichItemsDisplayContent(content=", ")", this.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RichItemsDisplayContent() {
        this((List) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public RichItemsDisplayContent(List<RichItem> list) {
        list.getClass();
        this.content = list;
    }

    public /* synthetic */ RichItemsDisplayContent(List list, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? lm6.E : list);
    }
}
