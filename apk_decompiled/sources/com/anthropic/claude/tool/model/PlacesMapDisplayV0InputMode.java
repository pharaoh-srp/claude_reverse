package com.anthropic.claude.tool.model;

import defpackage.blc;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.s3d;
import defpackage.t3d;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/anthropic/claude/tool/model/PlacesMapDisplayV0InputMode;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "s3d", "MARKERS", "ITINERARY", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = t3d.class)
public final class PlacesMapDisplayV0InputMode {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ PlacesMapDisplayV0InputMode[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final s3d Companion;
    private final String loggingName;
    public static final PlacesMapDisplayV0InputMode MARKERS = new PlacesMapDisplayV0InputMode("MARKERS", 0, "markers");
    public static final PlacesMapDisplayV0InputMode ITINERARY = new PlacesMapDisplayV0InputMode("ITINERARY", 1, "itinerary");

    private static final /* synthetic */ PlacesMapDisplayV0InputMode[] $values() {
        return new PlacesMapDisplayV0InputMode[]{MARKERS, ITINERARY};
    }

    static {
        PlacesMapDisplayV0InputMode[] placesMapDisplayV0InputModeArr$values = $values();
        $VALUES = placesMapDisplayV0InputModeArr$values;
        $ENTRIES = wd6.n0(placesMapDisplayV0InputModeArr$values);
        Companion = new s3d();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new blc(18));
    }

    private PlacesMapDisplayV0InputMode(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.PlacesMapDisplayV0InputMode", values(), new String[]{"markers", "itinerary"}, new Annotation[][]{null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static PlacesMapDisplayV0InputMode valueOf(String str) {
        return (PlacesMapDisplayV0InputMode) Enum.valueOf(PlacesMapDisplayV0InputMode.class, str);
    }

    public static PlacesMapDisplayV0InputMode[] values() {
        return (PlacesMapDisplayV0InputMode[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
