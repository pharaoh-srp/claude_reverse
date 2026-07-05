package defpackage;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class y8i extends Message {
    public static final x8i G = new x8i(FieldEncoding.LENGTH_DELIMITED, jce.a.b(y8i.class), "type.googleapis.com/anthropic.mobile.v1alpha.TurnMessageUuids", Syntax.PROTO_3, null, "anthropic/mobile/v1alpha/completion.proto");
    public final String E;
    public final String F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8i(String str, String str2, ByteString byteString) {
        super(G, byteString);
        byteString.getClass();
        this.E = str;
        this.F = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y8i)) {
            return false;
        }
        y8i y8iVar = (y8i) obj;
        return x44.r(unknownFields(), y8iVar.unknownFields()) && x44.r(this.E, y8iVar.E) && x44.r(this.F, y8iVar.F);
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
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
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
            ms6.y("human_message_uuid=", Internal.sanitize(str), arrayList);
        }
        String str2 = this.F;
        if (str2 != null) {
            ms6.y("assistant_message_uuid=", Internal.sanitize(str2), arrayList);
        }
        return w44.S0(arrayList, ", ", "TurnMessageUuids{", "}", null, 56);
    }
}
