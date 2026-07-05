package com.anthropic.claude.api.model;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.onb;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J@\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0018¨\u0006."}, d2 = {"Lcom/anthropic/claude/api/model/ModelCapabilities;", "", "", "mm_pdf", "mm_images", "web_search", "compass", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/model/ModelCapabilities;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/model/ModelCapabilities;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getMm_pdf", "getMm_images", "getWeb_search", "getCompass", "Companion", "nnb", "onb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ModelCapabilities {
    public static final int $stable = 0;
    public static final onb Companion = new onb();
    private final Boolean compass;
    private final Boolean mm_images;
    private final Boolean mm_pdf;
    private final Boolean web_search;

    public /* synthetic */ ModelCapabilities(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, vnf vnfVar) {
        this.mm_pdf = (i & 1) == 0 ? Boolean.TRUE : bool;
        if ((i & 2) == 0) {
            this.mm_images = Boolean.TRUE;
        } else {
            this.mm_images = bool2;
        }
        if ((i & 4) == 0) {
            this.web_search = Boolean.TRUE;
        } else {
            this.web_search = bool3;
        }
        if ((i & 8) == 0) {
            this.compass = Boolean.TRUE;
        } else {
            this.compass = bool4;
        }
    }

    public static /* synthetic */ ModelCapabilities copy$default(ModelCapabilities modelCapabilities, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = modelCapabilities.mm_pdf;
        }
        if ((i & 2) != 0) {
            bool2 = modelCapabilities.mm_images;
        }
        if ((i & 4) != 0) {
            bool3 = modelCapabilities.web_search;
        }
        if ((i & 8) != 0) {
            bool4 = modelCapabilities.compass;
        }
        return modelCapabilities.copy(bool, bool2, bool3, bool4);
    }

    public static final /* synthetic */ void write$Self$api(ModelCapabilities self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.mm_pdf, Boolean.TRUE)) {
            output.B(serialDesc, 0, zt1.a, self.mm_pdf);
        }
        if (output.E(serialDesc) || !x44.r(self.mm_images, Boolean.TRUE)) {
            output.B(serialDesc, 1, zt1.a, self.mm_images);
        }
        if (output.E(serialDesc) || !x44.r(self.web_search, Boolean.TRUE)) {
            output.B(serialDesc, 2, zt1.a, self.web_search);
        }
        if (!output.E(serialDesc) && x44.r(self.compass, Boolean.TRUE)) {
            return;
        }
        output.B(serialDesc, 3, zt1.a, self.compass);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getMm_pdf() {
        return this.mm_pdf;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getMm_images() {
        return this.mm_images;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getWeb_search() {
        return this.web_search;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getCompass() {
        return this.compass;
    }

    public final ModelCapabilities copy(Boolean mm_pdf, Boolean mm_images, Boolean web_search, Boolean compass) {
        return new ModelCapabilities(mm_pdf, mm_images, web_search, compass);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelCapabilities)) {
            return false;
        }
        ModelCapabilities modelCapabilities = (ModelCapabilities) other;
        return x44.r(this.mm_pdf, modelCapabilities.mm_pdf) && x44.r(this.mm_images, modelCapabilities.mm_images) && x44.r(this.web_search, modelCapabilities.web_search) && x44.r(this.compass, modelCapabilities.compass);
    }

    public final Boolean getCompass() {
        return this.compass;
    }

    public final Boolean getMm_images() {
        return this.mm_images;
    }

    public final Boolean getMm_pdf() {
        return this.mm_pdf;
    }

    public final Boolean getWeb_search() {
        return this.web_search;
    }

    public int hashCode() {
        Boolean bool = this.mm_pdf;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.mm_images;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.web_search;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.compass;
        return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public String toString() {
        return "ModelCapabilities(mm_pdf=" + this.mm_pdf + ", mm_images=" + this.mm_images + ", web_search=" + this.web_search + ", compass=" + this.compass + ")";
    }

    public ModelCapabilities() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 15, (mq5) null);
    }

    public ModelCapabilities(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.mm_pdf = bool;
        this.mm_images = bool2;
        this.web_search = bool3;
        this.compass = bool4;
    }

    public /* synthetic */ ModelCapabilities(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? Boolean.TRUE : bool, (i & 2) != 0 ? Boolean.TRUE : bool2, (i & 4) != 0 ? Boolean.TRUE : bool3, (i & 8) != 0 ? Boolean.TRUE : bool4);
    }
}
