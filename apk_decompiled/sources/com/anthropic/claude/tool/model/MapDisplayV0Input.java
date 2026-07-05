package com.anthropic.claude.tool.model;

import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rpa;
import defpackage.sra;
import defpackage.srg;
import defpackage.tra;
import defpackage.uo0;
import defpackage.ura;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Lcom/anthropic/claude/tool/model/MapDisplayV0Input;", "", "", "Lcom/anthropic/claude/tool/model/MapDisplayV0InputMarkersItem;", "markers", "", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/MapDisplayV0Input;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/MapDisplayV0Input;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getMarkers", "Ljava/lang/String;", "getTitle", "Companion", "sra", "tra", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MapDisplayV0Input {
    private final List<MapDisplayV0InputMarkersItem> markers;
    private final String title;
    public static final tra Companion = new tra();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new rpa(7)), null};

    public /* synthetic */ MapDisplayV0Input(int i, List list, String str, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, sra.a.getDescriptor());
            throw null;
        }
        this.markers = list;
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(ura.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MapDisplayV0Input copy$default(MapDisplayV0Input mapDisplayV0Input, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mapDisplayV0Input.markers;
        }
        if ((i & 2) != 0) {
            str = mapDisplayV0Input.title;
        }
        return mapDisplayV0Input.copy(list, str);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(MapDisplayV0Input self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.markers);
        if (!output.E(serialDesc) && self.title == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.title);
    }

    public final List<MapDisplayV0InputMarkersItem> component1() {
        return this.markers;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final MapDisplayV0Input copy(List<MapDisplayV0InputMarkersItem> markers, String title) {
        markers.getClass();
        return new MapDisplayV0Input(markers, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapDisplayV0Input)) {
            return false;
        }
        MapDisplayV0Input mapDisplayV0Input = (MapDisplayV0Input) other;
        return x44.r(this.markers, mapDisplayV0Input.markers) && x44.r(this.title, mapDisplayV0Input.title);
    }

    public final List<MapDisplayV0InputMarkersItem> getMarkers() {
        return this.markers;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.markers.hashCode() * 31;
        String str = this.title;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "MapDisplayV0Input(markers=" + this.markers + ", title=" + this.title + ")";
    }

    public MapDisplayV0Input(List<MapDisplayV0InputMarkersItem> list, String str) {
        list.getClass();
        this.markers = list;
        this.title = str;
    }

    public /* synthetic */ MapDisplayV0Input(List list, String str, int i, mq5 mq5Var) {
        this(list, (i & 2) != 0 ? null : str);
    }
}
