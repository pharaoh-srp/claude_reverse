package com.anthropic.claude.api.account;

import defpackage.du1;
import defpackage.k7;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.sd8;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Lcom/anthropic/claude/api/account/BootstrapResponse;", "", "Lcom/anthropic/claude/api/account/Account;", "account", "Lcom/anthropic/claude/api/account/GrowthBookSchema;", "growthbook", "<init>", "(Lcom/anthropic/claude/api/account/Account;Lcom/anthropic/claude/api/account/GrowthBookSchema;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/account/Account;Lcom/anthropic/claude/api/account/GrowthBookSchema;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/BootstrapResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/account/Account;", "component2", "()Lcom/anthropic/claude/api/account/GrowthBookSchema;", "copy", "(Lcom/anthropic/claude/api/account/Account;Lcom/anthropic/claude/api/account/GrowthBookSchema;)Lcom/anthropic/claude/api/account/BootstrapResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/account/Account;", "getAccount", "Lcom/anthropic/claude/api/account/GrowthBookSchema;", "getGrowthbook", "Companion", "cu1", "du1", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class BootstrapResponse {
    public static final int $stable = 0;
    public static final du1 Companion = new du1();
    private final Account account;
    private final GrowthBookSchema growthbook;

    public /* synthetic */ BootstrapResponse(int i, Account account, GrowthBookSchema growthBookSchema, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.account = null;
        } else {
            this.account = account;
        }
        if ((i & 2) == 0) {
            this.growthbook = null;
        } else {
            this.growthbook = growthBookSchema;
        }
    }

    public static /* synthetic */ BootstrapResponse copy$default(BootstrapResponse bootstrapResponse, Account account, GrowthBookSchema growthBookSchema, int i, Object obj) {
        if ((i & 1) != 0) {
            account = bootstrapResponse.account;
        }
        if ((i & 2) != 0) {
            growthBookSchema = bootstrapResponse.growthbook;
        }
        return bootstrapResponse.copy(account, growthBookSchema);
    }

    public static final /* synthetic */ void write$Self$api(BootstrapResponse self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.account != null) {
            output.B(serialDesc, 0, k7.a, self.account);
        }
        if (!output.E(serialDesc) && self.growthbook == null) {
            return;
        }
        output.B(serialDesc, 1, sd8.a, self.growthbook);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GrowthBookSchema getGrowthbook() {
        return this.growthbook;
    }

    public final BootstrapResponse copy(Account account, GrowthBookSchema growthbook) {
        return new BootstrapResponse(account, growthbook);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BootstrapResponse)) {
            return false;
        }
        BootstrapResponse bootstrapResponse = (BootstrapResponse) other;
        return x44.r(this.account, bootstrapResponse.account) && x44.r(this.growthbook, bootstrapResponse.growthbook);
    }

    public final Account getAccount() {
        return this.account;
    }

    public final GrowthBookSchema getGrowthbook() {
        return this.growthbook;
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        GrowthBookSchema growthBookSchema = this.growthbook;
        return iHashCode + (growthBookSchema != null ? growthBookSchema.hashCode() : 0);
    }

    public String toString() {
        return "BootstrapResponse(account=" + this.account + ", growthbook=" + this.growthbook + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BootstrapResponse() {
        this((Account) null, (GrowthBookSchema) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public BootstrapResponse(Account account, GrowthBookSchema growthBookSchema) {
        this.account = account;
        this.growthbook = growthBookSchema;
    }

    public /* synthetic */ BootstrapResponse(Account account, GrowthBookSchema growthBookSchema, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : account, (i & 2) != 0 ? null : growthBookSchema);
    }
}
