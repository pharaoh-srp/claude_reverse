package com.anthropic.claude.sessions.types;

import defpackage.eh9;
import defpackage.ew0;
import defpackage.f7a;
import defpackage.fw0;
import defpackage.gvj;
import defpackage.gw0;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.os0;
import defpackage.rw0;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001aR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006."}, d2 = {"Lcom/anthropic/claude/sessions/types/AskUserQuestionInput;", "", "", "Lcom/anthropic/claude/sessions/types/AskUserQuestionQuestion;", "questions", "", "", "Lkotlinx/serialization/json/JsonElement;", "answers", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/Map;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/AskUserQuestionInput;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/util/List;Ljava/util/Map;)Lcom/anthropic/claude/sessions/types/AskUserQuestionInput;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getQuestions", "Ljava/util/Map;", "getAnswers", "Companion", "fw0", "gw0", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AskUserQuestionInput {
    private static final kw9[] $childSerializers;
    public static final gw0 Companion = new gw0();
    private final Map<String, JsonElement> answers;
    private final List<AskUserQuestionQuestion> questions;

    static {
        os0 os0Var = new os0(29);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, os0Var), yb5.w(w1aVar, new ew0(0))};
    }

    public /* synthetic */ AskUserQuestionInput(int i, List list, Map map, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, fw0.a.getDescriptor());
            throw null;
        }
        this.questions = list;
        if ((i & 2) == 0) {
            this.answers = null;
        } else {
            this.answers = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(rw0.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new f7a(srg.a, eh9.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AskUserQuestionInput copy$default(AskUserQuestionInput askUserQuestionInput, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = askUserQuestionInput.questions;
        }
        if ((i & 2) != 0) {
            map = askUserQuestionInput.answers;
        }
        return askUserQuestionInput.copy(list, map);
    }

    public static final /* synthetic */ void write$Self$sessions(AskUserQuestionInput self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.questions);
        if (!output.E(serialDesc) && self.answers == null) {
            return;
        }
        output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.answers);
    }

    public final List<AskUserQuestionQuestion> component1() {
        return this.questions;
    }

    public final Map<String, JsonElement> component2() {
        return this.answers;
    }

    public final AskUserQuestionInput copy(List<AskUserQuestionQuestion> questions, Map<String, ? extends JsonElement> answers) {
        questions.getClass();
        return new AskUserQuestionInput(questions, answers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AskUserQuestionInput)) {
            return false;
        }
        AskUserQuestionInput askUserQuestionInput = (AskUserQuestionInput) other;
        return x44.r(this.questions, askUserQuestionInput.questions) && x44.r(this.answers, askUserQuestionInput.answers);
    }

    public final Map<String, JsonElement> getAnswers() {
        return this.answers;
    }

    public final List<AskUserQuestionQuestion> getQuestions() {
        return this.questions;
    }

    public int hashCode() {
        int iHashCode = this.questions.hashCode() * 31;
        Map<String, JsonElement> map = this.answers;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "AskUserQuestionInput(questions=" + this.questions + ", answers=" + this.answers + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AskUserQuestionInput(List<AskUserQuestionQuestion> list, Map<String, ? extends JsonElement> map) {
        list.getClass();
        this.questions = list;
        this.answers = map;
    }

    public /* synthetic */ AskUserQuestionInput(List list, Map map, int i, mq5 mq5Var) {
        this(list, (i & 2) != 0 ? null : map);
    }
}
