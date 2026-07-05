package defpackage;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class a0d extends Message {
    public static final zzc H = new zzc(FieldEncoding.LENGTH_DELIMITED, jce.a.b(a0d.class), "type.googleapis.com/anthropic.mobile.v1alpha.PersonalizedStyle", Syntax.PROTO_3, null, "anthropic/mobile/v1alpha/completion.proto");
    public final String E;
    public final String F;
    public final Map G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0d(String str, String str2, Map map, ByteString byteString) {
        super(H, byteString);
        byteString.getClass();
        this.E = str;
        this.F = str2;
        this.G = (Map) Internal.immutableCopyOfStruct("config", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0d)) {
            return false;
        }
        a0d a0dVar = (a0d) obj;
        return x44.r(unknownFields(), a0dVar.unknownFields()) && x44.r(this.E, a0dVar.E) && x44.r(this.F, a0dVar.F) && x44.r(this.G, a0dVar.G);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.E;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.F;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Map map = this.G;
        int iHashCode4 = iHashCode3 + (map != null ? map.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public final /* synthetic */ Message.Builder newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.E;
        if (str != null) {
            ms6.y("uuid=", Internal.sanitize(str), arrayList);
        }
        String str2 = this.F;
        if (str2 != null) {
            ms6.y("style_type=", Internal.sanitize(str2), arrayList);
        }
        Map map = this.G;
        if (map != null) {
            arrayList.add("config=" + map);
        }
        return w44.S0(arrayList, ", ", "PersonalizedStyle{", "}", null, 56);
    }
}
