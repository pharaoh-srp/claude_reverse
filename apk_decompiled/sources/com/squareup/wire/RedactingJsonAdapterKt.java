package com.squareup.wire;

import defpackage.ci9;
import defpackage.gg9;
import defpackage.jj9;
import defpackage.mdj;
import defpackage.sz6;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lgg9;", "redacting", "(Lgg9;)Lgg9;", "wire-moshi-adapter"}, k = 2, mv = {2, 0, 0}, xi = mdj.f)
public final class RedactingJsonAdapterKt {
    public static final <T> gg9 redacting(final gg9 gg9Var) {
        gg9Var.getClass();
        return new gg9() { // from class: com.squareup.wire.RedactingJsonAdapterKt.redacting.1
            /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
            @Override // defpackage.gg9
            public T fromJson(ci9 reader) {
                reader.getClass();
                return gg9Var.fromJson(reader);
            }

            @Override // defpackage.gg9
            public void toJson(jj9 writer, T value) {
                writer.getClass();
                LinkedHashMap linkedHashMap = writer.N;
                RedactedTag redactedTag = (RedactedTag) (linkedHashMap == null ? null : linkedHashMap.get(RedactedTag.class));
                if (redactedTag == null) {
                    redactedTag = new RedactedTag();
                    if (!RedactedTag.class.isAssignableFrom(RedactedTag.class)) {
                        sz6.p("Tag value must be of type ".concat(RedactedTag.class.getName()));
                        return;
                    } else {
                        if (writer.N == null) {
                            writer.N = new LinkedHashMap();
                        }
                        writer.N.put(RedactedTag.class, redactedTag);
                    }
                }
                boolean enabled = redactedTag.getEnabled();
                redactedTag.setEnabled(true);
                try {
                    gg9Var.toJson(writer, value);
                } finally {
                    redactedTag.setEnabled(enabled);
                }
            }
        };
    }
}
