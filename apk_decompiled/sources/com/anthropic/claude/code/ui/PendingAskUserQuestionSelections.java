package com.anthropic.claude.code.ui;

import defpackage.blc;
import defpackage.bwc;
import defpackage.cwc;
import defpackage.ebh;
import defpackage.eh9;
import defpackage.f7a;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nm6;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bBY\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJP\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b.\u0010\u001e¨\u00062"}, d2 = {"Lcom/anthropic/claude/code/ui/PendingAskUserQuestionSelections;", "", "", "toolUseId", "", "currentQuestionIndex", "", "Lkotlinx/serialization/json/JsonElement;", "selectedAnswers", "otherTexts", "<init>", "(Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/util/Map;Ljava/util/Map;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$ui", "(Lcom/anthropic/claude/code/ui/PendingAskUserQuestionSelections;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/util/Map;", "component4", "copy", "(Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;)Lcom/anthropic/claude/code/ui/PendingAskUserQuestionSelections;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToolUseId", "I", "getCurrentQuestionIndex", "Ljava/util/Map;", "getSelectedAnswers", "getOtherTexts", "Companion", "bwc", "cwc", "ui"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PendingAskUserQuestionSelections {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final cwc Companion = new cwc();
    private final int currentQuestionIndex;
    private final Map<String, String> otherTexts;
    private final Map<String, JsonElement> selectedAnswers;
    private final String toolUseId;

    static {
        blc blcVar = new blc(8);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, yb5.w(w1aVar, blcVar), yb5.w(w1aVar, new blc(9))};
    }

    public /* synthetic */ PendingAskUserQuestionSelections(int i, String str, int i2, Map map, Map map2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, bwc.a.getDescriptor());
            throw null;
        }
        this.toolUseId = str;
        if ((i & 2) == 0) {
            this.currentQuestionIndex = 0;
        } else {
            this.currentQuestionIndex = i2;
        }
        int i3 = i & 4;
        nm6 nm6Var = nm6.E;
        if (i3 == 0) {
            this.selectedAnswers = nm6Var;
        } else {
            this.selectedAnswers = map;
        }
        if ((i & 8) == 0) {
            this.otherTexts = nm6Var;
        } else {
            this.otherTexts = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new f7a(srg.a, eh9.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        srg srgVar = srg.a;
        return new f7a(srgVar, srgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PendingAskUserQuestionSelections copy$default(PendingAskUserQuestionSelections pendingAskUserQuestionSelections, String str, int i, Map map, Map map2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pendingAskUserQuestionSelections.toolUseId;
        }
        if ((i2 & 2) != 0) {
            i = pendingAskUserQuestionSelections.currentQuestionIndex;
        }
        if ((i2 & 4) != 0) {
            map = pendingAskUserQuestionSelections.selectedAnswers;
        }
        if ((i2 & 8) != 0) {
            map2 = pendingAskUserQuestionSelections.otherTexts;
        }
        return pendingAskUserQuestionSelections.copy(str, i, map, map2);
    }

    public static final /* synthetic */ void write$Self$ui(PendingAskUserQuestionSelections self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.toolUseId);
        if (output.E(serialDesc) || self.currentQuestionIndex != 0) {
            output.l(1, self.currentQuestionIndex, serialDesc);
        }
        boolean zE = output.E(serialDesc);
        nm6 nm6Var = nm6.E;
        if (zE || !x44.r(self.selectedAnswers, nm6Var)) {
            output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.selectedAnswers);
        }
        if (!output.E(serialDesc) && x44.r(self.otherTexts, nm6Var)) {
            return;
        }
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.otherTexts);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToolUseId() {
        return this.toolUseId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCurrentQuestionIndex() {
        return this.currentQuestionIndex;
    }

    public final Map<String, JsonElement> component3() {
        return this.selectedAnswers;
    }

    public final Map<String, String> component4() {
        return this.otherTexts;
    }

    public final PendingAskUserQuestionSelections copy(String toolUseId, int currentQuestionIndex, Map<String, ? extends JsonElement> selectedAnswers, Map<String, String> otherTexts) {
        toolUseId.getClass();
        selectedAnswers.getClass();
        otherTexts.getClass();
        return new PendingAskUserQuestionSelections(toolUseId, currentQuestionIndex, selectedAnswers, otherTexts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingAskUserQuestionSelections)) {
            return false;
        }
        PendingAskUserQuestionSelections pendingAskUserQuestionSelections = (PendingAskUserQuestionSelections) other;
        return x44.r(this.toolUseId, pendingAskUserQuestionSelections.toolUseId) && this.currentQuestionIndex == pendingAskUserQuestionSelections.currentQuestionIndex && x44.r(this.selectedAnswers, pendingAskUserQuestionSelections.selectedAnswers) && x44.r(this.otherTexts, pendingAskUserQuestionSelections.otherTexts);
    }

    public final int getCurrentQuestionIndex() {
        return this.currentQuestionIndex;
    }

    public final Map<String, String> getOtherTexts() {
        return this.otherTexts;
    }

    public final Map<String, JsonElement> getSelectedAnswers() {
        return this.selectedAnswers;
    }

    public final String getToolUseId() {
        return this.toolUseId;
    }

    public int hashCode() {
        return this.otherTexts.hashCode() + ebh.g(vb7.c(this.currentQuestionIndex, this.toolUseId.hashCode() * 31, 31), 31, this.selectedAnswers);
    }

    public String toString() {
        String str = this.toolUseId;
        int i = this.currentQuestionIndex;
        Map<String, JsonElement> map = this.selectedAnswers;
        Map<String, String> map2 = this.otherTexts;
        StringBuilder sbP = ij0.p("PendingAskUserQuestionSelections(toolUseId=", str, i, ", currentQuestionIndex=", ", selectedAnswers=");
        sbP.append(map);
        sbP.append(", otherTexts=");
        sbP.append(map2);
        sbP.append(")");
        return sbP.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PendingAskUserQuestionSelections(String str, int i, Map<String, ? extends JsonElement> map, Map<String, String> map2) {
        str.getClass();
        map.getClass();
        map2.getClass();
        this.toolUseId = str;
        this.currentQuestionIndex = i;
        this.selectedAnswers = map;
        this.otherTexts = map2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PendingAskUserQuestionSelections(String str, int i, Map map, Map map2, int i2, mq5 mq5Var) {
        i = (i2 & 2) != 0 ? 0 : i;
        int i3 = i2 & 4;
        nm6 nm6Var = nm6.E;
        this(str, i, i3 != 0 ? nm6Var : map, (i2 & 8) != 0 ? nm6Var : map2);
    }
}
