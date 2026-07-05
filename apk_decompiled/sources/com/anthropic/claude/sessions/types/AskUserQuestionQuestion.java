package com.anthropic.claude.sessions.types;

import defpackage.ew0;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pw0;
import defpackage.rw0;
import defpackage.sw0;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J>\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010 ¨\u00063"}, d2 = {"Lcom/anthropic/claude/sessions/types/AskUserQuestionQuestion;", "", "", "question", "header", "", "Lcom/anthropic/claude/sessions/types/AskUserQuestionOption;", "options", "", "multiSelect", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/AskUserQuestionQuestion;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lcom/anthropic/claude/sessions/types/AskUserQuestionQuestion;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuestion", "getHeader", "Ljava/util/List;", "getOptions", "Z", "getMultiSelect", "Companion", "rw0", "sw0", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AskUserQuestionQuestion {
    private final String header;
    private final boolean multiSelect;
    private final List<AskUserQuestionOption> options;
    private final String question;
    public static final sw0 Companion = new sw0();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new ew0(1)), null};

    public /* synthetic */ AskUserQuestionQuestion(int i, String str, String str2, List list, boolean z, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, rw0.a.getDescriptor());
            throw null;
        }
        this.question = str;
        this.header = str2;
        this.options = list;
        if ((i & 8) == 0) {
            this.multiSelect = false;
        } else {
            this.multiSelect = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(pw0.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AskUserQuestionQuestion copy$default(AskUserQuestionQuestion askUserQuestionQuestion, String str, String str2, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = askUserQuestionQuestion.question;
        }
        if ((i & 2) != 0) {
            str2 = askUserQuestionQuestion.header;
        }
        if ((i & 4) != 0) {
            list = askUserQuestionQuestion.options;
        }
        if ((i & 8) != 0) {
            z = askUserQuestionQuestion.multiSelect;
        }
        return askUserQuestionQuestion.copy(str, str2, list, z);
    }

    public static final /* synthetic */ void write$Self$sessions(AskUserQuestionQuestion self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.question);
        output.q(serialDesc, 1, self.header);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.options);
        if (output.E(serialDesc) || self.multiSelect) {
            output.p(serialDesc, 3, self.multiSelect);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    public final List<AskUserQuestionOption> component3() {
        return this.options;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getMultiSelect() {
        return this.multiSelect;
    }

    public final AskUserQuestionQuestion copy(String question, String header, List<AskUserQuestionOption> options, boolean multiSelect) {
        question.getClass();
        header.getClass();
        options.getClass();
        return new AskUserQuestionQuestion(question, header, options, multiSelect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AskUserQuestionQuestion)) {
            return false;
        }
        AskUserQuestionQuestion askUserQuestionQuestion = (AskUserQuestionQuestion) other;
        return x44.r(this.question, askUserQuestionQuestion.question) && x44.r(this.header, askUserQuestionQuestion.header) && x44.r(this.options, askUserQuestionQuestion.options) && this.multiSelect == askUserQuestionQuestion.multiSelect;
    }

    public final String getHeader() {
        return this.header;
    }

    public final boolean getMultiSelect() {
        return this.multiSelect;
    }

    public final List<AskUserQuestionOption> getOptions() {
        return this.options;
    }

    public final String getQuestion() {
        return this.question;
    }

    public int hashCode() {
        return Boolean.hashCode(this.multiSelect) + kgh.m(kgh.l(this.question.hashCode() * 31, 31, this.header), 31, this.options);
    }

    public String toString() {
        String str = this.question;
        String str2 = this.header;
        List<AskUserQuestionOption> list = this.options;
        boolean z = this.multiSelect;
        StringBuilder sbR = kgh.r("AskUserQuestionQuestion(question=", str, ", header=", str2, ", options=");
        sbR.append(list);
        sbR.append(", multiSelect=");
        sbR.append(z);
        sbR.append(")");
        return sbR.toString();
    }

    public AskUserQuestionQuestion(String str, String str2, List<AskUserQuestionOption> list, boolean z) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.question = str;
        this.header = str2;
        this.options = list;
        this.multiSelect = z;
    }

    public /* synthetic */ AskUserQuestionQuestion(String str, String str2, List list, boolean z, int i, mq5 mq5Var) {
        this(str, str2, list, (i & 8) != 0 ? false : z);
    }
}
