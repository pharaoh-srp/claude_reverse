package com.anthropic.claude.api.project;

import com.anthropic.claude.types.strings.AccountId;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kkd;
import defpackage.lkd;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.z7;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J&\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Lcom/anthropic/claude/api/project/ProjectActorAccount;", "", "Lcom/anthropic/claude/types/strings/AccountId;", "uuid", "", "full_name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/project/ProjectActorAccount;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-islZJdo", "()Ljava/lang/String;", "component1", "component2", "copy-6u-nsA8", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/project/ProjectActorAccount;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid-islZJdo", "getFull_name", "Companion", "kkd", "lkd", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProjectActorAccount {
    public static final int $stable = 0;
    public static final lkd Companion = new lkd();
    private final String full_name;
    private final String uuid;

    private /* synthetic */ ProjectActorAccount(int i, String str, String str2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, kkd.a.getDescriptor());
            throw null;
        }
        this.uuid = str;
        if ((i & 2) == 0) {
            this.full_name = null;
        } else {
            this.full_name = str2;
        }
    }

    /* JADX INFO: renamed from: copy-6u-nsA8$default, reason: not valid java name */
    public static /* synthetic */ ProjectActorAccount m405copy6unsA8$default(ProjectActorAccount projectActorAccount, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectActorAccount.uuid;
        }
        if ((i & 2) != 0) {
            str2 = projectActorAccount.full_name;
        }
        return projectActorAccount.m407copy6unsA8(str, str2);
    }

    public static final /* synthetic */ void write$Self$api(ProjectActorAccount self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, z7.a, AccountId.m943boximpl(self.uuid));
        if (!output.E(serialDesc) && self.full_name == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.full_name);
    }

    /* JADX INFO: renamed from: component1-islZJdo, reason: not valid java name and from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFull_name() {
        return this.full_name;
    }

    /* JADX INFO: renamed from: copy-6u-nsA8, reason: not valid java name */
    public final ProjectActorAccount m407copy6unsA8(String uuid, String full_name) {
        uuid.getClass();
        return new ProjectActorAccount(uuid, full_name, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectActorAccount)) {
            return false;
        }
        ProjectActorAccount projectActorAccount = (ProjectActorAccount) other;
        return AccountId.m946equalsimpl0(this.uuid, projectActorAccount.uuid) && x44.r(this.full_name, projectActorAccount.full_name);
    }

    public final String getFull_name() {
        return this.full_name;
    }

    /* JADX INFO: renamed from: getUuid-islZJdo, reason: not valid java name */
    public final String m408getUuidislZJdo() {
        return this.uuid;
    }

    public int hashCode() {
        int iM947hashCodeimpl = AccountId.m947hashCodeimpl(this.uuid) * 31;
        String str = this.full_name;
        return iM947hashCodeimpl + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return ij0.l("ProjectActorAccount(uuid=", AccountId.m948toStringimpl(this.uuid), ", full_name=", this.full_name, ")");
    }

    public /* synthetic */ ProjectActorAccount(String str, String str2, mq5 mq5Var) {
        this(str, str2);
    }

    public /* synthetic */ ProjectActorAccount(int i, String str, String str2, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, vnfVar);
    }

    private ProjectActorAccount(String str, String str2) {
        str.getClass();
        this.uuid = str;
        this.full_name = str2;
    }

    public /* synthetic */ ProjectActorAccount(String str, String str2, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, null);
    }
}
