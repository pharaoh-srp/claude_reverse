package com.anthropic.claude.tool.model;

import defpackage.kw9;
import defpackage.l3d;
import defpackage.m3d;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.oob;
import defpackage.q3d;
import defpackage.srg;
import defpackage.t3d;
import defpackage.uo0;
import defpackage.v3d;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABBg\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bm\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010&J\u0012\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+Jp\u0010,\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b.\u0010&J\u0010\u0010/\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b5\u0010!R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b6\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b=\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010+¨\u0006C"}, d2 = {"Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0Input;", "", "", "Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputDaysItem;", "days", "Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputLocationsItem;", "locations", "Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputMode;", "mode", "", "narrative", "", "show_route", "title", "Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputTravelMode;", "travel_mode", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputMode;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputTravelMode;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputMode;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputTravelMode;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0Input;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "()Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputMode;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "()Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputTravelMode;", "copy", "(Ljava/util/List;Ljava/util/List;Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputMode;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputTravelMode;)Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0Input;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDays", "getLocations", "Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputMode;", "getMode", "Ljava/lang/String;", "getNarrative", "Ljava/lang/Boolean;", "getShow_route", "getTitle", "Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputTravelMode;", "getTravel_mode", "Companion", "k3d", "l3d", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PlacesMapDisplayV0Input {
    private static final kw9[] $childSerializers;
    public static final l3d Companion = new l3d();
    private final List<PlacesMapDisplayV0InputDaysItem> days;
    private final List<PlacesMapDisplayV0InputLocationsItem> locations;
    private final PlacesMapDisplayV0InputMode mode;
    private final String narrative;
    private final Boolean show_route;
    private final String title;
    private final PlacesMapDisplayV0InputTravelMode travel_mode;

    static {
        oob oobVar = new oob(25);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, oobVar), yb5.w(w1aVar, new oob(26)), null, null, null, null, null};
    }

    public /* synthetic */ PlacesMapDisplayV0Input(int i, List list, List list2, PlacesMapDisplayV0InputMode placesMapDisplayV0InputMode, String str, Boolean bool, String str2, PlacesMapDisplayV0InputTravelMode placesMapDisplayV0InputTravelMode, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.days = null;
        } else {
            this.days = list;
        }
        if ((i & 2) == 0) {
            this.locations = null;
        } else {
            this.locations = list2;
        }
        if ((i & 4) == 0) {
            this.mode = null;
        } else {
            this.mode = placesMapDisplayV0InputMode;
        }
        if ((i & 8) == 0) {
            this.narrative = null;
        } else {
            this.narrative = str;
        }
        if ((i & 16) == 0) {
            this.show_route = null;
        } else {
            this.show_route = bool;
        }
        if ((i & 32) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 64) == 0) {
            this.travel_mode = null;
        } else {
            this.travel_mode = placesMapDisplayV0InputTravelMode;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(m3d.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(q3d.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlacesMapDisplayV0Input copy$default(PlacesMapDisplayV0Input placesMapDisplayV0Input, List list, List list2, PlacesMapDisplayV0InputMode placesMapDisplayV0InputMode, String str, Boolean bool, String str2, PlacesMapDisplayV0InputTravelMode placesMapDisplayV0InputTravelMode, int i, Object obj) {
        if ((i & 1) != 0) {
            list = placesMapDisplayV0Input.days;
        }
        if ((i & 2) != 0) {
            list2 = placesMapDisplayV0Input.locations;
        }
        if ((i & 4) != 0) {
            placesMapDisplayV0InputMode = placesMapDisplayV0Input.mode;
        }
        if ((i & 8) != 0) {
            str = placesMapDisplayV0Input.narrative;
        }
        if ((i & 16) != 0) {
            bool = placesMapDisplayV0Input.show_route;
        }
        if ((i & 32) != 0) {
            str2 = placesMapDisplayV0Input.title;
        }
        if ((i & 64) != 0) {
            placesMapDisplayV0InputTravelMode = placesMapDisplayV0Input.travel_mode;
        }
        String str3 = str2;
        PlacesMapDisplayV0InputTravelMode placesMapDisplayV0InputTravelMode2 = placesMapDisplayV0InputTravelMode;
        Boolean bool2 = bool;
        PlacesMapDisplayV0InputMode placesMapDisplayV0InputMode2 = placesMapDisplayV0InputMode;
        return placesMapDisplayV0Input.copy(list, list2, placesMapDisplayV0InputMode2, str, bool2, str3, placesMapDisplayV0InputTravelMode2);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(PlacesMapDisplayV0Input self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.days != null) {
            output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.days);
        }
        if (output.E(serialDesc) || self.locations != null) {
            output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.locations);
        }
        if (output.E(serialDesc) || self.mode != null) {
            output.B(serialDesc, 2, t3d.d, self.mode);
        }
        if (output.E(serialDesc) || self.narrative != null) {
            output.B(serialDesc, 3, srg.a, self.narrative);
        }
        if (output.E(serialDesc) || self.show_route != null) {
            output.B(serialDesc, 4, zt1.a, self.show_route);
        }
        if (output.E(serialDesc) || self.title != null) {
            output.B(serialDesc, 5, srg.a, self.title);
        }
        if (!output.E(serialDesc) && self.travel_mode == null) {
            return;
        }
        output.B(serialDesc, 6, v3d.d, self.travel_mode);
    }

    public final List<PlacesMapDisplayV0InputDaysItem> component1() {
        return this.days;
    }

    public final List<PlacesMapDisplayV0InputLocationsItem> component2() {
        return this.locations;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PlacesMapDisplayV0InputMode getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNarrative() {
        return this.narrative;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getShow_route() {
        return this.show_route;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PlacesMapDisplayV0InputTravelMode getTravel_mode() {
        return this.travel_mode;
    }

    public final PlacesMapDisplayV0Input copy(List<PlacesMapDisplayV0InputDaysItem> days, List<PlacesMapDisplayV0InputLocationsItem> locations, PlacesMapDisplayV0InputMode mode, String narrative, Boolean show_route, String title, PlacesMapDisplayV0InputTravelMode travel_mode) {
        return new PlacesMapDisplayV0Input(days, locations, mode, narrative, show_route, title, travel_mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlacesMapDisplayV0Input)) {
            return false;
        }
        PlacesMapDisplayV0Input placesMapDisplayV0Input = (PlacesMapDisplayV0Input) other;
        return x44.r(this.days, placesMapDisplayV0Input.days) && x44.r(this.locations, placesMapDisplayV0Input.locations) && this.mode == placesMapDisplayV0Input.mode && x44.r(this.narrative, placesMapDisplayV0Input.narrative) && x44.r(this.show_route, placesMapDisplayV0Input.show_route) && x44.r(this.title, placesMapDisplayV0Input.title) && this.travel_mode == placesMapDisplayV0Input.travel_mode;
    }

    public final List<PlacesMapDisplayV0InputDaysItem> getDays() {
        return this.days;
    }

    public final List<PlacesMapDisplayV0InputLocationsItem> getLocations() {
        return this.locations;
    }

    public final PlacesMapDisplayV0InputMode getMode() {
        return this.mode;
    }

    public final String getNarrative() {
        return this.narrative;
    }

    public final Boolean getShow_route() {
        return this.show_route;
    }

    public final String getTitle() {
        return this.title;
    }

    public final PlacesMapDisplayV0InputTravelMode getTravel_mode() {
        return this.travel_mode;
    }

    public int hashCode() {
        List<PlacesMapDisplayV0InputDaysItem> list = this.days;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<PlacesMapDisplayV0InputLocationsItem> list2 = this.locations;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        PlacesMapDisplayV0InputMode placesMapDisplayV0InputMode = this.mode;
        int iHashCode3 = (iHashCode2 + (placesMapDisplayV0InputMode == null ? 0 : placesMapDisplayV0InputMode.hashCode())) * 31;
        String str = this.narrative;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.show_route;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PlacesMapDisplayV0InputTravelMode placesMapDisplayV0InputTravelMode = this.travel_mode;
        return iHashCode6 + (placesMapDisplayV0InputTravelMode != null ? placesMapDisplayV0InputTravelMode.hashCode() : 0);
    }

    public String toString() {
        return "PlacesMapDisplayV0Input(days=" + this.days + ", locations=" + this.locations + ", mode=" + this.mode + ", narrative=" + this.narrative + ", show_route=" + this.show_route + ", title=" + this.title + ", travel_mode=" + this.travel_mode + ")";
    }

    public PlacesMapDisplayV0Input() {
        this((List) null, (List) null, (PlacesMapDisplayV0InputMode) null, (String) null, (Boolean) null, (String) null, (PlacesMapDisplayV0InputTravelMode) null, 127, (mq5) null);
    }

    public PlacesMapDisplayV0Input(List<PlacesMapDisplayV0InputDaysItem> list, List<PlacesMapDisplayV0InputLocationsItem> list2, PlacesMapDisplayV0InputMode placesMapDisplayV0InputMode, String str, Boolean bool, String str2, PlacesMapDisplayV0InputTravelMode placesMapDisplayV0InputTravelMode) {
        this.days = list;
        this.locations = list2;
        this.mode = placesMapDisplayV0InputMode;
        this.narrative = str;
        this.show_route = bool;
        this.title = str2;
        this.travel_mode = placesMapDisplayV0InputTravelMode;
    }

    public /* synthetic */ PlacesMapDisplayV0Input(List list, List list2, PlacesMapDisplayV0InputMode placesMapDisplayV0InputMode, String str, Boolean bool, String str2, PlacesMapDisplayV0InputTravelMode placesMapDisplayV0InputTravelMode, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : placesMapDisplayV0InputMode, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : placesMapDisplayV0InputTravelMode);
    }
}
