package com.segment.analytics.kotlin.core;

import defpackage.ch9;
import defpackage.jce;
import defpackage.s06;
import defpackage.sg9;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public final class a extends sg9 {
    public static final a c = new a(jce.a.b(BaseEvent.class));

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.sg9
    public final s06 a(JsonElement jsonElement) throws Exception {
        jsonElement.getClass();
        JsonElement jsonElement2 = (JsonElement) ch9.i(jsonElement).get((Object) "type");
        String content = jsonElement2 != null ? ch9.j(jsonElement2).getContent() : null;
        if (content != null) {
            switch (content.hashCode()) {
                case -907689876:
                    if (content.equals("screen")) {
                        return ScreenEvent.INSTANCE.serializer();
                    }
                    break;
                case -135762164:
                    if (content.equals("identify")) {
                        return IdentifyEvent.INSTANCE.serializer();
                    }
                    break;
                case 92902992:
                    if (content.equals("alias")) {
                        return AliasEvent.INSTANCE.serializer();
                    }
                    break;
                case 98629247:
                    if (content.equals("group")) {
                        return GroupEvent.INSTANCE.serializer();
                    }
                    break;
                case 110621003:
                    if (content.equals("track")) {
                        return TrackEvent.INSTANCE.serializer();
                    }
                    break;
            }
        }
        throw new Exception("Unknown Event: key 'type' not found or does not matches any event type");
    }
}
