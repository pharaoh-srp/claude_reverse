package com.anthropic.claude.api.tasks;

import com.anthropic.claude.types.strings.ModelId;
import defpackage.bsg;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vn0;
import defpackage.vnb;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J4\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b)\u0010\u0018R\u0011\u0010*\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/anthropic/claude/api/tasks/ApproveTaskAgentOverrides;", "", "Lcom/anthropic/claude/types/strings/ModelId;", "model", "", "speed", "system", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/tasks/ApproveTaskAgentOverrides;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-a6HIKFk", "()Ljava/lang/String;", "component1", "component2", "component3", "copy-fDb4eFc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/tasks/ApproveTaskAgentOverrides;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getModel-a6HIKFk", "getSpeed", "getSystem", "isEmpty", "()Z", "Companion", "un0", "vn0", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ApproveTaskAgentOverrides {
    public static final int $stable = 0;
    public static final vn0 Companion = new vn0();
    private final String model;
    private final String speed;
    private final String system;

    private /* synthetic */ ApproveTaskAgentOverrides(int i, String str, String str2, String str3, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.model = null;
        } else {
            this.model = str;
        }
        if ((i & 2) == 0) {
            this.speed = null;
        } else {
            this.speed = str2;
        }
        if ((i & 4) == 0) {
            this.system = null;
        } else {
            this.system = str3;
        }
    }

    /* JADX INFO: renamed from: copy-fDb4eFc$default, reason: not valid java name */
    public static /* synthetic */ ApproveTaskAgentOverrides m441copyfDb4eFc$default(ApproveTaskAgentOverrides approveTaskAgentOverrides, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approveTaskAgentOverrides.model;
        }
        if ((i & 2) != 0) {
            str2 = approveTaskAgentOverrides.speed;
        }
        if ((i & 4) != 0) {
            str3 = approveTaskAgentOverrides.system;
        }
        return approveTaskAgentOverrides.m443copyfDb4eFc(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$api(ApproveTaskAgentOverrides self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.model != null) {
            vnb vnbVar = vnb.a;
            String str = self.model;
            output.B(serialDesc, 0, vnbVar, str != null ? ModelId.m1058boximpl(str) : null);
        }
        if (output.E(serialDesc) || self.speed != null) {
            output.B(serialDesc, 1, srg.a, self.speed);
        }
        if (!output.E(serialDesc) && self.system == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.system);
    }

    /* JADX INFO: renamed from: component1-a6HIKFk, reason: not valid java name and from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSpeed() {
        return this.speed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSystem() {
        return this.system;
    }

    /* JADX INFO: renamed from: copy-fDb4eFc, reason: not valid java name */
    public final ApproveTaskAgentOverrides m443copyfDb4eFc(String model, String speed, String system) {
        return new ApproveTaskAgentOverrides(model, speed, system, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.anthropic.claude.api.tasks.ApproveTaskAgentOverrides
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.tasks.ApproveTaskAgentOverrides r5 = (com.anthropic.claude.api.tasks.ApproveTaskAgentOverrides) r5
            java.lang.String r1 = r4.model
            java.lang.String r3 = r5.model
            if (r1 != 0) goto L18
            if (r3 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r3 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = com.anthropic.claude.types.strings.ModelId.m1061equalsimpl0(r1, r3)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.speed
            java.lang.String r3 = r5.speed
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r4 = r4.system
            java.lang.String r5 = r5.system
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L38
            return r2
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.tasks.ApproveTaskAgentOverrides.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getModel-a6HIKFk, reason: not valid java name */
    public final String m444getModela6HIKFk() {
        return this.model;
    }

    public final String getSpeed() {
        return this.speed;
    }

    public final String getSystem() {
        return this.system;
    }

    public int hashCode() {
        String str = this.model;
        int iM1062hashCodeimpl = (str == null ? 0 : ModelId.m1062hashCodeimpl(str)) * 31;
        String str2 = this.speed;
        int iHashCode = (iM1062hashCodeimpl + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.system;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isEmpty() {
        if (this.model != null || this.speed != null) {
            return false;
        }
        String str = this.system;
        return str == null || bsg.I0(str);
    }

    public String toString() {
        String str = this.model;
        return ij0.m(kgh.r("ApproveTaskAgentOverrides(model=", str == null ? "null" : ModelId.m1063toStringimpl(str), ", speed=", this.speed, ", system="), this.system, ")");
    }

    public /* synthetic */ ApproveTaskAgentOverrides(String str, String str2, String str3, mq5 mq5Var) {
        this(str, str2, str3);
    }

    public /* synthetic */ ApproveTaskAgentOverrides(int i, String str, String str2, String str3, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, vnfVar);
    }

    private ApproveTaskAgentOverrides(String str, String str2, String str3) {
        this.model = str;
        this.speed = str2;
        this.system = str3;
    }

    public /* synthetic */ ApproveTaskAgentOverrides(String str, String str2, String str3, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, null);
    }
}
