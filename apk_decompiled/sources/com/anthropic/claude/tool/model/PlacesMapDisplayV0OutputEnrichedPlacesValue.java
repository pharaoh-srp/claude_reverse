package com.anthropic.claude.tool.model;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.a4d;
import defpackage.blc;
import defpackage.e79;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.na6;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.z3d;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FGB\u0091\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u009a\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b:\u0010\u0018R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\bA\u0010\u001eR\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\bB\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\bC\u0010\u0018R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\bD\u0010\u001c¨\u0006H"}, d2 = {"Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0OutputEnrichedPlacesValue;", "", "", "maps_url", "override_place_id", "phone_number", "", "Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem;", "photos", "", "price_level", "", "rating", "rating_count", "types", "website", "weekday_hours", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Ljava/lang/Integer;", "component6", "()Ljava/lang/Double;", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0OutputEnrichedPlacesValue;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0OutputEnrichedPlacesValue;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getMaps_url", "getOverride_place_id", "getPhone_number", "Ljava/util/List;", "getPhotos", "Ljava/lang/Integer;", "getPrice_level", "Ljava/lang/Double;", "getRating", "getRating_count", "getTypes", "getWebsite", "getWeekday_hours", "Companion", "y3d", "z3d", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PlacesMapDisplayV0OutputEnrichedPlacesValue {
    private static final kw9[] $childSerializers;
    public static final z3d Companion = new z3d();
    private final String maps_url;
    private final String override_place_id;
    private final String phone_number;
    private final List<PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem> photos;
    private final Integer price_level;
    private final Double rating;
    private final Integer rating_count;
    private final List<String> types;
    private final String website;
    private final List<String> weekday_hours;

    static {
        blc blcVar = new blc(20);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, blcVar), null, null, null, yb5.w(w1aVar, new blc(21)), null, yb5.w(w1aVar, new blc(22))};
    }

    public /* synthetic */ PlacesMapDisplayV0OutputEnrichedPlacesValue(int i, String str, String str2, String str3, List list, Integer num, Double d, Integer num2, List list2, String str4, List list3, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.maps_url = null;
        } else {
            this.maps_url = str;
        }
        if ((i & 2) == 0) {
            this.override_place_id = null;
        } else {
            this.override_place_id = str2;
        }
        if ((i & 4) == 0) {
            this.phone_number = null;
        } else {
            this.phone_number = str3;
        }
        if ((i & 8) == 0) {
            this.photos = null;
        } else {
            this.photos = list;
        }
        if ((i & 16) == 0) {
            this.price_level = null;
        } else {
            this.price_level = num;
        }
        if ((i & 32) == 0) {
            this.rating = null;
        } else {
            this.rating = d;
        }
        if ((i & 64) == 0) {
            this.rating_count = null;
        } else {
            this.rating_count = num2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.types = null;
        } else {
            this.types = list2;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.website = null;
        } else {
            this.website = str4;
        }
        if ((i & 512) == 0) {
            this.weekday_hours = null;
        } else {
            this.weekday_hours = list3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(a4d.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlacesMapDisplayV0OutputEnrichedPlacesValue copy$default(PlacesMapDisplayV0OutputEnrichedPlacesValue placesMapDisplayV0OutputEnrichedPlacesValue, String str, String str2, String str3, List list, Integer num, Double d, Integer num2, List list2, String str4, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = placesMapDisplayV0OutputEnrichedPlacesValue.maps_url;
        }
        if ((i & 2) != 0) {
            str2 = placesMapDisplayV0OutputEnrichedPlacesValue.override_place_id;
        }
        if ((i & 4) != 0) {
            str3 = placesMapDisplayV0OutputEnrichedPlacesValue.phone_number;
        }
        if ((i & 8) != 0) {
            list = placesMapDisplayV0OutputEnrichedPlacesValue.photos;
        }
        if ((i & 16) != 0) {
            num = placesMapDisplayV0OutputEnrichedPlacesValue.price_level;
        }
        if ((i & 32) != 0) {
            d = placesMapDisplayV0OutputEnrichedPlacesValue.rating;
        }
        if ((i & 64) != 0) {
            num2 = placesMapDisplayV0OutputEnrichedPlacesValue.rating_count;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            list2 = placesMapDisplayV0OutputEnrichedPlacesValue.types;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str4 = placesMapDisplayV0OutputEnrichedPlacesValue.website;
        }
        if ((i & 512) != 0) {
            list3 = placesMapDisplayV0OutputEnrichedPlacesValue.weekday_hours;
        }
        String str5 = str4;
        List list4 = list3;
        Integer num3 = num2;
        List list5 = list2;
        Integer num4 = num;
        Double d2 = d;
        return placesMapDisplayV0OutputEnrichedPlacesValue.copy(str, str2, str3, list, num4, d2, num3, list5, str5, list4);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(PlacesMapDisplayV0OutputEnrichedPlacesValue self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.maps_url != null) {
            output.B(serialDesc, 0, srg.a, self.maps_url);
        }
        if (output.E(serialDesc) || self.override_place_id != null) {
            output.B(serialDesc, 1, srg.a, self.override_place_id);
        }
        if (output.E(serialDesc) || self.phone_number != null) {
            output.B(serialDesc, 2, srg.a, self.phone_number);
        }
        if (output.E(serialDesc) || self.photos != null) {
            output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.photos);
        }
        if (output.E(serialDesc) || self.price_level != null) {
            output.B(serialDesc, 4, e79.a, self.price_level);
        }
        if (output.E(serialDesc) || self.rating != null) {
            output.B(serialDesc, 5, na6.a, self.rating);
        }
        if (output.E(serialDesc) || self.rating_count != null) {
            output.B(serialDesc, 6, e79.a, self.rating_count);
        }
        if (output.E(serialDesc) || self.types != null) {
            output.B(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.types);
        }
        if (output.E(serialDesc) || self.website != null) {
            output.B(serialDesc, 8, srg.a, self.website);
        }
        if (!output.E(serialDesc) && self.weekday_hours == null) {
            return;
        }
        output.B(serialDesc, 9, (znf) kw9VarArr[9].getValue(), self.weekday_hours);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMaps_url() {
        return this.maps_url;
    }

    public final List<String> component10() {
        return this.weekday_hours;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOverride_place_id() {
        return this.override_place_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPhone_number() {
        return this.phone_number;
    }

    public final List<PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem> component4() {
        return this.photos;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getPrice_level() {
        return this.price_level;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getRating_count() {
        return this.rating_count;
    }

    public final List<String> component8() {
        return this.types;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getWebsite() {
        return this.website;
    }

    public final PlacesMapDisplayV0OutputEnrichedPlacesValue copy(String maps_url, String override_place_id, String phone_number, List<PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem> photos, Integer price_level, Double rating, Integer rating_count, List<String> types, String website, List<String> weekday_hours) {
        return new PlacesMapDisplayV0OutputEnrichedPlacesValue(maps_url, override_place_id, phone_number, photos, price_level, rating, rating_count, types, website, weekday_hours);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlacesMapDisplayV0OutputEnrichedPlacesValue)) {
            return false;
        }
        PlacesMapDisplayV0OutputEnrichedPlacesValue placesMapDisplayV0OutputEnrichedPlacesValue = (PlacesMapDisplayV0OutputEnrichedPlacesValue) other;
        return x44.r(this.maps_url, placesMapDisplayV0OutputEnrichedPlacesValue.maps_url) && x44.r(this.override_place_id, placesMapDisplayV0OutputEnrichedPlacesValue.override_place_id) && x44.r(this.phone_number, placesMapDisplayV0OutputEnrichedPlacesValue.phone_number) && x44.r(this.photos, placesMapDisplayV0OutputEnrichedPlacesValue.photos) && x44.r(this.price_level, placesMapDisplayV0OutputEnrichedPlacesValue.price_level) && x44.r(this.rating, placesMapDisplayV0OutputEnrichedPlacesValue.rating) && x44.r(this.rating_count, placesMapDisplayV0OutputEnrichedPlacesValue.rating_count) && x44.r(this.types, placesMapDisplayV0OutputEnrichedPlacesValue.types) && x44.r(this.website, placesMapDisplayV0OutputEnrichedPlacesValue.website) && x44.r(this.weekday_hours, placesMapDisplayV0OutputEnrichedPlacesValue.weekday_hours);
    }

    public final String getMaps_url() {
        return this.maps_url;
    }

    public final String getOverride_place_id() {
        return this.override_place_id;
    }

    public final String getPhone_number() {
        return this.phone_number;
    }

    public final List<PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem> getPhotos() {
        return this.photos;
    }

    public final Integer getPrice_level() {
        return this.price_level;
    }

    public final Double getRating() {
        return this.rating;
    }

    public final Integer getRating_count() {
        return this.rating_count;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public final String getWebsite() {
        return this.website;
    }

    public final List<String> getWeekday_hours() {
        return this.weekday_hours;
    }

    public int hashCode() {
        String str = this.maps_url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.override_place_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone_number;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem> list = this.photos;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.price_level;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.rating;
        int iHashCode6 = (iHashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.rating_count;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list2 = this.types;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.website;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list3 = this.weekday_hours;
        return iHashCode9 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        String str = this.maps_url;
        String str2 = this.override_place_id;
        String str3 = this.phone_number;
        List<PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem> list = this.photos;
        Integer num = this.price_level;
        Double d = this.rating;
        Integer num2 = this.rating_count;
        List<String> list2 = this.types;
        String str4 = this.website;
        List<String> list3 = this.weekday_hours;
        StringBuilder sbR = kgh.r("PlacesMapDisplayV0OutputEnrichedPlacesValue(maps_url=", str, ", override_place_id=", str2, ", phone_number=");
        qy1.p(str3, ", photos=", ", price_level=", sbR, list);
        sbR.append(num);
        sbR.append(", rating=");
        sbR.append(d);
        sbR.append(", rating_count=");
        sbR.append(num2);
        sbR.append(", types=");
        sbR.append(list2);
        sbR.append(", website=");
        sbR.append(str4);
        sbR.append(", weekday_hours=");
        sbR.append(list3);
        sbR.append(")");
        return sbR.toString();
    }

    public PlacesMapDisplayV0OutputEnrichedPlacesValue() {
        this((String) null, (String) null, (String) null, (List) null, (Integer) null, (Double) null, (Integer) null, (List) null, (String) null, (List) null, 1023, (mq5) null);
    }

    public PlacesMapDisplayV0OutputEnrichedPlacesValue(String str, String str2, String str3, List<PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem> list, Integer num, Double d, Integer num2, List<String> list2, String str4, List<String> list3) {
        this.maps_url = str;
        this.override_place_id = str2;
        this.phone_number = str3;
        this.photos = list;
        this.price_level = num;
        this.rating = d;
        this.rating_count = num2;
        this.types = list2;
        this.website = str4;
        this.weekday_hours = list3;
    }

    public /* synthetic */ PlacesMapDisplayV0OutputEnrichedPlacesValue(String str, String str2, String str3, List list, Integer num, Double d, Integer num2, List list2, String str4, List list3, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : d, (i & 64) != 0 ? null : num2, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : list2, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str4, (i & 512) != 0 ? null : list3);
    }
}
