package com.anthropic.claude.sessions.types;

import defpackage.blc;
import defpackage.cad;
import defpackage.fsh;
import defpackage.gid;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.kyg;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\r\u0010\u000eBe\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\\\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010 J\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b\u0007\u0010\"R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b5\u0010 R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b6\u0010 R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b7\u0010 R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010'¨\u0006="}, d2 = {"Lcom/anthropic/claude/sessions/types/PostTurnSummary;", "", "Lcom/anthropic/claude/sessions/types/SummaryStatusCategory;", "status_category", "", "status_detail", "", "is_noteworthy", "recent_action", "needs_action", "description", "", "artifact_urls", "<init>", "(Lcom/anthropic/claude/sessions/types/SummaryStatusCategory;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/sessions/types/SummaryStatusCategory;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/PostTurnSummary;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/sessions/types/SummaryStatusCategory;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "copy", "(Lcom/anthropic/claude/sessions/types/SummaryStatusCategory;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/sessions/types/PostTurnSummary;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/sessions/types/SummaryStatusCategory;", "getStatus_category", "Ljava/lang/String;", "getStatus_detail", "Z", "getRecent_action", "getNeeds_action", "getDescription", "Ljava/util/List;", "getArtifact_urls", "Companion", "bad", "cad", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PostTurnSummary {
    private final List<String> artifact_urls;
    private final String description;
    private final boolean is_noteworthy;
    private final String needs_action;
    private final String recent_action;
    private final SummaryStatusCategory status_category;
    private final String status_detail;
    public static final cad Companion = new cad();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, yb5.w(w1a.F, new blc(26))};

    public /* synthetic */ PostTurnSummary(int i, SummaryStatusCategory summaryStatusCategory, String str, boolean z, String str2, String str3, String str4, List list, vnf vnfVar) {
        this.status_category = (i & 1) == 0 ? SummaryStatusCategory.UNKNOWN : summaryStatusCategory;
        if ((i & 2) == 0) {
            this.status_detail = "";
        } else {
            this.status_detail = str;
        }
        if ((i & 4) == 0) {
            this.is_noteworthy = false;
        } else {
            this.is_noteworthy = z;
        }
        if ((i & 8) == 0) {
            this.recent_action = "";
        } else {
            this.recent_action = str2;
        }
        if ((i & 16) == 0) {
            this.needs_action = "";
        } else {
            this.needs_action = str3;
        }
        if ((i & 32) == 0) {
            this.description = "";
        } else {
            this.description = str4;
        }
        if ((i & 64) == 0) {
            this.artifact_urls = lm6.E;
        } else {
            this.artifact_urls = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostTurnSummary copy$default(PostTurnSummary postTurnSummary, SummaryStatusCategory summaryStatusCategory, String str, boolean z, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            summaryStatusCategory = postTurnSummary.status_category;
        }
        if ((i & 2) != 0) {
            str = postTurnSummary.status_detail;
        }
        if ((i & 4) != 0) {
            z = postTurnSummary.is_noteworthy;
        }
        if ((i & 8) != 0) {
            str2 = postTurnSummary.recent_action;
        }
        if ((i & 16) != 0) {
            str3 = postTurnSummary.needs_action;
        }
        if ((i & 32) != 0) {
            str4 = postTurnSummary.description;
        }
        if ((i & 64) != 0) {
            list = postTurnSummary.artifact_urls;
        }
        String str5 = str4;
        List list2 = list;
        String str6 = str3;
        boolean z2 = z;
        return postTurnSummary.copy(summaryStatusCategory, str, z2, str2, str6, str5, list2);
    }

    public static final /* synthetic */ void write$Self$sessions(PostTurnSummary self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.status_category != SummaryStatusCategory.UNKNOWN) {
            output.r(serialDesc, 0, kyg.a, self.status_category);
        }
        if (output.E(serialDesc) || !x44.r(self.status_detail, "")) {
            output.q(serialDesc, 1, self.status_detail);
        }
        if (output.E(serialDesc) || self.is_noteworthy) {
            output.p(serialDesc, 2, self.is_noteworthy);
        }
        if (output.E(serialDesc) || !x44.r(self.recent_action, "")) {
            output.q(serialDesc, 3, self.recent_action);
        }
        if (output.E(serialDesc) || !x44.r(self.needs_action, "")) {
            output.q(serialDesc, 4, self.needs_action);
        }
        if (output.E(serialDesc) || !x44.r(self.description, "")) {
            output.q(serialDesc, 5, self.description);
        }
        if (!output.E(serialDesc) && x44.r(self.artifact_urls, lm6.E)) {
            return;
        }
        output.r(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.artifact_urls);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SummaryStatusCategory getStatus_category() {
        return this.status_category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus_detail() {
        return this.status_detail;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIs_noteworthy() {
        return this.is_noteworthy;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRecent_action() {
        return this.recent_action;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNeeds_action() {
        return this.needs_action;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<String> component7() {
        return this.artifact_urls;
    }

    public final PostTurnSummary copy(SummaryStatusCategory status_category, String status_detail, boolean is_noteworthy, String recent_action, String needs_action, String description, List<String> artifact_urls) {
        status_category.getClass();
        status_detail.getClass();
        recent_action.getClass();
        needs_action.getClass();
        description.getClass();
        artifact_urls.getClass();
        return new PostTurnSummary(status_category, status_detail, is_noteworthy, recent_action, needs_action, description, artifact_urls);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostTurnSummary)) {
            return false;
        }
        PostTurnSummary postTurnSummary = (PostTurnSummary) other;
        return this.status_category == postTurnSummary.status_category && x44.r(this.status_detail, postTurnSummary.status_detail) && this.is_noteworthy == postTurnSummary.is_noteworthy && x44.r(this.recent_action, postTurnSummary.recent_action) && x44.r(this.needs_action, postTurnSummary.needs_action) && x44.r(this.description, postTurnSummary.description) && x44.r(this.artifact_urls, postTurnSummary.artifact_urls);
    }

    public final List<String> getArtifact_urls() {
        return this.artifact_urls;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getNeeds_action() {
        return this.needs_action;
    }

    public final String getRecent_action() {
        return this.recent_action;
    }

    public final SummaryStatusCategory getStatus_category() {
        return this.status_category;
    }

    public final String getStatus_detail() {
        return this.status_detail;
    }

    public int hashCode() {
        return this.artifact_urls.hashCode() + kgh.l(kgh.l(kgh.l(fsh.p(kgh.l(this.status_category.hashCode() * 31, 31, this.status_detail), 31, this.is_noteworthy), 31, this.recent_action), 31, this.needs_action), 31, this.description);
    }

    public final boolean is_noteworthy() {
        return this.is_noteworthy;
    }

    public String toString() {
        SummaryStatusCategory summaryStatusCategory = this.status_category;
        String str = this.status_detail;
        boolean z = this.is_noteworthy;
        String str2 = this.recent_action;
        String str3 = this.needs_action;
        String str4 = this.description;
        List<String> list = this.artifact_urls;
        StringBuilder sb = new StringBuilder("PostTurnSummary(status_category=");
        sb.append(summaryStatusCategory);
        sb.append(", status_detail=");
        sb.append(str);
        sb.append(", is_noteworthy=");
        sb.append(z);
        sb.append(", recent_action=");
        sb.append(str2);
        sb.append(", needs_action=");
        kgh.u(sb, str3, ", description=", str4, ", artifact_urls=");
        return gid.q(sb, list, ")");
    }

    public PostTurnSummary() {
        this((SummaryStatusCategory) null, (String) null, false, (String) null, (String) null, (String) null, (List) null, 127, (mq5) null);
    }

    public PostTurnSummary(SummaryStatusCategory summaryStatusCategory, String str, boolean z, String str2, String str3, String str4, List<String> list) {
        summaryStatusCategory.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.status_category = summaryStatusCategory;
        this.status_detail = str;
        this.is_noteworthy = z;
        this.recent_action = str2;
        this.needs_action = str3;
        this.description = str4;
        this.artifact_urls = list;
    }

    public /* synthetic */ PostTurnSummary(SummaryStatusCategory summaryStatusCategory, String str, boolean z, String str2, String str3, String str4, List list, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? SummaryStatusCategory.UNKNOWN : summaryStatusCategory, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? lm6.E : list);
    }
}
