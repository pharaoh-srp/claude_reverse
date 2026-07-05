package com.anthropic.claude.models.organization.configtypes;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.jra;
import defpackage.kgh;
import defpackage.kra;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u00060"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/MapDisplayMarkersItemDescription;", "", "", "description", "label", "latitude", "longitude", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/MapDisplayMarkersItemDescription;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/MapDisplayMarkersItemDescription;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "getLabel", "getLatitude", "getLongitude", "getTitle", "Companion", "jra", "kra", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MapDisplayMarkersItemDescription {
    public static final int $stable = 0;
    public static final kra Companion = new kra();
    private final String description;
    private final String label;
    private final String latitude;
    private final String longitude;
    private final String title;

    public /* synthetic */ MapDisplayMarkersItemDescription(int i, String str, String str2, String str3, String str4, String str5, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, jra.a.getDescriptor());
            throw null;
        }
        this.description = str;
        this.label = str2;
        this.latitude = str3;
        this.longitude = str4;
        this.title = str5;
    }

    public static /* synthetic */ MapDisplayMarkersItemDescription copy$default(MapDisplayMarkersItemDescription mapDisplayMarkersItemDescription, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mapDisplayMarkersItemDescription.description;
        }
        if ((i & 2) != 0) {
            str2 = mapDisplayMarkersItemDescription.label;
        }
        if ((i & 4) != 0) {
            str3 = mapDisplayMarkersItemDescription.latitude;
        }
        if ((i & 8) != 0) {
            str4 = mapDisplayMarkersItemDescription.longitude;
        }
        if ((i & 16) != 0) {
            str5 = mapDisplayMarkersItemDescription.title;
        }
        String str6 = str5;
        String str7 = str3;
        return mapDisplayMarkersItemDescription.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$models(MapDisplayMarkersItemDescription self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.description);
        output.q(serialDesc, 1, self.label);
        output.q(serialDesc, 2, self.latitude);
        output.q(serialDesc, 3, self.longitude);
        output.q(serialDesc, 4, self.title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final MapDisplayMarkersItemDescription copy(String description, String label, String latitude, String longitude, String title) {
        description.getClass();
        label.getClass();
        latitude.getClass();
        longitude.getClass();
        title.getClass();
        return new MapDisplayMarkersItemDescription(description, label, latitude, longitude, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapDisplayMarkersItemDescription)) {
            return false;
        }
        MapDisplayMarkersItemDescription mapDisplayMarkersItemDescription = (MapDisplayMarkersItemDescription) other;
        return x44.r(this.description, mapDisplayMarkersItemDescription.description) && x44.r(this.label, mapDisplayMarkersItemDescription.label) && x44.r(this.latitude, mapDisplayMarkersItemDescription.latitude) && x44.r(this.longitude, mapDisplayMarkersItemDescription.longitude) && x44.r(this.title, mapDisplayMarkersItemDescription.title);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + kgh.l(kgh.l(kgh.l(this.description.hashCode() * 31, 31, this.label), 31, this.latitude), 31, this.longitude);
    }

    public String toString() {
        String str = this.description;
        String str2 = this.label;
        String str3 = this.latitude;
        String str4 = this.longitude;
        String str5 = this.title;
        StringBuilder sbR = kgh.r("MapDisplayMarkersItemDescription(description=", str, ", label=", str2, ", latitude=");
        kgh.u(sbR, str3, ", longitude=", str4, ", title=");
        return ij0.m(sbR, str5, ")");
    }

    public MapDisplayMarkersItemDescription(String str, String str2, String str3, String str4, String str5) {
        y6a.s(str, str2, str3, str4, str5);
        this.description = str;
        this.label = str2;
        this.latitude = str3;
        this.longitude = str4;
        this.title = str5;
    }
}
