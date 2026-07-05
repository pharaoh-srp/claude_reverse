package com.anthropic.claude.tool.model;

import defpackage.a4d;
import defpackage.b4d;
import defpackage.blc;
import defpackage.c4d;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.uo0;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B!\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem;", "", "", "Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItemAttributionsItem;", "attributions", "", "url", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAttributions", "Ljava/lang/String;", "getUrl", "Companion", "a4d", "b4d", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem {
    private final List<PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItemAttributionsItem> attributions;
    private final String url;
    public static final b4d Companion = new b4d();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new blc(23)), null};

    public /* synthetic */ PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem(int i, List list, String str, vnf vnfVar) {
        if (2 != (i & 2)) {
            gvj.f(i, 2, a4d.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.attributions = null;
        } else {
            this.attributions = list;
        }
        this.url = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(c4d.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem copy$default(PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem placesMapDisplayV0OutputEnrichedPlacesValuePhotosItem, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = placesMapDisplayV0OutputEnrichedPlacesValuePhotosItem.attributions;
        }
        if ((i & 2) != 0) {
            str = placesMapDisplayV0OutputEnrichedPlacesValuePhotosItem.url;
        }
        return placesMapDisplayV0OutputEnrichedPlacesValuePhotosItem.copy(list, str);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.attributions != null) {
            output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.attributions);
        }
        output.q(serialDesc, 1, self.url);
    }

    public final List<PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItemAttributionsItem> component1() {
        return this.attributions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem copy(List<PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItemAttributionsItem> attributions, String url) {
        url.getClass();
        return new PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem(attributions, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem)) {
            return false;
        }
        PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem placesMapDisplayV0OutputEnrichedPlacesValuePhotosItem = (PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem) other;
        return x44.r(this.attributions, placesMapDisplayV0OutputEnrichedPlacesValuePhotosItem.attributions) && x44.r(this.url, placesMapDisplayV0OutputEnrichedPlacesValuePhotosItem.url);
    }

    public final List<PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItemAttributionsItem> getAttributions() {
        return this.attributions;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        List<PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItemAttributionsItem> list = this.attributions;
        return this.url.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public String toString() {
        return "PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem(attributions=" + this.attributions + ", url=" + this.url + ")";
    }

    public PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem(List<PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItemAttributionsItem> list, String str) {
        str.getClass();
        this.attributions = list;
        this.url = str;
    }

    public /* synthetic */ PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem(List list, String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : list, str);
    }
}
