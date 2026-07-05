package com.anthropic.claude.tool.model;

import defpackage.fsh;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.na6;
import defpackage.onf;
import defpackage.rni;
import defpackage.sni;
import defpackage.tni;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ<\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b1\u0010\u001d¨\u00065"}, d2 = {"Lcom/anthropic/claude/tool/model/UserLocationV0OutputUserLocationResult;", "Lcom/anthropic/claude/tool/model/UserLocationV0Output;", "", "accuracy", "Lcom/anthropic/claude/tool/model/UserLocationV0OutputUserLocationResultGeocoded;", "geocoded", "latitude", "longitude", "<init>", "(Ljava/lang/Double;Lcom/anthropic/claude/tool/model/UserLocationV0OutputUserLocationResultGeocoded;DD)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Double;Lcom/anthropic/claude/tool/model/UserLocationV0OutputUserLocationResultGeocoded;DDLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/UserLocationV0OutputUserLocationResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Double;", "component2", "()Lcom/anthropic/claude/tool/model/UserLocationV0OutputUserLocationResultGeocoded;", "component3", "()D", "component4", "copy", "(Ljava/lang/Double;Lcom/anthropic/claude/tool/model/UserLocationV0OutputUserLocationResultGeocoded;DD)Lcom/anthropic/claude/tool/model/UserLocationV0OutputUserLocationResult;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getAccuracy", "Lcom/anthropic/claude/tool/model/UserLocationV0OutputUserLocationResultGeocoded;", "getGeocoded", "D", "getLatitude", "getLongitude", "Companion", "rni", "sni", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UserLocationV0OutputUserLocationResult implements UserLocationV0Output {
    public static final sni Companion = new sni();
    private final Double accuracy;
    private final UserLocationV0OutputUserLocationResultGeocoded geocoded;
    private final double latitude;
    private final double longitude;

    public /* synthetic */ UserLocationV0OutputUserLocationResult(int i, Double d, UserLocationV0OutputUserLocationResultGeocoded userLocationV0OutputUserLocationResultGeocoded, double d2, double d3, vnf vnfVar) {
        if (12 != (i & 12)) {
            gvj.f(i, 12, rni.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.accuracy = null;
        } else {
            this.accuracy = d;
        }
        if ((i & 2) == 0) {
            this.geocoded = null;
        } else {
            this.geocoded = userLocationV0OutputUserLocationResultGeocoded;
        }
        this.latitude = d2;
        this.longitude = d3;
    }

    public static /* synthetic */ UserLocationV0OutputUserLocationResult copy$default(UserLocationV0OutputUserLocationResult userLocationV0OutputUserLocationResult, Double d, UserLocationV0OutputUserLocationResultGeocoded userLocationV0OutputUserLocationResultGeocoded, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = userLocationV0OutputUserLocationResult.accuracy;
        }
        if ((i & 2) != 0) {
            userLocationV0OutputUserLocationResultGeocoded = userLocationV0OutputUserLocationResult.geocoded;
        }
        if ((i & 4) != 0) {
            d2 = userLocationV0OutputUserLocationResult.latitude;
        }
        if ((i & 8) != 0) {
            d3 = userLocationV0OutputUserLocationResult.longitude;
        }
        double d4 = d3;
        return userLocationV0OutputUserLocationResult.copy(d, userLocationV0OutputUserLocationResultGeocoded, d2, d4);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(UserLocationV0OutputUserLocationResult self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.accuracy != null) {
            output.B(serialDesc, 0, na6.a, self.accuracy);
        }
        if (output.E(serialDesc) || self.geocoded != null) {
            output.B(serialDesc, 1, tni.a, self.geocoded);
        }
        output.z(serialDesc, 2, self.latitude);
        output.z(serialDesc, 3, self.longitude);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getAccuracy() {
        return this.accuracy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UserLocationV0OutputUserLocationResultGeocoded getGeocoded() {
        return this.geocoded;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    public final UserLocationV0OutputUserLocationResult copy(Double accuracy, UserLocationV0OutputUserLocationResultGeocoded geocoded, double latitude, double longitude) {
        return new UserLocationV0OutputUserLocationResult(accuracy, geocoded, latitude, longitude);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserLocationV0OutputUserLocationResult)) {
            return false;
        }
        UserLocationV0OutputUserLocationResult userLocationV0OutputUserLocationResult = (UserLocationV0OutputUserLocationResult) other;
        return x44.r(this.accuracy, userLocationV0OutputUserLocationResult.accuracy) && x44.r(this.geocoded, userLocationV0OutputUserLocationResult.geocoded) && Double.compare(this.latitude, userLocationV0OutputUserLocationResult.latitude) == 0 && Double.compare(this.longitude, userLocationV0OutputUserLocationResult.longitude) == 0;
    }

    public final Double getAccuracy() {
        return this.accuracy;
    }

    public final UserLocationV0OutputUserLocationResultGeocoded getGeocoded() {
        return this.geocoded;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        Double d = this.accuracy;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        UserLocationV0OutputUserLocationResultGeocoded userLocationV0OutputUserLocationResultGeocoded = this.geocoded;
        return Double.hashCode(this.longitude) + fsh.o(this.latitude, (iHashCode + (userLocationV0OutputUserLocationResultGeocoded != null ? userLocationV0OutputUserLocationResultGeocoded.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        return "UserLocationV0OutputUserLocationResult(accuracy=" + this.accuracy + ", geocoded=" + this.geocoded + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }

    public UserLocationV0OutputUserLocationResult(Double d, UserLocationV0OutputUserLocationResultGeocoded userLocationV0OutputUserLocationResultGeocoded, double d2, double d3) {
        this.accuracy = d;
        this.geocoded = userLocationV0OutputUserLocationResultGeocoded;
        this.latitude = d2;
        this.longitude = d3;
    }

    public /* synthetic */ UserLocationV0OutputUserLocationResult(Double d, UserLocationV0OutputUserLocationResultGeocoded userLocationV0OutputUserLocationResultGeocoded, double d2, double d3, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : userLocationV0OutputUserLocationResultGeocoded, d2, d3);
    }
}
