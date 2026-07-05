package com.anthropic.claude.models.organization.configtypes;

import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.api.chat.tool.e;
import defpackage.crg;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.kzg;
import defpackage.lzg;
import defpackage.mdj;
import defpackage.onf;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J0\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/SupportedToolsConfig;", "", "", "Lcom/anthropic/claude/api/chat/tool/Tool;", "completion", "conversation", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/SupportedToolsConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/anthropic/claude/models/organization/configtypes/SupportedToolsConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCompletion", "getConversation", "Companion", "kzg", "lzg", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SupportedToolsConfig {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final lzg Companion = new lzg();
    private final List<Tool> completion;
    private final List<Tool> conversation;

    static {
        crg crgVar = new crg(15);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, crgVar), yb5.w(w1aVar, new crg(16))};
    }

    public /* synthetic */ SupportedToolsConfig(int i, List list, List list2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, kzg.a.getDescriptor());
            throw null;
        }
        this.completion = list;
        this.conversation = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(e.c, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(e.c, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportedToolsConfig copy$default(SupportedToolsConfig supportedToolsConfig, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = supportedToolsConfig.completion;
        }
        if ((i & 2) != 0) {
            list2 = supportedToolsConfig.conversation;
        }
        return supportedToolsConfig.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$models(SupportedToolsConfig self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.completion);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.conversation);
    }

    public final List<Tool> component1() {
        return this.completion;
    }

    public final List<Tool> component2() {
        return this.conversation;
    }

    public final SupportedToolsConfig copy(List<? extends Tool> completion, List<? extends Tool> conversation) {
        completion.getClass();
        conversation.getClass();
        return new SupportedToolsConfig(completion, conversation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportedToolsConfig)) {
            return false;
        }
        SupportedToolsConfig supportedToolsConfig = (SupportedToolsConfig) other;
        return x44.r(this.completion, supportedToolsConfig.completion) && x44.r(this.conversation, supportedToolsConfig.conversation);
    }

    public final List<Tool> getCompletion() {
        return this.completion;
    }

    public final List<Tool> getConversation() {
        return this.conversation;
    }

    public int hashCode() {
        return this.conversation.hashCode() + (this.completion.hashCode() * 31);
    }

    public String toString() {
        return "SupportedToolsConfig(completion=" + this.completion + ", conversation=" + this.conversation + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SupportedToolsConfig(List<? extends Tool> list, List<? extends Tool> list2) {
        list.getClass();
        list2.getClass();
        this.completion = list;
        this.conversation = list2;
    }
}
