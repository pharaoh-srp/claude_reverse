package com.anthropic.claude.code.ui;

import defpackage.bwc;
import defpackage.ebh;
import defpackage.eh9;
import defpackage.f7a;
import defpackage.gvj;
import defpackage.jsf;
import defpackage.kgh;
import defpackage.ksf;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nm6;
import defpackage.o36;
import defpackage.onf;
import defpackage.srg;
import defpackage.ucf;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?@BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bg\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u001c\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b(\u0010)J`\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010 J\u0010\u0010-\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010%R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010)¨\u0006A"}, d2 = {"Lcom/anthropic/claude/code/ui/SessionInputData;", "", "", "sessionId", "inputText", "", "Lcom/anthropic/claude/code/ui/DiffLineComment;", "comments", "Lcom/anthropic/claude/code/ui/PendingAskUserQuestionSelections;", "pendingAskUserQuestionSelections", "", "Lkotlinx/serialization/json/JsonElement;", "submittedAskUserQuestionAnswers", "", "lastModified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/code/ui/PendingAskUserQuestionSelections;Ljava/util/Map;J)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/code/ui/PendingAskUserQuestionSelections;Ljava/util/Map;JLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$ui", "(Lcom/anthropic/claude/code/ui/SessionInputData;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/anthropic/claude/code/ui/PendingAskUserQuestionSelections;", "component5", "()Ljava/util/Map;", "component6", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/code/ui/PendingAskUserQuestionSelections;Ljava/util/Map;J)Lcom/anthropic/claude/code/ui/SessionInputData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionId", "getInputText", "Ljava/util/List;", "getComments", "Lcom/anthropic/claude/code/ui/PendingAskUserQuestionSelections;", "getPendingAskUserQuestionSelections", "Ljava/util/Map;", "getSubmittedAskUserQuestionAnswers", "J", "getLastModified", "Companion", "jsf", "ksf", "ui"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SessionInputData {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final ksf Companion = new ksf();
    private final List<DiffLineComment> comments;
    private final String inputText;
    private final long lastModified;
    private final PendingAskUserQuestionSelections pendingAskUserQuestionSelections;
    private final String sessionId;
    private final Map<String, JsonElement> submittedAskUserQuestionAnswers;

    static {
        ucf ucfVar = new ucf(24);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, yb5.w(w1aVar, ucfVar), null, yb5.w(w1aVar, new ucf(25)), null};
    }

    public /* synthetic */ SessionInputData(int i, String str, String str2, List list, PendingAskUserQuestionSelections pendingAskUserQuestionSelections, Map map, long j, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, jsf.a.getDescriptor());
            throw null;
        }
        this.sessionId = str;
        if ((i & 2) == 0) {
            this.inputText = "";
        } else {
            this.inputText = str2;
        }
        if ((i & 4) == 0) {
            this.comments = lm6.E;
        } else {
            this.comments = list;
        }
        if ((i & 8) == 0) {
            this.pendingAskUserQuestionSelections = null;
        } else {
            this.pendingAskUserQuestionSelections = pendingAskUserQuestionSelections;
        }
        if ((i & 16) == 0) {
            this.submittedAskUserQuestionAnswers = nm6.E;
        } else {
            this.submittedAskUserQuestionAnswers = map;
        }
        if ((i & 32) == 0) {
            this.lastModified = System.currentTimeMillis();
        } else {
            this.lastModified = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(o36.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new f7a(srg.a, eh9.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionInputData copy$default(SessionInputData sessionInputData, String str, String str2, List list, PendingAskUserQuestionSelections pendingAskUserQuestionSelections, Map map, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionInputData.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = sessionInputData.inputText;
        }
        if ((i & 4) != 0) {
            list = sessionInputData.comments;
        }
        if ((i & 8) != 0) {
            pendingAskUserQuestionSelections = sessionInputData.pendingAskUserQuestionSelections;
        }
        if ((i & 16) != 0) {
            map = sessionInputData.submittedAskUserQuestionAnswers;
        }
        if ((i & 32) != 0) {
            j = sessionInputData.lastModified;
        }
        long j2 = j;
        Map map2 = map;
        List list2 = list;
        return sessionInputData.copy(str, str2, list2, pendingAskUserQuestionSelections, map2, j2);
    }

    public static final /* synthetic */ void write$Self$ui(SessionInputData self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.sessionId);
        if (output.E(serialDesc) || !x44.r(self.inputText, "")) {
            output.q(serialDesc, 1, self.inputText);
        }
        if (output.E(serialDesc) || !x44.r(self.comments, lm6.E)) {
            output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.comments);
        }
        if (output.E(serialDesc) || self.pendingAskUserQuestionSelections != null) {
            output.B(serialDesc, 3, bwc.a, self.pendingAskUserQuestionSelections);
        }
        if (output.E(serialDesc) || !x44.r(self.submittedAskUserQuestionAnswers, nm6.E)) {
            output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.submittedAskUserQuestionAnswers);
        }
        if (!output.E(serialDesc) && self.lastModified == System.currentTimeMillis()) {
            return;
        }
        output.D(serialDesc, 5, self.lastModified);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInputText() {
        return this.inputText;
    }

    public final List<DiffLineComment> component3() {
        return this.comments;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PendingAskUserQuestionSelections getPendingAskUserQuestionSelections() {
        return this.pendingAskUserQuestionSelections;
    }

    public final Map<String, JsonElement> component5() {
        return this.submittedAskUserQuestionAnswers;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getLastModified() {
        return this.lastModified;
    }

    public final SessionInputData copy(String sessionId, String inputText, List<DiffLineComment> comments, PendingAskUserQuestionSelections pendingAskUserQuestionSelections, Map<String, ? extends JsonElement> submittedAskUserQuestionAnswers, long lastModified) {
        sessionId.getClass();
        inputText.getClass();
        comments.getClass();
        submittedAskUserQuestionAnswers.getClass();
        return new SessionInputData(sessionId, inputText, comments, pendingAskUserQuestionSelections, submittedAskUserQuestionAnswers, lastModified);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionInputData)) {
            return false;
        }
        SessionInputData sessionInputData = (SessionInputData) other;
        return x44.r(this.sessionId, sessionInputData.sessionId) && x44.r(this.inputText, sessionInputData.inputText) && x44.r(this.comments, sessionInputData.comments) && x44.r(this.pendingAskUserQuestionSelections, sessionInputData.pendingAskUserQuestionSelections) && x44.r(this.submittedAskUserQuestionAnswers, sessionInputData.submittedAskUserQuestionAnswers) && this.lastModified == sessionInputData.lastModified;
    }

    public final List<DiffLineComment> getComments() {
        return this.comments;
    }

    public final String getInputText() {
        return this.inputText;
    }

    public final long getLastModified() {
        return this.lastModified;
    }

    public final PendingAskUserQuestionSelections getPendingAskUserQuestionSelections() {
        return this.pendingAskUserQuestionSelections;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final Map<String, JsonElement> getSubmittedAskUserQuestionAnswers() {
        return this.submittedAskUserQuestionAnswers;
    }

    public int hashCode() {
        int iM = kgh.m(kgh.l(this.sessionId.hashCode() * 31, 31, this.inputText), 31, this.comments);
        PendingAskUserQuestionSelections pendingAskUserQuestionSelections = this.pendingAskUserQuestionSelections;
        return Long.hashCode(this.lastModified) + ebh.g((iM + (pendingAskUserQuestionSelections == null ? 0 : pendingAskUserQuestionSelections.hashCode())) * 31, 31, this.submittedAskUserQuestionAnswers);
    }

    public String toString() {
        String str = this.sessionId;
        String str2 = this.inputText;
        List<DiffLineComment> list = this.comments;
        PendingAskUserQuestionSelections pendingAskUserQuestionSelections = this.pendingAskUserQuestionSelections;
        Map<String, JsonElement> map = this.submittedAskUserQuestionAnswers;
        long j = this.lastModified;
        StringBuilder sbR = kgh.r("SessionInputData(sessionId=", str, ", inputText=", str2, ", comments=");
        sbR.append(list);
        sbR.append(", pendingAskUserQuestionSelections=");
        sbR.append(pendingAskUserQuestionSelections);
        sbR.append(", submittedAskUserQuestionAnswers=");
        sbR.append(map);
        sbR.append(", lastModified=");
        sbR.append(j);
        sbR.append(")");
        return sbR.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SessionInputData(String str, String str2, List<DiffLineComment> list, PendingAskUserQuestionSelections pendingAskUserQuestionSelections, Map<String, ? extends JsonElement> map, long j) {
        str.getClass();
        str2.getClass();
        list.getClass();
        map.getClass();
        this.sessionId = str;
        this.inputText = str2;
        this.comments = list;
        this.pendingAskUserQuestionSelections = pendingAskUserQuestionSelections;
        this.submittedAskUserQuestionAnswers = map;
        this.lastModified = j;
    }

    public /* synthetic */ SessionInputData(String str, String str2, List list, PendingAskUserQuestionSelections pendingAskUserQuestionSelections, Map map, long j, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? lm6.E : list, (i & 8) != 0 ? null : pendingAskUserQuestionSelections, (i & 16) != 0 ? nm6.E : map, (i & 32) != 0 ? System.currentTimeMillis() : j);
    }
}
