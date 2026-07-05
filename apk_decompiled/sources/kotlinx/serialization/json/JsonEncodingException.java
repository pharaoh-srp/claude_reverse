package kotlinx.serialization.json;

import defpackage.bsg;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/JsonEncodingException;", "Lkotlinx/serialization/json/JsonException;", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = mdj.f)
public final class JsonEncodingException extends JsonException {
    public JsonEncodingException(String str, String str2) {
        super(str.concat((str2 == null || bsg.I0(str2)) ? "" : "\n".concat(str2)));
    }

    public /* synthetic */ JsonEncodingException(String str, String str2, int i) {
        this(str, (i & 4) != 0 ? null : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
    }
}
