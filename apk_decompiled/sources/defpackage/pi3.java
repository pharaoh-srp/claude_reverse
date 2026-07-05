package defpackage;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class pi3 extends Message {
    public static final oi3 I = new oi3(FieldEncoding.LENGTH_DELIMITED, jce.a.b(pi3.class), "type.googleapis.com/anthropic.mobile.v1alpha.ClaudeAiTool", Syntax.PROTO_3, null, "anthropic/mobile/v1alpha/completion.proto");
    public final String E;
    public final String F;
    public final String G;
    public final Map H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi3(String str, String str2, Map map, String str3, ByteString byteString) {
        super(I, byteString);
        str.getClass();
        str2.getClass();
        byteString.getClass();
        this.E = str;
        this.F = str2;
        this.G = str3;
        this.H = (Map) Internal.immutableCopyOfStruct("input_schema", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pi3)) {
            return false;
        }
        pi3 pi3Var = (pi3) obj;
        return x44.r(unknownFields(), pi3Var.unknownFields()) && x44.r(this.E, pi3Var.E) && x44.r(this.F, pi3Var.F) && x44.r(this.H, pi3Var.H) && x44.r(this.G, pi3Var.G);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iL = kgh.l(kgh.l(unknownFields().hashCode() * 37, 37, this.E), 37, this.F);
        Map map = this.H;
        int iHashCode = (iL + (map != null ? map.hashCode() : 0)) * 37;
        String str = this.G;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public final /* synthetic */ Message.Builder newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ms6.y("name=", Internal.sanitize(this.E), arrayList);
        ms6.y("description=", Internal.sanitize(this.F), arrayList);
        Map map = this.H;
        if (map != null) {
            arrayList.add("input_schema=" + map);
        }
        String str = this.G;
        if (str != null) {
            ms6.y("namespaced_name=", Internal.sanitize(str), arrayList);
        }
        return w44.S0(arrayList, ", ", "ClaudeAiTool{", "}", null, 56);
    }
}
