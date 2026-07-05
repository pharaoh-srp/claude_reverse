package defpackage;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class p38 extends Message {
    public static final o38 F = new o38(FieldEncoding.LENGTH_DELIMITED, jce.a.b(p38.class), "type.googleapis.com/anthropic.mobile.v1alpha.GetConversationResponse", Syntax.PROTO_3, null, "anthropic/mobile/v1alpha/completion.proto");
    public final Map E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p38(Map map, ByteString byteString) {
        super(F, byteString);
        byteString.getClass();
        this.E = (Map) Internal.immutableCopyOfStruct("conversation", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p38)) {
            return false;
        }
        p38 p38Var = (p38) obj;
        return x44.r(unknownFields(), p38Var.unknownFields()) && x44.r(this.E, p38Var.E);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Map map = this.E;
        int iHashCode2 = iHashCode + (map != null ? map.hashCode() : 0);
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
        Map map = this.E;
        if (map != null) {
            arrayList.add("conversation=" + map);
        }
        return w44.S0(arrayList, ", ", "GetConversationResponse{", "}", null, 56);
    }
}
