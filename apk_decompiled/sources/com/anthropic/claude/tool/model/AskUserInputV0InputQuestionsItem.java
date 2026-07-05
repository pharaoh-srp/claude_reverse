package com.anthropic.claude.tool.model;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.os0;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wv0;
import defpackage.x44;
import defpackage.xv0;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zv0;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lcom/anthropic/claude/tool/model/AskUserInputV0InputQuestionsItem;", "", "", "", "options", "question", "Lcom/anthropic/claude/tool/model/AskUserInputV0InputQuestionsItemType;", "type", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/anthropic/claude/tool/model/AskUserInputV0InputQuestionsItemType;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lcom/anthropic/claude/tool/model/AskUserInputV0InputQuestionsItemType;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/AskUserInputV0InputQuestionsItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/anthropic/claude/tool/model/AskUserInputV0InputQuestionsItemType;", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/anthropic/claude/tool/model/AskUserInputV0InputQuestionsItemType;)Lcom/anthropic/claude/tool/model/AskUserInputV0InputQuestionsItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getOptions", "Ljava/lang/String;", "getQuestion", "Lcom/anthropic/claude/tool/model/AskUserInputV0InputQuestionsItemType;", "getType", "Companion", "wv0", "xv0", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AskUserInputV0InputQuestionsItem {
    private final List<String> options;
    private final String question;
    private final AskUserInputV0InputQuestionsItemType type;
    public static final xv0 Companion = new xv0();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new os0(27)), null, null};

    public /* synthetic */ AskUserInputV0InputQuestionsItem(int i, List list, String str, AskUserInputV0InputQuestionsItemType askUserInputV0InputQuestionsItemType, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, wv0.a.getDescriptor());
            throw null;
        }
        this.options = list;
        this.question = str;
        if ((i & 4) == 0) {
            this.type = null;
        } else {
            this.type = askUserInputV0InputQuestionsItemType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AskUserInputV0InputQuestionsItem copy$default(AskUserInputV0InputQuestionsItem askUserInputV0InputQuestionsItem, List list, String str, AskUserInputV0InputQuestionsItemType askUserInputV0InputQuestionsItemType, int i, Object obj) {
        if ((i & 1) != 0) {
            list = askUserInputV0InputQuestionsItem.options;
        }
        if ((i & 2) != 0) {
            str = askUserInputV0InputQuestionsItem.question;
        }
        if ((i & 4) != 0) {
            askUserInputV0InputQuestionsItemType = askUserInputV0InputQuestionsItem.type;
        }
        return askUserInputV0InputQuestionsItem.copy(list, str, askUserInputV0InputQuestionsItemType);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(AskUserInputV0InputQuestionsItem self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.options);
        output.q(serialDesc, 1, self.question);
        if (!output.E(serialDesc) && self.type == null) {
            return;
        }
        output.B(serialDesc, 2, zv0.d, self.type);
    }

    public final List<String> component1() {
        return this.options;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AskUserInputV0InputQuestionsItemType getType() {
        return this.type;
    }

    public final AskUserInputV0InputQuestionsItem copy(List<String> options, String question, AskUserInputV0InputQuestionsItemType type) {
        options.getClass();
        question.getClass();
        return new AskUserInputV0InputQuestionsItem(options, question, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AskUserInputV0InputQuestionsItem)) {
            return false;
        }
        AskUserInputV0InputQuestionsItem askUserInputV0InputQuestionsItem = (AskUserInputV0InputQuestionsItem) other;
        return x44.r(this.options, askUserInputV0InputQuestionsItem.options) && x44.r(this.question, askUserInputV0InputQuestionsItem.question) && this.type == askUserInputV0InputQuestionsItem.type;
    }

    public final List<String> getOptions() {
        return this.options;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final AskUserInputV0InputQuestionsItemType getType() {
        return this.type;
    }

    public int hashCode() {
        int iL = kgh.l(this.options.hashCode() * 31, 31, this.question);
        AskUserInputV0InputQuestionsItemType askUserInputV0InputQuestionsItemType = this.type;
        return iL + (askUserInputV0InputQuestionsItemType == null ? 0 : askUserInputV0InputQuestionsItemType.hashCode());
    }

    public String toString() {
        return "AskUserInputV0InputQuestionsItem(options=" + this.options + ", question=" + this.question + ", type=" + this.type + ")";
    }

    public AskUserInputV0InputQuestionsItem(List<String> list, String str, AskUserInputV0InputQuestionsItemType askUserInputV0InputQuestionsItemType) {
        list.getClass();
        str.getClass();
        this.options = list;
        this.question = str;
        this.type = askUserInputV0InputQuestionsItemType;
    }

    public /* synthetic */ AskUserInputV0InputQuestionsItem(List list, String str, AskUserInputV0InputQuestionsItemType askUserInputV0InputQuestionsItemType, int i, mq5 mq5Var) {
        this(list, str, (i & 4) != 0 ? null : askUserInputV0InputQuestionsItemType);
    }
}
