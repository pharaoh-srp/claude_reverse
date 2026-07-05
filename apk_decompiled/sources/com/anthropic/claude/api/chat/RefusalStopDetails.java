package com.anthropic.claude.api.chat;

import defpackage.fde;
import defpackage.kgh;
import defpackage.lob;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J@\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u00060"}, d2 = {"Lcom/anthropic/claude/api/chat/RefusalStopDetails;", "", "", "category", "explanation", "Lcom/anthropic/claude/api/chat/ModelSelection;", "retry_suggestion", "learn_more_url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/ModelSelection;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/ModelSelection;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/RefusalStopDetails;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/api/chat/ModelSelection;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/ModelSelection;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/RefusalStopDetails;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCategory", "getExplanation", "Lcom/anthropic/claude/api/chat/ModelSelection;", "getRetry_suggestion", "getLearn_more_url", "Companion", "ede", "fde", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RefusalStopDetails {
    public static final int $stable = 0;
    public static final fde Companion = new fde();
    private final String category;
    private final String explanation;
    private final String learn_more_url;
    private final ModelSelection retry_suggestion;

    public /* synthetic */ RefusalStopDetails(int i, String str, String str2, ModelSelection modelSelection, String str3, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.category = null;
        } else {
            this.category = str;
        }
        if ((i & 2) == 0) {
            this.explanation = null;
        } else {
            this.explanation = str2;
        }
        if ((i & 4) == 0) {
            this.retry_suggestion = null;
        } else {
            this.retry_suggestion = modelSelection;
        }
        if ((i & 8) == 0) {
            this.learn_more_url = null;
        } else {
            this.learn_more_url = str3;
        }
    }

    public static /* synthetic */ RefusalStopDetails copy$default(RefusalStopDetails refusalStopDetails, String str, String str2, ModelSelection modelSelection, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = refusalStopDetails.category;
        }
        if ((i & 2) != 0) {
            str2 = refusalStopDetails.explanation;
        }
        if ((i & 4) != 0) {
            modelSelection = refusalStopDetails.retry_suggestion;
        }
        if ((i & 8) != 0) {
            str3 = refusalStopDetails.learn_more_url;
        }
        return refusalStopDetails.copy(str, str2, modelSelection, str3);
    }

    public static final /* synthetic */ void write$Self$api(RefusalStopDetails self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.category != null) {
            output.B(serialDesc, 0, srg.a, self.category);
        }
        if (output.E(serialDesc) || self.explanation != null) {
            output.B(serialDesc, 1, srg.a, self.explanation);
        }
        if (output.E(serialDesc) || self.retry_suggestion != null) {
            output.B(serialDesc, 2, lob.a, self.retry_suggestion);
        }
        if (!output.E(serialDesc) && self.learn_more_url == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.learn_more_url);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExplanation() {
        return this.explanation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ModelSelection getRetry_suggestion() {
        return this.retry_suggestion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLearn_more_url() {
        return this.learn_more_url;
    }

    public final RefusalStopDetails copy(String category, String explanation, ModelSelection retry_suggestion, String learn_more_url) {
        return new RefusalStopDetails(category, explanation, retry_suggestion, learn_more_url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefusalStopDetails)) {
            return false;
        }
        RefusalStopDetails refusalStopDetails = (RefusalStopDetails) other;
        return x44.r(this.category, refusalStopDetails.category) && x44.r(this.explanation, refusalStopDetails.explanation) && x44.r(this.retry_suggestion, refusalStopDetails.retry_suggestion) && x44.r(this.learn_more_url, refusalStopDetails.learn_more_url);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getExplanation() {
        return this.explanation;
    }

    public final String getLearn_more_url() {
        return this.learn_more_url;
    }

    public final ModelSelection getRetry_suggestion() {
        return this.retry_suggestion;
    }

    public int hashCode() {
        String str = this.category;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.explanation;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ModelSelection modelSelection = this.retry_suggestion;
        int iHashCode3 = (iHashCode2 + (modelSelection == null ? 0 : modelSelection.hashCode())) * 31;
        String str3 = this.learn_more_url;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.category;
        String str2 = this.explanation;
        ModelSelection modelSelection = this.retry_suggestion;
        String str3 = this.learn_more_url;
        StringBuilder sbR = kgh.r("RefusalStopDetails(category=", str, ", explanation=", str2, ", retry_suggestion=");
        sbR.append(modelSelection);
        sbR.append(", learn_more_url=");
        sbR.append(str3);
        sbR.append(")");
        return sbR.toString();
    }

    public RefusalStopDetails() {
        this((String) null, (String) null, (ModelSelection) null, (String) null, 15, (mq5) null);
    }

    public RefusalStopDetails(String str, String str2, ModelSelection modelSelection, String str3) {
        this.category = str;
        this.explanation = str2;
        this.retry_suggestion = modelSelection;
        this.learn_more_url = str3;
    }

    public /* synthetic */ RefusalStopDetails(String str, String str2, ModelSelection modelSelection, String str3, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : modelSelection, (i & 8) != 0 ? null : str3);
    }
}
