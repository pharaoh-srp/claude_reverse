package com.anthropic.claude.tool.model;

import defpackage.fsh;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.q3d;
import defpackage.r3d;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ^\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b2\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b5\u0010\u001c¨\u00069"}, d2 = {"Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputLocationsItem;", "", "", "address", "arrival_time", "", "latitude", "longitude", "name", "notes", "place_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputLocationsItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()D", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputLocationsItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAddress", "getArrival_time", "D", "getLatitude", "getLongitude", "getName", "getNotes", "getPlace_id", "Companion", "q3d", "r3d", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PlacesMapDisplayV0InputLocationsItem {
    public static final r3d Companion = new r3d();
    private final String address;
    private final String arrival_time;
    private final double latitude;
    private final double longitude;
    private final String name;
    private final String notes;
    private final String place_id;

    public /* synthetic */ PlacesMapDisplayV0InputLocationsItem(int i, String str, String str2, double d, double d2, String str3, String str4, String str5, vnf vnfVar) {
        if (28 != (i & 28)) {
            gvj.f(i, 28, q3d.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.address = null;
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.arrival_time = null;
        } else {
            this.arrival_time = str2;
        }
        this.latitude = d;
        this.longitude = d2;
        this.name = str3;
        if ((i & 32) == 0) {
            this.notes = null;
        } else {
            this.notes = str4;
        }
        if ((i & 64) == 0) {
            this.place_id = null;
        } else {
            this.place_id = str5;
        }
    }

    public static /* synthetic */ PlacesMapDisplayV0InputLocationsItem copy$default(PlacesMapDisplayV0InputLocationsItem placesMapDisplayV0InputLocationsItem, String str, String str2, double d, double d2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = placesMapDisplayV0InputLocationsItem.address;
        }
        if ((i & 2) != 0) {
            str2 = placesMapDisplayV0InputLocationsItem.arrival_time;
        }
        if ((i & 4) != 0) {
            d = placesMapDisplayV0InputLocationsItem.latitude;
        }
        if ((i & 8) != 0) {
            d2 = placesMapDisplayV0InputLocationsItem.longitude;
        }
        if ((i & 16) != 0) {
            str3 = placesMapDisplayV0InputLocationsItem.name;
        }
        if ((i & 32) != 0) {
            str4 = placesMapDisplayV0InputLocationsItem.notes;
        }
        if ((i & 64) != 0) {
            str5 = placesMapDisplayV0InputLocationsItem.place_id;
        }
        String str6 = str5;
        String str7 = str3;
        double d3 = d2;
        double d4 = d;
        return placesMapDisplayV0InputLocationsItem.copy(str, str2, d4, d3, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(PlacesMapDisplayV0InputLocationsItem self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.address != null) {
            output.B(serialDesc, 0, srg.a, self.address);
        }
        if (output.E(serialDesc) || self.arrival_time != null) {
            output.B(serialDesc, 1, srg.a, self.arrival_time);
        }
        output.z(serialDesc, 2, self.latitude);
        output.z(serialDesc, 3, self.longitude);
        output.q(serialDesc, 4, self.name);
        if (output.E(serialDesc) || self.notes != null) {
            output.B(serialDesc, 5, srg.a, self.notes);
        }
        if (!output.E(serialDesc) && self.place_id == null) {
            return;
        }
        output.B(serialDesc, 6, srg.a, self.place_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getArrival_time() {
        return this.arrival_time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPlace_id() {
        return this.place_id;
    }

    public final PlacesMapDisplayV0InputLocationsItem copy(String address, String arrival_time, double latitude, double longitude, String name, String notes, String place_id) {
        name.getClass();
        return new PlacesMapDisplayV0InputLocationsItem(address, arrival_time, latitude, longitude, name, notes, place_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlacesMapDisplayV0InputLocationsItem)) {
            return false;
        }
        PlacesMapDisplayV0InputLocationsItem placesMapDisplayV0InputLocationsItem = (PlacesMapDisplayV0InputLocationsItem) other;
        return x44.r(this.address, placesMapDisplayV0InputLocationsItem.address) && x44.r(this.arrival_time, placesMapDisplayV0InputLocationsItem.arrival_time) && Double.compare(this.latitude, placesMapDisplayV0InputLocationsItem.latitude) == 0 && Double.compare(this.longitude, placesMapDisplayV0InputLocationsItem.longitude) == 0 && x44.r(this.name, placesMapDisplayV0InputLocationsItem.name) && x44.r(this.notes, placesMapDisplayV0InputLocationsItem.notes) && x44.r(this.place_id, placesMapDisplayV0InputLocationsItem.place_id);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getArrival_time() {
        return this.arrival_time;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getPlace_id() {
        return this.place_id;
    }

    public int hashCode() {
        String str = this.address;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.arrival_time;
        int iL = kgh.l(fsh.o(this.longitude, fsh.o(this.latitude, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.name);
        String str3 = this.notes;
        int iHashCode2 = (iL + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.place_id;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.address;
        String str2 = this.arrival_time;
        double d = this.latitude;
        double d2 = this.longitude;
        String str3 = this.name;
        String str4 = this.notes;
        String str5 = this.place_id;
        StringBuilder sbR = kgh.r("PlacesMapDisplayV0InputLocationsItem(address=", str, ", arrival_time=", str2, ", latitude=");
        sbR.append(d);
        sbR.append(", longitude=");
        sbR.append(d2);
        sbR.append(", name=");
        kgh.u(sbR, str3, ", notes=", str4, ", place_id=");
        return ij0.m(sbR, str5, ")");
    }

    public PlacesMapDisplayV0InputLocationsItem(String str, String str2, double d, double d2, String str3, String str4, String str5) {
        str3.getClass();
        this.address = str;
        this.arrival_time = str2;
        this.latitude = d;
        this.longitude = d2;
        this.name = str3;
        this.notes = str4;
        this.place_id = str5;
    }

    public /* synthetic */ PlacesMapDisplayV0InputLocationsItem(String str, String str2, double d, double d2, String str3, String str4, String str5, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, d, d2, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
    }
}
