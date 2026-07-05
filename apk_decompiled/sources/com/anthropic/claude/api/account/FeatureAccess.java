package com.anthropic.claude.api.account;

import defpackage.gvj;
import defpackage.lf7;
import defpackage.mdj;
import defpackage.mf7;
import defpackage.onf;
import defpackage.tf7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/api/account/FeatureAccess;", "", "", "feature", "Lcom/anthropic/claude/api/account/FeatureAccessStatus;", "status", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/account/FeatureAccessStatus;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/account/FeatureAccessStatus;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/FeatureAccess;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/api/account/FeatureAccessStatus;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/api/account/FeatureAccessStatus;)Lcom/anthropic/claude/api/account/FeatureAccess;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFeature", "Lcom/anthropic/claude/api/account/FeatureAccessStatus;", "getStatus", "Companion", "lf7", "mf7", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class FeatureAccess {
    public static final int $stable = 0;
    public static final mf7 Companion = new mf7();
    private final String feature;
    private final FeatureAccessStatus status;

    public /* synthetic */ FeatureAccess(int i, String str, FeatureAccessStatus featureAccessStatus, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, lf7.a.getDescriptor());
            throw null;
        }
        this.feature = str;
        this.status = featureAccessStatus;
    }

    public static /* synthetic */ FeatureAccess copy$default(FeatureAccess featureAccess, String str, FeatureAccessStatus featureAccessStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = featureAccess.feature;
        }
        if ((i & 2) != 0) {
            featureAccessStatus = featureAccess.status;
        }
        return featureAccess.copy(str, featureAccessStatus);
    }

    public static final /* synthetic */ void write$Self$api(FeatureAccess self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.feature);
        output.r(serialDesc, 1, tf7.d, self.status);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFeature() {
        return this.feature;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FeatureAccessStatus getStatus() {
        return this.status;
    }

    public final FeatureAccess copy(String feature, FeatureAccessStatus status) {
        feature.getClass();
        status.getClass();
        return new FeatureAccess(feature, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureAccess)) {
            return false;
        }
        FeatureAccess featureAccess = (FeatureAccess) other;
        return x44.r(this.feature, featureAccess.feature) && this.status == featureAccess.status;
    }

    public final String getFeature() {
        return this.feature;
    }

    public final FeatureAccessStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + (this.feature.hashCode() * 31);
    }

    public String toString() {
        return "FeatureAccess(feature=" + this.feature + ", status=" + this.status + ")";
    }

    public FeatureAccess(String str, FeatureAccessStatus featureAccessStatus) {
        str.getClass();
        featureAccessStatus.getClass();
        this.feature = str;
        this.status = featureAccessStatus;
    }
}
