package com.anthropic.claude.tool.model;

import defpackage.blc;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.m3d;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.n3d;
import defpackage.o3d;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b.\u0010\u001e¨\u00062"}, d2 = {"Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputDaysItem;", "", "", "day_number", "", "Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputDaysItemLocationsItem;", "locations", "", "narrative", "title", "<init>", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputDaysItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "copy", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputDaysItem;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getDay_number", "Ljava/util/List;", "getLocations", "Ljava/lang/String;", "getNarrative", "getTitle", "Companion", "m3d", "n3d", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PlacesMapDisplayV0InputDaysItem {
    private final int day_number;
    private final List<PlacesMapDisplayV0InputDaysItemLocationsItem> locations;
    private final String narrative;
    private final String title;
    public static final n3d Companion = new n3d();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new blc(17)), null, null};

    public /* synthetic */ PlacesMapDisplayV0InputDaysItem(int i, int i2, List list, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, m3d.a.getDescriptor());
            throw null;
        }
        this.day_number = i2;
        this.locations = list;
        if ((i & 4) == 0) {
            this.narrative = null;
        } else {
            this.narrative = str;
        }
        if ((i & 8) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(o3d.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlacesMapDisplayV0InputDaysItem copy$default(PlacesMapDisplayV0InputDaysItem placesMapDisplayV0InputDaysItem, int i, List list, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = placesMapDisplayV0InputDaysItem.day_number;
        }
        if ((i2 & 2) != 0) {
            list = placesMapDisplayV0InputDaysItem.locations;
        }
        if ((i2 & 4) != 0) {
            str = placesMapDisplayV0InputDaysItem.narrative;
        }
        if ((i2 & 8) != 0) {
            str2 = placesMapDisplayV0InputDaysItem.title;
        }
        return placesMapDisplayV0InputDaysItem.copy(i, list, str, str2);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(PlacesMapDisplayV0InputDaysItem self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.l(0, self.day_number, serialDesc);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.locations);
        if (output.E(serialDesc) || self.narrative != null) {
            output.B(serialDesc, 2, srg.a, self.narrative);
        }
        if (!output.E(serialDesc) && self.title == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDay_number() {
        return this.day_number;
    }

    public final List<PlacesMapDisplayV0InputDaysItemLocationsItem> component2() {
        return this.locations;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNarrative() {
        return this.narrative;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final PlacesMapDisplayV0InputDaysItem copy(int day_number, List<PlacesMapDisplayV0InputDaysItemLocationsItem> locations, String narrative, String title) {
        locations.getClass();
        return new PlacesMapDisplayV0InputDaysItem(day_number, locations, narrative, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlacesMapDisplayV0InputDaysItem)) {
            return false;
        }
        PlacesMapDisplayV0InputDaysItem placesMapDisplayV0InputDaysItem = (PlacesMapDisplayV0InputDaysItem) other;
        return this.day_number == placesMapDisplayV0InputDaysItem.day_number && x44.r(this.locations, placesMapDisplayV0InputDaysItem.locations) && x44.r(this.narrative, placesMapDisplayV0InputDaysItem.narrative) && x44.r(this.title, placesMapDisplayV0InputDaysItem.title);
    }

    public final int getDay_number() {
        return this.day_number;
    }

    public final List<PlacesMapDisplayV0InputDaysItemLocationsItem> getLocations() {
        return this.locations;
    }

    public final String getNarrative() {
        return this.narrative;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM = kgh.m(Integer.hashCode(this.day_number) * 31, 31, this.locations);
        String str = this.narrative;
        int iHashCode = (iM + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = this.day_number;
        List<PlacesMapDisplayV0InputDaysItemLocationsItem> list = this.locations;
        String str = this.narrative;
        String str2 = this.title;
        StringBuilder sb = new StringBuilder("PlacesMapDisplayV0InputDaysItem(day_number=");
        sb.append(i);
        sb.append(", locations=");
        sb.append(list);
        sb.append(", narrative=");
        return vb7.t(sb, str, ", title=", str2, ")");
    }

    public PlacesMapDisplayV0InputDaysItem(int i, List<PlacesMapDisplayV0InputDaysItemLocationsItem> list, String str, String str2) {
        list.getClass();
        this.day_number = i;
        this.locations = list;
        this.narrative = str;
        this.title = str2;
    }

    public /* synthetic */ PlacesMapDisplayV0InputDaysItem(int i, List list, String str, String str2, int i2, mq5 mq5Var) {
        this(i, list, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2);
    }
}
