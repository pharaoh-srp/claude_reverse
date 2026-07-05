package com.anthropic.claude.api.share;

import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.EmailAddress;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ok6;
import defpackage.onf;
import defpackage.qkd;
import defpackage.rkd;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.z7;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J2\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b+\u0010\u0019¨\u0006/"}, d2 = {"Lcom/anthropic/claude/api/share/ProjectCreator;", "", "Lcom/anthropic/claude/types/strings/AccountId;", "uuid", "", "full_name", "Lcom/anthropic/claude/types/strings/EmailAddress;", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/share/ProjectCreator;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-islZJdo", "()Ljava/lang/String;", "component1", "component2", "component3-y5BV4-s", "component3", "copy-MIjcGT8", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/share/ProjectCreator;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid-islZJdo", "getFull_name", "getEmail-y5BV4-s", "Companion", "qkd", "rkd", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProjectCreator {
    public static final int $stable = 0;
    public static final rkd Companion = new rkd();
    private final String email;
    private final String full_name;
    private final String uuid;

    private /* synthetic */ ProjectCreator(int i, String str, String str2, String str3, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, qkd.a.getDescriptor());
            throw null;
        }
        this.uuid = str;
        if ((i & 2) == 0) {
            this.full_name = null;
        } else {
            this.full_name = str2;
        }
        if ((i & 4) == 0) {
            this.email = null;
        } else {
            this.email = str3;
        }
    }

    /* JADX INFO: renamed from: copy-MIjcGT8$default, reason: not valid java name */
    public static /* synthetic */ ProjectCreator m435copyMIjcGT8$default(ProjectCreator projectCreator, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectCreator.uuid;
        }
        if ((i & 2) != 0) {
            str2 = projectCreator.full_name;
        }
        if ((i & 4) != 0) {
            str3 = projectCreator.email;
        }
        return projectCreator.m438copyMIjcGT8(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$api(ProjectCreator self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, z7.a, AccountId.m943boximpl(self.uuid));
        if (output.E(serialDesc) || self.full_name != null) {
            output.B(serialDesc, 1, srg.a, self.full_name);
        }
        if (!output.E(serialDesc) && self.email == null) {
            return;
        }
        ok6 ok6Var = ok6.a;
        String str = self.email;
        output.B(serialDesc, 2, ok6Var, str != null ? EmailAddress.m1006boximpl(str) : null);
    }

    /* JADX INFO: renamed from: component1-islZJdo, reason: not valid java name and from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFull_name() {
        return this.full_name;
    }

    /* JADX INFO: renamed from: component3-y5BV4-s, reason: not valid java name and from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: copy-MIjcGT8, reason: not valid java name */
    public final ProjectCreator m438copyMIjcGT8(String uuid, String full_name, String email) {
        uuid.getClass();
        return new ProjectCreator(uuid, full_name, email, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
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
            boolean r1 = r5 instanceof com.anthropic.claude.api.share.ProjectCreator
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.share.ProjectCreator r5 = (com.anthropic.claude.api.share.ProjectCreator) r5
            java.lang.String r1 = r4.uuid
            java.lang.String r3 = r5.uuid
            boolean r1 = com.anthropic.claude.types.strings.AccountId.m946equalsimpl0(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.full_name
            java.lang.String r3 = r5.full_name
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r4 = r4.email
            java.lang.String r5 = r5.email
            if (r4 != 0) goto L2e
            if (r5 != 0) goto L2c
            r4 = r0
            goto L35
        L2c:
            r4 = r2
            goto L35
        L2e:
            if (r5 != 0) goto L31
            goto L2c
        L31:
            boolean r4 = com.anthropic.claude.types.strings.EmailAddress.m1009equalsimpl0(r4, r5)
        L35:
            if (r4 != 0) goto L38
            return r2
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.share.ProjectCreator.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getEmail-y5BV4-s, reason: not valid java name */
    public final String m439getEmaily5BV4s() {
        return this.email;
    }

    public final String getFull_name() {
        return this.full_name;
    }

    /* JADX INFO: renamed from: getUuid-islZJdo, reason: not valid java name */
    public final String m440getUuidislZJdo() {
        return this.uuid;
    }

    public int hashCode() {
        int iM947hashCodeimpl = AccountId.m947hashCodeimpl(this.uuid) * 31;
        String str = this.full_name;
        int iHashCode = (iM947hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        return iHashCode + (str2 != null ? EmailAddress.m1010hashCodeimpl(str2) : 0);
    }

    public String toString() {
        String strM948toStringimpl = AccountId.m948toStringimpl(this.uuid);
        String str = this.full_name;
        String str2 = this.email;
        return ij0.m(kgh.r("ProjectCreator(uuid=", strM948toStringimpl, ", full_name=", str, ", email="), str2 == null ? "null" : EmailAddress.m1012toStringimpl(str2), ")");
    }

    public /* synthetic */ ProjectCreator(String str, String str2, String str3, mq5 mq5Var) {
        this(str, str2, str3);
    }

    public /* synthetic */ ProjectCreator(int i, String str, String str2, String str3, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, vnfVar);
    }

    private ProjectCreator(String str, String str2, String str3) {
        str.getClass();
        this.uuid = str;
        this.full_name = str2;
        this.email = str3;
    }

    public /* synthetic */ ProjectCreator(String str, String str2, String str3, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, null);
    }
}
