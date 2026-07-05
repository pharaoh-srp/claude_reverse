package defpackage;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class td0 extends Message {
    public static final sd0 G = new sd0(FieldEncoding.LENGTH_DELIMITED, jce.a.b(td0.class), "type.googleapis.com/anthropic.mobile.v1alpha.AnthropicTool", Syntax.PROTO_3, null, "anthropic/mobile/v1alpha/completion.proto");
    public final String E;
    public final String F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td0(String str, String str2, ByteString byteString) {
        super(G, byteString);
        str.getClass();
        str2.getClass();
        byteString.getClass();
        this.E = str;
        this.F = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof td0)) {
            return false;
        }
        td0 td0Var = (td0) obj;
        return x44.r(unknownFields(), td0Var.unknownFields()) && x44.r(this.E, td0Var.E) && x44.r(this.F, td0Var.F);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.F.hashCode() + kgh.l(unknownFields().hashCode() * 37, 37, this.E);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public final /* synthetic */ Message.Builder newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ms6.y("type=", Internal.sanitize(this.E), arrayList);
        ms6.y("name=", Internal.sanitize(this.F), arrayList);
        return w44.S0(arrayList, ", ", "AnthropicTool{", "}", null, 56);
    }
}
