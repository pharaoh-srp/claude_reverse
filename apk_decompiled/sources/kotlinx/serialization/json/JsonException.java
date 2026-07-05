package kotlinx.serialization.json;

import defpackage.mdj;
import kotlin.Metadata;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/JsonException;", "Lkotlinx/serialization/SerializationException;", "Lkotlinx/serialization/json/JsonDecodingException;", "Lkotlinx/serialization/json/JsonEncodingException;", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = mdj.f)
public abstract class JsonException extends SerializationException {
    public final String E;

    public JsonException(String str) {
        super(str);
        this.E = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.E;
    }
}
