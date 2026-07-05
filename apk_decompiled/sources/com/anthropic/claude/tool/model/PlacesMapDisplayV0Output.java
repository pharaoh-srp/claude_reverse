package com.anthropic.claude.tool.model;

import defpackage.f7a;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.oob;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x3d;
import defpackage.x44;
import defpackage.y3d;
import defpackage.yb5;
import defpackage.znf;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0018\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0017¨\u0006'"}, d2 = {"Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0Output;", "", "", "", "Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0OutputEnrichedPlacesValue;", "enriched_places", "<init>", "(Ljava/util/Map;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Map;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0Output;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0Output;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getEnriched_places", "Companion", "w3d", "x3d", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PlacesMapDisplayV0Output {
    private final Map<String, PlacesMapDisplayV0OutputEnrichedPlacesValue> enriched_places;
    public static final x3d Companion = new x3d();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new oob(27))};

    public /* synthetic */ PlacesMapDisplayV0Output(int i, Map map, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.enriched_places = null;
        } else {
            this.enriched_places = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new f7a(srg.a, y3d.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlacesMapDisplayV0Output copy$default(PlacesMapDisplayV0Output placesMapDisplayV0Output, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = placesMapDisplayV0Output.enriched_places;
        }
        return placesMapDisplayV0Output.copy(map);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(PlacesMapDisplayV0Output self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (!output.E(serialDesc) && self.enriched_places == null) {
            return;
        }
        output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.enriched_places);
    }

    public final Map<String, PlacesMapDisplayV0OutputEnrichedPlacesValue> component1() {
        return this.enriched_places;
    }

    public final PlacesMapDisplayV0Output copy(Map<String, PlacesMapDisplayV0OutputEnrichedPlacesValue> enriched_places) {
        return new PlacesMapDisplayV0Output(enriched_places);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PlacesMapDisplayV0Output) && x44.r(this.enriched_places, ((PlacesMapDisplayV0Output) other).enriched_places);
    }

    public final Map<String, PlacesMapDisplayV0OutputEnrichedPlacesValue> getEnriched_places() {
        return this.enriched_places;
    }

    public int hashCode() {
        Map<String, PlacesMapDisplayV0OutputEnrichedPlacesValue> map = this.enriched_places;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        return "PlacesMapDisplayV0Output(enriched_places=" + this.enriched_places + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlacesMapDisplayV0Output() {
        this((Map) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public PlacesMapDisplayV0Output(Map<String, PlacesMapDisplayV0OutputEnrichedPlacesValue> map) {
        this.enriched_places = map;
    }

    public /* synthetic */ PlacesMapDisplayV0Output(Map map, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : map);
    }
}
