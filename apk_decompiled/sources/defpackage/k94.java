package defpackage;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class k94 extends Message {
    public static final j94 G = new j94(FieldEncoding.LENGTH_DELIMITED, jce.a.b(k94.class), "type.googleapis.com/anthropic.mobile.v1alpha.CompletionStreamHTTPError", Syntax.PROTO_3, null, "anthropic/mobile/v1alpha/completion.proto");
    public final int E;
    public final String F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k94(int i, String str, ByteString byteString) {
        super(G, byteString);
        str.getClass();
        byteString.getClass();
        this.E = i;
        this.F = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k94)) {
            return false;
        }
        k94 k94Var = (k94) obj;
        return x44.r(unknownFields(), k94Var.unknownFields()) && this.E == k94Var.E && x44.r(this.F, k94Var.F);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.F.hashCode() + vb7.c(this.E, unknownFields().hashCode() * 37, 37);
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
        arrayList.add("status_code=" + this.E);
        ms6.y("error_json=", Internal.sanitize(this.F), arrayList);
        return w44.S0(arrayList, ", ", "CompletionStreamHTTPError{", "}", null, 56);
    }
}
