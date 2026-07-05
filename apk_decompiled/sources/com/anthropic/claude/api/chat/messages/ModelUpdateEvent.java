package com.anthropic.claude.api.chat.messages;

import com.anthropic.claude.api.chat.ModelSelection;
import defpackage.aqb;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.lob;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zpb;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJT\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b1\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b2\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b3\u0010\u001e¨\u00067"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/ModelUpdateEvent;", "Lcom/anthropic/claude/api/chat/messages/StreamEvent;", "Lcom/anthropic/claude/api/chat/ModelSelection;", "from_model", "to_model", "", "reason", "category", "explanation", "learn_more_url", "<init>", "(Lcom/anthropic/claude/api/chat/ModelSelection;Lcom/anthropic/claude/api/chat/ModelSelection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/chat/ModelSelection;Lcom/anthropic/claude/api/chat/ModelSelection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/ModelUpdateEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/chat/ModelSelection;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "copy", "(Lcom/anthropic/claude/api/chat/ModelSelection;Lcom/anthropic/claude/api/chat/ModelSelection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/messages/ModelUpdateEvent;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/chat/ModelSelection;", "getFrom_model", "getTo_model", "Ljava/lang/String;", "getReason", "getCategory", "getExplanation", "getLearn_more_url", "Companion", "zpb", "aqb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ModelUpdateEvent implements StreamEvent {
    public static final int $stable = 0;
    public static final aqb Companion = new aqb();
    private final String category;
    private final String explanation;
    private final ModelSelection from_model;
    private final String learn_more_url;
    private final String reason;
    private final ModelSelection to_model;

    public /* synthetic */ ModelUpdateEvent(int i, ModelSelection modelSelection, ModelSelection modelSelection2, String str, String str2, String str3, String str4, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, zpb.a.getDescriptor());
            throw null;
        }
        this.from_model = modelSelection;
        this.to_model = modelSelection2;
        if ((i & 4) == 0) {
            this.reason = null;
        } else {
            this.reason = str;
        }
        if ((i & 8) == 0) {
            this.category = null;
        } else {
            this.category = str2;
        }
        if ((i & 16) == 0) {
            this.explanation = null;
        } else {
            this.explanation = str3;
        }
        if ((i & 32) == 0) {
            this.learn_more_url = null;
        } else {
            this.learn_more_url = str4;
        }
    }

    public static /* synthetic */ ModelUpdateEvent copy$default(ModelUpdateEvent modelUpdateEvent, ModelSelection modelSelection, ModelSelection modelSelection2, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            modelSelection = modelUpdateEvent.from_model;
        }
        if ((i & 2) != 0) {
            modelSelection2 = modelUpdateEvent.to_model;
        }
        if ((i & 4) != 0) {
            str = modelUpdateEvent.reason;
        }
        if ((i & 8) != 0) {
            str2 = modelUpdateEvent.category;
        }
        if ((i & 16) != 0) {
            str3 = modelUpdateEvent.explanation;
        }
        if ((i & 32) != 0) {
            str4 = modelUpdateEvent.learn_more_url;
        }
        String str5 = str3;
        String str6 = str4;
        return modelUpdateEvent.copy(modelSelection, modelSelection2, str, str2, str5, str6);
    }

    public static final /* synthetic */ void write$Self$api(ModelUpdateEvent self, vd4 output, SerialDescriptor serialDesc) {
        lob lobVar = lob.a;
        output.r(serialDesc, 0, lobVar, self.from_model);
        output.r(serialDesc, 1, lobVar, self.to_model);
        if (output.E(serialDesc) || self.reason != null) {
            output.B(serialDesc, 2, srg.a, self.reason);
        }
        if (output.E(serialDesc) || self.category != null) {
            output.B(serialDesc, 3, srg.a, self.category);
        }
        if (output.E(serialDesc) || self.explanation != null) {
            output.B(serialDesc, 4, srg.a, self.explanation);
        }
        if (!output.E(serialDesc) && self.learn_more_url == null) {
            return;
        }
        output.B(serialDesc, 5, srg.a, self.learn_more_url);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ModelSelection getFrom_model() {
        return this.from_model;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ModelSelection getTo_model() {
        return this.to_model;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExplanation() {
        return this.explanation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLearn_more_url() {
        return this.learn_more_url;
    }

    public final ModelUpdateEvent copy(ModelSelection from_model, ModelSelection to_model, String reason, String category, String explanation, String learn_more_url) {
        from_model.getClass();
        to_model.getClass();
        return new ModelUpdateEvent(from_model, to_model, reason, category, explanation, learn_more_url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelUpdateEvent)) {
            return false;
        }
        ModelUpdateEvent modelUpdateEvent = (ModelUpdateEvent) other;
        return x44.r(this.from_model, modelUpdateEvent.from_model) && x44.r(this.to_model, modelUpdateEvent.to_model) && x44.r(this.reason, modelUpdateEvent.reason) && x44.r(this.category, modelUpdateEvent.category) && x44.r(this.explanation, modelUpdateEvent.explanation) && x44.r(this.learn_more_url, modelUpdateEvent.learn_more_url);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getExplanation() {
        return this.explanation;
    }

    public final ModelSelection getFrom_model() {
        return this.from_model;
    }

    public final String getLearn_more_url() {
        return this.learn_more_url;
    }

    public final String getReason() {
        return this.reason;
    }

    public final ModelSelection getTo_model() {
        return this.to_model;
    }

    public int hashCode() {
        int iHashCode = (this.to_model.hashCode() + (this.from_model.hashCode() * 31)) * 31;
        String str = this.reason;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.explanation;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.learn_more_url;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        ModelSelection modelSelection = this.from_model;
        ModelSelection modelSelection2 = this.to_model;
        String str = this.reason;
        String str2 = this.category;
        String str3 = this.explanation;
        String str4 = this.learn_more_url;
        StringBuilder sb = new StringBuilder("ModelUpdateEvent(from_model=");
        sb.append(modelSelection);
        sb.append(", to_model=");
        sb.append(modelSelection2);
        sb.append(", reason=");
        kgh.u(sb, str, ", category=", str2, ", explanation=");
        return vb7.t(sb, str3, ", learn_more_url=", str4, ")");
    }

    public ModelUpdateEvent(ModelSelection modelSelection, ModelSelection modelSelection2, String str, String str2, String str3, String str4) {
        modelSelection.getClass();
        modelSelection2.getClass();
        this.from_model = modelSelection;
        this.to_model = modelSelection2;
        this.reason = str;
        this.category = str2;
        this.explanation = str3;
        this.learn_more_url = str4;
    }

    public /* synthetic */ ModelUpdateEvent(ModelSelection modelSelection, ModelSelection modelSelection2, String str, String str2, String str3, String str4, int i, mq5 mq5Var) {
        this(modelSelection, modelSelection2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
